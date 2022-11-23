package game.of.life.tasks.generator


import game.of.life.tasks.tASKDSL.Game
import game.of.life.tasks.tASKDSL.Result
import game.of.life.tasks.tASKDSL.logicalRelation

class RulesOfLife {
	//surrounding=NeighborNo
	def static rulesOfLife (Game Root)
		'''
			package GameOfLife;
		
			import java.awt.Point;
			import java.util.ArrayList;
		
			public class RulesOfLife {
				public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {
		        	// Iterate through the array, follow game of life rules
		       	 for (int i=1; i<gameBoard.length-1; i++) {
		            for (int j=1; j<gameBoard[0].length-1; j++) {
		                int surrounding = 0;
		                if (gameBoard[i-1][j-1]) { surrounding++; }
		                if (gameBoard[i-1][j])   { surrounding++; }
		                if (gameBoard[i-1][j+1]) { surrounding++; }
		                if (gameBoard[i][j-1])   { surrounding++; }
		                if (gameBoard[i][j+1])   { surrounding++; }
		                if (gameBoard[i+1][j-1]) { surrounding++; }
		                if (gameBoard[i+1][j])   { surrounding++; }
		                if (gameBoard[i+1][j+1]) { surrounding++; }
		               /* only code for surving cells, so no rule if result is dead cell */
		               	boolean cellStatus = gameBoard[i][j];
		                «FOR evRule: Root.evolutionRules»
		                	if (surrounding «getRelationOperator(Root)» «evRule.result») {
			                	/* rule B3 */
			                	«IF evRule.result == Result::BIRTH»
			                		if (!cellStatus) { 
		                				survivingCells.add(new Point(i-1,j-1));
		                			}
			                	«ENDIF»
			                	/* rule B6 */
			                	«IF evRule.result == Result::OVERCROWD»
			                		if (!cellStatus) { 
			                			survivingCells.add(new Point(i-1,j-1));
			                		}
			                	«ENDIF»
			                	/* rule S2 */
			                	«IF evRule.result == Result::SURVIVE»
				                	if (cellStatus) { 
				                		survivingCells.add(new Point(i-1,j-1));
			                		}		                	
			                	«ENDIF»
		                	}
		                «ENDFOR»
		            }
		        }
			}
		
		}
	'''
		
	
	def static CharSequence getRelationOperator(Game root) {
		var rules = root.evolutionRules
		for(var i=0; i<rules.size();i++)
		{
			var relnOperator=rules.get(i).l; //from each rule get the logical relation operator and return the valid java equivalent
			if(relnOperator==logicalRelation::EQUAL)
			{
				 return '''=='''
			}
			if(relnOperator==logicalRelation::GREATERTHAN)
			{
				 return '''>'''
			}
			if(relnOperator==logicalRelation::LESSTHAN)
			{
				 return '''<'''
			}
			if(relnOperator==logicalRelation::GREATEROREQUAL)
			{
				 return '''>='''
			}
			if(relnOperator==logicalRelation::LESSOREQUAL)
			{
				 return '''<='''
			}
		}
		
		return 'INVALID OPERATOR';
	}
	

}

