/*
 * generated by Xtext 2.28.0
 */
package game.of.life.tasks.validation;

import game.of.life.tasks.tASKDSL.TASKDSLPackage
import org.eclipse.xtext.validation.Check;
import game.of.life.tasks.tASKDSL.Game

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class TASKDSLValidator extends AbstractTASKDSLValidator {
	
	@Check 
	def checkStartGridCoordinates(Game g) //Check if start coordinates are within the grid
	{ 
	    var gs = g.gridSize;
	    var sg =g.startGrid ;
	    for(var i=0; i<sg.size;i++)
	    {
		    var height = gs.get(0).h; //grid size is set in the begining of game and it stays fixed for that game
		    var length = gs.get(0).l;
		    
		    if((sg.get(i).getXC())>=height || (sg.get(i).getXC())<0)
		    	{
		    		error("X axis out of grid",null);	
		    	}
		    if((sg.get(i).getYC())>=length || (sg.get(i).getYC())<0)
		    	{
		    		error("Y axis out of grid",null);
		    	}
	    
	    } 
	}
		@Check 
	def checkCellCoordinates(Game g) //Check if Cell Coordinates within the grid
	{ 
		var gs = g.gridSize;
	    var c =g.allCells ;
	    
	    for(var i=0; i<gs.size;i++)
	    {
		    var height = gs.get(i).h;
		    var length = gs.get(i).l;
		    
		    for(var j=0; j<c.size;j++)
	    	{
	    	if((c.get(j).getX())>height || ((c.get(j).getX())<0))
	    	{
	    		error("X axis out of grid",null);
	    	}
	    	if(( c.get(j).getY())>length || ((c.get(j).getY())<0))
	    	{
	    		error("Y axis out of grid",null);
	    	}
	    	}
	    } 

	}
	@Check 
	def checkCellStatus(Game g) //Check if NextAvailable Action for the State According to Neighbor Number is correct
	{ 
		var c =g.allCells ; //check all coordinates if they are inside the grid
	    for(var i=0; i<c.size;i++)
	    {
	    	if (((c.get(i).getNNo())==3) && (( c.get(i).getS())=='Dead') )  
	    	{
	    		//If Cell is dead and Neighbour No is exactly 3 -> Cell must birth
	    		if(c.get(i).getA() !='Birth')
	    		{
		    		error("Item's next available action is birth!",null);
	    		}
	    	}
	    	
	    	if(((c.get(i).getNNo())<2) && ((c.get(i).getS())=='Live')) 
	    	{
	    		//If Cell is live and Neighbour No <1 ->  Cell must die because of isolation
				if(c.get(i).getA() !='xisolate')
	    		{
		    		error("Item's next available action is isolation!",null);
	    		}
	    	}
	    	
	    	if(((c.get(i).getNNo())>4) && (( c.get(i).getS())=='Live')) 
	    	{
	    		//If Cell is live and Neighbour No >4 -> Cell must die because of overcrowding
	    		if(c.get(i).getA() !='OverCrowd')
	    		{
		    		error("Item's next available action is death by overcrowding!",null);
	    		}
	    	}
	    	if(((c.get(i).getNNo())==2) || (( c.get(i).getNNo())==3) && ((c.get(i).getS())=='Live')) 
	    	{
	    		//If Cell is live and Neighbour No ==2 or Neighbour No==3 -> Cell must survive
	    		if(c.get(i).getA() !='Survive')
	    		{
		    		error("Item's next available action is survive!",null);
	    		}
	    	}    	
	    }
	    
	    var iac =g.startGrid; //check initally active coordinates if they are inside grid
	    for(var i=0; i<iac.size;i++)
	    {
	    	if (((iac.get(i).getNNo())==3) && (( iac.get(i).getS())=='Dead') )  
	    	{
	    		//If Cell is dead and Neighbour No is exactly 3 -> Cell must birth
	    		if(iac.get(i).getA() !='Birth')
	    		{
		    		error("Item's next available action is birth!",null);
	    		}
	    	}
	    	
	    	if(((iac.get(i).getNNo())<2) && ((iac.get(i).getS())=='Live')) 
	    	{
	    		//If Cell is live and Neighbour No <1 ->  Cell must die because of isolation
				if(iac.get(i).getA() !='xisolate')
	    		{
		    		error("Item's next available action is isolation!",null);
	    		}
	    	}
	    	
	    	if(((iac.get(i).getNNo())>4) && (( iac.get(i).getS())=='Live')) 
	    	{
	    		//If Cell is live and Neighbour No >4 -> Cell must die because of overcrowding
	    		if(iac.get(i).getA() !='OverCrowd')
	    		{
		    		error("Item's next available action is death by overcrowding!",null);
	    		}
	    	}
	    	if(((iac.get(i).getNNo())==2) || (( iac.get(i).getNNo())==3) && ((iac.get(i).getS())=='Live')) 
	    	{
	    		//If Cell is live and Neighbour No ==2 or Neighbour No==3 -> Cell must survive
	    		if(iac.get(i).getA() !='Survive')
	    		{
		    		error("Item's next available action is survive!",null);
	    		}
	    	}    	
	    }
	}
	
	@Check 
	def checkDoubleCoordinates(Game g)
	{ 
	//Do not allow 2 different specifications for the same coordinate for an instance of the game
	    var clist = g.allCells 
	    for (var i= 0; i < clist.size ; i++)
	    { 
	      for (var j = i+1; j < clist.size ; j++)
	      { 
	        if ((clist.get(i).x.equals(clist.get(j).x)) && (clist.get(i).y.equals(clist.get(j).y)))
	         { 
	            error("Duplicated Coordinate!!",null) 
	         } 
	      } 
	    } 
  	} 
  	
  	
  	def checkIfCoordinateValuesPositive(Game g)
  	{
  		var clist = g.allCells 
	    for (var i= 0; i < clist.size ; i++)
	    { 
	        if ((clist.get(i).x<0) || (clist.get(i).y<0))
	         { 
	            error("Negative Coordinate Not Allowed!!",null) 
	         } 
	       
	    } 
	    var iaclist = g.startGrid
	    for (var i= 0; i < iaclist.size ; i++)
	    { 
	        if ((iaclist.get(i).getXC()<0) || (iaclist.get(i).getYC()<0))
	         { 
	            error("Negative Coordinate Not Allowed!!",null) 
	         } 
	       
	    } 
  	}

}

