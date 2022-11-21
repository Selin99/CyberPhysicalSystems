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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game:'", "'Height:'", "'Length:'", "'GameStatus:'", "'InitiallyActiveCell:'", "'x-Coord:'", "'y-Coord:'", "'Birth'", "'Overcrowding'", "'Xisolation'", "'Survival'", "'Cell:'", "'x-Coordinate:'", "'y-Coordinate:'", "'neighborNo:'", "'status:'", "'availableAction:'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
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
    // InternalTASKDSL.g:96:1: ruleGame returns [EObject current=null] : (otherlv_0= 'Game:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_gameStatus_2_0= ruleGameStatus ) ) ( (lv_gridSize_3_0= ruleGridSize ) ) ( ( (lv_startGrid_4_0= ruleStartGrid ) ) | ( (lv_allCells_5_0= ruleCell ) ) )* ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_gameStatus_2_0 = null;

        EObject lv_gridSize_3_0 = null;

        EObject lv_startGrid_4_0 = null;

        EObject lv_allCells_5_0 = null;



        	enterRule();

        try {
            // InternalTASKDSL.g:102:2: ( (otherlv_0= 'Game:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_gameStatus_2_0= ruleGameStatus ) ) ( (lv_gridSize_3_0= ruleGridSize ) ) ( ( (lv_startGrid_4_0= ruleStartGrid ) ) | ( (lv_allCells_5_0= ruleCell ) ) )* ) )
            // InternalTASKDSL.g:103:2: (otherlv_0= 'Game:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_gameStatus_2_0= ruleGameStatus ) ) ( (lv_gridSize_3_0= ruleGridSize ) ) ( ( (lv_startGrid_4_0= ruleStartGrid ) ) | ( (lv_allCells_5_0= ruleCell ) ) )* )
            {
            // InternalTASKDSL.g:103:2: (otherlv_0= 'Game:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_gameStatus_2_0= ruleGameStatus ) ) ( (lv_gridSize_3_0= ruleGridSize ) ) ( ( (lv_startGrid_4_0= ruleStartGrid ) ) | ( (lv_allCells_5_0= ruleCell ) ) )* )
            // InternalTASKDSL.g:104:3: otherlv_0= 'Game:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_gameStatus_2_0= ruleGameStatus ) ) ( (lv_gridSize_3_0= ruleGridSize ) ) ( ( (lv_startGrid_4_0= ruleStartGrid ) ) | ( (lv_allCells_5_0= ruleCell ) ) )*
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

            // InternalTASKDSL.g:126:3: ( (lv_gameStatus_2_0= ruleGameStatus ) )
            // InternalTASKDSL.g:127:4: (lv_gameStatus_2_0= ruleGameStatus )
            {
            // InternalTASKDSL.g:127:4: (lv_gameStatus_2_0= ruleGameStatus )
            // InternalTASKDSL.g:128:5: lv_gameStatus_2_0= ruleGameStatus
            {

            					newCompositeNode(grammarAccess.getGameAccess().getGameStatusGameStatusParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_gameStatus_2_0=ruleGameStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					add(
            						current,
            						"gameStatus",
            						lv_gameStatus_2_0,
            						"game.of.life.tasks.TASKDSL.GameStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTASKDSL.g:145:3: ( (lv_gridSize_3_0= ruleGridSize ) )
            // InternalTASKDSL.g:146:4: (lv_gridSize_3_0= ruleGridSize )
            {
            // InternalTASKDSL.g:146:4: (lv_gridSize_3_0= ruleGridSize )
            // InternalTASKDSL.g:147:5: lv_gridSize_3_0= ruleGridSize
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

            // InternalTASKDSL.g:164:3: ( ( (lv_startGrid_4_0= ruleStartGrid ) ) | ( (lv_allCells_5_0= ruleCell ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }
                else if ( (LA1_0==22) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTASKDSL.g:165:4: ( (lv_startGrid_4_0= ruleStartGrid ) )
            	    {
            	    // InternalTASKDSL.g:165:4: ( (lv_startGrid_4_0= ruleStartGrid ) )
            	    // InternalTASKDSL.g:166:5: (lv_startGrid_4_0= ruleStartGrid )
            	    {
            	    // InternalTASKDSL.g:166:5: (lv_startGrid_4_0= ruleStartGrid )
            	    // InternalTASKDSL.g:167:6: lv_startGrid_4_0= ruleStartGrid
            	    {

            	    						newCompositeNode(grammarAccess.getGameAccess().getStartGridStartGridParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_startGrid_4_0=ruleStartGrid();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGameRule());
            	    						}
            	    						add(
            	    							current,
            	    							"startGrid",
            	    							lv_startGrid_4_0,
            	    							"game.of.life.tasks.TASKDSL.StartGrid");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTASKDSL.g:185:4: ( (lv_allCells_5_0= ruleCell ) )
            	    {
            	    // InternalTASKDSL.g:185:4: ( (lv_allCells_5_0= ruleCell ) )
            	    // InternalTASKDSL.g:186:5: (lv_allCells_5_0= ruleCell )
            	    {
            	    // InternalTASKDSL.g:186:5: (lv_allCells_5_0= ruleCell )
            	    // InternalTASKDSL.g:187:6: lv_allCells_5_0= ruleCell
            	    {

            	    						newCompositeNode(grammarAccess.getGameAccess().getAllCellsCellParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_allCells_5_0=ruleCell();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGameRule());
            	    						}
            	    						add(
            	    							current,
            	    							"allCells",
            	    							lv_allCells_5_0,
            	    							"game.of.life.tasks.TASKDSL.Cell");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalTASKDSL.g:209:1: entryRuleGridSize returns [EObject current=null] : iv_ruleGridSize= ruleGridSize EOF ;
    public final EObject entryRuleGridSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGridSize = null;


        try {
            // InternalTASKDSL.g:209:49: (iv_ruleGridSize= ruleGridSize EOF )
            // InternalTASKDSL.g:210:2: iv_ruleGridSize= ruleGridSize EOF
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
    // InternalTASKDSL.g:216:1: ruleGridSize returns [EObject current=null] : (otherlv_0= 'Height:' ( (lv_h_1_0= RULE_INT ) ) otherlv_2= 'Length:' ( (lv_l_3_0= RULE_INT ) ) ) ;
    public final EObject ruleGridSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_h_1_0=null;
        Token otherlv_2=null;
        Token lv_l_3_0=null;


        	enterRule();

        try {
            // InternalTASKDSL.g:222:2: ( (otherlv_0= 'Height:' ( (lv_h_1_0= RULE_INT ) ) otherlv_2= 'Length:' ( (lv_l_3_0= RULE_INT ) ) ) )
            // InternalTASKDSL.g:223:2: (otherlv_0= 'Height:' ( (lv_h_1_0= RULE_INT ) ) otherlv_2= 'Length:' ( (lv_l_3_0= RULE_INT ) ) )
            {
            // InternalTASKDSL.g:223:2: (otherlv_0= 'Height:' ( (lv_h_1_0= RULE_INT ) ) otherlv_2= 'Length:' ( (lv_l_3_0= RULE_INT ) ) )
            // InternalTASKDSL.g:224:3: otherlv_0= 'Height:' ( (lv_h_1_0= RULE_INT ) ) otherlv_2= 'Length:' ( (lv_l_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGridSizeAccess().getHeightKeyword_0());
            		
            // InternalTASKDSL.g:228:3: ( (lv_h_1_0= RULE_INT ) )
            // InternalTASKDSL.g:229:4: (lv_h_1_0= RULE_INT )
            {
            // InternalTASKDSL.g:229:4: (lv_h_1_0= RULE_INT )
            // InternalTASKDSL.g:230:5: lv_h_1_0= RULE_INT
            {
            lv_h_1_0=(Token)match(input,RULE_INT,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getGridSizeAccess().getLengthKeyword_2());
            		
            // InternalTASKDSL.g:250:3: ( (lv_l_3_0= RULE_INT ) )
            // InternalTASKDSL.g:251:4: (lv_l_3_0= RULE_INT )
            {
            // InternalTASKDSL.g:251:4: (lv_l_3_0= RULE_INT )
            // InternalTASKDSL.g:252:5: lv_l_3_0= RULE_INT
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
    // InternalTASKDSL.g:272:1: entryRuleGameStatus returns [EObject current=null] : iv_ruleGameStatus= ruleGameStatus EOF ;
    public final EObject entryRuleGameStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameStatus = null;


        try {
            // InternalTASKDSL.g:272:51: (iv_ruleGameStatus= ruleGameStatus EOF )
            // InternalTASKDSL.g:273:2: iv_ruleGameStatus= ruleGameStatus EOF
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
    // InternalTASKDSL.g:279:1: ruleGameStatus returns [EObject current=null] : (otherlv_0= 'GameStatus:' ( (lv_gs_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGameStatus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_gs_1_0=null;


        	enterRule();

        try {
            // InternalTASKDSL.g:285:2: ( (otherlv_0= 'GameStatus:' ( (lv_gs_1_0= RULE_INT ) ) ) )
            // InternalTASKDSL.g:286:2: (otherlv_0= 'GameStatus:' ( (lv_gs_1_0= RULE_INT ) ) )
            {
            // InternalTASKDSL.g:286:2: (otherlv_0= 'GameStatus:' ( (lv_gs_1_0= RULE_INT ) ) )
            // InternalTASKDSL.g:287:3: otherlv_0= 'GameStatus:' ( (lv_gs_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGameStatusAccess().getGameStatusKeyword_0());
            		
            // InternalTASKDSL.g:291:3: ( (lv_gs_1_0= RULE_INT ) )
            // InternalTASKDSL.g:292:4: (lv_gs_1_0= RULE_INT )
            {
            // InternalTASKDSL.g:292:4: (lv_gs_1_0= RULE_INT )
            // InternalTASKDSL.g:293:5: lv_gs_1_0= RULE_INT
            {
            lv_gs_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_gs_1_0, grammarAccess.getGameStatusAccess().getGsINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameStatusRule());
            					}
            					setWithLastConsumed(
            						current,
            						"gs",
            						lv_gs_1_0,
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
    // $ANTLR end "ruleGameStatus"


    // $ANTLR start "entryRuleStartGrid"
    // InternalTASKDSL.g:313:1: entryRuleStartGrid returns [EObject current=null] : iv_ruleStartGrid= ruleStartGrid EOF ;
    public final EObject entryRuleStartGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartGrid = null;


        try {
            // InternalTASKDSL.g:313:50: (iv_ruleStartGrid= ruleStartGrid EOF )
            // InternalTASKDSL.g:314:2: iv_ruleStartGrid= ruleStartGrid EOF
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
    // InternalTASKDSL.g:320:1: ruleStartGrid returns [EObject current=null] : (otherlv_0= 'InitiallyActiveCell:' otherlv_1= 'x-Coord:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y-Coord:' ( (lv_yC_4_0= RULE_INT ) ) ) ;
    public final EObject ruleStartGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_xC_2_0=null;
        Token otherlv_3=null;
        Token lv_yC_4_0=null;


        	enterRule();

        try {
            // InternalTASKDSL.g:326:2: ( (otherlv_0= 'InitiallyActiveCell:' otherlv_1= 'x-Coord:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y-Coord:' ( (lv_yC_4_0= RULE_INT ) ) ) )
            // InternalTASKDSL.g:327:2: (otherlv_0= 'InitiallyActiveCell:' otherlv_1= 'x-Coord:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y-Coord:' ( (lv_yC_4_0= RULE_INT ) ) )
            {
            // InternalTASKDSL.g:327:2: (otherlv_0= 'InitiallyActiveCell:' otherlv_1= 'x-Coord:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y-Coord:' ( (lv_yC_4_0= RULE_INT ) ) )
            // InternalTASKDSL.g:328:3: otherlv_0= 'InitiallyActiveCell:' otherlv_1= 'x-Coord:' ( (lv_xC_2_0= RULE_INT ) ) otherlv_3= 'y-Coord:' ( (lv_yC_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getStartGridAccess().getInitiallyActiveCellKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getStartGridAccess().getXCoordKeyword_1());
            		
            // InternalTASKDSL.g:336:3: ( (lv_xC_2_0= RULE_INT ) )
            // InternalTASKDSL.g:337:4: (lv_xC_2_0= RULE_INT )
            {
            // InternalTASKDSL.g:337:4: (lv_xC_2_0= RULE_INT )
            // InternalTASKDSL.g:338:5: lv_xC_2_0= RULE_INT
            {
            lv_xC_2_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            otherlv_3=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getStartGridAccess().getYCoordKeyword_3());
            		
            // InternalTASKDSL.g:358:3: ( (lv_yC_4_0= RULE_INT ) )
            // InternalTASKDSL.g:359:4: (lv_yC_4_0= RULE_INT )
            {
            // InternalTASKDSL.g:359:4: (lv_yC_4_0= RULE_INT )
            // InternalTASKDSL.g:360:5: lv_yC_4_0= RULE_INT
            {
            lv_yC_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

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


    // $ANTLR start "entryRuleavAction"
    // InternalTASKDSL.g:380:1: entryRuleavAction returns [EObject current=null] : iv_ruleavAction= ruleavAction EOF ;
    public final EObject entryRuleavAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleavAction = null;


        try {
            // InternalTASKDSL.g:380:49: (iv_ruleavAction= ruleavAction EOF )
            // InternalTASKDSL.g:381:2: iv_ruleavAction= ruleavAction EOF
            {
             newCompositeNode(grammarAccess.getAvActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleavAction=ruleavAction();

            state._fsp--;

             current =iv_ruleavAction; 
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
    // $ANTLR end "entryRuleavAction"


    // $ANTLR start "ruleavAction"
    // InternalTASKDSL.g:387:1: ruleavAction returns [EObject current=null] : ( (otherlv_0= 'Birth' ( (lv_birth_1_0= RULE_INT ) ) ) | (otherlv_2= 'Overcrowding' ( (lv_overcrowd_3_0= RULE_INT ) ) ) | (otherlv_4= 'Xisolation' ( (lv_xiso_5_0= RULE_INT ) ) ) | (otherlv_6= 'Survival' ( (lv_sur_7_0= RULE_INT ) ) ) ) ;
    public final EObject ruleavAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_birth_1_0=null;
        Token otherlv_2=null;
        Token lv_overcrowd_3_0=null;
        Token otherlv_4=null;
        Token lv_xiso_5_0=null;
        Token otherlv_6=null;
        Token lv_sur_7_0=null;


        	enterRule();

        try {
            // InternalTASKDSL.g:393:2: ( ( (otherlv_0= 'Birth' ( (lv_birth_1_0= RULE_INT ) ) ) | (otherlv_2= 'Overcrowding' ( (lv_overcrowd_3_0= RULE_INT ) ) ) | (otherlv_4= 'Xisolation' ( (lv_xiso_5_0= RULE_INT ) ) ) | (otherlv_6= 'Survival' ( (lv_sur_7_0= RULE_INT ) ) ) ) )
            // InternalTASKDSL.g:394:2: ( (otherlv_0= 'Birth' ( (lv_birth_1_0= RULE_INT ) ) ) | (otherlv_2= 'Overcrowding' ( (lv_overcrowd_3_0= RULE_INT ) ) ) | (otherlv_4= 'Xisolation' ( (lv_xiso_5_0= RULE_INT ) ) ) | (otherlv_6= 'Survival' ( (lv_sur_7_0= RULE_INT ) ) ) )
            {
            // InternalTASKDSL.g:394:2: ( (otherlv_0= 'Birth' ( (lv_birth_1_0= RULE_INT ) ) ) | (otherlv_2= 'Overcrowding' ( (lv_overcrowd_3_0= RULE_INT ) ) ) | (otherlv_4= 'Xisolation' ( (lv_xiso_5_0= RULE_INT ) ) ) | (otherlv_6= 'Survival' ( (lv_sur_7_0= RULE_INT ) ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTASKDSL.g:395:3: (otherlv_0= 'Birth' ( (lv_birth_1_0= RULE_INT ) ) )
                    {
                    // InternalTASKDSL.g:395:3: (otherlv_0= 'Birth' ( (lv_birth_1_0= RULE_INT ) ) )
                    // InternalTASKDSL.g:396:4: otherlv_0= 'Birth' ( (lv_birth_1_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getAvActionAccess().getBirthKeyword_0_0());
                    			
                    // InternalTASKDSL.g:400:4: ( (lv_birth_1_0= RULE_INT ) )
                    // InternalTASKDSL.g:401:5: (lv_birth_1_0= RULE_INT )
                    {
                    // InternalTASKDSL.g:401:5: (lv_birth_1_0= RULE_INT )
                    // InternalTASKDSL.g:402:6: lv_birth_1_0= RULE_INT
                    {
                    lv_birth_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_birth_1_0, grammarAccess.getAvActionAccess().getBirthINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAvActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"birth",
                    							lv_birth_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:420:3: (otherlv_2= 'Overcrowding' ( (lv_overcrowd_3_0= RULE_INT ) ) )
                    {
                    // InternalTASKDSL.g:420:3: (otherlv_2= 'Overcrowding' ( (lv_overcrowd_3_0= RULE_INT ) ) )
                    // InternalTASKDSL.g:421:4: otherlv_2= 'Overcrowding' ( (lv_overcrowd_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getAvActionAccess().getOvercrowdingKeyword_1_0());
                    			
                    // InternalTASKDSL.g:425:4: ( (lv_overcrowd_3_0= RULE_INT ) )
                    // InternalTASKDSL.g:426:5: (lv_overcrowd_3_0= RULE_INT )
                    {
                    // InternalTASKDSL.g:426:5: (lv_overcrowd_3_0= RULE_INT )
                    // InternalTASKDSL.g:427:6: lv_overcrowd_3_0= RULE_INT
                    {
                    lv_overcrowd_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_overcrowd_3_0, grammarAccess.getAvActionAccess().getOvercrowdINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAvActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"overcrowd",
                    							lv_overcrowd_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTASKDSL.g:445:3: (otherlv_4= 'Xisolation' ( (lv_xiso_5_0= RULE_INT ) ) )
                    {
                    // InternalTASKDSL.g:445:3: (otherlv_4= 'Xisolation' ( (lv_xiso_5_0= RULE_INT ) ) )
                    // InternalTASKDSL.g:446:4: otherlv_4= 'Xisolation' ( (lv_xiso_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getAvActionAccess().getXisolationKeyword_2_0());
                    			
                    // InternalTASKDSL.g:450:4: ( (lv_xiso_5_0= RULE_INT ) )
                    // InternalTASKDSL.g:451:5: (lv_xiso_5_0= RULE_INT )
                    {
                    // InternalTASKDSL.g:451:5: (lv_xiso_5_0= RULE_INT )
                    // InternalTASKDSL.g:452:6: lv_xiso_5_0= RULE_INT
                    {
                    lv_xiso_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_xiso_5_0, grammarAccess.getAvActionAccess().getXisoINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAvActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"xiso",
                    							lv_xiso_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTASKDSL.g:470:3: (otherlv_6= 'Survival' ( (lv_sur_7_0= RULE_INT ) ) )
                    {
                    // InternalTASKDSL.g:470:3: (otherlv_6= 'Survival' ( (lv_sur_7_0= RULE_INT ) ) )
                    // InternalTASKDSL.g:471:4: otherlv_6= 'Survival' ( (lv_sur_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getAvActionAccess().getSurvivalKeyword_3_0());
                    			
                    // InternalTASKDSL.g:475:4: ( (lv_sur_7_0= RULE_INT ) )
                    // InternalTASKDSL.g:476:5: (lv_sur_7_0= RULE_INT )
                    {
                    // InternalTASKDSL.g:476:5: (lv_sur_7_0= RULE_INT )
                    // InternalTASKDSL.g:477:6: lv_sur_7_0= RULE_INT
                    {
                    lv_sur_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_sur_7_0, grammarAccess.getAvActionAccess().getSurINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAvActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sur",
                    							lv_sur_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


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
    // $ANTLR end "ruleavAction"


    // $ANTLR start "entryRuleCell"
    // InternalTASKDSL.g:498:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalTASKDSL.g:498:45: (iv_ruleCell= ruleCell EOF )
            // InternalTASKDSL.g:499:2: iv_ruleCell= ruleCell EOF
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
    // InternalTASKDSL.g:505:1: ruleCell returns [EObject current=null] : (otherlv_0= 'Cell:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'x-Coordinate:' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= 'y-Coordinate:' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= 'neighborNo:' ( (lv_nNo_7_0= RULE_INT ) ) otherlv_8= 'status:' ( (lv_s_9_0= RULE_INT ) ) otherlv_10= 'availableAction:' ( (lv_avAction_11_0= ruleavAction ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_x_3_0=null;
        Token otherlv_4=null;
        Token lv_y_5_0=null;
        Token otherlv_6=null;
        Token lv_nNo_7_0=null;
        Token otherlv_8=null;
        Token lv_s_9_0=null;
        Token otherlv_10=null;
        EObject lv_avAction_11_0 = null;



        	enterRule();

        try {
            // InternalTASKDSL.g:511:2: ( (otherlv_0= 'Cell:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'x-Coordinate:' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= 'y-Coordinate:' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= 'neighborNo:' ( (lv_nNo_7_0= RULE_INT ) ) otherlv_8= 'status:' ( (lv_s_9_0= RULE_INT ) ) otherlv_10= 'availableAction:' ( (lv_avAction_11_0= ruleavAction ) ) ) )
            // InternalTASKDSL.g:512:2: (otherlv_0= 'Cell:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'x-Coordinate:' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= 'y-Coordinate:' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= 'neighborNo:' ( (lv_nNo_7_0= RULE_INT ) ) otherlv_8= 'status:' ( (lv_s_9_0= RULE_INT ) ) otherlv_10= 'availableAction:' ( (lv_avAction_11_0= ruleavAction ) ) )
            {
            // InternalTASKDSL.g:512:2: (otherlv_0= 'Cell:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'x-Coordinate:' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= 'y-Coordinate:' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= 'neighborNo:' ( (lv_nNo_7_0= RULE_INT ) ) otherlv_8= 'status:' ( (lv_s_9_0= RULE_INT ) ) otherlv_10= 'availableAction:' ( (lv_avAction_11_0= ruleavAction ) ) )
            // InternalTASKDSL.g:513:3: otherlv_0= 'Cell:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'x-Coordinate:' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= 'y-Coordinate:' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= 'neighborNo:' ( (lv_nNo_7_0= RULE_INT ) ) otherlv_8= 'status:' ( (lv_s_9_0= RULE_INT ) ) otherlv_10= 'availableAction:' ( (lv_avAction_11_0= ruleavAction ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getCellKeyword_0());
            		
            // InternalTASKDSL.g:517:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTASKDSL.g:518:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTASKDSL.g:518:4: (lv_name_1_0= RULE_ID )
            // InternalTASKDSL.g:519:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCellAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCellAccess().getXCoordinateKeyword_2());
            		
            // InternalTASKDSL.g:539:3: ( (lv_x_3_0= RULE_INT ) )
            // InternalTASKDSL.g:540:4: (lv_x_3_0= RULE_INT )
            {
            // InternalTASKDSL.g:540:4: (lv_x_3_0= RULE_INT )
            // InternalTASKDSL.g:541:5: lv_x_3_0= RULE_INT
            {
            lv_x_3_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_x_3_0, grammarAccess.getCellAccess().getXINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCellAccess().getYCoordinateKeyword_4());
            		
            // InternalTASKDSL.g:561:3: ( (lv_y_5_0= RULE_INT ) )
            // InternalTASKDSL.g:562:4: (lv_y_5_0= RULE_INT )
            {
            // InternalTASKDSL.g:562:4: (lv_y_5_0= RULE_INT )
            // InternalTASKDSL.g:563:5: lv_y_5_0= RULE_INT
            {
            lv_y_5_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_y_5_0, grammarAccess.getCellAccess().getYINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getCellAccess().getNeighborNoKeyword_6());
            		
            // InternalTASKDSL.g:583:3: ( (lv_nNo_7_0= RULE_INT ) )
            // InternalTASKDSL.g:584:4: (lv_nNo_7_0= RULE_INT )
            {
            // InternalTASKDSL.g:584:4: (lv_nNo_7_0= RULE_INT )
            // InternalTASKDSL.g:585:5: lv_nNo_7_0= RULE_INT
            {
            lv_nNo_7_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_nNo_7_0, grammarAccess.getCellAccess().getNNoINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nNo",
            						lv_nNo_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getCellAccess().getStatusKeyword_8());
            		
            // InternalTASKDSL.g:605:3: ( (lv_s_9_0= RULE_INT ) )
            // InternalTASKDSL.g:606:4: (lv_s_9_0= RULE_INT )
            {
            // InternalTASKDSL.g:606:4: (lv_s_9_0= RULE_INT )
            // InternalTASKDSL.g:607:5: lv_s_9_0= RULE_INT
            {
            lv_s_9_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_s_9_0, grammarAccess.getCellAccess().getSINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"s",
            						lv_s_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getCellAccess().getAvailableActionKeyword_10());
            		
            // InternalTASKDSL.g:627:3: ( (lv_avAction_11_0= ruleavAction ) )
            // InternalTASKDSL.g:628:4: (lv_avAction_11_0= ruleavAction )
            {
            // InternalTASKDSL.g:628:4: (lv_avAction_11_0= ruleavAction )
            // InternalTASKDSL.g:629:5: lv_avAction_11_0= ruleavAction
            {

            					newCompositeNode(grammarAccess.getCellAccess().getAvActionAvActionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_2);
            lv_avAction_11_0=ruleavAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellRule());
            					}
            					set(
            						current,
            						"avAction",
            						lv_avAction_11_0,
            						"game.of.life.tasks.TASKDSL.avAction");
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000408002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000003C0000L});

}