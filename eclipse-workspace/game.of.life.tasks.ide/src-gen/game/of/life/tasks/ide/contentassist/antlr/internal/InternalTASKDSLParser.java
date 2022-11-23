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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTASKDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Continue'", "'Over'", "'Birth'", "'OverCrowd'", "'xisolate'", "'Survive'", "'Live'", "'Dead'", "'<'", "'<='", "'=='", "'>='", "'>'", "'false'", "'Game:'", "'GameStatus:'", "'GridSize:'", "'EvolutionRules:'", "'InitiallyActiveCells:'", "'AllCells:'", "'Height:'", "'Length:'", "'CoordinateInfo:'", "'x:'", "'y:'", "'NeighborNo:'", "'Status:'", "'NextGeneration:'", "'if'", "'then'", "'||'", "'&&'", "'('", "')'", "'true'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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



    // $ANTLR start "entryRuleModel"
    // InternalTASKDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalTASKDSL.g:54:1: ( ruleModel EOF )
            // InternalTASKDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTASKDSL.g:62:1: ruleModel : ( ruleGame ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:66:2: ( ( ruleGame ) )
            // InternalTASKDSL.g:67:2: ( ruleGame )
            {
            // InternalTASKDSL.g:67:2: ( ruleGame )
            // InternalTASKDSL.g:68:3: ruleGame
            {
             before(grammarAccess.getModelAccess().getGameParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGameParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGame"
    // InternalTASKDSL.g:78:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalTASKDSL.g:79:1: ( ruleGame EOF )
            // InternalTASKDSL.g:80:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalTASKDSL.g:87:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:91:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalTASKDSL.g:92:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalTASKDSL.g:92:2: ( ( rule__Game__Group__0 ) )
            // InternalTASKDSL.g:93:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalTASKDSL.g:94:3: ( rule__Game__Group__0 )
            // InternalTASKDSL.g:94:4: rule__Game__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleGridSize"
    // InternalTASKDSL.g:103:1: entryRuleGridSize : ruleGridSize EOF ;
    public final void entryRuleGridSize() throws RecognitionException {
        try {
            // InternalTASKDSL.g:104:1: ( ruleGridSize EOF )
            // InternalTASKDSL.g:105:1: ruleGridSize EOF
            {
             before(grammarAccess.getGridSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleGridSize();

            state._fsp--;

             after(grammarAccess.getGridSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGridSize"


    // $ANTLR start "ruleGridSize"
    // InternalTASKDSL.g:112:1: ruleGridSize : ( ( rule__GridSize__Group__0 ) ) ;
    public final void ruleGridSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:116:2: ( ( ( rule__GridSize__Group__0 ) ) )
            // InternalTASKDSL.g:117:2: ( ( rule__GridSize__Group__0 ) )
            {
            // InternalTASKDSL.g:117:2: ( ( rule__GridSize__Group__0 ) )
            // InternalTASKDSL.g:118:3: ( rule__GridSize__Group__0 )
            {
             before(grammarAccess.getGridSizeAccess().getGroup()); 
            // InternalTASKDSL.g:119:3: ( rule__GridSize__Group__0 )
            // InternalTASKDSL.g:119:4: rule__GridSize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GridSize__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGridSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGridSize"


    // $ANTLR start "entryRuleGameStatus"
    // InternalTASKDSL.g:128:1: entryRuleGameStatus : ruleGameStatus EOF ;
    public final void entryRuleGameStatus() throws RecognitionException {
        try {
            // InternalTASKDSL.g:129:1: ( ruleGameStatus EOF )
            // InternalTASKDSL.g:130:1: ruleGameStatus EOF
            {
             before(grammarAccess.getGameStatusRule()); 
            pushFollow(FOLLOW_1);
            ruleGameStatus();

            state._fsp--;

             after(grammarAccess.getGameStatusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGameStatus"


    // $ANTLR start "ruleGameStatus"
    // InternalTASKDSL.g:137:1: ruleGameStatus : ( ( rule__GameStatus__SoAssignment ) ) ;
    public final void ruleGameStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:141:2: ( ( ( rule__GameStatus__SoAssignment ) ) )
            // InternalTASKDSL.g:142:2: ( ( rule__GameStatus__SoAssignment ) )
            {
            // InternalTASKDSL.g:142:2: ( ( rule__GameStatus__SoAssignment ) )
            // InternalTASKDSL.g:143:3: ( rule__GameStatus__SoAssignment )
            {
             before(grammarAccess.getGameStatusAccess().getSoAssignment()); 
            // InternalTASKDSL.g:144:3: ( rule__GameStatus__SoAssignment )
            // InternalTASKDSL.g:144:4: rule__GameStatus__SoAssignment
            {
            pushFollow(FOLLOW_2);
            rule__GameStatus__SoAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGameStatusAccess().getSoAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGameStatus"


    // $ANTLR start "entryRuleStartGrid"
    // InternalTASKDSL.g:153:1: entryRuleStartGrid : ruleStartGrid EOF ;
    public final void entryRuleStartGrid() throws RecognitionException {
        try {
            // InternalTASKDSL.g:154:1: ( ruleStartGrid EOF )
            // InternalTASKDSL.g:155:1: ruleStartGrid EOF
            {
             before(grammarAccess.getStartGridRule()); 
            pushFollow(FOLLOW_1);
            ruleStartGrid();

            state._fsp--;

             after(grammarAccess.getStartGridRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStartGrid"


    // $ANTLR start "ruleStartGrid"
    // InternalTASKDSL.g:162:1: ruleStartGrid : ( ( rule__StartGrid__Group__0 ) ) ;
    public final void ruleStartGrid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:166:2: ( ( ( rule__StartGrid__Group__0 ) ) )
            // InternalTASKDSL.g:167:2: ( ( rule__StartGrid__Group__0 ) )
            {
            // InternalTASKDSL.g:167:2: ( ( rule__StartGrid__Group__0 ) )
            // InternalTASKDSL.g:168:3: ( rule__StartGrid__Group__0 )
            {
             before(grammarAccess.getStartGridAccess().getGroup()); 
            // InternalTASKDSL.g:169:3: ( rule__StartGrid__Group__0 )
            // InternalTASKDSL.g:169:4: rule__StartGrid__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartGrid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartGridAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartGrid"


    // $ANTLR start "entryRuleCell"
    // InternalTASKDSL.g:178:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalTASKDSL.g:179:1: ( ruleCell EOF )
            // InternalTASKDSL.g:180:1: ruleCell EOF
            {
             before(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getCellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalTASKDSL.g:187:1: ruleCell : ( ( rule__Cell__Group__0 ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:191:2: ( ( ( rule__Cell__Group__0 ) ) )
            // InternalTASKDSL.g:192:2: ( ( rule__Cell__Group__0 ) )
            {
            // InternalTASKDSL.g:192:2: ( ( rule__Cell__Group__0 ) )
            // InternalTASKDSL.g:193:3: ( rule__Cell__Group__0 )
            {
             before(grammarAccess.getCellAccess().getGroup()); 
            // InternalTASKDSL.g:194:3: ( rule__Cell__Group__0 )
            // InternalTASKDSL.g:194:4: rule__Cell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleevolutionRules"
    // InternalTASKDSL.g:203:1: entryRuleevolutionRules : ruleevolutionRules EOF ;
    public final void entryRuleevolutionRules() throws RecognitionException {
        try {
            // InternalTASKDSL.g:204:1: ( ruleevolutionRules EOF )
            // InternalTASKDSL.g:205:1: ruleevolutionRules EOF
            {
             before(grammarAccess.getEvolutionRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleevolutionRules();

            state._fsp--;

             after(grammarAccess.getEvolutionRulesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleevolutionRules"


    // $ANTLR start "ruleevolutionRules"
    // InternalTASKDSL.g:212:1: ruleevolutionRules : ( ( rule__EvolutionRules__Group__0 ) ) ;
    public final void ruleevolutionRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:216:2: ( ( ( rule__EvolutionRules__Group__0 ) ) )
            // InternalTASKDSL.g:217:2: ( ( rule__EvolutionRules__Group__0 ) )
            {
            // InternalTASKDSL.g:217:2: ( ( rule__EvolutionRules__Group__0 ) )
            // InternalTASKDSL.g:218:3: ( rule__EvolutionRules__Group__0 )
            {
             before(grammarAccess.getEvolutionRulesAccess().getGroup()); 
            // InternalTASKDSL.g:219:3: ( rule__EvolutionRules__Group__0 )
            // InternalTASKDSL.g:219:4: rule__EvolutionRules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleevolutionRules"


    // $ANTLR start "entryRuleExpression"
    // InternalTASKDSL.g:228:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalTASKDSL.g:229:1: ( ruleExpression EOF )
            // InternalTASKDSL.g:230:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTASKDSL.g:237:1: ruleExpression : ( ruleOrExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:241:2: ( ( ruleOrExpression ) )
            // InternalTASKDSL.g:242:2: ( ruleOrExpression )
            {
            // InternalTASKDSL.g:242:2: ( ruleOrExpression )
            // InternalTASKDSL.g:243:3: ruleOrExpression
            {
             before(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalTASKDSL.g:253:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalTASKDSL.g:254:1: ( ruleOrExpression EOF )
            // InternalTASKDSL.g:255:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalTASKDSL.g:262:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:266:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalTASKDSL.g:267:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalTASKDSL.g:267:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalTASKDSL.g:268:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalTASKDSL.g:269:3: ( rule__OrExpression__Group__0 )
            // InternalTASKDSL.g:269:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalTASKDSL.g:278:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalTASKDSL.g:279:1: ( ruleAndExpression EOF )
            // InternalTASKDSL.g:280:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalTASKDSL.g:287:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:291:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalTASKDSL.g:292:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalTASKDSL.g:292:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalTASKDSL.g:293:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalTASKDSL.g:294:3: ( rule__AndExpression__Group__0 )
            // InternalTASKDSL.g:294:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalTASKDSL.g:303:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalTASKDSL.g:304:1: ( ruleComparisonExpression EOF )
            // InternalTASKDSL.g:305:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalTASKDSL.g:312:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:316:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalTASKDSL.g:317:2: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalTASKDSL.g:317:2: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalTASKDSL.g:318:3: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // InternalTASKDSL.g:319:3: ( rule__ComparisonExpression__Group__0 )
            // InternalTASKDSL.g:319:4: rule__ComparisonExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalTASKDSL.g:328:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalTASKDSL.g:329:1: ( rulePrimaryExpression EOF )
            // InternalTASKDSL.g:330:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalTASKDSL.g:337:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:341:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalTASKDSL.g:342:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalTASKDSL.g:342:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalTASKDSL.g:343:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalTASKDSL.g:344:3: ( rule__PrimaryExpression__Alternatives )
            // InternalTASKDSL.g:344:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalTASKDSL.g:353:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalTASKDSL.g:354:1: ( ruleLiteral EOF )
            // InternalTASKDSL.g:355:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalTASKDSL.g:362:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:366:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalTASKDSL.g:367:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalTASKDSL.g:367:2: ( ( rule__Literal__Alternatives ) )
            // InternalTASKDSL.g:368:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalTASKDSL.g:369:3: ( rule__Literal__Alternatives )
            // InternalTASKDSL.g:369:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "rule__GameStatus__SoAlternatives_0"
    // InternalTASKDSL.g:377:1: rule__GameStatus__SoAlternatives_0 : ( ( 'Continue' ) | ( 'Over' ) );
    public final void rule__GameStatus__SoAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:381:1: ( ( 'Continue' ) | ( 'Over' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTASKDSL.g:382:2: ( 'Continue' )
                    {
                    // InternalTASKDSL.g:382:2: ( 'Continue' )
                    // InternalTASKDSL.g:383:3: 'Continue'
                    {
                     before(grammarAccess.getGameStatusAccess().getSoContinueKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getGameStatusAccess().getSoContinueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:388:2: ( 'Over' )
                    {
                    // InternalTASKDSL.g:388:2: ( 'Over' )
                    // InternalTASKDSL.g:389:3: 'Over'
                    {
                     before(grammarAccess.getGameStatusAccess().getSoOverKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getGameStatusAccess().getSoOverKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStatus__SoAlternatives_0"


    // $ANTLR start "rule__StartGrid__AAlternatives_10_0"
    // InternalTASKDSL.g:398:1: rule__StartGrid__AAlternatives_10_0 : ( ( 'Birth' ) | ( 'OverCrowd' ) | ( 'xisolate' ) | ( 'Survive' ) );
    public final void rule__StartGrid__AAlternatives_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:402:1: ( ( 'Birth' ) | ( 'OverCrowd' ) | ( 'xisolate' ) | ( 'Survive' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
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
                    // InternalTASKDSL.g:403:2: ( 'Birth' )
                    {
                    // InternalTASKDSL.g:403:2: ( 'Birth' )
                    // InternalTASKDSL.g:404:3: 'Birth'
                    {
                     before(grammarAccess.getStartGridAccess().getABirthKeyword_10_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStartGridAccess().getABirthKeyword_10_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:409:2: ( 'OverCrowd' )
                    {
                    // InternalTASKDSL.g:409:2: ( 'OverCrowd' )
                    // InternalTASKDSL.g:410:3: 'OverCrowd'
                    {
                     before(grammarAccess.getStartGridAccess().getAOverCrowdKeyword_10_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStartGridAccess().getAOverCrowdKeyword_10_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTASKDSL.g:415:2: ( 'xisolate' )
                    {
                    // InternalTASKDSL.g:415:2: ( 'xisolate' )
                    // InternalTASKDSL.g:416:3: 'xisolate'
                    {
                     before(grammarAccess.getStartGridAccess().getAXisolateKeyword_10_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getStartGridAccess().getAXisolateKeyword_10_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTASKDSL.g:421:2: ( 'Survive' )
                    {
                    // InternalTASKDSL.g:421:2: ( 'Survive' )
                    // InternalTASKDSL.g:422:3: 'Survive'
                    {
                     before(grammarAccess.getStartGridAccess().getASurviveKeyword_10_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getStartGridAccess().getASurviveKeyword_10_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__AAlternatives_10_0"


    // $ANTLR start "rule__Cell__SAlternatives_8_0"
    // InternalTASKDSL.g:431:1: rule__Cell__SAlternatives_8_0 : ( ( 'Live' ) | ( 'Dead' ) );
    public final void rule__Cell__SAlternatives_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:435:1: ( ( 'Live' ) | ( 'Dead' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTASKDSL.g:436:2: ( 'Live' )
                    {
                    // InternalTASKDSL.g:436:2: ( 'Live' )
                    // InternalTASKDSL.g:437:3: 'Live'
                    {
                     before(grammarAccess.getCellAccess().getSLiveKeyword_8_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCellAccess().getSLiveKeyword_8_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:442:2: ( 'Dead' )
                    {
                    // InternalTASKDSL.g:442:2: ( 'Dead' )
                    // InternalTASKDSL.g:443:3: 'Dead'
                    {
                     before(grammarAccess.getCellAccess().getSDeadKeyword_8_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCellAccess().getSDeadKeyword_8_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__SAlternatives_8_0"


    // $ANTLR start "rule__Cell__AAlternatives_10_0"
    // InternalTASKDSL.g:452:1: rule__Cell__AAlternatives_10_0 : ( ( 'Birth' ) | ( 'OverCrowd' ) | ( 'xisolate' ) | ( 'Survive' ) );
    public final void rule__Cell__AAlternatives_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:456:1: ( ( 'Birth' ) | ( 'OverCrowd' ) | ( 'xisolate' ) | ( 'Survive' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTASKDSL.g:457:2: ( 'Birth' )
                    {
                    // InternalTASKDSL.g:457:2: ( 'Birth' )
                    // InternalTASKDSL.g:458:3: 'Birth'
                    {
                     before(grammarAccess.getCellAccess().getABirthKeyword_10_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getCellAccess().getABirthKeyword_10_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:463:2: ( 'OverCrowd' )
                    {
                    // InternalTASKDSL.g:463:2: ( 'OverCrowd' )
                    // InternalTASKDSL.g:464:3: 'OverCrowd'
                    {
                     before(grammarAccess.getCellAccess().getAOverCrowdKeyword_10_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCellAccess().getAOverCrowdKeyword_10_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTASKDSL.g:469:2: ( 'xisolate' )
                    {
                    // InternalTASKDSL.g:469:2: ( 'xisolate' )
                    // InternalTASKDSL.g:470:3: 'xisolate'
                    {
                     before(grammarAccess.getCellAccess().getAXisolateKeyword_10_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCellAccess().getAXisolateKeyword_10_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTASKDSL.g:475:2: ( 'Survive' )
                    {
                    // InternalTASKDSL.g:475:2: ( 'Survive' )
                    // InternalTASKDSL.g:476:3: 'Survive'
                    {
                     before(grammarAccess.getCellAccess().getASurviveKeyword_10_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCellAccess().getASurviveKeyword_10_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__AAlternatives_10_0"


    // $ANTLR start "rule__EvolutionRules__Alternatives_3"
    // InternalTASKDSL.g:485:1: rule__EvolutionRules__Alternatives_3 : ( ( 'Birth' ) | ( 'OverCrowd' ) | ( 'xisolate' ) | ( 'Survive' ) );
    public final void rule__EvolutionRules__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:489:1: ( ( 'Birth' ) | ( 'OverCrowd' ) | ( 'xisolate' ) | ( 'Survive' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
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
                    // InternalTASKDSL.g:490:2: ( 'Birth' )
                    {
                    // InternalTASKDSL.g:490:2: ( 'Birth' )
                    // InternalTASKDSL.g:491:3: 'Birth'
                    {
                     before(grammarAccess.getEvolutionRulesAccess().getBirthKeyword_3_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEvolutionRulesAccess().getBirthKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:496:2: ( 'OverCrowd' )
                    {
                    // InternalTASKDSL.g:496:2: ( 'OverCrowd' )
                    // InternalTASKDSL.g:497:3: 'OverCrowd'
                    {
                     before(grammarAccess.getEvolutionRulesAccess().getOverCrowdKeyword_3_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEvolutionRulesAccess().getOverCrowdKeyword_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTASKDSL.g:502:2: ( 'xisolate' )
                    {
                    // InternalTASKDSL.g:502:2: ( 'xisolate' )
                    // InternalTASKDSL.g:503:3: 'xisolate'
                    {
                     before(grammarAccess.getEvolutionRulesAccess().getXisolateKeyword_3_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEvolutionRulesAccess().getXisolateKeyword_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTASKDSL.g:508:2: ( 'Survive' )
                    {
                    // InternalTASKDSL.g:508:2: ( 'Survive' )
                    // InternalTASKDSL.g:509:3: 'Survive'
                    {
                     before(grammarAccess.getEvolutionRulesAccess().getSurviveKeyword_3_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEvolutionRulesAccess().getSurviveKeyword_3_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Alternatives_3"


    // $ANTLR start "rule__ComparisonExpression__OperatorAlternatives_1_1_0"
    // InternalTASKDSL.g:518:1: rule__ComparisonExpression__OperatorAlternatives_1_1_0 : ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) );
    public final void rule__ComparisonExpression__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:522:1: ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTASKDSL.g:523:2: ( '<' )
                    {
                    // InternalTASKDSL.g:523:2: ( '<' )
                    // InternalTASKDSL.g:524:3: '<'
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSGnKeyword_1_1_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSGnKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:529:2: ( '<=' )
                    {
                    // InternalTASKDSL.g:529:2: ( '<=' )
                    // InternalTASKDSL.g:530:3: '<='
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSGnEqualsSGnKeyword_1_1_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSGnEqualsSGnKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTASKDSL.g:535:2: ( '==' )
                    {
                    // InternalTASKDSL.g:535:2: ( '==' )
                    // InternalTASKDSL.g:536:3: '=='
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getOperatorEqualsSGnEqualsSGnKeyword_1_1_0_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getComparisonExpressionAccess().getOperatorEqualsSGnEqualsSGnKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTASKDSL.g:541:2: ( '>=' )
                    {
                    // InternalTASKDSL.g:541:2: ( '>=' )
                    // InternalTASKDSL.g:542:3: '>='
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSGnEqualsSGnKeyword_1_1_0_3()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSGnEqualsSGnKeyword_1_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTASKDSL.g:547:2: ( '>' )
                    {
                    // InternalTASKDSL.g:547:2: ( '>' )
                    // InternalTASKDSL.g:548:3: '>'
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSGnKeyword_1_1_0_4()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSGnKeyword_1_1_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalTASKDSL.g:557:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleLiteral ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:561:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleLiteral ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==43) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_STRING)||LA7_0==24||LA7_0==45) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTASKDSL.g:562:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalTASKDSL.g:562:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalTASKDSL.g:563:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalTASKDSL.g:564:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalTASKDSL.g:564:4: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:568:2: ( ruleLiteral )
                    {
                    // InternalTASKDSL.g:568:2: ( ruleLiteral )
                    // InternalTASKDSL.g:569:3: ruleLiteral
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalTASKDSL.g:578:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( 'false' ) | ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:582:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( 'false' ) | ( RULE_INT ) | ( RULE_STRING ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case RULE_INT:
                {
                alt8=3;
                }
                break;
            case RULE_STRING:
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
                    // InternalTASKDSL.g:583:2: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // InternalTASKDSL.g:583:2: ( ( rule__Literal__Group_0__0 ) )
                    // InternalTASKDSL.g:584:3: ( rule__Literal__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    // InternalTASKDSL.g:585:3: ( rule__Literal__Group_0__0 )
                    // InternalTASKDSL.g:585:4: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:589:2: ( 'false' )
                    {
                    // InternalTASKDSL.g:589:2: ( 'false' )
                    // InternalTASKDSL.g:590:3: 'false'
                    {
                     before(grammarAccess.getLiteralAccess().getFalseKeyword_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTASKDSL.g:595:2: ( RULE_INT )
                    {
                    // InternalTASKDSL.g:595:2: ( RULE_INT )
                    // InternalTASKDSL.g:596:3: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTASKDSL.g:601:2: ( RULE_STRING )
                    {
                    // InternalTASKDSL.g:601:2: ( RULE_STRING )
                    // InternalTASKDSL.g:602:3: RULE_STRING
                    {
                     before(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_3()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Game__Group__0"
    // InternalTASKDSL.g:611:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:615:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalTASKDSL.g:616:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0"


    // $ANTLR start "rule__Game__Group__0__Impl"
    // InternalTASKDSL.g:623:1: rule__Game__Group__0__Impl : ( 'Game:' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:627:1: ( ( 'Game:' ) )
            // InternalTASKDSL.g:628:1: ( 'Game:' )
            {
            // InternalTASKDSL.g:628:1: ( 'Game:' )
            // InternalTASKDSL.g:629:2: 'Game:'
            {
             before(grammarAccess.getGameAccess().getGameKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0__Impl"


    // $ANTLR start "rule__Game__Group__1"
    // InternalTASKDSL.g:638:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:642:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalTASKDSL.g:643:2: rule__Game__Group__1__Impl rule__Game__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1"


    // $ANTLR start "rule__Game__Group__1__Impl"
    // InternalTASKDSL.g:650:1: rule__Game__Group__1__Impl : ( ( rule__Game__NameAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:654:1: ( ( ( rule__Game__NameAssignment_1 ) ) )
            // InternalTASKDSL.g:655:1: ( ( rule__Game__NameAssignment_1 ) )
            {
            // InternalTASKDSL.g:655:1: ( ( rule__Game__NameAssignment_1 ) )
            // InternalTASKDSL.g:656:2: ( rule__Game__NameAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getNameAssignment_1()); 
            // InternalTASKDSL.g:657:2: ( rule__Game__NameAssignment_1 )
            // InternalTASKDSL.g:657:3: rule__Game__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1__Impl"


    // $ANTLR start "rule__Game__Group__2"
    // InternalTASKDSL.g:665:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:669:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalTASKDSL.g:670:2: rule__Game__Group__2__Impl rule__Game__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Game__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2"


    // $ANTLR start "rule__Game__Group__2__Impl"
    // InternalTASKDSL.g:677:1: rule__Game__Group__2__Impl : ( 'GameStatus:' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:681:1: ( ( 'GameStatus:' ) )
            // InternalTASKDSL.g:682:1: ( 'GameStatus:' )
            {
            // InternalTASKDSL.g:682:1: ( 'GameStatus:' )
            // InternalTASKDSL.g:683:2: 'GameStatus:'
            {
             before(grammarAccess.getGameAccess().getGameStatusKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getGameStatusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2__Impl"


    // $ANTLR start "rule__Game__Group__3"
    // InternalTASKDSL.g:692:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:696:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalTASKDSL.g:697:2: rule__Game__Group__3__Impl rule__Game__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Game__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3"


    // $ANTLR start "rule__Game__Group__3__Impl"
    // InternalTASKDSL.g:704:1: rule__Game__Group__3__Impl : ( ( rule__Game__GameStatusAssignment_3 ) ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:708:1: ( ( ( rule__Game__GameStatusAssignment_3 ) ) )
            // InternalTASKDSL.g:709:1: ( ( rule__Game__GameStatusAssignment_3 ) )
            {
            // InternalTASKDSL.g:709:1: ( ( rule__Game__GameStatusAssignment_3 ) )
            // InternalTASKDSL.g:710:2: ( rule__Game__GameStatusAssignment_3 )
            {
             before(grammarAccess.getGameAccess().getGameStatusAssignment_3()); 
            // InternalTASKDSL.g:711:2: ( rule__Game__GameStatusAssignment_3 )
            // InternalTASKDSL.g:711:3: rule__Game__GameStatusAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Game__GameStatusAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGameStatusAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3__Impl"


    // $ANTLR start "rule__Game__Group__4"
    // InternalTASKDSL.g:719:1: rule__Game__Group__4 : rule__Game__Group__4__Impl rule__Game__Group__5 ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:723:1: ( rule__Game__Group__4__Impl rule__Game__Group__5 )
            // InternalTASKDSL.g:724:2: rule__Game__Group__4__Impl rule__Game__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Game__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4"


    // $ANTLR start "rule__Game__Group__4__Impl"
    // InternalTASKDSL.g:731:1: rule__Game__Group__4__Impl : ( 'GridSize:' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:735:1: ( ( 'GridSize:' ) )
            // InternalTASKDSL.g:736:1: ( 'GridSize:' )
            {
            // InternalTASKDSL.g:736:1: ( 'GridSize:' )
            // InternalTASKDSL.g:737:2: 'GridSize:'
            {
             before(grammarAccess.getGameAccess().getGridSizeKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getGridSizeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4__Impl"


    // $ANTLR start "rule__Game__Group__5"
    // InternalTASKDSL.g:746:1: rule__Game__Group__5 : rule__Game__Group__5__Impl rule__Game__Group__6 ;
    public final void rule__Game__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:750:1: ( rule__Game__Group__5__Impl rule__Game__Group__6 )
            // InternalTASKDSL.g:751:2: rule__Game__Group__5__Impl rule__Game__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Game__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__5"


    // $ANTLR start "rule__Game__Group__5__Impl"
    // InternalTASKDSL.g:758:1: rule__Game__Group__5__Impl : ( ( rule__Game__GridSizeAssignment_5 ) ) ;
    public final void rule__Game__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:762:1: ( ( ( rule__Game__GridSizeAssignment_5 ) ) )
            // InternalTASKDSL.g:763:1: ( ( rule__Game__GridSizeAssignment_5 ) )
            {
            // InternalTASKDSL.g:763:1: ( ( rule__Game__GridSizeAssignment_5 ) )
            // InternalTASKDSL.g:764:2: ( rule__Game__GridSizeAssignment_5 )
            {
             before(grammarAccess.getGameAccess().getGridSizeAssignment_5()); 
            // InternalTASKDSL.g:765:2: ( rule__Game__GridSizeAssignment_5 )
            // InternalTASKDSL.g:765:3: rule__Game__GridSizeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Game__GridSizeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGridSizeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__5__Impl"


    // $ANTLR start "rule__Game__Group__6"
    // InternalTASKDSL.g:773:1: rule__Game__Group__6 : rule__Game__Group__6__Impl rule__Game__Group__7 ;
    public final void rule__Game__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:777:1: ( rule__Game__Group__6__Impl rule__Game__Group__7 )
            // InternalTASKDSL.g:778:2: rule__Game__Group__6__Impl rule__Game__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Game__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__6"


    // $ANTLR start "rule__Game__Group__6__Impl"
    // InternalTASKDSL.g:785:1: rule__Game__Group__6__Impl : ( 'EvolutionRules:' ) ;
    public final void rule__Game__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:789:1: ( ( 'EvolutionRules:' ) )
            // InternalTASKDSL.g:790:1: ( 'EvolutionRules:' )
            {
            // InternalTASKDSL.g:790:1: ( 'EvolutionRules:' )
            // InternalTASKDSL.g:791:2: 'EvolutionRules:'
            {
             before(grammarAccess.getGameAccess().getEvolutionRulesKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getEvolutionRulesKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__6__Impl"


    // $ANTLR start "rule__Game__Group__7"
    // InternalTASKDSL.g:800:1: rule__Game__Group__7 : rule__Game__Group__7__Impl rule__Game__Group__8 ;
    public final void rule__Game__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:804:1: ( rule__Game__Group__7__Impl rule__Game__Group__8 )
            // InternalTASKDSL.g:805:2: rule__Game__Group__7__Impl rule__Game__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Game__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__7"


    // $ANTLR start "rule__Game__Group__7__Impl"
    // InternalTASKDSL.g:812:1: rule__Game__Group__7__Impl : ( ( rule__Game__EvolutionRulesAssignment_7 )* ) ;
    public final void rule__Game__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:816:1: ( ( ( rule__Game__EvolutionRulesAssignment_7 )* ) )
            // InternalTASKDSL.g:817:1: ( ( rule__Game__EvolutionRulesAssignment_7 )* )
            {
            // InternalTASKDSL.g:817:1: ( ( rule__Game__EvolutionRulesAssignment_7 )* )
            // InternalTASKDSL.g:818:2: ( rule__Game__EvolutionRulesAssignment_7 )*
            {
             before(grammarAccess.getGameAccess().getEvolutionRulesAssignment_7()); 
            // InternalTASKDSL.g:819:2: ( rule__Game__EvolutionRulesAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==39) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTASKDSL.g:819:3: rule__Game__EvolutionRulesAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Game__EvolutionRulesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getEvolutionRulesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__7__Impl"


    // $ANTLR start "rule__Game__Group__8"
    // InternalTASKDSL.g:827:1: rule__Game__Group__8 : rule__Game__Group__8__Impl rule__Game__Group__9 ;
    public final void rule__Game__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:831:1: ( rule__Game__Group__8__Impl rule__Game__Group__9 )
            // InternalTASKDSL.g:832:2: rule__Game__Group__8__Impl rule__Game__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Game__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__8"


    // $ANTLR start "rule__Game__Group__8__Impl"
    // InternalTASKDSL.g:839:1: rule__Game__Group__8__Impl : ( 'InitiallyActiveCells:' ) ;
    public final void rule__Game__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:843:1: ( ( 'InitiallyActiveCells:' ) )
            // InternalTASKDSL.g:844:1: ( 'InitiallyActiveCells:' )
            {
            // InternalTASKDSL.g:844:1: ( 'InitiallyActiveCells:' )
            // InternalTASKDSL.g:845:2: 'InitiallyActiveCells:'
            {
             before(grammarAccess.getGameAccess().getInitiallyActiveCellsKeyword_8()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getInitiallyActiveCellsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__8__Impl"


    // $ANTLR start "rule__Game__Group__9"
    // InternalTASKDSL.g:854:1: rule__Game__Group__9 : rule__Game__Group__9__Impl rule__Game__Group__10 ;
    public final void rule__Game__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:858:1: ( rule__Game__Group__9__Impl rule__Game__Group__10 )
            // InternalTASKDSL.g:859:2: rule__Game__Group__9__Impl rule__Game__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Game__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__9"


    // $ANTLR start "rule__Game__Group__9__Impl"
    // InternalTASKDSL.g:866:1: rule__Game__Group__9__Impl : ( ( rule__Game__StartGridAssignment_9 )* ) ;
    public final void rule__Game__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:870:1: ( ( ( rule__Game__StartGridAssignment_9 )* ) )
            // InternalTASKDSL.g:871:1: ( ( rule__Game__StartGridAssignment_9 )* )
            {
            // InternalTASKDSL.g:871:1: ( ( rule__Game__StartGridAssignment_9 )* )
            // InternalTASKDSL.g:872:2: ( rule__Game__StartGridAssignment_9 )*
            {
             before(grammarAccess.getGameAccess().getStartGridAssignment_9()); 
            // InternalTASKDSL.g:873:2: ( rule__Game__StartGridAssignment_9 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTASKDSL.g:873:3: rule__Game__StartGridAssignment_9
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Game__StartGridAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getStartGridAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__9__Impl"


    // $ANTLR start "rule__Game__Group__10"
    // InternalTASKDSL.g:881:1: rule__Game__Group__10 : rule__Game__Group__10__Impl rule__Game__Group__11 ;
    public final void rule__Game__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:885:1: ( rule__Game__Group__10__Impl rule__Game__Group__11 )
            // InternalTASKDSL.g:886:2: rule__Game__Group__10__Impl rule__Game__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__Game__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__10"


    // $ANTLR start "rule__Game__Group__10__Impl"
    // InternalTASKDSL.g:893:1: rule__Game__Group__10__Impl : ( 'AllCells:' ) ;
    public final void rule__Game__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:897:1: ( ( 'AllCells:' ) )
            // InternalTASKDSL.g:898:1: ( 'AllCells:' )
            {
            // InternalTASKDSL.g:898:1: ( 'AllCells:' )
            // InternalTASKDSL.g:899:2: 'AllCells:'
            {
             before(grammarAccess.getGameAccess().getAllCellsKeyword_10()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getAllCellsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__10__Impl"


    // $ANTLR start "rule__Game__Group__11"
    // InternalTASKDSL.g:908:1: rule__Game__Group__11 : rule__Game__Group__11__Impl ;
    public final void rule__Game__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:912:1: ( rule__Game__Group__11__Impl )
            // InternalTASKDSL.g:913:2: rule__Game__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__11"


    // $ANTLR start "rule__Game__Group__11__Impl"
    // InternalTASKDSL.g:919:1: rule__Game__Group__11__Impl : ( ( rule__Game__AllCellsAssignment_11 )* ) ;
    public final void rule__Game__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:923:1: ( ( ( rule__Game__AllCellsAssignment_11 )* ) )
            // InternalTASKDSL.g:924:1: ( ( rule__Game__AllCellsAssignment_11 )* )
            {
            // InternalTASKDSL.g:924:1: ( ( rule__Game__AllCellsAssignment_11 )* )
            // InternalTASKDSL.g:925:2: ( rule__Game__AllCellsAssignment_11 )*
            {
             before(grammarAccess.getGameAccess().getAllCellsAssignment_11()); 
            // InternalTASKDSL.g:926:2: ( rule__Game__AllCellsAssignment_11 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTASKDSL.g:926:3: rule__Game__AllCellsAssignment_11
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Game__AllCellsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getAllCellsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__11__Impl"


    // $ANTLR start "rule__GridSize__Group__0"
    // InternalTASKDSL.g:935:1: rule__GridSize__Group__0 : rule__GridSize__Group__0__Impl rule__GridSize__Group__1 ;
    public final void rule__GridSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:939:1: ( rule__GridSize__Group__0__Impl rule__GridSize__Group__1 )
            // InternalTASKDSL.g:940:2: rule__GridSize__Group__0__Impl rule__GridSize__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__GridSize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__0"


    // $ANTLR start "rule__GridSize__Group__0__Impl"
    // InternalTASKDSL.g:947:1: rule__GridSize__Group__0__Impl : ( 'Height:' ) ;
    public final void rule__GridSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:951:1: ( ( 'Height:' ) )
            // InternalTASKDSL.g:952:1: ( 'Height:' )
            {
            // InternalTASKDSL.g:952:1: ( 'Height:' )
            // InternalTASKDSL.g:953:2: 'Height:'
            {
             before(grammarAccess.getGridSizeAccess().getHeightKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getHeightKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__0__Impl"


    // $ANTLR start "rule__GridSize__Group__1"
    // InternalTASKDSL.g:962:1: rule__GridSize__Group__1 : rule__GridSize__Group__1__Impl rule__GridSize__Group__2 ;
    public final void rule__GridSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:966:1: ( rule__GridSize__Group__1__Impl rule__GridSize__Group__2 )
            // InternalTASKDSL.g:967:2: rule__GridSize__Group__1__Impl rule__GridSize__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__GridSize__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__1"


    // $ANTLR start "rule__GridSize__Group__1__Impl"
    // InternalTASKDSL.g:974:1: rule__GridSize__Group__1__Impl : ( ( rule__GridSize__HAssignment_1 ) ) ;
    public final void rule__GridSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:978:1: ( ( ( rule__GridSize__HAssignment_1 ) ) )
            // InternalTASKDSL.g:979:1: ( ( rule__GridSize__HAssignment_1 ) )
            {
            // InternalTASKDSL.g:979:1: ( ( rule__GridSize__HAssignment_1 ) )
            // InternalTASKDSL.g:980:2: ( rule__GridSize__HAssignment_1 )
            {
             before(grammarAccess.getGridSizeAccess().getHAssignment_1()); 
            // InternalTASKDSL.g:981:2: ( rule__GridSize__HAssignment_1 )
            // InternalTASKDSL.g:981:3: rule__GridSize__HAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GridSize__HAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGridSizeAccess().getHAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__1__Impl"


    // $ANTLR start "rule__GridSize__Group__2"
    // InternalTASKDSL.g:989:1: rule__GridSize__Group__2 : rule__GridSize__Group__2__Impl rule__GridSize__Group__3 ;
    public final void rule__GridSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:993:1: ( rule__GridSize__Group__2__Impl rule__GridSize__Group__3 )
            // InternalTASKDSL.g:994:2: rule__GridSize__Group__2__Impl rule__GridSize__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__GridSize__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__2"


    // $ANTLR start "rule__GridSize__Group__2__Impl"
    // InternalTASKDSL.g:1001:1: rule__GridSize__Group__2__Impl : ( 'Length:' ) ;
    public final void rule__GridSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1005:1: ( ( 'Length:' ) )
            // InternalTASKDSL.g:1006:1: ( 'Length:' )
            {
            // InternalTASKDSL.g:1006:1: ( 'Length:' )
            // InternalTASKDSL.g:1007:2: 'Length:'
            {
             before(grammarAccess.getGridSizeAccess().getLengthKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getLengthKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__2__Impl"


    // $ANTLR start "rule__GridSize__Group__3"
    // InternalTASKDSL.g:1016:1: rule__GridSize__Group__3 : rule__GridSize__Group__3__Impl ;
    public final void rule__GridSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1020:1: ( rule__GridSize__Group__3__Impl )
            // InternalTASKDSL.g:1021:2: rule__GridSize__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GridSize__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__3"


    // $ANTLR start "rule__GridSize__Group__3__Impl"
    // InternalTASKDSL.g:1027:1: rule__GridSize__Group__3__Impl : ( ( rule__GridSize__LAssignment_3 ) ) ;
    public final void rule__GridSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1031:1: ( ( ( rule__GridSize__LAssignment_3 ) ) )
            // InternalTASKDSL.g:1032:1: ( ( rule__GridSize__LAssignment_3 ) )
            {
            // InternalTASKDSL.g:1032:1: ( ( rule__GridSize__LAssignment_3 ) )
            // InternalTASKDSL.g:1033:2: ( rule__GridSize__LAssignment_3 )
            {
             before(grammarAccess.getGridSizeAccess().getLAssignment_3()); 
            // InternalTASKDSL.g:1034:2: ( rule__GridSize__LAssignment_3 )
            // InternalTASKDSL.g:1034:3: rule__GridSize__LAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GridSize__LAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGridSizeAccess().getLAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__3__Impl"


    // $ANTLR start "rule__StartGrid__Group__0"
    // InternalTASKDSL.g:1043:1: rule__StartGrid__Group__0 : rule__StartGrid__Group__0__Impl rule__StartGrid__Group__1 ;
    public final void rule__StartGrid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1047:1: ( rule__StartGrid__Group__0__Impl rule__StartGrid__Group__1 )
            // InternalTASKDSL.g:1048:2: rule__StartGrid__Group__0__Impl rule__StartGrid__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__StartGrid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartGrid__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__0"


    // $ANTLR start "rule__StartGrid__Group__0__Impl"
    // InternalTASKDSL.g:1055:1: rule__StartGrid__Group__0__Impl : ( 'CoordinateInfo:' ) ;
    public final void rule__StartGrid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1059:1: ( ( 'CoordinateInfo:' ) )
            // InternalTASKDSL.g:1060:1: ( 'CoordinateInfo:' )
            {
            // InternalTASKDSL.g:1060:1: ( 'CoordinateInfo:' )
            // InternalTASKDSL.g:1061:2: 'CoordinateInfo:'
            {
             before(grammarAccess.getStartGridAccess().getCoordinateInfoKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStartGridAccess().getCoordinateInfoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__0__Impl"


    // $ANTLR start "rule__StartGrid__Group__1"
    // InternalTASKDSL.g:1070:1: rule__StartGrid__Group__1 : rule__StartGrid__Group__1__Impl rule__StartGrid__Group__2 ;
    public final void rule__StartGrid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1074:1: ( rule__StartGrid__Group__1__Impl rule__StartGrid__Group__2 )
            // InternalTASKDSL.g:1075:2: rule__StartGrid__Group__1__Impl rule__StartGrid__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__StartGrid__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartGrid__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__1"


    // $ANTLR start "rule__StartGrid__Group__1__Impl"
    // InternalTASKDSL.g:1082:1: rule__StartGrid__Group__1__Impl : ( 'x:' ) ;
    public final void rule__StartGrid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1086:1: ( ( 'x:' ) )
            // InternalTASKDSL.g:1087:1: ( 'x:' )
            {
            // InternalTASKDSL.g:1087:1: ( 'x:' )
            // InternalTASKDSL.g:1088:2: 'x:'
            {
             before(grammarAccess.getStartGridAccess().getXKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStartGridAccess().getXKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__1__Impl"


    // $ANTLR start "rule__StartGrid__Group__2"
    // InternalTASKDSL.g:1097:1: rule__StartGrid__Group__2 : rule__StartGrid__Group__2__Impl rule__StartGrid__Group__3 ;
    public final void rule__StartGrid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1101:1: ( rule__StartGrid__Group__2__Impl rule__StartGrid__Group__3 )
            // InternalTASKDSL.g:1102:2: rule__StartGrid__Group__2__Impl rule__StartGrid__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__StartGrid__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartGrid__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__2"


    // $ANTLR start "rule__StartGrid__Group__2__Impl"
    // InternalTASKDSL.g:1109:1: rule__StartGrid__Group__2__Impl : ( ( rule__StartGrid__XCAssignment_2 ) ) ;
    public final void rule__StartGrid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1113:1: ( ( ( rule__StartGrid__XCAssignment_2 ) ) )
            // InternalTASKDSL.g:1114:1: ( ( rule__StartGrid__XCAssignment_2 ) )
            {
            // InternalTASKDSL.g:1114:1: ( ( rule__StartGrid__XCAssignment_2 ) )
            // InternalTASKDSL.g:1115:2: ( rule__StartGrid__XCAssignment_2 )
            {
             before(grammarAccess.getStartGridAccess().getXCAssignment_2()); 
            // InternalTASKDSL.g:1116:2: ( rule__StartGrid__XCAssignment_2 )
            // InternalTASKDSL.g:1116:3: rule__StartGrid__XCAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StartGrid__XCAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStartGridAccess().getXCAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__2__Impl"


    // $ANTLR start "rule__StartGrid__Group__3"
    // InternalTASKDSL.g:1124:1: rule__StartGrid__Group__3 : rule__StartGrid__Group__3__Impl rule__StartGrid__Group__4 ;
    public final void rule__StartGrid__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1128:1: ( rule__StartGrid__Group__3__Impl rule__StartGrid__Group__4 )
            // InternalTASKDSL.g:1129:2: rule__StartGrid__Group__3__Impl rule__StartGrid__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__StartGrid__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartGrid__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__3"


    // $ANTLR start "rule__StartGrid__Group__3__Impl"
    // InternalTASKDSL.g:1136:1: rule__StartGrid__Group__3__Impl : ( 'y:' ) ;
    public final void rule__StartGrid__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1140:1: ( ( 'y:' ) )
            // InternalTASKDSL.g:1141:1: ( 'y:' )
            {
            // InternalTASKDSL.g:1141:1: ( 'y:' )
            // InternalTASKDSL.g:1142:2: 'y:'
            {
             before(grammarAccess.getStartGridAccess().getYKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getStartGridAccess().getYKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__3__Impl"


    // $ANTLR start "rule__StartGrid__Group__4"
    // InternalTASKDSL.g:1151:1: rule__StartGrid__Group__4 : rule__StartGrid__Group__4__Impl rule__StartGrid__Group__5 ;
    public final void rule__StartGrid__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1155:1: ( rule__StartGrid__Group__4__Impl rule__StartGrid__Group__5 )
            // InternalTASKDSL.g:1156:2: rule__StartGrid__Group__4__Impl rule__StartGrid__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__StartGrid__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartGrid__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__4"


    // $ANTLR start "rule__StartGrid__Group__4__Impl"
    // InternalTASKDSL.g:1163:1: rule__StartGrid__Group__4__Impl : ( ( rule__StartGrid__YCAssignment_4 ) ) ;
    public final void rule__StartGrid__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1167:1: ( ( ( rule__StartGrid__YCAssignment_4 ) ) )
            // InternalTASKDSL.g:1168:1: ( ( rule__StartGrid__YCAssignment_4 ) )
            {
            // InternalTASKDSL.g:1168:1: ( ( rule__StartGrid__YCAssignment_4 ) )
            // InternalTASKDSL.g:1169:2: ( rule__StartGrid__YCAssignment_4 )
            {
             before(grammarAccess.getStartGridAccess().getYCAssignment_4()); 
            // InternalTASKDSL.g:1170:2: ( rule__StartGrid__YCAssignment_4 )
            // InternalTASKDSL.g:1170:3: rule__StartGrid__YCAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__StartGrid__YCAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStartGridAccess().getYCAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__4__Impl"


    // $ANTLR start "rule__StartGrid__Group__5"
    // InternalTASKDSL.g:1178:1: rule__StartGrid__Group__5 : rule__StartGrid__Group__5__Impl rule__StartGrid__Group__6 ;
    public final void rule__StartGrid__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1182:1: ( rule__StartGrid__Group__5__Impl rule__StartGrid__Group__6 )
            // InternalTASKDSL.g:1183:2: rule__StartGrid__Group__5__Impl rule__StartGrid__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__StartGrid__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartGrid__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__5"


    // $ANTLR start "rule__StartGrid__Group__5__Impl"
    // InternalTASKDSL.g:1190:1: rule__StartGrid__Group__5__Impl : ( 'NeighborNo:' ) ;
    public final void rule__StartGrid__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1194:1: ( ( 'NeighborNo:' ) )
            // InternalTASKDSL.g:1195:1: ( 'NeighborNo:' )
            {
            // InternalTASKDSL.g:1195:1: ( 'NeighborNo:' )
            // InternalTASKDSL.g:1196:2: 'NeighborNo:'
            {
             before(grammarAccess.getStartGridAccess().getNeighborNoKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getStartGridAccess().getNeighborNoKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__5__Impl"


    // $ANTLR start "rule__StartGrid__Group__6"
    // InternalTASKDSL.g:1205:1: rule__StartGrid__Group__6 : rule__StartGrid__Group__6__Impl rule__StartGrid__Group__7 ;
    public final void rule__StartGrid__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1209:1: ( rule__StartGrid__Group__6__Impl rule__StartGrid__Group__7 )
            // InternalTASKDSL.g:1210:2: rule__StartGrid__Group__6__Impl rule__StartGrid__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__StartGrid__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartGrid__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__6"


    // $ANTLR start "rule__StartGrid__Group__6__Impl"
    // InternalTASKDSL.g:1217:1: rule__StartGrid__Group__6__Impl : ( ( rule__StartGrid__NNoAssignment_6 ) ) ;
    public final void rule__StartGrid__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1221:1: ( ( ( rule__StartGrid__NNoAssignment_6 ) ) )
            // InternalTASKDSL.g:1222:1: ( ( rule__StartGrid__NNoAssignment_6 ) )
            {
            // InternalTASKDSL.g:1222:1: ( ( rule__StartGrid__NNoAssignment_6 ) )
            // InternalTASKDSL.g:1223:2: ( rule__StartGrid__NNoAssignment_6 )
            {
             before(grammarAccess.getStartGridAccess().getNNoAssignment_6()); 
            // InternalTASKDSL.g:1224:2: ( rule__StartGrid__NNoAssignment_6 )
            // InternalTASKDSL.g:1224:3: rule__StartGrid__NNoAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__StartGrid__NNoAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStartGridAccess().getNNoAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__6__Impl"


    // $ANTLR start "rule__StartGrid__Group__7"
    // InternalTASKDSL.g:1232:1: rule__StartGrid__Group__7 : rule__StartGrid__Group__7__Impl rule__StartGrid__Group__8 ;
    public final void rule__StartGrid__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1236:1: ( rule__StartGrid__Group__7__Impl rule__StartGrid__Group__8 )
            // InternalTASKDSL.g:1237:2: rule__StartGrid__Group__7__Impl rule__StartGrid__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__StartGrid__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartGrid__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__7"


    // $ANTLR start "rule__StartGrid__Group__7__Impl"
    // InternalTASKDSL.g:1244:1: rule__StartGrid__Group__7__Impl : ( 'Status:' ) ;
    public final void rule__StartGrid__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1248:1: ( ( 'Status:' ) )
            // InternalTASKDSL.g:1249:1: ( 'Status:' )
            {
            // InternalTASKDSL.g:1249:1: ( 'Status:' )
            // InternalTASKDSL.g:1250:2: 'Status:'
            {
             before(grammarAccess.getStartGridAccess().getStatusKeyword_7()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStartGridAccess().getStatusKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__7__Impl"


    // $ANTLR start "rule__StartGrid__Group__8"
    // InternalTASKDSL.g:1259:1: rule__StartGrid__Group__8 : rule__StartGrid__Group__8__Impl rule__StartGrid__Group__9 ;
    public final void rule__StartGrid__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1263:1: ( rule__StartGrid__Group__8__Impl rule__StartGrid__Group__9 )
            // InternalTASKDSL.g:1264:2: rule__StartGrid__Group__8__Impl rule__StartGrid__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__StartGrid__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartGrid__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__8"


    // $ANTLR start "rule__StartGrid__Group__8__Impl"
    // InternalTASKDSL.g:1271:1: rule__StartGrid__Group__8__Impl : ( ( rule__StartGrid__SAssignment_8 ) ) ;
    public final void rule__StartGrid__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1275:1: ( ( ( rule__StartGrid__SAssignment_8 ) ) )
            // InternalTASKDSL.g:1276:1: ( ( rule__StartGrid__SAssignment_8 ) )
            {
            // InternalTASKDSL.g:1276:1: ( ( rule__StartGrid__SAssignment_8 ) )
            // InternalTASKDSL.g:1277:2: ( rule__StartGrid__SAssignment_8 )
            {
             before(grammarAccess.getStartGridAccess().getSAssignment_8()); 
            // InternalTASKDSL.g:1278:2: ( rule__StartGrid__SAssignment_8 )
            // InternalTASKDSL.g:1278:3: rule__StartGrid__SAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__StartGrid__SAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getStartGridAccess().getSAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__8__Impl"


    // $ANTLR start "rule__StartGrid__Group__9"
    // InternalTASKDSL.g:1286:1: rule__StartGrid__Group__9 : rule__StartGrid__Group__9__Impl rule__StartGrid__Group__10 ;
    public final void rule__StartGrid__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1290:1: ( rule__StartGrid__Group__9__Impl rule__StartGrid__Group__10 )
            // InternalTASKDSL.g:1291:2: rule__StartGrid__Group__9__Impl rule__StartGrid__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__StartGrid__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartGrid__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__9"


    // $ANTLR start "rule__StartGrid__Group__9__Impl"
    // InternalTASKDSL.g:1298:1: rule__StartGrid__Group__9__Impl : ( 'NextGeneration:' ) ;
    public final void rule__StartGrid__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1302:1: ( ( 'NextGeneration:' ) )
            // InternalTASKDSL.g:1303:1: ( 'NextGeneration:' )
            {
            // InternalTASKDSL.g:1303:1: ( 'NextGeneration:' )
            // InternalTASKDSL.g:1304:2: 'NextGeneration:'
            {
             before(grammarAccess.getStartGridAccess().getNextGenerationKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStartGridAccess().getNextGenerationKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__9__Impl"


    // $ANTLR start "rule__StartGrid__Group__10"
    // InternalTASKDSL.g:1313:1: rule__StartGrid__Group__10 : rule__StartGrid__Group__10__Impl ;
    public final void rule__StartGrid__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1317:1: ( rule__StartGrid__Group__10__Impl )
            // InternalTASKDSL.g:1318:2: rule__StartGrid__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartGrid__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__10"


    // $ANTLR start "rule__StartGrid__Group__10__Impl"
    // InternalTASKDSL.g:1324:1: rule__StartGrid__Group__10__Impl : ( ( rule__StartGrid__AAssignment_10 ) ) ;
    public final void rule__StartGrid__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1328:1: ( ( ( rule__StartGrid__AAssignment_10 ) ) )
            // InternalTASKDSL.g:1329:1: ( ( rule__StartGrid__AAssignment_10 ) )
            {
            // InternalTASKDSL.g:1329:1: ( ( rule__StartGrid__AAssignment_10 ) )
            // InternalTASKDSL.g:1330:2: ( rule__StartGrid__AAssignment_10 )
            {
             before(grammarAccess.getStartGridAccess().getAAssignment_10()); 
            // InternalTASKDSL.g:1331:2: ( rule__StartGrid__AAssignment_10 )
            // InternalTASKDSL.g:1331:3: rule__StartGrid__AAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__StartGrid__AAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getStartGridAccess().getAAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__Group__10__Impl"


    // $ANTLR start "rule__Cell__Group__0"
    // InternalTASKDSL.g:1340:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1344:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalTASKDSL.g:1345:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Cell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__0"


    // $ANTLR start "rule__Cell__Group__0__Impl"
    // InternalTASKDSL.g:1352:1: rule__Cell__Group__0__Impl : ( 'CoordinateInfo:' ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1356:1: ( ( 'CoordinateInfo:' ) )
            // InternalTASKDSL.g:1357:1: ( 'CoordinateInfo:' )
            {
            // InternalTASKDSL.g:1357:1: ( 'CoordinateInfo:' )
            // InternalTASKDSL.g:1358:2: 'CoordinateInfo:'
            {
             before(grammarAccess.getCellAccess().getCoordinateInfoKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getCoordinateInfoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__0__Impl"


    // $ANTLR start "rule__Cell__Group__1"
    // InternalTASKDSL.g:1367:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl rule__Cell__Group__2 ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1371:1: ( rule__Cell__Group__1__Impl rule__Cell__Group__2 )
            // InternalTASKDSL.g:1372:2: rule__Cell__Group__1__Impl rule__Cell__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Cell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__1"


    // $ANTLR start "rule__Cell__Group__1__Impl"
    // InternalTASKDSL.g:1379:1: rule__Cell__Group__1__Impl : ( 'x:' ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1383:1: ( ( 'x:' ) )
            // InternalTASKDSL.g:1384:1: ( 'x:' )
            {
            // InternalTASKDSL.g:1384:1: ( 'x:' )
            // InternalTASKDSL.g:1385:2: 'x:'
            {
             before(grammarAccess.getCellAccess().getXKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getXKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__1__Impl"


    // $ANTLR start "rule__Cell__Group__2"
    // InternalTASKDSL.g:1394:1: rule__Cell__Group__2 : rule__Cell__Group__2__Impl rule__Cell__Group__3 ;
    public final void rule__Cell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1398:1: ( rule__Cell__Group__2__Impl rule__Cell__Group__3 )
            // InternalTASKDSL.g:1399:2: rule__Cell__Group__2__Impl rule__Cell__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Cell__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__2"


    // $ANTLR start "rule__Cell__Group__2__Impl"
    // InternalTASKDSL.g:1406:1: rule__Cell__Group__2__Impl : ( ( rule__Cell__XAssignment_2 ) ) ;
    public final void rule__Cell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1410:1: ( ( ( rule__Cell__XAssignment_2 ) ) )
            // InternalTASKDSL.g:1411:1: ( ( rule__Cell__XAssignment_2 ) )
            {
            // InternalTASKDSL.g:1411:1: ( ( rule__Cell__XAssignment_2 ) )
            // InternalTASKDSL.g:1412:2: ( rule__Cell__XAssignment_2 )
            {
             before(grammarAccess.getCellAccess().getXAssignment_2()); 
            // InternalTASKDSL.g:1413:2: ( rule__Cell__XAssignment_2 )
            // InternalTASKDSL.g:1413:3: rule__Cell__XAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Cell__XAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getXAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__2__Impl"


    // $ANTLR start "rule__Cell__Group__3"
    // InternalTASKDSL.g:1421:1: rule__Cell__Group__3 : rule__Cell__Group__3__Impl rule__Cell__Group__4 ;
    public final void rule__Cell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1425:1: ( rule__Cell__Group__3__Impl rule__Cell__Group__4 )
            // InternalTASKDSL.g:1426:2: rule__Cell__Group__3__Impl rule__Cell__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Cell__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__3"


    // $ANTLR start "rule__Cell__Group__3__Impl"
    // InternalTASKDSL.g:1433:1: rule__Cell__Group__3__Impl : ( 'y:' ) ;
    public final void rule__Cell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1437:1: ( ( 'y:' ) )
            // InternalTASKDSL.g:1438:1: ( 'y:' )
            {
            // InternalTASKDSL.g:1438:1: ( 'y:' )
            // InternalTASKDSL.g:1439:2: 'y:'
            {
             before(grammarAccess.getCellAccess().getYKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getYKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__3__Impl"


    // $ANTLR start "rule__Cell__Group__4"
    // InternalTASKDSL.g:1448:1: rule__Cell__Group__4 : rule__Cell__Group__4__Impl rule__Cell__Group__5 ;
    public final void rule__Cell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1452:1: ( rule__Cell__Group__4__Impl rule__Cell__Group__5 )
            // InternalTASKDSL.g:1453:2: rule__Cell__Group__4__Impl rule__Cell__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Cell__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__4"


    // $ANTLR start "rule__Cell__Group__4__Impl"
    // InternalTASKDSL.g:1460:1: rule__Cell__Group__4__Impl : ( ( rule__Cell__YAssignment_4 ) ) ;
    public final void rule__Cell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1464:1: ( ( ( rule__Cell__YAssignment_4 ) ) )
            // InternalTASKDSL.g:1465:1: ( ( rule__Cell__YAssignment_4 ) )
            {
            // InternalTASKDSL.g:1465:1: ( ( rule__Cell__YAssignment_4 ) )
            // InternalTASKDSL.g:1466:2: ( rule__Cell__YAssignment_4 )
            {
             before(grammarAccess.getCellAccess().getYAssignment_4()); 
            // InternalTASKDSL.g:1467:2: ( rule__Cell__YAssignment_4 )
            // InternalTASKDSL.g:1467:3: rule__Cell__YAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Cell__YAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getYAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__4__Impl"


    // $ANTLR start "rule__Cell__Group__5"
    // InternalTASKDSL.g:1475:1: rule__Cell__Group__5 : rule__Cell__Group__5__Impl rule__Cell__Group__6 ;
    public final void rule__Cell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1479:1: ( rule__Cell__Group__5__Impl rule__Cell__Group__6 )
            // InternalTASKDSL.g:1480:2: rule__Cell__Group__5__Impl rule__Cell__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Cell__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__5"


    // $ANTLR start "rule__Cell__Group__5__Impl"
    // InternalTASKDSL.g:1487:1: rule__Cell__Group__5__Impl : ( 'NeighborNo:' ) ;
    public final void rule__Cell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1491:1: ( ( 'NeighborNo:' ) )
            // InternalTASKDSL.g:1492:1: ( 'NeighborNo:' )
            {
            // InternalTASKDSL.g:1492:1: ( 'NeighborNo:' )
            // InternalTASKDSL.g:1493:2: 'NeighborNo:'
            {
             before(grammarAccess.getCellAccess().getNeighborNoKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getNeighborNoKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__5__Impl"


    // $ANTLR start "rule__Cell__Group__6"
    // InternalTASKDSL.g:1502:1: rule__Cell__Group__6 : rule__Cell__Group__6__Impl rule__Cell__Group__7 ;
    public final void rule__Cell__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1506:1: ( rule__Cell__Group__6__Impl rule__Cell__Group__7 )
            // InternalTASKDSL.g:1507:2: rule__Cell__Group__6__Impl rule__Cell__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Cell__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__6"


    // $ANTLR start "rule__Cell__Group__6__Impl"
    // InternalTASKDSL.g:1514:1: rule__Cell__Group__6__Impl : ( ( rule__Cell__NNoAssignment_6 ) ) ;
    public final void rule__Cell__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1518:1: ( ( ( rule__Cell__NNoAssignment_6 ) ) )
            // InternalTASKDSL.g:1519:1: ( ( rule__Cell__NNoAssignment_6 ) )
            {
            // InternalTASKDSL.g:1519:1: ( ( rule__Cell__NNoAssignment_6 ) )
            // InternalTASKDSL.g:1520:2: ( rule__Cell__NNoAssignment_6 )
            {
             before(grammarAccess.getCellAccess().getNNoAssignment_6()); 
            // InternalTASKDSL.g:1521:2: ( rule__Cell__NNoAssignment_6 )
            // InternalTASKDSL.g:1521:3: rule__Cell__NNoAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Cell__NNoAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getNNoAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__6__Impl"


    // $ANTLR start "rule__Cell__Group__7"
    // InternalTASKDSL.g:1529:1: rule__Cell__Group__7 : rule__Cell__Group__7__Impl rule__Cell__Group__8 ;
    public final void rule__Cell__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1533:1: ( rule__Cell__Group__7__Impl rule__Cell__Group__8 )
            // InternalTASKDSL.g:1534:2: rule__Cell__Group__7__Impl rule__Cell__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Cell__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__7"


    // $ANTLR start "rule__Cell__Group__7__Impl"
    // InternalTASKDSL.g:1541:1: rule__Cell__Group__7__Impl : ( 'Status:' ) ;
    public final void rule__Cell__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1545:1: ( ( 'Status:' ) )
            // InternalTASKDSL.g:1546:1: ( 'Status:' )
            {
            // InternalTASKDSL.g:1546:1: ( 'Status:' )
            // InternalTASKDSL.g:1547:2: 'Status:'
            {
             before(grammarAccess.getCellAccess().getStatusKeyword_7()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getStatusKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__7__Impl"


    // $ANTLR start "rule__Cell__Group__8"
    // InternalTASKDSL.g:1556:1: rule__Cell__Group__8 : rule__Cell__Group__8__Impl rule__Cell__Group__9 ;
    public final void rule__Cell__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1560:1: ( rule__Cell__Group__8__Impl rule__Cell__Group__9 )
            // InternalTASKDSL.g:1561:2: rule__Cell__Group__8__Impl rule__Cell__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Cell__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__8"


    // $ANTLR start "rule__Cell__Group__8__Impl"
    // InternalTASKDSL.g:1568:1: rule__Cell__Group__8__Impl : ( ( rule__Cell__SAssignment_8 ) ) ;
    public final void rule__Cell__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1572:1: ( ( ( rule__Cell__SAssignment_8 ) ) )
            // InternalTASKDSL.g:1573:1: ( ( rule__Cell__SAssignment_8 ) )
            {
            // InternalTASKDSL.g:1573:1: ( ( rule__Cell__SAssignment_8 ) )
            // InternalTASKDSL.g:1574:2: ( rule__Cell__SAssignment_8 )
            {
             before(grammarAccess.getCellAccess().getSAssignment_8()); 
            // InternalTASKDSL.g:1575:2: ( rule__Cell__SAssignment_8 )
            // InternalTASKDSL.g:1575:3: rule__Cell__SAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Cell__SAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getSAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__8__Impl"


    // $ANTLR start "rule__Cell__Group__9"
    // InternalTASKDSL.g:1583:1: rule__Cell__Group__9 : rule__Cell__Group__9__Impl rule__Cell__Group__10 ;
    public final void rule__Cell__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1587:1: ( rule__Cell__Group__9__Impl rule__Cell__Group__10 )
            // InternalTASKDSL.g:1588:2: rule__Cell__Group__9__Impl rule__Cell__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__Cell__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__9"


    // $ANTLR start "rule__Cell__Group__9__Impl"
    // InternalTASKDSL.g:1595:1: rule__Cell__Group__9__Impl : ( 'NextGeneration:' ) ;
    public final void rule__Cell__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1599:1: ( ( 'NextGeneration:' ) )
            // InternalTASKDSL.g:1600:1: ( 'NextGeneration:' )
            {
            // InternalTASKDSL.g:1600:1: ( 'NextGeneration:' )
            // InternalTASKDSL.g:1601:2: 'NextGeneration:'
            {
             before(grammarAccess.getCellAccess().getNextGenerationKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getNextGenerationKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__9__Impl"


    // $ANTLR start "rule__Cell__Group__10"
    // InternalTASKDSL.g:1610:1: rule__Cell__Group__10 : rule__Cell__Group__10__Impl ;
    public final void rule__Cell__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1614:1: ( rule__Cell__Group__10__Impl )
            // InternalTASKDSL.g:1615:2: rule__Cell__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__10"


    // $ANTLR start "rule__Cell__Group__10__Impl"
    // InternalTASKDSL.g:1621:1: rule__Cell__Group__10__Impl : ( ( rule__Cell__AAssignment_10 ) ) ;
    public final void rule__Cell__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1625:1: ( ( ( rule__Cell__AAssignment_10 ) ) )
            // InternalTASKDSL.g:1626:1: ( ( rule__Cell__AAssignment_10 ) )
            {
            // InternalTASKDSL.g:1626:1: ( ( rule__Cell__AAssignment_10 ) )
            // InternalTASKDSL.g:1627:2: ( rule__Cell__AAssignment_10 )
            {
             before(grammarAccess.getCellAccess().getAAssignment_10()); 
            // InternalTASKDSL.g:1628:2: ( rule__Cell__AAssignment_10 )
            // InternalTASKDSL.g:1628:3: rule__Cell__AAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Cell__AAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getAAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__10__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__0"
    // InternalTASKDSL.g:1637:1: rule__EvolutionRules__Group__0 : rule__EvolutionRules__Group__0__Impl rule__EvolutionRules__Group__1 ;
    public final void rule__EvolutionRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1641:1: ( rule__EvolutionRules__Group__0__Impl rule__EvolutionRules__Group__1 )
            // InternalTASKDSL.g:1642:2: rule__EvolutionRules__Group__0__Impl rule__EvolutionRules__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__EvolutionRules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__0"


    // $ANTLR start "rule__EvolutionRules__Group__0__Impl"
    // InternalTASKDSL.g:1649:1: rule__EvolutionRules__Group__0__Impl : ( 'if' ) ;
    public final void rule__EvolutionRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1653:1: ( ( 'if' ) )
            // InternalTASKDSL.g:1654:1: ( 'if' )
            {
            // InternalTASKDSL.g:1654:1: ( 'if' )
            // InternalTASKDSL.g:1655:2: 'if'
            {
             before(grammarAccess.getEvolutionRulesAccess().getIfKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEvolutionRulesAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__0__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__1"
    // InternalTASKDSL.g:1664:1: rule__EvolutionRules__Group__1 : rule__EvolutionRules__Group__1__Impl rule__EvolutionRules__Group__2 ;
    public final void rule__EvolutionRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1668:1: ( rule__EvolutionRules__Group__1__Impl rule__EvolutionRules__Group__2 )
            // InternalTASKDSL.g:1669:2: rule__EvolutionRules__Group__1__Impl rule__EvolutionRules__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__EvolutionRules__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__1"


    // $ANTLR start "rule__EvolutionRules__Group__1__Impl"
    // InternalTASKDSL.g:1676:1: rule__EvolutionRules__Group__1__Impl : ( ( rule__EvolutionRules__BoolAssignment_1 ) ) ;
    public final void rule__EvolutionRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1680:1: ( ( ( rule__EvolutionRules__BoolAssignment_1 ) ) )
            // InternalTASKDSL.g:1681:1: ( ( rule__EvolutionRules__BoolAssignment_1 ) )
            {
            // InternalTASKDSL.g:1681:1: ( ( rule__EvolutionRules__BoolAssignment_1 ) )
            // InternalTASKDSL.g:1682:2: ( rule__EvolutionRules__BoolAssignment_1 )
            {
             before(grammarAccess.getEvolutionRulesAccess().getBoolAssignment_1()); 
            // InternalTASKDSL.g:1683:2: ( rule__EvolutionRules__BoolAssignment_1 )
            // InternalTASKDSL.g:1683:3: rule__EvolutionRules__BoolAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__BoolAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRulesAccess().getBoolAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__1__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__2"
    // InternalTASKDSL.g:1691:1: rule__EvolutionRules__Group__2 : rule__EvolutionRules__Group__2__Impl rule__EvolutionRules__Group__3 ;
    public final void rule__EvolutionRules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1695:1: ( rule__EvolutionRules__Group__2__Impl rule__EvolutionRules__Group__3 )
            // InternalTASKDSL.g:1696:2: rule__EvolutionRules__Group__2__Impl rule__EvolutionRules__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__EvolutionRules__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__2"


    // $ANTLR start "rule__EvolutionRules__Group__2__Impl"
    // InternalTASKDSL.g:1703:1: rule__EvolutionRules__Group__2__Impl : ( 'then' ) ;
    public final void rule__EvolutionRules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1707:1: ( ( 'then' ) )
            // InternalTASKDSL.g:1708:1: ( 'then' )
            {
            // InternalTASKDSL.g:1708:1: ( 'then' )
            // InternalTASKDSL.g:1709:2: 'then'
            {
             before(grammarAccess.getEvolutionRulesAccess().getThenKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEvolutionRulesAccess().getThenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__2__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__3"
    // InternalTASKDSL.g:1718:1: rule__EvolutionRules__Group__3 : rule__EvolutionRules__Group__3__Impl ;
    public final void rule__EvolutionRules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1722:1: ( rule__EvolutionRules__Group__3__Impl )
            // InternalTASKDSL.g:1723:2: rule__EvolutionRules__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__3"


    // $ANTLR start "rule__EvolutionRules__Group__3__Impl"
    // InternalTASKDSL.g:1729:1: rule__EvolutionRules__Group__3__Impl : ( ( rule__EvolutionRules__Alternatives_3 ) ) ;
    public final void rule__EvolutionRules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1733:1: ( ( ( rule__EvolutionRules__Alternatives_3 ) ) )
            // InternalTASKDSL.g:1734:1: ( ( rule__EvolutionRules__Alternatives_3 ) )
            {
            // InternalTASKDSL.g:1734:1: ( ( rule__EvolutionRules__Alternatives_3 ) )
            // InternalTASKDSL.g:1735:2: ( rule__EvolutionRules__Alternatives_3 )
            {
             before(grammarAccess.getEvolutionRulesAccess().getAlternatives_3()); 
            // InternalTASKDSL.g:1736:2: ( rule__EvolutionRules__Alternatives_3 )
            // InternalTASKDSL.g:1736:3: rule__EvolutionRules__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRulesAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__Group__3__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalTASKDSL.g:1745:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1749:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalTASKDSL.g:1750:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalTASKDSL.g:1757:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1761:1: ( ( ruleAndExpression ) )
            // InternalTASKDSL.g:1762:1: ( ruleAndExpression )
            {
            // InternalTASKDSL.g:1762:1: ( ruleAndExpression )
            // InternalTASKDSL.g:1763:2: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalTASKDSL.g:1772:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1776:1: ( rule__OrExpression__Group__1__Impl )
            // InternalTASKDSL.g:1777:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalTASKDSL.g:1783:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1787:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalTASKDSL.g:1788:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalTASKDSL.g:1788:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalTASKDSL.g:1789:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalTASKDSL.g:1790:2: ( rule__OrExpression__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==41) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTASKDSL.g:1790:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalTASKDSL.g:1799:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1803:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalTASKDSL.g:1804:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalTASKDSL.g:1811:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1815:1: ( ( () ) )
            // InternalTASKDSL.g:1816:1: ( () )
            {
            // InternalTASKDSL.g:1816:1: ( () )
            // InternalTASKDSL.g:1817:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 
            // InternalTASKDSL.g:1818:2: ()
            // InternalTASKDSL.g:1818:3: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalTASKDSL.g:1826:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1830:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalTASKDSL.g:1831:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalTASKDSL.g:1838:1: rule__OrExpression__Group_1__1__Impl : ( '||' ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1842:1: ( ( '||' ) )
            // InternalTASKDSL.g:1843:1: ( '||' )
            {
            // InternalTASKDSL.g:1843:1: ( '||' )
            // InternalTASKDSL.g:1844:2: '||'
            {
             before(grammarAccess.getOrExpressionAccess().getVertCalLNeVertCalLNeKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOrExpressionAccess().getVertCalLNeVertCalLNeKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // InternalTASKDSL.g:1853:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1857:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalTASKDSL.g:1858:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // InternalTASKDSL.g:1864:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1868:1: ( ( ( rule__OrExpression__RightAssignment_1_2 ) ) )
            // InternalTASKDSL.g:1869:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            {
            // InternalTASKDSL.g:1869:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            // InternalTASKDSL.g:1870:2: ( rule__OrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            // InternalTASKDSL.g:1871:2: ( rule__OrExpression__RightAssignment_1_2 )
            // InternalTASKDSL.g:1871:3: rule__OrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalTASKDSL.g:1880:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1884:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalTASKDSL.g:1885:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalTASKDSL.g:1892:1: rule__AndExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1896:1: ( ( ruleComparisonExpression ) )
            // InternalTASKDSL.g:1897:1: ( ruleComparisonExpression )
            {
            // InternalTASKDSL.g:1897:1: ( ruleComparisonExpression )
            // InternalTASKDSL.g:1898:2: ruleComparisonExpression
            {
             before(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalTASKDSL.g:1907:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1911:1: ( rule__AndExpression__Group__1__Impl )
            // InternalTASKDSL.g:1912:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalTASKDSL.g:1918:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1922:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalTASKDSL.g:1923:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalTASKDSL.g:1923:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalTASKDSL.g:1924:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalTASKDSL.g:1925:2: ( rule__AndExpression__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==42) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTASKDSL.g:1925:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalTASKDSL.g:1934:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1938:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalTASKDSL.g:1939:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalTASKDSL.g:1946:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1950:1: ( ( () ) )
            // InternalTASKDSL.g:1951:1: ( () )
            {
            // InternalTASKDSL.g:1951:1: ( () )
            // InternalTASKDSL.g:1952:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            // InternalTASKDSL.g:1953:2: ()
            // InternalTASKDSL.g:1953:3: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalTASKDSL.g:1961:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1965:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalTASKDSL.g:1966:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalTASKDSL.g:1973:1: rule__AndExpression__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1977:1: ( ( '&&' ) )
            // InternalTASKDSL.g:1978:1: ( '&&' )
            {
            // InternalTASKDSL.g:1978:1: ( '&&' )
            // InternalTASKDSL.g:1979:2: '&&'
            {
             before(grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalTASKDSL.g:1988:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1992:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalTASKDSL.g:1993:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalTASKDSL.g:1999:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2003:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // InternalTASKDSL.g:2004:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // InternalTASKDSL.g:2004:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // InternalTASKDSL.g:2005:2: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // InternalTASKDSL.g:2006:2: ( rule__AndExpression__RightAssignment_1_2 )
            // InternalTASKDSL.g:2006:3: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalTASKDSL.g:2015:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2019:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalTASKDSL.g:2020:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // InternalTASKDSL.g:2027:1: rule__ComparisonExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2031:1: ( ( rulePrimaryExpression ) )
            // InternalTASKDSL.g:2032:1: ( rulePrimaryExpression )
            {
            // InternalTASKDSL.g:2032:1: ( rulePrimaryExpression )
            // InternalTASKDSL.g:2033:2: rulePrimaryExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // InternalTASKDSL.g:2042:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2046:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalTASKDSL.g:2047:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // InternalTASKDSL.g:2053:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2057:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // InternalTASKDSL.g:2058:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // InternalTASKDSL.g:2058:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // InternalTASKDSL.g:2059:2: ( rule__ComparisonExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // InternalTASKDSL.g:2060:2: ( rule__ComparisonExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=19 && LA14_0<=23)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTASKDSL.g:2060:3: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0"
    // InternalTASKDSL.g:2069:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2073:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalTASKDSL.g:2074:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0__Impl"
    // InternalTASKDSL.g:2081:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2085:1: ( ( () ) )
            // InternalTASKDSL.g:2086:1: ( () )
            {
            // InternalTASKDSL.g:2086:1: ( () )
            // InternalTASKDSL.g:2087:2: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 
            // InternalTASKDSL.g:2088:2: ()
            // InternalTASKDSL.g:2088:3: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1"
    // InternalTASKDSL.g:2096:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2100:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalTASKDSL.g:2101:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__ComparisonExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1__Impl"
    // InternalTASKDSL.g:2108:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2112:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) )
            // InternalTASKDSL.g:2113:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            {
            // InternalTASKDSL.g:2113:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            // InternalTASKDSL.g:2114:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalTASKDSL.g:2115:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            // InternalTASKDSL.g:2115:3: rule__ComparisonExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2"
    // InternalTASKDSL.g:2123:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2127:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalTASKDSL.g:2128:2: rule__ComparisonExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2__Impl"
    // InternalTASKDSL.g:2134:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2138:1: ( ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) )
            // InternalTASKDSL.g:2139:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            {
            // InternalTASKDSL.g:2139:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            // InternalTASKDSL.g:2140:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 
            // InternalTASKDSL.g:2141:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            // InternalTASKDSL.g:2141:3: rule__ComparisonExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalTASKDSL.g:2150:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2154:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalTASKDSL.g:2155:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // InternalTASKDSL.g:2162:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2166:1: ( ( '(' ) )
            // InternalTASKDSL.g:2167:1: ( '(' )
            {
            // InternalTASKDSL.g:2167:1: ( '(' )
            // InternalTASKDSL.g:2168:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesSKeyword_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesSKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // InternalTASKDSL.g:2177:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2181:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalTASKDSL.g:2182:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_32);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // InternalTASKDSL.g:2189:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2193:1: ( ( ruleExpression ) )
            // InternalTASKDSL.g:2194:1: ( ruleExpression )
            {
            // InternalTASKDSL.g:2194:1: ( ruleExpression )
            // InternalTASKDSL.g:2195:2: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // InternalTASKDSL.g:2204:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2208:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalTASKDSL.g:2209:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // InternalTASKDSL.g:2215:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2219:1: ( ( ')' ) )
            // InternalTASKDSL.g:2220:1: ( ')' )
            {
            // InternalTASKDSL.g:2220:1: ( ')' )
            // InternalTASKDSL.g:2221:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRGhtParenthesSKeyword_0_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRGhtParenthesSKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__Literal__Group_0__0"
    // InternalTASKDSL.g:2231:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2235:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // InternalTASKDSL.g:2236:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Literal__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0"


    // $ANTLR start "rule__Literal__Group_0__0__Impl"
    // InternalTASKDSL.g:2243:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2247:1: ( ( () ) )
            // InternalTASKDSL.g:2248:1: ( () )
            {
            // InternalTASKDSL.g:2248:1: ( () )
            // InternalTASKDSL.g:2249:2: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 
            // InternalTASKDSL.g:2250:2: ()
            // InternalTASKDSL.g:2250:3: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0__Impl"


    // $ANTLR start "rule__Literal__Group_0__1"
    // InternalTASKDSL.g:2258:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2262:1: ( rule__Literal__Group_0__1__Impl )
            // InternalTASKDSL.g:2263:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__1"


    // $ANTLR start "rule__Literal__Group_0__1__Impl"
    // InternalTASKDSL.g:2269:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__ValueAssignment_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2273:1: ( ( ( rule__Literal__ValueAssignment_0_1 ) ) )
            // InternalTASKDSL.g:2274:1: ( ( rule__Literal__ValueAssignment_0_1 ) )
            {
            // InternalTASKDSL.g:2274:1: ( ( rule__Literal__ValueAssignment_0_1 ) )
            // InternalTASKDSL.g:2275:2: ( rule__Literal__ValueAssignment_0_1 )
            {
             before(grammarAccess.getLiteralAccess().getValueAssignment_0_1()); 
            // InternalTASKDSL.g:2276:2: ( rule__Literal__ValueAssignment_0_1 )
            // InternalTASKDSL.g:2276:3: rule__Literal__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Literal__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__1__Impl"


    // $ANTLR start "rule__Game__NameAssignment_1"
    // InternalTASKDSL.g:2285:1: rule__Game__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Game__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2289:1: ( ( RULE_ID ) )
            // InternalTASKDSL.g:2290:2: ( RULE_ID )
            {
            // InternalTASKDSL.g:2290:2: ( RULE_ID )
            // InternalTASKDSL.g:2291:3: RULE_ID
            {
             before(grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__NameAssignment_1"


    // $ANTLR start "rule__Game__GameStatusAssignment_3"
    // InternalTASKDSL.g:2300:1: rule__Game__GameStatusAssignment_3 : ( ruleGameStatus ) ;
    public final void rule__Game__GameStatusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2304:1: ( ( ruleGameStatus ) )
            // InternalTASKDSL.g:2305:2: ( ruleGameStatus )
            {
            // InternalTASKDSL.g:2305:2: ( ruleGameStatus )
            // InternalTASKDSL.g:2306:3: ruleGameStatus
            {
             before(grammarAccess.getGameAccess().getGameStatusGameStatusParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGameStatus();

            state._fsp--;

             after(grammarAccess.getGameAccess().getGameStatusGameStatusParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__GameStatusAssignment_3"


    // $ANTLR start "rule__Game__GridSizeAssignment_5"
    // InternalTASKDSL.g:2315:1: rule__Game__GridSizeAssignment_5 : ( ruleGridSize ) ;
    public final void rule__Game__GridSizeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2319:1: ( ( ruleGridSize ) )
            // InternalTASKDSL.g:2320:2: ( ruleGridSize )
            {
            // InternalTASKDSL.g:2320:2: ( ruleGridSize )
            // InternalTASKDSL.g:2321:3: ruleGridSize
            {
             before(grammarAccess.getGameAccess().getGridSizeGridSizeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleGridSize();

            state._fsp--;

             after(grammarAccess.getGameAccess().getGridSizeGridSizeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__GridSizeAssignment_5"


    // $ANTLR start "rule__Game__EvolutionRulesAssignment_7"
    // InternalTASKDSL.g:2330:1: rule__Game__EvolutionRulesAssignment_7 : ( ruleevolutionRules ) ;
    public final void rule__Game__EvolutionRulesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2334:1: ( ( ruleevolutionRules ) )
            // InternalTASKDSL.g:2335:2: ( ruleevolutionRules )
            {
            // InternalTASKDSL.g:2335:2: ( ruleevolutionRules )
            // InternalTASKDSL.g:2336:3: ruleevolutionRules
            {
             before(grammarAccess.getGameAccess().getEvolutionRulesEvolutionRulesParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleevolutionRules();

            state._fsp--;

             after(grammarAccess.getGameAccess().getEvolutionRulesEvolutionRulesParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__EvolutionRulesAssignment_7"


    // $ANTLR start "rule__Game__StartGridAssignment_9"
    // InternalTASKDSL.g:2345:1: rule__Game__StartGridAssignment_9 : ( ruleStartGrid ) ;
    public final void rule__Game__StartGridAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2349:1: ( ( ruleStartGrid ) )
            // InternalTASKDSL.g:2350:2: ( ruleStartGrid )
            {
            // InternalTASKDSL.g:2350:2: ( ruleStartGrid )
            // InternalTASKDSL.g:2351:3: ruleStartGrid
            {
             before(grammarAccess.getGameAccess().getStartGridStartGridParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleStartGrid();

            state._fsp--;

             after(grammarAccess.getGameAccess().getStartGridStartGridParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__StartGridAssignment_9"


    // $ANTLR start "rule__Game__AllCellsAssignment_11"
    // InternalTASKDSL.g:2360:1: rule__Game__AllCellsAssignment_11 : ( ruleCell ) ;
    public final void rule__Game__AllCellsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2364:1: ( ( ruleCell ) )
            // InternalTASKDSL.g:2365:2: ( ruleCell )
            {
            // InternalTASKDSL.g:2365:2: ( ruleCell )
            // InternalTASKDSL.g:2366:3: ruleCell
            {
             before(grammarAccess.getGameAccess().getAllCellsCellParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getGameAccess().getAllCellsCellParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__AllCellsAssignment_11"


    // $ANTLR start "rule__GridSize__HAssignment_1"
    // InternalTASKDSL.g:2375:1: rule__GridSize__HAssignment_1 : ( RULE_INT ) ;
    public final void rule__GridSize__HAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2379:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:2380:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:2380:2: ( RULE_INT )
            // InternalTASKDSL.g:2381:3: RULE_INT
            {
             before(grammarAccess.getGridSizeAccess().getHINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getHINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__HAssignment_1"


    // $ANTLR start "rule__GridSize__LAssignment_3"
    // InternalTASKDSL.g:2390:1: rule__GridSize__LAssignment_3 : ( RULE_INT ) ;
    public final void rule__GridSize__LAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2394:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:2395:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:2395:2: ( RULE_INT )
            // InternalTASKDSL.g:2396:3: RULE_INT
            {
             before(grammarAccess.getGridSizeAccess().getLINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getLINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__LAssignment_3"


    // $ANTLR start "rule__GameStatus__SoAssignment"
    // InternalTASKDSL.g:2405:1: rule__GameStatus__SoAssignment : ( ( rule__GameStatus__SoAlternatives_0 ) ) ;
    public final void rule__GameStatus__SoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2409:1: ( ( ( rule__GameStatus__SoAlternatives_0 ) ) )
            // InternalTASKDSL.g:2410:2: ( ( rule__GameStatus__SoAlternatives_0 ) )
            {
            // InternalTASKDSL.g:2410:2: ( ( rule__GameStatus__SoAlternatives_0 ) )
            // InternalTASKDSL.g:2411:3: ( rule__GameStatus__SoAlternatives_0 )
            {
             before(grammarAccess.getGameStatusAccess().getSoAlternatives_0()); 
            // InternalTASKDSL.g:2412:3: ( rule__GameStatus__SoAlternatives_0 )
            // InternalTASKDSL.g:2412:4: rule__GameStatus__SoAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__GameStatus__SoAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getGameStatusAccess().getSoAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStatus__SoAssignment"


    // $ANTLR start "rule__StartGrid__XCAssignment_2"
    // InternalTASKDSL.g:2420:1: rule__StartGrid__XCAssignment_2 : ( RULE_INT ) ;
    public final void rule__StartGrid__XCAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2424:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:2425:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:2425:2: ( RULE_INT )
            // InternalTASKDSL.g:2426:3: RULE_INT
            {
             before(grammarAccess.getStartGridAccess().getXCINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStartGridAccess().getXCINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__XCAssignment_2"


    // $ANTLR start "rule__StartGrid__YCAssignment_4"
    // InternalTASKDSL.g:2435:1: rule__StartGrid__YCAssignment_4 : ( RULE_INT ) ;
    public final void rule__StartGrid__YCAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2439:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:2440:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:2440:2: ( RULE_INT )
            // InternalTASKDSL.g:2441:3: RULE_INT
            {
             before(grammarAccess.getStartGridAccess().getYCINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStartGridAccess().getYCINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__YCAssignment_4"


    // $ANTLR start "rule__StartGrid__NNoAssignment_6"
    // InternalTASKDSL.g:2450:1: rule__StartGrid__NNoAssignment_6 : ( RULE_INT ) ;
    public final void rule__StartGrid__NNoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2454:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:2455:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:2455:2: ( RULE_INT )
            // InternalTASKDSL.g:2456:3: RULE_INT
            {
             before(grammarAccess.getStartGridAccess().getNNoINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStartGridAccess().getNNoINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__NNoAssignment_6"


    // $ANTLR start "rule__StartGrid__SAssignment_8"
    // InternalTASKDSL.g:2465:1: rule__StartGrid__SAssignment_8 : ( ( 'Live' ) ) ;
    public final void rule__StartGrid__SAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2469:1: ( ( ( 'Live' ) ) )
            // InternalTASKDSL.g:2470:2: ( ( 'Live' ) )
            {
            // InternalTASKDSL.g:2470:2: ( ( 'Live' ) )
            // InternalTASKDSL.g:2471:3: ( 'Live' )
            {
             before(grammarAccess.getStartGridAccess().getSLiveKeyword_8_0()); 
            // InternalTASKDSL.g:2472:3: ( 'Live' )
            // InternalTASKDSL.g:2473:4: 'Live'
            {
             before(grammarAccess.getStartGridAccess().getSLiveKeyword_8_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStartGridAccess().getSLiveKeyword_8_0()); 

            }

             after(grammarAccess.getStartGridAccess().getSLiveKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__SAssignment_8"


    // $ANTLR start "rule__StartGrid__AAssignment_10"
    // InternalTASKDSL.g:2484:1: rule__StartGrid__AAssignment_10 : ( ( rule__StartGrid__AAlternatives_10_0 ) ) ;
    public final void rule__StartGrid__AAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2488:1: ( ( ( rule__StartGrid__AAlternatives_10_0 ) ) )
            // InternalTASKDSL.g:2489:2: ( ( rule__StartGrid__AAlternatives_10_0 ) )
            {
            // InternalTASKDSL.g:2489:2: ( ( rule__StartGrid__AAlternatives_10_0 ) )
            // InternalTASKDSL.g:2490:3: ( rule__StartGrid__AAlternatives_10_0 )
            {
             before(grammarAccess.getStartGridAccess().getAAlternatives_10_0()); 
            // InternalTASKDSL.g:2491:3: ( rule__StartGrid__AAlternatives_10_0 )
            // InternalTASKDSL.g:2491:4: rule__StartGrid__AAlternatives_10_0
            {
            pushFollow(FOLLOW_2);
            rule__StartGrid__AAlternatives_10_0();

            state._fsp--;


            }

             after(grammarAccess.getStartGridAccess().getAAlternatives_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartGrid__AAssignment_10"


    // $ANTLR start "rule__Cell__XAssignment_2"
    // InternalTASKDSL.g:2499:1: rule__Cell__XAssignment_2 : ( RULE_INT ) ;
    public final void rule__Cell__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2503:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:2504:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:2504:2: ( RULE_INT )
            // InternalTASKDSL.g:2505:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getXINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getXINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__XAssignment_2"


    // $ANTLR start "rule__Cell__YAssignment_4"
    // InternalTASKDSL.g:2514:1: rule__Cell__YAssignment_4 : ( RULE_INT ) ;
    public final void rule__Cell__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2518:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:2519:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:2519:2: ( RULE_INT )
            // InternalTASKDSL.g:2520:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getYINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getYINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__YAssignment_4"


    // $ANTLR start "rule__Cell__NNoAssignment_6"
    // InternalTASKDSL.g:2529:1: rule__Cell__NNoAssignment_6 : ( RULE_INT ) ;
    public final void rule__Cell__NNoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2533:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:2534:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:2534:2: ( RULE_INT )
            // InternalTASKDSL.g:2535:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getNNoINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getNNoINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__NNoAssignment_6"


    // $ANTLR start "rule__Cell__SAssignment_8"
    // InternalTASKDSL.g:2544:1: rule__Cell__SAssignment_8 : ( ( rule__Cell__SAlternatives_8_0 ) ) ;
    public final void rule__Cell__SAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2548:1: ( ( ( rule__Cell__SAlternatives_8_0 ) ) )
            // InternalTASKDSL.g:2549:2: ( ( rule__Cell__SAlternatives_8_0 ) )
            {
            // InternalTASKDSL.g:2549:2: ( ( rule__Cell__SAlternatives_8_0 ) )
            // InternalTASKDSL.g:2550:3: ( rule__Cell__SAlternatives_8_0 )
            {
             before(grammarAccess.getCellAccess().getSAlternatives_8_0()); 
            // InternalTASKDSL.g:2551:3: ( rule__Cell__SAlternatives_8_0 )
            // InternalTASKDSL.g:2551:4: rule__Cell__SAlternatives_8_0
            {
            pushFollow(FOLLOW_2);
            rule__Cell__SAlternatives_8_0();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getSAlternatives_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__SAssignment_8"


    // $ANTLR start "rule__Cell__AAssignment_10"
    // InternalTASKDSL.g:2559:1: rule__Cell__AAssignment_10 : ( ( rule__Cell__AAlternatives_10_0 ) ) ;
    public final void rule__Cell__AAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2563:1: ( ( ( rule__Cell__AAlternatives_10_0 ) ) )
            // InternalTASKDSL.g:2564:2: ( ( rule__Cell__AAlternatives_10_0 ) )
            {
            // InternalTASKDSL.g:2564:2: ( ( rule__Cell__AAlternatives_10_0 ) )
            // InternalTASKDSL.g:2565:3: ( rule__Cell__AAlternatives_10_0 )
            {
             before(grammarAccess.getCellAccess().getAAlternatives_10_0()); 
            // InternalTASKDSL.g:2566:3: ( rule__Cell__AAlternatives_10_0 )
            // InternalTASKDSL.g:2566:4: rule__Cell__AAlternatives_10_0
            {
            pushFollow(FOLLOW_2);
            rule__Cell__AAlternatives_10_0();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getAAlternatives_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__AAssignment_10"


    // $ANTLR start "rule__EvolutionRules__BoolAssignment_1"
    // InternalTASKDSL.g:2574:1: rule__EvolutionRules__BoolAssignment_1 : ( ruleExpression ) ;
    public final void rule__EvolutionRules__BoolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2578:1: ( ( ruleExpression ) )
            // InternalTASKDSL.g:2579:2: ( ruleExpression )
            {
            // InternalTASKDSL.g:2579:2: ( ruleExpression )
            // InternalTASKDSL.g:2580:3: ruleExpression
            {
             before(grammarAccess.getEvolutionRulesAccess().getBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEvolutionRulesAccess().getBoolExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolutionRules__BoolAssignment_1"


    // $ANTLR start "rule__OrExpression__RightAssignment_1_2"
    // InternalTASKDSL.g:2589:1: rule__OrExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2593:1: ( ( ruleAndExpression ) )
            // InternalTASKDSL.g:2594:2: ( ruleAndExpression )
            {
            // InternalTASKDSL.g:2594:2: ( ruleAndExpression )
            // InternalTASKDSL.g:2595:3: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_2"
    // InternalTASKDSL.g:2604:1: rule__AndExpression__RightAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2608:1: ( ( ruleComparisonExpression ) )
            // InternalTASKDSL.g:2609:2: ( ruleComparisonExpression )
            {
            // InternalTASKDSL.g:2609:2: ( ruleComparisonExpression )
            // InternalTASKDSL.g:2610:3: ruleComparisonExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__ComparisonExpression__OperatorAssignment_1_1"
    // InternalTASKDSL.g:2619:1: rule__ComparisonExpression__OperatorAssignment_1_1 : ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2623:1: ( ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) ) )
            // InternalTASKDSL.g:2624:2: ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) )
            {
            // InternalTASKDSL.g:2624:2: ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) )
            // InternalTASKDSL.g:2625:3: ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalTASKDSL.g:2626:3: ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 )
            // InternalTASKDSL.g:2626:4: rule__ComparisonExpression__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparisonExpression__RightAssignment_1_2"
    // InternalTASKDSL.g:2634:1: rule__ComparisonExpression__RightAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2638:1: ( ( rulePrimaryExpression ) )
            // InternalTASKDSL.g:2639:2: ( rulePrimaryExpression )
            {
            // InternalTASKDSL.g:2639:2: ( rulePrimaryExpression )
            // InternalTASKDSL.g:2640:3: rulePrimaryExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__RightAssignment_1_2"


    // $ANTLR start "rule__Literal__ValueAssignment_0_1"
    // InternalTASKDSL.g:2649:1: rule__Literal__ValueAssignment_0_1 : ( ( 'true' ) ) ;
    public final void rule__Literal__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:2653:1: ( ( ( 'true' ) ) )
            // InternalTASKDSL.g:2654:2: ( ( 'true' ) )
            {
            // InternalTASKDSL.g:2654:2: ( ( 'true' ) )
            // InternalTASKDSL.g:2655:3: ( 'true' )
            {
             before(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0()); 
            // InternalTASKDSL.g:2656:3: ( 'true' )
            // InternalTASKDSL.g:2657:4: 'true'
            {
             before(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0()); 

            }

             after(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ValueAssignment_0_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000280001000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000F80002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});

}