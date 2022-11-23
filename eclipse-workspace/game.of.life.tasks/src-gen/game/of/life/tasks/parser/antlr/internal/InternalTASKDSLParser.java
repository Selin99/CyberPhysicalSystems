package game.of.life.tasks.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game:'", "'GameStatus:'", "'GridSize:'", "'EvolutionRules:'", "'InitiallyActiveCells:'", "'AllCells:'", "'Height:'", "'Length:'", "'Continue'", "'Over'", "'CoordinateInfo:'", "'x:'", "'y:'", "'NeighborNo:'", "'Status:'", "'Live'", "'NextGeneration:'", "'Birth'", "'OverCrowd'", "'xisolate'", "'Survive'", "'Dead'", "'if'", "'then'", "'||'", "'&&'", "'<'", "'<='", "'=='", "'>='", "'>'", "'('", "')'", "'true'", "'false'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalTASKDSL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTASKDSL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalTASKDSL.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalTASKDSL.g:71:1: ruleModel returns [EObject current=null] : this_Game_0= ruleGame ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Game_0 = null;



        	enterRule();

        try {
            // InternalTASKDSL.g:77:2: (this_Game_0= ruleGame )
            // InternalTASKDSL.g:78:2: this_Game_0= ruleGame
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
    // InternalTASKDSL.g:89:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalTASKDSL.g:89:45: (iv_ruleGame= ruleGame EOF )
            // InternalTASKDSL.g:90:2: iv_ruleGame= ruleGame EOF
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
    // InternalTASKDSL.g:96:1: ruleGame returns [EObject current=null] : (otherlv_0= 'Game:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'GameStatus:' ( (lv_gameStatus_3_0= ruleGameStatus ) ) otherlv_4= 'GridSize:' ( (lv_gridSize_5_0= ruleGridSize ) ) otherlv_6= 'EvolutionRules:' ( (lv_evolutionRules_7_0= ruleevolutionRules ) )* otherlv_8= 'InitiallyActiveCells:' ( (lv_startGrid_9_0= ruleStartGrid ) )* otherlv_10= 'AllCells:' ( (lv_allCells_11_0= ruleCell ) )* ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_gameStatus_3_0 = null;

        EObject lv_gridSize_5_0 = null;

        EObject lv_evolutionRules_7_0 = null;

        EObject lv_startGrid_9_0 = null;

        EObject lv_allCells_11_0 = null;



        	enterRule();

        try {
            // InternalTASKDSL.g:102:2: ( (otherlv_0= 'Game:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'GameStatus:' ( (lv_gameStatus_3_0= ruleGameStatus ) ) otherlv_4= 'GridSize:' ( (lv_gridSize_5_0= ruleGridSize ) ) otherlv_6= 'EvolutionRules:' ( (lv_evolutionRules_7_0= ruleevolutionRules ) )* otherlv_8= 'InitiallyActiveCells:' ( (lv_startGrid_9_0= ruleStartGrid ) )* otherlv_10= 'AllCells:' ( (lv_allCells_11_0= ruleCell ) )* ) )
            // InternalTASKDSL.g:103:2: (otherlv_0= 'Game:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'GameStatus:' ( (lv_gameStatus_3_0= ruleGameStatus ) ) otherlv_4= 'GridSize:' ( (lv_gridSize_5_0= ruleGridSize ) ) otherlv_6= 'EvolutionRules:' ( (lv_evolutionRules_7_0= ruleevolutionRules ) )* otherlv_8= 'InitiallyActiveCells:' ( (lv_startGrid_9_0= ruleStartGrid ) )* otherlv_10= 'AllCells:' ( (lv_allCells_11_0= ruleCell ) )* )
            {
            // InternalTASKDSL.g:103:2: (otherlv_0= 'Game:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'GameStatus:' ( (lv_gameStatus_3_0= ruleGameStatus ) ) otherlv_4= 'GridSize:' ( (lv_gridSize_5_0= ruleGridSize ) ) otherlv_6= 'EvolutionRules:' ( (lv_evolutionRules_7_0= ruleevolutionRules ) )* otherlv_8= 'InitiallyActiveCells:' ( (lv_startGrid_9_0= ruleStartGrid ) )* otherlv_10= 'AllCells:' ( (lv_allCells_11_0= ruleCell ) )* )
            // InternalTASKDSL.g:104:3: otherlv_0= 'Game:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'GameStatus:' ( (lv_gameStatus_3_0= ruleGameStatus ) ) otherlv_4= 'GridSize:' ( (lv_gridSize_5_0= ruleGridSize ) ) otherlv_6= 'EvolutionRules:' ( (lv_evolutionRules_7_0= ruleevolutionRules ) )* otherlv_8= 'InitiallyActiveCells:' ( (lv_startGrid_9_0= ruleStartGrid ) )* otherlv_10= 'AllCells:' ( (lv_allCells_11_0= ruleCell ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGameKeyword_0());
            		
            // InternalTASKDSL.g:108:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTASKDSL.g:109:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTASKDSL.g:109:4: (lv_name_1_0= RULE_ID )
            // InternalTASKDSL.g:110:5: lv_name_1_0= RULE_ID
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

            			newLeafNode(otherlv_2, grammarAccess.getGameAccess().getGameStatusKeyword_2());
            		
            // InternalTASKDSL.g:130:3: ( (lv_gameStatus_3_0= ruleGameStatus ) )
            // InternalTASKDSL.g:131:4: (lv_gameStatus_3_0= ruleGameStatus )
            {
            // InternalTASKDSL.g:131:4: (lv_gameStatus_3_0= ruleGameStatus )
            // InternalTASKDSL.g:132:5: lv_gameStatus_3_0= ruleGameStatus
            {

            					newCompositeNode(grammarAccess.getGameAccess().getGameStatusGameStatusParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_gameStatus_3_0=ruleGameStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					add(
            						current,
            						"gameStatus",
            						lv_gameStatus_3_0,
            						"game.of.life.tasks.TASKDSL.GameStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getGameAccess().getGridSizeKeyword_4());
            		
            // InternalTASKDSL.g:153:3: ( (lv_gridSize_5_0= ruleGridSize ) )
            // InternalTASKDSL.g:154:4: (lv_gridSize_5_0= ruleGridSize )
            {
            // InternalTASKDSL.g:154:4: (lv_gridSize_5_0= ruleGridSize )
            // InternalTASKDSL.g:155:5: lv_gridSize_5_0= ruleGridSize
            {

            					newCompositeNode(grammarAccess.getGameAccess().getGridSizeGridSizeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_gridSize_5_0=ruleGridSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					add(
            						current,
            						"gridSize",
            						lv_gridSize_5_0,
            						"game.of.life.tasks.TASKDSL.GridSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getGameAccess().getEvolutionRulesKeyword_6());
            		
            // InternalTASKDSL.g:176:3: ( (lv_evolutionRules_7_0= ruleevolutionRules ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTASKDSL.g:177:4: (lv_evolutionRules_7_0= ruleevolutionRules )
            	    {
            	    // InternalTASKDSL.g:177:4: (lv_evolutionRules_7_0= ruleevolutionRules )
            	    // InternalTASKDSL.g:178:5: lv_evolutionRules_7_0= ruleevolutionRules
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getEvolutionRulesEvolutionRulesParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_evolutionRules_7_0=ruleevolutionRules();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"evolutionRules",
            	    						lv_evolutionRules_7_0,
            	    						"game.of.life.tasks.TASKDSL.evolutionRules");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getGameAccess().getInitiallyActiveCellsKeyword_8());
            		
            // InternalTASKDSL.g:199:3: ( (lv_startGrid_9_0= ruleStartGrid ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTASKDSL.g:200:4: (lv_startGrid_9_0= ruleStartGrid )
            	    {
            	    // InternalTASKDSL.g:200:4: (lv_startGrid_9_0= ruleStartGrid )
            	    // InternalTASKDSL.g:201:5: lv_startGrid_9_0= ruleStartGrid
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getStartGridStartGridParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_startGrid_9_0=ruleStartGrid();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"startGrid",
            	    						lv_startGrid_9_0,
            	    						"game.of.life.tasks.TASKDSL.StartGrid");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getGameAccess().getAllCellsKeyword_10());
            		
            // InternalTASKDSL.g:222:3: ( (lv_allCells_11_0= ruleCell ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTASKDSL.g:223:4: (lv_allCells_11_0= ruleCell )
            	    {
            	    // InternalTASKDSL.g:223:4: (lv_allCells_11_0= ruleCell )
            	    // InternalTASKDSL.g:224:5: lv_allCells_11_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getAllCellsCellParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_allCells_11_0=ruleCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"allCells",
            	    						lv_allCells_11_0,
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
    // InternalTASKDSL.g:245:1: entryRuleGridSize returns [EObject current=null] : iv_ruleGridSize= ruleGridSize EOF ;
    public final EObject entryRuleGridSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGridSize = null;


        try {
            // InternalTASKDSL.g:245:49: (iv_ruleGridSize= ruleGridSize EOF )
            // InternalTASKDSL.g:246:2: iv_ruleGridSize= ruleGridSize EOF
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
    // InternalTASKDSL.g:252:1: ruleGridSize returns [EObject current=null] : (otherlv_0= 'Height:' ( (lv_h_1_0= RULE_INT ) ) otherlv_2= 'Length:' ( (lv_l_3_0= RULE_INT ) ) ) ;
    public final EObject ruleGridSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_h_1_0=null;
        Token otherlv_2=null;
        Token lv_l_3_0=null;


        	enterRule();

        try {
            // InternalTASKDSL.g:258:2: ( (otherlv_0= 'Height:' ( (lv_h_1_0= RULE_INT ) ) otherlv_2= 'Length:' ( (lv_l_3_0= RULE_INT ) ) ) )
            // InternalTASKDSL.g:259:2: (otherlv_0= 'Height:' ( (lv_h_1_0= RULE_INT ) ) otherlv_2= 'Length:' ( (lv_l_3_0= RULE_INT ) ) )
            {
            // InternalTASKDSL.g:259:2: (otherlv_0= 'Height:' ( (lv_h_1_0= RULE_INT ) ) otherlv_2= 'Length:' ( (lv_l_3_0= RULE_INT ) ) )
            // InternalTASKDSL.g:260:3: otherlv_0= 'Height:' ( (lv_h_1_0= RULE_INT ) ) otherlv_2= 'Length:' ( (lv_l_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getGridSizeAccess().getHeightKeyword_0());
            		
            // InternalTASKDSL.g:264:3: ( (lv_h_1_0= RULE_INT ) )
            // InternalTASKDSL.g:265:4: (lv_h_1_0= RULE_INT )
            {
            // InternalTASKDSL.g:265:4: (lv_h_1_0= RULE_INT )
            // InternalTASKDSL.g:266:5: lv_h_1_0= RULE_INT
            {
            lv_h_1_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getGridSizeAccess().getLengthKeyword_2());
            		
            // InternalTASKDSL.g:286:3: ( (lv_l_3_0= RULE_INT ) )
            // InternalTASKDSL.g:287:4: (lv_l_3_0= RULE_INT )
            {
            // InternalTASKDSL.g:287:4: (lv_l_3_0= RULE_INT )
            // InternalTASKDSL.g:288:5: lv_l_3_0= RULE_INT
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


    // $ANTLR start "entryRuleGameStatus"
    // InternalTASKDSL.g:308:1: entryRuleGameStatus returns [EObject current=null] : iv_ruleGameStatus= ruleGameStatus EOF ;
    public final EObject entryRuleGameStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameStatus = null;


        try {
            // InternalTASKDSL.g:308:51: (iv_ruleGameStatus= ruleGameStatus EOF )
            // InternalTASKDSL.g:309:2: iv_ruleGameStatus= ruleGameStatus EOF
            {
             newCompositeNode(grammarAccess.getGameStatusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameStatus=ruleGameStatus();

            state._fsp--;

             current =iv_ruleGameStatus; 
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
    // $ANTLR end "entryRuleGameStatus"


    // $ANTLR start "ruleGameStatus"
    // InternalTASKDSL.g:315:1: ruleGameStatus returns [EObject current=null] : ( ( (lv_so_0_1= 'Continue' | lv_so_0_2= 'Over' ) ) ) ;
    public final EObject ruleGameStatus() throws RecognitionException {
        EObject current = null;

        Token lv_so_0_1=null;
        Token lv_so_0_2=null;


        	enterRule();

        try {
            // InternalTASKDSL.g:321:2: ( ( ( (lv_so_0_1= 'Continue' | lv_so_0_2= 'Over' ) ) ) )
            // InternalTASKDSL.g:322:2: ( ( (lv_so_0_1= 'Continue' | lv_so_0_2= 'Over' ) ) )
            {
            // InternalTASKDSL.g:322:2: ( ( (lv_so_0_1= 'Continue' | lv_so_0_2= 'Over' ) ) )
            // InternalTASKDSL.g:323:3: ( (lv_so_0_1= 'Continue' | lv_so_0_2= 'Over' ) )
            {
            // InternalTASKDSL.g:323:3: ( (lv_so_0_1= 'Continue' | lv_so_0_2= 'Over' ) )
            // InternalTASKDSL.g:324:4: (lv_so_0_1= 'Continue' | lv_so_0_2= 'Over' )
            {
            // InternalTASKDSL.g:324:4: (lv_so_0_1= 'Continue' | lv_so_0_2= 'Over' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTASKDSL.g:325:5: lv_so_0_1= 'Continue'
                    {
                    lv_so_0_1=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_so_0_1, grammarAccess.getGameStatusAccess().getSoContinueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGameStatusRule());
                    					}
                    					setWithLastConsumed(current, "so", lv_so_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:336:5: lv_so_0_2= 'Over'
                    {
                    lv_so_0_2=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_so_0_2, grammarAccess.getGameStatusAccess().getSoOverKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGameStatusRule());
                    					}
                    					setWithLastConsumed(current, "so", lv_so_0_2, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleGameStatus"


    // $ANTLR start "entryRuleStartGrid"
    // InternalTASKDSL.g:352:1: entryRuleStartGrid returns [EObject current=null] : iv_ruleStartGrid= ruleStartGrid EOF ;
    public final EObject entryRuleStartGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartGrid = null;


        try {
            // InternalTASKDSL.g:352:50: (iv_ruleStartGrid= ruleStartGrid EOF )
            // InternalTASKDSL.g:353:2: iv_ruleStartGrid= ruleStartGrid EOF
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
    // InternalTASKDSL.g:359:1: ruleStartGrid returns [EObject current=null] : (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_yC_4_0= RULE_INT ) ) otherlv_5= 'NeighborNo:' ( (lv_nNo_6_0= RULE_INT ) ) otherlv_7= 'Status:' ( (lv_s_8_0= 'Live' ) ) otherlv_9= 'NextGeneration:' ( ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) ) ) ) ;
    public final EObject ruleStartGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_xC_2_0=null;
        Token otherlv_3=null;
        Token lv_yC_4_0=null;
        Token otherlv_5=null;
        Token lv_nNo_6_0=null;
        Token otherlv_7=null;
        Token lv_s_8_0=null;
        Token otherlv_9=null;
        Token lv_a_10_1=null;
        Token lv_a_10_2=null;
        Token lv_a_10_3=null;
        Token lv_a_10_4=null;


        	enterRule();

        try {
            // InternalTASKDSL.g:365:2: ( (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_yC_4_0= RULE_INT ) ) otherlv_5= 'NeighborNo:' ( (lv_nNo_6_0= RULE_INT ) ) otherlv_7= 'Status:' ( (lv_s_8_0= 'Live' ) ) otherlv_9= 'NextGeneration:' ( ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) ) ) ) )
            // InternalTASKDSL.g:366:2: (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_yC_4_0= RULE_INT ) ) otherlv_5= 'NeighborNo:' ( (lv_nNo_6_0= RULE_INT ) ) otherlv_7= 'Status:' ( (lv_s_8_0= 'Live' ) ) otherlv_9= 'NextGeneration:' ( ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) ) ) )
            {
            // InternalTASKDSL.g:366:2: (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_yC_4_0= RULE_INT ) ) otherlv_5= 'NeighborNo:' ( (lv_nNo_6_0= RULE_INT ) ) otherlv_7= 'Status:' ( (lv_s_8_0= 'Live' ) ) otherlv_9= 'NextGeneration:' ( ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) ) ) )
            // InternalTASKDSL.g:367:3: otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_yC_4_0= RULE_INT ) ) otherlv_5= 'NeighborNo:' ( (lv_nNo_6_0= RULE_INT ) ) otherlv_7= 'Status:' ( (lv_s_8_0= 'Live' ) ) otherlv_9= 'NextGeneration:' ( ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getStartGridAccess().getCoordinateInfoKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getStartGridAccess().getXKeyword_1());
            		
            // InternalTASKDSL.g:375:3: ( (lv_xC_2_0= RULE_INT ) )
            // InternalTASKDSL.g:376:4: (lv_xC_2_0= RULE_INT )
            {
            // InternalTASKDSL.g:376:4: (lv_xC_2_0= RULE_INT )
            // InternalTASKDSL.g:377:5: lv_xC_2_0= RULE_INT
            {
            lv_xC_2_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

            otherlv_3=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getStartGridAccess().getYKeyword_3());
            		
            // InternalTASKDSL.g:397:3: ( (lv_yC_4_0= RULE_INT ) )
            // InternalTASKDSL.g:398:4: (lv_yC_4_0= RULE_INT )
            {
            // InternalTASKDSL.g:398:4: (lv_yC_4_0= RULE_INT )
            // InternalTASKDSL.g:399:5: lv_yC_4_0= RULE_INT
            {
            lv_yC_4_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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

            otherlv_5=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getStartGridAccess().getNeighborNoKeyword_5());
            		
            // InternalTASKDSL.g:419:3: ( (lv_nNo_6_0= RULE_INT ) )
            // InternalTASKDSL.g:420:4: (lv_nNo_6_0= RULE_INT )
            {
            // InternalTASKDSL.g:420:4: (lv_nNo_6_0= RULE_INT )
            // InternalTASKDSL.g:421:5: lv_nNo_6_0= RULE_INT
            {
            lv_nNo_6_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_nNo_6_0, grammarAccess.getStartGridAccess().getNNoINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartGridRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nNo",
            						lv_nNo_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getStartGridAccess().getStatusKeyword_7());
            		
            // InternalTASKDSL.g:441:3: ( (lv_s_8_0= 'Live' ) )
            // InternalTASKDSL.g:442:4: (lv_s_8_0= 'Live' )
            {
            // InternalTASKDSL.g:442:4: (lv_s_8_0= 'Live' )
            // InternalTASKDSL.g:443:5: lv_s_8_0= 'Live'
            {
            lv_s_8_0=(Token)match(input,26,FOLLOW_19); 

            					newLeafNode(lv_s_8_0, grammarAccess.getStartGridAccess().getSLiveKeyword_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartGridRule());
            					}
            					setWithLastConsumed(current, "s", lv_s_8_0, "Live");
            				

            }


            }

            otherlv_9=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_9, grammarAccess.getStartGridAccess().getNextGenerationKeyword_9());
            		
            // InternalTASKDSL.g:459:3: ( ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) ) )
            // InternalTASKDSL.g:460:4: ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) )
            {
            // InternalTASKDSL.g:460:4: ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) )
            // InternalTASKDSL.g:461:5: (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' )
            {
            // InternalTASKDSL.g:461:5: (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 30:
                {
                alt5=3;
                }
                break;
            case 31:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTASKDSL.g:462:6: lv_a_10_1= 'Birth'
                    {
                    lv_a_10_1=(Token)match(input,28,FOLLOW_2); 

                    						newLeafNode(lv_a_10_1, grammarAccess.getStartGridAccess().getABirthKeyword_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStartGridRule());
                    						}
                    						setWithLastConsumed(current, "a", lv_a_10_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:473:6: lv_a_10_2= 'OverCrowd'
                    {
                    lv_a_10_2=(Token)match(input,29,FOLLOW_2); 

                    						newLeafNode(lv_a_10_2, grammarAccess.getStartGridAccess().getAOverCrowdKeyword_10_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStartGridRule());
                    						}
                    						setWithLastConsumed(current, "a", lv_a_10_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTASKDSL.g:484:6: lv_a_10_3= 'xisolate'
                    {
                    lv_a_10_3=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_a_10_3, grammarAccess.getStartGridAccess().getAXisolateKeyword_10_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStartGridRule());
                    						}
                    						setWithLastConsumed(current, "a", lv_a_10_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalTASKDSL.g:495:6: lv_a_10_4= 'Survive'
                    {
                    lv_a_10_4=(Token)match(input,31,FOLLOW_2); 

                    						newLeafNode(lv_a_10_4, grammarAccess.getStartGridAccess().getASurviveKeyword_10_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStartGridRule());
                    						}
                    						setWithLastConsumed(current, "a", lv_a_10_4, null);
                    					

                    }
                    break;

            }


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
    // InternalTASKDSL.g:512:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalTASKDSL.g:512:45: (iv_ruleCell= ruleCell EOF )
            // InternalTASKDSL.g:513:2: iv_ruleCell= ruleCell EOF
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
    // InternalTASKDSL.g:519:1: ruleCell returns [EObject current=null] : (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= 'NeighborNo:' ( (lv_nNo_6_0= RULE_INT ) ) otherlv_7= 'Status:' ( ( (lv_s_8_1= 'Live' | lv_s_8_2= 'Dead' ) ) ) otherlv_9= 'NextGeneration:' ( ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token otherlv_3=null;
        Token lv_y_4_0=null;
        Token otherlv_5=null;
        Token lv_nNo_6_0=null;
        Token otherlv_7=null;
        Token lv_s_8_1=null;
        Token lv_s_8_2=null;
        Token otherlv_9=null;
        Token lv_a_10_1=null;
        Token lv_a_10_2=null;
        Token lv_a_10_3=null;
        Token lv_a_10_4=null;


        	enterRule();

        try {
            // InternalTASKDSL.g:525:2: ( (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= 'NeighborNo:' ( (lv_nNo_6_0= RULE_INT ) ) otherlv_7= 'Status:' ( ( (lv_s_8_1= 'Live' | lv_s_8_2= 'Dead' ) ) ) otherlv_9= 'NextGeneration:' ( ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) ) ) ) )
            // InternalTASKDSL.g:526:2: (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= 'NeighborNo:' ( (lv_nNo_6_0= RULE_INT ) ) otherlv_7= 'Status:' ( ( (lv_s_8_1= 'Live' | lv_s_8_2= 'Dead' ) ) ) otherlv_9= 'NextGeneration:' ( ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) ) ) )
            {
            // InternalTASKDSL.g:526:2: (otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= 'NeighborNo:' ( (lv_nNo_6_0= RULE_INT ) ) otherlv_7= 'Status:' ( ( (lv_s_8_1= 'Live' | lv_s_8_2= 'Dead' ) ) ) otherlv_9= 'NextGeneration:' ( ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) ) ) )
            // InternalTASKDSL.g:527:3: otherlv_0= 'CoordinateInfo:' otherlv_1= 'x:' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= 'y:' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= 'NeighborNo:' ( (lv_nNo_6_0= RULE_INT ) ) otherlv_7= 'Status:' ( ( (lv_s_8_1= 'Live' | lv_s_8_2= 'Dead' ) ) ) otherlv_9= 'NextGeneration:' ( ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getCoordinateInfoKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getCellAccess().getXKeyword_1());
            		
            // InternalTASKDSL.g:535:3: ( (lv_x_2_0= RULE_INT ) )
            // InternalTASKDSL.g:536:4: (lv_x_2_0= RULE_INT )
            {
            // InternalTASKDSL.g:536:4: (lv_x_2_0= RULE_INT )
            // InternalTASKDSL.g:537:5: lv_x_2_0= RULE_INT
            {
            lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_x_2_0, grammarAccess.getCellAccess().getXINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getCellAccess().getYKeyword_3());
            		
            // InternalTASKDSL.g:557:3: ( (lv_y_4_0= RULE_INT ) )
            // InternalTASKDSL.g:558:4: (lv_y_4_0= RULE_INT )
            {
            // InternalTASKDSL.g:558:4: (lv_y_4_0= RULE_INT )
            // InternalTASKDSL.g:559:5: lv_y_4_0= RULE_INT
            {
            lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_y_4_0, grammarAccess.getCellAccess().getYINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getCellAccess().getNeighborNoKeyword_5());
            		
            // InternalTASKDSL.g:579:3: ( (lv_nNo_6_0= RULE_INT ) )
            // InternalTASKDSL.g:580:4: (lv_nNo_6_0= RULE_INT )
            {
            // InternalTASKDSL.g:580:4: (lv_nNo_6_0= RULE_INT )
            // InternalTASKDSL.g:581:5: lv_nNo_6_0= RULE_INT
            {
            lv_nNo_6_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_nNo_6_0, grammarAccess.getCellAccess().getNNoINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nNo",
            						lv_nNo_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getCellAccess().getStatusKeyword_7());
            		
            // InternalTASKDSL.g:601:3: ( ( (lv_s_8_1= 'Live' | lv_s_8_2= 'Dead' ) ) )
            // InternalTASKDSL.g:602:4: ( (lv_s_8_1= 'Live' | lv_s_8_2= 'Dead' ) )
            {
            // InternalTASKDSL.g:602:4: ( (lv_s_8_1= 'Live' | lv_s_8_2= 'Dead' ) )
            // InternalTASKDSL.g:603:5: (lv_s_8_1= 'Live' | lv_s_8_2= 'Dead' )
            {
            // InternalTASKDSL.g:603:5: (lv_s_8_1= 'Live' | lv_s_8_2= 'Dead' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            else if ( (LA6_0==32) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTASKDSL.g:604:6: lv_s_8_1= 'Live'
                    {
                    lv_s_8_1=(Token)match(input,26,FOLLOW_19); 

                    						newLeafNode(lv_s_8_1, grammarAccess.getCellAccess().getSLiveKeyword_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellRule());
                    						}
                    						setWithLastConsumed(current, "s", lv_s_8_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:615:6: lv_s_8_2= 'Dead'
                    {
                    lv_s_8_2=(Token)match(input,32,FOLLOW_19); 

                    						newLeafNode(lv_s_8_2, grammarAccess.getCellAccess().getSDeadKeyword_8_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellRule());
                    						}
                    						setWithLastConsumed(current, "s", lv_s_8_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_9=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_9, grammarAccess.getCellAccess().getNextGenerationKeyword_9());
            		
            // InternalTASKDSL.g:632:3: ( ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) ) )
            // InternalTASKDSL.g:633:4: ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) )
            {
            // InternalTASKDSL.g:633:4: ( (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' ) )
            // InternalTASKDSL.g:634:5: (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' )
            {
            // InternalTASKDSL.g:634:5: (lv_a_10_1= 'Birth' | lv_a_10_2= 'OverCrowd' | lv_a_10_3= 'xisolate' | lv_a_10_4= 'Survive' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt7=1;
                }
                break;
            case 29:
                {
                alt7=2;
                }
                break;
            case 30:
                {
                alt7=3;
                }
                break;
            case 31:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTASKDSL.g:635:6: lv_a_10_1= 'Birth'
                    {
                    lv_a_10_1=(Token)match(input,28,FOLLOW_2); 

                    						newLeafNode(lv_a_10_1, grammarAccess.getCellAccess().getABirthKeyword_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellRule());
                    						}
                    						setWithLastConsumed(current, "a", lv_a_10_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:646:6: lv_a_10_2= 'OverCrowd'
                    {
                    lv_a_10_2=(Token)match(input,29,FOLLOW_2); 

                    						newLeafNode(lv_a_10_2, grammarAccess.getCellAccess().getAOverCrowdKeyword_10_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellRule());
                    						}
                    						setWithLastConsumed(current, "a", lv_a_10_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTASKDSL.g:657:6: lv_a_10_3= 'xisolate'
                    {
                    lv_a_10_3=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_a_10_3, grammarAccess.getCellAccess().getAXisolateKeyword_10_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellRule());
                    						}
                    						setWithLastConsumed(current, "a", lv_a_10_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalTASKDSL.g:668:6: lv_a_10_4= 'Survive'
                    {
                    lv_a_10_4=(Token)match(input,31,FOLLOW_2); 

                    						newLeafNode(lv_a_10_4, grammarAccess.getCellAccess().getASurviveKeyword_10_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellRule());
                    						}
                    						setWithLastConsumed(current, "a", lv_a_10_4, null);
                    					

                    }
                    break;

            }


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
    // InternalTASKDSL.g:685:1: entryRuleevolutionRules returns [EObject current=null] : iv_ruleevolutionRules= ruleevolutionRules EOF ;
    public final EObject entryRuleevolutionRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleevolutionRules = null;


        try {
            // InternalTASKDSL.g:685:55: (iv_ruleevolutionRules= ruleevolutionRules EOF )
            // InternalTASKDSL.g:686:2: iv_ruleevolutionRules= ruleevolutionRules EOF
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
    // InternalTASKDSL.g:692:1: ruleevolutionRules returns [EObject current=null] : (otherlv_0= 'if' ( (lv_bool_1_0= ruleExpression ) ) otherlv_2= 'then' (otherlv_3= 'Birth' | otherlv_4= 'OverCrowd' | otherlv_5= 'xisolate' | otherlv_6= 'Survive' ) ) ;
    public final EObject ruleevolutionRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_bool_1_0 = null;



        	enterRule();

        try {
            // InternalTASKDSL.g:698:2: ( (otherlv_0= 'if' ( (lv_bool_1_0= ruleExpression ) ) otherlv_2= 'then' (otherlv_3= 'Birth' | otherlv_4= 'OverCrowd' | otherlv_5= 'xisolate' | otherlv_6= 'Survive' ) ) )
            // InternalTASKDSL.g:699:2: (otherlv_0= 'if' ( (lv_bool_1_0= ruleExpression ) ) otherlv_2= 'then' (otherlv_3= 'Birth' | otherlv_4= 'OverCrowd' | otherlv_5= 'xisolate' | otherlv_6= 'Survive' ) )
            {
            // InternalTASKDSL.g:699:2: (otherlv_0= 'if' ( (lv_bool_1_0= ruleExpression ) ) otherlv_2= 'then' (otherlv_3= 'Birth' | otherlv_4= 'OverCrowd' | otherlv_5= 'xisolate' | otherlv_6= 'Survive' ) )
            // InternalTASKDSL.g:700:3: otherlv_0= 'if' ( (lv_bool_1_0= ruleExpression ) ) otherlv_2= 'then' (otherlv_3= 'Birth' | otherlv_4= 'OverCrowd' | otherlv_5= 'xisolate' | otherlv_6= 'Survive' )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getEvolutionRulesAccess().getIfKeyword_0());
            		
            // InternalTASKDSL.g:704:3: ( (lv_bool_1_0= ruleExpression ) )
            // InternalTASKDSL.g:705:4: (lv_bool_1_0= ruleExpression )
            {
            // InternalTASKDSL.g:705:4: (lv_bool_1_0= ruleExpression )
            // InternalTASKDSL.g:706:5: lv_bool_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEvolutionRulesAccess().getBoolExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_bool_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvolutionRulesRule());
            					}
            					set(
            						current,
            						"bool",
            						lv_bool_1_0,
            						"game.of.life.tasks.TASKDSL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getEvolutionRulesAccess().getThenKeyword_2());
            		
            // InternalTASKDSL.g:727:3: (otherlv_3= 'Birth' | otherlv_4= 'OverCrowd' | otherlv_5= 'xisolate' | otherlv_6= 'Survive' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 30:
                {
                alt8=3;
                }
                break;
            case 31:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalTASKDSL.g:728:4: otherlv_3= 'Birth'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvolutionRulesAccess().getBirthKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:733:4: otherlv_4= 'OverCrowd'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvolutionRulesAccess().getOverCrowdKeyword_3_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalTASKDSL.g:738:4: otherlv_5= 'xisolate'
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getEvolutionRulesAccess().getXisolateKeyword_3_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalTASKDSL.g:743:4: otherlv_6= 'Survive'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEvolutionRulesAccess().getSurviveKeyword_3_3());
                    			

                    }
                    break;

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


    // $ANTLR start "entryRuleExpression"
    // InternalTASKDSL.g:752:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalTASKDSL.g:752:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalTASKDSL.g:753:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTASKDSL.g:759:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalTASKDSL.g:765:2: (this_OrExpression_0= ruleOrExpression )
            // InternalTASKDSL.g:766:2: this_OrExpression_0= ruleOrExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            		current = this_OrExpression_0;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalTASKDSL.g:777:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalTASKDSL.g:777:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalTASKDSL.g:778:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalTASKDSL.g:784:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTASKDSL.g:790:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalTASKDSL.g:791:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalTASKDSL.g:791:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalTASKDSL.g:792:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTASKDSL.g:800:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTASKDSL.g:801:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalTASKDSL.g:801:4: ()
            	    // InternalTASKDSL.g:802:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_22); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVertCalLNeVertCalLNeKeyword_1_1());
            	    			
            	    // InternalTASKDSL.g:812:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalTASKDSL.g:813:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalTASKDSL.g:813:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalTASKDSL.g:814:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"game.of.life.tasks.TASKDSL.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalTASKDSL.g:836:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalTASKDSL.g:836:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalTASKDSL.g:837:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalTASKDSL.g:843:1: ruleAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTASKDSL.g:849:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalTASKDSL.g:850:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalTASKDSL.g:850:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalTASKDSL.g:851:3: this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;


            			current = this_ComparisonExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTASKDSL.g:859:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTASKDSL.g:860:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalTASKDSL.g:860:4: ()
            	    // InternalTASKDSL.g:861:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_22); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalTASKDSL.g:871:4: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalTASKDSL.g:872:5: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalTASKDSL.g:872:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalTASKDSL.g:873:6: lv_right_3_0= ruleComparisonExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleComparisonExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"game.of.life.tasks.TASKDSL.ComparisonExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalTASKDSL.g:895:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalTASKDSL.g:895:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalTASKDSL.g:896:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalTASKDSL.g:902:1: ruleComparisonExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        Token lv_operator_2_5=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTASKDSL.g:908:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalTASKDSL.g:909:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalTASKDSL.g:909:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalTASKDSL.g:910:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTASKDSL.g:918:3: ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=37 && LA12_0<=41)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTASKDSL.g:919:4: () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalTASKDSL.g:919:4: ()
            	    // InternalTASKDSL.g:920:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTASKDSL.g:926:4: ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) )
            	    // InternalTASKDSL.g:927:5: ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) )
            	    {
            	    // InternalTASKDSL.g:927:5: ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) )
            	    // InternalTASKDSL.g:928:6: (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' )
            	    {
            	    // InternalTASKDSL.g:928:6: (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' )
            	    int alt11=5;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt11=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // InternalTASKDSL.g:929:7: lv_operator_2_1= '<'
            	            {
            	            lv_operator_2_1=(Token)match(input,37,FOLLOW_22); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSGnKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTASKDSL.g:940:7: lv_operator_2_2= '<='
            	            {
            	            lv_operator_2_2=(Token)match(input,38,FOLLOW_22); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSGnEqualsSGnKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalTASKDSL.g:951:7: lv_operator_2_3= '=='
            	            {
            	            lv_operator_2_3=(Token)match(input,39,FOLLOW_22); 

            	            							newLeafNode(lv_operator_2_3, grammarAccess.getComparisonExpressionAccess().getOperatorEqualsSGnEqualsSGnKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalTASKDSL.g:962:7: lv_operator_2_4= '>='
            	            {
            	            lv_operator_2_4=(Token)match(input,40,FOLLOW_22); 

            	            							newLeafNode(lv_operator_2_4, grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSGnEqualsSGnKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalTASKDSL.g:973:7: lv_operator_2_5= '>'
            	            {
            	            lv_operator_2_5=(Token)match(input,41,FOLLOW_22); 

            	            							newLeafNode(lv_operator_2_5, grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSGnKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_5, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalTASKDSL.g:986:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalTASKDSL.g:987:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalTASKDSL.g:987:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalTASKDSL.g:988:6: lv_right_3_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"game.of.life.tasks.TASKDSL.PrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalTASKDSL.g:1010:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalTASKDSL.g:1010:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalTASKDSL.g:1011:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalTASKDSL.g:1017:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_Literal_3 = null;



        	enterRule();

        try {
            // InternalTASKDSL.g:1023:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral ) )
            // InternalTASKDSL.g:1024:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral )
            {
            // InternalTASKDSL.g:1024:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_STRING)||(LA13_0>=44 && LA13_0<=45)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalTASKDSL.g:1025:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalTASKDSL.g:1025:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalTASKDSL.g:1026:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesSKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_27);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRGhtParenthesSKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:1044:3: this_Literal_3= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_3=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalTASKDSL.g:1056:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalTASKDSL.g:1056:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalTASKDSL.g:1057:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalTASKDSL.g:1063:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= 'true' ) ) ) | otherlv_2= 'false' | this_INT_3= RULE_INT | this_STRING_4= RULE_STRING ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token this_INT_3=null;
        Token this_STRING_4=null;


        	enterRule();

        try {
            // InternalTASKDSL.g:1069:2: ( ( ( () ( (lv_value_1_0= 'true' ) ) ) | otherlv_2= 'false' | this_INT_3= RULE_INT | this_STRING_4= RULE_STRING ) )
            // InternalTASKDSL.g:1070:2: ( ( () ( (lv_value_1_0= 'true' ) ) ) | otherlv_2= 'false' | this_INT_3= RULE_INT | this_STRING_4= RULE_STRING )
            {
            // InternalTASKDSL.g:1070:2: ( ( () ( (lv_value_1_0= 'true' ) ) ) | otherlv_2= 'false' | this_INT_3= RULE_INT | this_STRING_4= RULE_STRING )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt14=1;
                }
                break;
            case 45:
                {
                alt14=2;
                }
                break;
            case RULE_INT:
                {
                alt14=3;
                }
                break;
            case RULE_STRING:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalTASKDSL.g:1071:3: ( () ( (lv_value_1_0= 'true' ) ) )
                    {
                    // InternalTASKDSL.g:1071:3: ( () ( (lv_value_1_0= 'true' ) ) )
                    // InternalTASKDSL.g:1072:4: () ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalTASKDSL.g:1072:4: ()
                    // InternalTASKDSL.g:1073:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalTASKDSL.g:1079:4: ( (lv_value_1_0= 'true' ) )
                    // InternalTASKDSL.g:1080:5: (lv_value_1_0= 'true' )
                    {
                    // InternalTASKDSL.g:1080:5: (lv_value_1_0= 'true' )
                    // InternalTASKDSL.g:1081:6: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_0, "true");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:1095:3: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_2); 

                    			newLeafNode(otherlv_2, grammarAccess.getLiteralAccess().getFalseKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTASKDSL.g:1100:3: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(this_INT_3, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTASKDSL.g:1105:3: this_STRING_4= RULE_STRING
                    {
                    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_4, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_3());
                    		

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
    // $ANTLR end "ruleLiteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000340000000060L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000003E000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000000L});

}