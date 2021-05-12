package org.mdse.puzzle.dsl.ide.contentassist.antlr.internal;

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
import org.mdse.puzzle.dsl.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_REALINT", "RULE_BOOLEAN", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PUZZLE'", "'{'", "'name'", "'='", "'description'", "'}'", "'INPUTS'", "'TEST'", "'EXPECTS'", "'ON_FAIL'", "'msg'", "'int'", "'string'", "'bool'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int RULE_REALINT=6;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDSL.g"; }


    	private DSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePuzzle"
    // InternalDSL.g:53:1: entryRulePuzzle : rulePuzzle EOF ;
    public final void entryRulePuzzle() throws RecognitionException {
        try {
            // InternalDSL.g:54:1: ( rulePuzzle EOF )
            // InternalDSL.g:55:1: rulePuzzle EOF
            {
             before(grammarAccess.getPuzzleRule()); 
            pushFollow(FOLLOW_1);
            rulePuzzle();

            state._fsp--;

             after(grammarAccess.getPuzzleRule()); 
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
    // $ANTLR end "entryRulePuzzle"


    // $ANTLR start "rulePuzzle"
    // InternalDSL.g:62:1: rulePuzzle : ( ( rule__Puzzle__Group__0 ) ) ;
    public final void rulePuzzle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:66:2: ( ( ( rule__Puzzle__Group__0 ) ) )
            // InternalDSL.g:67:2: ( ( rule__Puzzle__Group__0 ) )
            {
            // InternalDSL.g:67:2: ( ( rule__Puzzle__Group__0 ) )
            // InternalDSL.g:68:3: ( rule__Puzzle__Group__0 )
            {
             before(grammarAccess.getPuzzleAccess().getGroup()); 
            // InternalDSL.g:69:3: ( rule__Puzzle__Group__0 )
            // InternalDSL.g:69:4: rule__Puzzle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Puzzle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPuzzleAccess().getGroup()); 

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
    // $ANTLR end "rulePuzzle"


    // $ANTLR start "entryRuleInputs"
    // InternalDSL.g:78:1: entryRuleInputs : ruleInputs EOF ;
    public final void entryRuleInputs() throws RecognitionException {
        try {
            // InternalDSL.g:79:1: ( ruleInputs EOF )
            // InternalDSL.g:80:1: ruleInputs EOF
            {
             before(grammarAccess.getInputsRule()); 
            pushFollow(FOLLOW_1);
            ruleInputs();

            state._fsp--;

             after(grammarAccess.getInputsRule()); 
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
    // $ANTLR end "entryRuleInputs"


    // $ANTLR start "ruleInputs"
    // InternalDSL.g:87:1: ruleInputs : ( ( rule__Inputs__Group__0 ) ) ;
    public final void ruleInputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:91:2: ( ( ( rule__Inputs__Group__0 ) ) )
            // InternalDSL.g:92:2: ( ( rule__Inputs__Group__0 ) )
            {
            // InternalDSL.g:92:2: ( ( rule__Inputs__Group__0 ) )
            // InternalDSL.g:93:3: ( rule__Inputs__Group__0 )
            {
             before(grammarAccess.getInputsAccess().getGroup()); 
            // InternalDSL.g:94:3: ( rule__Inputs__Group__0 )
            // InternalDSL.g:94:4: rule__Inputs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inputs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputsAccess().getGroup()); 

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
    // $ANTLR end "ruleInputs"


    // $ANTLR start "entryRuleUnitTest"
    // InternalDSL.g:103:1: entryRuleUnitTest : ruleUnitTest EOF ;
    public final void entryRuleUnitTest() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleUnitTest EOF )
            // InternalDSL.g:105:1: ruleUnitTest EOF
            {
             before(grammarAccess.getUnitTestRule()); 
            pushFollow(FOLLOW_1);
            ruleUnitTest();

            state._fsp--;

             after(grammarAccess.getUnitTestRule()); 
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
    // $ANTLR end "entryRuleUnitTest"


    // $ANTLR start "ruleUnitTest"
    // InternalDSL.g:112:1: ruleUnitTest : ( ( rule__UnitTest__Group__0 ) ) ;
    public final void ruleUnitTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__UnitTest__Group__0 ) ) )
            // InternalDSL.g:117:2: ( ( rule__UnitTest__Group__0 ) )
            {
            // InternalDSL.g:117:2: ( ( rule__UnitTest__Group__0 ) )
            // InternalDSL.g:118:3: ( rule__UnitTest__Group__0 )
            {
             before(grammarAccess.getUnitTestAccess().getGroup()); 
            // InternalDSL.g:119:3: ( rule__UnitTest__Group__0 )
            // InternalDSL.g:119:4: rule__UnitTest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnitTest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnitTestAccess().getGroup()); 

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
    // $ANTLR end "ruleUnitTest"


    // $ANTLR start "entryRuleUnitTestInput"
    // InternalDSL.g:128:1: entryRuleUnitTestInput : ruleUnitTestInput EOF ;
    public final void entryRuleUnitTestInput() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( ruleUnitTestInput EOF )
            // InternalDSL.g:130:1: ruleUnitTestInput EOF
            {
             before(grammarAccess.getUnitTestInputRule()); 
            pushFollow(FOLLOW_1);
            ruleUnitTestInput();

            state._fsp--;

             after(grammarAccess.getUnitTestInputRule()); 
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
    // $ANTLR end "entryRuleUnitTestInput"


    // $ANTLR start "ruleUnitTestInput"
    // InternalDSL.g:137:1: ruleUnitTestInput : ( ( rule__UnitTestInput__Group__0 ) ) ;
    public final void ruleUnitTestInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__UnitTestInput__Group__0 ) ) )
            // InternalDSL.g:142:2: ( ( rule__UnitTestInput__Group__0 ) )
            {
            // InternalDSL.g:142:2: ( ( rule__UnitTestInput__Group__0 ) )
            // InternalDSL.g:143:3: ( rule__UnitTestInput__Group__0 )
            {
             before(grammarAccess.getUnitTestInputAccess().getGroup()); 
            // InternalDSL.g:144:3: ( rule__UnitTestInput__Group__0 )
            // InternalDSL.g:144:4: rule__UnitTestInput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnitTestInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnitTestInputAccess().getGroup()); 

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
    // $ANTLR end "ruleUnitTestInput"


    // $ANTLR start "entryRuleLiteral"
    // InternalDSL.g:153:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleLiteral EOF )
            // InternalDSL.g:155:1: ruleLiteral EOF
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
    // InternalDSL.g:162:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalDSL.g:167:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalDSL.g:167:2: ( ( rule__Literal__Alternatives ) )
            // InternalDSL.g:168:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalDSL.g:169:3: ( rule__Literal__Alternatives )
            // InternalDSL.g:169:4: rule__Literal__Alternatives
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


    // $ANTLR start "entryRuleIntergerLiteral"
    // InternalDSL.g:178:1: entryRuleIntergerLiteral : ruleIntergerLiteral EOF ;
    public final void entryRuleIntergerLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleIntergerLiteral EOF )
            // InternalDSL.g:180:1: ruleIntergerLiteral EOF
            {
             before(grammarAccess.getIntergerLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntergerLiteral();

            state._fsp--;

             after(grammarAccess.getIntergerLiteralRule()); 
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
    // $ANTLR end "entryRuleIntergerLiteral"


    // $ANTLR start "ruleIntergerLiteral"
    // InternalDSL.g:187:1: ruleIntergerLiteral : ( ( rule__IntergerLiteral__Group__0 ) ) ;
    public final void ruleIntergerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__IntergerLiteral__Group__0 ) ) )
            // InternalDSL.g:192:2: ( ( rule__IntergerLiteral__Group__0 ) )
            {
            // InternalDSL.g:192:2: ( ( rule__IntergerLiteral__Group__0 ) )
            // InternalDSL.g:193:3: ( rule__IntergerLiteral__Group__0 )
            {
             before(grammarAccess.getIntergerLiteralAccess().getGroup()); 
            // InternalDSL.g:194:3: ( rule__IntergerLiteral__Group__0 )
            // InternalDSL.g:194:4: rule__IntergerLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntergerLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntergerLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleIntergerLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalDSL.g:203:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleStringLiteral EOF )
            // InternalDSL.g:205:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalDSL.g:212:1: ruleStringLiteral : ( ( rule__StringLiteral__Group__0 ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__StringLiteral__Group__0 ) ) )
            // InternalDSL.g:217:2: ( ( rule__StringLiteral__Group__0 ) )
            {
            // InternalDSL.g:217:2: ( ( rule__StringLiteral__Group__0 ) )
            // InternalDSL.g:218:3: ( rule__StringLiteral__Group__0 )
            {
             before(grammarAccess.getStringLiteralAccess().getGroup()); 
            // InternalDSL.g:219:3: ( rule__StringLiteral__Group__0 )
            // InternalDSL.g:219:4: rule__StringLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalDSL.g:228:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleBooleanLiteral EOF )
            // InternalDSL.g:230:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalDSL.g:237:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Group__0 ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__BooleanLiteral__Group__0 ) ) )
            // InternalDSL.g:242:2: ( ( rule__BooleanLiteral__Group__0 ) )
            {
            // InternalDSL.g:242:2: ( ( rule__BooleanLiteral__Group__0 ) )
            // InternalDSL.g:243:3: ( rule__BooleanLiteral__Group__0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            // InternalDSL.g:244:3: ( rule__BooleanLiteral__Group__0 )
            // InternalDSL.g:244:4: rule__BooleanLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleVariable"
    // InternalDSL.g:253:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( ruleVariable EOF )
            // InternalDSL.g:255:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalDSL.g:262:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( ( rule__Variable__Alternatives ) ) )
            // InternalDSL.g:267:2: ( ( rule__Variable__Alternatives ) )
            {
            // InternalDSL.g:267:2: ( ( rule__Variable__Alternatives ) )
            // InternalDSL.g:268:3: ( rule__Variable__Alternatives )
            {
             before(grammarAccess.getVariableAccess().getAlternatives()); 
            // InternalDSL.g:269:3: ( rule__Variable__Alternatives )
            // InternalDSL.g:269:4: rule__Variable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleIntegerVariable"
    // InternalDSL.g:278:1: entryRuleIntegerVariable : ruleIntegerVariable EOF ;
    public final void entryRuleIntegerVariable() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleIntegerVariable EOF )
            // InternalDSL.g:280:1: ruleIntegerVariable EOF
            {
             before(grammarAccess.getIntegerVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerVariable();

            state._fsp--;

             after(grammarAccess.getIntegerVariableRule()); 
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
    // $ANTLR end "entryRuleIntegerVariable"


    // $ANTLR start "ruleIntegerVariable"
    // InternalDSL.g:287:1: ruleIntegerVariable : ( ( rule__IntegerVariable__Group__0 ) ) ;
    public final void ruleIntegerVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__IntegerVariable__Group__0 ) ) )
            // InternalDSL.g:292:2: ( ( rule__IntegerVariable__Group__0 ) )
            {
            // InternalDSL.g:292:2: ( ( rule__IntegerVariable__Group__0 ) )
            // InternalDSL.g:293:3: ( rule__IntegerVariable__Group__0 )
            {
             before(grammarAccess.getIntegerVariableAccess().getGroup()); 
            // InternalDSL.g:294:3: ( rule__IntegerVariable__Group__0 )
            // InternalDSL.g:294:4: rule__IntegerVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleIntegerVariable"


    // $ANTLR start "entryRuleStringVariable"
    // InternalDSL.g:303:1: entryRuleStringVariable : ruleStringVariable EOF ;
    public final void entryRuleStringVariable() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleStringVariable EOF )
            // InternalDSL.g:305:1: ruleStringVariable EOF
            {
             before(grammarAccess.getStringVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleStringVariable();

            state._fsp--;

             after(grammarAccess.getStringVariableRule()); 
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
    // $ANTLR end "entryRuleStringVariable"


    // $ANTLR start "ruleStringVariable"
    // InternalDSL.g:312:1: ruleStringVariable : ( ( rule__StringVariable__Group__0 ) ) ;
    public final void ruleStringVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__StringVariable__Group__0 ) ) )
            // InternalDSL.g:317:2: ( ( rule__StringVariable__Group__0 ) )
            {
            // InternalDSL.g:317:2: ( ( rule__StringVariable__Group__0 ) )
            // InternalDSL.g:318:3: ( rule__StringVariable__Group__0 )
            {
             before(grammarAccess.getStringVariableAccess().getGroup()); 
            // InternalDSL.g:319:3: ( rule__StringVariable__Group__0 )
            // InternalDSL.g:319:4: rule__StringVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleStringVariable"


    // $ANTLR start "entryRuleBooleanVariable"
    // InternalDSL.g:328:1: entryRuleBooleanVariable : ruleBooleanVariable EOF ;
    public final void entryRuleBooleanVariable() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( ruleBooleanVariable EOF )
            // InternalDSL.g:330:1: ruleBooleanVariable EOF
            {
             before(grammarAccess.getBooleanVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanVariable();

            state._fsp--;

             after(grammarAccess.getBooleanVariableRule()); 
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
    // $ANTLR end "entryRuleBooleanVariable"


    // $ANTLR start "ruleBooleanVariable"
    // InternalDSL.g:337:1: ruleBooleanVariable : ( ( rule__BooleanVariable__Group__0 ) ) ;
    public final void ruleBooleanVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__BooleanVariable__Group__0 ) ) )
            // InternalDSL.g:342:2: ( ( rule__BooleanVariable__Group__0 ) )
            {
            // InternalDSL.g:342:2: ( ( rule__BooleanVariable__Group__0 ) )
            // InternalDSL.g:343:3: ( rule__BooleanVariable__Group__0 )
            {
             before(grammarAccess.getBooleanVariableAccess().getGroup()); 
            // InternalDSL.g:344:3: ( rule__BooleanVariable__Group__0 )
            // InternalDSL.g:344:4: rule__BooleanVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanVariable"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalDSL.g:352:1: rule__Literal__Alternatives : ( ( ruleIntergerLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:356:1: ( ( ruleIntergerLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_REALINT:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
                {
                alt1=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDSL.g:357:2: ( ruleIntergerLiteral )
                    {
                    // InternalDSL.g:357:2: ( ruleIntergerLiteral )
                    // InternalDSL.g:358:3: ruleIntergerLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getIntergerLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntergerLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getIntergerLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:363:2: ( ruleStringLiteral )
                    {
                    // InternalDSL.g:363:2: ( ruleStringLiteral )
                    // InternalDSL.g:364:3: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:369:2: ( ruleBooleanLiteral )
                    {
                    // InternalDSL.g:369:2: ( ruleBooleanLiteral )
                    // InternalDSL.g:370:3: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2()); 

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


    // $ANTLR start "rule__Variable__Alternatives"
    // InternalDSL.g:379:1: rule__Variable__Alternatives : ( ( ruleIntegerVariable ) | ( ruleStringVariable ) | ( ruleBooleanVariable ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:383:1: ( ( ruleIntegerVariable ) | ( ruleStringVariable ) | ( ruleBooleanVariable ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDSL.g:384:2: ( ruleIntegerVariable )
                    {
                    // InternalDSL.g:384:2: ( ruleIntegerVariable )
                    // InternalDSL.g:385:3: ruleIntegerVariable
                    {
                     before(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerVariable();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:390:2: ( ruleStringVariable )
                    {
                    // InternalDSL.g:390:2: ( ruleStringVariable )
                    // InternalDSL.g:391:3: ruleStringVariable
                    {
                     before(grammarAccess.getVariableAccess().getStringVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringVariable();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getStringVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:396:2: ( ruleBooleanVariable )
                    {
                    // InternalDSL.g:396:2: ( ruleBooleanVariable )
                    // InternalDSL.g:397:3: ruleBooleanVariable
                    {
                     before(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanVariable();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_2()); 

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
    // $ANTLR end "rule__Variable__Alternatives"


    // $ANTLR start "rule__Puzzle__Group__0"
    // InternalDSL.g:406:1: rule__Puzzle__Group__0 : rule__Puzzle__Group__0__Impl rule__Puzzle__Group__1 ;
    public final void rule__Puzzle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:410:1: ( rule__Puzzle__Group__0__Impl rule__Puzzle__Group__1 )
            // InternalDSL.g:411:2: rule__Puzzle__Group__0__Impl rule__Puzzle__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Puzzle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Puzzle__Group__1();

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
    // $ANTLR end "rule__Puzzle__Group__0"


    // $ANTLR start "rule__Puzzle__Group__0__Impl"
    // InternalDSL.g:418:1: rule__Puzzle__Group__0__Impl : ( () ) ;
    public final void rule__Puzzle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:422:1: ( ( () ) )
            // InternalDSL.g:423:1: ( () )
            {
            // InternalDSL.g:423:1: ( () )
            // InternalDSL.g:424:2: ()
            {
             before(grammarAccess.getPuzzleAccess().getPuzzleAction_0()); 
            // InternalDSL.g:425:2: ()
            // InternalDSL.g:425:3: 
            {
            }

             after(grammarAccess.getPuzzleAccess().getPuzzleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puzzle__Group__0__Impl"


    // $ANTLR start "rule__Puzzle__Group__1"
    // InternalDSL.g:433:1: rule__Puzzle__Group__1 : rule__Puzzle__Group__1__Impl rule__Puzzle__Group__2 ;
    public final void rule__Puzzle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:437:1: ( rule__Puzzle__Group__1__Impl rule__Puzzle__Group__2 )
            // InternalDSL.g:438:2: rule__Puzzle__Group__1__Impl rule__Puzzle__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Puzzle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Puzzle__Group__2();

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
    // $ANTLR end "rule__Puzzle__Group__1"


    // $ANTLR start "rule__Puzzle__Group__1__Impl"
    // InternalDSL.g:445:1: rule__Puzzle__Group__1__Impl : ( 'PUZZLE' ) ;
    public final void rule__Puzzle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:449:1: ( ( 'PUZZLE' ) )
            // InternalDSL.g:450:1: ( 'PUZZLE' )
            {
            // InternalDSL.g:450:1: ( 'PUZZLE' )
            // InternalDSL.g:451:2: 'PUZZLE'
            {
             before(grammarAccess.getPuzzleAccess().getPUZZLEKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPuzzleAccess().getPUZZLEKeyword_1()); 

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
    // $ANTLR end "rule__Puzzle__Group__1__Impl"


    // $ANTLR start "rule__Puzzle__Group__2"
    // InternalDSL.g:460:1: rule__Puzzle__Group__2 : rule__Puzzle__Group__2__Impl rule__Puzzle__Group__3 ;
    public final void rule__Puzzle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:464:1: ( rule__Puzzle__Group__2__Impl rule__Puzzle__Group__3 )
            // InternalDSL.g:465:2: rule__Puzzle__Group__2__Impl rule__Puzzle__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Puzzle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Puzzle__Group__3();

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
    // $ANTLR end "rule__Puzzle__Group__2"


    // $ANTLR start "rule__Puzzle__Group__2__Impl"
    // InternalDSL.g:472:1: rule__Puzzle__Group__2__Impl : ( '{' ) ;
    public final void rule__Puzzle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:476:1: ( ( '{' ) )
            // InternalDSL.g:477:1: ( '{' )
            {
            // InternalDSL.g:477:1: ( '{' )
            // InternalDSL.g:478:2: '{'
            {
             before(grammarAccess.getPuzzleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPuzzleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Puzzle__Group__2__Impl"


    // $ANTLR start "rule__Puzzle__Group__3"
    // InternalDSL.g:487:1: rule__Puzzle__Group__3 : rule__Puzzle__Group__3__Impl rule__Puzzle__Group__4 ;
    public final void rule__Puzzle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:491:1: ( rule__Puzzle__Group__3__Impl rule__Puzzle__Group__4 )
            // InternalDSL.g:492:2: rule__Puzzle__Group__3__Impl rule__Puzzle__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Puzzle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Puzzle__Group__4();

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
    // $ANTLR end "rule__Puzzle__Group__3"


    // $ANTLR start "rule__Puzzle__Group__3__Impl"
    // InternalDSL.g:499:1: rule__Puzzle__Group__3__Impl : ( 'name' ) ;
    public final void rule__Puzzle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:503:1: ( ( 'name' ) )
            // InternalDSL.g:504:1: ( 'name' )
            {
            // InternalDSL.g:504:1: ( 'name' )
            // InternalDSL.g:505:2: 'name'
            {
             before(grammarAccess.getPuzzleAccess().getNameKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPuzzleAccess().getNameKeyword_3()); 

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
    // $ANTLR end "rule__Puzzle__Group__3__Impl"


    // $ANTLR start "rule__Puzzle__Group__4"
    // InternalDSL.g:514:1: rule__Puzzle__Group__4 : rule__Puzzle__Group__4__Impl rule__Puzzle__Group__5 ;
    public final void rule__Puzzle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:518:1: ( rule__Puzzle__Group__4__Impl rule__Puzzle__Group__5 )
            // InternalDSL.g:519:2: rule__Puzzle__Group__4__Impl rule__Puzzle__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Puzzle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Puzzle__Group__5();

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
    // $ANTLR end "rule__Puzzle__Group__4"


    // $ANTLR start "rule__Puzzle__Group__4__Impl"
    // InternalDSL.g:526:1: rule__Puzzle__Group__4__Impl : ( '=' ) ;
    public final void rule__Puzzle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:530:1: ( ( '=' ) )
            // InternalDSL.g:531:1: ( '=' )
            {
            // InternalDSL.g:531:1: ( '=' )
            // InternalDSL.g:532:2: '='
            {
             before(grammarAccess.getPuzzleAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPuzzleAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__Puzzle__Group__4__Impl"


    // $ANTLR start "rule__Puzzle__Group__5"
    // InternalDSL.g:541:1: rule__Puzzle__Group__5 : rule__Puzzle__Group__5__Impl rule__Puzzle__Group__6 ;
    public final void rule__Puzzle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:545:1: ( rule__Puzzle__Group__5__Impl rule__Puzzle__Group__6 )
            // InternalDSL.g:546:2: rule__Puzzle__Group__5__Impl rule__Puzzle__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Puzzle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Puzzle__Group__6();

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
    // $ANTLR end "rule__Puzzle__Group__5"


    // $ANTLR start "rule__Puzzle__Group__5__Impl"
    // InternalDSL.g:553:1: rule__Puzzle__Group__5__Impl : ( ( rule__Puzzle__NameAssignment_5 ) ) ;
    public final void rule__Puzzle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:557:1: ( ( ( rule__Puzzle__NameAssignment_5 ) ) )
            // InternalDSL.g:558:1: ( ( rule__Puzzle__NameAssignment_5 ) )
            {
            // InternalDSL.g:558:1: ( ( rule__Puzzle__NameAssignment_5 ) )
            // InternalDSL.g:559:2: ( rule__Puzzle__NameAssignment_5 )
            {
             before(grammarAccess.getPuzzleAccess().getNameAssignment_5()); 
            // InternalDSL.g:560:2: ( rule__Puzzle__NameAssignment_5 )
            // InternalDSL.g:560:3: rule__Puzzle__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Puzzle__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPuzzleAccess().getNameAssignment_5()); 

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
    // $ANTLR end "rule__Puzzle__Group__5__Impl"


    // $ANTLR start "rule__Puzzle__Group__6"
    // InternalDSL.g:568:1: rule__Puzzle__Group__6 : rule__Puzzle__Group__6__Impl rule__Puzzle__Group__7 ;
    public final void rule__Puzzle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:572:1: ( rule__Puzzle__Group__6__Impl rule__Puzzle__Group__7 )
            // InternalDSL.g:573:2: rule__Puzzle__Group__6__Impl rule__Puzzle__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Puzzle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Puzzle__Group__7();

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
    // $ANTLR end "rule__Puzzle__Group__6"


    // $ANTLR start "rule__Puzzle__Group__6__Impl"
    // InternalDSL.g:580:1: rule__Puzzle__Group__6__Impl : ( 'description' ) ;
    public final void rule__Puzzle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:584:1: ( ( 'description' ) )
            // InternalDSL.g:585:1: ( 'description' )
            {
            // InternalDSL.g:585:1: ( 'description' )
            // InternalDSL.g:586:2: 'description'
            {
             before(grammarAccess.getPuzzleAccess().getDescriptionKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPuzzleAccess().getDescriptionKeyword_6()); 

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
    // $ANTLR end "rule__Puzzle__Group__6__Impl"


    // $ANTLR start "rule__Puzzle__Group__7"
    // InternalDSL.g:595:1: rule__Puzzle__Group__7 : rule__Puzzle__Group__7__Impl rule__Puzzle__Group__8 ;
    public final void rule__Puzzle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:599:1: ( rule__Puzzle__Group__7__Impl rule__Puzzle__Group__8 )
            // InternalDSL.g:600:2: rule__Puzzle__Group__7__Impl rule__Puzzle__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Puzzle__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Puzzle__Group__8();

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
    // $ANTLR end "rule__Puzzle__Group__7"


    // $ANTLR start "rule__Puzzle__Group__7__Impl"
    // InternalDSL.g:607:1: rule__Puzzle__Group__7__Impl : ( '=' ) ;
    public final void rule__Puzzle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:611:1: ( ( '=' ) )
            // InternalDSL.g:612:1: ( '=' )
            {
            // InternalDSL.g:612:1: ( '=' )
            // InternalDSL.g:613:2: '='
            {
             before(grammarAccess.getPuzzleAccess().getEqualsSignKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPuzzleAccess().getEqualsSignKeyword_7()); 

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
    // $ANTLR end "rule__Puzzle__Group__7__Impl"


    // $ANTLR start "rule__Puzzle__Group__8"
    // InternalDSL.g:622:1: rule__Puzzle__Group__8 : rule__Puzzle__Group__8__Impl rule__Puzzle__Group__9 ;
    public final void rule__Puzzle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:626:1: ( rule__Puzzle__Group__8__Impl rule__Puzzle__Group__9 )
            // InternalDSL.g:627:2: rule__Puzzle__Group__8__Impl rule__Puzzle__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Puzzle__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Puzzle__Group__9();

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
    // $ANTLR end "rule__Puzzle__Group__8"


    // $ANTLR start "rule__Puzzle__Group__8__Impl"
    // InternalDSL.g:634:1: rule__Puzzle__Group__8__Impl : ( ( rule__Puzzle__DescriptionAssignment_8 ) ) ;
    public final void rule__Puzzle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:638:1: ( ( ( rule__Puzzle__DescriptionAssignment_8 ) ) )
            // InternalDSL.g:639:1: ( ( rule__Puzzle__DescriptionAssignment_8 ) )
            {
            // InternalDSL.g:639:1: ( ( rule__Puzzle__DescriptionAssignment_8 ) )
            // InternalDSL.g:640:2: ( rule__Puzzle__DescriptionAssignment_8 )
            {
             before(grammarAccess.getPuzzleAccess().getDescriptionAssignment_8()); 
            // InternalDSL.g:641:2: ( rule__Puzzle__DescriptionAssignment_8 )
            // InternalDSL.g:641:3: rule__Puzzle__DescriptionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Puzzle__DescriptionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPuzzleAccess().getDescriptionAssignment_8()); 

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
    // $ANTLR end "rule__Puzzle__Group__8__Impl"


    // $ANTLR start "rule__Puzzle__Group__9"
    // InternalDSL.g:649:1: rule__Puzzle__Group__9 : rule__Puzzle__Group__9__Impl rule__Puzzle__Group__10 ;
    public final void rule__Puzzle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:653:1: ( rule__Puzzle__Group__9__Impl rule__Puzzle__Group__10 )
            // InternalDSL.g:654:2: rule__Puzzle__Group__9__Impl rule__Puzzle__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Puzzle__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Puzzle__Group__10();

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
    // $ANTLR end "rule__Puzzle__Group__9"


    // $ANTLR start "rule__Puzzle__Group__9__Impl"
    // InternalDSL.g:661:1: rule__Puzzle__Group__9__Impl : ( ( rule__Puzzle__InputsAssignment_9 )? ) ;
    public final void rule__Puzzle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:665:1: ( ( ( rule__Puzzle__InputsAssignment_9 )? ) )
            // InternalDSL.g:666:1: ( ( rule__Puzzle__InputsAssignment_9 )? )
            {
            // InternalDSL.g:666:1: ( ( rule__Puzzle__InputsAssignment_9 )? )
            // InternalDSL.g:667:2: ( rule__Puzzle__InputsAssignment_9 )?
            {
             before(grammarAccess.getPuzzleAccess().getInputsAssignment_9()); 
            // InternalDSL.g:668:2: ( rule__Puzzle__InputsAssignment_9 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:668:3: rule__Puzzle__InputsAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Puzzle__InputsAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPuzzleAccess().getInputsAssignment_9()); 

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
    // $ANTLR end "rule__Puzzle__Group__9__Impl"


    // $ANTLR start "rule__Puzzle__Group__10"
    // InternalDSL.g:676:1: rule__Puzzle__Group__10 : rule__Puzzle__Group__10__Impl rule__Puzzle__Group__11 ;
    public final void rule__Puzzle__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:680:1: ( rule__Puzzle__Group__10__Impl rule__Puzzle__Group__11 )
            // InternalDSL.g:681:2: rule__Puzzle__Group__10__Impl rule__Puzzle__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Puzzle__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Puzzle__Group__11();

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
    // $ANTLR end "rule__Puzzle__Group__10"


    // $ANTLR start "rule__Puzzle__Group__10__Impl"
    // InternalDSL.g:688:1: rule__Puzzle__Group__10__Impl : ( ( ( rule__Puzzle__TestsAssignment_10 ) ) ( ( rule__Puzzle__TestsAssignment_10 )* ) ) ;
    public final void rule__Puzzle__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:692:1: ( ( ( ( rule__Puzzle__TestsAssignment_10 ) ) ( ( rule__Puzzle__TestsAssignment_10 )* ) ) )
            // InternalDSL.g:693:1: ( ( ( rule__Puzzle__TestsAssignment_10 ) ) ( ( rule__Puzzle__TestsAssignment_10 )* ) )
            {
            // InternalDSL.g:693:1: ( ( ( rule__Puzzle__TestsAssignment_10 ) ) ( ( rule__Puzzle__TestsAssignment_10 )* ) )
            // InternalDSL.g:694:2: ( ( rule__Puzzle__TestsAssignment_10 ) ) ( ( rule__Puzzle__TestsAssignment_10 )* )
            {
            // InternalDSL.g:694:2: ( ( rule__Puzzle__TestsAssignment_10 ) )
            // InternalDSL.g:695:3: ( rule__Puzzle__TestsAssignment_10 )
            {
             before(grammarAccess.getPuzzleAccess().getTestsAssignment_10()); 
            // InternalDSL.g:696:3: ( rule__Puzzle__TestsAssignment_10 )
            // InternalDSL.g:696:4: rule__Puzzle__TestsAssignment_10
            {
            pushFollow(FOLLOW_11);
            rule__Puzzle__TestsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPuzzleAccess().getTestsAssignment_10()); 

            }

            // InternalDSL.g:699:2: ( ( rule__Puzzle__TestsAssignment_10 )* )
            // InternalDSL.g:700:3: ( rule__Puzzle__TestsAssignment_10 )*
            {
             before(grammarAccess.getPuzzleAccess().getTestsAssignment_10()); 
            // InternalDSL.g:701:3: ( rule__Puzzle__TestsAssignment_10 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDSL.g:701:4: rule__Puzzle__TestsAssignment_10
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Puzzle__TestsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPuzzleAccess().getTestsAssignment_10()); 

            }


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
    // $ANTLR end "rule__Puzzle__Group__10__Impl"


    // $ANTLR start "rule__Puzzle__Group__11"
    // InternalDSL.g:710:1: rule__Puzzle__Group__11 : rule__Puzzle__Group__11__Impl ;
    public final void rule__Puzzle__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:714:1: ( rule__Puzzle__Group__11__Impl )
            // InternalDSL.g:715:2: rule__Puzzle__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Puzzle__Group__11__Impl();

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
    // $ANTLR end "rule__Puzzle__Group__11"


    // $ANTLR start "rule__Puzzle__Group__11__Impl"
    // InternalDSL.g:721:1: rule__Puzzle__Group__11__Impl : ( '}' ) ;
    public final void rule__Puzzle__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:725:1: ( ( '}' ) )
            // InternalDSL.g:726:1: ( '}' )
            {
            // InternalDSL.g:726:1: ( '}' )
            // InternalDSL.g:727:2: '}'
            {
             before(grammarAccess.getPuzzleAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPuzzleAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Puzzle__Group__11__Impl"


    // $ANTLR start "rule__Inputs__Group__0"
    // InternalDSL.g:737:1: rule__Inputs__Group__0 : rule__Inputs__Group__0__Impl rule__Inputs__Group__1 ;
    public final void rule__Inputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:741:1: ( rule__Inputs__Group__0__Impl rule__Inputs__Group__1 )
            // InternalDSL.g:742:2: rule__Inputs__Group__0__Impl rule__Inputs__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Inputs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inputs__Group__1();

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
    // $ANTLR end "rule__Inputs__Group__0"


    // $ANTLR start "rule__Inputs__Group__0__Impl"
    // InternalDSL.g:749:1: rule__Inputs__Group__0__Impl : ( 'INPUTS' ) ;
    public final void rule__Inputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:753:1: ( ( 'INPUTS' ) )
            // InternalDSL.g:754:1: ( 'INPUTS' )
            {
            // InternalDSL.g:754:1: ( 'INPUTS' )
            // InternalDSL.g:755:2: 'INPUTS'
            {
             before(grammarAccess.getInputsAccess().getINPUTSKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getINPUTSKeyword_0()); 

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
    // $ANTLR end "rule__Inputs__Group__0__Impl"


    // $ANTLR start "rule__Inputs__Group__1"
    // InternalDSL.g:764:1: rule__Inputs__Group__1 : rule__Inputs__Group__1__Impl rule__Inputs__Group__2 ;
    public final void rule__Inputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:768:1: ( rule__Inputs__Group__1__Impl rule__Inputs__Group__2 )
            // InternalDSL.g:769:2: rule__Inputs__Group__1__Impl rule__Inputs__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Inputs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inputs__Group__2();

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
    // $ANTLR end "rule__Inputs__Group__1"


    // $ANTLR start "rule__Inputs__Group__1__Impl"
    // InternalDSL.g:776:1: rule__Inputs__Group__1__Impl : ( '{' ) ;
    public final void rule__Inputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:780:1: ( ( '{' ) )
            // InternalDSL.g:781:1: ( '{' )
            {
            // InternalDSL.g:781:1: ( '{' )
            // InternalDSL.g:782:2: '{'
            {
             before(grammarAccess.getInputsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Inputs__Group__1__Impl"


    // $ANTLR start "rule__Inputs__Group__2"
    // InternalDSL.g:791:1: rule__Inputs__Group__2 : rule__Inputs__Group__2__Impl rule__Inputs__Group__3 ;
    public final void rule__Inputs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:795:1: ( rule__Inputs__Group__2__Impl rule__Inputs__Group__3 )
            // InternalDSL.g:796:2: rule__Inputs__Group__2__Impl rule__Inputs__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Inputs__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inputs__Group__3();

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
    // $ANTLR end "rule__Inputs__Group__2"


    // $ANTLR start "rule__Inputs__Group__2__Impl"
    // InternalDSL.g:803:1: rule__Inputs__Group__2__Impl : ( ( ( rule__Inputs__VariablesAssignment_2 ) ) ( ( rule__Inputs__VariablesAssignment_2 )* ) ) ;
    public final void rule__Inputs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:807:1: ( ( ( ( rule__Inputs__VariablesAssignment_2 ) ) ( ( rule__Inputs__VariablesAssignment_2 )* ) ) )
            // InternalDSL.g:808:1: ( ( ( rule__Inputs__VariablesAssignment_2 ) ) ( ( rule__Inputs__VariablesAssignment_2 )* ) )
            {
            // InternalDSL.g:808:1: ( ( ( rule__Inputs__VariablesAssignment_2 ) ) ( ( rule__Inputs__VariablesAssignment_2 )* ) )
            // InternalDSL.g:809:2: ( ( rule__Inputs__VariablesAssignment_2 ) ) ( ( rule__Inputs__VariablesAssignment_2 )* )
            {
            // InternalDSL.g:809:2: ( ( rule__Inputs__VariablesAssignment_2 ) )
            // InternalDSL.g:810:3: ( rule__Inputs__VariablesAssignment_2 )
            {
             before(grammarAccess.getInputsAccess().getVariablesAssignment_2()); 
            // InternalDSL.g:811:3: ( rule__Inputs__VariablesAssignment_2 )
            // InternalDSL.g:811:4: rule__Inputs__VariablesAssignment_2
            {
            pushFollow(FOLLOW_13);
            rule__Inputs__VariablesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputsAccess().getVariablesAssignment_2()); 

            }

            // InternalDSL.g:814:2: ( ( rule__Inputs__VariablesAssignment_2 )* )
            // InternalDSL.g:815:3: ( rule__Inputs__VariablesAssignment_2 )*
            {
             before(grammarAccess.getInputsAccess().getVariablesAssignment_2()); 
            // InternalDSL.g:816:3: ( rule__Inputs__VariablesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=24 && LA5_0<=26)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDSL.g:816:4: rule__Inputs__VariablesAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Inputs__VariablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getInputsAccess().getVariablesAssignment_2()); 

            }


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
    // $ANTLR end "rule__Inputs__Group__2__Impl"


    // $ANTLR start "rule__Inputs__Group__3"
    // InternalDSL.g:825:1: rule__Inputs__Group__3 : rule__Inputs__Group__3__Impl ;
    public final void rule__Inputs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:829:1: ( rule__Inputs__Group__3__Impl )
            // InternalDSL.g:830:2: rule__Inputs__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inputs__Group__3__Impl();

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
    // $ANTLR end "rule__Inputs__Group__3"


    // $ANTLR start "rule__Inputs__Group__3__Impl"
    // InternalDSL.g:836:1: rule__Inputs__Group__3__Impl : ( '}' ) ;
    public final void rule__Inputs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:840:1: ( ( '}' ) )
            // InternalDSL.g:841:1: ( '}' )
            {
            // InternalDSL.g:841:1: ( '}' )
            // InternalDSL.g:842:2: '}'
            {
             before(grammarAccess.getInputsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Inputs__Group__3__Impl"


    // $ANTLR start "rule__UnitTest__Group__0"
    // InternalDSL.g:852:1: rule__UnitTest__Group__0 : rule__UnitTest__Group__0__Impl rule__UnitTest__Group__1 ;
    public final void rule__UnitTest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:856:1: ( rule__UnitTest__Group__0__Impl rule__UnitTest__Group__1 )
            // InternalDSL.g:857:2: rule__UnitTest__Group__0__Impl rule__UnitTest__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__UnitTest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTest__Group__1();

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
    // $ANTLR end "rule__UnitTest__Group__0"


    // $ANTLR start "rule__UnitTest__Group__0__Impl"
    // InternalDSL.g:864:1: rule__UnitTest__Group__0__Impl : ( () ) ;
    public final void rule__UnitTest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:868:1: ( ( () ) )
            // InternalDSL.g:869:1: ( () )
            {
            // InternalDSL.g:869:1: ( () )
            // InternalDSL.g:870:2: ()
            {
             before(grammarAccess.getUnitTestAccess().getUnitTestAction_0()); 
            // InternalDSL.g:871:2: ()
            // InternalDSL.g:871:3: 
            {
            }

             after(grammarAccess.getUnitTestAccess().getUnitTestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitTest__Group__0__Impl"


    // $ANTLR start "rule__UnitTest__Group__1"
    // InternalDSL.g:879:1: rule__UnitTest__Group__1 : rule__UnitTest__Group__1__Impl rule__UnitTest__Group__2 ;
    public final void rule__UnitTest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:883:1: ( rule__UnitTest__Group__1__Impl rule__UnitTest__Group__2 )
            // InternalDSL.g:884:2: rule__UnitTest__Group__1__Impl rule__UnitTest__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UnitTest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTest__Group__2();

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
    // $ANTLR end "rule__UnitTest__Group__1"


    // $ANTLR start "rule__UnitTest__Group__1__Impl"
    // InternalDSL.g:891:1: rule__UnitTest__Group__1__Impl : ( 'TEST' ) ;
    public final void rule__UnitTest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:895:1: ( ( 'TEST' ) )
            // InternalDSL.g:896:1: ( 'TEST' )
            {
            // InternalDSL.g:896:1: ( 'TEST' )
            // InternalDSL.g:897:2: 'TEST'
            {
             before(grammarAccess.getUnitTestAccess().getTESTKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUnitTestAccess().getTESTKeyword_1()); 

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
    // $ANTLR end "rule__UnitTest__Group__1__Impl"


    // $ANTLR start "rule__UnitTest__Group__2"
    // InternalDSL.g:906:1: rule__UnitTest__Group__2 : rule__UnitTest__Group__2__Impl rule__UnitTest__Group__3 ;
    public final void rule__UnitTest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:910:1: ( rule__UnitTest__Group__2__Impl rule__UnitTest__Group__3 )
            // InternalDSL.g:911:2: rule__UnitTest__Group__2__Impl rule__UnitTest__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__UnitTest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTest__Group__3();

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
    // $ANTLR end "rule__UnitTest__Group__2"


    // $ANTLR start "rule__UnitTest__Group__2__Impl"
    // InternalDSL.g:918:1: rule__UnitTest__Group__2__Impl : ( '{' ) ;
    public final void rule__UnitTest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:922:1: ( ( '{' ) )
            // InternalDSL.g:923:1: ( '{' )
            {
            // InternalDSL.g:923:1: ( '{' )
            // InternalDSL.g:924:2: '{'
            {
             before(grammarAccess.getUnitTestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getUnitTestAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__UnitTest__Group__2__Impl"


    // $ANTLR start "rule__UnitTest__Group__3"
    // InternalDSL.g:933:1: rule__UnitTest__Group__3 : rule__UnitTest__Group__3__Impl rule__UnitTest__Group__4 ;
    public final void rule__UnitTest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:937:1: ( rule__UnitTest__Group__3__Impl rule__UnitTest__Group__4 )
            // InternalDSL.g:938:2: rule__UnitTest__Group__3__Impl rule__UnitTest__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__UnitTest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTest__Group__4();

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
    // $ANTLR end "rule__UnitTest__Group__3"


    // $ANTLR start "rule__UnitTest__Group__3__Impl"
    // InternalDSL.g:945:1: rule__UnitTest__Group__3__Impl : ( ( rule__UnitTest__Group_3__0 )? ) ;
    public final void rule__UnitTest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:949:1: ( ( ( rule__UnitTest__Group_3__0 )? ) )
            // InternalDSL.g:950:1: ( ( rule__UnitTest__Group_3__0 )? )
            {
            // InternalDSL.g:950:1: ( ( rule__UnitTest__Group_3__0 )? )
            // InternalDSL.g:951:2: ( rule__UnitTest__Group_3__0 )?
            {
             before(grammarAccess.getUnitTestAccess().getGroup_3()); 
            // InternalDSL.g:952:2: ( rule__UnitTest__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:952:3: rule__UnitTest__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnitTest__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnitTestAccess().getGroup_3()); 

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
    // $ANTLR end "rule__UnitTest__Group__3__Impl"


    // $ANTLR start "rule__UnitTest__Group__4"
    // InternalDSL.g:960:1: rule__UnitTest__Group__4 : rule__UnitTest__Group__4__Impl rule__UnitTest__Group__5 ;
    public final void rule__UnitTest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:964:1: ( rule__UnitTest__Group__4__Impl rule__UnitTest__Group__5 )
            // InternalDSL.g:965:2: rule__UnitTest__Group__4__Impl rule__UnitTest__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__UnitTest__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTest__Group__5();

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
    // $ANTLR end "rule__UnitTest__Group__4"


    // $ANTLR start "rule__UnitTest__Group__4__Impl"
    // InternalDSL.g:972:1: rule__UnitTest__Group__4__Impl : ( 'EXPECTS' ) ;
    public final void rule__UnitTest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:976:1: ( ( 'EXPECTS' ) )
            // InternalDSL.g:977:1: ( 'EXPECTS' )
            {
            // InternalDSL.g:977:1: ( 'EXPECTS' )
            // InternalDSL.g:978:2: 'EXPECTS'
            {
             before(grammarAccess.getUnitTestAccess().getEXPECTSKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUnitTestAccess().getEXPECTSKeyword_4()); 

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
    // $ANTLR end "rule__UnitTest__Group__4__Impl"


    // $ANTLR start "rule__UnitTest__Group__5"
    // InternalDSL.g:987:1: rule__UnitTest__Group__5 : rule__UnitTest__Group__5__Impl rule__UnitTest__Group__6 ;
    public final void rule__UnitTest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:991:1: ( rule__UnitTest__Group__5__Impl rule__UnitTest__Group__6 )
            // InternalDSL.g:992:2: rule__UnitTest__Group__5__Impl rule__UnitTest__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__UnitTest__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTest__Group__6();

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
    // $ANTLR end "rule__UnitTest__Group__5"


    // $ANTLR start "rule__UnitTest__Group__5__Impl"
    // InternalDSL.g:999:1: rule__UnitTest__Group__5__Impl : ( ( rule__UnitTest__ExpectedAssignment_5 ) ) ;
    public final void rule__UnitTest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1003:1: ( ( ( rule__UnitTest__ExpectedAssignment_5 ) ) )
            // InternalDSL.g:1004:1: ( ( rule__UnitTest__ExpectedAssignment_5 ) )
            {
            // InternalDSL.g:1004:1: ( ( rule__UnitTest__ExpectedAssignment_5 ) )
            // InternalDSL.g:1005:2: ( rule__UnitTest__ExpectedAssignment_5 )
            {
             before(grammarAccess.getUnitTestAccess().getExpectedAssignment_5()); 
            // InternalDSL.g:1006:2: ( rule__UnitTest__ExpectedAssignment_5 )
            // InternalDSL.g:1006:3: rule__UnitTest__ExpectedAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__UnitTest__ExpectedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUnitTestAccess().getExpectedAssignment_5()); 

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
    // $ANTLR end "rule__UnitTest__Group__5__Impl"


    // $ANTLR start "rule__UnitTest__Group__6"
    // InternalDSL.g:1014:1: rule__UnitTest__Group__6 : rule__UnitTest__Group__6__Impl rule__UnitTest__Group__7 ;
    public final void rule__UnitTest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1018:1: ( rule__UnitTest__Group__6__Impl rule__UnitTest__Group__7 )
            // InternalDSL.g:1019:2: rule__UnitTest__Group__6__Impl rule__UnitTest__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__UnitTest__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTest__Group__7();

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
    // $ANTLR end "rule__UnitTest__Group__6"


    // $ANTLR start "rule__UnitTest__Group__6__Impl"
    // InternalDSL.g:1026:1: rule__UnitTest__Group__6__Impl : ( ( rule__UnitTest__Group_6__0 )? ) ;
    public final void rule__UnitTest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1030:1: ( ( ( rule__UnitTest__Group_6__0 )? ) )
            // InternalDSL.g:1031:1: ( ( rule__UnitTest__Group_6__0 )? )
            {
            // InternalDSL.g:1031:1: ( ( rule__UnitTest__Group_6__0 )? )
            // InternalDSL.g:1032:2: ( rule__UnitTest__Group_6__0 )?
            {
             before(grammarAccess.getUnitTestAccess().getGroup_6()); 
            // InternalDSL.g:1033:2: ( rule__UnitTest__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:1033:3: rule__UnitTest__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnitTest__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnitTestAccess().getGroup_6()); 

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
    // $ANTLR end "rule__UnitTest__Group__6__Impl"


    // $ANTLR start "rule__UnitTest__Group__7"
    // InternalDSL.g:1041:1: rule__UnitTest__Group__7 : rule__UnitTest__Group__7__Impl ;
    public final void rule__UnitTest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1045:1: ( rule__UnitTest__Group__7__Impl )
            // InternalDSL.g:1046:2: rule__UnitTest__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnitTest__Group__7__Impl();

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
    // $ANTLR end "rule__UnitTest__Group__7"


    // $ANTLR start "rule__UnitTest__Group__7__Impl"
    // InternalDSL.g:1052:1: rule__UnitTest__Group__7__Impl : ( '}' ) ;
    public final void rule__UnitTest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1056:1: ( ( '}' ) )
            // InternalDSL.g:1057:1: ( '}' )
            {
            // InternalDSL.g:1057:1: ( '}' )
            // InternalDSL.g:1058:2: '}'
            {
             before(grammarAccess.getUnitTestAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUnitTestAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__UnitTest__Group__7__Impl"


    // $ANTLR start "rule__UnitTest__Group_3__0"
    // InternalDSL.g:1068:1: rule__UnitTest__Group_3__0 : rule__UnitTest__Group_3__0__Impl rule__UnitTest__Group_3__1 ;
    public final void rule__UnitTest__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1072:1: ( rule__UnitTest__Group_3__0__Impl rule__UnitTest__Group_3__1 )
            // InternalDSL.g:1073:2: rule__UnitTest__Group_3__0__Impl rule__UnitTest__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__UnitTest__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTest__Group_3__1();

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
    // $ANTLR end "rule__UnitTest__Group_3__0"


    // $ANTLR start "rule__UnitTest__Group_3__0__Impl"
    // InternalDSL.g:1080:1: rule__UnitTest__Group_3__0__Impl : ( 'INPUTS' ) ;
    public final void rule__UnitTest__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1084:1: ( ( 'INPUTS' ) )
            // InternalDSL.g:1085:1: ( 'INPUTS' )
            {
            // InternalDSL.g:1085:1: ( 'INPUTS' )
            // InternalDSL.g:1086:2: 'INPUTS'
            {
             before(grammarAccess.getUnitTestAccess().getINPUTSKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUnitTestAccess().getINPUTSKeyword_3_0()); 

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
    // $ANTLR end "rule__UnitTest__Group_3__0__Impl"


    // $ANTLR start "rule__UnitTest__Group_3__1"
    // InternalDSL.g:1095:1: rule__UnitTest__Group_3__1 : rule__UnitTest__Group_3__1__Impl rule__UnitTest__Group_3__2 ;
    public final void rule__UnitTest__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1099:1: ( rule__UnitTest__Group_3__1__Impl rule__UnitTest__Group_3__2 )
            // InternalDSL.g:1100:2: rule__UnitTest__Group_3__1__Impl rule__UnitTest__Group_3__2
            {
            pushFollow(FOLLOW_17);
            rule__UnitTest__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTest__Group_3__2();

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
    // $ANTLR end "rule__UnitTest__Group_3__1"


    // $ANTLR start "rule__UnitTest__Group_3__1__Impl"
    // InternalDSL.g:1107:1: rule__UnitTest__Group_3__1__Impl : ( '{' ) ;
    public final void rule__UnitTest__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1111:1: ( ( '{' ) )
            // InternalDSL.g:1112:1: ( '{' )
            {
            // InternalDSL.g:1112:1: ( '{' )
            // InternalDSL.g:1113:2: '{'
            {
             before(grammarAccess.getUnitTestAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getUnitTestAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__UnitTest__Group_3__1__Impl"


    // $ANTLR start "rule__UnitTest__Group_3__2"
    // InternalDSL.g:1122:1: rule__UnitTest__Group_3__2 : rule__UnitTest__Group_3__2__Impl rule__UnitTest__Group_3__3 ;
    public final void rule__UnitTest__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1126:1: ( rule__UnitTest__Group_3__2__Impl rule__UnitTest__Group_3__3 )
            // InternalDSL.g:1127:2: rule__UnitTest__Group_3__2__Impl rule__UnitTest__Group_3__3
            {
            pushFollow(FOLLOW_10);
            rule__UnitTest__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTest__Group_3__3();

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
    // $ANTLR end "rule__UnitTest__Group_3__2"


    // $ANTLR start "rule__UnitTest__Group_3__2__Impl"
    // InternalDSL.g:1134:1: rule__UnitTest__Group_3__2__Impl : ( ( ( rule__UnitTest__InputsAssignment_3_2 ) ) ( ( rule__UnitTest__InputsAssignment_3_2 )* ) ) ;
    public final void rule__UnitTest__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1138:1: ( ( ( ( rule__UnitTest__InputsAssignment_3_2 ) ) ( ( rule__UnitTest__InputsAssignment_3_2 )* ) ) )
            // InternalDSL.g:1139:1: ( ( ( rule__UnitTest__InputsAssignment_3_2 ) ) ( ( rule__UnitTest__InputsAssignment_3_2 )* ) )
            {
            // InternalDSL.g:1139:1: ( ( ( rule__UnitTest__InputsAssignment_3_2 ) ) ( ( rule__UnitTest__InputsAssignment_3_2 )* ) )
            // InternalDSL.g:1140:2: ( ( rule__UnitTest__InputsAssignment_3_2 ) ) ( ( rule__UnitTest__InputsAssignment_3_2 )* )
            {
            // InternalDSL.g:1140:2: ( ( rule__UnitTest__InputsAssignment_3_2 ) )
            // InternalDSL.g:1141:3: ( rule__UnitTest__InputsAssignment_3_2 )
            {
             before(grammarAccess.getUnitTestAccess().getInputsAssignment_3_2()); 
            // InternalDSL.g:1142:3: ( rule__UnitTest__InputsAssignment_3_2 )
            // InternalDSL.g:1142:4: rule__UnitTest__InputsAssignment_3_2
            {
            pushFollow(FOLLOW_18);
            rule__UnitTest__InputsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getUnitTestAccess().getInputsAssignment_3_2()); 

            }

            // InternalDSL.g:1145:2: ( ( rule__UnitTest__InputsAssignment_3_2 )* )
            // InternalDSL.g:1146:3: ( rule__UnitTest__InputsAssignment_3_2 )*
            {
             before(grammarAccess.getUnitTestAccess().getInputsAssignment_3_2()); 
            // InternalDSL.g:1147:3: ( rule__UnitTest__InputsAssignment_3_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDSL.g:1147:4: rule__UnitTest__InputsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__UnitTest__InputsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getUnitTestAccess().getInputsAssignment_3_2()); 

            }


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
    // $ANTLR end "rule__UnitTest__Group_3__2__Impl"


    // $ANTLR start "rule__UnitTest__Group_3__3"
    // InternalDSL.g:1156:1: rule__UnitTest__Group_3__3 : rule__UnitTest__Group_3__3__Impl ;
    public final void rule__UnitTest__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1160:1: ( rule__UnitTest__Group_3__3__Impl )
            // InternalDSL.g:1161:2: rule__UnitTest__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnitTest__Group_3__3__Impl();

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
    // $ANTLR end "rule__UnitTest__Group_3__3"


    // $ANTLR start "rule__UnitTest__Group_3__3__Impl"
    // InternalDSL.g:1167:1: rule__UnitTest__Group_3__3__Impl : ( '}' ) ;
    public final void rule__UnitTest__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1171:1: ( ( '}' ) )
            // InternalDSL.g:1172:1: ( '}' )
            {
            // InternalDSL.g:1172:1: ( '}' )
            // InternalDSL.g:1173:2: '}'
            {
             before(grammarAccess.getUnitTestAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUnitTestAccess().getRightCurlyBracketKeyword_3_3()); 

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
    // $ANTLR end "rule__UnitTest__Group_3__3__Impl"


    // $ANTLR start "rule__UnitTest__Group_6__0"
    // InternalDSL.g:1183:1: rule__UnitTest__Group_6__0 : rule__UnitTest__Group_6__0__Impl rule__UnitTest__Group_6__1 ;
    public final void rule__UnitTest__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1187:1: ( rule__UnitTest__Group_6__0__Impl rule__UnitTest__Group_6__1 )
            // InternalDSL.g:1188:2: rule__UnitTest__Group_6__0__Impl rule__UnitTest__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__UnitTest__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTest__Group_6__1();

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
    // $ANTLR end "rule__UnitTest__Group_6__0"


    // $ANTLR start "rule__UnitTest__Group_6__0__Impl"
    // InternalDSL.g:1195:1: rule__UnitTest__Group_6__0__Impl : ( 'ON_FAIL' ) ;
    public final void rule__UnitTest__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1199:1: ( ( 'ON_FAIL' ) )
            // InternalDSL.g:1200:1: ( 'ON_FAIL' )
            {
            // InternalDSL.g:1200:1: ( 'ON_FAIL' )
            // InternalDSL.g:1201:2: 'ON_FAIL'
            {
             before(grammarAccess.getUnitTestAccess().getON_FAILKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUnitTestAccess().getON_FAILKeyword_6_0()); 

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
    // $ANTLR end "rule__UnitTest__Group_6__0__Impl"


    // $ANTLR start "rule__UnitTest__Group_6__1"
    // InternalDSL.g:1210:1: rule__UnitTest__Group_6__1 : rule__UnitTest__Group_6__1__Impl rule__UnitTest__Group_6__2 ;
    public final void rule__UnitTest__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1214:1: ( rule__UnitTest__Group_6__1__Impl rule__UnitTest__Group_6__2 )
            // InternalDSL.g:1215:2: rule__UnitTest__Group_6__1__Impl rule__UnitTest__Group_6__2
            {
            pushFollow(FOLLOW_19);
            rule__UnitTest__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTest__Group_6__2();

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
    // $ANTLR end "rule__UnitTest__Group_6__1"


    // $ANTLR start "rule__UnitTest__Group_6__1__Impl"
    // InternalDSL.g:1222:1: rule__UnitTest__Group_6__1__Impl : ( '{' ) ;
    public final void rule__UnitTest__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1226:1: ( ( '{' ) )
            // InternalDSL.g:1227:1: ( '{' )
            {
            // InternalDSL.g:1227:1: ( '{' )
            // InternalDSL.g:1228:2: '{'
            {
             before(grammarAccess.getUnitTestAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getUnitTestAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__UnitTest__Group_6__1__Impl"


    // $ANTLR start "rule__UnitTest__Group_6__2"
    // InternalDSL.g:1237:1: rule__UnitTest__Group_6__2 : rule__UnitTest__Group_6__2__Impl rule__UnitTest__Group_6__3 ;
    public final void rule__UnitTest__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1241:1: ( rule__UnitTest__Group_6__2__Impl rule__UnitTest__Group_6__3 )
            // InternalDSL.g:1242:2: rule__UnitTest__Group_6__2__Impl rule__UnitTest__Group_6__3
            {
            pushFollow(FOLLOW_6);
            rule__UnitTest__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTest__Group_6__3();

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
    // $ANTLR end "rule__UnitTest__Group_6__2"


    // $ANTLR start "rule__UnitTest__Group_6__2__Impl"
    // InternalDSL.g:1249:1: rule__UnitTest__Group_6__2__Impl : ( 'msg' ) ;
    public final void rule__UnitTest__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1253:1: ( ( 'msg' ) )
            // InternalDSL.g:1254:1: ( 'msg' )
            {
            // InternalDSL.g:1254:1: ( 'msg' )
            // InternalDSL.g:1255:2: 'msg'
            {
             before(grammarAccess.getUnitTestAccess().getMsgKeyword_6_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUnitTestAccess().getMsgKeyword_6_2()); 

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
    // $ANTLR end "rule__UnitTest__Group_6__2__Impl"


    // $ANTLR start "rule__UnitTest__Group_6__3"
    // InternalDSL.g:1264:1: rule__UnitTest__Group_6__3 : rule__UnitTest__Group_6__3__Impl rule__UnitTest__Group_6__4 ;
    public final void rule__UnitTest__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1268:1: ( rule__UnitTest__Group_6__3__Impl rule__UnitTest__Group_6__4 )
            // InternalDSL.g:1269:2: rule__UnitTest__Group_6__3__Impl rule__UnitTest__Group_6__4
            {
            pushFollow(FOLLOW_7);
            rule__UnitTest__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTest__Group_6__4();

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
    // $ANTLR end "rule__UnitTest__Group_6__3"


    // $ANTLR start "rule__UnitTest__Group_6__3__Impl"
    // InternalDSL.g:1276:1: rule__UnitTest__Group_6__3__Impl : ( '=' ) ;
    public final void rule__UnitTest__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1280:1: ( ( '=' ) )
            // InternalDSL.g:1281:1: ( '=' )
            {
            // InternalDSL.g:1281:1: ( '=' )
            // InternalDSL.g:1282:2: '='
            {
             before(grammarAccess.getUnitTestAccess().getEqualsSignKeyword_6_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUnitTestAccess().getEqualsSignKeyword_6_3()); 

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
    // $ANTLR end "rule__UnitTest__Group_6__3__Impl"


    // $ANTLR start "rule__UnitTest__Group_6__4"
    // InternalDSL.g:1291:1: rule__UnitTest__Group_6__4 : rule__UnitTest__Group_6__4__Impl rule__UnitTest__Group_6__5 ;
    public final void rule__UnitTest__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1295:1: ( rule__UnitTest__Group_6__4__Impl rule__UnitTest__Group_6__5 )
            // InternalDSL.g:1296:2: rule__UnitTest__Group_6__4__Impl rule__UnitTest__Group_6__5
            {
            pushFollow(FOLLOW_10);
            rule__UnitTest__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTest__Group_6__5();

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
    // $ANTLR end "rule__UnitTest__Group_6__4"


    // $ANTLR start "rule__UnitTest__Group_6__4__Impl"
    // InternalDSL.g:1303:1: rule__UnitTest__Group_6__4__Impl : ( ( rule__UnitTest__FailedMessageAssignment_6_4 ) ) ;
    public final void rule__UnitTest__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1307:1: ( ( ( rule__UnitTest__FailedMessageAssignment_6_4 ) ) )
            // InternalDSL.g:1308:1: ( ( rule__UnitTest__FailedMessageAssignment_6_4 ) )
            {
            // InternalDSL.g:1308:1: ( ( rule__UnitTest__FailedMessageAssignment_6_4 ) )
            // InternalDSL.g:1309:2: ( rule__UnitTest__FailedMessageAssignment_6_4 )
            {
             before(grammarAccess.getUnitTestAccess().getFailedMessageAssignment_6_4()); 
            // InternalDSL.g:1310:2: ( rule__UnitTest__FailedMessageAssignment_6_4 )
            // InternalDSL.g:1310:3: rule__UnitTest__FailedMessageAssignment_6_4
            {
            pushFollow(FOLLOW_2);
            rule__UnitTest__FailedMessageAssignment_6_4();

            state._fsp--;


            }

             after(grammarAccess.getUnitTestAccess().getFailedMessageAssignment_6_4()); 

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
    // $ANTLR end "rule__UnitTest__Group_6__4__Impl"


    // $ANTLR start "rule__UnitTest__Group_6__5"
    // InternalDSL.g:1318:1: rule__UnitTest__Group_6__5 : rule__UnitTest__Group_6__5__Impl ;
    public final void rule__UnitTest__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1322:1: ( rule__UnitTest__Group_6__5__Impl )
            // InternalDSL.g:1323:2: rule__UnitTest__Group_6__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnitTest__Group_6__5__Impl();

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
    // $ANTLR end "rule__UnitTest__Group_6__5"


    // $ANTLR start "rule__UnitTest__Group_6__5__Impl"
    // InternalDSL.g:1329:1: rule__UnitTest__Group_6__5__Impl : ( '}' ) ;
    public final void rule__UnitTest__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1333:1: ( ( '}' ) )
            // InternalDSL.g:1334:1: ( '}' )
            {
            // InternalDSL.g:1334:1: ( '}' )
            // InternalDSL.g:1335:2: '}'
            {
             before(grammarAccess.getUnitTestAccess().getRightCurlyBracketKeyword_6_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUnitTestAccess().getRightCurlyBracketKeyword_6_5()); 

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
    // $ANTLR end "rule__UnitTest__Group_6__5__Impl"


    // $ANTLR start "rule__UnitTestInput__Group__0"
    // InternalDSL.g:1345:1: rule__UnitTestInput__Group__0 : rule__UnitTestInput__Group__0__Impl rule__UnitTestInput__Group__1 ;
    public final void rule__UnitTestInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1349:1: ( rule__UnitTestInput__Group__0__Impl rule__UnitTestInput__Group__1 )
            // InternalDSL.g:1350:2: rule__UnitTestInput__Group__0__Impl rule__UnitTestInput__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__UnitTestInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTestInput__Group__1();

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
    // $ANTLR end "rule__UnitTestInput__Group__0"


    // $ANTLR start "rule__UnitTestInput__Group__0__Impl"
    // InternalDSL.g:1357:1: rule__UnitTestInput__Group__0__Impl : ( ( rule__UnitTestInput__VariableAssignment_0 ) ) ;
    public final void rule__UnitTestInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1361:1: ( ( ( rule__UnitTestInput__VariableAssignment_0 ) ) )
            // InternalDSL.g:1362:1: ( ( rule__UnitTestInput__VariableAssignment_0 ) )
            {
            // InternalDSL.g:1362:1: ( ( rule__UnitTestInput__VariableAssignment_0 ) )
            // InternalDSL.g:1363:2: ( rule__UnitTestInput__VariableAssignment_0 )
            {
             before(grammarAccess.getUnitTestInputAccess().getVariableAssignment_0()); 
            // InternalDSL.g:1364:2: ( rule__UnitTestInput__VariableAssignment_0 )
            // InternalDSL.g:1364:3: rule__UnitTestInput__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UnitTestInput__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUnitTestInputAccess().getVariableAssignment_0()); 

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
    // $ANTLR end "rule__UnitTestInput__Group__0__Impl"


    // $ANTLR start "rule__UnitTestInput__Group__1"
    // InternalDSL.g:1372:1: rule__UnitTestInput__Group__1 : rule__UnitTestInput__Group__1__Impl rule__UnitTestInput__Group__2 ;
    public final void rule__UnitTestInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1376:1: ( rule__UnitTestInput__Group__1__Impl rule__UnitTestInput__Group__2 )
            // InternalDSL.g:1377:2: rule__UnitTestInput__Group__1__Impl rule__UnitTestInput__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__UnitTestInput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitTestInput__Group__2();

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
    // $ANTLR end "rule__UnitTestInput__Group__1"


    // $ANTLR start "rule__UnitTestInput__Group__1__Impl"
    // InternalDSL.g:1384:1: rule__UnitTestInput__Group__1__Impl : ( '=' ) ;
    public final void rule__UnitTestInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1388:1: ( ( '=' ) )
            // InternalDSL.g:1389:1: ( '=' )
            {
            // InternalDSL.g:1389:1: ( '=' )
            // InternalDSL.g:1390:2: '='
            {
             before(grammarAccess.getUnitTestInputAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUnitTestInputAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__UnitTestInput__Group__1__Impl"


    // $ANTLR start "rule__UnitTestInput__Group__2"
    // InternalDSL.g:1399:1: rule__UnitTestInput__Group__2 : rule__UnitTestInput__Group__2__Impl ;
    public final void rule__UnitTestInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1403:1: ( rule__UnitTestInput__Group__2__Impl )
            // InternalDSL.g:1404:2: rule__UnitTestInput__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnitTestInput__Group__2__Impl();

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
    // $ANTLR end "rule__UnitTestInput__Group__2"


    // $ANTLR start "rule__UnitTestInput__Group__2__Impl"
    // InternalDSL.g:1410:1: rule__UnitTestInput__Group__2__Impl : ( ( rule__UnitTestInput__OverwritingValueAssignment_2 ) ) ;
    public final void rule__UnitTestInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1414:1: ( ( ( rule__UnitTestInput__OverwritingValueAssignment_2 ) ) )
            // InternalDSL.g:1415:1: ( ( rule__UnitTestInput__OverwritingValueAssignment_2 ) )
            {
            // InternalDSL.g:1415:1: ( ( rule__UnitTestInput__OverwritingValueAssignment_2 ) )
            // InternalDSL.g:1416:2: ( rule__UnitTestInput__OverwritingValueAssignment_2 )
            {
             before(grammarAccess.getUnitTestInputAccess().getOverwritingValueAssignment_2()); 
            // InternalDSL.g:1417:2: ( rule__UnitTestInput__OverwritingValueAssignment_2 )
            // InternalDSL.g:1417:3: rule__UnitTestInput__OverwritingValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UnitTestInput__OverwritingValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnitTestInputAccess().getOverwritingValueAssignment_2()); 

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
    // $ANTLR end "rule__UnitTestInput__Group__2__Impl"


    // $ANTLR start "rule__IntergerLiteral__Group__0"
    // InternalDSL.g:1426:1: rule__IntergerLiteral__Group__0 : rule__IntergerLiteral__Group__0__Impl rule__IntergerLiteral__Group__1 ;
    public final void rule__IntergerLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1430:1: ( rule__IntergerLiteral__Group__0__Impl rule__IntergerLiteral__Group__1 )
            // InternalDSL.g:1431:2: rule__IntergerLiteral__Group__0__Impl rule__IntergerLiteral__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__IntergerLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntergerLiteral__Group__1();

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
    // $ANTLR end "rule__IntergerLiteral__Group__0"


    // $ANTLR start "rule__IntergerLiteral__Group__0__Impl"
    // InternalDSL.g:1438:1: rule__IntergerLiteral__Group__0__Impl : ( () ) ;
    public final void rule__IntergerLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1442:1: ( ( () ) )
            // InternalDSL.g:1443:1: ( () )
            {
            // InternalDSL.g:1443:1: ( () )
            // InternalDSL.g:1444:2: ()
            {
             before(grammarAccess.getIntergerLiteralAccess().getIntegerLiteralAction_0()); 
            // InternalDSL.g:1445:2: ()
            // InternalDSL.g:1445:3: 
            {
            }

             after(grammarAccess.getIntergerLiteralAccess().getIntegerLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntergerLiteral__Group__0__Impl"


    // $ANTLR start "rule__IntergerLiteral__Group__1"
    // InternalDSL.g:1453:1: rule__IntergerLiteral__Group__1 : rule__IntergerLiteral__Group__1__Impl ;
    public final void rule__IntergerLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1457:1: ( rule__IntergerLiteral__Group__1__Impl )
            // InternalDSL.g:1458:2: rule__IntergerLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntergerLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__IntergerLiteral__Group__1"


    // $ANTLR start "rule__IntergerLiteral__Group__1__Impl"
    // InternalDSL.g:1464:1: rule__IntergerLiteral__Group__1__Impl : ( ( rule__IntergerLiteral__ValueAssignment_1 ) ) ;
    public final void rule__IntergerLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1468:1: ( ( ( rule__IntergerLiteral__ValueAssignment_1 ) ) )
            // InternalDSL.g:1469:1: ( ( rule__IntergerLiteral__ValueAssignment_1 ) )
            {
            // InternalDSL.g:1469:1: ( ( rule__IntergerLiteral__ValueAssignment_1 ) )
            // InternalDSL.g:1470:2: ( rule__IntergerLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getIntergerLiteralAccess().getValueAssignment_1()); 
            // InternalDSL.g:1471:2: ( rule__IntergerLiteral__ValueAssignment_1 )
            // InternalDSL.g:1471:3: rule__IntergerLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IntergerLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntergerLiteralAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__IntergerLiteral__Group__1__Impl"


    // $ANTLR start "rule__StringLiteral__Group__0"
    // InternalDSL.g:1480:1: rule__StringLiteral__Group__0 : rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 ;
    public final void rule__StringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1484:1: ( rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 )
            // InternalDSL.g:1485:2: rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__StringLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group__1();

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
    // $ANTLR end "rule__StringLiteral__Group__0"


    // $ANTLR start "rule__StringLiteral__Group__0__Impl"
    // InternalDSL.g:1492:1: rule__StringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__StringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1496:1: ( ( () ) )
            // InternalDSL.g:1497:1: ( () )
            {
            // InternalDSL.g:1497:1: ( () )
            // InternalDSL.g:1498:2: ()
            {
             before(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 
            // InternalDSL.g:1499:2: ()
            // InternalDSL.g:1499:3: 
            {
            }

             after(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__0__Impl"


    // $ANTLR start "rule__StringLiteral__Group__1"
    // InternalDSL.g:1507:1: rule__StringLiteral__Group__1 : rule__StringLiteral__Group__1__Impl ;
    public final void rule__StringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1511:1: ( rule__StringLiteral__Group__1__Impl )
            // InternalDSL.g:1512:2: rule__StringLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__StringLiteral__Group__1"


    // $ANTLR start "rule__StringLiteral__Group__1__Impl"
    // InternalDSL.g:1518:1: rule__StringLiteral__Group__1__Impl : ( ( rule__StringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__StringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1522:1: ( ( ( rule__StringLiteral__ValueAssignment_1 ) ) )
            // InternalDSL.g:1523:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            {
            // InternalDSL.g:1523:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            // InternalDSL.g:1524:2: ( rule__StringLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            // InternalDSL.g:1525:2: ( rule__StringLiteral__ValueAssignment_1 )
            // InternalDSL.g:1525:3: rule__StringLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__StringLiteral__Group__1__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__0"
    // InternalDSL.g:1534:1: rule__BooleanLiteral__Group__0 : rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1538:1: ( rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 )
            // InternalDSL.g:1539:2: rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__BooleanLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Group__1();

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
    // $ANTLR end "rule__BooleanLiteral__Group__0"


    // $ANTLR start "rule__BooleanLiteral__Group__0__Impl"
    // InternalDSL.g:1546:1: rule__BooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1550:1: ( ( () ) )
            // InternalDSL.g:1551:1: ( () )
            {
            // InternalDSL.g:1551:1: ( () )
            // InternalDSL.g:1552:2: ()
            {
             before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            // InternalDSL.g:1553:2: ()
            // InternalDSL.g:1553:3: 
            {
            }

             after(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__0__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__1"
    // InternalDSL.g:1561:1: rule__BooleanLiteral__Group__1 : rule__BooleanLiteral__Group__1__Impl ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1565:1: ( rule__BooleanLiteral__Group__1__Impl )
            // InternalDSL.g:1566:2: rule__BooleanLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanLiteral__Group__1"


    // $ANTLR start "rule__BooleanLiteral__Group__1__Impl"
    // InternalDSL.g:1572:1: rule__BooleanLiteral__Group__1__Impl : ( ( rule__BooleanLiteral__ValueAssignment_1 ) ) ;
    public final void rule__BooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1576:1: ( ( ( rule__BooleanLiteral__ValueAssignment_1 ) ) )
            // InternalDSL.g:1577:1: ( ( rule__BooleanLiteral__ValueAssignment_1 ) )
            {
            // InternalDSL.g:1577:1: ( ( rule__BooleanLiteral__ValueAssignment_1 ) )
            // InternalDSL.g:1578:2: ( rule__BooleanLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1()); 
            // InternalDSL.g:1579:2: ( rule__BooleanLiteral__ValueAssignment_1 )
            // InternalDSL.g:1579:3: rule__BooleanLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__BooleanLiteral__Group__1__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__0"
    // InternalDSL.g:1588:1: rule__IntegerVariable__Group__0 : rule__IntegerVariable__Group__0__Impl rule__IntegerVariable__Group__1 ;
    public final void rule__IntegerVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1592:1: ( rule__IntegerVariable__Group__0__Impl rule__IntegerVariable__Group__1 )
            // InternalDSL.g:1593:2: rule__IntegerVariable__Group__0__Impl rule__IntegerVariable__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__IntegerVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerVariable__Group__1();

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
    // $ANTLR end "rule__IntegerVariable__Group__0"


    // $ANTLR start "rule__IntegerVariable__Group__0__Impl"
    // InternalDSL.g:1600:1: rule__IntegerVariable__Group__0__Impl : ( () ) ;
    public final void rule__IntegerVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1604:1: ( ( () ) )
            // InternalDSL.g:1605:1: ( () )
            {
            // InternalDSL.g:1605:1: ( () )
            // InternalDSL.g:1606:2: ()
            {
             before(grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0()); 
            // InternalDSL.g:1607:2: ()
            // InternalDSL.g:1607:3: 
            {
            }

             after(grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__0__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__1"
    // InternalDSL.g:1615:1: rule__IntegerVariable__Group__1 : rule__IntegerVariable__Group__1__Impl rule__IntegerVariable__Group__2 ;
    public final void rule__IntegerVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1619:1: ( rule__IntegerVariable__Group__1__Impl rule__IntegerVariable__Group__2 )
            // InternalDSL.g:1620:2: rule__IntegerVariable__Group__1__Impl rule__IntegerVariable__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__IntegerVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerVariable__Group__2();

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
    // $ANTLR end "rule__IntegerVariable__Group__1"


    // $ANTLR start "rule__IntegerVariable__Group__1__Impl"
    // InternalDSL.g:1627:1: rule__IntegerVariable__Group__1__Impl : ( 'int' ) ;
    public final void rule__IntegerVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1631:1: ( ( 'int' ) )
            // InternalDSL.g:1632:1: ( 'int' )
            {
            // InternalDSL.g:1632:1: ( 'int' )
            // InternalDSL.g:1633:2: 'int'
            {
             before(grammarAccess.getIntegerVariableAccess().getIntKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIntegerVariableAccess().getIntKeyword_1()); 

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
    // $ANTLR end "rule__IntegerVariable__Group__1__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__2"
    // InternalDSL.g:1642:1: rule__IntegerVariable__Group__2 : rule__IntegerVariable__Group__2__Impl rule__IntegerVariable__Group__3 ;
    public final void rule__IntegerVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1646:1: ( rule__IntegerVariable__Group__2__Impl rule__IntegerVariable__Group__3 )
            // InternalDSL.g:1647:2: rule__IntegerVariable__Group__2__Impl rule__IntegerVariable__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__IntegerVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerVariable__Group__3();

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
    // $ANTLR end "rule__IntegerVariable__Group__2"


    // $ANTLR start "rule__IntegerVariable__Group__2__Impl"
    // InternalDSL.g:1654:1: rule__IntegerVariable__Group__2__Impl : ( ( rule__IntegerVariable__NameAssignment_2 ) ) ;
    public final void rule__IntegerVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1658:1: ( ( ( rule__IntegerVariable__NameAssignment_2 ) ) )
            // InternalDSL.g:1659:1: ( ( rule__IntegerVariable__NameAssignment_2 ) )
            {
            // InternalDSL.g:1659:1: ( ( rule__IntegerVariable__NameAssignment_2 ) )
            // InternalDSL.g:1660:2: ( rule__IntegerVariable__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerVariableAccess().getNameAssignment_2()); 
            // InternalDSL.g:1661:2: ( rule__IntegerVariable__NameAssignment_2 )
            // InternalDSL.g:1661:3: rule__IntegerVariable__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IntegerVariable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerVariableAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__IntegerVariable__Group__2__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__3"
    // InternalDSL.g:1669:1: rule__IntegerVariable__Group__3 : rule__IntegerVariable__Group__3__Impl rule__IntegerVariable__Group__4 ;
    public final void rule__IntegerVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1673:1: ( rule__IntegerVariable__Group__3__Impl rule__IntegerVariable__Group__4 )
            // InternalDSL.g:1674:2: rule__IntegerVariable__Group__3__Impl rule__IntegerVariable__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__IntegerVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerVariable__Group__4();

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
    // $ANTLR end "rule__IntegerVariable__Group__3"


    // $ANTLR start "rule__IntegerVariable__Group__3__Impl"
    // InternalDSL.g:1681:1: rule__IntegerVariable__Group__3__Impl : ( '=' ) ;
    public final void rule__IntegerVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1685:1: ( ( '=' ) )
            // InternalDSL.g:1686:1: ( '=' )
            {
            // InternalDSL.g:1686:1: ( '=' )
            // InternalDSL.g:1687:2: '='
            {
             before(grammarAccess.getIntegerVariableAccess().getEqualsSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIntegerVariableAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__IntegerVariable__Group__3__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__4"
    // InternalDSL.g:1696:1: rule__IntegerVariable__Group__4 : rule__IntegerVariable__Group__4__Impl ;
    public final void rule__IntegerVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1700:1: ( rule__IntegerVariable__Group__4__Impl )
            // InternalDSL.g:1701:2: rule__IntegerVariable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerVariable__Group__4__Impl();

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
    // $ANTLR end "rule__IntegerVariable__Group__4"


    // $ANTLR start "rule__IntegerVariable__Group__4__Impl"
    // InternalDSL.g:1707:1: rule__IntegerVariable__Group__4__Impl : ( ( rule__IntegerVariable__ValueAssignment_4 ) ) ;
    public final void rule__IntegerVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1711:1: ( ( ( rule__IntegerVariable__ValueAssignment_4 ) ) )
            // InternalDSL.g:1712:1: ( ( rule__IntegerVariable__ValueAssignment_4 ) )
            {
            // InternalDSL.g:1712:1: ( ( rule__IntegerVariable__ValueAssignment_4 ) )
            // InternalDSL.g:1713:2: ( rule__IntegerVariable__ValueAssignment_4 )
            {
             before(grammarAccess.getIntegerVariableAccess().getValueAssignment_4()); 
            // InternalDSL.g:1714:2: ( rule__IntegerVariable__ValueAssignment_4 )
            // InternalDSL.g:1714:3: rule__IntegerVariable__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IntegerVariable__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntegerVariableAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__IntegerVariable__Group__4__Impl"


    // $ANTLR start "rule__StringVariable__Group__0"
    // InternalDSL.g:1723:1: rule__StringVariable__Group__0 : rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1 ;
    public final void rule__StringVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1727:1: ( rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1 )
            // InternalDSL.g:1728:2: rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__StringVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariable__Group__1();

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
    // $ANTLR end "rule__StringVariable__Group__0"


    // $ANTLR start "rule__StringVariable__Group__0__Impl"
    // InternalDSL.g:1735:1: rule__StringVariable__Group__0__Impl : ( () ) ;
    public final void rule__StringVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1739:1: ( ( () ) )
            // InternalDSL.g:1740:1: ( () )
            {
            // InternalDSL.g:1740:1: ( () )
            // InternalDSL.g:1741:2: ()
            {
             before(grammarAccess.getStringVariableAccess().getStringVariableAction_0()); 
            // InternalDSL.g:1742:2: ()
            // InternalDSL.g:1742:3: 
            {
            }

             after(grammarAccess.getStringVariableAccess().getStringVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariable__Group__0__Impl"


    // $ANTLR start "rule__StringVariable__Group__1"
    // InternalDSL.g:1750:1: rule__StringVariable__Group__1 : rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2 ;
    public final void rule__StringVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1754:1: ( rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2 )
            // InternalDSL.g:1755:2: rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__StringVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariable__Group__2();

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
    // $ANTLR end "rule__StringVariable__Group__1"


    // $ANTLR start "rule__StringVariable__Group__1__Impl"
    // InternalDSL.g:1762:1: rule__StringVariable__Group__1__Impl : ( 'string' ) ;
    public final void rule__StringVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1766:1: ( ( 'string' ) )
            // InternalDSL.g:1767:1: ( 'string' )
            {
            // InternalDSL.g:1767:1: ( 'string' )
            // InternalDSL.g:1768:2: 'string'
            {
             before(grammarAccess.getStringVariableAccess().getStringKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStringVariableAccess().getStringKeyword_1()); 

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
    // $ANTLR end "rule__StringVariable__Group__1__Impl"


    // $ANTLR start "rule__StringVariable__Group__2"
    // InternalDSL.g:1777:1: rule__StringVariable__Group__2 : rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3 ;
    public final void rule__StringVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1781:1: ( rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3 )
            // InternalDSL.g:1782:2: rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__StringVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariable__Group__3();

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
    // $ANTLR end "rule__StringVariable__Group__2"


    // $ANTLR start "rule__StringVariable__Group__2__Impl"
    // InternalDSL.g:1789:1: rule__StringVariable__Group__2__Impl : ( ( rule__StringVariable__NameAssignment_2 ) ) ;
    public final void rule__StringVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1793:1: ( ( ( rule__StringVariable__NameAssignment_2 ) ) )
            // InternalDSL.g:1794:1: ( ( rule__StringVariable__NameAssignment_2 ) )
            {
            // InternalDSL.g:1794:1: ( ( rule__StringVariable__NameAssignment_2 ) )
            // InternalDSL.g:1795:2: ( rule__StringVariable__NameAssignment_2 )
            {
             before(grammarAccess.getStringVariableAccess().getNameAssignment_2()); 
            // InternalDSL.g:1796:2: ( rule__StringVariable__NameAssignment_2 )
            // InternalDSL.g:1796:3: rule__StringVariable__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StringVariable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringVariableAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__StringVariable__Group__2__Impl"


    // $ANTLR start "rule__StringVariable__Group__3"
    // InternalDSL.g:1804:1: rule__StringVariable__Group__3 : rule__StringVariable__Group__3__Impl rule__StringVariable__Group__4 ;
    public final void rule__StringVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1808:1: ( rule__StringVariable__Group__3__Impl rule__StringVariable__Group__4 )
            // InternalDSL.g:1809:2: rule__StringVariable__Group__3__Impl rule__StringVariable__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__StringVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariable__Group__4();

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
    // $ANTLR end "rule__StringVariable__Group__3"


    // $ANTLR start "rule__StringVariable__Group__3__Impl"
    // InternalDSL.g:1816:1: rule__StringVariable__Group__3__Impl : ( '=' ) ;
    public final void rule__StringVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1820:1: ( ( '=' ) )
            // InternalDSL.g:1821:1: ( '=' )
            {
            // InternalDSL.g:1821:1: ( '=' )
            // InternalDSL.g:1822:2: '='
            {
             before(grammarAccess.getStringVariableAccess().getEqualsSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStringVariableAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__StringVariable__Group__3__Impl"


    // $ANTLR start "rule__StringVariable__Group__4"
    // InternalDSL.g:1831:1: rule__StringVariable__Group__4 : rule__StringVariable__Group__4__Impl ;
    public final void rule__StringVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1835:1: ( rule__StringVariable__Group__4__Impl )
            // InternalDSL.g:1836:2: rule__StringVariable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringVariable__Group__4__Impl();

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
    // $ANTLR end "rule__StringVariable__Group__4"


    // $ANTLR start "rule__StringVariable__Group__4__Impl"
    // InternalDSL.g:1842:1: rule__StringVariable__Group__4__Impl : ( ( rule__StringVariable__ValueAssignment_4 ) ) ;
    public final void rule__StringVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1846:1: ( ( ( rule__StringVariable__ValueAssignment_4 ) ) )
            // InternalDSL.g:1847:1: ( ( rule__StringVariable__ValueAssignment_4 ) )
            {
            // InternalDSL.g:1847:1: ( ( rule__StringVariable__ValueAssignment_4 ) )
            // InternalDSL.g:1848:2: ( rule__StringVariable__ValueAssignment_4 )
            {
             before(grammarAccess.getStringVariableAccess().getValueAssignment_4()); 
            // InternalDSL.g:1849:2: ( rule__StringVariable__ValueAssignment_4 )
            // InternalDSL.g:1849:3: rule__StringVariable__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__StringVariable__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStringVariableAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__StringVariable__Group__4__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__0"
    // InternalDSL.g:1858:1: rule__BooleanVariable__Group__0 : rule__BooleanVariable__Group__0__Impl rule__BooleanVariable__Group__1 ;
    public final void rule__BooleanVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1862:1: ( rule__BooleanVariable__Group__0__Impl rule__BooleanVariable__Group__1 )
            // InternalDSL.g:1863:2: rule__BooleanVariable__Group__0__Impl rule__BooleanVariable__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__BooleanVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanVariable__Group__1();

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
    // $ANTLR end "rule__BooleanVariable__Group__0"


    // $ANTLR start "rule__BooleanVariable__Group__0__Impl"
    // InternalDSL.g:1870:1: rule__BooleanVariable__Group__0__Impl : ( () ) ;
    public final void rule__BooleanVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1874:1: ( ( () ) )
            // InternalDSL.g:1875:1: ( () )
            {
            // InternalDSL.g:1875:1: ( () )
            // InternalDSL.g:1876:2: ()
            {
             before(grammarAccess.getBooleanVariableAccess().getBooleanVariableAction_0()); 
            // InternalDSL.g:1877:2: ()
            // InternalDSL.g:1877:3: 
            {
            }

             after(grammarAccess.getBooleanVariableAccess().getBooleanVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__0__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__1"
    // InternalDSL.g:1885:1: rule__BooleanVariable__Group__1 : rule__BooleanVariable__Group__1__Impl rule__BooleanVariable__Group__2 ;
    public final void rule__BooleanVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1889:1: ( rule__BooleanVariable__Group__1__Impl rule__BooleanVariable__Group__2 )
            // InternalDSL.g:1890:2: rule__BooleanVariable__Group__1__Impl rule__BooleanVariable__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__BooleanVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanVariable__Group__2();

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
    // $ANTLR end "rule__BooleanVariable__Group__1"


    // $ANTLR start "rule__BooleanVariable__Group__1__Impl"
    // InternalDSL.g:1897:1: rule__BooleanVariable__Group__1__Impl : ( 'bool' ) ;
    public final void rule__BooleanVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1901:1: ( ( 'bool' ) )
            // InternalDSL.g:1902:1: ( 'bool' )
            {
            // InternalDSL.g:1902:1: ( 'bool' )
            // InternalDSL.g:1903:2: 'bool'
            {
             before(grammarAccess.getBooleanVariableAccess().getBoolKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBooleanVariableAccess().getBoolKeyword_1()); 

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
    // $ANTLR end "rule__BooleanVariable__Group__1__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__2"
    // InternalDSL.g:1912:1: rule__BooleanVariable__Group__2 : rule__BooleanVariable__Group__2__Impl rule__BooleanVariable__Group__3 ;
    public final void rule__BooleanVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1916:1: ( rule__BooleanVariable__Group__2__Impl rule__BooleanVariable__Group__3 )
            // InternalDSL.g:1917:2: rule__BooleanVariable__Group__2__Impl rule__BooleanVariable__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__BooleanVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanVariable__Group__3();

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
    // $ANTLR end "rule__BooleanVariable__Group__2"


    // $ANTLR start "rule__BooleanVariable__Group__2__Impl"
    // InternalDSL.g:1924:1: rule__BooleanVariable__Group__2__Impl : ( ( rule__BooleanVariable__NameAssignment_2 ) ) ;
    public final void rule__BooleanVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1928:1: ( ( ( rule__BooleanVariable__NameAssignment_2 ) ) )
            // InternalDSL.g:1929:1: ( ( rule__BooleanVariable__NameAssignment_2 ) )
            {
            // InternalDSL.g:1929:1: ( ( rule__BooleanVariable__NameAssignment_2 ) )
            // InternalDSL.g:1930:2: ( rule__BooleanVariable__NameAssignment_2 )
            {
             before(grammarAccess.getBooleanVariableAccess().getNameAssignment_2()); 
            // InternalDSL.g:1931:2: ( rule__BooleanVariable__NameAssignment_2 )
            // InternalDSL.g:1931:3: rule__BooleanVariable__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanVariable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanVariableAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__BooleanVariable__Group__2__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__3"
    // InternalDSL.g:1939:1: rule__BooleanVariable__Group__3 : rule__BooleanVariable__Group__3__Impl rule__BooleanVariable__Group__4 ;
    public final void rule__BooleanVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1943:1: ( rule__BooleanVariable__Group__3__Impl rule__BooleanVariable__Group__4 )
            // InternalDSL.g:1944:2: rule__BooleanVariable__Group__3__Impl rule__BooleanVariable__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__BooleanVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanVariable__Group__4();

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
    // $ANTLR end "rule__BooleanVariable__Group__3"


    // $ANTLR start "rule__BooleanVariable__Group__3__Impl"
    // InternalDSL.g:1951:1: rule__BooleanVariable__Group__3__Impl : ( '=' ) ;
    public final void rule__BooleanVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1955:1: ( ( '=' ) )
            // InternalDSL.g:1956:1: ( '=' )
            {
            // InternalDSL.g:1956:1: ( '=' )
            // InternalDSL.g:1957:2: '='
            {
             before(grammarAccess.getBooleanVariableAccess().getEqualsSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBooleanVariableAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__BooleanVariable__Group__3__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__4"
    // InternalDSL.g:1966:1: rule__BooleanVariable__Group__4 : rule__BooleanVariable__Group__4__Impl ;
    public final void rule__BooleanVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1970:1: ( rule__BooleanVariable__Group__4__Impl )
            // InternalDSL.g:1971:2: rule__BooleanVariable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanVariable__Group__4__Impl();

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
    // $ANTLR end "rule__BooleanVariable__Group__4"


    // $ANTLR start "rule__BooleanVariable__Group__4__Impl"
    // InternalDSL.g:1977:1: rule__BooleanVariable__Group__4__Impl : ( ( rule__BooleanVariable__ValueAssignment_4 ) ) ;
    public final void rule__BooleanVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1981:1: ( ( ( rule__BooleanVariable__ValueAssignment_4 ) ) )
            // InternalDSL.g:1982:1: ( ( rule__BooleanVariable__ValueAssignment_4 ) )
            {
            // InternalDSL.g:1982:1: ( ( rule__BooleanVariable__ValueAssignment_4 ) )
            // InternalDSL.g:1983:2: ( rule__BooleanVariable__ValueAssignment_4 )
            {
             before(grammarAccess.getBooleanVariableAccess().getValueAssignment_4()); 
            // InternalDSL.g:1984:2: ( rule__BooleanVariable__ValueAssignment_4 )
            // InternalDSL.g:1984:3: rule__BooleanVariable__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BooleanVariable__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBooleanVariableAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__BooleanVariable__Group__4__Impl"


    // $ANTLR start "rule__Puzzle__NameAssignment_5"
    // InternalDSL.g:1993:1: rule__Puzzle__NameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Puzzle__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1997:1: ( ( RULE_STRING ) )
            // InternalDSL.g:1998:2: ( RULE_STRING )
            {
            // InternalDSL.g:1998:2: ( RULE_STRING )
            // InternalDSL.g:1999:3: RULE_STRING
            {
             before(grammarAccess.getPuzzleAccess().getNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPuzzleAccess().getNameSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Puzzle__NameAssignment_5"


    // $ANTLR start "rule__Puzzle__DescriptionAssignment_8"
    // InternalDSL.g:2008:1: rule__Puzzle__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Puzzle__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2012:1: ( ( RULE_STRING ) )
            // InternalDSL.g:2013:2: ( RULE_STRING )
            {
            // InternalDSL.g:2013:2: ( RULE_STRING )
            // InternalDSL.g:2014:3: RULE_STRING
            {
             before(grammarAccess.getPuzzleAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPuzzleAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Puzzle__DescriptionAssignment_8"


    // $ANTLR start "rule__Puzzle__InputsAssignment_9"
    // InternalDSL.g:2023:1: rule__Puzzle__InputsAssignment_9 : ( ruleInputs ) ;
    public final void rule__Puzzle__InputsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2027:1: ( ( ruleInputs ) )
            // InternalDSL.g:2028:2: ( ruleInputs )
            {
            // InternalDSL.g:2028:2: ( ruleInputs )
            // InternalDSL.g:2029:3: ruleInputs
            {
             before(grammarAccess.getPuzzleAccess().getInputsInputsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleInputs();

            state._fsp--;

             after(grammarAccess.getPuzzleAccess().getInputsInputsParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Puzzle__InputsAssignment_9"


    // $ANTLR start "rule__Puzzle__TestsAssignment_10"
    // InternalDSL.g:2038:1: rule__Puzzle__TestsAssignment_10 : ( ruleUnitTest ) ;
    public final void rule__Puzzle__TestsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2042:1: ( ( ruleUnitTest ) )
            // InternalDSL.g:2043:2: ( ruleUnitTest )
            {
            // InternalDSL.g:2043:2: ( ruleUnitTest )
            // InternalDSL.g:2044:3: ruleUnitTest
            {
             before(grammarAccess.getPuzzleAccess().getTestsUnitTestParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleUnitTest();

            state._fsp--;

             after(grammarAccess.getPuzzleAccess().getTestsUnitTestParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Puzzle__TestsAssignment_10"


    // $ANTLR start "rule__Inputs__VariablesAssignment_2"
    // InternalDSL.g:2053:1: rule__Inputs__VariablesAssignment_2 : ( ruleVariable ) ;
    public final void rule__Inputs__VariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2057:1: ( ( ruleVariable ) )
            // InternalDSL.g:2058:2: ( ruleVariable )
            {
            // InternalDSL.g:2058:2: ( ruleVariable )
            // InternalDSL.g:2059:3: ruleVariable
            {
             before(grammarAccess.getInputsAccess().getVariablesVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getInputsAccess().getVariablesVariableParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Inputs__VariablesAssignment_2"


    // $ANTLR start "rule__UnitTest__InputsAssignment_3_2"
    // InternalDSL.g:2068:1: rule__UnitTest__InputsAssignment_3_2 : ( ruleUnitTestInput ) ;
    public final void rule__UnitTest__InputsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2072:1: ( ( ruleUnitTestInput ) )
            // InternalDSL.g:2073:2: ( ruleUnitTestInput )
            {
            // InternalDSL.g:2073:2: ( ruleUnitTestInput )
            // InternalDSL.g:2074:3: ruleUnitTestInput
            {
             before(grammarAccess.getUnitTestAccess().getInputsUnitTestInputParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnitTestInput();

            state._fsp--;

             after(grammarAccess.getUnitTestAccess().getInputsUnitTestInputParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__UnitTest__InputsAssignment_3_2"


    // $ANTLR start "rule__UnitTest__ExpectedAssignment_5"
    // InternalDSL.g:2083:1: rule__UnitTest__ExpectedAssignment_5 : ( ruleLiteral ) ;
    public final void rule__UnitTest__ExpectedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2087:1: ( ( ruleLiteral ) )
            // InternalDSL.g:2088:2: ( ruleLiteral )
            {
            // InternalDSL.g:2088:2: ( ruleLiteral )
            // InternalDSL.g:2089:3: ruleLiteral
            {
             before(grammarAccess.getUnitTestAccess().getExpectedLiteralParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getUnitTestAccess().getExpectedLiteralParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__UnitTest__ExpectedAssignment_5"


    // $ANTLR start "rule__UnitTest__FailedMessageAssignment_6_4"
    // InternalDSL.g:2098:1: rule__UnitTest__FailedMessageAssignment_6_4 : ( RULE_STRING ) ;
    public final void rule__UnitTest__FailedMessageAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2102:1: ( ( RULE_STRING ) )
            // InternalDSL.g:2103:2: ( RULE_STRING )
            {
            // InternalDSL.g:2103:2: ( RULE_STRING )
            // InternalDSL.g:2104:3: RULE_STRING
            {
             before(grammarAccess.getUnitTestAccess().getFailedMessageSTRINGTerminalRuleCall_6_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUnitTestAccess().getFailedMessageSTRINGTerminalRuleCall_6_4_0()); 

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
    // $ANTLR end "rule__UnitTest__FailedMessageAssignment_6_4"


    // $ANTLR start "rule__UnitTestInput__VariableAssignment_0"
    // InternalDSL.g:2113:1: rule__UnitTestInput__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__UnitTestInput__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2117:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2118:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2118:2: ( ( RULE_ID ) )
            // InternalDSL.g:2119:3: ( RULE_ID )
            {
             before(grammarAccess.getUnitTestInputAccess().getVariableVariableCrossReference_0_0()); 
            // InternalDSL.g:2120:3: ( RULE_ID )
            // InternalDSL.g:2121:4: RULE_ID
            {
             before(grammarAccess.getUnitTestInputAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUnitTestInputAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getUnitTestInputAccess().getVariableVariableCrossReference_0_0()); 

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
    // $ANTLR end "rule__UnitTestInput__VariableAssignment_0"


    // $ANTLR start "rule__UnitTestInput__OverwritingValueAssignment_2"
    // InternalDSL.g:2132:1: rule__UnitTestInput__OverwritingValueAssignment_2 : ( ruleLiteral ) ;
    public final void rule__UnitTestInput__OverwritingValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2136:1: ( ( ruleLiteral ) )
            // InternalDSL.g:2137:2: ( ruleLiteral )
            {
            // InternalDSL.g:2137:2: ( ruleLiteral )
            // InternalDSL.g:2138:3: ruleLiteral
            {
             before(grammarAccess.getUnitTestInputAccess().getOverwritingValueLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getUnitTestInputAccess().getOverwritingValueLiteralParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__UnitTestInput__OverwritingValueAssignment_2"


    // $ANTLR start "rule__IntergerLiteral__ValueAssignment_1"
    // InternalDSL.g:2147:1: rule__IntergerLiteral__ValueAssignment_1 : ( RULE_REALINT ) ;
    public final void rule__IntergerLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2151:1: ( ( RULE_REALINT ) )
            // InternalDSL.g:2152:2: ( RULE_REALINT )
            {
            // InternalDSL.g:2152:2: ( RULE_REALINT )
            // InternalDSL.g:2153:3: RULE_REALINT
            {
             before(grammarAccess.getIntergerLiteralAccess().getValueREALINTTerminalRuleCall_1_0()); 
            match(input,RULE_REALINT,FOLLOW_2); 
             after(grammarAccess.getIntergerLiteralAccess().getValueREALINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__IntergerLiteral__ValueAssignment_1"


    // $ANTLR start "rule__StringLiteral__ValueAssignment_1"
    // InternalDSL.g:2162:1: rule__StringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2166:1: ( ( RULE_STRING ) )
            // InternalDSL.g:2167:2: ( RULE_STRING )
            {
            // InternalDSL.g:2167:2: ( RULE_STRING )
            // InternalDSL.g:2168:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__StringLiteral__ValueAssignment_1"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment_1"
    // InternalDSL.g:2177:1: rule__BooleanLiteral__ValueAssignment_1 : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2181:1: ( ( RULE_BOOLEAN ) )
            // InternalDSL.g:2182:2: ( RULE_BOOLEAN )
            {
            // InternalDSL.g:2182:2: ( RULE_BOOLEAN )
            // InternalDSL.g:2183:3: RULE_BOOLEAN
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment_1"


    // $ANTLR start "rule__IntegerVariable__NameAssignment_2"
    // InternalDSL.g:2192:1: rule__IntegerVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IntegerVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2196:1: ( ( RULE_ID ) )
            // InternalDSL.g:2197:2: ( RULE_ID )
            {
            // InternalDSL.g:2197:2: ( RULE_ID )
            // InternalDSL.g:2198:3: RULE_ID
            {
             before(grammarAccess.getIntegerVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntegerVariableAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__IntegerVariable__NameAssignment_2"


    // $ANTLR start "rule__IntegerVariable__ValueAssignment_4"
    // InternalDSL.g:2207:1: rule__IntegerVariable__ValueAssignment_4 : ( RULE_REALINT ) ;
    public final void rule__IntegerVariable__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2211:1: ( ( RULE_REALINT ) )
            // InternalDSL.g:2212:2: ( RULE_REALINT )
            {
            // InternalDSL.g:2212:2: ( RULE_REALINT )
            // InternalDSL.g:2213:3: RULE_REALINT
            {
             before(grammarAccess.getIntegerVariableAccess().getValueREALINTTerminalRuleCall_4_0()); 
            match(input,RULE_REALINT,FOLLOW_2); 
             after(grammarAccess.getIntegerVariableAccess().getValueREALINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__IntegerVariable__ValueAssignment_4"


    // $ANTLR start "rule__StringVariable__NameAssignment_2"
    // InternalDSL.g:2222:1: rule__StringVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StringVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2226:1: ( ( RULE_ID ) )
            // InternalDSL.g:2227:2: ( RULE_ID )
            {
            // InternalDSL.g:2227:2: ( RULE_ID )
            // InternalDSL.g:2228:3: RULE_ID
            {
             before(grammarAccess.getStringVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringVariableAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__StringVariable__NameAssignment_2"


    // $ANTLR start "rule__StringVariable__ValueAssignment_4"
    // InternalDSL.g:2237:1: rule__StringVariable__ValueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__StringVariable__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2241:1: ( ( RULE_STRING ) )
            // InternalDSL.g:2242:2: ( RULE_STRING )
            {
            // InternalDSL.g:2242:2: ( RULE_STRING )
            // InternalDSL.g:2243:3: RULE_STRING
            {
             before(grammarAccess.getStringVariableAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringVariableAccess().getValueSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__StringVariable__ValueAssignment_4"


    // $ANTLR start "rule__BooleanVariable__NameAssignment_2"
    // InternalDSL.g:2252:1: rule__BooleanVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BooleanVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2256:1: ( ( RULE_ID ) )
            // InternalDSL.g:2257:2: ( RULE_ID )
            {
            // InternalDSL.g:2257:2: ( RULE_ID )
            // InternalDSL.g:2258:3: RULE_ID
            {
             before(grammarAccess.getBooleanVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBooleanVariableAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__BooleanVariable__NameAssignment_2"


    // $ANTLR start "rule__BooleanVariable__ValueAssignment_4"
    // InternalDSL.g:2267:1: rule__BooleanVariable__ValueAssignment_4 : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanVariable__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2271:1: ( ( RULE_BOOLEAN ) )
            // InternalDSL.g:2272:2: ( RULE_BOOLEAN )
            {
            // InternalDSL.g:2272:2: ( RULE_BOOLEAN )
            // InternalDSL.g:2273:3: RULE_BOOLEAN
            {
             before(grammarAccess.getBooleanVariableAccess().getValueBOOLEANTerminalRuleCall_4_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getBooleanVariableAccess().getValueBOOLEANTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__BooleanVariable__ValueAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});

}