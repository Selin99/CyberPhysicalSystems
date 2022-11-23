package game.of.life.tasks.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import game.of.life.tasks.services.TASKDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTASKDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game:'", "'GridSize:'", "'EvolutionRules:'", "'InitiallyActiveCells:'", "'AllCells:'", "'Height:'", "'Length:'", "'CoordinateInfo:'", "'x:'", "'y:'", "'Status:'", "'if'", "'neighborNo='", "'and'", "'Cell Status'", "'then'", "'=='", "'>'", "'<'", "'>='", "'<='", "'Live'", "'Dead'", "'Birth'", "'OverCrowd'", "'xisolate'", "'Survive'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTASKDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTASKDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTASKDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTASKDSL.g"; }



     	private TASKDSLGrammarAccess grammarAccess;

        public InternalTASKDSLParser(TokenStream input, TASKDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TASKDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTASKDSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTASKDSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalTASKDSL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTASKDSL.g:72:1: ruleModel returns [EObject current=null] : this_Game_0= ruleGame ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Game_0 = null;



        	enterRule();

        try {
            // InternalTASKDSL.g:78:2: (this_Game_0= ruleGame )
            // InternalTASKDSL.g:79:2: this_Game_0= ruleGame
            {

            		newCompositeNode(grammarAccess.getModelAccess().getGameParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Game_0=ruleGame();

            state._fsp--;


            		current = this_Game_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGame"
    // InternalTASKDSL.g:90:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalTASKDSL.g:90:45: (iv_ruleGame= ruleGame EOF )
            // InternalTASKDSL.g:91:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalTASKDSL.g:97:1: ruleGame returns [EObject current=null] : (otherlv_0= 'Game:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'GridSize:' ( (lv_gridSize_3_0= ruleGridSize ) ) otherlv_4= 'EvolutionRules:' ( (lv_evolutionRules_5_0= ruleevolutionRules ) )* otherlv_6= 'InitiallyActiveCells:' ( (lv_startGrid_7_0= ruleStartGrid ) )* otherlv_8= 'AllCells:' ( (lv_allCells_9_0= ruleCell ) )* ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_gridSize_3_0 = null;

        EObject lv_evolutionRules_5_0 = null;

        EObject lv_startGrid_7_0 = null;

        EObject lv_allCells_9_0 = null;



        	enterRule();

        try {
            // InternalTASKDSL.g:103:2: ( (otherlv_0= 'Game:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'GridSize:' ( (lv_gridSize_3_0= ruleGridSize ) ) otherlv_4= 'EvolutionRules:' ( (lv_evolutionRules_5_0= ruleevolutionRules ) )* otherlv_6= 'InitiallyActiveCells:' ( (lv_startGrid_7_0= ruleStartGrid ) )* otherlv_8= 'AllCells:' ( (lv_allCells_9_0= ruleCell ) )* ) )
            // InternalTASKDSL.g:104:2: (otherlv_0= 'Game:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'GridSize:' ( (lv_gridSize_3_0= ruleGridSize ) ) otherlv_4= 'EvolutionRules:' ( (lv_evolutionRules_5_0= ruleevolutionRules ) )* otherlv_6= 'InitiallyActiveCells:' ( (lv_startGrid_7_0= ruleStartGrid ) )* otherlv_8= 'AllCells:' ( (lv_allCells_9_0= ruleCell ) )* )
            {
            // InternalTASKDSL.g:104:2: (otherlv_0= 'Game:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'GridSize:' ( (lv_gridSize_3_0= ruleGridSize ) ) otherlv_4= 'EvolutionRules:' ( (lv_evolutionRules_5_0= ruleevolutionRules ) )* otherlv_6= 'InitiallyActiveCells:' ( (lv_startGrid_7_0= ruleStartGrid ) )* otherlv_8= 'AllCells:' ( (lv_allCells_9_0= ruleCell ) )* )
            // InternalTASKDSL.g:105:3: otherlv_0= 'Game:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'GridSize:' ( (lv_gridSize_3_0= ruleGridSize ) ) otherlv_4= 'EvolutionRules:' ( (lv_evolutionRules_5_0= ruleevolutionRules ) )* otherlv_6= 'InitiallyActiveCells:' ( (lv_startGrid_7_0= ruleStartGrid ) )* otherlv_8= 'AllCells:' ( (lv_allCells_9_0= ruleCell ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGameKeyword_0());
            		
            // InternalTASKDSL.g:109:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTASKDSL.g:110:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTASKDSL.g:110:4: (lv_name_1_0= RULE_ID )
            // InternalTASKDSL.g:111:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGameAccess().getGridSizeKeyword_2());
            		
            // InternalTASKDSL.g:131:3: ( (lv_gridSize_3_0= ruleGridSize ) )
            // InternalTASKDSL.g:132:4: (lv_gridSize_3_0= ruleGridSize )
            {
            // InternalTASKDSL.g:132:4: (lv_gridSize_3_0= ruleGridSize )
            // InternalTASKDSL.g:133:5: lv_gridSize_3_0= ruleGridSize
            {

            					newCompositeNode(grammarAccess.getGameAccess().getGridSizeGridSizeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_gridSize_3_0=ruleGridSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					add(
            						current,
            						"gridSize",
            						lv_gridSize_3_0,
            						"game.of.life.tasks.TASKDSL.GridSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getGameAccess().getEvolutionRulesKeyword_4());
            		
            // InternalTASKDSL.g:154:3: ( (lv_evolutionRules_5_0= ruleevolutionRules ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTASKDSL.g:155:4: (lv_evolutionRules_5_0= ruleevolutionRules )
            	    {
            	    // InternalTASKDSL.g:155:4: (lv_evolutionRules_5_0= ruleevolutionRules )
            	    // InternalTASKDSL.g:156:5: lv_evolutionRules_5_0= ruleevolutionRules
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getEvolutionRulesEvolutionRulesParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_evolutionRules_5_0=ruleevolutionRules();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"evolutionRules",
            	    						lv_evolutionRules_5_0,
            	    						"game.of.life.tasks.TASKDSL.evolutionRules");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getGameAccess().getInitiallyActiveCellsKeyword_6());
            		
            // InternalTASKDSL.g:177:3: ( (lv_startGrid_7_0= ruleStartGrid ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTASKDSL.g:178:4: (lv_startGrid_7_0= ruleStartGrid )
            	    {
            	    // InternalTASKDSL.g:178:4: (lv_startGrid_7_0= ruleStartGrid )
            	    // InternalTASKDSL.g:179:5: lv_startGrid_7_0= ruleStartGrid
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getStartGridStartGridParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_startGrid_7_0=ruleStartGrid();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"startGrid",
            	    						lv_startGrid_7_0,
            	    						"game.of.life.tasks.TASKDSL.StartGrid");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getGameAccess().getAllCellsKeyword_8());
            		
            // InternalTASKDSL.g:200:3: ( (lv_allCells_9_0= ruleCell ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTASKDSL.g:201:4: (lv_allCells_9_0= ruleCell )
            	    {
            	    // InternalTASKDSL.g:201:4: (lv_allCells_9_0= ruleCell )
            	    // InternalTASKDSL.g:202:5: lv_allCells_9_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getAllCellsCellParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_allCells_9_0=ruleCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"allCells",
            	    						lv_allCells_9_0,
            	    						"game.of.life.tasks.TASKDSL.Cell");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleGridSize"
    // InternalTASKDSL.g:223:1: entryRuleGridSize returns [EObject current=null] : iv_ruleGridSize= ruleGridSize EOF ;
    public final EObject entryRuleGridSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGridSize = null;


        try {
            // InternalTASKDSL.g:223:49: (iv_ruleGridSize= ruleGridSize EOF )
            // InternalTASKDSL.g:224:2: iv_ruleGridSize= ruleGridSize EOF
            {
             newCompositeNode(grammarAccess.getGridSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGridSize=ruleGridSize();

            state._fsp--;

             current =iv_ruleGridSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGridSize"


    // $ANTLR start "ruleGridSize"
    // InternalTASKDSL.g:230:1: ruleGridSize returns [EObject current=null] : (otherlv_0= 'Height:' ( (lv_h_1_0= RULE_INT ) ) otherlv_2= 'Length:' ( (lv_l_3_0= RULE_INT ) ) ) ;
    public final EObject ruleGridSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_h_1_0=null;
        Token otherlv_2=null;
        Token lv_l_3_0=null;


        	enterRule();

        try {
            // InternalTASKDSL.g:236:2: ( (otherlv_0= 'Height:' ( (lv_h_1_0= RULE_INT ) ) otherlv_2= 'Length:' ( (lv_l_3_0= RULE_INT ) ) ) )
            // InternalTASKDSL.g:237:2: (otherlv_0= 'Height:' ( (lv_h_1_0= RULE_INT ) ) otherlv_2= 'Length:' ( (lv_l_3_0= RULE_INT ) ) )
            {
            // InternalTASKDSL.g:237:2: (otherlv_0= 'Height:' ( (lv_h_1_0= RULE_INT ) ) otherlv_2= 'Length:' ( (lv_l_3_0= RULE_INT ) ) )
            // InternalTASKDSL.g:238:3: otherlv_0= 'Height:' ( (lv_h_1_0= RULE_INT ) ) otherlv_2= 'Length:' ( (lv_l_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getGridSizeAccess().getHeightKeyword_0());
            		
            // InternalTASKDSL.g:242:3: ( (lv_h_1_0= RULE_INT ) )
            // InternalTASKDSL.g:243:4: (lv_h_1_0= RULE_INT )
            {
            // InternalTASKDSL.g:243:4: (lv_h_1_0= RULE_INT )
            // InternalTASKDSL.g:244:5: lv_h_1_0= RULE_INT
            {
            lv_h_1_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_h_1_0, grammarAccess.getGridSizeAccess().getHINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGridSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"h",
            						lv_h_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getGridSizeAccess().getLengthKeyword_2());
            		
            // InternalTASKDSL.g:264:3: ( (lv_l_3_0= RULE_INT ) )
            // InternalTASKDSL.g:265:4: (lv_l_3_0= RULE_INT )
            {
            // InternalTASKDSL.g:265:4: (lv_l_3_0= RULE_INT )
            // InternalTASKDSL.g:266:5: lv_l_3_0= RULE_INT
            {
            lv_l_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_l_3_0, grammarAccess.getGridSizeAccess().getLINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGridSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"l",
            						lv_l_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGridSize"


    // $ANTLR start "entryRuleStartGrid"
    // InternalTASKDSL.g:286:1: entryRuleStartGrid returns [EObject current=null] : iv_ruleStartGrid= ruleStartGrid EOF ;
    public final EObject entryRuleStartGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartGrid = null;


        try {
            // InternalTASKDSL.g:286:50: (iv_ruleStartGrid= ruleStartGrid EOF )
            // InternalTASKDSL.g:287:2: iv_ruleStartGrid= ruleStartGrid EOF
            {
             newCompositeNode(grammarAccess.getStartGridRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartGrid=ruleStartGrid();

            state._fsp--;

             current =iv_ruleStartGrid; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartGrid"


    // $ANTLR start "ruleStartGrid"
    // InternalTASKDSL.g:293:1: ruleStartGrid returns [EObject current=null] : (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_yC_4_0= RULE_INT ) ) otherlv_5= 'Status:' ( (lv_s_6_0= ruleStatus ) ) ) ;
    public final EObject ruleStartGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_xC_2_0=null;
        Token otherlv_3=null;
        Token lv_yC_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_s_6_0 = null;



        	enterRule();

        try {
            // InternalTASKDSL.g:299:2: ( (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_yC_4_0= RULE_INT ) ) otherlv_5= 'Status:' ( (lv_s_6_0= ruleStatus ) ) ) )
            // InternalTASKDSL.g:300:2: (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_yC_4_0= RULE_INT ) ) otherlv_5= 'Status:' ( (lv_s_6_0= ruleStatus ) ) )
            {
            // InternalTASKDSL.g:300:2: (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_yC_4_0= RULE_INT ) ) otherlv_5= 'Status:' ( (lv_s_6_0= ruleStatus ) ) )
            // InternalTASKDSL.g:301:3: otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_yC_4_0= RULE_INT ) ) otherlv_5= 'Status:' ( (lv_s_6_0= ruleStatus ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getStartGridAccess().getCoordinateInfoKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getStartGridAccess().getXKeyword_1());
            		
            // InternalTASKDSL.g:309:3: ( (lv_xC_2_0= RULE_INT ) )
            // InternalTASKDSL.g:310:4: (lv_xC_2_0= RULE_INT )
            {
            // InternalTASKDSL.g:310:4: (lv_xC_2_0= RULE_INT )
            // InternalTASKDSL.g:311:5: lv_xC_2_0= RULE_INT
            {
            lv_xC_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_xC_2_0, grammarAccess.getStartGridAccess().getXCINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartGridRule());
            					}
            					setWithLastConsumed(
            						current,
            						"xC",
            						lv_xC_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getStartGridAccess().getYKeyword_3());
            		
            // InternalTASKDSL.g:331:3: ( (lv_yC_4_0= RULE_INT ) )
            // InternalTASKDSL.g:332:4: (lv_yC_4_0= RULE_INT )
            {
            // InternalTASKDSL.g:332:4: (lv_yC_4_0= RULE_INT )
            // InternalTASKDSL.g:333:5: lv_yC_4_0= RULE_INT
            {
            lv_yC_4_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_yC_4_0, grammarAccess.getStartGridAccess().getYCINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartGridRule());
            					}
            					setWithLastConsumed(
            						current,
            						"yC",
            						lv_yC_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getStartGridAccess().getStatusKeyword_5());
            		
            // InternalTASKDSL.g:353:3: ( (lv_s_6_0= ruleStatus ) )
            // InternalTASKDSL.g:354:4: (lv_s_6_0= ruleStatus )
            {
            // InternalTASKDSL.g:354:4: (lv_s_6_0= ruleStatus )
            // InternalTASKDSL.g:355:5: lv_s_6_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getStartGridAccess().getSStatusEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_s_6_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartGridRule());
            					}
            					set(
            						current,
            						"s",
            						lv_s_6_0,
            						"game.of.life.tasks.TASKDSL.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartGrid"


    // $ANTLR start "entryRuleCell"
    // InternalTASKDSL.g:376:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalTASKDSL.g:376:45: (iv_ruleCell= ruleCell EOF )
            // InternalTASKDSL.g:377:2: iv_ruleCell= ruleCell EOF
            {
             newCompositeNode(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCell=ruleCell();

            state._fsp--;

             current =iv_ruleCell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalTASKDSL.g:383:1: ruleCell returns [EObject current=null] : (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_yC_4_0= RULE_INT ) ) otherlv_5= 'Status:' ( (lv_s_6_0= ruleStatus ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_xC_2_0=null;
        Token otherlv_3=null;
        Token lv_yC_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_s_6_0 = null;



        	enterRule();

        try {
            // InternalTASKDSL.g:389:2: ( (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_yC_4_0= RULE_INT ) ) otherlv_5= 'Status:' ( (lv_s_6_0= ruleStatus ) ) ) )
            // InternalTASKDSL.g:390:2: (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_yC_4_0= RULE_INT ) ) otherlv_5= 'Status:' ( (lv_s_6_0= ruleStatus ) ) )
            {
            // InternalTASKDSL.g:390:2: (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_yC_4_0= RULE_INT ) ) otherlv_5= 'Status:' ( (lv_s_6_0= ruleStatus ) ) )
            // InternalTASKDSL.g:391:3: otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_yC_4_0= RULE_INT ) ) otherlv_5= 'Status:' ( (lv_s_6_0= ruleStatus ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getCoordinateInfoKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCellAccess().getXKeyword_1());
            		
            // InternalTASKDSL.g:399:3: ( (lv_xC_2_0= RULE_INT ) )
            // InternalTASKDSL.g:400:4: (lv_xC_2_0= RULE_INT )
            {
            // InternalTASKDSL.g:400:4: (lv_xC_2_0= RULE_INT )
            // InternalTASKDSL.g:401:5: lv_xC_2_0= RULE_INT
            {
            lv_xC_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_xC_2_0, grammarAccess.getCellAccess().getXCINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"xC",
            						lv_xC_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getCellAccess().getYKeyword_3());
            		
            // InternalTASKDSL.g:421:3: ( (lv_yC_4_0= RULE_INT ) )
            // InternalTASKDSL.g:422:4: (lv_yC_4_0= RULE_INT )
            {
            // InternalTASKDSL.g:422:4: (lv_yC_4_0= RULE_INT )
            // InternalTASKDSL.g:423:5: lv_yC_4_0= RULE_INT
            {
            lv_yC_4_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_yC_4_0, grammarAccess.getCellAccess().getYCINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"yC",
            						lv_yC_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getCellAccess().getStatusKeyword_5());
            		
            // InternalTASKDSL.g:443:3: ( (lv_s_6_0= ruleStatus ) )
            // InternalTASKDSL.g:444:4: (lv_s_6_0= ruleStatus )
            {
            // InternalTASKDSL.g:444:4: (lv_s_6_0= ruleStatus )
            // InternalTASKDSL.g:445:5: lv_s_6_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getCellAccess().getSStatusEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_s_6_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellRule());
            					}
            					set(
            						current,
            						"s",
            						lv_s_6_0,
            						"game.of.life.tasks.TASKDSL.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleevolutionRules"
    // InternalTASKDSL.g:466:1: entryRuleevolutionRules returns [EObject current=null] : iv_ruleevolutionRules= ruleevolutionRules EOF ;
    public final EObject entryRuleevolutionRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleevolutionRules = null;


        try {
            // InternalTASKDSL.g:466:55: (iv_ruleevolutionRules= ruleevolutionRules EOF )
            // InternalTASKDSL.g:467:2: iv_ruleevolutionRules= ruleevolutionRules EOF
            {
             newCompositeNode(grammarAccess.getEvolutionRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleevolutionRules=ruleevolutionRules();

            state._fsp--;

             current =iv_ruleevolutionRules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleevolutionRules"


    // $ANTLR start "ruleevolutionRules"
    // InternalTASKDSL.g:473:1: ruleevolutionRules returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= 'neighborNo=' ( (lv_nNo_2_0= RULE_INT ) ) ( (lv_l_3_0= rulelogicalRelation ) ) ( (lv_comparedNo_4_0= RULE_INT ) ) otherlv_5= 'and' otherlv_6= 'Cell Status' ( (lv_s_7_0= ruleStatus ) ) otherlv_8= 'then' ( (lv_result_9_0= ruleResult ) ) ) ;
    public final EObject ruleevolutionRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_nNo_2_0=null;
        Token lv_comparedNo_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_l_3_0 = null;

        Enumerator lv_s_7_0 = null;

        Enumerator lv_result_9_0 = null;



        	enterRule();

        try {
            // InternalTASKDSL.g:479:2: ( (otherlv_0= 'if' otherlv_1= 'neighborNo=' ( (lv_nNo_2_0= RULE_INT ) ) ( (lv_l_3_0= rulelogicalRelation ) ) ( (lv_comparedNo_4_0= RULE_INT ) ) otherlv_5= 'and' otherlv_6= 'Cell Status' ( (lv_s_7_0= ruleStatus ) ) otherlv_8= 'then' ( (lv_result_9_0= ruleResult ) ) ) )
            // InternalTASKDSL.g:480:2: (otherlv_0= 'if' otherlv_1= 'neighborNo=' ( (lv_nNo_2_0= RULE_INT ) ) ( (lv_l_3_0= rulelogicalRelation ) ) ( (lv_comparedNo_4_0= RULE_INT ) ) otherlv_5= 'and' otherlv_6= 'Cell Status' ( (lv_s_7_0= ruleStatus ) ) otherlv_8= 'then' ( (lv_result_9_0= ruleResult ) ) )
            {
            // InternalTASKDSL.g:480:2: (otherlv_0= 'if' otherlv_1= 'neighborNo=' ( (lv_nNo_2_0= RULE_INT ) ) ( (lv_l_3_0= rulelogicalRelation ) ) ( (lv_comparedNo_4_0= RULE_INT ) ) otherlv_5= 'and' otherlv_6= 'Cell Status' ( (lv_s_7_0= ruleStatus ) ) otherlv_8= 'then' ( (lv_result_9_0= ruleResult ) ) )
            // InternalTASKDSL.g:481:3: otherlv_0= 'if' otherlv_1= 'neighborNo=' ( (lv_nNo_2_0= RULE_INT ) ) ( (lv_l_3_0= rulelogicalRelation ) ) ( (lv_comparedNo_4_0= RULE_INT ) ) otherlv_5= 'and' otherlv_6= 'Cell Status' ( (lv_s_7_0= ruleStatus ) ) otherlv_8= 'then' ( (lv_result_9_0= ruleResult ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEvolutionRulesAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEvolutionRulesAccess().getNeighborNoKeyword_1());
            		
            // InternalTASKDSL.g:489:3: ( (lv_nNo_2_0= RULE_INT ) )
            // InternalTASKDSL.g:490:4: (lv_nNo_2_0= RULE_INT )
            {
            // InternalTASKDSL.g:490:4: (lv_nNo_2_0= RULE_INT )
            // InternalTASKDSL.g:491:5: lv_nNo_2_0= RULE_INT
            {
            lv_nNo_2_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_nNo_2_0, grammarAccess.getEvolutionRulesAccess().getNNoINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvolutionRulesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nNo",
            						lv_nNo_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalTASKDSL.g:507:3: ( (lv_l_3_0= rulelogicalRelation ) )
            // InternalTASKDSL.g:508:4: (lv_l_3_0= rulelogicalRelation )
            {
            // InternalTASKDSL.g:508:4: (lv_l_3_0= rulelogicalRelation )
            // InternalTASKDSL.g:509:5: lv_l_3_0= rulelogicalRelation
            {

            					newCompositeNode(grammarAccess.getEvolutionRulesAccess().getLLogicalRelationEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_l_3_0=rulelogicalRelation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvolutionRulesRule());
            					}
            					set(
            						current,
            						"l",
            						lv_l_3_0,
            						"game.of.life.tasks.TASKDSL.logicalRelation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTASKDSL.g:526:3: ( (lv_comparedNo_4_0= RULE_INT ) )
            // InternalTASKDSL.g:527:4: (lv_comparedNo_4_0= RULE_INT )
            {
            // InternalTASKDSL.g:527:4: (lv_comparedNo_4_0= RULE_INT )
            // InternalTASKDSL.g:528:5: lv_comparedNo_4_0= RULE_INT
            {
            lv_comparedNo_4_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_comparedNo_4_0, grammarAccess.getEvolutionRulesAccess().getComparedNoINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvolutionRulesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comparedNo",
            						lv_comparedNo_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getEvolutionRulesAccess().getAndKeyword_5());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getEvolutionRulesAccess().getCellStatusKeyword_6());
            		
            // InternalTASKDSL.g:552:3: ( (lv_s_7_0= ruleStatus ) )
            // InternalTASKDSL.g:553:4: (lv_s_7_0= ruleStatus )
            {
            // InternalTASKDSL.g:553:4: (lv_s_7_0= ruleStatus )
            // InternalTASKDSL.g:554:5: lv_s_7_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getEvolutionRulesAccess().getSStatusEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_20);
            lv_s_7_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvolutionRulesRule());
            					}
            					set(
            						current,
            						"s",
            						lv_s_7_0,
            						"game.of.life.tasks.TASKDSL.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getEvolutionRulesAccess().getThenKeyword_8());
            		
            // InternalTASKDSL.g:575:3: ( (lv_result_9_0= ruleResult ) )
            // InternalTASKDSL.g:576:4: (lv_result_9_0= ruleResult )
            {
            // InternalTASKDSL.g:576:4: (lv_result_9_0= ruleResult )
            // InternalTASKDSL.g:577:5: lv_result_9_0= ruleResult
            {

            					newCompositeNode(grammarAccess.getEvolutionRulesAccess().getResultResultEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_result_9_0=ruleResult();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvolutionRulesRule());
            					}
            					set(
            						current,
            						"result",
            						lv_result_9_0,
            						"game.of.life.tasks.TASKDSL.Result");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleevolutionRules"


    // $ANTLR start "rulelogicalRelation"
    // InternalTASKDSL.g:598:1: rulelogicalRelation returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) ) ;
    public final Enumerator rulelogicalRelation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalTASKDSL.g:604:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) ) )
            // InternalTASKDSL.g:605:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) )
            {
            // InternalTASKDSL.g:605:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            case 30:
                {
                alt4=4;
                }
                break;
            case 31:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTASKDSL.g:606:3: (enumLiteral_0= '==' )
                    {
                    // InternalTASKDSL.g:606:3: (enumLiteral_0= '==' )
                    // InternalTASKDSL.g:607:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getLogicalRelationAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicalRelationAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:614:3: (enumLiteral_1= '>' )
                    {
                    // InternalTASKDSL.g:614:3: (enumLiteral_1= '>' )
                    // InternalTASKDSL.g:615:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getLogicalRelationAccess().getGREATERTHANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicalRelationAccess().getGREATERTHANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTASKDSL.g:622:3: (enumLiteral_2= '<' )
                    {
                    // InternalTASKDSL.g:622:3: (enumLiteral_2= '<' )
                    // InternalTASKDSL.g:623:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getLogicalRelationAccess().getLESSTHANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLogicalRelationAccess().getLESSTHANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTASKDSL.g:630:3: (enumLiteral_3= '>=' )
                    {
                    // InternalTASKDSL.g:630:3: (enumLiteral_3= '>=' )
                    // InternalTASKDSL.g:631:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getLogicalRelationAccess().getGREATEROREQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLogicalRelationAccess().getGREATEROREQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTASKDSL.g:638:3: (enumLiteral_4= '<=' )
                    {
                    // InternalTASKDSL.g:638:3: (enumLiteral_4= '<=' )
                    // InternalTASKDSL.g:639:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getLogicalRelationAccess().getLESSOREQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLogicalRelationAccess().getLESSOREQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelogicalRelation"


    // $ANTLR start "ruleStatus"
    // InternalTASKDSL.g:649:1: ruleStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'Live' ) | (enumLiteral_1= 'Dead' ) ) ;
    public final Enumerator ruleStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTASKDSL.g:655:2: ( ( (enumLiteral_0= 'Live' ) | (enumLiteral_1= 'Dead' ) ) )
            // InternalTASKDSL.g:656:2: ( (enumLiteral_0= 'Live' ) | (enumLiteral_1= 'Dead' ) )
            {
            // InternalTASKDSL.g:656:2: ( (enumLiteral_0= 'Live' ) | (enumLiteral_1= 'Dead' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            else if ( (LA5_0==33) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTASKDSL.g:657:3: (enumLiteral_0= 'Live' )
                    {
                    // InternalTASKDSL.g:657:3: (enumLiteral_0= 'Live' )
                    // InternalTASKDSL.g:658:4: enumLiteral_0= 'Live'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getStatusAccess().getLIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStatusAccess().getLIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:665:3: (enumLiteral_1= 'Dead' )
                    {
                    // InternalTASKDSL.g:665:3: (enumLiteral_1= 'Dead' )
                    // InternalTASKDSL.g:666:4: enumLiteral_1= 'Dead'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getStatusAccess().getDEADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStatusAccess().getDEADEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatus"


    // $ANTLR start "ruleResult"
    // InternalTASKDSL.g:676:1: ruleResult returns [Enumerator current=null] : ( (enumLiteral_0= 'Birth' ) | (enumLiteral_1= 'OverCrowd' ) | (enumLiteral_2= 'xisolate' ) | (enumLiteral_3= 'Survive' ) ) ;
    public final Enumerator ruleResult() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTASKDSL.g:682:2: ( ( (enumLiteral_0= 'Birth' ) | (enumLiteral_1= 'OverCrowd' ) | (enumLiteral_2= 'xisolate' ) | (enumLiteral_3= 'Survive' ) ) )
            // InternalTASKDSL.g:683:2: ( (enumLiteral_0= 'Birth' ) | (enumLiteral_1= 'OverCrowd' ) | (enumLiteral_2= 'xisolate' ) | (enumLiteral_3= 'Survive' ) )
            {
            // InternalTASKDSL.g:683:2: ( (enumLiteral_0= 'Birth' ) | (enumLiteral_1= 'OverCrowd' ) | (enumLiteral_2= 'xisolate' ) | (enumLiteral_3= 'Survive' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case 36:
                {
                alt6=3;
                }
                break;
            case 37:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTASKDSL.g:684:3: (enumLiteral_0= 'Birth' )
                    {
                    // InternalTASKDSL.g:684:3: (enumLiteral_0= 'Birth' )
                    // InternalTASKDSL.g:685:4: enumLiteral_0= 'Birth'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getResultAccess().getBIRTHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getResultAccess().getBIRTHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:692:3: (enumLiteral_1= 'OverCrowd' )
                    {
                    // InternalTASKDSL.g:692:3: (enumLiteral_1= 'OverCrowd' )
                    // InternalTASKDSL.g:693:4: enumLiteral_1= 'OverCrowd'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getResultAccess().getOVERCROWDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getResultAccess().getOVERCROWDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTASKDSL.g:700:3: (enumLiteral_2= 'xisolate' )
                    {
                    // InternalTASKDSL.g:700:3: (enumLiteral_2= 'xisolate' )
                    // InternalTASKDSL.g:701:4: enumLiteral_2= 'xisolate'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getResultAccess().getXSOLATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getResultAccess().getXSOLATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTASKDSL.g:708:3: (enumLiteral_3= 'Survive' )
                    {
                    // InternalTASKDSL.g:708:3: (enumLiteral_3= 'Survive' )
                    // InternalTASKDSL.g:709:4: enumLiteral_3= 'Survive'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getResultAccess().getSURVIVEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getResultAccess().getSURVIVEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResult"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000F8000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003C00000000L});

}