/*
 * generated by Xtext 2.28.0
 */
grammar InternalTASKDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package game.of.life.tasks.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package game.of.life.tasks.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import game.of.life.tasks.services.TASKDSLGrammarAccess;

}
@parser::members {
	private TASKDSLGrammarAccess grammarAccess;

	public void setGrammarAccess(TASKDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGameParserRuleCall()); }
		ruleGame
		{ after(grammarAccess.getModelAccess().getGameParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGame
entryRuleGame
:
{ before(grammarAccess.getGameRule()); }
	 ruleGame
{ after(grammarAccess.getGameRule()); } 
	 EOF 
;

// Rule Game
ruleGame 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGameAccess().getGroup()); }
		(rule__Game__Group__0)
		{ after(grammarAccess.getGameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGridSize
entryRuleGridSize
:
{ before(grammarAccess.getGridSizeRule()); }
	 ruleGridSize
{ after(grammarAccess.getGridSizeRule()); } 
	 EOF 
;

// Rule GridSize
ruleGridSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGridSizeAccess().getGroup()); }
		(rule__GridSize__Group__0)
		{ after(grammarAccess.getGridSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGameStatus
entryRuleGameStatus
:
{ before(grammarAccess.getGameStatusRule()); }
	 ruleGameStatus
{ after(grammarAccess.getGameStatusRule()); } 
	 EOF 
;

// Rule GameStatus
ruleGameStatus 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGameStatusAccess().getGroup()); }
		(rule__GameStatus__Group__0)
		{ after(grammarAccess.getGameStatusAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStartGrid
entryRuleStartGrid
:
{ before(grammarAccess.getStartGridRule()); }
	 ruleStartGrid
{ after(grammarAccess.getStartGridRule()); } 
	 EOF 
;

// Rule StartGrid
ruleStartGrid 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStartGridAccess().getGroup()); }
		(rule__StartGrid__Group__0)
		{ after(grammarAccess.getStartGridAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleavAction
entryRuleavAction
:
{ before(grammarAccess.getAvActionRule()); }
	 ruleavAction
{ after(grammarAccess.getAvActionRule()); } 
	 EOF 
;

// Rule avAction
ruleavAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAvActionAccess().getAlternatives()); }
		(rule__AvAction__Alternatives)
		{ after(grammarAccess.getAvActionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCell
entryRuleCell
:
{ before(grammarAccess.getCellRule()); }
	 ruleCell
{ after(grammarAccess.getCellRule()); } 
	 EOF 
;

// Rule Cell
ruleCell 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCellAccess().getGroup()); }
		(rule__Cell__Group__0)
		{ after(grammarAccess.getCellAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGameAccess().getStartGridAssignment_4_0()); }
		(rule__Game__StartGridAssignment_4_0)
		{ after(grammarAccess.getGameAccess().getStartGridAssignment_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getGameAccess().getAllCellsAssignment_4_1()); }
		(rule__Game__AllCellsAssignment_4_1)
		{ after(grammarAccess.getGameAccess().getAllCellsAssignment_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAvActionAccess().getGroup_0()); }
		(rule__AvAction__Group_0__0)
		{ after(grammarAccess.getAvActionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getAvActionAccess().getGroup_1()); }
		(rule__AvAction__Group_1__0)
		{ after(grammarAccess.getAvActionAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getAvActionAccess().getGroup_2()); }
		(rule__AvAction__Group_2__0)
		{ after(grammarAccess.getAvActionAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getAvActionAccess().getGroup_3()); }
		(rule__AvAction__Group_3__0)
		{ after(grammarAccess.getAvActionAccess().getGroup_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Game__Group__0__Impl
	rule__Game__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGameAccess().getGameKeyword_0()); }
	'Game:'
	{ after(grammarAccess.getGameAccess().getGameKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Game__Group__1__Impl
	rule__Game__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGameAccess().getNameAssignment_1()); }
	(rule__Game__NameAssignment_1)
	{ after(grammarAccess.getGameAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Game__Group__2__Impl
	rule__Game__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGameAccess().getGameStatusAssignment_2()); }
	(rule__Game__GameStatusAssignment_2)
	{ after(grammarAccess.getGameAccess().getGameStatusAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Game__Group__3__Impl
	rule__Game__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGameAccess().getGridSizeAssignment_3()); }
	(rule__Game__GridSizeAssignment_3)
	{ after(grammarAccess.getGameAccess().getGridSizeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Game__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGameAccess().getAlternatives_4()); }
	(rule__Game__Alternatives_4)*
	{ after(grammarAccess.getGameAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GridSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GridSize__Group__0__Impl
	rule__GridSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridSizeAccess().getHeightKeyword_0()); }
	'Height:'
	{ after(grammarAccess.getGridSizeAccess().getHeightKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GridSize__Group__1__Impl
	rule__GridSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridSizeAccess().getHAssignment_1()); }
	(rule__GridSize__HAssignment_1)
	{ after(grammarAccess.getGridSizeAccess().getHAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GridSize__Group__2__Impl
	rule__GridSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridSizeAccess().getLengthKeyword_2()); }
	'Length:'
	{ after(grammarAccess.getGridSizeAccess().getLengthKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GridSize__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridSizeAccess().getLAssignment_3()); }
	(rule__GridSize__LAssignment_3)
	{ after(grammarAccess.getGridSizeAccess().getLAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GameStatus__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GameStatus__Group__0__Impl
	rule__GameStatus__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GameStatus__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGameStatusAccess().getGameStatusKeyword_0()); }
	'GameStatus:'
	{ after(grammarAccess.getGameStatusAccess().getGameStatusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GameStatus__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GameStatus__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GameStatus__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGameStatusAccess().getGsAssignment_1()); }
	(rule__GameStatus__GsAssignment_1)
	{ after(grammarAccess.getGameStatusAccess().getGsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StartGrid__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartGrid__Group__0__Impl
	rule__StartGrid__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StartGrid__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartGridAccess().getInitiallyActiveCellKeyword_0()); }
	'InitiallyActiveCell:'
	{ after(grammarAccess.getStartGridAccess().getInitiallyActiveCellKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartGrid__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartGrid__Group__1__Impl
	rule__StartGrid__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StartGrid__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartGridAccess().getXCoordKeyword_1()); }
	'x-Coord:'
	{ after(grammarAccess.getStartGridAccess().getXCoordKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartGrid__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartGrid__Group__2__Impl
	rule__StartGrid__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StartGrid__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartGridAccess().getXCAssignment_2()); }
	(rule__StartGrid__XCAssignment_2)
	{ after(grammarAccess.getStartGridAccess().getXCAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartGrid__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartGrid__Group__3__Impl
	rule__StartGrid__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StartGrid__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartGridAccess().getYCoordKeyword_3()); }
	'y-Coord:'
	{ after(grammarAccess.getStartGridAccess().getYCoordKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartGrid__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartGrid__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StartGrid__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartGridAccess().getYCAssignment_4()); }
	(rule__StartGrid__YCAssignment_4)
	{ after(grammarAccess.getStartGridAccess().getYCAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AvAction__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AvAction__Group_0__0__Impl
	rule__AvAction__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAvActionAccess().getBirthKeyword_0_0()); }
	'Birth'
	{ after(grammarAccess.getAvActionAccess().getBirthKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AvAction__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAvActionAccess().getBirthAssignment_0_1()); }
	(rule__AvAction__BirthAssignment_0_1)
	{ after(grammarAccess.getAvActionAccess().getBirthAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AvAction__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AvAction__Group_1__0__Impl
	rule__AvAction__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAvActionAccess().getOvercrowdingKeyword_1_0()); }
	'Overcrowding'
	{ after(grammarAccess.getAvActionAccess().getOvercrowdingKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AvAction__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAvActionAccess().getOvercrowdAssignment_1_1()); }
	(rule__AvAction__OvercrowdAssignment_1_1)
	{ after(grammarAccess.getAvActionAccess().getOvercrowdAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AvAction__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AvAction__Group_2__0__Impl
	rule__AvAction__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAvActionAccess().getXisolationKeyword_2_0()); }
	'Xisolation'
	{ after(grammarAccess.getAvActionAccess().getXisolationKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AvAction__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAvActionAccess().getXisoAssignment_2_1()); }
	(rule__AvAction__XisoAssignment_2_1)
	{ after(grammarAccess.getAvActionAccess().getXisoAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AvAction__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AvAction__Group_3__0__Impl
	rule__AvAction__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAvActionAccess().getSurvivalKeyword_3_0()); }
	'Survival'
	{ after(grammarAccess.getAvActionAccess().getSurvivalKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AvAction__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAvActionAccess().getSurAssignment_3_1()); }
	(rule__AvAction__SurAssignment_3_1)
	{ after(grammarAccess.getAvActionAccess().getSurAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cell__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__0__Impl
	rule__Cell__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getCellKeyword_0()); }
	'Cell:'
	{ after(grammarAccess.getCellAccess().getCellKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__1__Impl
	rule__Cell__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getNameAssignment_1()); }
	(rule__Cell__NameAssignment_1)
	{ after(grammarAccess.getCellAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__2__Impl
	rule__Cell__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getXCoordinateKeyword_2()); }
	'x-Coordinate:'
	{ after(grammarAccess.getCellAccess().getXCoordinateKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__3__Impl
	rule__Cell__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getXAssignment_3()); }
	(rule__Cell__XAssignment_3)
	{ after(grammarAccess.getCellAccess().getXAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__4__Impl
	rule__Cell__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getYCoordinateKeyword_4()); }
	'y-Coordinate:'
	{ after(grammarAccess.getCellAccess().getYCoordinateKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__5__Impl
	rule__Cell__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getYAssignment_5()); }
	(rule__Cell__YAssignment_5)
	{ after(grammarAccess.getCellAccess().getYAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__6__Impl
	rule__Cell__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getNeighborNoKeyword_6()); }
	'neighborNo:'
	{ after(grammarAccess.getCellAccess().getNeighborNoKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__7__Impl
	rule__Cell__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getNNoAssignment_7()); }
	(rule__Cell__NNoAssignment_7)
	{ after(grammarAccess.getCellAccess().getNNoAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__8__Impl
	rule__Cell__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getStatusKeyword_8()); }
	'status:'
	{ after(grammarAccess.getCellAccess().getStatusKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__9__Impl
	rule__Cell__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getSAssignment_9()); }
	(rule__Cell__SAssignment_9)
	{ after(grammarAccess.getCellAccess().getSAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__10__Impl
	rule__Cell__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getAvailableActionKeyword_10()); }
	'availableAction:'
	{ after(grammarAccess.getCellAccess().getAvailableActionKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getAvActionAssignment_11()); }
	(rule__Cell__AvActionAssignment_11)
	{ after(grammarAccess.getCellAccess().getAvActionAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Game__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__GameStatusAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGameAccess().getGameStatusGameStatusParserRuleCall_2_0()); }
		ruleGameStatus
		{ after(grammarAccess.getGameAccess().getGameStatusGameStatusParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__GridSizeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGameAccess().getGridSizeGridSizeParserRuleCall_3_0()); }
		ruleGridSize
		{ after(grammarAccess.getGameAccess().getGridSizeGridSizeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__StartGridAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGameAccess().getStartGridStartGridParserRuleCall_4_0_0()); }
		ruleStartGrid
		{ after(grammarAccess.getGameAccess().getStartGridStartGridParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__AllCellsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGameAccess().getAllCellsCellParserRuleCall_4_1_0()); }
		ruleCell
		{ after(grammarAccess.getGameAccess().getAllCellsCellParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__HAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGridSizeAccess().getHINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getGridSizeAccess().getHINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__LAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGridSizeAccess().getLINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getGridSizeAccess().getLINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GameStatus__GsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGameStatusAccess().getGsINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getGameStatusAccess().getGsINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartGrid__XCAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStartGridAccess().getXCINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getStartGridAccess().getXCINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartGrid__YCAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStartGridAccess().getYCINTTerminalRuleCall_4_0()); }
		RULE_INT
		{ after(grammarAccess.getStartGridAccess().getYCINTTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__BirthAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAvActionAccess().getBirthINTTerminalRuleCall_0_1_0()); }
		RULE_INT
		{ after(grammarAccess.getAvActionAccess().getBirthINTTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__OvercrowdAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAvActionAccess().getOvercrowdINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getAvActionAccess().getOvercrowdINTTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__XisoAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAvActionAccess().getXisoINTTerminalRuleCall_2_1_0()); }
		RULE_INT
		{ after(grammarAccess.getAvActionAccess().getXisoINTTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AvAction__SurAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAvActionAccess().getSurINTTerminalRuleCall_3_1_0()); }
		RULE_INT
		{ after(grammarAccess.getAvActionAccess().getSurINTTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCellAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__XAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getXINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getCellAccess().getXINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__YAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getYINTTerminalRuleCall_5_0()); }
		RULE_INT
		{ after(grammarAccess.getCellAccess().getYINTTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__NNoAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getNNoINTTerminalRuleCall_7_0()); }
		RULE_INT
		{ after(grammarAccess.getCellAccess().getNNoINTTerminalRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__SAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getSINTTerminalRuleCall_9_0()); }
		RULE_INT
		{ after(grammarAccess.getCellAccess().getSINTTerminalRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__AvActionAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getAvActionAvActionParserRuleCall_11_0()); }
		ruleavAction
		{ after(grammarAccess.getCellAccess().getAvActionAvActionParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
