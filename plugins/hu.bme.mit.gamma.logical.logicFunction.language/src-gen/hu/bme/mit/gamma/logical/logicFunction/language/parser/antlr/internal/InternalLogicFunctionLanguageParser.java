package hu.bme.mit.gamma.logical.logicFunction.language.parser.antlr.internal;

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
import hu.bme.mit.gamma.logical.logicFunction.language.services.LogicFunctionLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLogicFunctionLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "'{'", "'}'", "'rule'", "':='", "'<-'", "'and'", "'('", "','", "')'", "'or'", "'xor'", "'not'", "'interface'", "'income'", "'.'", "'in'", "'out'", "'int'"
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


        public InternalLogicFunctionLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLogicFunctionLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLogicFunctionLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLogicFunctionLanguage.g"; }



     	private LogicFunctionLanguageGrammarAccess grammarAccess;

        public InternalLogicFunctionLanguageParser(TokenStream input, LogicFunctionLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "LogicFunctionDiagram";
       	}

       	@Override
       	protected LogicFunctionLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLogicFunctionDiagram"
    // InternalLogicFunctionLanguage.g:65:1: entryRuleLogicFunctionDiagram returns [EObject current=null] : iv_ruleLogicFunctionDiagram= ruleLogicFunctionDiagram EOF ;
    public final EObject entryRuleLogicFunctionDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicFunctionDiagram = null;


        try {
            // InternalLogicFunctionLanguage.g:65:61: (iv_ruleLogicFunctionDiagram= ruleLogicFunctionDiagram EOF )
            // InternalLogicFunctionLanguage.g:66:2: iv_ruleLogicFunctionDiagram= ruleLogicFunctionDiagram EOF
            {
             newCompositeNode(grammarAccess.getLogicFunctionDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicFunctionDiagram=ruleLogicFunctionDiagram();

            state._fsp--;

             current =iv_ruleLogicFunctionDiagram; 
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
    // $ANTLR end "entryRuleLogicFunctionDiagram"


    // $ANTLR start "ruleLogicFunctionDiagram"
    // InternalLogicFunctionLanguage.g:72:1: ruleLogicFunctionDiagram returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_rule_3_0= ruleRuleDeclaration ) ) | ( (lv_interfaces_4_0= ruleInterface ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleLogicFunctionDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_rule_3_0 = null;

        EObject lv_interfaces_4_0 = null;



        	enterRule();

        try {
            // InternalLogicFunctionLanguage.g:78:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_rule_3_0= ruleRuleDeclaration ) ) | ( (lv_interfaces_4_0= ruleInterface ) ) )* otherlv_5= '}' ) )
            // InternalLogicFunctionLanguage.g:79:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_rule_3_0= ruleRuleDeclaration ) ) | ( (lv_interfaces_4_0= ruleInterface ) ) )* otherlv_5= '}' )
            {
            // InternalLogicFunctionLanguage.g:79:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_rule_3_0= ruleRuleDeclaration ) ) | ( (lv_interfaces_4_0= ruleInterface ) ) )* otherlv_5= '}' )
            // InternalLogicFunctionLanguage.g:80:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_rule_3_0= ruleRuleDeclaration ) ) | ( (lv_interfaces_4_0= ruleInterface ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicFunctionDiagramAccess().getFunctionKeyword_0());
            		
            // InternalLogicFunctionLanguage.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLogicFunctionLanguage.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLogicFunctionLanguage.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalLogicFunctionLanguage.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicFunctionDiagramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicFunctionDiagramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLogicFunctionDiagramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLogicFunctionLanguage.g:106:3: ( ( (lv_rule_3_0= ruleRuleDeclaration ) ) | ( (lv_interfaces_4_0= ruleInterface ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }
                else if ( (LA1_0==24) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLogicFunctionLanguage.g:107:4: ( (lv_rule_3_0= ruleRuleDeclaration ) )
            	    {
            	    // InternalLogicFunctionLanguage.g:107:4: ( (lv_rule_3_0= ruleRuleDeclaration ) )
            	    // InternalLogicFunctionLanguage.g:108:5: (lv_rule_3_0= ruleRuleDeclaration )
            	    {
            	    // InternalLogicFunctionLanguage.g:108:5: (lv_rule_3_0= ruleRuleDeclaration )
            	    // InternalLogicFunctionLanguage.g:109:6: lv_rule_3_0= ruleRuleDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getLogicFunctionDiagramAccess().getRuleRuleDeclarationParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_rule_3_0=ruleRuleDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicFunctionDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rule",
            	    							lv_rule_3_0,
            	    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.RuleDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLogicFunctionLanguage.g:127:4: ( (lv_interfaces_4_0= ruleInterface ) )
            	    {
            	    // InternalLogicFunctionLanguage.g:127:4: ( (lv_interfaces_4_0= ruleInterface ) )
            	    // InternalLogicFunctionLanguage.g:128:5: (lv_interfaces_4_0= ruleInterface )
            	    {
            	    // InternalLogicFunctionLanguage.g:128:5: (lv_interfaces_4_0= ruleInterface )
            	    // InternalLogicFunctionLanguage.g:129:6: lv_interfaces_4_0= ruleInterface
            	    {

            	    						newCompositeNode(grammarAccess.getLogicFunctionDiagramAccess().getInterfacesInterfaceParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_interfaces_4_0=ruleInterface();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicFunctionDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"interfaces",
            	    							lv_interfaces_4_0,
            	    							"hu.bme.mit.gamma.logical.logicBase.language.LogicBaseLanguage.Interface");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicFunctionDiagramAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLogicFunctionDiagram"


    // $ANTLR start "entryRuleRuleDeclaration"
    // InternalLogicFunctionLanguage.g:155:1: entryRuleRuleDeclaration returns [EObject current=null] : iv_ruleRuleDeclaration= ruleRuleDeclaration EOF ;
    public final EObject entryRuleRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDeclaration = null;


        try {
            // InternalLogicFunctionLanguage.g:155:56: (iv_ruleRuleDeclaration= ruleRuleDeclaration EOF )
            // InternalLogicFunctionLanguage.g:156:2: iv_ruleRuleDeclaration= ruleRuleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getRuleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleDeclaration=ruleRuleDeclaration();

            state._fsp--;

             current =iv_ruleRuleDeclaration; 
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
    // $ANTLR end "entryRuleRuleDeclaration"


    // $ANTLR start "ruleRuleDeclaration"
    // InternalLogicFunctionLanguage.g:162:1: ruleRuleDeclaration returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':=' ( ( ( ruleQualifiedName ) ) otherlv_4= '<-' )? ( ( (lv_expression_5_0= ruleAND ) ) | ( (lv_expression_6_0= ruleOR ) ) | ( (lv_expression_7_0= ruleXOR ) ) | ( (lv_expression_8_0= ruleNOT ) ) | ( (lv_expression_9_0= rulePredicateListen ) ) | ( (lv_expression_10_0= ruleRuleListen ) ) ) ) ;
    public final EObject ruleRuleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_5_0 = null;

        EObject lv_expression_6_0 = null;

        EObject lv_expression_7_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_expression_10_0 = null;



        	enterRule();

        try {
            // InternalLogicFunctionLanguage.g:168:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':=' ( ( ( ruleQualifiedName ) ) otherlv_4= '<-' )? ( ( (lv_expression_5_0= ruleAND ) ) | ( (lv_expression_6_0= ruleOR ) ) | ( (lv_expression_7_0= ruleXOR ) ) | ( (lv_expression_8_0= ruleNOT ) ) | ( (lv_expression_9_0= rulePredicateListen ) ) | ( (lv_expression_10_0= ruleRuleListen ) ) ) ) )
            // InternalLogicFunctionLanguage.g:169:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':=' ( ( ( ruleQualifiedName ) ) otherlv_4= '<-' )? ( ( (lv_expression_5_0= ruleAND ) ) | ( (lv_expression_6_0= ruleOR ) ) | ( (lv_expression_7_0= ruleXOR ) ) | ( (lv_expression_8_0= ruleNOT ) ) | ( (lv_expression_9_0= rulePredicateListen ) ) | ( (lv_expression_10_0= ruleRuleListen ) ) ) )
            {
            // InternalLogicFunctionLanguage.g:169:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':=' ( ( ( ruleQualifiedName ) ) otherlv_4= '<-' )? ( ( (lv_expression_5_0= ruleAND ) ) | ( (lv_expression_6_0= ruleOR ) ) | ( (lv_expression_7_0= ruleXOR ) ) | ( (lv_expression_8_0= ruleNOT ) ) | ( (lv_expression_9_0= rulePredicateListen ) ) | ( (lv_expression_10_0= ruleRuleListen ) ) ) )
            // InternalLogicFunctionLanguage.g:170:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':=' ( ( ( ruleQualifiedName ) ) otherlv_4= '<-' )? ( ( (lv_expression_5_0= ruleAND ) ) | ( (lv_expression_6_0= ruleOR ) ) | ( (lv_expression_7_0= ruleXOR ) ) | ( (lv_expression_8_0= ruleNOT ) ) | ( (lv_expression_9_0= rulePredicateListen ) ) | ( (lv_expression_10_0= ruleRuleListen ) ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleDeclarationAccess().getRuleKeyword_0());
            		
            // InternalLogicFunctionLanguage.g:174:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:175:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalLogicFunctionLanguage.g:175:4: (lv_name_1_0= RULE_ID )
                    // InternalLogicFunctionLanguage.g:176:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getRuleDeclarationAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRuleDeclarationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleDeclarationAccess().getColonEqualsSignKeyword_2());
            		
            // InternalLogicFunctionLanguage.g:196:3: ( ( ( ruleQualifiedName ) ) otherlv_4= '<-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==16||LA3_1==26) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:197:4: ( ( ruleQualifiedName ) ) otherlv_4= '<-'
                    {
                    // InternalLogicFunctionLanguage.g:197:4: ( ( ruleQualifiedName ) )
                    // InternalLogicFunctionLanguage.g:198:5: ( ruleQualifiedName )
                    {
                    // InternalLogicFunctionLanguage.g:198:5: ( ruleQualifiedName )
                    // InternalLogicFunctionLanguage.g:199:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleDeclarationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRuleDeclarationAccess().getRaisesEventCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getRuleDeclarationAccess().getLessThanSignHyphenMinusKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalLogicFunctionLanguage.g:218:3: ( ( (lv_expression_5_0= ruleAND ) ) | ( (lv_expression_6_0= ruleOR ) ) | ( (lv_expression_7_0= ruleXOR ) ) | ( (lv_expression_8_0= ruleNOT ) ) | ( (lv_expression_9_0= rulePredicateListen ) ) | ( (lv_expression_10_0= ruleRuleListen ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            case 25:
                {
                alt4=5;
                }
                break;
            case RULE_ID:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:219:4: ( (lv_expression_5_0= ruleAND ) )
                    {
                    // InternalLogicFunctionLanguage.g:219:4: ( (lv_expression_5_0= ruleAND ) )
                    // InternalLogicFunctionLanguage.g:220:5: (lv_expression_5_0= ruleAND )
                    {
                    // InternalLogicFunctionLanguage.g:220:5: (lv_expression_5_0= ruleAND )
                    // InternalLogicFunctionLanguage.g:221:6: lv_expression_5_0= ruleAND
                    {

                    						newCompositeNode(grammarAccess.getRuleDeclarationAccess().getExpressionANDParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=ruleAND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.AND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:239:4: ( (lv_expression_6_0= ruleOR ) )
                    {
                    // InternalLogicFunctionLanguage.g:239:4: ( (lv_expression_6_0= ruleOR ) )
                    // InternalLogicFunctionLanguage.g:240:5: (lv_expression_6_0= ruleOR )
                    {
                    // InternalLogicFunctionLanguage.g:240:5: (lv_expression_6_0= ruleOR )
                    // InternalLogicFunctionLanguage.g:241:6: lv_expression_6_0= ruleOR
                    {

                    						newCompositeNode(grammarAccess.getRuleDeclarationAccess().getExpressionORParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_6_0=ruleOR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_6_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.OR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLogicFunctionLanguage.g:259:4: ( (lv_expression_7_0= ruleXOR ) )
                    {
                    // InternalLogicFunctionLanguage.g:259:4: ( (lv_expression_7_0= ruleXOR ) )
                    // InternalLogicFunctionLanguage.g:260:5: (lv_expression_7_0= ruleXOR )
                    {
                    // InternalLogicFunctionLanguage.g:260:5: (lv_expression_7_0= ruleXOR )
                    // InternalLogicFunctionLanguage.g:261:6: lv_expression_7_0= ruleXOR
                    {

                    						newCompositeNode(grammarAccess.getRuleDeclarationAccess().getExpressionXORParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_7_0=ruleXOR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_7_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.XOR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLogicFunctionLanguage.g:279:4: ( (lv_expression_8_0= ruleNOT ) )
                    {
                    // InternalLogicFunctionLanguage.g:279:4: ( (lv_expression_8_0= ruleNOT ) )
                    // InternalLogicFunctionLanguage.g:280:5: (lv_expression_8_0= ruleNOT )
                    {
                    // InternalLogicFunctionLanguage.g:280:5: (lv_expression_8_0= ruleNOT )
                    // InternalLogicFunctionLanguage.g:281:6: lv_expression_8_0= ruleNOT
                    {

                    						newCompositeNode(grammarAccess.getRuleDeclarationAccess().getExpressionNOTParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_8_0=ruleNOT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_8_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.NOT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalLogicFunctionLanguage.g:299:4: ( (lv_expression_9_0= rulePredicateListen ) )
                    {
                    // InternalLogicFunctionLanguage.g:299:4: ( (lv_expression_9_0= rulePredicateListen ) )
                    // InternalLogicFunctionLanguage.g:300:5: (lv_expression_9_0= rulePredicateListen )
                    {
                    // InternalLogicFunctionLanguage.g:300:5: (lv_expression_9_0= rulePredicateListen )
                    // InternalLogicFunctionLanguage.g:301:6: lv_expression_9_0= rulePredicateListen
                    {

                    						newCompositeNode(grammarAccess.getRuleDeclarationAccess().getExpressionPredicateListenParserRuleCall_4_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_9_0=rulePredicateListen();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_9_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.PredicateListen");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalLogicFunctionLanguage.g:319:4: ( (lv_expression_10_0= ruleRuleListen ) )
                    {
                    // InternalLogicFunctionLanguage.g:319:4: ( (lv_expression_10_0= ruleRuleListen ) )
                    // InternalLogicFunctionLanguage.g:320:5: (lv_expression_10_0= ruleRuleListen )
                    {
                    // InternalLogicFunctionLanguage.g:320:5: (lv_expression_10_0= ruleRuleListen )
                    // InternalLogicFunctionLanguage.g:321:6: lv_expression_10_0= ruleRuleListen
                    {

                    						newCompositeNode(grammarAccess.getRuleDeclarationAccess().getExpressionRuleListenParserRuleCall_4_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_10_0=ruleRuleListen();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_10_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.RuleListen");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleRuleDeclaration"


    // $ANTLR start "entryRuleAND"
    // InternalLogicFunctionLanguage.g:343:1: entryRuleAND returns [EObject current=null] : iv_ruleAND= ruleAND EOF ;
    public final EObject entryRuleAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAND = null;


        try {
            // InternalLogicFunctionLanguage.g:343:44: (iv_ruleAND= ruleAND EOF )
            // InternalLogicFunctionLanguage.g:344:2: iv_ruleAND= ruleAND EOF
            {
             newCompositeNode(grammarAccess.getANDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAND=ruleAND();

            state._fsp--;

             current =iv_ruleAND; 
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
    // $ANTLR end "entryRuleAND"


    // $ANTLR start "ruleAND"
    // InternalLogicFunctionLanguage.g:350:1: ruleAND returns [EObject current=null] : (otherlv_0= 'and' otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) ) (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )* otherlv_15= ')' ) ;
    public final EObject ruleAND() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_8=null;
        Token otherlv_15=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_5_0 = null;

        EObject lv_arguments_6_0 = null;

        EObject lv_arguments_7_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_11_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_13_0 = null;

        EObject lv_arguments_14_0 = null;



        	enterRule();

        try {
            // InternalLogicFunctionLanguage.g:356:2: ( (otherlv_0= 'and' otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) ) (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )* otherlv_15= ')' ) )
            // InternalLogicFunctionLanguage.g:357:2: (otherlv_0= 'and' otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) ) (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )* otherlv_15= ')' )
            {
            // InternalLogicFunctionLanguage.g:357:2: (otherlv_0= 'and' otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) ) (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )* otherlv_15= ')' )
            // InternalLogicFunctionLanguage.g:358:3: otherlv_0= 'and' otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) ) (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )* otherlv_15= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getANDAccess().getAndKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getANDAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLogicFunctionLanguage.g:366:3: ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 25:
                {
                alt5=5;
                }
                break;
            case RULE_ID:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:367:4: ( (lv_arguments_2_0= ruleAND ) )
                    {
                    // InternalLogicFunctionLanguage.g:367:4: ( (lv_arguments_2_0= ruleAND ) )
                    // InternalLogicFunctionLanguage.g:368:5: (lv_arguments_2_0= ruleAND )
                    {
                    // InternalLogicFunctionLanguage.g:368:5: (lv_arguments_2_0= ruleAND )
                    // InternalLogicFunctionLanguage.g:369:6: lv_arguments_2_0= ruleAND
                    {

                    						newCompositeNode(grammarAccess.getANDAccess().getArgumentsANDParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_2_0=ruleAND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getANDRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.AND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:387:4: ( (lv_arguments_3_0= ruleOR ) )
                    {
                    // InternalLogicFunctionLanguage.g:387:4: ( (lv_arguments_3_0= ruleOR ) )
                    // InternalLogicFunctionLanguage.g:388:5: (lv_arguments_3_0= ruleOR )
                    {
                    // InternalLogicFunctionLanguage.g:388:5: (lv_arguments_3_0= ruleOR )
                    // InternalLogicFunctionLanguage.g:389:6: lv_arguments_3_0= ruleOR
                    {

                    						newCompositeNode(grammarAccess.getANDAccess().getArgumentsORParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_3_0=ruleOR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getANDRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.OR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLogicFunctionLanguage.g:407:4: ( (lv_arguments_4_0= ruleXOR ) )
                    {
                    // InternalLogicFunctionLanguage.g:407:4: ( (lv_arguments_4_0= ruleXOR ) )
                    // InternalLogicFunctionLanguage.g:408:5: (lv_arguments_4_0= ruleXOR )
                    {
                    // InternalLogicFunctionLanguage.g:408:5: (lv_arguments_4_0= ruleXOR )
                    // InternalLogicFunctionLanguage.g:409:6: lv_arguments_4_0= ruleXOR
                    {

                    						newCompositeNode(grammarAccess.getANDAccess().getArgumentsXORParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_4_0=ruleXOR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getANDRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_4_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.XOR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLogicFunctionLanguage.g:427:4: ( (lv_arguments_5_0= ruleNOT ) )
                    {
                    // InternalLogicFunctionLanguage.g:427:4: ( (lv_arguments_5_0= ruleNOT ) )
                    // InternalLogicFunctionLanguage.g:428:5: (lv_arguments_5_0= ruleNOT )
                    {
                    // InternalLogicFunctionLanguage.g:428:5: (lv_arguments_5_0= ruleNOT )
                    // InternalLogicFunctionLanguage.g:429:6: lv_arguments_5_0= ruleNOT
                    {

                    						newCompositeNode(grammarAccess.getANDAccess().getArgumentsNOTParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_5_0=ruleNOT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getANDRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_5_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.NOT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalLogicFunctionLanguage.g:447:4: ( (lv_arguments_6_0= rulePredicateListen ) )
                    {
                    // InternalLogicFunctionLanguage.g:447:4: ( (lv_arguments_6_0= rulePredicateListen ) )
                    // InternalLogicFunctionLanguage.g:448:5: (lv_arguments_6_0= rulePredicateListen )
                    {
                    // InternalLogicFunctionLanguage.g:448:5: (lv_arguments_6_0= rulePredicateListen )
                    // InternalLogicFunctionLanguage.g:449:6: lv_arguments_6_0= rulePredicateListen
                    {

                    						newCompositeNode(grammarAccess.getANDAccess().getArgumentsPredicateListenParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_6_0=rulePredicateListen();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getANDRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_6_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.PredicateListen");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalLogicFunctionLanguage.g:467:4: ( (lv_arguments_7_0= ruleRuleListen ) )
                    {
                    // InternalLogicFunctionLanguage.g:467:4: ( (lv_arguments_7_0= ruleRuleListen ) )
                    // InternalLogicFunctionLanguage.g:468:5: (lv_arguments_7_0= ruleRuleListen )
                    {
                    // InternalLogicFunctionLanguage.g:468:5: (lv_arguments_7_0= ruleRuleListen )
                    // InternalLogicFunctionLanguage.g:469:6: lv_arguments_7_0= ruleRuleListen
                    {

                    						newCompositeNode(grammarAccess.getANDAccess().getArgumentsRuleListenParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_7_0=ruleRuleListen();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getANDRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_7_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.RuleListen");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLogicFunctionLanguage.g:487:3: (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLogicFunctionLanguage.g:488:4: otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) )
            	    {
            	    otherlv_8=(Token)match(input,19,FOLLOW_8); 

            	    				newLeafNode(otherlv_8, grammarAccess.getANDAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalLogicFunctionLanguage.g:492:4: ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) )
            	    int alt6=6;
            	    switch ( input.LA(1) ) {
            	    case 17:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt6=4;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt6=5;
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        alt6=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // InternalLogicFunctionLanguage.g:493:5: ( (lv_arguments_9_0= ruleAND ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:493:5: ( (lv_arguments_9_0= ruleAND ) )
            	            // InternalLogicFunctionLanguage.g:494:6: (lv_arguments_9_0= ruleAND )
            	            {
            	            // InternalLogicFunctionLanguage.g:494:6: (lv_arguments_9_0= ruleAND )
            	            // InternalLogicFunctionLanguage.g:495:7: lv_arguments_9_0= ruleAND
            	            {

            	            							newCompositeNode(grammarAccess.getANDAccess().getArgumentsANDParserRuleCall_3_1_0_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_9_0=ruleAND();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getANDRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_9_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.AND");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLogicFunctionLanguage.g:513:5: ( (lv_arguments_10_0= ruleOR ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:513:5: ( (lv_arguments_10_0= ruleOR ) )
            	            // InternalLogicFunctionLanguage.g:514:6: (lv_arguments_10_0= ruleOR )
            	            {
            	            // InternalLogicFunctionLanguage.g:514:6: (lv_arguments_10_0= ruleOR )
            	            // InternalLogicFunctionLanguage.g:515:7: lv_arguments_10_0= ruleOR
            	            {

            	            							newCompositeNode(grammarAccess.getANDAccess().getArgumentsORParserRuleCall_3_1_1_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_10_0=ruleOR();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getANDRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_10_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.OR");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalLogicFunctionLanguage.g:533:5: ( (lv_arguments_11_0= ruleXOR ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:533:5: ( (lv_arguments_11_0= ruleXOR ) )
            	            // InternalLogicFunctionLanguage.g:534:6: (lv_arguments_11_0= ruleXOR )
            	            {
            	            // InternalLogicFunctionLanguage.g:534:6: (lv_arguments_11_0= ruleXOR )
            	            // InternalLogicFunctionLanguage.g:535:7: lv_arguments_11_0= ruleXOR
            	            {

            	            							newCompositeNode(grammarAccess.getANDAccess().getArgumentsXORParserRuleCall_3_1_2_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_11_0=ruleXOR();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getANDRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_11_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.XOR");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalLogicFunctionLanguage.g:553:5: ( (lv_arguments_12_0= ruleNOT ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:553:5: ( (lv_arguments_12_0= ruleNOT ) )
            	            // InternalLogicFunctionLanguage.g:554:6: (lv_arguments_12_0= ruleNOT )
            	            {
            	            // InternalLogicFunctionLanguage.g:554:6: (lv_arguments_12_0= ruleNOT )
            	            // InternalLogicFunctionLanguage.g:555:7: lv_arguments_12_0= ruleNOT
            	            {

            	            							newCompositeNode(grammarAccess.getANDAccess().getArgumentsNOTParserRuleCall_3_1_3_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_12_0=ruleNOT();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getANDRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_12_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.NOT");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalLogicFunctionLanguage.g:573:5: ( (lv_arguments_13_0= rulePredicateListen ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:573:5: ( (lv_arguments_13_0= rulePredicateListen ) )
            	            // InternalLogicFunctionLanguage.g:574:6: (lv_arguments_13_0= rulePredicateListen )
            	            {
            	            // InternalLogicFunctionLanguage.g:574:6: (lv_arguments_13_0= rulePredicateListen )
            	            // InternalLogicFunctionLanguage.g:575:7: lv_arguments_13_0= rulePredicateListen
            	            {

            	            							newCompositeNode(grammarAccess.getANDAccess().getArgumentsPredicateListenParserRuleCall_3_1_4_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_13_0=rulePredicateListen();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getANDRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_13_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.PredicateListen");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalLogicFunctionLanguage.g:593:5: ( (lv_arguments_14_0= ruleRuleListen ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:593:5: ( (lv_arguments_14_0= ruleRuleListen ) )
            	            // InternalLogicFunctionLanguage.g:594:6: (lv_arguments_14_0= ruleRuleListen )
            	            {
            	            // InternalLogicFunctionLanguage.g:594:6: (lv_arguments_14_0= ruleRuleListen )
            	            // InternalLogicFunctionLanguage.g:595:7: lv_arguments_14_0= ruleRuleListen
            	            {

            	            							newCompositeNode(grammarAccess.getANDAccess().getArgumentsRuleListenParserRuleCall_3_1_5_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_14_0=ruleRuleListen();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getANDRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_14_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.RuleListen");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_15=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getANDAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleAND"


    // $ANTLR start "entryRuleOR"
    // InternalLogicFunctionLanguage.g:622:1: entryRuleOR returns [EObject current=null] : iv_ruleOR= ruleOR EOF ;
    public final EObject entryRuleOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOR = null;


        try {
            // InternalLogicFunctionLanguage.g:622:43: (iv_ruleOR= ruleOR EOF )
            // InternalLogicFunctionLanguage.g:623:2: iv_ruleOR= ruleOR EOF
            {
             newCompositeNode(grammarAccess.getORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOR=ruleOR();

            state._fsp--;

             current =iv_ruleOR; 
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
    // $ANTLR end "entryRuleOR"


    // $ANTLR start "ruleOR"
    // InternalLogicFunctionLanguage.g:629:1: ruleOR returns [EObject current=null] : (otherlv_0= 'or' otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) ) (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )* otherlv_15= ')' ) ;
    public final EObject ruleOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_8=null;
        Token otherlv_15=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_5_0 = null;

        EObject lv_arguments_6_0 = null;

        EObject lv_arguments_7_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_11_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_13_0 = null;

        EObject lv_arguments_14_0 = null;



        	enterRule();

        try {
            // InternalLogicFunctionLanguage.g:635:2: ( (otherlv_0= 'or' otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) ) (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )* otherlv_15= ')' ) )
            // InternalLogicFunctionLanguage.g:636:2: (otherlv_0= 'or' otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) ) (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )* otherlv_15= ')' )
            {
            // InternalLogicFunctionLanguage.g:636:2: (otherlv_0= 'or' otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) ) (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )* otherlv_15= ')' )
            // InternalLogicFunctionLanguage.g:637:3: otherlv_0= 'or' otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) ) (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )* otherlv_15= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getORAccess().getOrKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getORAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLogicFunctionLanguage.g:645:3: ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            case RULE_ID:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:646:4: ( (lv_arguments_2_0= ruleAND ) )
                    {
                    // InternalLogicFunctionLanguage.g:646:4: ( (lv_arguments_2_0= ruleAND ) )
                    // InternalLogicFunctionLanguage.g:647:5: (lv_arguments_2_0= ruleAND )
                    {
                    // InternalLogicFunctionLanguage.g:647:5: (lv_arguments_2_0= ruleAND )
                    // InternalLogicFunctionLanguage.g:648:6: lv_arguments_2_0= ruleAND
                    {

                    						newCompositeNode(grammarAccess.getORAccess().getArgumentsANDParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_2_0=ruleAND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getORRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.AND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:666:4: ( (lv_arguments_3_0= ruleOR ) )
                    {
                    // InternalLogicFunctionLanguage.g:666:4: ( (lv_arguments_3_0= ruleOR ) )
                    // InternalLogicFunctionLanguage.g:667:5: (lv_arguments_3_0= ruleOR )
                    {
                    // InternalLogicFunctionLanguage.g:667:5: (lv_arguments_3_0= ruleOR )
                    // InternalLogicFunctionLanguage.g:668:6: lv_arguments_3_0= ruleOR
                    {

                    						newCompositeNode(grammarAccess.getORAccess().getArgumentsORParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_3_0=ruleOR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getORRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.OR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLogicFunctionLanguage.g:686:4: ( (lv_arguments_4_0= ruleXOR ) )
                    {
                    // InternalLogicFunctionLanguage.g:686:4: ( (lv_arguments_4_0= ruleXOR ) )
                    // InternalLogicFunctionLanguage.g:687:5: (lv_arguments_4_0= ruleXOR )
                    {
                    // InternalLogicFunctionLanguage.g:687:5: (lv_arguments_4_0= ruleXOR )
                    // InternalLogicFunctionLanguage.g:688:6: lv_arguments_4_0= ruleXOR
                    {

                    						newCompositeNode(grammarAccess.getORAccess().getArgumentsXORParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_4_0=ruleXOR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getORRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_4_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.XOR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLogicFunctionLanguage.g:706:4: ( (lv_arguments_5_0= ruleNOT ) )
                    {
                    // InternalLogicFunctionLanguage.g:706:4: ( (lv_arguments_5_0= ruleNOT ) )
                    // InternalLogicFunctionLanguage.g:707:5: (lv_arguments_5_0= ruleNOT )
                    {
                    // InternalLogicFunctionLanguage.g:707:5: (lv_arguments_5_0= ruleNOT )
                    // InternalLogicFunctionLanguage.g:708:6: lv_arguments_5_0= ruleNOT
                    {

                    						newCompositeNode(grammarAccess.getORAccess().getArgumentsNOTParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_5_0=ruleNOT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getORRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_5_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.NOT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalLogicFunctionLanguage.g:726:4: ( (lv_arguments_6_0= rulePredicateListen ) )
                    {
                    // InternalLogicFunctionLanguage.g:726:4: ( (lv_arguments_6_0= rulePredicateListen ) )
                    // InternalLogicFunctionLanguage.g:727:5: (lv_arguments_6_0= rulePredicateListen )
                    {
                    // InternalLogicFunctionLanguage.g:727:5: (lv_arguments_6_0= rulePredicateListen )
                    // InternalLogicFunctionLanguage.g:728:6: lv_arguments_6_0= rulePredicateListen
                    {

                    						newCompositeNode(grammarAccess.getORAccess().getArgumentsPredicateListenParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_6_0=rulePredicateListen();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getORRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_6_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.PredicateListen");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalLogicFunctionLanguage.g:746:4: ( (lv_arguments_7_0= ruleRuleListen ) )
                    {
                    // InternalLogicFunctionLanguage.g:746:4: ( (lv_arguments_7_0= ruleRuleListen ) )
                    // InternalLogicFunctionLanguage.g:747:5: (lv_arguments_7_0= ruleRuleListen )
                    {
                    // InternalLogicFunctionLanguage.g:747:5: (lv_arguments_7_0= ruleRuleListen )
                    // InternalLogicFunctionLanguage.g:748:6: lv_arguments_7_0= ruleRuleListen
                    {

                    						newCompositeNode(grammarAccess.getORAccess().getArgumentsRuleListenParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_7_0=ruleRuleListen();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getORRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_7_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.RuleListen");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLogicFunctionLanguage.g:766:3: (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLogicFunctionLanguage.g:767:4: otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) )
            	    {
            	    otherlv_8=(Token)match(input,19,FOLLOW_8); 

            	    				newLeafNode(otherlv_8, grammarAccess.getORAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalLogicFunctionLanguage.g:771:4: ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) )
            	    int alt9=6;
            	    switch ( input.LA(1) ) {
            	    case 17:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt9=4;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt9=5;
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        alt9=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt9) {
            	        case 1 :
            	            // InternalLogicFunctionLanguage.g:772:5: ( (lv_arguments_9_0= ruleAND ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:772:5: ( (lv_arguments_9_0= ruleAND ) )
            	            // InternalLogicFunctionLanguage.g:773:6: (lv_arguments_9_0= ruleAND )
            	            {
            	            // InternalLogicFunctionLanguage.g:773:6: (lv_arguments_9_0= ruleAND )
            	            // InternalLogicFunctionLanguage.g:774:7: lv_arguments_9_0= ruleAND
            	            {

            	            							newCompositeNode(grammarAccess.getORAccess().getArgumentsANDParserRuleCall_3_1_0_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_9_0=ruleAND();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getORRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_9_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.AND");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLogicFunctionLanguage.g:792:5: ( (lv_arguments_10_0= ruleOR ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:792:5: ( (lv_arguments_10_0= ruleOR ) )
            	            // InternalLogicFunctionLanguage.g:793:6: (lv_arguments_10_0= ruleOR )
            	            {
            	            // InternalLogicFunctionLanguage.g:793:6: (lv_arguments_10_0= ruleOR )
            	            // InternalLogicFunctionLanguage.g:794:7: lv_arguments_10_0= ruleOR
            	            {

            	            							newCompositeNode(grammarAccess.getORAccess().getArgumentsORParserRuleCall_3_1_1_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_10_0=ruleOR();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getORRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_10_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.OR");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalLogicFunctionLanguage.g:812:5: ( (lv_arguments_11_0= ruleXOR ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:812:5: ( (lv_arguments_11_0= ruleXOR ) )
            	            // InternalLogicFunctionLanguage.g:813:6: (lv_arguments_11_0= ruleXOR )
            	            {
            	            // InternalLogicFunctionLanguage.g:813:6: (lv_arguments_11_0= ruleXOR )
            	            // InternalLogicFunctionLanguage.g:814:7: lv_arguments_11_0= ruleXOR
            	            {

            	            							newCompositeNode(grammarAccess.getORAccess().getArgumentsXORParserRuleCall_3_1_2_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_11_0=ruleXOR();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getORRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_11_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.XOR");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalLogicFunctionLanguage.g:832:5: ( (lv_arguments_12_0= ruleNOT ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:832:5: ( (lv_arguments_12_0= ruleNOT ) )
            	            // InternalLogicFunctionLanguage.g:833:6: (lv_arguments_12_0= ruleNOT )
            	            {
            	            // InternalLogicFunctionLanguage.g:833:6: (lv_arguments_12_0= ruleNOT )
            	            // InternalLogicFunctionLanguage.g:834:7: lv_arguments_12_0= ruleNOT
            	            {

            	            							newCompositeNode(grammarAccess.getORAccess().getArgumentsNOTParserRuleCall_3_1_3_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_12_0=ruleNOT();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getORRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_12_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.NOT");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalLogicFunctionLanguage.g:852:5: ( (lv_arguments_13_0= rulePredicateListen ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:852:5: ( (lv_arguments_13_0= rulePredicateListen ) )
            	            // InternalLogicFunctionLanguage.g:853:6: (lv_arguments_13_0= rulePredicateListen )
            	            {
            	            // InternalLogicFunctionLanguage.g:853:6: (lv_arguments_13_0= rulePredicateListen )
            	            // InternalLogicFunctionLanguage.g:854:7: lv_arguments_13_0= rulePredicateListen
            	            {

            	            							newCompositeNode(grammarAccess.getORAccess().getArgumentsPredicateListenParserRuleCall_3_1_4_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_13_0=rulePredicateListen();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getORRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_13_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.PredicateListen");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalLogicFunctionLanguage.g:872:5: ( (lv_arguments_14_0= ruleRuleListen ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:872:5: ( (lv_arguments_14_0= ruleRuleListen ) )
            	            // InternalLogicFunctionLanguage.g:873:6: (lv_arguments_14_0= ruleRuleListen )
            	            {
            	            // InternalLogicFunctionLanguage.g:873:6: (lv_arguments_14_0= ruleRuleListen )
            	            // InternalLogicFunctionLanguage.g:874:7: lv_arguments_14_0= ruleRuleListen
            	            {

            	            							newCompositeNode(grammarAccess.getORAccess().getArgumentsRuleListenParserRuleCall_3_1_5_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_14_0=ruleRuleListen();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getORRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_14_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.RuleListen");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_15=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getORAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleOR"


    // $ANTLR start "entryRuleXOR"
    // InternalLogicFunctionLanguage.g:901:1: entryRuleXOR returns [EObject current=null] : iv_ruleXOR= ruleXOR EOF ;
    public final EObject entryRuleXOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOR = null;


        try {
            // InternalLogicFunctionLanguage.g:901:44: (iv_ruleXOR= ruleXOR EOF )
            // InternalLogicFunctionLanguage.g:902:2: iv_ruleXOR= ruleXOR EOF
            {
             newCompositeNode(grammarAccess.getXORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXOR=ruleXOR();

            state._fsp--;

             current =iv_ruleXOR; 
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
    // $ANTLR end "entryRuleXOR"


    // $ANTLR start "ruleXOR"
    // InternalLogicFunctionLanguage.g:908:1: ruleXOR returns [EObject current=null] : (otherlv_0= 'xor' otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) ) (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )* otherlv_15= ')' ) ;
    public final EObject ruleXOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_8=null;
        Token otherlv_15=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_5_0 = null;

        EObject lv_arguments_6_0 = null;

        EObject lv_arguments_7_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_11_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_13_0 = null;

        EObject lv_arguments_14_0 = null;



        	enterRule();

        try {
            // InternalLogicFunctionLanguage.g:914:2: ( (otherlv_0= 'xor' otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) ) (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )* otherlv_15= ')' ) )
            // InternalLogicFunctionLanguage.g:915:2: (otherlv_0= 'xor' otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) ) (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )* otherlv_15= ')' )
            {
            // InternalLogicFunctionLanguage.g:915:2: (otherlv_0= 'xor' otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) ) (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )* otherlv_15= ')' )
            // InternalLogicFunctionLanguage.g:916:3: otherlv_0= 'xor' otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) ) (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )* otherlv_15= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getXORAccess().getXorKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getXORAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLogicFunctionLanguage.g:924:3: ( ( (lv_arguments_2_0= ruleAND ) ) | ( (lv_arguments_3_0= ruleOR ) ) | ( (lv_arguments_4_0= ruleXOR ) ) | ( (lv_arguments_5_0= ruleNOT ) ) | ( (lv_arguments_6_0= rulePredicateListen ) ) | ( (lv_arguments_7_0= ruleRuleListen ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt11=1;
                }
                break;
            case 21:
                {
                alt11=2;
                }
                break;
            case 22:
                {
                alt11=3;
                }
                break;
            case 23:
                {
                alt11=4;
                }
                break;
            case 25:
                {
                alt11=5;
                }
                break;
            case RULE_ID:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:925:4: ( (lv_arguments_2_0= ruleAND ) )
                    {
                    // InternalLogicFunctionLanguage.g:925:4: ( (lv_arguments_2_0= ruleAND ) )
                    // InternalLogicFunctionLanguage.g:926:5: (lv_arguments_2_0= ruleAND )
                    {
                    // InternalLogicFunctionLanguage.g:926:5: (lv_arguments_2_0= ruleAND )
                    // InternalLogicFunctionLanguage.g:927:6: lv_arguments_2_0= ruleAND
                    {

                    						newCompositeNode(grammarAccess.getXORAccess().getArgumentsANDParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_2_0=ruleAND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXORRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.AND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:945:4: ( (lv_arguments_3_0= ruleOR ) )
                    {
                    // InternalLogicFunctionLanguage.g:945:4: ( (lv_arguments_3_0= ruleOR ) )
                    // InternalLogicFunctionLanguage.g:946:5: (lv_arguments_3_0= ruleOR )
                    {
                    // InternalLogicFunctionLanguage.g:946:5: (lv_arguments_3_0= ruleOR )
                    // InternalLogicFunctionLanguage.g:947:6: lv_arguments_3_0= ruleOR
                    {

                    						newCompositeNode(grammarAccess.getXORAccess().getArgumentsORParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_3_0=ruleOR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXORRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.OR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLogicFunctionLanguage.g:965:4: ( (lv_arguments_4_0= ruleXOR ) )
                    {
                    // InternalLogicFunctionLanguage.g:965:4: ( (lv_arguments_4_0= ruleXOR ) )
                    // InternalLogicFunctionLanguage.g:966:5: (lv_arguments_4_0= ruleXOR )
                    {
                    // InternalLogicFunctionLanguage.g:966:5: (lv_arguments_4_0= ruleXOR )
                    // InternalLogicFunctionLanguage.g:967:6: lv_arguments_4_0= ruleXOR
                    {

                    						newCompositeNode(grammarAccess.getXORAccess().getArgumentsXORParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_4_0=ruleXOR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXORRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_4_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.XOR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLogicFunctionLanguage.g:985:4: ( (lv_arguments_5_0= ruleNOT ) )
                    {
                    // InternalLogicFunctionLanguage.g:985:4: ( (lv_arguments_5_0= ruleNOT ) )
                    // InternalLogicFunctionLanguage.g:986:5: (lv_arguments_5_0= ruleNOT )
                    {
                    // InternalLogicFunctionLanguage.g:986:5: (lv_arguments_5_0= ruleNOT )
                    // InternalLogicFunctionLanguage.g:987:6: lv_arguments_5_0= ruleNOT
                    {

                    						newCompositeNode(grammarAccess.getXORAccess().getArgumentsNOTParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_5_0=ruleNOT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXORRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_5_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.NOT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalLogicFunctionLanguage.g:1005:4: ( (lv_arguments_6_0= rulePredicateListen ) )
                    {
                    // InternalLogicFunctionLanguage.g:1005:4: ( (lv_arguments_6_0= rulePredicateListen ) )
                    // InternalLogicFunctionLanguage.g:1006:5: (lv_arguments_6_0= rulePredicateListen )
                    {
                    // InternalLogicFunctionLanguage.g:1006:5: (lv_arguments_6_0= rulePredicateListen )
                    // InternalLogicFunctionLanguage.g:1007:6: lv_arguments_6_0= rulePredicateListen
                    {

                    						newCompositeNode(grammarAccess.getXORAccess().getArgumentsPredicateListenParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_6_0=rulePredicateListen();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXORRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_6_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.PredicateListen");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalLogicFunctionLanguage.g:1025:4: ( (lv_arguments_7_0= ruleRuleListen ) )
                    {
                    // InternalLogicFunctionLanguage.g:1025:4: ( (lv_arguments_7_0= ruleRuleListen ) )
                    // InternalLogicFunctionLanguage.g:1026:5: (lv_arguments_7_0= ruleRuleListen )
                    {
                    // InternalLogicFunctionLanguage.g:1026:5: (lv_arguments_7_0= ruleRuleListen )
                    // InternalLogicFunctionLanguage.g:1027:6: lv_arguments_7_0= ruleRuleListen
                    {

                    						newCompositeNode(grammarAccess.getXORAccess().getArgumentsRuleListenParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_arguments_7_0=ruleRuleListen();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXORRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_7_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.RuleListen");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLogicFunctionLanguage.g:1045:3: (otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLogicFunctionLanguage.g:1046:4: otherlv_8= ',' ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) )
            	    {
            	    otherlv_8=(Token)match(input,19,FOLLOW_8); 

            	    				newLeafNode(otherlv_8, grammarAccess.getXORAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalLogicFunctionLanguage.g:1050:4: ( ( (lv_arguments_9_0= ruleAND ) ) | ( (lv_arguments_10_0= ruleOR ) ) | ( (lv_arguments_11_0= ruleXOR ) ) | ( (lv_arguments_12_0= ruleNOT ) ) | ( (lv_arguments_13_0= rulePredicateListen ) ) | ( (lv_arguments_14_0= ruleRuleListen ) ) )
            	    int alt12=6;
            	    switch ( input.LA(1) ) {
            	    case 17:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt12=4;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt12=5;
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        alt12=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // InternalLogicFunctionLanguage.g:1051:5: ( (lv_arguments_9_0= ruleAND ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:1051:5: ( (lv_arguments_9_0= ruleAND ) )
            	            // InternalLogicFunctionLanguage.g:1052:6: (lv_arguments_9_0= ruleAND )
            	            {
            	            // InternalLogicFunctionLanguage.g:1052:6: (lv_arguments_9_0= ruleAND )
            	            // InternalLogicFunctionLanguage.g:1053:7: lv_arguments_9_0= ruleAND
            	            {

            	            							newCompositeNode(grammarAccess.getXORAccess().getArgumentsANDParserRuleCall_3_1_0_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_9_0=ruleAND();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getXORRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_9_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.AND");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLogicFunctionLanguage.g:1071:5: ( (lv_arguments_10_0= ruleOR ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:1071:5: ( (lv_arguments_10_0= ruleOR ) )
            	            // InternalLogicFunctionLanguage.g:1072:6: (lv_arguments_10_0= ruleOR )
            	            {
            	            // InternalLogicFunctionLanguage.g:1072:6: (lv_arguments_10_0= ruleOR )
            	            // InternalLogicFunctionLanguage.g:1073:7: lv_arguments_10_0= ruleOR
            	            {

            	            							newCompositeNode(grammarAccess.getXORAccess().getArgumentsORParserRuleCall_3_1_1_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_10_0=ruleOR();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getXORRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_10_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.OR");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalLogicFunctionLanguage.g:1091:5: ( (lv_arguments_11_0= ruleXOR ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:1091:5: ( (lv_arguments_11_0= ruleXOR ) )
            	            // InternalLogicFunctionLanguage.g:1092:6: (lv_arguments_11_0= ruleXOR )
            	            {
            	            // InternalLogicFunctionLanguage.g:1092:6: (lv_arguments_11_0= ruleXOR )
            	            // InternalLogicFunctionLanguage.g:1093:7: lv_arguments_11_0= ruleXOR
            	            {

            	            							newCompositeNode(grammarAccess.getXORAccess().getArgumentsXORParserRuleCall_3_1_2_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_11_0=ruleXOR();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getXORRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_11_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.XOR");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalLogicFunctionLanguage.g:1111:5: ( (lv_arguments_12_0= ruleNOT ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:1111:5: ( (lv_arguments_12_0= ruleNOT ) )
            	            // InternalLogicFunctionLanguage.g:1112:6: (lv_arguments_12_0= ruleNOT )
            	            {
            	            // InternalLogicFunctionLanguage.g:1112:6: (lv_arguments_12_0= ruleNOT )
            	            // InternalLogicFunctionLanguage.g:1113:7: lv_arguments_12_0= ruleNOT
            	            {

            	            							newCompositeNode(grammarAccess.getXORAccess().getArgumentsNOTParserRuleCall_3_1_3_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_12_0=ruleNOT();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getXORRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_12_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.NOT");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalLogicFunctionLanguage.g:1131:5: ( (lv_arguments_13_0= rulePredicateListen ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:1131:5: ( (lv_arguments_13_0= rulePredicateListen ) )
            	            // InternalLogicFunctionLanguage.g:1132:6: (lv_arguments_13_0= rulePredicateListen )
            	            {
            	            // InternalLogicFunctionLanguage.g:1132:6: (lv_arguments_13_0= rulePredicateListen )
            	            // InternalLogicFunctionLanguage.g:1133:7: lv_arguments_13_0= rulePredicateListen
            	            {

            	            							newCompositeNode(grammarAccess.getXORAccess().getArgumentsPredicateListenParserRuleCall_3_1_4_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_13_0=rulePredicateListen();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getXORRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_13_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.PredicateListen");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalLogicFunctionLanguage.g:1151:5: ( (lv_arguments_14_0= ruleRuleListen ) )
            	            {
            	            // InternalLogicFunctionLanguage.g:1151:5: ( (lv_arguments_14_0= ruleRuleListen ) )
            	            // InternalLogicFunctionLanguage.g:1152:6: (lv_arguments_14_0= ruleRuleListen )
            	            {
            	            // InternalLogicFunctionLanguage.g:1152:6: (lv_arguments_14_0= ruleRuleListen )
            	            // InternalLogicFunctionLanguage.g:1153:7: lv_arguments_14_0= ruleRuleListen
            	            {

            	            							newCompositeNode(grammarAccess.getXORAccess().getArgumentsRuleListenParserRuleCall_3_1_5_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_arguments_14_0=ruleRuleListen();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getXORRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_14_0,
            	            								"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.RuleListen");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_15=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getXORAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleXOR"


    // $ANTLR start "entryRuleNOT"
    // InternalLogicFunctionLanguage.g:1180:1: entryRuleNOT returns [EObject current=null] : iv_ruleNOT= ruleNOT EOF ;
    public final EObject entryRuleNOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNOT = null;


        try {
            // InternalLogicFunctionLanguage.g:1180:44: (iv_ruleNOT= ruleNOT EOF )
            // InternalLogicFunctionLanguage.g:1181:2: iv_ruleNOT= ruleNOT EOF
            {
             newCompositeNode(grammarAccess.getNOTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNOT=ruleNOT();

            state._fsp--;

             current =iv_ruleNOT; 
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
    // $ANTLR end "entryRuleNOT"


    // $ANTLR start "ruleNOT"
    // InternalLogicFunctionLanguage.g:1187:1: ruleNOT returns [EObject current=null] : (otherlv_0= 'not' otherlv_1= '(' ( ( (lv_argument_2_0= ruleAND ) ) | ( (lv_argument_3_0= ruleOR ) ) | ( (lv_argument_4_0= ruleXOR ) ) | ( (lv_argument_5_0= ruleNOT ) ) | ( (lv_argument_6_0= rulePredicateListen ) ) | ( (lv_argument_7_0= ruleRuleListen ) ) ) otherlv_8= ')' ) ;
    public final EObject ruleNOT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_8=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_3_0 = null;

        EObject lv_argument_4_0 = null;

        EObject lv_argument_5_0 = null;

        EObject lv_argument_6_0 = null;

        EObject lv_argument_7_0 = null;



        	enterRule();

        try {
            // InternalLogicFunctionLanguage.g:1193:2: ( (otherlv_0= 'not' otherlv_1= '(' ( ( (lv_argument_2_0= ruleAND ) ) | ( (lv_argument_3_0= ruleOR ) ) | ( (lv_argument_4_0= ruleXOR ) ) | ( (lv_argument_5_0= ruleNOT ) ) | ( (lv_argument_6_0= rulePredicateListen ) ) | ( (lv_argument_7_0= ruleRuleListen ) ) ) otherlv_8= ')' ) )
            // InternalLogicFunctionLanguage.g:1194:2: (otherlv_0= 'not' otherlv_1= '(' ( ( (lv_argument_2_0= ruleAND ) ) | ( (lv_argument_3_0= ruleOR ) ) | ( (lv_argument_4_0= ruleXOR ) ) | ( (lv_argument_5_0= ruleNOT ) ) | ( (lv_argument_6_0= rulePredicateListen ) ) | ( (lv_argument_7_0= ruleRuleListen ) ) ) otherlv_8= ')' )
            {
            // InternalLogicFunctionLanguage.g:1194:2: (otherlv_0= 'not' otherlv_1= '(' ( ( (lv_argument_2_0= ruleAND ) ) | ( (lv_argument_3_0= ruleOR ) ) | ( (lv_argument_4_0= ruleXOR ) ) | ( (lv_argument_5_0= ruleNOT ) ) | ( (lv_argument_6_0= rulePredicateListen ) ) | ( (lv_argument_7_0= ruleRuleListen ) ) ) otherlv_8= ')' )
            // InternalLogicFunctionLanguage.g:1195:3: otherlv_0= 'not' otherlv_1= '(' ( ( (lv_argument_2_0= ruleAND ) ) | ( (lv_argument_3_0= ruleOR ) ) | ( (lv_argument_4_0= ruleXOR ) ) | ( (lv_argument_5_0= ruleNOT ) ) | ( (lv_argument_6_0= rulePredicateListen ) ) | ( (lv_argument_7_0= ruleRuleListen ) ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getNOTAccess().getNotKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getNOTAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLogicFunctionLanguage.g:1203:3: ( ( (lv_argument_2_0= ruleAND ) ) | ( (lv_argument_3_0= ruleOR ) ) | ( (lv_argument_4_0= ruleXOR ) ) | ( (lv_argument_5_0= ruleNOT ) ) | ( (lv_argument_6_0= rulePredicateListen ) ) | ( (lv_argument_7_0= ruleRuleListen ) ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt14=1;
                }
                break;
            case 21:
                {
                alt14=2;
                }
                break;
            case 22:
                {
                alt14=3;
                }
                break;
            case 23:
                {
                alt14=4;
                }
                break;
            case 25:
                {
                alt14=5;
                }
                break;
            case RULE_ID:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:1204:4: ( (lv_argument_2_0= ruleAND ) )
                    {
                    // InternalLogicFunctionLanguage.g:1204:4: ( (lv_argument_2_0= ruleAND ) )
                    // InternalLogicFunctionLanguage.g:1205:5: (lv_argument_2_0= ruleAND )
                    {
                    // InternalLogicFunctionLanguage.g:1205:5: (lv_argument_2_0= ruleAND )
                    // InternalLogicFunctionLanguage.g:1206:6: lv_argument_2_0= ruleAND
                    {

                    						newCompositeNode(grammarAccess.getNOTAccess().getArgumentANDParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_argument_2_0=ruleAND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNOTRule());
                    						}
                    						set(
                    							current,
                    							"argument",
                    							lv_argument_2_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.AND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:1224:4: ( (lv_argument_3_0= ruleOR ) )
                    {
                    // InternalLogicFunctionLanguage.g:1224:4: ( (lv_argument_3_0= ruleOR ) )
                    // InternalLogicFunctionLanguage.g:1225:5: (lv_argument_3_0= ruleOR )
                    {
                    // InternalLogicFunctionLanguage.g:1225:5: (lv_argument_3_0= ruleOR )
                    // InternalLogicFunctionLanguage.g:1226:6: lv_argument_3_0= ruleOR
                    {

                    						newCompositeNode(grammarAccess.getNOTAccess().getArgumentORParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_argument_3_0=ruleOR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNOTRule());
                    						}
                    						set(
                    							current,
                    							"argument",
                    							lv_argument_3_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.OR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLogicFunctionLanguage.g:1244:4: ( (lv_argument_4_0= ruleXOR ) )
                    {
                    // InternalLogicFunctionLanguage.g:1244:4: ( (lv_argument_4_0= ruleXOR ) )
                    // InternalLogicFunctionLanguage.g:1245:5: (lv_argument_4_0= ruleXOR )
                    {
                    // InternalLogicFunctionLanguage.g:1245:5: (lv_argument_4_0= ruleXOR )
                    // InternalLogicFunctionLanguage.g:1246:6: lv_argument_4_0= ruleXOR
                    {

                    						newCompositeNode(grammarAccess.getNOTAccess().getArgumentXORParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_argument_4_0=ruleXOR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNOTRule());
                    						}
                    						set(
                    							current,
                    							"argument",
                    							lv_argument_4_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.XOR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLogicFunctionLanguage.g:1264:4: ( (lv_argument_5_0= ruleNOT ) )
                    {
                    // InternalLogicFunctionLanguage.g:1264:4: ( (lv_argument_5_0= ruleNOT ) )
                    // InternalLogicFunctionLanguage.g:1265:5: (lv_argument_5_0= ruleNOT )
                    {
                    // InternalLogicFunctionLanguage.g:1265:5: (lv_argument_5_0= ruleNOT )
                    // InternalLogicFunctionLanguage.g:1266:6: lv_argument_5_0= ruleNOT
                    {

                    						newCompositeNode(grammarAccess.getNOTAccess().getArgumentNOTParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_argument_5_0=ruleNOT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNOTRule());
                    						}
                    						set(
                    							current,
                    							"argument",
                    							lv_argument_5_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.NOT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalLogicFunctionLanguage.g:1284:4: ( (lv_argument_6_0= rulePredicateListen ) )
                    {
                    // InternalLogicFunctionLanguage.g:1284:4: ( (lv_argument_6_0= rulePredicateListen ) )
                    // InternalLogicFunctionLanguage.g:1285:5: (lv_argument_6_0= rulePredicateListen )
                    {
                    // InternalLogicFunctionLanguage.g:1285:5: (lv_argument_6_0= rulePredicateListen )
                    // InternalLogicFunctionLanguage.g:1286:6: lv_argument_6_0= rulePredicateListen
                    {

                    						newCompositeNode(grammarAccess.getNOTAccess().getArgumentPredicateListenParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_argument_6_0=rulePredicateListen();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNOTRule());
                    						}
                    						set(
                    							current,
                    							"argument",
                    							lv_argument_6_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.PredicateListen");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalLogicFunctionLanguage.g:1304:4: ( (lv_argument_7_0= ruleRuleListen ) )
                    {
                    // InternalLogicFunctionLanguage.g:1304:4: ( (lv_argument_7_0= ruleRuleListen ) )
                    // InternalLogicFunctionLanguage.g:1305:5: (lv_argument_7_0= ruleRuleListen )
                    {
                    // InternalLogicFunctionLanguage.g:1305:5: (lv_argument_7_0= ruleRuleListen )
                    // InternalLogicFunctionLanguage.g:1306:6: lv_argument_7_0= ruleRuleListen
                    {

                    						newCompositeNode(grammarAccess.getNOTAccess().getArgumentRuleListenParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_argument_7_0=ruleRuleListen();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNOTRule());
                    						}
                    						set(
                    							current,
                    							"argument",
                    							lv_argument_7_0,
                    							"hu.bme.mit.gamma.logical.logicFunction.language.LogicFunctionLanguage.RuleListen");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getNOTAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleNOT"


    // $ANTLR start "entryRulePredicateListen"
    // InternalLogicFunctionLanguage.g:1332:1: entryRulePredicateListen returns [EObject current=null] : iv_rulePredicateListen= rulePredicateListen EOF ;
    public final EObject entryRulePredicateListen() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateListen = null;


        try {
            // InternalLogicFunctionLanguage.g:1332:56: (iv_rulePredicateListen= rulePredicateListen EOF )
            // InternalLogicFunctionLanguage.g:1333:2: iv_rulePredicateListen= rulePredicateListen EOF
            {
             newCompositeNode(grammarAccess.getPredicateListenRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicateListen=rulePredicateListen();

            state._fsp--;

             current =iv_rulePredicateListen; 
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
    // $ANTLR end "entryRulePredicateListen"


    // $ANTLR start "rulePredicateListen"
    // InternalLogicFunctionLanguage.g:1339:1: rulePredicateListen returns [EObject current=null] : ( (lv_listens_0_0= rulePredicate ) ) ;
    public final EObject rulePredicateListen() throws RecognitionException {
        EObject current = null;

        EObject lv_listens_0_0 = null;



        	enterRule();

        try {
            // InternalLogicFunctionLanguage.g:1345:2: ( ( (lv_listens_0_0= rulePredicate ) ) )
            // InternalLogicFunctionLanguage.g:1346:2: ( (lv_listens_0_0= rulePredicate ) )
            {
            // InternalLogicFunctionLanguage.g:1346:2: ( (lv_listens_0_0= rulePredicate ) )
            // InternalLogicFunctionLanguage.g:1347:3: (lv_listens_0_0= rulePredicate )
            {
            // InternalLogicFunctionLanguage.g:1347:3: (lv_listens_0_0= rulePredicate )
            // InternalLogicFunctionLanguage.g:1348:4: lv_listens_0_0= rulePredicate
            {

            				newCompositeNode(grammarAccess.getPredicateListenAccess().getListensPredicateParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_listens_0_0=rulePredicate();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPredicateListenRule());
            				}
            				set(
            					current,
            					"listens",
            					lv_listens_0_0,
            					"hu.bme.mit.gamma.logical.logicBase.language.LogicBaseLanguage.Predicate");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "rulePredicateListen"


    // $ANTLR start "entryRuleRuleListen"
    // InternalLogicFunctionLanguage.g:1368:1: entryRuleRuleListen returns [EObject current=null] : iv_ruleRuleListen= ruleRuleListen EOF ;
    public final EObject entryRuleRuleListen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleListen = null;


        try {
            // InternalLogicFunctionLanguage.g:1368:51: (iv_ruleRuleListen= ruleRuleListen EOF )
            // InternalLogicFunctionLanguage.g:1369:2: iv_ruleRuleListen= ruleRuleListen EOF
            {
             newCompositeNode(grammarAccess.getRuleListenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleListen=ruleRuleListen();

            state._fsp--;

             current =iv_ruleRuleListen; 
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
    // $ANTLR end "entryRuleRuleListen"


    // $ANTLR start "ruleRuleListen"
    // InternalLogicFunctionLanguage.g:1375:1: ruleRuleListen returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRuleListen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalLogicFunctionLanguage.g:1381:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalLogicFunctionLanguage.g:1382:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalLogicFunctionLanguage.g:1382:2: ( (otherlv_0= RULE_ID ) )
            // InternalLogicFunctionLanguage.g:1383:3: (otherlv_0= RULE_ID )
            {
            // InternalLogicFunctionLanguage.g:1383:3: (otherlv_0= RULE_ID )
            // InternalLogicFunctionLanguage.g:1384:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRuleListenRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRuleListenAccess().getListensRuleCrossReference_0());
            			

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
    // $ANTLR end "ruleRuleListen"


    // $ANTLR start "entryRuleInterface"
    // InternalLogicFunctionLanguage.g:1398:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalLogicFunctionLanguage.g:1398:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalLogicFunctionLanguage.g:1399:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalLogicFunctionLanguage.g:1405:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEventDeclaration ) )* otherlv_4= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_events_3_0 = null;



        	enterRule();

        try {
            // InternalLogicFunctionLanguage.g:1411:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEventDeclaration ) )* otherlv_4= '}' ) )
            // InternalLogicFunctionLanguage.g:1412:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEventDeclaration ) )* otherlv_4= '}' )
            {
            // InternalLogicFunctionLanguage.g:1412:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEventDeclaration ) )* otherlv_4= '}' )
            // InternalLogicFunctionLanguage.g:1413:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEventDeclaration ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalLogicFunctionLanguage.g:1417:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLogicFunctionLanguage.g:1418:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLogicFunctionLanguage.g:1418:4: (lv_name_1_0= RULE_ID )
            // InternalLogicFunctionLanguage.g:1419:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLogicFunctionLanguage.g:1439:3: ( (lv_events_3_0= ruleEventDeclaration ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=27 && LA15_0<=28)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLogicFunctionLanguage.g:1440:4: (lv_events_3_0= ruleEventDeclaration )
            	    {
            	    // InternalLogicFunctionLanguage.g:1440:4: (lv_events_3_0= ruleEventDeclaration )
            	    // InternalLogicFunctionLanguage.g:1441:5: lv_events_3_0= ruleEventDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceAccess().getEventsEventDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_events_3_0=ruleEventDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"events",
            	    						lv_events_3_0,
            	    						"hu.bme.mit.gamma.logical.logicBase.language.LogicBaseLanguage.EventDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleEventDeclaration"
    // InternalLogicFunctionLanguage.g:1466:1: entryRuleEventDeclaration returns [EObject current=null] : iv_ruleEventDeclaration= ruleEventDeclaration EOF ;
    public final EObject entryRuleEventDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclaration = null;


        try {
            // InternalLogicFunctionLanguage.g:1466:57: (iv_ruleEventDeclaration= ruleEventDeclaration EOF )
            // InternalLogicFunctionLanguage.g:1467:2: iv_ruleEventDeclaration= ruleEventDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEventDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventDeclaration=ruleEventDeclaration();

            state._fsp--;

             current =iv_ruleEventDeclaration; 
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
    // $ANTLR end "entryRuleEventDeclaration"


    // $ANTLR start "ruleEventDeclaration"
    // InternalLogicFunctionLanguage.g:1473:1: ruleEventDeclaration returns [EObject current=null] : ( ( (lv_direction_0_0= ruleEventDirection ) ) ( (lv_extraValueType_1_0= ruleValueType ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEventDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Enumerator lv_direction_0_0 = null;

        Enumerator lv_extraValueType_1_0 = null;



        	enterRule();

        try {
            // InternalLogicFunctionLanguage.g:1479:2: ( ( ( (lv_direction_0_0= ruleEventDirection ) ) ( (lv_extraValueType_1_0= ruleValueType ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalLogicFunctionLanguage.g:1480:2: ( ( (lv_direction_0_0= ruleEventDirection ) ) ( (lv_extraValueType_1_0= ruleValueType ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalLogicFunctionLanguage.g:1480:2: ( ( (lv_direction_0_0= ruleEventDirection ) ) ( (lv_extraValueType_1_0= ruleValueType ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalLogicFunctionLanguage.g:1481:3: ( (lv_direction_0_0= ruleEventDirection ) ) ( (lv_extraValueType_1_0= ruleValueType ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalLogicFunctionLanguage.g:1481:3: ( (lv_direction_0_0= ruleEventDirection ) )
            // InternalLogicFunctionLanguage.g:1482:4: (lv_direction_0_0= ruleEventDirection )
            {
            // InternalLogicFunctionLanguage.g:1482:4: (lv_direction_0_0= ruleEventDirection )
            // InternalLogicFunctionLanguage.g:1483:5: lv_direction_0_0= ruleEventDirection
            {

            					newCompositeNode(grammarAccess.getEventDeclarationAccess().getDirectionEventDirectionEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_direction_0_0=ruleEventDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventDeclarationRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_0_0,
            						"hu.bme.mit.gamma.logical.logicBase.language.LogicBaseLanguage.EventDirection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLogicFunctionLanguage.g:1500:3: ( (lv_extraValueType_1_0= ruleValueType ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:1501:4: (lv_extraValueType_1_0= ruleValueType )
                    {
                    // InternalLogicFunctionLanguage.g:1501:4: (lv_extraValueType_1_0= ruleValueType )
                    // InternalLogicFunctionLanguage.g:1502:5: lv_extraValueType_1_0= ruleValueType
                    {

                    					newCompositeNode(grammarAccess.getEventDeclarationAccess().getExtraValueTypeValueTypeEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_extraValueType_1_0=ruleValueType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEventDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"extraValueType",
                    						lv_extraValueType_1_0,
                    						"hu.bme.mit.gamma.logical.logicBase.language.LogicBaseLanguage.ValueType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLogicFunctionLanguage.g:1519:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLogicFunctionLanguage.g:1520:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLogicFunctionLanguage.g:1520:4: (lv_name_2_0= RULE_ID )
            // InternalLogicFunctionLanguage.g:1521:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEventDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleEventDeclaration"


    // $ANTLR start "entryRulePredicate"
    // InternalLogicFunctionLanguage.g:1541:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalLogicFunctionLanguage.g:1541:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalLogicFunctionLanguage.g:1542:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalLogicFunctionLanguage.g:1548:1: rulePredicate returns [EObject current=null] : (otherlv_0= 'income' ( ( ruleQualifiedName ) ) ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalLogicFunctionLanguage.g:1554:2: ( (otherlv_0= 'income' ( ( ruleQualifiedName ) ) ) )
            // InternalLogicFunctionLanguage.g:1555:2: (otherlv_0= 'income' ( ( ruleQualifiedName ) ) )
            {
            // InternalLogicFunctionLanguage.g:1555:2: (otherlv_0= 'income' ( ( ruleQualifiedName ) ) )
            // InternalLogicFunctionLanguage.g:1556:3: otherlv_0= 'income' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPredicateAccess().getIncomeKeyword_0());
            		
            // InternalLogicFunctionLanguage.g:1560:3: ( ( ruleQualifiedName ) )
            // InternalLogicFunctionLanguage.g:1561:4: ( ruleQualifiedName )
            {
            // InternalLogicFunctionLanguage.g:1561:4: ( ruleQualifiedName )
            // InternalLogicFunctionLanguage.g:1562:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredicateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPredicateAccess().getListensEventCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLogicFunctionLanguage.g:1580:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalLogicFunctionLanguage.g:1580:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalLogicFunctionLanguage.g:1581:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalLogicFunctionLanguage.g:1587:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLogicFunctionLanguage.g:1593:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalLogicFunctionLanguage.g:1594:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalLogicFunctionLanguage.g:1594:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalLogicFunctionLanguage.g:1595:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalLogicFunctionLanguage.g:1602:3: (kw= '.' this_ID_2= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLogicFunctionLanguage.g:1603:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleEventDirection"
    // InternalLogicFunctionLanguage.g:1620:1: ruleEventDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleEventDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLogicFunctionLanguage.g:1626:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalLogicFunctionLanguage.g:1627:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalLogicFunctionLanguage.g:1627:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            else if ( (LA18_0==28) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:1628:3: (enumLiteral_0= 'in' )
                    {
                    // InternalLogicFunctionLanguage.g:1628:3: (enumLiteral_0= 'in' )
                    // InternalLogicFunctionLanguage.g:1629:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getEventDirectionAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventDirectionAccess().getINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:1636:3: (enumLiteral_1= 'out' )
                    {
                    // InternalLogicFunctionLanguage.g:1636:3: (enumLiteral_1= 'out' )
                    // InternalLogicFunctionLanguage.g:1637:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getEventDirectionAccess().getOUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEventDirectionAccess().getOUTEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEventDirection"


    // $ANTLR start "ruleValueType"
    // InternalLogicFunctionLanguage.g:1647:1: ruleValueType returns [Enumerator current=null] : (enumLiteral_0= 'int' ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalLogicFunctionLanguage.g:1653:2: ( (enumLiteral_0= 'int' ) )
            // InternalLogicFunctionLanguage.g:1654:2: (enumLiteral_0= 'int' )
            {
            // InternalLogicFunctionLanguage.g:1654:2: (enumLiteral_0= 'int' )
            // InternalLogicFunctionLanguage.g:1655:3: enumLiteral_0= 'int'
            {
            enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

            			current = grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleValueType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002E20010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000018002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000002L});

}