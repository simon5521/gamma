package hu.bme.mit.gamma.logical.logicBase.language.parser.antlr.internal;

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
import hu.bme.mit.gamma.logical.logicBase.language.services.LogicBaseLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLogicBaseLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interface'", "'{'", "'}'", "'.'", "'in'", "'out'", "'int'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalLogicBaseLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLogicBaseLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLogicBaseLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLogicBaseLanguage.g"; }



     	private LogicBaseLanguageGrammarAccess grammarAccess;

        public InternalLogicBaseLanguageParser(TokenStream input, LogicBaseLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Interface";
       	}

       	@Override
       	protected LogicBaseLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInterface"
    // InternalLogicBaseLanguage.g:65:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalLogicBaseLanguage.g:65:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalLogicBaseLanguage.g:66:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalLogicBaseLanguage.g:72:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEventDeclaration ) )* otherlv_4= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_events_3_0 = null;



        	enterRule();

        try {
            // InternalLogicBaseLanguage.g:78:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEventDeclaration ) )* otherlv_4= '}' ) )
            // InternalLogicBaseLanguage.g:79:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEventDeclaration ) )* otherlv_4= '}' )
            {
            // InternalLogicBaseLanguage.g:79:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEventDeclaration ) )* otherlv_4= '}' )
            // InternalLogicBaseLanguage.g:80:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEventDeclaration ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalLogicBaseLanguage.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLogicBaseLanguage.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLogicBaseLanguage.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalLogicBaseLanguage.g:86:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLogicBaseLanguage.g:106:3: ( (lv_events_3_0= ruleEventDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLogicBaseLanguage.g:107:4: (lv_events_3_0= ruleEventDeclaration )
            	    {
            	    // InternalLogicBaseLanguage.g:107:4: (lv_events_3_0= ruleEventDeclaration )
            	    // InternalLogicBaseLanguage.g:108:5: lv_events_3_0= ruleEventDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceAccess().getEventsEventDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
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
            	    break loop1;
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
    // InternalLogicBaseLanguage.g:133:1: entryRuleEventDeclaration returns [EObject current=null] : iv_ruleEventDeclaration= ruleEventDeclaration EOF ;
    public final EObject entryRuleEventDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclaration = null;


        try {
            // InternalLogicBaseLanguage.g:133:57: (iv_ruleEventDeclaration= ruleEventDeclaration EOF )
            // InternalLogicBaseLanguage.g:134:2: iv_ruleEventDeclaration= ruleEventDeclaration EOF
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
    // InternalLogicBaseLanguage.g:140:1: ruleEventDeclaration returns [EObject current=null] : ( ( (lv_direction_0_0= ruleEventDirection ) ) ( (lv_extraValueType_1_0= ruleValueType ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEventDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Enumerator lv_direction_0_0 = null;

        Enumerator lv_extraValueType_1_0 = null;



        	enterRule();

        try {
            // InternalLogicBaseLanguage.g:146:2: ( ( ( (lv_direction_0_0= ruleEventDirection ) ) ( (lv_extraValueType_1_0= ruleValueType ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalLogicBaseLanguage.g:147:2: ( ( (lv_direction_0_0= ruleEventDirection ) ) ( (lv_extraValueType_1_0= ruleValueType ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalLogicBaseLanguage.g:147:2: ( ( (lv_direction_0_0= ruleEventDirection ) ) ( (lv_extraValueType_1_0= ruleValueType ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalLogicBaseLanguage.g:148:3: ( (lv_direction_0_0= ruleEventDirection ) ) ( (lv_extraValueType_1_0= ruleValueType ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalLogicBaseLanguage.g:148:3: ( (lv_direction_0_0= ruleEventDirection ) )
            // InternalLogicBaseLanguage.g:149:4: (lv_direction_0_0= ruleEventDirection )
            {
            // InternalLogicBaseLanguage.g:149:4: (lv_direction_0_0= ruleEventDirection )
            // InternalLogicBaseLanguage.g:150:5: lv_direction_0_0= ruleEventDirection
            {

            					newCompositeNode(grammarAccess.getEventDeclarationAccess().getDirectionEventDirectionEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalLogicBaseLanguage.g:167:3: ( (lv_extraValueType_1_0= ruleValueType ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLogicBaseLanguage.g:168:4: (lv_extraValueType_1_0= ruleValueType )
                    {
                    // InternalLogicBaseLanguage.g:168:4: (lv_extraValueType_1_0= ruleValueType )
                    // InternalLogicBaseLanguage.g:169:5: lv_extraValueType_1_0= ruleValueType
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

            // InternalLogicBaseLanguage.g:186:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLogicBaseLanguage.g:187:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLogicBaseLanguage.g:187:4: (lv_name_2_0= RULE_ID )
            // InternalLogicBaseLanguage.g:188:5: lv_name_2_0= RULE_ID
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLogicBaseLanguage.g:208:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalLogicBaseLanguage.g:208:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalLogicBaseLanguage.g:209:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalLogicBaseLanguage.g:215:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLogicBaseLanguage.g:221:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalLogicBaseLanguage.g:222:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalLogicBaseLanguage.g:222:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalLogicBaseLanguage.g:223:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalLogicBaseLanguage.g:230:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLogicBaseLanguage.g:231:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleEventDirection"
    // InternalLogicBaseLanguage.g:248:1: ruleEventDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleEventDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLogicBaseLanguage.g:254:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalLogicBaseLanguage.g:255:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalLogicBaseLanguage.g:255:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLogicBaseLanguage.g:256:3: (enumLiteral_0= 'in' )
                    {
                    // InternalLogicBaseLanguage.g:256:3: (enumLiteral_0= 'in' )
                    // InternalLogicBaseLanguage.g:257:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getEventDirectionAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventDirectionAccess().getINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLogicBaseLanguage.g:264:3: (enumLiteral_1= 'out' )
                    {
                    // InternalLogicBaseLanguage.g:264:3: (enumLiteral_1= 'out' )
                    // InternalLogicBaseLanguage.g:265:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,16,FOLLOW_2); 

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
    // InternalLogicBaseLanguage.g:275:1: ruleValueType returns [Enumerator current=null] : (enumLiteral_0= 'int' ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalLogicBaseLanguage.g:281:2: ( (enumLiteral_0= 'int' ) )
            // InternalLogicBaseLanguage.g:282:2: (enumLiteral_0= 'int' )
            {
            // InternalLogicBaseLanguage.g:282:2: (enumLiteral_0= 'int' )
            // InternalLogicBaseLanguage.g:283:3: enumLiteral_0= 'int'
            {
            enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});

}