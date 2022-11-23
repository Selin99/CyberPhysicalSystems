/*
 * generated by Xtext 2.28.0
 */
package game.of.life.tasks.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TASKDSLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.tasks.TASKDSL.Model");
		private final RuleCall cGameParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Model:
		//    Game;
		@Override public ParserRule getRule() { return rule; }
		
		//Game
		public RuleCall getGameParserRuleCall() { return cGameParserRuleCall; }
	}
	public class GameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.tasks.TASKDSL.Game");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGameKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cGridSizeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cGridSizeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cGridSizeGridSizeParserRuleCall_3_0 = (RuleCall)cGridSizeAssignment_3.eContents().get(0);
		private final Keyword cEvolutionRulesKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cEvolutionRulesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cEvolutionRulesEvolutionRulesParserRuleCall_5_0 = (RuleCall)cEvolutionRulesAssignment_5.eContents().get(0);
		private final Keyword cInitiallyActiveCellsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cStartGridAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cStartGridStartGridParserRuleCall_7_0 = (RuleCall)cStartGridAssignment_7.eContents().get(0);
		private final Keyword cAllCellsKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cAllCellsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cAllCellsCellParserRuleCall_9_0 = (RuleCall)cAllCellsAssignment_9.eContents().get(0);
		
		//Game: 'Game:' name=ID
		//      'GridSize:'gridSize+=GridSize
		//      'EvolutionRules:' evolutionRules+=evolutionRules*
		//      'InitiallyActiveCells:' startGrid+=StartGrid*
		//      'AllCells:' allCells+=Cell*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Game:' name=ID
		//     'GridSize:'gridSize+=GridSize
		//     'EvolutionRules:' evolutionRules+=evolutionRules*
		//     'InitiallyActiveCells:' startGrid+=StartGrid*
		//     'AllCells:' allCells+=Cell*
		public Group getGroup() { return cGroup; }
		
		//'Game:'
		public Keyword getGameKeyword_0() { return cGameKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'GridSize:'
		public Keyword getGridSizeKeyword_2() { return cGridSizeKeyword_2; }
		
		//gridSize+=GridSize
		public Assignment getGridSizeAssignment_3() { return cGridSizeAssignment_3; }
		
		//GridSize
		public RuleCall getGridSizeGridSizeParserRuleCall_3_0() { return cGridSizeGridSizeParserRuleCall_3_0; }
		
		//'EvolutionRules:'
		public Keyword getEvolutionRulesKeyword_4() { return cEvolutionRulesKeyword_4; }
		
		//evolutionRules+=evolutionRules*
		public Assignment getEvolutionRulesAssignment_5() { return cEvolutionRulesAssignment_5; }
		
		//evolutionRules
		public RuleCall getEvolutionRulesEvolutionRulesParserRuleCall_5_0() { return cEvolutionRulesEvolutionRulesParserRuleCall_5_0; }
		
		//'InitiallyActiveCells:'
		public Keyword getInitiallyActiveCellsKeyword_6() { return cInitiallyActiveCellsKeyword_6; }
		
		//startGrid+=StartGrid*
		public Assignment getStartGridAssignment_7() { return cStartGridAssignment_7; }
		
		//StartGrid
		public RuleCall getStartGridStartGridParserRuleCall_7_0() { return cStartGridStartGridParserRuleCall_7_0; }
		
		//'AllCells:'
		public Keyword getAllCellsKeyword_8() { return cAllCellsKeyword_8; }
		
		//allCells+=Cell*
		public Assignment getAllCellsAssignment_9() { return cAllCellsAssignment_9; }
		
		//Cell
		public RuleCall getAllCellsCellParserRuleCall_9_0() { return cAllCellsCellParserRuleCall_9_0; }
	}
	public class GridSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.tasks.TASKDSL.GridSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHeightKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cHAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cHINTTerminalRuleCall_1_0 = (RuleCall)cHAssignment_1.eContents().get(0);
		private final Keyword cLengthKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLINTTerminalRuleCall_3_0 = (RuleCall)cLAssignment_3.eContents().get(0);
		
		////Grid Size:
		//GridSize:'Height:' h=INT 'Length:' l=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'Height:' h=INT 'Length:' l=INT
		public Group getGroup() { return cGroup; }
		
		//'Height:'
		public Keyword getHeightKeyword_0() { return cHeightKeyword_0; }
		
		//h=INT
		public Assignment getHAssignment_1() { return cHAssignment_1; }
		
		//INT
		public RuleCall getHINTTerminalRuleCall_1_0() { return cHINTTerminalRuleCall_1_0; }
		
		//'Length:'
		public Keyword getLengthKeyword_2() { return cLengthKeyword_2; }
		
		//l=INT
		public Assignment getLAssignment_3() { return cLAssignment_3; }
		
		//INT
		public RuleCall getLINTTerminalRuleCall_3_0() { return cLINTTerminalRuleCall_3_0; }
	}
	public class StartGridElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.tasks.TASKDSL.StartGrid");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCoordinateInfoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cXKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cXCAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cXCINTTerminalRuleCall_2_0 = (RuleCall)cXCAssignment_2.eContents().get(0);
		private final Keyword cYKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cYCAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cYCINTTerminalRuleCall_4_0 = (RuleCall)cYCAssignment_4.eContents().get(0);
		private final Keyword cStatusKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cSAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSStatusEnumRuleCall_6_0 = (RuleCall)cSAssignment_6.eContents().get(0);
		
		////Initially Active Cells:
		//StartGrid: 'CoordinateInfo:' 'x:' xC= INT  'y:' yC= INT
		//           'Status:' s=Status
		//        ;
		@Override public ParserRule getRule() { return rule; }
		
		//'CoordinateInfo:' 'x:' xC= INT  'y:' yC= INT
		//          'Status:' s=Status
		public Group getGroup() { return cGroup; }
		
		//'CoordinateInfo:'
		public Keyword getCoordinateInfoKeyword_0() { return cCoordinateInfoKeyword_0; }
		
		//'x:'
		public Keyword getXKeyword_1() { return cXKeyword_1; }
		
		//xC= INT
		public Assignment getXCAssignment_2() { return cXCAssignment_2; }
		
		//INT
		public RuleCall getXCINTTerminalRuleCall_2_0() { return cXCINTTerminalRuleCall_2_0; }
		
		//'y:'
		public Keyword getYKeyword_3() { return cYKeyword_3; }
		
		//yC= INT
		public Assignment getYCAssignment_4() { return cYCAssignment_4; }
		
		//INT
		public RuleCall getYCINTTerminalRuleCall_4_0() { return cYCINTTerminalRuleCall_4_0; }
		
		//'Status:'
		public Keyword getStatusKeyword_5() { return cStatusKeyword_5; }
		
		//s=Status
		public Assignment getSAssignment_6() { return cSAssignment_6; }
		
		//Status
		public RuleCall getSStatusEnumRuleCall_6_0() { return cSStatusEnumRuleCall_6_0; }
	}
	public class CellElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.tasks.TASKDSL.Cell");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCoordinateInfoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cXKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cXCAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cXCINTTerminalRuleCall_2_0 = (RuleCall)cXCAssignment_2.eContents().get(0);
		private final Keyword cYKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cYCAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cYCINTTerminalRuleCall_4_0 = (RuleCall)cYCAssignment_4.eContents().get(0);
		private final Keyword cStatusKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cSAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSStatusEnumRuleCall_6_0 = (RuleCall)cSAssignment_6.eContents().get(0);
		
		////All Cells Info:
		//Cell: 'CoordinateInfo:' 'x:' xC= INT  'y:' yC= INT
		//      'Status:' s=Status ;
		@Override public ParserRule getRule() { return rule; }
		
		//'CoordinateInfo:' 'x:' xC= INT  'y:' yC= INT
		//     'Status:' s=Status
		public Group getGroup() { return cGroup; }
		
		//'CoordinateInfo:'
		public Keyword getCoordinateInfoKeyword_0() { return cCoordinateInfoKeyword_0; }
		
		//'x:'
		public Keyword getXKeyword_1() { return cXKeyword_1; }
		
		//xC= INT
		public Assignment getXCAssignment_2() { return cXCAssignment_2; }
		
		//INT
		public RuleCall getXCINTTerminalRuleCall_2_0() { return cXCINTTerminalRuleCall_2_0; }
		
		//'y:'
		public Keyword getYKeyword_3() { return cYKeyword_3; }
		
		//yC= INT
		public Assignment getYCAssignment_4() { return cYCAssignment_4; }
		
		//INT
		public RuleCall getYCINTTerminalRuleCall_4_0() { return cYCINTTerminalRuleCall_4_0; }
		
		//'Status:'
		public Keyword getStatusKeyword_5() { return cStatusKeyword_5; }
		
		//s=Status
		public Assignment getSAssignment_6() { return cSAssignment_6; }
		
		//Status
		public RuleCall getSStatusEnumRuleCall_6_0() { return cSStatusEnumRuleCall_6_0; }
	}
	public class EvolutionRulesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.tasks.TASKDSL.evolutionRules");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIfKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNeighborNoKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNNoAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNNoINTTerminalRuleCall_2_0 = (RuleCall)cNNoAssignment_2.eContents().get(0);
		private final Assignment cLAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLLogicalRelationEnumRuleCall_3_0 = (RuleCall)cLAssignment_3.eContents().get(0);
		private final Assignment cComparedNoAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cComparedNoINTTerminalRuleCall_4_0 = (RuleCall)cComparedNoAssignment_4.eContents().get(0);
		private final Keyword cAndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cCellStatusKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cSAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cSStatusEnumRuleCall_7_0 = (RuleCall)cSAssignment_7.eContents().get(0);
		private final Keyword cThenKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cResultAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cResultResultEnumRuleCall_9_0 = (RuleCall)cResultAssignment_9.eContents().get(0);
		
		////Evolution Rules:
		//evolutionRules: 'if' 'neighborNo=' nNo=INT l=logicalRelation comparedNo=INT 'and' 'Cell Status' s=Status 'then' result=Result ;
		@Override public ParserRule getRule() { return rule; }
		
		//'if' 'neighborNo=' nNo=INT l=logicalRelation comparedNo=INT 'and' 'Cell Status' s=Status 'then' result=Result
		public Group getGroup() { return cGroup; }
		
		//'if'
		public Keyword getIfKeyword_0() { return cIfKeyword_0; }
		
		//'neighborNo='
		public Keyword getNeighborNoKeyword_1() { return cNeighborNoKeyword_1; }
		
		//nNo=INT
		public Assignment getNNoAssignment_2() { return cNNoAssignment_2; }
		
		//INT
		public RuleCall getNNoINTTerminalRuleCall_2_0() { return cNNoINTTerminalRuleCall_2_0; }
		
		//l=logicalRelation
		public Assignment getLAssignment_3() { return cLAssignment_3; }
		
		//logicalRelation
		public RuleCall getLLogicalRelationEnumRuleCall_3_0() { return cLLogicalRelationEnumRuleCall_3_0; }
		
		//comparedNo=INT
		public Assignment getComparedNoAssignment_4() { return cComparedNoAssignment_4; }
		
		//INT
		public RuleCall getComparedNoINTTerminalRuleCall_4_0() { return cComparedNoINTTerminalRuleCall_4_0; }
		
		//'and'
		public Keyword getAndKeyword_5() { return cAndKeyword_5; }
		
		//'Cell Status'
		public Keyword getCellStatusKeyword_6() { return cCellStatusKeyword_6; }
		
		//s=Status
		public Assignment getSAssignment_7() { return cSAssignment_7; }
		
		//Status
		public RuleCall getSStatusEnumRuleCall_7_0() { return cSStatusEnumRuleCall_7_0; }
		
		//'then'
		public Keyword getThenKeyword_8() { return cThenKeyword_8; }
		
		//result=Result
		public Assignment getResultAssignment_9() { return cResultAssignment_9; }
		
		//Result
		public RuleCall getResultResultEnumRuleCall_9_0() { return cResultResultEnumRuleCall_9_0; }
	}
	
	public class LogicalRelationElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.tasks.TASKDSL.logicalRelation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cEQUALEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cEQUALEqualsSGnEqualsSGnKeyword_0_0 = (Keyword)cEQUALEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cGREATERTHANEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cGREATERTHANGreaterThanSGnKeyword_1_0 = (Keyword)cGREATERTHANEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cLESSTHANEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cLESSTHANLessThanSGnKeyword_2_0 = (Keyword)cLESSTHANEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cGREATEROREQUALEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cGREATEROREQUALGreaterThanSGnEqualsSGnKeyword_3_0 = (Keyword)cGREATEROREQUALEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cLESSOREQUALEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cLESSOREQUALLessThanSGnEqualsSGnKeyword_4_0 = (Keyword)cLESSOREQUALEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum logicalRelation: EQUAL='=='|GREATERTHAN='>'|LESSTHAN='<'|GREATEROREQUAL='>='|LESSOREQUAL='<=';
		public EnumRule getRule() { return rule; }
		
		//EQUAL='=='|GREATERTHAN='>'|LESSTHAN='<'|GREATEROREQUAL='>='|LESSOREQUAL='<='
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//EQUAL='=='
		public EnumLiteralDeclaration getEQUALEnumLiteralDeclaration_0() { return cEQUALEnumLiteralDeclaration_0; }
		
		//'=='
		public Keyword getEQUALEqualsSGnEqualsSGnKeyword_0_0() { return cEQUALEqualsSGnEqualsSGnKeyword_0_0; }
		
		//GREATERTHAN='>'
		public EnumLiteralDeclaration getGREATERTHANEnumLiteralDeclaration_1() { return cGREATERTHANEnumLiteralDeclaration_1; }
		
		//'>'
		public Keyword getGREATERTHANGreaterThanSGnKeyword_1_0() { return cGREATERTHANGreaterThanSGnKeyword_1_0; }
		
		//LESSTHAN='<'
		public EnumLiteralDeclaration getLESSTHANEnumLiteralDeclaration_2() { return cLESSTHANEnumLiteralDeclaration_2; }
		
		//'<'
		public Keyword getLESSTHANLessThanSGnKeyword_2_0() { return cLESSTHANLessThanSGnKeyword_2_0; }
		
		//GREATEROREQUAL='>='
		public EnumLiteralDeclaration getGREATEROREQUALEnumLiteralDeclaration_3() { return cGREATEROREQUALEnumLiteralDeclaration_3; }
		
		//'>='
		public Keyword getGREATEROREQUALGreaterThanSGnEqualsSGnKeyword_3_0() { return cGREATEROREQUALGreaterThanSGnEqualsSGnKeyword_3_0; }
		
		//LESSOREQUAL='<='
		public EnumLiteralDeclaration getLESSOREQUALEnumLiteralDeclaration_4() { return cLESSOREQUALEnumLiteralDeclaration_4; }
		
		//'<='
		public Keyword getLESSOREQUALLessThanSGnEqualsSGnKeyword_4_0() { return cLESSOREQUALLessThanSGnEqualsSGnKeyword_4_0; }
	}
	public class StatusElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.tasks.TASKDSL.Status");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLIVEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLIVELiveKeyword_0_0 = (Keyword)cLIVEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDEADEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDEADDeadKeyword_1_0 = (Keyword)cDEADEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Status:LIVE='Live' | DEAD='Dead';
		public EnumRule getRule() { return rule; }
		
		//LIVE='Live' | DEAD='Dead'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//LIVE='Live'
		public EnumLiteralDeclaration getLIVEEnumLiteralDeclaration_0() { return cLIVEEnumLiteralDeclaration_0; }
		
		//'Live'
		public Keyword getLIVELiveKeyword_0_0() { return cLIVELiveKeyword_0_0; }
		
		//DEAD='Dead'
		public EnumLiteralDeclaration getDEADEnumLiteralDeclaration_1() { return cDEADEnumLiteralDeclaration_1; }
		
		//'Dead'
		public Keyword getDEADDeadKeyword_1_0() { return cDEADDeadKeyword_1_0; }
	}
	public class ResultElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "game.of.life.tasks.TASKDSL.Result");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBIRTHEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBIRTHBirthKeyword_0_0 = (Keyword)cBIRTHEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cOVERCROWDEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cOVERCROWDOverCrowdKeyword_1_0 = (Keyword)cOVERCROWDEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cXSOLATEEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cXSOLATEXisolateKeyword_2_0 = (Keyword)cXSOLATEEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cSURVIVEEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cSURVIVESurviveKeyword_3_0 = (Keyword)cSURVIVEEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Result: BIRTH='Birth' | OVERCROWD='OverCrowd' |XSOLATE='xisolate' | SURVIVE='Survive';
		public EnumRule getRule() { return rule; }
		
		//BIRTH='Birth' | OVERCROWD='OverCrowd' |XSOLATE='xisolate' | SURVIVE='Survive'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BIRTH='Birth'
		public EnumLiteralDeclaration getBIRTHEnumLiteralDeclaration_0() { return cBIRTHEnumLiteralDeclaration_0; }
		
		//'Birth'
		public Keyword getBIRTHBirthKeyword_0_0() { return cBIRTHBirthKeyword_0_0; }
		
		//OVERCROWD='OverCrowd'
		public EnumLiteralDeclaration getOVERCROWDEnumLiteralDeclaration_1() { return cOVERCROWDEnumLiteralDeclaration_1; }
		
		//'OverCrowd'
		public Keyword getOVERCROWDOverCrowdKeyword_1_0() { return cOVERCROWDOverCrowdKeyword_1_0; }
		
		//XSOLATE='xisolate'
		public EnumLiteralDeclaration getXSOLATEEnumLiteralDeclaration_2() { return cXSOLATEEnumLiteralDeclaration_2; }
		
		//'xisolate'
		public Keyword getXSOLATEXisolateKeyword_2_0() { return cXSOLATEXisolateKeyword_2_0; }
		
		//SURVIVE='Survive'
		public EnumLiteralDeclaration getSURVIVEEnumLiteralDeclaration_3() { return cSURVIVEEnumLiteralDeclaration_3; }
		
		//'Survive'
		public Keyword getSURVIVESurviveKeyword_3_0() { return cSURVIVESurviveKeyword_3_0; }
	}
	
	private final ModelElements pModel;
	private final GameElements pGame;
	private final GridSizeElements pGridSize;
	private final StartGridElements pStartGrid;
	private final CellElements pCell;
	private final EvolutionRulesElements pEvolutionRules;
	private final LogicalRelationElements eLogicalRelation;
	private final StatusElements eStatus;
	private final ResultElements eResult;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TASKDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pGame = new GameElements();
		this.pGridSize = new GridSizeElements();
		this.pStartGrid = new StartGridElements();
		this.pCell = new CellElements();
		this.pEvolutionRules = new EvolutionRulesElements();
		this.eLogicalRelation = new LogicalRelationElements();
		this.eStatus = new StatusElements();
		this.eResult = new ResultElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("game.of.life.tasks.TASKDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    Game;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Game: 'Game:' name=ID
	//      'GridSize:'gridSize+=GridSize
	//      'EvolutionRules:' evolutionRules+=evolutionRules*
	//      'InitiallyActiveCells:' startGrid+=StartGrid*
	//      'AllCells:' allCells+=Cell*
	//;
	public GameElements getGameAccess() {
		return pGame;
	}
	
	public ParserRule getGameRule() {
		return getGameAccess().getRule();
	}
	
	////Grid Size:
	//GridSize:'Height:' h=INT 'Length:' l=INT;
	public GridSizeElements getGridSizeAccess() {
		return pGridSize;
	}
	
	public ParserRule getGridSizeRule() {
		return getGridSizeAccess().getRule();
	}
	
	////Initially Active Cells:
	//StartGrid: 'CoordinateInfo:' 'x:' xC= INT  'y:' yC= INT
	//           'Status:' s=Status
	//        ;
	public StartGridElements getStartGridAccess() {
		return pStartGrid;
	}
	
	public ParserRule getStartGridRule() {
		return getStartGridAccess().getRule();
	}
	
	////All Cells Info:
	//Cell: 'CoordinateInfo:' 'x:' xC= INT  'y:' yC= INT
	//      'Status:' s=Status ;
	public CellElements getCellAccess() {
		return pCell;
	}
	
	public ParserRule getCellRule() {
		return getCellAccess().getRule();
	}
	
	////Evolution Rules:
	//evolutionRules: 'if' 'neighborNo=' nNo=INT l=logicalRelation comparedNo=INT 'and' 'Cell Status' s=Status 'then' result=Result ;
	public EvolutionRulesElements getEvolutionRulesAccess() {
		return pEvolutionRules;
	}
	
	public ParserRule getEvolutionRulesRule() {
		return getEvolutionRulesAccess().getRule();
	}
	
	//enum logicalRelation: EQUAL='=='|GREATERTHAN='>'|LESSTHAN='<'|GREATEROREQUAL='>='|LESSOREQUAL='<=';
	public LogicalRelationElements getLogicalRelationAccess() {
		return eLogicalRelation;
	}
	
	public EnumRule getLogicalRelationRule() {
		return getLogicalRelationAccess().getRule();
	}
	
	//enum Status:LIVE='Live' | DEAD='Dead';
	public StatusElements getStatusAccess() {
		return eStatus;
	}
	
	public EnumRule getStatusRule() {
		return getStatusAccess().getRule();
	}
	
	//enum Result: BIRTH='Birth' | OVERCROWD='OverCrowd' |XSOLATE='xisolate' | SURVIVE='Survive';
	public ResultElements getResultAccess() {
		return eResult;
	}
	
	public EnumRule getResultRule() {
		return getResultAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
