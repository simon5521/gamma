package hu.bme.mit.gamma.logical.logicBase.language.ide.contentassist.antlr.internal;

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
import hu.bme.mit.gamma.logical.logicBase.language.services.LogicBaseLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLogicBaseLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'in'", "'out'", "'interface'", "'{'", "'}'", "'.'"
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

    	public void setGrammarAccess(LogicBaseLanguageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleInterface"
    // InternalLogicBaseLanguage.g:53:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalLogicBaseLanguage.g:54:1: ( ruleInterface EOF )
            // InternalLogicBaseLanguage.g:55:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalLogicBaseLanguage.g:62:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:66:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalLogicBaseLanguage.g:67:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalLogicBaseLanguage.g:67:2: ( ( rule__Interface__Group__0 ) )
            // InternalLogicBaseLanguage.g:68:3: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalLogicBaseLanguage.g:69:3: ( rule__Interface__Group__0 )
            // InternalLogicBaseLanguage.g:69:4: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleEventDeclaration"
    // InternalLogicBaseLanguage.g:78:1: entryRuleEventDeclaration : ruleEventDeclaration EOF ;
    public final void entryRuleEventDeclaration() throws RecognitionException {
        try {
            // InternalLogicBaseLanguage.g:79:1: ( ruleEventDeclaration EOF )
            // InternalLogicBaseLanguage.g:80:1: ruleEventDeclaration EOF
            {
             before(grammarAccess.getEventDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleEventDeclaration();

            state._fsp--;

             after(grammarAccess.getEventDeclarationRule()); 
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
    // $ANTLR end "entryRuleEventDeclaration"


    // $ANTLR start "ruleEventDeclaration"
    // InternalLogicBaseLanguage.g:87:1: ruleEventDeclaration : ( ( rule__EventDeclaration__Group__0 ) ) ;
    public final void ruleEventDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:91:2: ( ( ( rule__EventDeclaration__Group__0 ) ) )
            // InternalLogicBaseLanguage.g:92:2: ( ( rule__EventDeclaration__Group__0 ) )
            {
            // InternalLogicBaseLanguage.g:92:2: ( ( rule__EventDeclaration__Group__0 ) )
            // InternalLogicBaseLanguage.g:93:3: ( rule__EventDeclaration__Group__0 )
            {
             before(grammarAccess.getEventDeclarationAccess().getGroup()); 
            // InternalLogicBaseLanguage.g:94:3: ( rule__EventDeclaration__Group__0 )
            // InternalLogicBaseLanguage.g:94:4: rule__EventDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleEventDeclaration"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLogicBaseLanguage.g:103:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalLogicBaseLanguage.g:104:1: ( ruleQualifiedName EOF )
            // InternalLogicBaseLanguage.g:105:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalLogicBaseLanguage.g:112:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:116:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalLogicBaseLanguage.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalLogicBaseLanguage.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalLogicBaseLanguage.g:118:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalLogicBaseLanguage.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalLogicBaseLanguage.g:119:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleEventDirection"
    // InternalLogicBaseLanguage.g:128:1: ruleEventDirection : ( ( rule__EventDirection__Alternatives ) ) ;
    public final void ruleEventDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:132:1: ( ( ( rule__EventDirection__Alternatives ) ) )
            // InternalLogicBaseLanguage.g:133:2: ( ( rule__EventDirection__Alternatives ) )
            {
            // InternalLogicBaseLanguage.g:133:2: ( ( rule__EventDirection__Alternatives ) )
            // InternalLogicBaseLanguage.g:134:3: ( rule__EventDirection__Alternatives )
            {
             before(grammarAccess.getEventDirectionAccess().getAlternatives()); 
            // InternalLogicBaseLanguage.g:135:3: ( rule__EventDirection__Alternatives )
            // InternalLogicBaseLanguage.g:135:4: rule__EventDirection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EventDirection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventDirectionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEventDirection"


    // $ANTLR start "ruleValueType"
    // InternalLogicBaseLanguage.g:144:1: ruleValueType : ( ( 'int' ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:148:1: ( ( ( 'int' ) ) )
            // InternalLogicBaseLanguage.g:149:2: ( ( 'int' ) )
            {
            // InternalLogicBaseLanguage.g:149:2: ( ( 'int' ) )
            // InternalLogicBaseLanguage.g:150:3: ( 'int' )
            {
             before(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration()); 
            // InternalLogicBaseLanguage.g:151:3: ( 'int' )
            // InternalLogicBaseLanguage.g:151:4: 'int'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleValueType"


    // $ANTLR start "rule__EventDirection__Alternatives"
    // InternalLogicBaseLanguage.g:159:1: rule__EventDirection__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );
    public final void rule__EventDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:163:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalLogicBaseLanguage.g:164:2: ( ( 'in' ) )
                    {
                    // InternalLogicBaseLanguage.g:164:2: ( ( 'in' ) )
                    // InternalLogicBaseLanguage.g:165:3: ( 'in' )
                    {
                     before(grammarAccess.getEventDirectionAccess().getINEnumLiteralDeclaration_0()); 
                    // InternalLogicBaseLanguage.g:166:3: ( 'in' )
                    // InternalLogicBaseLanguage.g:166:4: 'in'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventDirectionAccess().getINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLogicBaseLanguage.g:170:2: ( ( 'out' ) )
                    {
                    // InternalLogicBaseLanguage.g:170:2: ( ( 'out' ) )
                    // InternalLogicBaseLanguage.g:171:3: ( 'out' )
                    {
                     before(grammarAccess.getEventDirectionAccess().getOUTEnumLiteralDeclaration_1()); 
                    // InternalLogicBaseLanguage.g:172:3: ( 'out' )
                    // InternalLogicBaseLanguage.g:172:4: 'out'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventDirectionAccess().getOUTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__EventDirection__Alternatives"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalLogicBaseLanguage.g:180:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:184:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalLogicBaseLanguage.g:185:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__1();

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
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // InternalLogicBaseLanguage.g:192:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:196:1: ( ( 'interface' ) )
            // InternalLogicBaseLanguage.g:197:1: ( 'interface' )
            {
            // InternalLogicBaseLanguage.g:197:1: ( 'interface' )
            // InternalLogicBaseLanguage.g:198:2: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 

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
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // InternalLogicBaseLanguage.g:207:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:211:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalLogicBaseLanguage.g:212:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__2();

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
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // InternalLogicBaseLanguage.g:219:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:223:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // InternalLogicBaseLanguage.g:224:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // InternalLogicBaseLanguage.g:224:1: ( ( rule__Interface__NameAssignment_1 ) )
            // InternalLogicBaseLanguage.g:225:2: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // InternalLogicBaseLanguage.g:226:2: ( rule__Interface__NameAssignment_1 )
            // InternalLogicBaseLanguage.g:226:3: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // InternalLogicBaseLanguage.g:234:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:238:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalLogicBaseLanguage.g:239:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__3();

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
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // InternalLogicBaseLanguage.g:246:1: rule__Interface__Group__2__Impl : ( '{' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:250:1: ( ( '{' ) )
            // InternalLogicBaseLanguage.g:251:1: ( '{' )
            {
            // InternalLogicBaseLanguage.g:251:1: ( '{' )
            // InternalLogicBaseLanguage.g:252:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // InternalLogicBaseLanguage.g:261:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:265:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalLogicBaseLanguage.g:266:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__4();

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
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // InternalLogicBaseLanguage.g:273:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__EventsAssignment_3 )* ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:277:1: ( ( ( rule__Interface__EventsAssignment_3 )* ) )
            // InternalLogicBaseLanguage.g:278:1: ( ( rule__Interface__EventsAssignment_3 )* )
            {
            // InternalLogicBaseLanguage.g:278:1: ( ( rule__Interface__EventsAssignment_3 )* )
            // InternalLogicBaseLanguage.g:279:2: ( rule__Interface__EventsAssignment_3 )*
            {
             before(grammarAccess.getInterfaceAccess().getEventsAssignment_3()); 
            // InternalLogicBaseLanguage.g:280:2: ( rule__Interface__EventsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=12 && LA2_0<=13)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLogicBaseLanguage.g:280:3: rule__Interface__EventsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Interface__EventsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getEventsAssignment_3()); 

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
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // InternalLogicBaseLanguage.g:288:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:292:1: ( rule__Interface__Group__4__Impl )
            // InternalLogicBaseLanguage.g:293:2: rule__Interface__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__4__Impl();

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
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // InternalLogicBaseLanguage.g:299:1: rule__Interface__Group__4__Impl : ( '}' ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:303:1: ( ( '}' ) )
            // InternalLogicBaseLanguage.g:304:1: ( '}' )
            {
            // InternalLogicBaseLanguage.g:304:1: ( '}' )
            // InternalLogicBaseLanguage.g:305:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__0"
    // InternalLogicBaseLanguage.g:315:1: rule__EventDeclaration__Group__0 : rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 ;
    public final void rule__EventDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:319:1: ( rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 )
            // InternalLogicBaseLanguage.g:320:2: rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__EventDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group__1();

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
    // $ANTLR end "rule__EventDeclaration__Group__0"


    // $ANTLR start "rule__EventDeclaration__Group__0__Impl"
    // InternalLogicBaseLanguage.g:327:1: rule__EventDeclaration__Group__0__Impl : ( ( rule__EventDeclaration__DirectionAssignment_0 ) ) ;
    public final void rule__EventDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:331:1: ( ( ( rule__EventDeclaration__DirectionAssignment_0 ) ) )
            // InternalLogicBaseLanguage.g:332:1: ( ( rule__EventDeclaration__DirectionAssignment_0 ) )
            {
            // InternalLogicBaseLanguage.g:332:1: ( ( rule__EventDeclaration__DirectionAssignment_0 ) )
            // InternalLogicBaseLanguage.g:333:2: ( rule__EventDeclaration__DirectionAssignment_0 )
            {
             before(grammarAccess.getEventDeclarationAccess().getDirectionAssignment_0()); 
            // InternalLogicBaseLanguage.g:334:2: ( rule__EventDeclaration__DirectionAssignment_0 )
            // InternalLogicBaseLanguage.g:334:3: rule__EventDeclaration__DirectionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__DirectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEventDeclarationAccess().getDirectionAssignment_0()); 

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
    // $ANTLR end "rule__EventDeclaration__Group__0__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__1"
    // InternalLogicBaseLanguage.g:342:1: rule__EventDeclaration__Group__1 : rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 ;
    public final void rule__EventDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:346:1: ( rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 )
            // InternalLogicBaseLanguage.g:347:2: rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__EventDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group__2();

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
    // $ANTLR end "rule__EventDeclaration__Group__1"


    // $ANTLR start "rule__EventDeclaration__Group__1__Impl"
    // InternalLogicBaseLanguage.g:354:1: rule__EventDeclaration__Group__1__Impl : ( ( rule__EventDeclaration__ExtraValueTypeAssignment_1 )? ) ;
    public final void rule__EventDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:358:1: ( ( ( rule__EventDeclaration__ExtraValueTypeAssignment_1 )? ) )
            // InternalLogicBaseLanguage.g:359:1: ( ( rule__EventDeclaration__ExtraValueTypeAssignment_1 )? )
            {
            // InternalLogicBaseLanguage.g:359:1: ( ( rule__EventDeclaration__ExtraValueTypeAssignment_1 )? )
            // InternalLogicBaseLanguage.g:360:2: ( rule__EventDeclaration__ExtraValueTypeAssignment_1 )?
            {
             before(grammarAccess.getEventDeclarationAccess().getExtraValueTypeAssignment_1()); 
            // InternalLogicBaseLanguage.g:361:2: ( rule__EventDeclaration__ExtraValueTypeAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLogicBaseLanguage.g:361:3: rule__EventDeclaration__ExtraValueTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventDeclaration__ExtraValueTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventDeclarationAccess().getExtraValueTypeAssignment_1()); 

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
    // $ANTLR end "rule__EventDeclaration__Group__1__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__2"
    // InternalLogicBaseLanguage.g:369:1: rule__EventDeclaration__Group__2 : rule__EventDeclaration__Group__2__Impl ;
    public final void rule__EventDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:373:1: ( rule__EventDeclaration__Group__2__Impl )
            // InternalLogicBaseLanguage.g:374:2: rule__EventDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__EventDeclaration__Group__2"


    // $ANTLR start "rule__EventDeclaration__Group__2__Impl"
    // InternalLogicBaseLanguage.g:380:1: rule__EventDeclaration__Group__2__Impl : ( ( rule__EventDeclaration__NameAssignment_2 ) ) ;
    public final void rule__EventDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:384:1: ( ( ( rule__EventDeclaration__NameAssignment_2 ) ) )
            // InternalLogicBaseLanguage.g:385:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            {
            // InternalLogicBaseLanguage.g:385:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            // InternalLogicBaseLanguage.g:386:2: ( rule__EventDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getEventDeclarationAccess().getNameAssignment_2()); 
            // InternalLogicBaseLanguage.g:387:2: ( rule__EventDeclaration__NameAssignment_2 )
            // InternalLogicBaseLanguage.g:387:3: rule__EventDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EventDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventDeclarationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__EventDeclaration__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalLogicBaseLanguage.g:396:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:400:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalLogicBaseLanguage.g:401:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalLogicBaseLanguage.g:408:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:412:1: ( ( RULE_ID ) )
            // InternalLogicBaseLanguage.g:413:1: ( RULE_ID )
            {
            // InternalLogicBaseLanguage.g:413:1: ( RULE_ID )
            // InternalLogicBaseLanguage.g:414:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalLogicBaseLanguage.g:423:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:427:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalLogicBaseLanguage.g:428:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalLogicBaseLanguage.g:434:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:438:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalLogicBaseLanguage.g:439:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalLogicBaseLanguage.g:439:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalLogicBaseLanguage.g:440:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalLogicBaseLanguage.g:441:2: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLogicBaseLanguage.g:441:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalLogicBaseLanguage.g:450:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:454:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalLogicBaseLanguage.g:455:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalLogicBaseLanguage.g:462:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:466:1: ( ( '.' ) )
            // InternalLogicBaseLanguage.g:467:1: ( '.' )
            {
            // InternalLogicBaseLanguage.g:467:1: ( '.' )
            // InternalLogicBaseLanguage.g:468:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalLogicBaseLanguage.g:477:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:481:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalLogicBaseLanguage.g:482:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalLogicBaseLanguage.g:488:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:492:1: ( ( RULE_ID ) )
            // InternalLogicBaseLanguage.g:493:1: ( RULE_ID )
            {
            // InternalLogicBaseLanguage.g:493:1: ( RULE_ID )
            // InternalLogicBaseLanguage.g:494:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // InternalLogicBaseLanguage.g:504:1: rule__Interface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:508:1: ( ( RULE_ID ) )
            // InternalLogicBaseLanguage.g:509:2: ( RULE_ID )
            {
            // InternalLogicBaseLanguage.g:509:2: ( RULE_ID )
            // InternalLogicBaseLanguage.g:510:3: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Interface__NameAssignment_1"


    // $ANTLR start "rule__Interface__EventsAssignment_3"
    // InternalLogicBaseLanguage.g:519:1: rule__Interface__EventsAssignment_3 : ( ruleEventDeclaration ) ;
    public final void rule__Interface__EventsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:523:1: ( ( ruleEventDeclaration ) )
            // InternalLogicBaseLanguage.g:524:2: ( ruleEventDeclaration )
            {
            // InternalLogicBaseLanguage.g:524:2: ( ruleEventDeclaration )
            // InternalLogicBaseLanguage.g:525:3: ruleEventDeclaration
            {
             before(grammarAccess.getInterfaceAccess().getEventsEventDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEventDeclaration();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getEventsEventDeclarationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Interface__EventsAssignment_3"


    // $ANTLR start "rule__EventDeclaration__DirectionAssignment_0"
    // InternalLogicBaseLanguage.g:534:1: rule__EventDeclaration__DirectionAssignment_0 : ( ruleEventDirection ) ;
    public final void rule__EventDeclaration__DirectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:538:1: ( ( ruleEventDirection ) )
            // InternalLogicBaseLanguage.g:539:2: ( ruleEventDirection )
            {
            // InternalLogicBaseLanguage.g:539:2: ( ruleEventDirection )
            // InternalLogicBaseLanguage.g:540:3: ruleEventDirection
            {
             before(grammarAccess.getEventDeclarationAccess().getDirectionEventDirectionEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEventDirection();

            state._fsp--;

             after(grammarAccess.getEventDeclarationAccess().getDirectionEventDirectionEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__EventDeclaration__DirectionAssignment_0"


    // $ANTLR start "rule__EventDeclaration__ExtraValueTypeAssignment_1"
    // InternalLogicBaseLanguage.g:549:1: rule__EventDeclaration__ExtraValueTypeAssignment_1 : ( ruleValueType ) ;
    public final void rule__EventDeclaration__ExtraValueTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:553:1: ( ( ruleValueType ) )
            // InternalLogicBaseLanguage.g:554:2: ( ruleValueType )
            {
            // InternalLogicBaseLanguage.g:554:2: ( ruleValueType )
            // InternalLogicBaseLanguage.g:555:3: ruleValueType
            {
             before(grammarAccess.getEventDeclarationAccess().getExtraValueTypeValueTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getEventDeclarationAccess().getExtraValueTypeValueTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__EventDeclaration__ExtraValueTypeAssignment_1"


    // $ANTLR start "rule__EventDeclaration__NameAssignment_2"
    // InternalLogicBaseLanguage.g:564:1: rule__EventDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EventDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicBaseLanguage.g:568:1: ( ( RULE_ID ) )
            // InternalLogicBaseLanguage.g:569:2: ( RULE_ID )
            {
            // InternalLogicBaseLanguage.g:569:2: ( RULE_ID )
            // InternalLogicBaseLanguage.g:570:3: RULE_ID
            {
             before(grammarAccess.getEventDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__EventDeclaration__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000013000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});

}