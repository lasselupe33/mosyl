package org.mdse.puzzle.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mdse.puzzle.dsl.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalAntlrParser {
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

        public InternalDSLParser(TokenStream input, DSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Puzzle";
       	}

       	@Override
       	protected DSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePuzzle"
    // InternalDSL.g:64:1: entryRulePuzzle returns [EObject current=null] : iv_rulePuzzle= rulePuzzle EOF ;
    public final EObject entryRulePuzzle() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePuzzle = null;


        try {
            // InternalDSL.g:64:47: (iv_rulePuzzle= rulePuzzle EOF )
            // InternalDSL.g:65:2: iv_rulePuzzle= rulePuzzle EOF
            {
             newCompositeNode(grammarAccess.getPuzzleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePuzzle=rulePuzzle();

            state._fsp--;

             current =iv_rulePuzzle; 
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
    // $ANTLR end "entryRulePuzzle"


    // $ANTLR start "rulePuzzle"
    // InternalDSL.g:71:1: rulePuzzle returns [EObject current=null] : ( () otherlv_1= 'PUZZLE' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_inputs_9_0= ruleInputs ) )? ( (lv_tests_10_0= ruleUnitTest ) )+ otherlv_11= '}' ) ;
    public final EObject rulePuzzle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_11=null;
        EObject lv_inputs_9_0 = null;

        EObject lv_tests_10_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:77:2: ( ( () otherlv_1= 'PUZZLE' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_inputs_9_0= ruleInputs ) )? ( (lv_tests_10_0= ruleUnitTest ) )+ otherlv_11= '}' ) )
            // InternalDSL.g:78:2: ( () otherlv_1= 'PUZZLE' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_inputs_9_0= ruleInputs ) )? ( (lv_tests_10_0= ruleUnitTest ) )+ otherlv_11= '}' )
            {
            // InternalDSL.g:78:2: ( () otherlv_1= 'PUZZLE' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_inputs_9_0= ruleInputs ) )? ( (lv_tests_10_0= ruleUnitTest ) )+ otherlv_11= '}' )
            // InternalDSL.g:79:3: () otherlv_1= 'PUZZLE' otherlv_2= '{' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_inputs_9_0= ruleInputs ) )? ( (lv_tests_10_0= ruleUnitTest ) )+ otherlv_11= '}'
            {
            // InternalDSL.g:79:3: ()
            // InternalDSL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPuzzleAccess().getPuzzleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPuzzleAccess().getPUZZLEKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPuzzleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPuzzleAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getPuzzleAccess().getEqualsSignKeyword_4());
            		
            // InternalDSL.g:102:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalDSL.g:103:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalDSL.g:103:4: (lv_name_5_0= RULE_STRING )
            // InternalDSL.g:104:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_5_0, grammarAccess.getPuzzleAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPuzzleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getPuzzleAccess().getDescriptionKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getPuzzleAccess().getEqualsSignKeyword_7());
            		
            // InternalDSL.g:128:3: ( (lv_description_8_0= RULE_STRING ) )
            // InternalDSL.g:129:4: (lv_description_8_0= RULE_STRING )
            {
            // InternalDSL.g:129:4: (lv_description_8_0= RULE_STRING )
            // InternalDSL.g:130:5: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_description_8_0, grammarAccess.getPuzzleAccess().getDescriptionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPuzzleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDSL.g:146:3: ( (lv_inputs_9_0= ruleInputs ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDSL.g:147:4: (lv_inputs_9_0= ruleInputs )
                    {
                    // InternalDSL.g:147:4: (lv_inputs_9_0= ruleInputs )
                    // InternalDSL.g:148:5: lv_inputs_9_0= ruleInputs
                    {

                    					newCompositeNode(grammarAccess.getPuzzleAccess().getInputsInputsParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_inputs_9_0=ruleInputs();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPuzzleRule());
                    					}
                    					set(
                    						current,
                    						"inputs",
                    						lv_inputs_9_0,
                    						"org.mdse.puzzle.dsl.DSL.Inputs");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDSL.g:165:3: ( (lv_tests_10_0= ruleUnitTest ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDSL.g:166:4: (lv_tests_10_0= ruleUnitTest )
            	    {
            	    // InternalDSL.g:166:4: (lv_tests_10_0= ruleUnitTest )
            	    // InternalDSL.g:167:5: lv_tests_10_0= ruleUnitTest
            	    {

            	    					newCompositeNode(grammarAccess.getPuzzleAccess().getTestsUnitTestParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_tests_10_0=ruleUnitTest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPuzzleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tests",
            	    						lv_tests_10_0,
            	    						"org.mdse.puzzle.dsl.DSL.UnitTest");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPuzzleAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "rulePuzzle"


    // $ANTLR start "entryRuleInputs"
    // InternalDSL.g:192:1: entryRuleInputs returns [EObject current=null] : iv_ruleInputs= ruleInputs EOF ;
    public final EObject entryRuleInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputs = null;


        try {
            // InternalDSL.g:192:47: (iv_ruleInputs= ruleInputs EOF )
            // InternalDSL.g:193:2: iv_ruleInputs= ruleInputs EOF
            {
             newCompositeNode(grammarAccess.getInputsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputs=ruleInputs();

            state._fsp--;

             current =iv_ruleInputs; 
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
    // $ANTLR end "entryRuleInputs"


    // $ANTLR start "ruleInputs"
    // InternalDSL.g:199:1: ruleInputs returns [EObject current=null] : (otherlv_0= 'INPUTS' otherlv_1= '{' ( (lv_variables_2_0= ruleVariable ) )+ otherlv_3= '}' ) ;
    public final EObject ruleInputs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variables_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:205:2: ( (otherlv_0= 'INPUTS' otherlv_1= '{' ( (lv_variables_2_0= ruleVariable ) )+ otherlv_3= '}' ) )
            // InternalDSL.g:206:2: (otherlv_0= 'INPUTS' otherlv_1= '{' ( (lv_variables_2_0= ruleVariable ) )+ otherlv_3= '}' )
            {
            // InternalDSL.g:206:2: (otherlv_0= 'INPUTS' otherlv_1= '{' ( (lv_variables_2_0= ruleVariable ) )+ otherlv_3= '}' )
            // InternalDSL.g:207:3: otherlv_0= 'INPUTS' otherlv_1= '{' ( (lv_variables_2_0= ruleVariable ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputsAccess().getINPUTSKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getInputsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDSL.g:215:3: ( (lv_variables_2_0= ruleVariable ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=24 && LA3_0<=26)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDSL.g:216:4: (lv_variables_2_0= ruleVariable )
            	    {
            	    // InternalDSL.g:216:4: (lv_variables_2_0= ruleVariable )
            	    // InternalDSL.g:217:5: lv_variables_2_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getInputsAccess().getVariablesVariableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_variables_2_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInputsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_2_0,
            	    						"org.mdse.puzzle.dsl.DSL.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInputsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleInputs"


    // $ANTLR start "entryRuleUnitTest"
    // InternalDSL.g:242:1: entryRuleUnitTest returns [EObject current=null] : iv_ruleUnitTest= ruleUnitTest EOF ;
    public final EObject entryRuleUnitTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitTest = null;


        try {
            // InternalDSL.g:242:49: (iv_ruleUnitTest= ruleUnitTest EOF )
            // InternalDSL.g:243:2: iv_ruleUnitTest= ruleUnitTest EOF
            {
             newCompositeNode(grammarAccess.getUnitTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitTest=ruleUnitTest();

            state._fsp--;

             current =iv_ruleUnitTest; 
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
    // $ANTLR end "entryRuleUnitTest"


    // $ANTLR start "ruleUnitTest"
    // InternalDSL.g:249:1: ruleUnitTest returns [EObject current=null] : ( () otherlv_1= 'TEST' otherlv_2= '{' (otherlv_3= 'INPUTS' otherlv_4= '{' ( (lv_inputs_5_0= ruleUnitTestInput ) )+ otherlv_6= '}' )? otherlv_7= 'EXPECTS' ( (lv_expected_8_0= ruleLiteral ) ) (otherlv_9= 'ON_FAIL' otherlv_10= '{' otherlv_11= 'msg' otherlv_12= '=' ( (lv_failedMessage_13_0= RULE_STRING ) ) otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleUnitTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_failedMessage_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_inputs_5_0 = null;

        EObject lv_expected_8_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:255:2: ( ( () otherlv_1= 'TEST' otherlv_2= '{' (otherlv_3= 'INPUTS' otherlv_4= '{' ( (lv_inputs_5_0= ruleUnitTestInput ) )+ otherlv_6= '}' )? otherlv_7= 'EXPECTS' ( (lv_expected_8_0= ruleLiteral ) ) (otherlv_9= 'ON_FAIL' otherlv_10= '{' otherlv_11= 'msg' otherlv_12= '=' ( (lv_failedMessage_13_0= RULE_STRING ) ) otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalDSL.g:256:2: ( () otherlv_1= 'TEST' otherlv_2= '{' (otherlv_3= 'INPUTS' otherlv_4= '{' ( (lv_inputs_5_0= ruleUnitTestInput ) )+ otherlv_6= '}' )? otherlv_7= 'EXPECTS' ( (lv_expected_8_0= ruleLiteral ) ) (otherlv_9= 'ON_FAIL' otherlv_10= '{' otherlv_11= 'msg' otherlv_12= '=' ( (lv_failedMessage_13_0= RULE_STRING ) ) otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalDSL.g:256:2: ( () otherlv_1= 'TEST' otherlv_2= '{' (otherlv_3= 'INPUTS' otherlv_4= '{' ( (lv_inputs_5_0= ruleUnitTestInput ) )+ otherlv_6= '}' )? otherlv_7= 'EXPECTS' ( (lv_expected_8_0= ruleLiteral ) ) (otherlv_9= 'ON_FAIL' otherlv_10= '{' otherlv_11= 'msg' otherlv_12= '=' ( (lv_failedMessage_13_0= RULE_STRING ) ) otherlv_14= '}' )? otherlv_15= '}' )
            // InternalDSL.g:257:3: () otherlv_1= 'TEST' otherlv_2= '{' (otherlv_3= 'INPUTS' otherlv_4= '{' ( (lv_inputs_5_0= ruleUnitTestInput ) )+ otherlv_6= '}' )? otherlv_7= 'EXPECTS' ( (lv_expected_8_0= ruleLiteral ) ) (otherlv_9= 'ON_FAIL' otherlv_10= '{' otherlv_11= 'msg' otherlv_12= '=' ( (lv_failedMessage_13_0= RULE_STRING ) ) otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalDSL.g:257:3: ()
            // InternalDSL.g:258:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitTestAccess().getUnitTestAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUnitTestAccess().getTESTKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getUnitTestAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:272:3: (otherlv_3= 'INPUTS' otherlv_4= '{' ( (lv_inputs_5_0= ruleUnitTestInput ) )+ otherlv_6= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSL.g:273:4: otherlv_3= 'INPUTS' otherlv_4= '{' ( (lv_inputs_5_0= ruleUnitTestInput ) )+ otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getUnitTestAccess().getINPUTSKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getUnitTestAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDSL.g:281:4: ( (lv_inputs_5_0= ruleUnitTestInput ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDSL.g:282:5: (lv_inputs_5_0= ruleUnitTestInput )
                    	    {
                    	    // InternalDSL.g:282:5: (lv_inputs_5_0= ruleUnitTestInput )
                    	    // InternalDSL.g:283:6: lv_inputs_5_0= ruleUnitTestInput
                    	    {

                    	    						newCompositeNode(grammarAccess.getUnitTestAccess().getInputsUnitTestInputParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_inputs_5_0=ruleUnitTestInput();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUnitTestRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inputs",
                    	    							lv_inputs_5_0,
                    	    							"org.mdse.puzzle.dsl.DSL.UnitTestInput");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    otherlv_6=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getUnitTestAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getUnitTestAccess().getEXPECTSKeyword_4());
            		
            // InternalDSL.g:309:3: ( (lv_expected_8_0= ruleLiteral ) )
            // InternalDSL.g:310:4: (lv_expected_8_0= ruleLiteral )
            {
            // InternalDSL.g:310:4: (lv_expected_8_0= ruleLiteral )
            // InternalDSL.g:311:5: lv_expected_8_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getUnitTestAccess().getExpectedLiteralParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
            lv_expected_8_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnitTestRule());
            					}
            					set(
            						current,
            						"expected",
            						lv_expected_8_0,
            						"org.mdse.puzzle.dsl.DSL.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:328:3: (otherlv_9= 'ON_FAIL' otherlv_10= '{' otherlv_11= 'msg' otherlv_12= '=' ( (lv_failedMessage_13_0= RULE_STRING ) ) otherlv_14= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:329:4: otherlv_9= 'ON_FAIL' otherlv_10= '{' otherlv_11= 'msg' otherlv_12= '=' ( (lv_failedMessage_13_0= RULE_STRING ) ) otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnitTestAccess().getON_FAILKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getUnitTestAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    otherlv_11=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getUnitTestAccess().getMsgKeyword_6_2());
                    			
                    otherlv_12=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getUnitTestAccess().getEqualsSignKeyword_6_3());
                    			
                    // InternalDSL.g:345:4: ( (lv_failedMessage_13_0= RULE_STRING ) )
                    // InternalDSL.g:346:5: (lv_failedMessage_13_0= RULE_STRING )
                    {
                    // InternalDSL.g:346:5: (lv_failedMessage_13_0= RULE_STRING )
                    // InternalDSL.g:347:6: lv_failedMessage_13_0= RULE_STRING
                    {
                    lv_failedMessage_13_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    						newLeafNode(lv_failedMessage_13_0, grammarAccess.getUnitTestAccess().getFailedMessageSTRINGTerminalRuleCall_6_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnitTestRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"failedMessage",
                    							lv_failedMessage_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,18,FOLLOW_19); 

                    				newLeafNode(otherlv_14, grammarAccess.getUnitTestAccess().getRightCurlyBracketKeyword_6_5());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getUnitTestAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleUnitTest"


    // $ANTLR start "entryRuleUnitTestInput"
    // InternalDSL.g:376:1: entryRuleUnitTestInput returns [EObject current=null] : iv_ruleUnitTestInput= ruleUnitTestInput EOF ;
    public final EObject entryRuleUnitTestInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitTestInput = null;


        try {
            // InternalDSL.g:376:54: (iv_ruleUnitTestInput= ruleUnitTestInput EOF )
            // InternalDSL.g:377:2: iv_ruleUnitTestInput= ruleUnitTestInput EOF
            {
             newCompositeNode(grammarAccess.getUnitTestInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitTestInput=ruleUnitTestInput();

            state._fsp--;

             current =iv_ruleUnitTestInput; 
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
    // $ANTLR end "entryRuleUnitTestInput"


    // $ANTLR start "ruleUnitTestInput"
    // InternalDSL.g:383:1: ruleUnitTestInput returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_overwritingValue_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleUnitTestInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_overwritingValue_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:389:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_overwritingValue_2_0= ruleLiteral ) ) ) )
            // InternalDSL.g:390:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_overwritingValue_2_0= ruleLiteral ) ) )
            {
            // InternalDSL.g:390:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_overwritingValue_2_0= ruleLiteral ) ) )
            // InternalDSL.g:391:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_overwritingValue_2_0= ruleLiteral ) )
            {
            // InternalDSL.g:391:3: ( (otherlv_0= RULE_ID ) )
            // InternalDSL.g:392:4: (otherlv_0= RULE_ID )
            {
            // InternalDSL.g:392:4: (otherlv_0= RULE_ID )
            // InternalDSL.g:393:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnitTestInputRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_0, grammarAccess.getUnitTestInputAccess().getVariableVariableCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getUnitTestInputAccess().getEqualsSignKeyword_1());
            		
            // InternalDSL.g:408:3: ( (lv_overwritingValue_2_0= ruleLiteral ) )
            // InternalDSL.g:409:4: (lv_overwritingValue_2_0= ruleLiteral )
            {
            // InternalDSL.g:409:4: (lv_overwritingValue_2_0= ruleLiteral )
            // InternalDSL.g:410:5: lv_overwritingValue_2_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getUnitTestInputAccess().getOverwritingValueLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_overwritingValue_2_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnitTestInputRule());
            					}
            					set(
            						current,
            						"overwritingValue",
            						lv_overwritingValue_2_0,
            						"org.mdse.puzzle.dsl.DSL.Literal");
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
    // $ANTLR end "ruleUnitTestInput"


    // $ANTLR start "entryRuleLiteral"
    // InternalDSL.g:431:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalDSL.g:431:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalDSL.g:432:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalDSL.g:438:1: ruleLiteral returns [EObject current=null] : (this_IntergerLiteral_0= ruleIntergerLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntergerLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BooleanLiteral_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:444:2: ( (this_IntergerLiteral_0= ruleIntergerLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // InternalDSL.g:445:2: (this_IntergerLiteral_0= ruleIntergerLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // InternalDSL.g:445:2: (this_IntergerLiteral_0= ruleIntergerLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_REALINT:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDSL.g:446:3: this_IntergerLiteral_0= ruleIntergerLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getIntergerLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntergerLiteral_0=ruleIntergerLiteral();

                    state._fsp--;


                    			current = this_IntergerLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:455:3: this_StringLiteral_1= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:464:3: this_BooleanLiteral_2= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_2=ruleBooleanLiteral();

                    state._fsp--;


                    			current = this_BooleanLiteral_2;
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleIntergerLiteral"
    // InternalDSL.g:476:1: entryRuleIntergerLiteral returns [EObject current=null] : iv_ruleIntergerLiteral= ruleIntergerLiteral EOF ;
    public final EObject entryRuleIntergerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntergerLiteral = null;


        try {
            // InternalDSL.g:476:56: (iv_ruleIntergerLiteral= ruleIntergerLiteral EOF )
            // InternalDSL.g:477:2: iv_ruleIntergerLiteral= ruleIntergerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntergerLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntergerLiteral=ruleIntergerLiteral();

            state._fsp--;

             current =iv_ruleIntergerLiteral; 
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
    // $ANTLR end "entryRuleIntergerLiteral"


    // $ANTLR start "ruleIntergerLiteral"
    // InternalDSL.g:483:1: ruleIntergerLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_REALINT ) ) ) ;
    public final EObject ruleIntergerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:489:2: ( ( () ( (lv_value_1_0= RULE_REALINT ) ) ) )
            // InternalDSL.g:490:2: ( () ( (lv_value_1_0= RULE_REALINT ) ) )
            {
            // InternalDSL.g:490:2: ( () ( (lv_value_1_0= RULE_REALINT ) ) )
            // InternalDSL.g:491:3: () ( (lv_value_1_0= RULE_REALINT ) )
            {
            // InternalDSL.g:491:3: ()
            // InternalDSL.g:492:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntergerLiteralAccess().getIntegerLiteralAction_0(),
            					current);
            			

            }

            // InternalDSL.g:498:3: ( (lv_value_1_0= RULE_REALINT ) )
            // InternalDSL.g:499:4: (lv_value_1_0= RULE_REALINT )
            {
            // InternalDSL.g:499:4: (lv_value_1_0= RULE_REALINT )
            // InternalDSL.g:500:5: lv_value_1_0= RULE_REALINT
            {
            lv_value_1_0=(Token)match(input,RULE_REALINT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getIntergerLiteralAccess().getValueREALINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntergerLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.mdse.puzzle.dsl.DSL.REALINT");
            				

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
    // $ANTLR end "ruleIntergerLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalDSL.g:520:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalDSL.g:520:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalDSL.g:521:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalDSL.g:527:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:533:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDSL.g:534:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDSL.g:534:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDSL.g:535:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDSL.g:535:3: ()
            // InternalDSL.g:536:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
            					current);
            			

            }

            // InternalDSL.g:542:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDSL.g:543:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDSL.g:543:4: (lv_value_1_0= RULE_STRING )
            // InternalDSL.g:544:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalDSL.g:564:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalDSL.g:564:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalDSL.g:565:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalDSL.g:571:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:577:2: ( ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) )
            // InternalDSL.g:578:2: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            {
            // InternalDSL.g:578:2: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            // InternalDSL.g:579:3: () ( (lv_value_1_0= RULE_BOOLEAN ) )
            {
            // InternalDSL.g:579:3: ()
            // InternalDSL.g:580:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
            					current);
            			

            }

            // InternalDSL.g:586:3: ( (lv_value_1_0= RULE_BOOLEAN ) )
            // InternalDSL.g:587:4: (lv_value_1_0= RULE_BOOLEAN )
            {
            // InternalDSL.g:587:4: (lv_value_1_0= RULE_BOOLEAN )
            // InternalDSL.g:588:5: lv_value_1_0= RULE_BOOLEAN
            {
            lv_value_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.mdse.puzzle.dsl.DSL.BOOLEAN");
            				

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleVariable"
    // InternalDSL.g:608:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalDSL.g:608:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalDSL.g:609:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalDSL.g:615:1: ruleVariable returns [EObject current=null] : (this_IntegerVariable_0= ruleIntegerVariable | this_StringVariable_1= ruleStringVariable | this_BooleanVariable_2= ruleBooleanVariable ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerVariable_0 = null;

        EObject this_StringVariable_1 = null;

        EObject this_BooleanVariable_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:621:2: ( (this_IntegerVariable_0= ruleIntegerVariable | this_StringVariable_1= ruleStringVariable | this_BooleanVariable_2= ruleBooleanVariable ) )
            // InternalDSL.g:622:2: (this_IntegerVariable_0= ruleIntegerVariable | this_StringVariable_1= ruleStringVariable | this_BooleanVariable_2= ruleBooleanVariable )
            {
            // InternalDSL.g:622:2: (this_IntegerVariable_0= ruleIntegerVariable | this_StringVariable_1= ruleStringVariable | this_BooleanVariable_2= ruleBooleanVariable )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDSL.g:623:3: this_IntegerVariable_0= ruleIntegerVariable
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerVariable_0=ruleIntegerVariable();

                    state._fsp--;


                    			current = this_IntegerVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:632:3: this_StringVariable_1= ruleStringVariable
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getStringVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringVariable_1=ruleStringVariable();

                    state._fsp--;


                    			current = this_StringVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:641:3: this_BooleanVariable_2= ruleBooleanVariable
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanVariable_2=ruleBooleanVariable();

                    state._fsp--;


                    			current = this_BooleanVariable_2;
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleIntegerVariable"
    // InternalDSL.g:653:1: entryRuleIntegerVariable returns [EObject current=null] : iv_ruleIntegerVariable= ruleIntegerVariable EOF ;
    public final EObject entryRuleIntegerVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerVariable = null;


        try {
            // InternalDSL.g:653:56: (iv_ruleIntegerVariable= ruleIntegerVariable EOF )
            // InternalDSL.g:654:2: iv_ruleIntegerVariable= ruleIntegerVariable EOF
            {
             newCompositeNode(grammarAccess.getIntegerVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerVariable=ruleIntegerVariable();

            state._fsp--;

             current =iv_ruleIntegerVariable; 
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
    // $ANTLR end "entryRuleIntegerVariable"


    // $ANTLR start "ruleIntegerVariable"
    // InternalDSL.g:660:1: ruleIntegerVariable returns [EObject current=null] : ( () otherlv_1= 'int' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_REALINT ) ) ) ;
    public final EObject ruleIntegerVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalDSL.g:666:2: ( ( () otherlv_1= 'int' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_REALINT ) ) ) )
            // InternalDSL.g:667:2: ( () otherlv_1= 'int' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_REALINT ) ) )
            {
            // InternalDSL.g:667:2: ( () otherlv_1= 'int' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_REALINT ) ) )
            // InternalDSL.g:668:3: () otherlv_1= 'int' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_REALINT ) )
            {
            // InternalDSL.g:668:3: ()
            // InternalDSL.g:669:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerVariableAccess().getIntKeyword_1());
            		
            // InternalDSL.g:679:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDSL.g:680:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDSL.g:680:4: (lv_name_2_0= RULE_ID )
            // InternalDSL.g:681:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getIntegerVariableAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getIntegerVariableAccess().getEqualsSignKeyword_3());
            		
            // InternalDSL.g:701:3: ( (lv_value_4_0= RULE_REALINT ) )
            // InternalDSL.g:702:4: (lv_value_4_0= RULE_REALINT )
            {
            // InternalDSL.g:702:4: (lv_value_4_0= RULE_REALINT )
            // InternalDSL.g:703:5: lv_value_4_0= RULE_REALINT
            {
            lv_value_4_0=(Token)match(input,RULE_REALINT,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getIntegerVariableAccess().getValueREALINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.mdse.puzzle.dsl.DSL.REALINT");
            				

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
    // $ANTLR end "ruleIntegerVariable"


    // $ANTLR start "entryRuleStringVariable"
    // InternalDSL.g:723:1: entryRuleStringVariable returns [EObject current=null] : iv_ruleStringVariable= ruleStringVariable EOF ;
    public final EObject entryRuleStringVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariable = null;


        try {
            // InternalDSL.g:723:55: (iv_ruleStringVariable= ruleStringVariable EOF )
            // InternalDSL.g:724:2: iv_ruleStringVariable= ruleStringVariable EOF
            {
             newCompositeNode(grammarAccess.getStringVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringVariable=ruleStringVariable();

            state._fsp--;

             current =iv_ruleStringVariable; 
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
    // $ANTLR end "entryRuleStringVariable"


    // $ANTLR start "ruleStringVariable"
    // InternalDSL.g:730:1: ruleStringVariable returns [EObject current=null] : ( () otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalDSL.g:736:2: ( ( () otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) )
            // InternalDSL.g:737:2: ( () otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // InternalDSL.g:737:2: ( () otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            // InternalDSL.g:738:3: () otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) )
            {
            // InternalDSL.g:738:3: ()
            // InternalDSL.g:739:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringVariableAccess().getStringVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getStringVariableAccess().getStringKeyword_1());
            		
            // InternalDSL.g:749:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDSL.g:750:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDSL.g:750:4: (lv_name_2_0= RULE_ID )
            // InternalDSL.g:751:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStringVariableAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getStringVariableAccess().getEqualsSignKeyword_3());
            		
            // InternalDSL.g:771:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalDSL.g:772:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalDSL.g:772:4: (lv_value_4_0= RULE_STRING )
            // InternalDSL.g:773:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getStringVariableAccess().getValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleStringVariable"


    // $ANTLR start "entryRuleBooleanVariable"
    // InternalDSL.g:793:1: entryRuleBooleanVariable returns [EObject current=null] : iv_ruleBooleanVariable= ruleBooleanVariable EOF ;
    public final EObject entryRuleBooleanVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanVariable = null;


        try {
            // InternalDSL.g:793:56: (iv_ruleBooleanVariable= ruleBooleanVariable EOF )
            // InternalDSL.g:794:2: iv_ruleBooleanVariable= ruleBooleanVariable EOF
            {
             newCompositeNode(grammarAccess.getBooleanVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanVariable=ruleBooleanVariable();

            state._fsp--;

             current =iv_ruleBooleanVariable; 
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
    // $ANTLR end "entryRuleBooleanVariable"


    // $ANTLR start "ruleBooleanVariable"
    // InternalDSL.g:800:1: ruleBooleanVariable returns [EObject current=null] : ( () otherlv_1= 'bool' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleBooleanVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalDSL.g:806:2: ( ( () otherlv_1= 'bool' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_BOOLEAN ) ) ) )
            // InternalDSL.g:807:2: ( () otherlv_1= 'bool' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_BOOLEAN ) ) )
            {
            // InternalDSL.g:807:2: ( () otherlv_1= 'bool' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_BOOLEAN ) ) )
            // InternalDSL.g:808:3: () otherlv_1= 'bool' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_BOOLEAN ) )
            {
            // InternalDSL.g:808:3: ()
            // InternalDSL.g:809:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanVariableAccess().getBooleanVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanVariableAccess().getBoolKeyword_1());
            		
            // InternalDSL.g:819:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDSL.g:820:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDSL.g:820:4: (lv_name_2_0= RULE_ID )
            // InternalDSL.g:821:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getBooleanVariableAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getBooleanVariableAccess().getEqualsSignKeyword_3());
            		
            // InternalDSL.g:841:3: ( (lv_value_4_0= RULE_BOOLEAN ) )
            // InternalDSL.g:842:4: (lv_value_4_0= RULE_BOOLEAN )
            {
            // InternalDSL.g:842:4: (lv_value_4_0= RULE_BOOLEAN )
            // InternalDSL.g:843:5: lv_value_4_0= RULE_BOOLEAN
            {
            lv_value_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getBooleanVariableAccess().getValueBOOLEANTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.mdse.puzzle.dsl.DSL.BOOLEAN");
            				

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
    // $ANTLR end "ruleBooleanVariable"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000007040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});

}