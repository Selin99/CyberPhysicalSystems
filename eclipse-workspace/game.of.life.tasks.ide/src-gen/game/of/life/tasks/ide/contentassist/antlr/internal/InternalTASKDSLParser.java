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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'>'", "'<'", "'>='", "'<='", "'Live'", "'Dead'", "'Birth'", "'OverCrowd'", "'xisolate'", "'Survive'", "'Game:'", "'GridSize:'", "'EvolutionRules:'", "'InitiallyActiveCells:'", "'AllCells:'", "'Height:'", "'Length:'", "'CoordinateInfo:'", "'x:'", "'y:'", "'Status:'", "'if'", "'neighborNo='", "'and'", "'Cell Status'", "'then'"
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


    // $ANTLR start "entryRuleStartGrid"
    // InternalTASKDSL.g:128:1: entryRuleStartGrid : ruleStartGrid EOF ;
    public final void entryRuleStartGrid() throws RecognitionException {
        try {
            // InternalTASKDSL.g:129:1: ( ruleStartGrid EOF )
            // InternalTASKDSL.g:130:1: ruleStartGrid EOF
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
    // InternalTASKDSL.g:137:1: ruleStartGrid : ( ( rule__StartGrid__Group__0 ) ) ;
    public final void ruleStartGrid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:141:2: ( ( ( rule__StartGrid__Group__0 ) ) )
            // InternalTASKDSL.g:142:2: ( ( rule__StartGrid__Group__0 ) )
            {
            // InternalTASKDSL.g:142:2: ( ( rule__StartGrid__Group__0 ) )
            // InternalTASKDSL.g:143:3: ( rule__StartGrid__Group__0 )
            {
             before(grammarAccess.getStartGridAccess().getGroup()); 
            // InternalTASKDSL.g:144:3: ( rule__StartGrid__Group__0 )
            // InternalTASKDSL.g:144:4: rule__StartGrid__Group__0
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
    // InternalTASKDSL.g:153:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalTASKDSL.g:154:1: ( ruleCell EOF )
            // InternalTASKDSL.g:155:1: ruleCell EOF
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
    // InternalTASKDSL.g:162:1: ruleCell : ( ( rule__Cell__Group__0 ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:166:2: ( ( ( rule__Cell__Group__0 ) ) )
            // InternalTASKDSL.g:167:2: ( ( rule__Cell__Group__0 ) )
            {
            // InternalTASKDSL.g:167:2: ( ( rule__Cell__Group__0 ) )
            // InternalTASKDSL.g:168:3: ( rule__Cell__Group__0 )
            {
             before(grammarAccess.getCellAccess().getGroup()); 
            // InternalTASKDSL.g:169:3: ( rule__Cell__Group__0 )
            // InternalTASKDSL.g:169:4: rule__Cell__Group__0
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
    // InternalTASKDSL.g:178:1: entryRuleevolutionRules : ruleevolutionRules EOF ;
    public final void entryRuleevolutionRules() throws RecognitionException {
        try {
            // InternalTASKDSL.g:179:1: ( ruleevolutionRules EOF )
            // InternalTASKDSL.g:180:1: ruleevolutionRules EOF
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
    // InternalTASKDSL.g:187:1: ruleevolutionRules : ( ( rule__EvolutionRules__Group__0 ) ) ;
    public final void ruleevolutionRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:191:2: ( ( ( rule__EvolutionRules__Group__0 ) ) )
            // InternalTASKDSL.g:192:2: ( ( rule__EvolutionRules__Group__0 ) )
            {
            // InternalTASKDSL.g:192:2: ( ( rule__EvolutionRules__Group__0 ) )
            // InternalTASKDSL.g:193:3: ( rule__EvolutionRules__Group__0 )
            {
             before(grammarAccess.getEvolutionRulesAccess().getGroup()); 
            // InternalTASKDSL.g:194:3: ( rule__EvolutionRules__Group__0 )
            // InternalTASKDSL.g:194:4: rule__EvolutionRules__Group__0
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


    // $ANTLR start "rulelogicalRelation"
    // InternalTASKDSL.g:203:1: rulelogicalRelation : ( ( rule__LogicalRelation__Alternatives ) ) ;
    public final void rulelogicalRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:207:1: ( ( ( rule__LogicalRelation__Alternatives ) ) )
            // InternalTASKDSL.g:208:2: ( ( rule__LogicalRelation__Alternatives ) )
            {
            // InternalTASKDSL.g:208:2: ( ( rule__LogicalRelation__Alternatives ) )
            // InternalTASKDSL.g:209:3: ( rule__LogicalRelation__Alternatives )
            {
             before(grammarAccess.getLogicalRelationAccess().getAlternatives()); 
            // InternalTASKDSL.g:210:3: ( rule__LogicalRelation__Alternatives )
            // InternalTASKDSL.g:210:4: rule__LogicalRelation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicalRelation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicalRelationAccess().getAlternatives()); 

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
    // $ANTLR end "rulelogicalRelation"


    // $ANTLR start "ruleStatus"
    // InternalTASKDSL.g:219:1: ruleStatus : ( ( rule__Status__Alternatives ) ) ;
    public final void ruleStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:223:1: ( ( ( rule__Status__Alternatives ) ) )
            // InternalTASKDSL.g:224:2: ( ( rule__Status__Alternatives ) )
            {
            // InternalTASKDSL.g:224:2: ( ( rule__Status__Alternatives ) )
            // InternalTASKDSL.g:225:3: ( rule__Status__Alternatives )
            {
             before(grammarAccess.getStatusAccess().getAlternatives()); 
            // InternalTASKDSL.g:226:3: ( rule__Status__Alternatives )
            // InternalTASKDSL.g:226:4: rule__Status__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Status__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatus"


    // $ANTLR start "ruleResult"
    // InternalTASKDSL.g:235:1: ruleResult : ( ( rule__Result__Alternatives ) ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:239:1: ( ( ( rule__Result__Alternatives ) ) )
            // InternalTASKDSL.g:240:2: ( ( rule__Result__Alternatives ) )
            {
            // InternalTASKDSL.g:240:2: ( ( rule__Result__Alternatives ) )
            // InternalTASKDSL.g:241:3: ( rule__Result__Alternatives )
            {
             before(grammarAccess.getResultAccess().getAlternatives()); 
            // InternalTASKDSL.g:242:3: ( rule__Result__Alternatives )
            // InternalTASKDSL.g:242:4: rule__Result__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Result__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResultAccess().getAlternatives()); 

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
    // $ANTLR end "ruleResult"


    // $ANTLR start "rule__LogicalRelation__Alternatives"
    // InternalTASKDSL.g:250:1: rule__LogicalRelation__Alternatives : ( ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__LogicalRelation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:254:1: ( ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTASKDSL.g:255:2: ( ( '==' ) )
                    {
                    // InternalTASKDSL.g:255:2: ( ( '==' ) )
                    // InternalTASKDSL.g:256:3: ( '==' )
                    {
                     before(grammarAccess.getLogicalRelationAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalTASKDSL.g:257:3: ( '==' )
                    // InternalTASKDSL.g:257:4: '=='
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicalRelationAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:261:2: ( ( '>' ) )
                    {
                    // InternalTASKDSL.g:261:2: ( ( '>' ) )
                    // InternalTASKDSL.g:262:3: ( '>' )
                    {
                     before(grammarAccess.getLogicalRelationAccess().getGREATERTHANEnumLiteralDeclaration_1()); 
                    // InternalTASKDSL.g:263:3: ( '>' )
                    // InternalTASKDSL.g:263:4: '>'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicalRelationAccess().getGREATERTHANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTASKDSL.g:267:2: ( ( '<' ) )
                    {
                    // InternalTASKDSL.g:267:2: ( ( '<' ) )
                    // InternalTASKDSL.g:268:3: ( '<' )
                    {
                     before(grammarAccess.getLogicalRelationAccess().getLESSTHANEnumLiteralDeclaration_2()); 
                    // InternalTASKDSL.g:269:3: ( '<' )
                    // InternalTASKDSL.g:269:4: '<'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicalRelationAccess().getLESSTHANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTASKDSL.g:273:2: ( ( '>=' ) )
                    {
                    // InternalTASKDSL.g:273:2: ( ( '>=' ) )
                    // InternalTASKDSL.g:274:3: ( '>=' )
                    {
                     before(grammarAccess.getLogicalRelationAccess().getGREATEROREQUALEnumLiteralDeclaration_3()); 
                    // InternalTASKDSL.g:275:3: ( '>=' )
                    // InternalTASKDSL.g:275:4: '>='
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicalRelationAccess().getGREATEROREQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTASKDSL.g:279:2: ( ( '<=' ) )
                    {
                    // InternalTASKDSL.g:279:2: ( ( '<=' ) )
                    // InternalTASKDSL.g:280:3: ( '<=' )
                    {
                     before(grammarAccess.getLogicalRelationAccess().getLESSOREQUALEnumLiteralDeclaration_4()); 
                    // InternalTASKDSL.g:281:3: ( '<=' )
                    // InternalTASKDSL.g:281:4: '<='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicalRelationAccess().getLESSOREQUALEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__LogicalRelation__Alternatives"


    // $ANTLR start "rule__Status__Alternatives"
    // InternalTASKDSL.g:289:1: rule__Status__Alternatives : ( ( ( 'Live' ) ) | ( ( 'Dead' ) ) );
    public final void rule__Status__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:293:1: ( ( ( 'Live' ) ) | ( ( 'Dead' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTASKDSL.g:294:2: ( ( 'Live' ) )
                    {
                    // InternalTASKDSL.g:294:2: ( ( 'Live' ) )
                    // InternalTASKDSL.g:295:3: ( 'Live' )
                    {
                     before(grammarAccess.getStatusAccess().getLIVEEnumLiteralDeclaration_0()); 
                    // InternalTASKDSL.g:296:3: ( 'Live' )
                    // InternalTASKDSL.g:296:4: 'Live'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatusAccess().getLIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:300:2: ( ( 'Dead' ) )
                    {
                    // InternalTASKDSL.g:300:2: ( ( 'Dead' ) )
                    // InternalTASKDSL.g:301:3: ( 'Dead' )
                    {
                     before(grammarAccess.getStatusAccess().getDEADEnumLiteralDeclaration_1()); 
                    // InternalTASKDSL.g:302:3: ( 'Dead' )
                    // InternalTASKDSL.g:302:4: 'Dead'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatusAccess().getDEADEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Status__Alternatives"


    // $ANTLR start "rule__Result__Alternatives"
    // InternalTASKDSL.g:310:1: rule__Result__Alternatives : ( ( ( 'Birth' ) ) | ( ( 'OverCrowd' ) ) | ( ( 'xisolate' ) ) | ( ( 'Survive' ) ) );
    public final void rule__Result__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:314:1: ( ( ( 'Birth' ) ) | ( ( 'OverCrowd' ) ) | ( ( 'xisolate' ) ) | ( ( 'Survive' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTASKDSL.g:315:2: ( ( 'Birth' ) )
                    {
                    // InternalTASKDSL.g:315:2: ( ( 'Birth' ) )
                    // InternalTASKDSL.g:316:3: ( 'Birth' )
                    {
                     before(grammarAccess.getResultAccess().getBIRTHEnumLiteralDeclaration_0()); 
                    // InternalTASKDSL.g:317:3: ( 'Birth' )
                    // InternalTASKDSL.g:317:4: 'Birth'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getResultAccess().getBIRTHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTASKDSL.g:321:2: ( ( 'OverCrowd' ) )
                    {
                    // InternalTASKDSL.g:321:2: ( ( 'OverCrowd' ) )
                    // InternalTASKDSL.g:322:3: ( 'OverCrowd' )
                    {
                     before(grammarAccess.getResultAccess().getOVERCROWDEnumLiteralDeclaration_1()); 
                    // InternalTASKDSL.g:323:3: ( 'OverCrowd' )
                    // InternalTASKDSL.g:323:4: 'OverCrowd'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getResultAccess().getOVERCROWDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTASKDSL.g:327:2: ( ( 'xisolate' ) )
                    {
                    // InternalTASKDSL.g:327:2: ( ( 'xisolate' ) )
                    // InternalTASKDSL.g:328:3: ( 'xisolate' )
                    {
                     before(grammarAccess.getResultAccess().getXSOLATEEnumLiteralDeclaration_2()); 
                    // InternalTASKDSL.g:329:3: ( 'xisolate' )
                    // InternalTASKDSL.g:329:4: 'xisolate'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getResultAccess().getXSOLATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTASKDSL.g:333:2: ( ( 'Survive' ) )
                    {
                    // InternalTASKDSL.g:333:2: ( ( 'Survive' ) )
                    // InternalTASKDSL.g:334:3: ( 'Survive' )
                    {
                     before(grammarAccess.getResultAccess().getSURVIVEEnumLiteralDeclaration_3()); 
                    // InternalTASKDSL.g:335:3: ( 'Survive' )
                    // InternalTASKDSL.g:335:4: 'Survive'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getResultAccess().getSURVIVEEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Result__Alternatives"


    // $ANTLR start "rule__Game__Group__0"
    // InternalTASKDSL.g:343:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:347:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalTASKDSL.g:348:2: rule__Game__Group__0__Impl rule__Game__Group__1
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
    // InternalTASKDSL.g:355:1: rule__Game__Group__0__Impl : ( 'Game:' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:359:1: ( ( 'Game:' ) )
            // InternalTASKDSL.g:360:1: ( 'Game:' )
            {
            // InternalTASKDSL.g:360:1: ( 'Game:' )
            // InternalTASKDSL.g:361:2: 'Game:'
            {
             before(grammarAccess.getGameAccess().getGameKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTASKDSL.g:370:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:374:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalTASKDSL.g:375:2: rule__Game__Group__1__Impl rule__Game__Group__2
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
    // InternalTASKDSL.g:382:1: rule__Game__Group__1__Impl : ( ( rule__Game__NameAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:386:1: ( ( ( rule__Game__NameAssignment_1 ) ) )
            // InternalTASKDSL.g:387:1: ( ( rule__Game__NameAssignment_1 ) )
            {
            // InternalTASKDSL.g:387:1: ( ( rule__Game__NameAssignment_1 ) )
            // InternalTASKDSL.g:388:2: ( rule__Game__NameAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getNameAssignment_1()); 
            // InternalTASKDSL.g:389:2: ( rule__Game__NameAssignment_1 )
            // InternalTASKDSL.g:389:3: rule__Game__NameAssignment_1
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
    // InternalTASKDSL.g:397:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:401:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalTASKDSL.g:402:2: rule__Game__Group__2__Impl rule__Game__Group__3
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
    // InternalTASKDSL.g:409:1: rule__Game__Group__2__Impl : ( 'GridSize:' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:413:1: ( ( 'GridSize:' ) )
            // InternalTASKDSL.g:414:1: ( 'GridSize:' )
            {
            // InternalTASKDSL.g:414:1: ( 'GridSize:' )
            // InternalTASKDSL.g:415:2: 'GridSize:'
            {
             before(grammarAccess.getGameAccess().getGridSizeKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getGridSizeKeyword_2()); 

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
    // InternalTASKDSL.g:424:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:428:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalTASKDSL.g:429:2: rule__Game__Group__3__Impl rule__Game__Group__4
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
    // InternalTASKDSL.g:436:1: rule__Game__Group__3__Impl : ( ( rule__Game__GridSizeAssignment_3 ) ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:440:1: ( ( ( rule__Game__GridSizeAssignment_3 ) ) )
            // InternalTASKDSL.g:441:1: ( ( rule__Game__GridSizeAssignment_3 ) )
            {
            // InternalTASKDSL.g:441:1: ( ( rule__Game__GridSizeAssignment_3 ) )
            // InternalTASKDSL.g:442:2: ( rule__Game__GridSizeAssignment_3 )
            {
             before(grammarAccess.getGameAccess().getGridSizeAssignment_3()); 
            // InternalTASKDSL.g:443:2: ( rule__Game__GridSizeAssignment_3 )
            // InternalTASKDSL.g:443:3: rule__Game__GridSizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Game__GridSizeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGridSizeAssignment_3()); 

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
    // InternalTASKDSL.g:451:1: rule__Game__Group__4 : rule__Game__Group__4__Impl rule__Game__Group__5 ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:455:1: ( rule__Game__Group__4__Impl rule__Game__Group__5 )
            // InternalTASKDSL.g:456:2: rule__Game__Group__4__Impl rule__Game__Group__5
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
    // InternalTASKDSL.g:463:1: rule__Game__Group__4__Impl : ( 'EvolutionRules:' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:467:1: ( ( 'EvolutionRules:' ) )
            // InternalTASKDSL.g:468:1: ( 'EvolutionRules:' )
            {
            // InternalTASKDSL.g:468:1: ( 'EvolutionRules:' )
            // InternalTASKDSL.g:469:2: 'EvolutionRules:'
            {
             before(grammarAccess.getGameAccess().getEvolutionRulesKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getEvolutionRulesKeyword_4()); 

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
    // InternalTASKDSL.g:478:1: rule__Game__Group__5 : rule__Game__Group__5__Impl rule__Game__Group__6 ;
    public final void rule__Game__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:482:1: ( rule__Game__Group__5__Impl rule__Game__Group__6 )
            // InternalTASKDSL.g:483:2: rule__Game__Group__5__Impl rule__Game__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalTASKDSL.g:490:1: rule__Game__Group__5__Impl : ( ( rule__Game__EvolutionRulesAssignment_5 )* ) ;
    public final void rule__Game__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:494:1: ( ( ( rule__Game__EvolutionRulesAssignment_5 )* ) )
            // InternalTASKDSL.g:495:1: ( ( rule__Game__EvolutionRulesAssignment_5 )* )
            {
            // InternalTASKDSL.g:495:1: ( ( rule__Game__EvolutionRulesAssignment_5 )* )
            // InternalTASKDSL.g:496:2: ( rule__Game__EvolutionRulesAssignment_5 )*
            {
             before(grammarAccess.getGameAccess().getEvolutionRulesAssignment_5()); 
            // InternalTASKDSL.g:497:2: ( rule__Game__EvolutionRulesAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==33) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTASKDSL.g:497:3: rule__Game__EvolutionRulesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Game__EvolutionRulesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getEvolutionRulesAssignment_5()); 

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
    // InternalTASKDSL.g:505:1: rule__Game__Group__6 : rule__Game__Group__6__Impl rule__Game__Group__7 ;
    public final void rule__Game__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:509:1: ( rule__Game__Group__6__Impl rule__Game__Group__7 )
            // InternalTASKDSL.g:510:2: rule__Game__Group__6__Impl rule__Game__Group__7
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
    // InternalTASKDSL.g:517:1: rule__Game__Group__6__Impl : ( 'InitiallyActiveCells:' ) ;
    public final void rule__Game__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:521:1: ( ( 'InitiallyActiveCells:' ) )
            // InternalTASKDSL.g:522:1: ( 'InitiallyActiveCells:' )
            {
            // InternalTASKDSL.g:522:1: ( 'InitiallyActiveCells:' )
            // InternalTASKDSL.g:523:2: 'InitiallyActiveCells:'
            {
             before(grammarAccess.getGameAccess().getInitiallyActiveCellsKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getInitiallyActiveCellsKeyword_6()); 

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
    // InternalTASKDSL.g:532:1: rule__Game__Group__7 : rule__Game__Group__7__Impl rule__Game__Group__8 ;
    public final void rule__Game__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:536:1: ( rule__Game__Group__7__Impl rule__Game__Group__8 )
            // InternalTASKDSL.g:537:2: rule__Game__Group__7__Impl rule__Game__Group__8
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
    // InternalTASKDSL.g:544:1: rule__Game__Group__7__Impl : ( ( rule__Game__StartGridAssignment_7 )* ) ;
    public final void rule__Game__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:548:1: ( ( ( rule__Game__StartGridAssignment_7 )* ) )
            // InternalTASKDSL.g:549:1: ( ( rule__Game__StartGridAssignment_7 )* )
            {
            // InternalTASKDSL.g:549:1: ( ( rule__Game__StartGridAssignment_7 )* )
            // InternalTASKDSL.g:550:2: ( rule__Game__StartGridAssignment_7 )*
            {
             before(grammarAccess.getGameAccess().getStartGridAssignment_7()); 
            // InternalTASKDSL.g:551:2: ( rule__Game__StartGridAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTASKDSL.g:551:3: rule__Game__StartGridAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Game__StartGridAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getStartGridAssignment_7()); 

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
    // InternalTASKDSL.g:559:1: rule__Game__Group__8 : rule__Game__Group__8__Impl rule__Game__Group__9 ;
    public final void rule__Game__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:563:1: ( rule__Game__Group__8__Impl rule__Game__Group__9 )
            // InternalTASKDSL.g:564:2: rule__Game__Group__8__Impl rule__Game__Group__9
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
    // InternalTASKDSL.g:571:1: rule__Game__Group__8__Impl : ( 'AllCells:' ) ;
    public final void rule__Game__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:575:1: ( ( 'AllCells:' ) )
            // InternalTASKDSL.g:576:1: ( 'AllCells:' )
            {
            // InternalTASKDSL.g:576:1: ( 'AllCells:' )
            // InternalTASKDSL.g:577:2: 'AllCells:'
            {
             before(grammarAccess.getGameAccess().getAllCellsKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getAllCellsKeyword_8()); 

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
    // InternalTASKDSL.g:586:1: rule__Game__Group__9 : rule__Game__Group__9__Impl ;
    public final void rule__Game__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:590:1: ( rule__Game__Group__9__Impl )
            // InternalTASKDSL.g:591:2: rule__Game__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__9__Impl();

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
    // InternalTASKDSL.g:597:1: rule__Game__Group__9__Impl : ( ( rule__Game__AllCellsAssignment_9 )* ) ;
    public final void rule__Game__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:601:1: ( ( ( rule__Game__AllCellsAssignment_9 )* ) )
            // InternalTASKDSL.g:602:1: ( ( rule__Game__AllCellsAssignment_9 )* )
            {
            // InternalTASKDSL.g:602:1: ( ( rule__Game__AllCellsAssignment_9 )* )
            // InternalTASKDSL.g:603:2: ( rule__Game__AllCellsAssignment_9 )*
            {
             before(grammarAccess.getGameAccess().getAllCellsAssignment_9()); 
            // InternalTASKDSL.g:604:2: ( rule__Game__AllCellsAssignment_9 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTASKDSL.g:604:3: rule__Game__AllCellsAssignment_9
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Game__AllCellsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getAllCellsAssignment_9()); 

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


    // $ANTLR start "rule__GridSize__Group__0"
    // InternalTASKDSL.g:613:1: rule__GridSize__Group__0 : rule__GridSize__Group__0__Impl rule__GridSize__Group__1 ;
    public final void rule__GridSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:617:1: ( rule__GridSize__Group__0__Impl rule__GridSize__Group__1 )
            // InternalTASKDSL.g:618:2: rule__GridSize__Group__0__Impl rule__GridSize__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalTASKDSL.g:625:1: rule__GridSize__Group__0__Impl : ( 'Height:' ) ;
    public final void rule__GridSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:629:1: ( ( 'Height:' ) )
            // InternalTASKDSL.g:630:1: ( 'Height:' )
            {
            // InternalTASKDSL.g:630:1: ( 'Height:' )
            // InternalTASKDSL.g:631:2: 'Height:'
            {
             before(grammarAccess.getGridSizeAccess().getHeightKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalTASKDSL.g:640:1: rule__GridSize__Group__1 : rule__GridSize__Group__1__Impl rule__GridSize__Group__2 ;
    public final void rule__GridSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:644:1: ( rule__GridSize__Group__1__Impl rule__GridSize__Group__2 )
            // InternalTASKDSL.g:645:2: rule__GridSize__Group__1__Impl rule__GridSize__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalTASKDSL.g:652:1: rule__GridSize__Group__1__Impl : ( ( rule__GridSize__HAssignment_1 ) ) ;
    public final void rule__GridSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:656:1: ( ( ( rule__GridSize__HAssignment_1 ) ) )
            // InternalTASKDSL.g:657:1: ( ( rule__GridSize__HAssignment_1 ) )
            {
            // InternalTASKDSL.g:657:1: ( ( rule__GridSize__HAssignment_1 ) )
            // InternalTASKDSL.g:658:2: ( rule__GridSize__HAssignment_1 )
            {
             before(grammarAccess.getGridSizeAccess().getHAssignment_1()); 
            // InternalTASKDSL.g:659:2: ( rule__GridSize__HAssignment_1 )
            // InternalTASKDSL.g:659:3: rule__GridSize__HAssignment_1
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
    // InternalTASKDSL.g:667:1: rule__GridSize__Group__2 : rule__GridSize__Group__2__Impl rule__GridSize__Group__3 ;
    public final void rule__GridSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:671:1: ( rule__GridSize__Group__2__Impl rule__GridSize__Group__3 )
            // InternalTASKDSL.g:672:2: rule__GridSize__Group__2__Impl rule__GridSize__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalTASKDSL.g:679:1: rule__GridSize__Group__2__Impl : ( 'Length:' ) ;
    public final void rule__GridSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:683:1: ( ( 'Length:' ) )
            // InternalTASKDSL.g:684:1: ( 'Length:' )
            {
            // InternalTASKDSL.g:684:1: ( 'Length:' )
            // InternalTASKDSL.g:685:2: 'Length:'
            {
             before(grammarAccess.getGridSizeAccess().getLengthKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalTASKDSL.g:694:1: rule__GridSize__Group__3 : rule__GridSize__Group__3__Impl ;
    public final void rule__GridSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:698:1: ( rule__GridSize__Group__3__Impl )
            // InternalTASKDSL.g:699:2: rule__GridSize__Group__3__Impl
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
    // InternalTASKDSL.g:705:1: rule__GridSize__Group__3__Impl : ( ( rule__GridSize__LAssignment_3 ) ) ;
    public final void rule__GridSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:709:1: ( ( ( rule__GridSize__LAssignment_3 ) ) )
            // InternalTASKDSL.g:710:1: ( ( rule__GridSize__LAssignment_3 ) )
            {
            // InternalTASKDSL.g:710:1: ( ( rule__GridSize__LAssignment_3 ) )
            // InternalTASKDSL.g:711:2: ( rule__GridSize__LAssignment_3 )
            {
             before(grammarAccess.getGridSizeAccess().getLAssignment_3()); 
            // InternalTASKDSL.g:712:2: ( rule__GridSize__LAssignment_3 )
            // InternalTASKDSL.g:712:3: rule__GridSize__LAssignment_3
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
    // InternalTASKDSL.g:721:1: rule__StartGrid__Group__0 : rule__StartGrid__Group__0__Impl rule__StartGrid__Group__1 ;
    public final void rule__StartGrid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:725:1: ( rule__StartGrid__Group__0__Impl rule__StartGrid__Group__1 )
            // InternalTASKDSL.g:726:2: rule__StartGrid__Group__0__Impl rule__StartGrid__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalTASKDSL.g:733:1: rule__StartGrid__Group__0__Impl : ( 'CoordinateInfo:' ) ;
    public final void rule__StartGrid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:737:1: ( ( 'CoordinateInfo:' ) )
            // InternalTASKDSL.g:738:1: ( 'CoordinateInfo:' )
            {
            // InternalTASKDSL.g:738:1: ( 'CoordinateInfo:' )
            // InternalTASKDSL.g:739:2: 'CoordinateInfo:'
            {
             before(grammarAccess.getStartGridAccess().getCoordinateInfoKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalTASKDSL.g:748:1: rule__StartGrid__Group__1 : rule__StartGrid__Group__1__Impl rule__StartGrid__Group__2 ;
    public final void rule__StartGrid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:752:1: ( rule__StartGrid__Group__1__Impl rule__StartGrid__Group__2 )
            // InternalTASKDSL.g:753:2: rule__StartGrid__Group__1__Impl rule__StartGrid__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalTASKDSL.g:760:1: rule__StartGrid__Group__1__Impl : ( 'x:' ) ;
    public final void rule__StartGrid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:764:1: ( ( 'x:' ) )
            // InternalTASKDSL.g:765:1: ( 'x:' )
            {
            // InternalTASKDSL.g:765:1: ( 'x:' )
            // InternalTASKDSL.g:766:2: 'x:'
            {
             before(grammarAccess.getStartGridAccess().getXKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalTASKDSL.g:775:1: rule__StartGrid__Group__2 : rule__StartGrid__Group__2__Impl rule__StartGrid__Group__3 ;
    public final void rule__StartGrid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:779:1: ( rule__StartGrid__Group__2__Impl rule__StartGrid__Group__3 )
            // InternalTASKDSL.g:780:2: rule__StartGrid__Group__2__Impl rule__StartGrid__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalTASKDSL.g:787:1: rule__StartGrid__Group__2__Impl : ( ( rule__StartGrid__XCAssignment_2 ) ) ;
    public final void rule__StartGrid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:791:1: ( ( ( rule__StartGrid__XCAssignment_2 ) ) )
            // InternalTASKDSL.g:792:1: ( ( rule__StartGrid__XCAssignment_2 ) )
            {
            // InternalTASKDSL.g:792:1: ( ( rule__StartGrid__XCAssignment_2 ) )
            // InternalTASKDSL.g:793:2: ( rule__StartGrid__XCAssignment_2 )
            {
             before(grammarAccess.getStartGridAccess().getXCAssignment_2()); 
            // InternalTASKDSL.g:794:2: ( rule__StartGrid__XCAssignment_2 )
            // InternalTASKDSL.g:794:3: rule__StartGrid__XCAssignment_2
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
    // InternalTASKDSL.g:802:1: rule__StartGrid__Group__3 : rule__StartGrid__Group__3__Impl rule__StartGrid__Group__4 ;
    public final void rule__StartGrid__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:806:1: ( rule__StartGrid__Group__3__Impl rule__StartGrid__Group__4 )
            // InternalTASKDSL.g:807:2: rule__StartGrid__Group__3__Impl rule__StartGrid__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalTASKDSL.g:814:1: rule__StartGrid__Group__3__Impl : ( 'y:' ) ;
    public final void rule__StartGrid__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:818:1: ( ( 'y:' ) )
            // InternalTASKDSL.g:819:1: ( 'y:' )
            {
            // InternalTASKDSL.g:819:1: ( 'y:' )
            // InternalTASKDSL.g:820:2: 'y:'
            {
             before(grammarAccess.getStartGridAccess().getYKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalTASKDSL.g:829:1: rule__StartGrid__Group__4 : rule__StartGrid__Group__4__Impl rule__StartGrid__Group__5 ;
    public final void rule__StartGrid__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:833:1: ( rule__StartGrid__Group__4__Impl rule__StartGrid__Group__5 )
            // InternalTASKDSL.g:834:2: rule__StartGrid__Group__4__Impl rule__StartGrid__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalTASKDSL.g:841:1: rule__StartGrid__Group__4__Impl : ( ( rule__StartGrid__YCAssignment_4 ) ) ;
    public final void rule__StartGrid__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:845:1: ( ( ( rule__StartGrid__YCAssignment_4 ) ) )
            // InternalTASKDSL.g:846:1: ( ( rule__StartGrid__YCAssignment_4 ) )
            {
            // InternalTASKDSL.g:846:1: ( ( rule__StartGrid__YCAssignment_4 ) )
            // InternalTASKDSL.g:847:2: ( rule__StartGrid__YCAssignment_4 )
            {
             before(grammarAccess.getStartGridAccess().getYCAssignment_4()); 
            // InternalTASKDSL.g:848:2: ( rule__StartGrid__YCAssignment_4 )
            // InternalTASKDSL.g:848:3: rule__StartGrid__YCAssignment_4
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
    // InternalTASKDSL.g:856:1: rule__StartGrid__Group__5 : rule__StartGrid__Group__5__Impl rule__StartGrid__Group__6 ;
    public final void rule__StartGrid__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:860:1: ( rule__StartGrid__Group__5__Impl rule__StartGrid__Group__6 )
            // InternalTASKDSL.g:861:2: rule__StartGrid__Group__5__Impl rule__StartGrid__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalTASKDSL.g:868:1: rule__StartGrid__Group__5__Impl : ( 'Status:' ) ;
    public final void rule__StartGrid__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:872:1: ( ( 'Status:' ) )
            // InternalTASKDSL.g:873:1: ( 'Status:' )
            {
            // InternalTASKDSL.g:873:1: ( 'Status:' )
            // InternalTASKDSL.g:874:2: 'Status:'
            {
             before(grammarAccess.getStartGridAccess().getStatusKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStartGridAccess().getStatusKeyword_5()); 

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
    // InternalTASKDSL.g:883:1: rule__StartGrid__Group__6 : rule__StartGrid__Group__6__Impl ;
    public final void rule__StartGrid__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:887:1: ( rule__StartGrid__Group__6__Impl )
            // InternalTASKDSL.g:888:2: rule__StartGrid__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartGrid__Group__6__Impl();

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
    // InternalTASKDSL.g:894:1: rule__StartGrid__Group__6__Impl : ( ( rule__StartGrid__SAssignment_6 ) ) ;
    public final void rule__StartGrid__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:898:1: ( ( ( rule__StartGrid__SAssignment_6 ) ) )
            // InternalTASKDSL.g:899:1: ( ( rule__StartGrid__SAssignment_6 ) )
            {
            // InternalTASKDSL.g:899:1: ( ( rule__StartGrid__SAssignment_6 ) )
            // InternalTASKDSL.g:900:2: ( rule__StartGrid__SAssignment_6 )
            {
             before(grammarAccess.getStartGridAccess().getSAssignment_6()); 
            // InternalTASKDSL.g:901:2: ( rule__StartGrid__SAssignment_6 )
            // InternalTASKDSL.g:901:3: rule__StartGrid__SAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__StartGrid__SAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStartGridAccess().getSAssignment_6()); 

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


    // $ANTLR start "rule__Cell__Group__0"
    // InternalTASKDSL.g:910:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:914:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalTASKDSL.g:915:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalTASKDSL.g:922:1: rule__Cell__Group__0__Impl : ( 'CoordinateInfo:' ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:926:1: ( ( 'CoordinateInfo:' ) )
            // InternalTASKDSL.g:927:1: ( 'CoordinateInfo:' )
            {
            // InternalTASKDSL.g:927:1: ( 'CoordinateInfo:' )
            // InternalTASKDSL.g:928:2: 'CoordinateInfo:'
            {
             before(grammarAccess.getCellAccess().getCoordinateInfoKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalTASKDSL.g:937:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl rule__Cell__Group__2 ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:941:1: ( rule__Cell__Group__1__Impl rule__Cell__Group__2 )
            // InternalTASKDSL.g:942:2: rule__Cell__Group__1__Impl rule__Cell__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalTASKDSL.g:949:1: rule__Cell__Group__1__Impl : ( 'x:' ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:953:1: ( ( 'x:' ) )
            // InternalTASKDSL.g:954:1: ( 'x:' )
            {
            // InternalTASKDSL.g:954:1: ( 'x:' )
            // InternalTASKDSL.g:955:2: 'x:'
            {
             before(grammarAccess.getCellAccess().getXKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalTASKDSL.g:964:1: rule__Cell__Group__2 : rule__Cell__Group__2__Impl rule__Cell__Group__3 ;
    public final void rule__Cell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:968:1: ( rule__Cell__Group__2__Impl rule__Cell__Group__3 )
            // InternalTASKDSL.g:969:2: rule__Cell__Group__2__Impl rule__Cell__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalTASKDSL.g:976:1: rule__Cell__Group__2__Impl : ( ( rule__Cell__XCAssignment_2 ) ) ;
    public final void rule__Cell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:980:1: ( ( ( rule__Cell__XCAssignment_2 ) ) )
            // InternalTASKDSL.g:981:1: ( ( rule__Cell__XCAssignment_2 ) )
            {
            // InternalTASKDSL.g:981:1: ( ( rule__Cell__XCAssignment_2 ) )
            // InternalTASKDSL.g:982:2: ( rule__Cell__XCAssignment_2 )
            {
             before(grammarAccess.getCellAccess().getXCAssignment_2()); 
            // InternalTASKDSL.g:983:2: ( rule__Cell__XCAssignment_2 )
            // InternalTASKDSL.g:983:3: rule__Cell__XCAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Cell__XCAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getXCAssignment_2()); 

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
    // InternalTASKDSL.g:991:1: rule__Cell__Group__3 : rule__Cell__Group__3__Impl rule__Cell__Group__4 ;
    public final void rule__Cell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:995:1: ( rule__Cell__Group__3__Impl rule__Cell__Group__4 )
            // InternalTASKDSL.g:996:2: rule__Cell__Group__3__Impl rule__Cell__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalTASKDSL.g:1003:1: rule__Cell__Group__3__Impl : ( 'y:' ) ;
    public final void rule__Cell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1007:1: ( ( 'y:' ) )
            // InternalTASKDSL.g:1008:1: ( 'y:' )
            {
            // InternalTASKDSL.g:1008:1: ( 'y:' )
            // InternalTASKDSL.g:1009:2: 'y:'
            {
             before(grammarAccess.getCellAccess().getYKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalTASKDSL.g:1018:1: rule__Cell__Group__4 : rule__Cell__Group__4__Impl rule__Cell__Group__5 ;
    public final void rule__Cell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1022:1: ( rule__Cell__Group__4__Impl rule__Cell__Group__5 )
            // InternalTASKDSL.g:1023:2: rule__Cell__Group__4__Impl rule__Cell__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalTASKDSL.g:1030:1: rule__Cell__Group__4__Impl : ( ( rule__Cell__YCAssignment_4 ) ) ;
    public final void rule__Cell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1034:1: ( ( ( rule__Cell__YCAssignment_4 ) ) )
            // InternalTASKDSL.g:1035:1: ( ( rule__Cell__YCAssignment_4 ) )
            {
            // InternalTASKDSL.g:1035:1: ( ( rule__Cell__YCAssignment_4 ) )
            // InternalTASKDSL.g:1036:2: ( rule__Cell__YCAssignment_4 )
            {
             before(grammarAccess.getCellAccess().getYCAssignment_4()); 
            // InternalTASKDSL.g:1037:2: ( rule__Cell__YCAssignment_4 )
            // InternalTASKDSL.g:1037:3: rule__Cell__YCAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Cell__YCAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getYCAssignment_4()); 

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
    // InternalTASKDSL.g:1045:1: rule__Cell__Group__5 : rule__Cell__Group__5__Impl rule__Cell__Group__6 ;
    public final void rule__Cell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1049:1: ( rule__Cell__Group__5__Impl rule__Cell__Group__6 )
            // InternalTASKDSL.g:1050:2: rule__Cell__Group__5__Impl rule__Cell__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalTASKDSL.g:1057:1: rule__Cell__Group__5__Impl : ( 'Status:' ) ;
    public final void rule__Cell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1061:1: ( ( 'Status:' ) )
            // InternalTASKDSL.g:1062:1: ( 'Status:' )
            {
            // InternalTASKDSL.g:1062:1: ( 'Status:' )
            // InternalTASKDSL.g:1063:2: 'Status:'
            {
             before(grammarAccess.getCellAccess().getStatusKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getStatusKeyword_5()); 

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
    // InternalTASKDSL.g:1072:1: rule__Cell__Group__6 : rule__Cell__Group__6__Impl ;
    public final void rule__Cell__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1076:1: ( rule__Cell__Group__6__Impl )
            // InternalTASKDSL.g:1077:2: rule__Cell__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__6__Impl();

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
    // InternalTASKDSL.g:1083:1: rule__Cell__Group__6__Impl : ( ( rule__Cell__SAssignment_6 ) ) ;
    public final void rule__Cell__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1087:1: ( ( ( rule__Cell__SAssignment_6 ) ) )
            // InternalTASKDSL.g:1088:1: ( ( rule__Cell__SAssignment_6 ) )
            {
            // InternalTASKDSL.g:1088:1: ( ( rule__Cell__SAssignment_6 ) )
            // InternalTASKDSL.g:1089:2: ( rule__Cell__SAssignment_6 )
            {
             before(grammarAccess.getCellAccess().getSAssignment_6()); 
            // InternalTASKDSL.g:1090:2: ( rule__Cell__SAssignment_6 )
            // InternalTASKDSL.g:1090:3: rule__Cell__SAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Cell__SAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getSAssignment_6()); 

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


    // $ANTLR start "rule__EvolutionRules__Group__0"
    // InternalTASKDSL.g:1099:1: rule__EvolutionRules__Group__0 : rule__EvolutionRules__Group__0__Impl rule__EvolutionRules__Group__1 ;
    public final void rule__EvolutionRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1103:1: ( rule__EvolutionRules__Group__0__Impl rule__EvolutionRules__Group__1 )
            // InternalTASKDSL.g:1104:2: rule__EvolutionRules__Group__0__Impl rule__EvolutionRules__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalTASKDSL.g:1111:1: rule__EvolutionRules__Group__0__Impl : ( 'if' ) ;
    public final void rule__EvolutionRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1115:1: ( ( 'if' ) )
            // InternalTASKDSL.g:1116:1: ( 'if' )
            {
            // InternalTASKDSL.g:1116:1: ( 'if' )
            // InternalTASKDSL.g:1117:2: 'if'
            {
             before(grammarAccess.getEvolutionRulesAccess().getIfKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalTASKDSL.g:1126:1: rule__EvolutionRules__Group__1 : rule__EvolutionRules__Group__1__Impl rule__EvolutionRules__Group__2 ;
    public final void rule__EvolutionRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1130:1: ( rule__EvolutionRules__Group__1__Impl rule__EvolutionRules__Group__2 )
            // InternalTASKDSL.g:1131:2: rule__EvolutionRules__Group__1__Impl rule__EvolutionRules__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalTASKDSL.g:1138:1: rule__EvolutionRules__Group__1__Impl : ( 'neighborNo=' ) ;
    public final void rule__EvolutionRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1142:1: ( ( 'neighborNo=' ) )
            // InternalTASKDSL.g:1143:1: ( 'neighborNo=' )
            {
            // InternalTASKDSL.g:1143:1: ( 'neighborNo=' )
            // InternalTASKDSL.g:1144:2: 'neighborNo='
            {
             before(grammarAccess.getEvolutionRulesAccess().getNeighborNoKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEvolutionRulesAccess().getNeighborNoKeyword_1()); 

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
    // InternalTASKDSL.g:1153:1: rule__EvolutionRules__Group__2 : rule__EvolutionRules__Group__2__Impl rule__EvolutionRules__Group__3 ;
    public final void rule__EvolutionRules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1157:1: ( rule__EvolutionRules__Group__2__Impl rule__EvolutionRules__Group__3 )
            // InternalTASKDSL.g:1158:2: rule__EvolutionRules__Group__2__Impl rule__EvolutionRules__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalTASKDSL.g:1165:1: rule__EvolutionRules__Group__2__Impl : ( ( rule__EvolutionRules__NNoAssignment_2 ) ) ;
    public final void rule__EvolutionRules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1169:1: ( ( ( rule__EvolutionRules__NNoAssignment_2 ) ) )
            // InternalTASKDSL.g:1170:1: ( ( rule__EvolutionRules__NNoAssignment_2 ) )
            {
            // InternalTASKDSL.g:1170:1: ( ( rule__EvolutionRules__NNoAssignment_2 ) )
            // InternalTASKDSL.g:1171:2: ( rule__EvolutionRules__NNoAssignment_2 )
            {
             before(grammarAccess.getEvolutionRulesAccess().getNNoAssignment_2()); 
            // InternalTASKDSL.g:1172:2: ( rule__EvolutionRules__NNoAssignment_2 )
            // InternalTASKDSL.g:1172:3: rule__EvolutionRules__NNoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__NNoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRulesAccess().getNNoAssignment_2()); 

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
    // InternalTASKDSL.g:1180:1: rule__EvolutionRules__Group__3 : rule__EvolutionRules__Group__3__Impl rule__EvolutionRules__Group__4 ;
    public final void rule__EvolutionRules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1184:1: ( rule__EvolutionRules__Group__3__Impl rule__EvolutionRules__Group__4 )
            // InternalTASKDSL.g:1185:2: rule__EvolutionRules__Group__3__Impl rule__EvolutionRules__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__EvolutionRules__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__4();

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
    // InternalTASKDSL.g:1192:1: rule__EvolutionRules__Group__3__Impl : ( ( rule__EvolutionRules__LAssignment_3 ) ) ;
    public final void rule__EvolutionRules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1196:1: ( ( ( rule__EvolutionRules__LAssignment_3 ) ) )
            // InternalTASKDSL.g:1197:1: ( ( rule__EvolutionRules__LAssignment_3 ) )
            {
            // InternalTASKDSL.g:1197:1: ( ( rule__EvolutionRules__LAssignment_3 ) )
            // InternalTASKDSL.g:1198:2: ( rule__EvolutionRules__LAssignment_3 )
            {
             before(grammarAccess.getEvolutionRulesAccess().getLAssignment_3()); 
            // InternalTASKDSL.g:1199:2: ( rule__EvolutionRules__LAssignment_3 )
            // InternalTASKDSL.g:1199:3: rule__EvolutionRules__LAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__LAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRulesAccess().getLAssignment_3()); 

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


    // $ANTLR start "rule__EvolutionRules__Group__4"
    // InternalTASKDSL.g:1207:1: rule__EvolutionRules__Group__4 : rule__EvolutionRules__Group__4__Impl rule__EvolutionRules__Group__5 ;
    public final void rule__EvolutionRules__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1211:1: ( rule__EvolutionRules__Group__4__Impl rule__EvolutionRules__Group__5 )
            // InternalTASKDSL.g:1212:2: rule__EvolutionRules__Group__4__Impl rule__EvolutionRules__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__EvolutionRules__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__5();

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
    // $ANTLR end "rule__EvolutionRules__Group__4"


    // $ANTLR start "rule__EvolutionRules__Group__4__Impl"
    // InternalTASKDSL.g:1219:1: rule__EvolutionRules__Group__4__Impl : ( ( rule__EvolutionRules__ComparedNoAssignment_4 ) ) ;
    public final void rule__EvolutionRules__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1223:1: ( ( ( rule__EvolutionRules__ComparedNoAssignment_4 ) ) )
            // InternalTASKDSL.g:1224:1: ( ( rule__EvolutionRules__ComparedNoAssignment_4 ) )
            {
            // InternalTASKDSL.g:1224:1: ( ( rule__EvolutionRules__ComparedNoAssignment_4 ) )
            // InternalTASKDSL.g:1225:2: ( rule__EvolutionRules__ComparedNoAssignment_4 )
            {
             before(grammarAccess.getEvolutionRulesAccess().getComparedNoAssignment_4()); 
            // InternalTASKDSL.g:1226:2: ( rule__EvolutionRules__ComparedNoAssignment_4 )
            // InternalTASKDSL.g:1226:3: rule__EvolutionRules__ComparedNoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__ComparedNoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRulesAccess().getComparedNoAssignment_4()); 

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
    // $ANTLR end "rule__EvolutionRules__Group__4__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__5"
    // InternalTASKDSL.g:1234:1: rule__EvolutionRules__Group__5 : rule__EvolutionRules__Group__5__Impl rule__EvolutionRules__Group__6 ;
    public final void rule__EvolutionRules__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1238:1: ( rule__EvolutionRules__Group__5__Impl rule__EvolutionRules__Group__6 )
            // InternalTASKDSL.g:1239:2: rule__EvolutionRules__Group__5__Impl rule__EvolutionRules__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__EvolutionRules__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__6();

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
    // $ANTLR end "rule__EvolutionRules__Group__5"


    // $ANTLR start "rule__EvolutionRules__Group__5__Impl"
    // InternalTASKDSL.g:1246:1: rule__EvolutionRules__Group__5__Impl : ( 'and' ) ;
    public final void rule__EvolutionRules__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1250:1: ( ( 'and' ) )
            // InternalTASKDSL.g:1251:1: ( 'and' )
            {
            // InternalTASKDSL.g:1251:1: ( 'and' )
            // InternalTASKDSL.g:1252:2: 'and'
            {
             before(grammarAccess.getEvolutionRulesAccess().getAndKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEvolutionRulesAccess().getAndKeyword_5()); 

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
    // $ANTLR end "rule__EvolutionRules__Group__5__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__6"
    // InternalTASKDSL.g:1261:1: rule__EvolutionRules__Group__6 : rule__EvolutionRules__Group__6__Impl rule__EvolutionRules__Group__7 ;
    public final void rule__EvolutionRules__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1265:1: ( rule__EvolutionRules__Group__6__Impl rule__EvolutionRules__Group__7 )
            // InternalTASKDSL.g:1266:2: rule__EvolutionRules__Group__6__Impl rule__EvolutionRules__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__EvolutionRules__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__7();

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
    // $ANTLR end "rule__EvolutionRules__Group__6"


    // $ANTLR start "rule__EvolutionRules__Group__6__Impl"
    // InternalTASKDSL.g:1273:1: rule__EvolutionRules__Group__6__Impl : ( 'Cell Status' ) ;
    public final void rule__EvolutionRules__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1277:1: ( ( 'Cell Status' ) )
            // InternalTASKDSL.g:1278:1: ( 'Cell Status' )
            {
            // InternalTASKDSL.g:1278:1: ( 'Cell Status' )
            // InternalTASKDSL.g:1279:2: 'Cell Status'
            {
             before(grammarAccess.getEvolutionRulesAccess().getCellStatusKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEvolutionRulesAccess().getCellStatusKeyword_6()); 

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
    // $ANTLR end "rule__EvolutionRules__Group__6__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__7"
    // InternalTASKDSL.g:1288:1: rule__EvolutionRules__Group__7 : rule__EvolutionRules__Group__7__Impl rule__EvolutionRules__Group__8 ;
    public final void rule__EvolutionRules__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1292:1: ( rule__EvolutionRules__Group__7__Impl rule__EvolutionRules__Group__8 )
            // InternalTASKDSL.g:1293:2: rule__EvolutionRules__Group__7__Impl rule__EvolutionRules__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__EvolutionRules__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__8();

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
    // $ANTLR end "rule__EvolutionRules__Group__7"


    // $ANTLR start "rule__EvolutionRules__Group__7__Impl"
    // InternalTASKDSL.g:1300:1: rule__EvolutionRules__Group__7__Impl : ( ( rule__EvolutionRules__SAssignment_7 ) ) ;
    public final void rule__EvolutionRules__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1304:1: ( ( ( rule__EvolutionRules__SAssignment_7 ) ) )
            // InternalTASKDSL.g:1305:1: ( ( rule__EvolutionRules__SAssignment_7 ) )
            {
            // InternalTASKDSL.g:1305:1: ( ( rule__EvolutionRules__SAssignment_7 ) )
            // InternalTASKDSL.g:1306:2: ( rule__EvolutionRules__SAssignment_7 )
            {
             before(grammarAccess.getEvolutionRulesAccess().getSAssignment_7()); 
            // InternalTASKDSL.g:1307:2: ( rule__EvolutionRules__SAssignment_7 )
            // InternalTASKDSL.g:1307:3: rule__EvolutionRules__SAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__SAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRulesAccess().getSAssignment_7()); 

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
    // $ANTLR end "rule__EvolutionRules__Group__7__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__8"
    // InternalTASKDSL.g:1315:1: rule__EvolutionRules__Group__8 : rule__EvolutionRules__Group__8__Impl rule__EvolutionRules__Group__9 ;
    public final void rule__EvolutionRules__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1319:1: ( rule__EvolutionRules__Group__8__Impl rule__EvolutionRules__Group__9 )
            // InternalTASKDSL.g:1320:2: rule__EvolutionRules__Group__8__Impl rule__EvolutionRules__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__EvolutionRules__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__9();

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
    // $ANTLR end "rule__EvolutionRules__Group__8"


    // $ANTLR start "rule__EvolutionRules__Group__8__Impl"
    // InternalTASKDSL.g:1327:1: rule__EvolutionRules__Group__8__Impl : ( 'then' ) ;
    public final void rule__EvolutionRules__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1331:1: ( ( 'then' ) )
            // InternalTASKDSL.g:1332:1: ( 'then' )
            {
            // InternalTASKDSL.g:1332:1: ( 'then' )
            // InternalTASKDSL.g:1333:2: 'then'
            {
             before(grammarAccess.getEvolutionRulesAccess().getThenKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEvolutionRulesAccess().getThenKeyword_8()); 

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
    // $ANTLR end "rule__EvolutionRules__Group__8__Impl"


    // $ANTLR start "rule__EvolutionRules__Group__9"
    // InternalTASKDSL.g:1342:1: rule__EvolutionRules__Group__9 : rule__EvolutionRules__Group__9__Impl ;
    public final void rule__EvolutionRules__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1346:1: ( rule__EvolutionRules__Group__9__Impl )
            // InternalTASKDSL.g:1347:2: rule__EvolutionRules__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__Group__9__Impl();

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
    // $ANTLR end "rule__EvolutionRules__Group__9"


    // $ANTLR start "rule__EvolutionRules__Group__9__Impl"
    // InternalTASKDSL.g:1353:1: rule__EvolutionRules__Group__9__Impl : ( ( rule__EvolutionRules__ResultAssignment_9 ) ) ;
    public final void rule__EvolutionRules__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1357:1: ( ( ( rule__EvolutionRules__ResultAssignment_9 ) ) )
            // InternalTASKDSL.g:1358:1: ( ( rule__EvolutionRules__ResultAssignment_9 ) )
            {
            // InternalTASKDSL.g:1358:1: ( ( rule__EvolutionRules__ResultAssignment_9 ) )
            // InternalTASKDSL.g:1359:2: ( rule__EvolutionRules__ResultAssignment_9 )
            {
             before(grammarAccess.getEvolutionRulesAccess().getResultAssignment_9()); 
            // InternalTASKDSL.g:1360:2: ( rule__EvolutionRules__ResultAssignment_9 )
            // InternalTASKDSL.g:1360:3: rule__EvolutionRules__ResultAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRules__ResultAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRulesAccess().getResultAssignment_9()); 

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
    // $ANTLR end "rule__EvolutionRules__Group__9__Impl"


    // $ANTLR start "rule__Game__NameAssignment_1"
    // InternalTASKDSL.g:1369:1: rule__Game__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Game__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1373:1: ( ( RULE_ID ) )
            // InternalTASKDSL.g:1374:2: ( RULE_ID )
            {
            // InternalTASKDSL.g:1374:2: ( RULE_ID )
            // InternalTASKDSL.g:1375:3: RULE_ID
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


    // $ANTLR start "rule__Game__GridSizeAssignment_3"
    // InternalTASKDSL.g:1384:1: rule__Game__GridSizeAssignment_3 : ( ruleGridSize ) ;
    public final void rule__Game__GridSizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1388:1: ( ( ruleGridSize ) )
            // InternalTASKDSL.g:1389:2: ( ruleGridSize )
            {
            // InternalTASKDSL.g:1389:2: ( ruleGridSize )
            // InternalTASKDSL.g:1390:3: ruleGridSize
            {
             before(grammarAccess.getGameAccess().getGridSizeGridSizeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGridSize();

            state._fsp--;

             after(grammarAccess.getGameAccess().getGridSizeGridSizeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Game__GridSizeAssignment_3"


    // $ANTLR start "rule__Game__EvolutionRulesAssignment_5"
    // InternalTASKDSL.g:1399:1: rule__Game__EvolutionRulesAssignment_5 : ( ruleevolutionRules ) ;
    public final void rule__Game__EvolutionRulesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1403:1: ( ( ruleevolutionRules ) )
            // InternalTASKDSL.g:1404:2: ( ruleevolutionRules )
            {
            // InternalTASKDSL.g:1404:2: ( ruleevolutionRules )
            // InternalTASKDSL.g:1405:3: ruleevolutionRules
            {
             before(grammarAccess.getGameAccess().getEvolutionRulesEvolutionRulesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleevolutionRules();

            state._fsp--;

             after(grammarAccess.getGameAccess().getEvolutionRulesEvolutionRulesParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Game__EvolutionRulesAssignment_5"


    // $ANTLR start "rule__Game__StartGridAssignment_7"
    // InternalTASKDSL.g:1414:1: rule__Game__StartGridAssignment_7 : ( ruleStartGrid ) ;
    public final void rule__Game__StartGridAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1418:1: ( ( ruleStartGrid ) )
            // InternalTASKDSL.g:1419:2: ( ruleStartGrid )
            {
            // InternalTASKDSL.g:1419:2: ( ruleStartGrid )
            // InternalTASKDSL.g:1420:3: ruleStartGrid
            {
             before(grammarAccess.getGameAccess().getStartGridStartGridParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleStartGrid();

            state._fsp--;

             after(grammarAccess.getGameAccess().getStartGridStartGridParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Game__StartGridAssignment_7"


    // $ANTLR start "rule__Game__AllCellsAssignment_9"
    // InternalTASKDSL.g:1429:1: rule__Game__AllCellsAssignment_9 : ( ruleCell ) ;
    public final void rule__Game__AllCellsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1433:1: ( ( ruleCell ) )
            // InternalTASKDSL.g:1434:2: ( ruleCell )
            {
            // InternalTASKDSL.g:1434:2: ( ruleCell )
            // InternalTASKDSL.g:1435:3: ruleCell
            {
             before(grammarAccess.getGameAccess().getAllCellsCellParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getGameAccess().getAllCellsCellParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Game__AllCellsAssignment_9"


    // $ANTLR start "rule__GridSize__HAssignment_1"
    // InternalTASKDSL.g:1444:1: rule__GridSize__HAssignment_1 : ( RULE_INT ) ;
    public final void rule__GridSize__HAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1448:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:1449:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:1449:2: ( RULE_INT )
            // InternalTASKDSL.g:1450:3: RULE_INT
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
    // InternalTASKDSL.g:1459:1: rule__GridSize__LAssignment_3 : ( RULE_INT ) ;
    public final void rule__GridSize__LAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1463:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:1464:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:1464:2: ( RULE_INT )
            // InternalTASKDSL.g:1465:3: RULE_INT
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


    // $ANTLR start "rule__StartGrid__XCAssignment_2"
    // InternalTASKDSL.g:1474:1: rule__StartGrid__XCAssignment_2 : ( RULE_INT ) ;
    public final void rule__StartGrid__XCAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1478:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:1479:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:1479:2: ( RULE_INT )
            // InternalTASKDSL.g:1480:3: RULE_INT
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
    // InternalTASKDSL.g:1489:1: rule__StartGrid__YCAssignment_4 : ( RULE_INT ) ;
    public final void rule__StartGrid__YCAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1493:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:1494:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:1494:2: ( RULE_INT )
            // InternalTASKDSL.g:1495:3: RULE_INT
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


    // $ANTLR start "rule__StartGrid__SAssignment_6"
    // InternalTASKDSL.g:1504:1: rule__StartGrid__SAssignment_6 : ( ruleStatus ) ;
    public final void rule__StartGrid__SAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1508:1: ( ( ruleStatus ) )
            // InternalTASKDSL.g:1509:2: ( ruleStatus )
            {
            // InternalTASKDSL.g:1509:2: ( ruleStatus )
            // InternalTASKDSL.g:1510:3: ruleStatus
            {
             before(grammarAccess.getStartGridAccess().getSStatusEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getStartGridAccess().getSStatusEnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__StartGrid__SAssignment_6"


    // $ANTLR start "rule__Cell__XCAssignment_2"
    // InternalTASKDSL.g:1519:1: rule__Cell__XCAssignment_2 : ( RULE_INT ) ;
    public final void rule__Cell__XCAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1523:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:1524:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:1524:2: ( RULE_INT )
            // InternalTASKDSL.g:1525:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getXCINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getXCINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Cell__XCAssignment_2"


    // $ANTLR start "rule__Cell__YCAssignment_4"
    // InternalTASKDSL.g:1534:1: rule__Cell__YCAssignment_4 : ( RULE_INT ) ;
    public final void rule__Cell__YCAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1538:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:1539:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:1539:2: ( RULE_INT )
            // InternalTASKDSL.g:1540:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getYCINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getYCINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Cell__YCAssignment_4"


    // $ANTLR start "rule__Cell__SAssignment_6"
    // InternalTASKDSL.g:1549:1: rule__Cell__SAssignment_6 : ( ruleStatus ) ;
    public final void rule__Cell__SAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1553:1: ( ( ruleStatus ) )
            // InternalTASKDSL.g:1554:2: ( ruleStatus )
            {
            // InternalTASKDSL.g:1554:2: ( ruleStatus )
            // InternalTASKDSL.g:1555:3: ruleStatus
            {
             before(grammarAccess.getCellAccess().getSStatusEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getCellAccess().getSStatusEnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__Cell__SAssignment_6"


    // $ANTLR start "rule__EvolutionRules__NNoAssignment_2"
    // InternalTASKDSL.g:1564:1: rule__EvolutionRules__NNoAssignment_2 : ( RULE_INT ) ;
    public final void rule__EvolutionRules__NNoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1568:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:1569:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:1569:2: ( RULE_INT )
            // InternalTASKDSL.g:1570:3: RULE_INT
            {
             before(grammarAccess.getEvolutionRulesAccess().getNNoINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEvolutionRulesAccess().getNNoINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__EvolutionRules__NNoAssignment_2"


    // $ANTLR start "rule__EvolutionRules__LAssignment_3"
    // InternalTASKDSL.g:1579:1: rule__EvolutionRules__LAssignment_3 : ( rulelogicalRelation ) ;
    public final void rule__EvolutionRules__LAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1583:1: ( ( rulelogicalRelation ) )
            // InternalTASKDSL.g:1584:2: ( rulelogicalRelation )
            {
            // InternalTASKDSL.g:1584:2: ( rulelogicalRelation )
            // InternalTASKDSL.g:1585:3: rulelogicalRelation
            {
             before(grammarAccess.getEvolutionRulesAccess().getLLogicalRelationEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulelogicalRelation();

            state._fsp--;

             after(grammarAccess.getEvolutionRulesAccess().getLLogicalRelationEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__EvolutionRules__LAssignment_3"


    // $ANTLR start "rule__EvolutionRules__ComparedNoAssignment_4"
    // InternalTASKDSL.g:1594:1: rule__EvolutionRules__ComparedNoAssignment_4 : ( RULE_INT ) ;
    public final void rule__EvolutionRules__ComparedNoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1598:1: ( ( RULE_INT ) )
            // InternalTASKDSL.g:1599:2: ( RULE_INT )
            {
            // InternalTASKDSL.g:1599:2: ( RULE_INT )
            // InternalTASKDSL.g:1600:3: RULE_INT
            {
             before(grammarAccess.getEvolutionRulesAccess().getComparedNoINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEvolutionRulesAccess().getComparedNoINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__EvolutionRules__ComparedNoAssignment_4"


    // $ANTLR start "rule__EvolutionRules__SAssignment_7"
    // InternalTASKDSL.g:1609:1: rule__EvolutionRules__SAssignment_7 : ( ruleStatus ) ;
    public final void rule__EvolutionRules__SAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1613:1: ( ( ruleStatus ) )
            // InternalTASKDSL.g:1614:2: ( ruleStatus )
            {
            // InternalTASKDSL.g:1614:2: ( ruleStatus )
            // InternalTASKDSL.g:1615:3: ruleStatus
            {
             before(grammarAccess.getEvolutionRulesAccess().getSStatusEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getEvolutionRulesAccess().getSStatusEnumRuleCall_7_0()); 

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
    // $ANTLR end "rule__EvolutionRules__SAssignment_7"


    // $ANTLR start "rule__EvolutionRules__ResultAssignment_9"
    // InternalTASKDSL.g:1624:1: rule__EvolutionRules__ResultAssignment_9 : ( ruleResult ) ;
    public final void rule__EvolutionRules__ResultAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTASKDSL.g:1628:1: ( ( ruleResult ) )
            // InternalTASKDSL.g:1629:2: ( ruleResult )
            {
            // InternalTASKDSL.g:1629:2: ( ruleResult )
            // InternalTASKDSL.g:1630:3: ruleResult
            {
             before(grammarAccess.getEvolutionRulesAccess().getResultResultEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getEvolutionRulesAccess().getResultResultEnumRuleCall_9_0()); 

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
    // $ANTLR end "rule__EvolutionRules__ResultAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000003C0000L});

}