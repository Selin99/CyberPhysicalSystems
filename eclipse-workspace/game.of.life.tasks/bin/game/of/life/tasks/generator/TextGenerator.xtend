package game.of.life.tasks.generator

import game.of.life.tasks.tASKDSL.Game


class TextGenerator {
	def static toText(Game root)
	''' 
	    Info of the game «root.name» 
	    «FOR g: root.gameStatus»
	    Game Status :«g.so» 
	    «ENDFOR»
	    
	    GRID SIZE:
	    
	    «FOR grdSize: root.gridSize»
	    Height:«grdSize.h»
	    Length:«grdSize.l»
	    «ENDFOR»
	    
	    ACTIVE POSITIONS IN INITIAL GRID:
	    «FOR ig: root.startGrid»
	  	X Coordinate:«ig.XC»
	  	Y Coordinate:«ig.YC»
	  	Neighbor  Number: «ig.NNo»
	  	Life Status: «ig.s»
	  	Next Generation: «ig.a»
	  	«ENDFOR»
	
		 ALL CELLS
	    «FOR c : root.allCells»
		 X Coordinate:«c.x» 
		 Y Coordinate: «c.y» 
		 Neighbor Number: «c.NNo»
		 Life Status: «c.s»
		 Next Generation:  «c.a»
		 «"\n"»
	    «ENDFOR»
	'''
	}
	
	