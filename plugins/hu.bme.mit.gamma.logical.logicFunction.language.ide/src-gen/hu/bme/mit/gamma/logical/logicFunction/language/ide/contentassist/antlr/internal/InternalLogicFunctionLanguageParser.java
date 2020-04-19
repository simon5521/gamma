package hu.bme.mit.gamma.logical.logicFunction.language.ide.contentassist.antlr.internal;

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
import hu.bme.mit.gamma.logical.logicFunction.language.services.LogicFunctionLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLogicFunctionLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'in'", "'out'", "'function'", "'{'", "'}'", "'rule'", "':='", "'<-'", "'and'", "'('", "')'", "','", "'or'", "'xor'", "'not'", "'interface'", "'income'", "'.'"
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

    	public void setGrammarAccess(LogicFunctionLanguageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleLogicFunctionDiagram"
    // InternalLogicFunctionLanguage.g:53:1: entryRuleLogicFunctionDiagram : ruleLogicFunctionDiagram EOF ;
    public final void entryRuleLogicFunctionDiagram() throws RecognitionException {
        try {
            // InternalLogicFunctionLanguage.g:54:1: ( ruleLogicFunctionDiagram EOF )
            // InternalLogicFunctionLanguage.g:55:1: ruleLogicFunctionDiagram EOF
            {
             before(grammarAccess.getLogicFunctionDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicFunctionDiagram();

            state._fsp--;

             after(grammarAccess.getLogicFunctionDiagramRule()); 
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
    // $ANTLR end "entryRuleLogicFunctionDiagram"


    // $ANTLR start "ruleLogicFunctionDiagram"
    // InternalLogicFunctionLanguage.g:62:1: ruleLogicFunctionDiagram : ( ( rule__LogicFunctionDiagram__Group__0 ) ) ;
    public final void ruleLogicFunctionDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:66:2: ( ( ( rule__LogicFunctionDiagram__Group__0 ) ) )
            // InternalLogicFunctionLanguage.g:67:2: ( ( rule__LogicFunctionDiagram__Group__0 ) )
            {
            // InternalLogicFunctionLanguage.g:67:2: ( ( rule__LogicFunctionDiagram__Group__0 ) )
            // InternalLogicFunctionLanguage.g:68:3: ( rule__LogicFunctionDiagram__Group__0 )
            {
             before(grammarAccess.getLogicFunctionDiagramAccess().getGroup()); 
            // InternalLogicFunctionLanguage.g:69:3: ( rule__LogicFunctionDiagram__Group__0 )
            // InternalLogicFunctionLanguage.g:69:4: rule__LogicFunctionDiagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicFunctionDiagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicFunctionDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicFunctionDiagram"


    // $ANTLR start "entryRuleRuleDeclaration"
    // InternalLogicFunctionLanguage.g:78:1: entryRuleRuleDeclaration : ruleRuleDeclaration EOF ;
    public final void entryRuleRuleDeclaration() throws RecognitionException {
        try {
            // InternalLogicFunctionLanguage.g:79:1: ( ruleRuleDeclaration EOF )
            // InternalLogicFunctionLanguage.g:80:1: ruleRuleDeclaration EOF
            {
             before(grammarAccess.getRuleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleDeclaration();

            state._fsp--;

             after(grammarAccess.getRuleDeclarationRule()); 
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
    // $ANTLR end "entryRuleRuleDeclaration"


    // $ANTLR start "ruleRuleDeclaration"
    // InternalLogicFunctionLanguage.g:87:1: ruleRuleDeclaration : ( ( rule__RuleDeclaration__Group__0 ) ) ;
    public final void ruleRuleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:91:2: ( ( ( rule__RuleDeclaration__Group__0 ) ) )
            // InternalLogicFunctionLanguage.g:92:2: ( ( rule__RuleDeclaration__Group__0 ) )
            {
            // InternalLogicFunctionLanguage.g:92:2: ( ( rule__RuleDeclaration__Group__0 ) )
            // InternalLogicFunctionLanguage.g:93:3: ( rule__RuleDeclaration__Group__0 )
            {
             before(grammarAccess.getRuleDeclarationAccess().getGroup()); 
            // InternalLogicFunctionLanguage.g:94:3: ( rule__RuleDeclaration__Group__0 )
            // InternalLogicFunctionLanguage.g:94:4: rule__RuleDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleDeclaration"


    // $ANTLR start "entryRuleAND"
    // InternalLogicFunctionLanguage.g:103:1: entryRuleAND : ruleAND EOF ;
    public final void entryRuleAND() throws RecognitionException {
        try {
            // InternalLogicFunctionLanguage.g:104:1: ( ruleAND EOF )
            // InternalLogicFunctionLanguage.g:105:1: ruleAND EOF
            {
             before(grammarAccess.getANDRule()); 
            pushFollow(FOLLOW_1);
            ruleAND();

            state._fsp--;

             after(grammarAccess.getANDRule()); 
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
    // $ANTLR end "entryRuleAND"


    // $ANTLR start "ruleAND"
    // InternalLogicFunctionLanguage.g:112:1: ruleAND : ( ( rule__AND__Group__0 ) ) ;
    public final void ruleAND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:116:2: ( ( ( rule__AND__Group__0 ) ) )
            // InternalLogicFunctionLanguage.g:117:2: ( ( rule__AND__Group__0 ) )
            {
            // InternalLogicFunctionLanguage.g:117:2: ( ( rule__AND__Group__0 ) )
            // InternalLogicFunctionLanguage.g:118:3: ( rule__AND__Group__0 )
            {
             before(grammarAccess.getANDAccess().getGroup()); 
            // InternalLogicFunctionLanguage.g:119:3: ( rule__AND__Group__0 )
            // InternalLogicFunctionLanguage.g:119:4: rule__AND__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AND__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getANDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAND"


    // $ANTLR start "entryRuleOR"
    // InternalLogicFunctionLanguage.g:128:1: entryRuleOR : ruleOR EOF ;
    public final void entryRuleOR() throws RecognitionException {
        try {
            // InternalLogicFunctionLanguage.g:129:1: ( ruleOR EOF )
            // InternalLogicFunctionLanguage.g:130:1: ruleOR EOF
            {
             before(grammarAccess.getORRule()); 
            pushFollow(FOLLOW_1);
            ruleOR();

            state._fsp--;

             after(grammarAccess.getORRule()); 
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
    // $ANTLR end "entryRuleOR"


    // $ANTLR start "ruleOR"
    // InternalLogicFunctionLanguage.g:137:1: ruleOR : ( ( rule__OR__Group__0 ) ) ;
    public final void ruleOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:141:2: ( ( ( rule__OR__Group__0 ) ) )
            // InternalLogicFunctionLanguage.g:142:2: ( ( rule__OR__Group__0 ) )
            {
            // InternalLogicFunctionLanguage.g:142:2: ( ( rule__OR__Group__0 ) )
            // InternalLogicFunctionLanguage.g:143:3: ( rule__OR__Group__0 )
            {
             before(grammarAccess.getORAccess().getGroup()); 
            // InternalLogicFunctionLanguage.g:144:3: ( rule__OR__Group__0 )
            // InternalLogicFunctionLanguage.g:144:4: rule__OR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getORAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOR"


    // $ANTLR start "entryRuleXOR"
    // InternalLogicFunctionLanguage.g:153:1: entryRuleXOR : ruleXOR EOF ;
    public final void entryRuleXOR() throws RecognitionException {
        try {
            // InternalLogicFunctionLanguage.g:154:1: ( ruleXOR EOF )
            // InternalLogicFunctionLanguage.g:155:1: ruleXOR EOF
            {
             before(grammarAccess.getXORRule()); 
            pushFollow(FOLLOW_1);
            ruleXOR();

            state._fsp--;

             after(grammarAccess.getXORRule()); 
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
    // $ANTLR end "entryRuleXOR"


    // $ANTLR start "ruleXOR"
    // InternalLogicFunctionLanguage.g:162:1: ruleXOR : ( ( rule__XOR__Group__0 ) ) ;
    public final void ruleXOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:166:2: ( ( ( rule__XOR__Group__0 ) ) )
            // InternalLogicFunctionLanguage.g:167:2: ( ( rule__XOR__Group__0 ) )
            {
            // InternalLogicFunctionLanguage.g:167:2: ( ( rule__XOR__Group__0 ) )
            // InternalLogicFunctionLanguage.g:168:3: ( rule__XOR__Group__0 )
            {
             before(grammarAccess.getXORAccess().getGroup()); 
            // InternalLogicFunctionLanguage.g:169:3: ( rule__XOR__Group__0 )
            // InternalLogicFunctionLanguage.g:169:4: rule__XOR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XOR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXORAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXOR"


    // $ANTLR start "entryRuleNOT"
    // InternalLogicFunctionLanguage.g:178:1: entryRuleNOT : ruleNOT EOF ;
    public final void entryRuleNOT() throws RecognitionException {
        try {
            // InternalLogicFunctionLanguage.g:179:1: ( ruleNOT EOF )
            // InternalLogicFunctionLanguage.g:180:1: ruleNOT EOF
            {
             before(grammarAccess.getNOTRule()); 
            pushFollow(FOLLOW_1);
            ruleNOT();

            state._fsp--;

             after(grammarAccess.getNOTRule()); 
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
    // $ANTLR end "entryRuleNOT"


    // $ANTLR start "ruleNOT"
    // InternalLogicFunctionLanguage.g:187:1: ruleNOT : ( ( rule__NOT__Group__0 ) ) ;
    public final void ruleNOT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:191:2: ( ( ( rule__NOT__Group__0 ) ) )
            // InternalLogicFunctionLanguage.g:192:2: ( ( rule__NOT__Group__0 ) )
            {
            // InternalLogicFunctionLanguage.g:192:2: ( ( rule__NOT__Group__0 ) )
            // InternalLogicFunctionLanguage.g:193:3: ( rule__NOT__Group__0 )
            {
             before(grammarAccess.getNOTAccess().getGroup()); 
            // InternalLogicFunctionLanguage.g:194:3: ( rule__NOT__Group__0 )
            // InternalLogicFunctionLanguage.g:194:4: rule__NOT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NOT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNOTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNOT"


    // $ANTLR start "entryRulePredicateListen"
    // InternalLogicFunctionLanguage.g:203:1: entryRulePredicateListen : rulePredicateListen EOF ;
    public final void entryRulePredicateListen() throws RecognitionException {
        try {
            // InternalLogicFunctionLanguage.g:204:1: ( rulePredicateListen EOF )
            // InternalLogicFunctionLanguage.g:205:1: rulePredicateListen EOF
            {
             before(grammarAccess.getPredicateListenRule()); 
            pushFollow(FOLLOW_1);
            rulePredicateListen();

            state._fsp--;

             after(grammarAccess.getPredicateListenRule()); 
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
    // $ANTLR end "entryRulePredicateListen"


    // $ANTLR start "rulePredicateListen"
    // InternalLogicFunctionLanguage.g:212:1: rulePredicateListen : ( ( rule__PredicateListen__ListensAssignment ) ) ;
    public final void rulePredicateListen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:216:2: ( ( ( rule__PredicateListen__ListensAssignment ) ) )
            // InternalLogicFunctionLanguage.g:217:2: ( ( rule__PredicateListen__ListensAssignment ) )
            {
            // InternalLogicFunctionLanguage.g:217:2: ( ( rule__PredicateListen__ListensAssignment ) )
            // InternalLogicFunctionLanguage.g:218:3: ( rule__PredicateListen__ListensAssignment )
            {
             before(grammarAccess.getPredicateListenAccess().getListensAssignment()); 
            // InternalLogicFunctionLanguage.g:219:3: ( rule__PredicateListen__ListensAssignment )
            // InternalLogicFunctionLanguage.g:219:4: rule__PredicateListen__ListensAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PredicateListen__ListensAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPredicateListenAccess().getListensAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicateListen"


    // $ANTLR start "entryRuleRuleListen"
    // InternalLogicFunctionLanguage.g:228:1: entryRuleRuleListen : ruleRuleListen EOF ;
    public final void entryRuleRuleListen() throws RecognitionException {
        try {
            // InternalLogicFunctionLanguage.g:229:1: ( ruleRuleListen EOF )
            // InternalLogicFunctionLanguage.g:230:1: ruleRuleListen EOF
            {
             before(grammarAccess.getRuleListenRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleListen();

            state._fsp--;

             after(grammarAccess.getRuleListenRule()); 
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
    // $ANTLR end "entryRuleRuleListen"


    // $ANTLR start "ruleRuleListen"
    // InternalLogicFunctionLanguage.g:237:1: ruleRuleListen : ( ( rule__RuleListen__ListensAssignment ) ) ;
    public final void ruleRuleListen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:241:2: ( ( ( rule__RuleListen__ListensAssignment ) ) )
            // InternalLogicFunctionLanguage.g:242:2: ( ( rule__RuleListen__ListensAssignment ) )
            {
            // InternalLogicFunctionLanguage.g:242:2: ( ( rule__RuleListen__ListensAssignment ) )
            // InternalLogicFunctionLanguage.g:243:3: ( rule__RuleListen__ListensAssignment )
            {
             before(grammarAccess.getRuleListenAccess().getListensAssignment()); 
            // InternalLogicFunctionLanguage.g:244:3: ( rule__RuleListen__ListensAssignment )
            // InternalLogicFunctionLanguage.g:244:4: rule__RuleListen__ListensAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RuleListen__ListensAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRuleListenAccess().getListensAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleListen"


    // $ANTLR start "entryRuleInterface"
    // InternalLogicFunctionLanguage.g:253:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalLogicFunctionLanguage.g:254:1: ( ruleInterface EOF )
            // InternalLogicFunctionLanguage.g:255:1: ruleInterface EOF
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
    // InternalLogicFunctionLanguage.g:262:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:266:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalLogicFunctionLanguage.g:267:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalLogicFunctionLanguage.g:267:2: ( ( rule__Interface__Group__0 ) )
            // InternalLogicFunctionLanguage.g:268:3: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalLogicFunctionLanguage.g:269:3: ( rule__Interface__Group__0 )
            // InternalLogicFunctionLanguage.g:269:4: rule__Interface__Group__0
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
    // InternalLogicFunctionLanguage.g:278:1: entryRuleEventDeclaration : ruleEventDeclaration EOF ;
    public final void entryRuleEventDeclaration() throws RecognitionException {
        try {
            // InternalLogicFunctionLanguage.g:279:1: ( ruleEventDeclaration EOF )
            // InternalLogicFunctionLanguage.g:280:1: ruleEventDeclaration EOF
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
    // InternalLogicFunctionLanguage.g:287:1: ruleEventDeclaration : ( ( rule__EventDeclaration__Group__0 ) ) ;
    public final void ruleEventDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:291:2: ( ( ( rule__EventDeclaration__Group__0 ) ) )
            // InternalLogicFunctionLanguage.g:292:2: ( ( rule__EventDeclaration__Group__0 ) )
            {
            // InternalLogicFunctionLanguage.g:292:2: ( ( rule__EventDeclaration__Group__0 ) )
            // InternalLogicFunctionLanguage.g:293:3: ( rule__EventDeclaration__Group__0 )
            {
             before(grammarAccess.getEventDeclarationAccess().getGroup()); 
            // InternalLogicFunctionLanguage.g:294:3: ( rule__EventDeclaration__Group__0 )
            // InternalLogicFunctionLanguage.g:294:4: rule__EventDeclaration__Group__0
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


    // $ANTLR start "entryRulePredicate"
    // InternalLogicFunctionLanguage.g:303:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalLogicFunctionLanguage.g:304:1: ( rulePredicate EOF )
            // InternalLogicFunctionLanguage.g:305:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalLogicFunctionLanguage.g:312:1: rulePredicate : ( ( rule__Predicate__Group__0 ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:316:2: ( ( ( rule__Predicate__Group__0 ) ) )
            // InternalLogicFunctionLanguage.g:317:2: ( ( rule__Predicate__Group__0 ) )
            {
            // InternalLogicFunctionLanguage.g:317:2: ( ( rule__Predicate__Group__0 ) )
            // InternalLogicFunctionLanguage.g:318:3: ( rule__Predicate__Group__0 )
            {
             before(grammarAccess.getPredicateAccess().getGroup()); 
            // InternalLogicFunctionLanguage.g:319:3: ( rule__Predicate__Group__0 )
            // InternalLogicFunctionLanguage.g:319:4: rule__Predicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLogicFunctionLanguage.g:328:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalLogicFunctionLanguage.g:329:1: ( ruleQualifiedName EOF )
            // InternalLogicFunctionLanguage.g:330:1: ruleQualifiedName EOF
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
    // InternalLogicFunctionLanguage.g:337:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:341:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalLogicFunctionLanguage.g:342:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalLogicFunctionLanguage.g:342:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalLogicFunctionLanguage.g:343:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalLogicFunctionLanguage.g:344:3: ( rule__QualifiedName__Group__0 )
            // InternalLogicFunctionLanguage.g:344:4: rule__QualifiedName__Group__0
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
    // InternalLogicFunctionLanguage.g:353:1: ruleEventDirection : ( ( rule__EventDirection__Alternatives ) ) ;
    public final void ruleEventDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:357:1: ( ( ( rule__EventDirection__Alternatives ) ) )
            // InternalLogicFunctionLanguage.g:358:2: ( ( rule__EventDirection__Alternatives ) )
            {
            // InternalLogicFunctionLanguage.g:358:2: ( ( rule__EventDirection__Alternatives ) )
            // InternalLogicFunctionLanguage.g:359:3: ( rule__EventDirection__Alternatives )
            {
             before(grammarAccess.getEventDirectionAccess().getAlternatives()); 
            // InternalLogicFunctionLanguage.g:360:3: ( rule__EventDirection__Alternatives )
            // InternalLogicFunctionLanguage.g:360:4: rule__EventDirection__Alternatives
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
    // InternalLogicFunctionLanguage.g:369:1: ruleValueType : ( ( 'int' ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:373:1: ( ( ( 'int' ) ) )
            // InternalLogicFunctionLanguage.g:374:2: ( ( 'int' ) )
            {
            // InternalLogicFunctionLanguage.g:374:2: ( ( 'int' ) )
            // InternalLogicFunctionLanguage.g:375:3: ( 'int' )
            {
             before(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration()); 
            // InternalLogicFunctionLanguage.g:376:3: ( 'int' )
            // InternalLogicFunctionLanguage.g:376:4: 'int'
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


    // $ANTLR start "rule__LogicFunctionDiagram__Alternatives_3"
    // InternalLogicFunctionLanguage.g:384:1: rule__LogicFunctionDiagram__Alternatives_3 : ( ( ( rule__LogicFunctionDiagram__RuleAssignment_3_0 ) ) | ( ( rule__LogicFunctionDiagram__InterfacesAssignment_3_1 ) ) );
    public final void rule__LogicFunctionDiagram__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:388:1: ( ( ( rule__LogicFunctionDiagram__RuleAssignment_3_0 ) ) | ( ( rule__LogicFunctionDiagram__InterfacesAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:389:2: ( ( rule__LogicFunctionDiagram__RuleAssignment_3_0 ) )
                    {
                    // InternalLogicFunctionLanguage.g:389:2: ( ( rule__LogicFunctionDiagram__RuleAssignment_3_0 ) )
                    // InternalLogicFunctionLanguage.g:390:3: ( rule__LogicFunctionDiagram__RuleAssignment_3_0 )
                    {
                     before(grammarAccess.getLogicFunctionDiagramAccess().getRuleAssignment_3_0()); 
                    // InternalLogicFunctionLanguage.g:391:3: ( rule__LogicFunctionDiagram__RuleAssignment_3_0 )
                    // InternalLogicFunctionLanguage.g:391:4: rule__LogicFunctionDiagram__RuleAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicFunctionDiagram__RuleAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicFunctionDiagramAccess().getRuleAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:395:2: ( ( rule__LogicFunctionDiagram__InterfacesAssignment_3_1 ) )
                    {
                    // InternalLogicFunctionLanguage.g:395:2: ( ( rule__LogicFunctionDiagram__InterfacesAssignment_3_1 ) )
                    // InternalLogicFunctionLanguage.g:396:3: ( rule__LogicFunctionDiagram__InterfacesAssignment_3_1 )
                    {
                     before(grammarAccess.getLogicFunctionDiagramAccess().getInterfacesAssignment_3_1()); 
                    // InternalLogicFunctionLanguage.g:397:3: ( rule__LogicFunctionDiagram__InterfacesAssignment_3_1 )
                    // InternalLogicFunctionLanguage.g:397:4: rule__LogicFunctionDiagram__InterfacesAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicFunctionDiagram__InterfacesAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicFunctionDiagramAccess().getInterfacesAssignment_3_1()); 

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
    // $ANTLR end "rule__LogicFunctionDiagram__Alternatives_3"


    // $ANTLR start "rule__RuleDeclaration__Alternatives_4"
    // InternalLogicFunctionLanguage.g:405:1: rule__RuleDeclaration__Alternatives_4 : ( ( ( rule__RuleDeclaration__ExpressionAssignment_4_0 ) ) | ( ( rule__RuleDeclaration__ExpressionAssignment_4_1 ) ) | ( ( rule__RuleDeclaration__ExpressionAssignment_4_2 ) ) | ( ( rule__RuleDeclaration__ExpressionAssignment_4_3 ) ) | ( ( rule__RuleDeclaration__ExpressionAssignment_4_4 ) ) | ( ( rule__RuleDeclaration__ExpressionAssignment_4_5 ) ) );
    public final void rule__RuleDeclaration__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:409:1: ( ( ( rule__RuleDeclaration__ExpressionAssignment_4_0 ) ) | ( ( rule__RuleDeclaration__ExpressionAssignment_4_1 ) ) | ( ( rule__RuleDeclaration__ExpressionAssignment_4_2 ) ) | ( ( rule__RuleDeclaration__ExpressionAssignment_4_3 ) ) | ( ( rule__RuleDeclaration__ExpressionAssignment_4_4 ) ) | ( ( rule__RuleDeclaration__ExpressionAssignment_4_5 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            case 28:
                {
                alt2=5;
                }
                break;
            case RULE_ID:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:410:2: ( ( rule__RuleDeclaration__ExpressionAssignment_4_0 ) )
                    {
                    // InternalLogicFunctionLanguage.g:410:2: ( ( rule__RuleDeclaration__ExpressionAssignment_4_0 ) )
                    // InternalLogicFunctionLanguage.g:411:3: ( rule__RuleDeclaration__ExpressionAssignment_4_0 )
                    {
                     before(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_0()); 
                    // InternalLogicFunctionLanguage.g:412:3: ( rule__RuleDeclaration__ExpressionAssignment_4_0 )
                    // InternalLogicFunctionLanguage.g:412:4: rule__RuleDeclaration__ExpressionAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleDeclaration__ExpressionAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:416:2: ( ( rule__RuleDeclaration__ExpressionAssignment_4_1 ) )
                    {
                    // InternalLogicFunctionLanguage.g:416:2: ( ( rule__RuleDeclaration__ExpressionAssignment_4_1 ) )
                    // InternalLogicFunctionLanguage.g:417:3: ( rule__RuleDeclaration__ExpressionAssignment_4_1 )
                    {
                     before(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_1()); 
                    // InternalLogicFunctionLanguage.g:418:3: ( rule__RuleDeclaration__ExpressionAssignment_4_1 )
                    // InternalLogicFunctionLanguage.g:418:4: rule__RuleDeclaration__ExpressionAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleDeclaration__ExpressionAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLogicFunctionLanguage.g:422:2: ( ( rule__RuleDeclaration__ExpressionAssignment_4_2 ) )
                    {
                    // InternalLogicFunctionLanguage.g:422:2: ( ( rule__RuleDeclaration__ExpressionAssignment_4_2 ) )
                    // InternalLogicFunctionLanguage.g:423:3: ( rule__RuleDeclaration__ExpressionAssignment_4_2 )
                    {
                     before(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_2()); 
                    // InternalLogicFunctionLanguage.g:424:3: ( rule__RuleDeclaration__ExpressionAssignment_4_2 )
                    // InternalLogicFunctionLanguage.g:424:4: rule__RuleDeclaration__ExpressionAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleDeclaration__ExpressionAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLogicFunctionLanguage.g:428:2: ( ( rule__RuleDeclaration__ExpressionAssignment_4_3 ) )
                    {
                    // InternalLogicFunctionLanguage.g:428:2: ( ( rule__RuleDeclaration__ExpressionAssignment_4_3 ) )
                    // InternalLogicFunctionLanguage.g:429:3: ( rule__RuleDeclaration__ExpressionAssignment_4_3 )
                    {
                     before(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_3()); 
                    // InternalLogicFunctionLanguage.g:430:3: ( rule__RuleDeclaration__ExpressionAssignment_4_3 )
                    // InternalLogicFunctionLanguage.g:430:4: rule__RuleDeclaration__ExpressionAssignment_4_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleDeclaration__ExpressionAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLogicFunctionLanguage.g:434:2: ( ( rule__RuleDeclaration__ExpressionAssignment_4_4 ) )
                    {
                    // InternalLogicFunctionLanguage.g:434:2: ( ( rule__RuleDeclaration__ExpressionAssignment_4_4 ) )
                    // InternalLogicFunctionLanguage.g:435:3: ( rule__RuleDeclaration__ExpressionAssignment_4_4 )
                    {
                     before(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_4()); 
                    // InternalLogicFunctionLanguage.g:436:3: ( rule__RuleDeclaration__ExpressionAssignment_4_4 )
                    // InternalLogicFunctionLanguage.g:436:4: rule__RuleDeclaration__ExpressionAssignment_4_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleDeclaration__ExpressionAssignment_4_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLogicFunctionLanguage.g:440:2: ( ( rule__RuleDeclaration__ExpressionAssignment_4_5 ) )
                    {
                    // InternalLogicFunctionLanguage.g:440:2: ( ( rule__RuleDeclaration__ExpressionAssignment_4_5 ) )
                    // InternalLogicFunctionLanguage.g:441:3: ( rule__RuleDeclaration__ExpressionAssignment_4_5 )
                    {
                     before(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_5()); 
                    // InternalLogicFunctionLanguage.g:442:3: ( rule__RuleDeclaration__ExpressionAssignment_4_5 )
                    // InternalLogicFunctionLanguage.g:442:4: rule__RuleDeclaration__ExpressionAssignment_4_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleDeclaration__ExpressionAssignment_4_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_5()); 

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
    // $ANTLR end "rule__RuleDeclaration__Alternatives_4"


    // $ANTLR start "rule__AND__Alternatives_2"
    // InternalLogicFunctionLanguage.g:450:1: rule__AND__Alternatives_2 : ( ( ( rule__AND__ArgumentsAssignment_2_0 ) ) | ( ( rule__AND__ArgumentsAssignment_2_1 ) ) | ( ( rule__AND__ArgumentsAssignment_2_2 ) ) | ( ( rule__AND__ArgumentsAssignment_2_3 ) ) | ( ( rule__AND__ArgumentsAssignment_2_4 ) ) | ( ( rule__AND__ArgumentsAssignment_2_5 ) ) );
    public final void rule__AND__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:454:1: ( ( ( rule__AND__ArgumentsAssignment_2_0 ) ) | ( ( rule__AND__ArgumentsAssignment_2_1 ) ) | ( ( rule__AND__ArgumentsAssignment_2_2 ) ) | ( ( rule__AND__ArgumentsAssignment_2_3 ) ) | ( ( rule__AND__ArgumentsAssignment_2_4 ) ) | ( ( rule__AND__ArgumentsAssignment_2_5 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 26:
                {
                alt3=4;
                }
                break;
            case 28:
                {
                alt3=5;
                }
                break;
            case RULE_ID:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:455:2: ( ( rule__AND__ArgumentsAssignment_2_0 ) )
                    {
                    // InternalLogicFunctionLanguage.g:455:2: ( ( rule__AND__ArgumentsAssignment_2_0 ) )
                    // InternalLogicFunctionLanguage.g:456:3: ( rule__AND__ArgumentsAssignment_2_0 )
                    {
                     before(grammarAccess.getANDAccess().getArgumentsAssignment_2_0()); 
                    // InternalLogicFunctionLanguage.g:457:3: ( rule__AND__ArgumentsAssignment_2_0 )
                    // InternalLogicFunctionLanguage.g:457:4: rule__AND__ArgumentsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AND__ArgumentsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getANDAccess().getArgumentsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:461:2: ( ( rule__AND__ArgumentsAssignment_2_1 ) )
                    {
                    // InternalLogicFunctionLanguage.g:461:2: ( ( rule__AND__ArgumentsAssignment_2_1 ) )
                    // InternalLogicFunctionLanguage.g:462:3: ( rule__AND__ArgumentsAssignment_2_1 )
                    {
                     before(grammarAccess.getANDAccess().getArgumentsAssignment_2_1()); 
                    // InternalLogicFunctionLanguage.g:463:3: ( rule__AND__ArgumentsAssignment_2_1 )
                    // InternalLogicFunctionLanguage.g:463:4: rule__AND__ArgumentsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AND__ArgumentsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getANDAccess().getArgumentsAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLogicFunctionLanguage.g:467:2: ( ( rule__AND__ArgumentsAssignment_2_2 ) )
                    {
                    // InternalLogicFunctionLanguage.g:467:2: ( ( rule__AND__ArgumentsAssignment_2_2 ) )
                    // InternalLogicFunctionLanguage.g:468:3: ( rule__AND__ArgumentsAssignment_2_2 )
                    {
                     before(grammarAccess.getANDAccess().getArgumentsAssignment_2_2()); 
                    // InternalLogicFunctionLanguage.g:469:3: ( rule__AND__ArgumentsAssignment_2_2 )
                    // InternalLogicFunctionLanguage.g:469:4: rule__AND__ArgumentsAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AND__ArgumentsAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getANDAccess().getArgumentsAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLogicFunctionLanguage.g:473:2: ( ( rule__AND__ArgumentsAssignment_2_3 ) )
                    {
                    // InternalLogicFunctionLanguage.g:473:2: ( ( rule__AND__ArgumentsAssignment_2_3 ) )
                    // InternalLogicFunctionLanguage.g:474:3: ( rule__AND__ArgumentsAssignment_2_3 )
                    {
                     before(grammarAccess.getANDAccess().getArgumentsAssignment_2_3()); 
                    // InternalLogicFunctionLanguage.g:475:3: ( rule__AND__ArgumentsAssignment_2_3 )
                    // InternalLogicFunctionLanguage.g:475:4: rule__AND__ArgumentsAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__AND__ArgumentsAssignment_2_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getANDAccess().getArgumentsAssignment_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLogicFunctionLanguage.g:479:2: ( ( rule__AND__ArgumentsAssignment_2_4 ) )
                    {
                    // InternalLogicFunctionLanguage.g:479:2: ( ( rule__AND__ArgumentsAssignment_2_4 ) )
                    // InternalLogicFunctionLanguage.g:480:3: ( rule__AND__ArgumentsAssignment_2_4 )
                    {
                     before(grammarAccess.getANDAccess().getArgumentsAssignment_2_4()); 
                    // InternalLogicFunctionLanguage.g:481:3: ( rule__AND__ArgumentsAssignment_2_4 )
                    // InternalLogicFunctionLanguage.g:481:4: rule__AND__ArgumentsAssignment_2_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__AND__ArgumentsAssignment_2_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getANDAccess().getArgumentsAssignment_2_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLogicFunctionLanguage.g:485:2: ( ( rule__AND__ArgumentsAssignment_2_5 ) )
                    {
                    // InternalLogicFunctionLanguage.g:485:2: ( ( rule__AND__ArgumentsAssignment_2_5 ) )
                    // InternalLogicFunctionLanguage.g:486:3: ( rule__AND__ArgumentsAssignment_2_5 )
                    {
                     before(grammarAccess.getANDAccess().getArgumentsAssignment_2_5()); 
                    // InternalLogicFunctionLanguage.g:487:3: ( rule__AND__ArgumentsAssignment_2_5 )
                    // InternalLogicFunctionLanguage.g:487:4: rule__AND__ArgumentsAssignment_2_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__AND__ArgumentsAssignment_2_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getANDAccess().getArgumentsAssignment_2_5()); 

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
    // $ANTLR end "rule__AND__Alternatives_2"


    // $ANTLR start "rule__AND__Alternatives_3_1"
    // InternalLogicFunctionLanguage.g:495:1: rule__AND__Alternatives_3_1 : ( ( ( rule__AND__ArgumentsAssignment_3_1_0 ) ) | ( ( rule__AND__ArgumentsAssignment_3_1_1 ) ) | ( ( rule__AND__ArgumentsAssignment_3_1_2 ) ) | ( ( rule__AND__ArgumentsAssignment_3_1_3 ) ) | ( ( rule__AND__ArgumentsAssignment_3_1_4 ) ) | ( ( rule__AND__ArgumentsAssignment_3_1_5 ) ) );
    public final void rule__AND__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:499:1: ( ( ( rule__AND__ArgumentsAssignment_3_1_0 ) ) | ( ( rule__AND__ArgumentsAssignment_3_1_1 ) ) | ( ( rule__AND__ArgumentsAssignment_3_1_2 ) ) | ( ( rule__AND__ArgumentsAssignment_3_1_3 ) ) | ( ( rule__AND__ArgumentsAssignment_3_1_4 ) ) | ( ( rule__AND__ArgumentsAssignment_3_1_5 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 25:
                {
                alt4=3;
                }
                break;
            case 26:
                {
                alt4=4;
                }
                break;
            case 28:
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
                    // InternalLogicFunctionLanguage.g:500:2: ( ( rule__AND__ArgumentsAssignment_3_1_0 ) )
                    {
                    // InternalLogicFunctionLanguage.g:500:2: ( ( rule__AND__ArgumentsAssignment_3_1_0 ) )
                    // InternalLogicFunctionLanguage.g:501:3: ( rule__AND__ArgumentsAssignment_3_1_0 )
                    {
                     before(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_0()); 
                    // InternalLogicFunctionLanguage.g:502:3: ( rule__AND__ArgumentsAssignment_3_1_0 )
                    // InternalLogicFunctionLanguage.g:502:4: rule__AND__ArgumentsAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AND__ArgumentsAssignment_3_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:506:2: ( ( rule__AND__ArgumentsAssignment_3_1_1 ) )
                    {
                    // InternalLogicFunctionLanguage.g:506:2: ( ( rule__AND__ArgumentsAssignment_3_1_1 ) )
                    // InternalLogicFunctionLanguage.g:507:3: ( rule__AND__ArgumentsAssignment_3_1_1 )
                    {
                     before(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_1()); 
                    // InternalLogicFunctionLanguage.g:508:3: ( rule__AND__ArgumentsAssignment_3_1_1 )
                    // InternalLogicFunctionLanguage.g:508:4: rule__AND__ArgumentsAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AND__ArgumentsAssignment_3_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLogicFunctionLanguage.g:512:2: ( ( rule__AND__ArgumentsAssignment_3_1_2 ) )
                    {
                    // InternalLogicFunctionLanguage.g:512:2: ( ( rule__AND__ArgumentsAssignment_3_1_2 ) )
                    // InternalLogicFunctionLanguage.g:513:3: ( rule__AND__ArgumentsAssignment_3_1_2 )
                    {
                     before(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_2()); 
                    // InternalLogicFunctionLanguage.g:514:3: ( rule__AND__ArgumentsAssignment_3_1_2 )
                    // InternalLogicFunctionLanguage.g:514:4: rule__AND__ArgumentsAssignment_3_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AND__ArgumentsAssignment_3_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLogicFunctionLanguage.g:518:2: ( ( rule__AND__ArgumentsAssignment_3_1_3 ) )
                    {
                    // InternalLogicFunctionLanguage.g:518:2: ( ( rule__AND__ArgumentsAssignment_3_1_3 ) )
                    // InternalLogicFunctionLanguage.g:519:3: ( rule__AND__ArgumentsAssignment_3_1_3 )
                    {
                     before(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_3()); 
                    // InternalLogicFunctionLanguage.g:520:3: ( rule__AND__ArgumentsAssignment_3_1_3 )
                    // InternalLogicFunctionLanguage.g:520:4: rule__AND__ArgumentsAssignment_3_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__AND__ArgumentsAssignment_3_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLogicFunctionLanguage.g:524:2: ( ( rule__AND__ArgumentsAssignment_3_1_4 ) )
                    {
                    // InternalLogicFunctionLanguage.g:524:2: ( ( rule__AND__ArgumentsAssignment_3_1_4 ) )
                    // InternalLogicFunctionLanguage.g:525:3: ( rule__AND__ArgumentsAssignment_3_1_4 )
                    {
                     before(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_4()); 
                    // InternalLogicFunctionLanguage.g:526:3: ( rule__AND__ArgumentsAssignment_3_1_4 )
                    // InternalLogicFunctionLanguage.g:526:4: rule__AND__ArgumentsAssignment_3_1_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__AND__ArgumentsAssignment_3_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLogicFunctionLanguage.g:530:2: ( ( rule__AND__ArgumentsAssignment_3_1_5 ) )
                    {
                    // InternalLogicFunctionLanguage.g:530:2: ( ( rule__AND__ArgumentsAssignment_3_1_5 ) )
                    // InternalLogicFunctionLanguage.g:531:3: ( rule__AND__ArgumentsAssignment_3_1_5 )
                    {
                     before(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_5()); 
                    // InternalLogicFunctionLanguage.g:532:3: ( rule__AND__ArgumentsAssignment_3_1_5 )
                    // InternalLogicFunctionLanguage.g:532:4: rule__AND__ArgumentsAssignment_3_1_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__AND__ArgumentsAssignment_3_1_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_5()); 

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
    // $ANTLR end "rule__AND__Alternatives_3_1"


    // $ANTLR start "rule__OR__Alternatives_2"
    // InternalLogicFunctionLanguage.g:540:1: rule__OR__Alternatives_2 : ( ( ( rule__OR__ArgumentsAssignment_2_0 ) ) | ( ( rule__OR__ArgumentsAssignment_2_1 ) ) | ( ( rule__OR__ArgumentsAssignment_2_2 ) ) | ( ( rule__OR__ArgumentsAssignment_2_3 ) ) | ( ( rule__OR__ArgumentsAssignment_2_4 ) ) | ( ( rule__OR__ArgumentsAssignment_2_5 ) ) );
    public final void rule__OR__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:544:1: ( ( ( rule__OR__ArgumentsAssignment_2_0 ) ) | ( ( rule__OR__ArgumentsAssignment_2_1 ) ) | ( ( rule__OR__ArgumentsAssignment_2_2 ) ) | ( ( rule__OR__ArgumentsAssignment_2_3 ) ) | ( ( rule__OR__ArgumentsAssignment_2_4 ) ) | ( ( rule__OR__ArgumentsAssignment_2_5 ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 28:
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
                    // InternalLogicFunctionLanguage.g:545:2: ( ( rule__OR__ArgumentsAssignment_2_0 ) )
                    {
                    // InternalLogicFunctionLanguage.g:545:2: ( ( rule__OR__ArgumentsAssignment_2_0 ) )
                    // InternalLogicFunctionLanguage.g:546:3: ( rule__OR__ArgumentsAssignment_2_0 )
                    {
                     before(grammarAccess.getORAccess().getArgumentsAssignment_2_0()); 
                    // InternalLogicFunctionLanguage.g:547:3: ( rule__OR__ArgumentsAssignment_2_0 )
                    // InternalLogicFunctionLanguage.g:547:4: rule__OR__ArgumentsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OR__ArgumentsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getORAccess().getArgumentsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:551:2: ( ( rule__OR__ArgumentsAssignment_2_1 ) )
                    {
                    // InternalLogicFunctionLanguage.g:551:2: ( ( rule__OR__ArgumentsAssignment_2_1 ) )
                    // InternalLogicFunctionLanguage.g:552:3: ( rule__OR__ArgumentsAssignment_2_1 )
                    {
                     before(grammarAccess.getORAccess().getArgumentsAssignment_2_1()); 
                    // InternalLogicFunctionLanguage.g:553:3: ( rule__OR__ArgumentsAssignment_2_1 )
                    // InternalLogicFunctionLanguage.g:553:4: rule__OR__ArgumentsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OR__ArgumentsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getORAccess().getArgumentsAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLogicFunctionLanguage.g:557:2: ( ( rule__OR__ArgumentsAssignment_2_2 ) )
                    {
                    // InternalLogicFunctionLanguage.g:557:2: ( ( rule__OR__ArgumentsAssignment_2_2 ) )
                    // InternalLogicFunctionLanguage.g:558:3: ( rule__OR__ArgumentsAssignment_2_2 )
                    {
                     before(grammarAccess.getORAccess().getArgumentsAssignment_2_2()); 
                    // InternalLogicFunctionLanguage.g:559:3: ( rule__OR__ArgumentsAssignment_2_2 )
                    // InternalLogicFunctionLanguage.g:559:4: rule__OR__ArgumentsAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__OR__ArgumentsAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getORAccess().getArgumentsAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLogicFunctionLanguage.g:563:2: ( ( rule__OR__ArgumentsAssignment_2_3 ) )
                    {
                    // InternalLogicFunctionLanguage.g:563:2: ( ( rule__OR__ArgumentsAssignment_2_3 ) )
                    // InternalLogicFunctionLanguage.g:564:3: ( rule__OR__ArgumentsAssignment_2_3 )
                    {
                     before(grammarAccess.getORAccess().getArgumentsAssignment_2_3()); 
                    // InternalLogicFunctionLanguage.g:565:3: ( rule__OR__ArgumentsAssignment_2_3 )
                    // InternalLogicFunctionLanguage.g:565:4: rule__OR__ArgumentsAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__OR__ArgumentsAssignment_2_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getORAccess().getArgumentsAssignment_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLogicFunctionLanguage.g:569:2: ( ( rule__OR__ArgumentsAssignment_2_4 ) )
                    {
                    // InternalLogicFunctionLanguage.g:569:2: ( ( rule__OR__ArgumentsAssignment_2_4 ) )
                    // InternalLogicFunctionLanguage.g:570:3: ( rule__OR__ArgumentsAssignment_2_4 )
                    {
                     before(grammarAccess.getORAccess().getArgumentsAssignment_2_4()); 
                    // InternalLogicFunctionLanguage.g:571:3: ( rule__OR__ArgumentsAssignment_2_4 )
                    // InternalLogicFunctionLanguage.g:571:4: rule__OR__ArgumentsAssignment_2_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__OR__ArgumentsAssignment_2_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getORAccess().getArgumentsAssignment_2_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLogicFunctionLanguage.g:575:2: ( ( rule__OR__ArgumentsAssignment_2_5 ) )
                    {
                    // InternalLogicFunctionLanguage.g:575:2: ( ( rule__OR__ArgumentsAssignment_2_5 ) )
                    // InternalLogicFunctionLanguage.g:576:3: ( rule__OR__ArgumentsAssignment_2_5 )
                    {
                     before(grammarAccess.getORAccess().getArgumentsAssignment_2_5()); 
                    // InternalLogicFunctionLanguage.g:577:3: ( rule__OR__ArgumentsAssignment_2_5 )
                    // InternalLogicFunctionLanguage.g:577:4: rule__OR__ArgumentsAssignment_2_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__OR__ArgumentsAssignment_2_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getORAccess().getArgumentsAssignment_2_5()); 

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
    // $ANTLR end "rule__OR__Alternatives_2"


    // $ANTLR start "rule__OR__Alternatives_3_1"
    // InternalLogicFunctionLanguage.g:585:1: rule__OR__Alternatives_3_1 : ( ( ( rule__OR__ArgumentsAssignment_3_1_0 ) ) | ( ( rule__OR__ArgumentsAssignment_3_1_1 ) ) | ( ( rule__OR__ArgumentsAssignment_3_1_2 ) ) | ( ( rule__OR__ArgumentsAssignment_3_1_3 ) ) | ( ( rule__OR__ArgumentsAssignment_3_1_4 ) ) | ( ( rule__OR__ArgumentsAssignment_3_1_5 ) ) );
    public final void rule__OR__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:589:1: ( ( ( rule__OR__ArgumentsAssignment_3_1_0 ) ) | ( ( rule__OR__ArgumentsAssignment_3_1_1 ) ) | ( ( rule__OR__ArgumentsAssignment_3_1_2 ) ) | ( ( rule__OR__ArgumentsAssignment_3_1_3 ) ) | ( ( rule__OR__ArgumentsAssignment_3_1_4 ) ) | ( ( rule__OR__ArgumentsAssignment_3_1_5 ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            case 28:
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
                    // InternalLogicFunctionLanguage.g:590:2: ( ( rule__OR__ArgumentsAssignment_3_1_0 ) )
                    {
                    // InternalLogicFunctionLanguage.g:590:2: ( ( rule__OR__ArgumentsAssignment_3_1_0 ) )
                    // InternalLogicFunctionLanguage.g:591:3: ( rule__OR__ArgumentsAssignment_3_1_0 )
                    {
                     before(grammarAccess.getORAccess().getArgumentsAssignment_3_1_0()); 
                    // InternalLogicFunctionLanguage.g:592:3: ( rule__OR__ArgumentsAssignment_3_1_0 )
                    // InternalLogicFunctionLanguage.g:592:4: rule__OR__ArgumentsAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OR__ArgumentsAssignment_3_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getORAccess().getArgumentsAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:596:2: ( ( rule__OR__ArgumentsAssignment_3_1_1 ) )
                    {
                    // InternalLogicFunctionLanguage.g:596:2: ( ( rule__OR__ArgumentsAssignment_3_1_1 ) )
                    // InternalLogicFunctionLanguage.g:597:3: ( rule__OR__ArgumentsAssignment_3_1_1 )
                    {
                     before(grammarAccess.getORAccess().getArgumentsAssignment_3_1_1()); 
                    // InternalLogicFunctionLanguage.g:598:3: ( rule__OR__ArgumentsAssignment_3_1_1 )
                    // InternalLogicFunctionLanguage.g:598:4: rule__OR__ArgumentsAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OR__ArgumentsAssignment_3_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getORAccess().getArgumentsAssignment_3_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLogicFunctionLanguage.g:602:2: ( ( rule__OR__ArgumentsAssignment_3_1_2 ) )
                    {
                    // InternalLogicFunctionLanguage.g:602:2: ( ( rule__OR__ArgumentsAssignment_3_1_2 ) )
                    // InternalLogicFunctionLanguage.g:603:3: ( rule__OR__ArgumentsAssignment_3_1_2 )
                    {
                     before(grammarAccess.getORAccess().getArgumentsAssignment_3_1_2()); 
                    // InternalLogicFunctionLanguage.g:604:3: ( rule__OR__ArgumentsAssignment_3_1_2 )
                    // InternalLogicFunctionLanguage.g:604:4: rule__OR__ArgumentsAssignment_3_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__OR__ArgumentsAssignment_3_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getORAccess().getArgumentsAssignment_3_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLogicFunctionLanguage.g:608:2: ( ( rule__OR__ArgumentsAssignment_3_1_3 ) )
                    {
                    // InternalLogicFunctionLanguage.g:608:2: ( ( rule__OR__ArgumentsAssignment_3_1_3 ) )
                    // InternalLogicFunctionLanguage.g:609:3: ( rule__OR__ArgumentsAssignment_3_1_3 )
                    {
                     before(grammarAccess.getORAccess().getArgumentsAssignment_3_1_3()); 
                    // InternalLogicFunctionLanguage.g:610:3: ( rule__OR__ArgumentsAssignment_3_1_3 )
                    // InternalLogicFunctionLanguage.g:610:4: rule__OR__ArgumentsAssignment_3_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__OR__ArgumentsAssignment_3_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getORAccess().getArgumentsAssignment_3_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLogicFunctionLanguage.g:614:2: ( ( rule__OR__ArgumentsAssignment_3_1_4 ) )
                    {
                    // InternalLogicFunctionLanguage.g:614:2: ( ( rule__OR__ArgumentsAssignment_3_1_4 ) )
                    // InternalLogicFunctionLanguage.g:615:3: ( rule__OR__ArgumentsAssignment_3_1_4 )
                    {
                     before(grammarAccess.getORAccess().getArgumentsAssignment_3_1_4()); 
                    // InternalLogicFunctionLanguage.g:616:3: ( rule__OR__ArgumentsAssignment_3_1_4 )
                    // InternalLogicFunctionLanguage.g:616:4: rule__OR__ArgumentsAssignment_3_1_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__OR__ArgumentsAssignment_3_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getORAccess().getArgumentsAssignment_3_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLogicFunctionLanguage.g:620:2: ( ( rule__OR__ArgumentsAssignment_3_1_5 ) )
                    {
                    // InternalLogicFunctionLanguage.g:620:2: ( ( rule__OR__ArgumentsAssignment_3_1_5 ) )
                    // InternalLogicFunctionLanguage.g:621:3: ( rule__OR__ArgumentsAssignment_3_1_5 )
                    {
                     before(grammarAccess.getORAccess().getArgumentsAssignment_3_1_5()); 
                    // InternalLogicFunctionLanguage.g:622:3: ( rule__OR__ArgumentsAssignment_3_1_5 )
                    // InternalLogicFunctionLanguage.g:622:4: rule__OR__ArgumentsAssignment_3_1_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__OR__ArgumentsAssignment_3_1_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getORAccess().getArgumentsAssignment_3_1_5()); 

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
    // $ANTLR end "rule__OR__Alternatives_3_1"


    // $ANTLR start "rule__XOR__Alternatives_2"
    // InternalLogicFunctionLanguage.g:630:1: rule__XOR__Alternatives_2 : ( ( ( rule__XOR__ArgumentsAssignment_2_0 ) ) | ( ( rule__XOR__ArgumentsAssignment_2_1 ) ) | ( ( rule__XOR__ArgumentsAssignment_2_2 ) ) | ( ( rule__XOR__ArgumentsAssignment_2_3 ) ) | ( ( rule__XOR__ArgumentsAssignment_2_4 ) ) | ( ( rule__XOR__ArgumentsAssignment_2_5 ) ) );
    public final void rule__XOR__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:634:1: ( ( ( rule__XOR__ArgumentsAssignment_2_0 ) ) | ( ( rule__XOR__ArgumentsAssignment_2_1 ) ) | ( ( rule__XOR__ArgumentsAssignment_2_2 ) ) | ( ( rule__XOR__ArgumentsAssignment_2_3 ) ) | ( ( rule__XOR__ArgumentsAssignment_2_4 ) ) | ( ( rule__XOR__ArgumentsAssignment_2_5 ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            case 28:
                {
                alt7=5;
                }
                break;
            case RULE_ID:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:635:2: ( ( rule__XOR__ArgumentsAssignment_2_0 ) )
                    {
                    // InternalLogicFunctionLanguage.g:635:2: ( ( rule__XOR__ArgumentsAssignment_2_0 ) )
                    // InternalLogicFunctionLanguage.g:636:3: ( rule__XOR__ArgumentsAssignment_2_0 )
                    {
                     before(grammarAccess.getXORAccess().getArgumentsAssignment_2_0()); 
                    // InternalLogicFunctionLanguage.g:637:3: ( rule__XOR__ArgumentsAssignment_2_0 )
                    // InternalLogicFunctionLanguage.g:637:4: rule__XOR__ArgumentsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XOR__ArgumentsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXORAccess().getArgumentsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:641:2: ( ( rule__XOR__ArgumentsAssignment_2_1 ) )
                    {
                    // InternalLogicFunctionLanguage.g:641:2: ( ( rule__XOR__ArgumentsAssignment_2_1 ) )
                    // InternalLogicFunctionLanguage.g:642:3: ( rule__XOR__ArgumentsAssignment_2_1 )
                    {
                     before(grammarAccess.getXORAccess().getArgumentsAssignment_2_1()); 
                    // InternalLogicFunctionLanguage.g:643:3: ( rule__XOR__ArgumentsAssignment_2_1 )
                    // InternalLogicFunctionLanguage.g:643:4: rule__XOR__ArgumentsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XOR__ArgumentsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXORAccess().getArgumentsAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLogicFunctionLanguage.g:647:2: ( ( rule__XOR__ArgumentsAssignment_2_2 ) )
                    {
                    // InternalLogicFunctionLanguage.g:647:2: ( ( rule__XOR__ArgumentsAssignment_2_2 ) )
                    // InternalLogicFunctionLanguage.g:648:3: ( rule__XOR__ArgumentsAssignment_2_2 )
                    {
                     before(grammarAccess.getXORAccess().getArgumentsAssignment_2_2()); 
                    // InternalLogicFunctionLanguage.g:649:3: ( rule__XOR__ArgumentsAssignment_2_2 )
                    // InternalLogicFunctionLanguage.g:649:4: rule__XOR__ArgumentsAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__XOR__ArgumentsAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getXORAccess().getArgumentsAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLogicFunctionLanguage.g:653:2: ( ( rule__XOR__ArgumentsAssignment_2_3 ) )
                    {
                    // InternalLogicFunctionLanguage.g:653:2: ( ( rule__XOR__ArgumentsAssignment_2_3 ) )
                    // InternalLogicFunctionLanguage.g:654:3: ( rule__XOR__ArgumentsAssignment_2_3 )
                    {
                     before(grammarAccess.getXORAccess().getArgumentsAssignment_2_3()); 
                    // InternalLogicFunctionLanguage.g:655:3: ( rule__XOR__ArgumentsAssignment_2_3 )
                    // InternalLogicFunctionLanguage.g:655:4: rule__XOR__ArgumentsAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XOR__ArgumentsAssignment_2_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getXORAccess().getArgumentsAssignment_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLogicFunctionLanguage.g:659:2: ( ( rule__XOR__ArgumentsAssignment_2_4 ) )
                    {
                    // InternalLogicFunctionLanguage.g:659:2: ( ( rule__XOR__ArgumentsAssignment_2_4 ) )
                    // InternalLogicFunctionLanguage.g:660:3: ( rule__XOR__ArgumentsAssignment_2_4 )
                    {
                     before(grammarAccess.getXORAccess().getArgumentsAssignment_2_4()); 
                    // InternalLogicFunctionLanguage.g:661:3: ( rule__XOR__ArgumentsAssignment_2_4 )
                    // InternalLogicFunctionLanguage.g:661:4: rule__XOR__ArgumentsAssignment_2_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__XOR__ArgumentsAssignment_2_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getXORAccess().getArgumentsAssignment_2_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLogicFunctionLanguage.g:665:2: ( ( rule__XOR__ArgumentsAssignment_2_5 ) )
                    {
                    // InternalLogicFunctionLanguage.g:665:2: ( ( rule__XOR__ArgumentsAssignment_2_5 ) )
                    // InternalLogicFunctionLanguage.g:666:3: ( rule__XOR__ArgumentsAssignment_2_5 )
                    {
                     before(grammarAccess.getXORAccess().getArgumentsAssignment_2_5()); 
                    // InternalLogicFunctionLanguage.g:667:3: ( rule__XOR__ArgumentsAssignment_2_5 )
                    // InternalLogicFunctionLanguage.g:667:4: rule__XOR__ArgumentsAssignment_2_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__XOR__ArgumentsAssignment_2_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getXORAccess().getArgumentsAssignment_2_5()); 

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
    // $ANTLR end "rule__XOR__Alternatives_2"


    // $ANTLR start "rule__XOR__Alternatives_3_1"
    // InternalLogicFunctionLanguage.g:675:1: rule__XOR__Alternatives_3_1 : ( ( ( rule__XOR__ArgumentsAssignment_3_1_0 ) ) | ( ( rule__XOR__ArgumentsAssignment_3_1_1 ) ) | ( ( rule__XOR__ArgumentsAssignment_3_1_2 ) ) | ( ( rule__XOR__ArgumentsAssignment_3_1_3 ) ) | ( ( rule__XOR__ArgumentsAssignment_3_1_4 ) ) | ( ( rule__XOR__ArgumentsAssignment_3_1_5 ) ) );
    public final void rule__XOR__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:679:1: ( ( ( rule__XOR__ArgumentsAssignment_3_1_0 ) ) | ( ( rule__XOR__ArgumentsAssignment_3_1_1 ) ) | ( ( rule__XOR__ArgumentsAssignment_3_1_2 ) ) | ( ( rule__XOR__ArgumentsAssignment_3_1_3 ) ) | ( ( rule__XOR__ArgumentsAssignment_3_1_4 ) ) | ( ( rule__XOR__ArgumentsAssignment_3_1_5 ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 26:
                {
                alt8=4;
                }
                break;
            case 28:
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
                    // InternalLogicFunctionLanguage.g:680:2: ( ( rule__XOR__ArgumentsAssignment_3_1_0 ) )
                    {
                    // InternalLogicFunctionLanguage.g:680:2: ( ( rule__XOR__ArgumentsAssignment_3_1_0 ) )
                    // InternalLogicFunctionLanguage.g:681:3: ( rule__XOR__ArgumentsAssignment_3_1_0 )
                    {
                     before(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_0()); 
                    // InternalLogicFunctionLanguage.g:682:3: ( rule__XOR__ArgumentsAssignment_3_1_0 )
                    // InternalLogicFunctionLanguage.g:682:4: rule__XOR__ArgumentsAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XOR__ArgumentsAssignment_3_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:686:2: ( ( rule__XOR__ArgumentsAssignment_3_1_1 ) )
                    {
                    // InternalLogicFunctionLanguage.g:686:2: ( ( rule__XOR__ArgumentsAssignment_3_1_1 ) )
                    // InternalLogicFunctionLanguage.g:687:3: ( rule__XOR__ArgumentsAssignment_3_1_1 )
                    {
                     before(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_1()); 
                    // InternalLogicFunctionLanguage.g:688:3: ( rule__XOR__ArgumentsAssignment_3_1_1 )
                    // InternalLogicFunctionLanguage.g:688:4: rule__XOR__ArgumentsAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XOR__ArgumentsAssignment_3_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLogicFunctionLanguage.g:692:2: ( ( rule__XOR__ArgumentsAssignment_3_1_2 ) )
                    {
                    // InternalLogicFunctionLanguage.g:692:2: ( ( rule__XOR__ArgumentsAssignment_3_1_2 ) )
                    // InternalLogicFunctionLanguage.g:693:3: ( rule__XOR__ArgumentsAssignment_3_1_2 )
                    {
                     before(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_2()); 
                    // InternalLogicFunctionLanguage.g:694:3: ( rule__XOR__ArgumentsAssignment_3_1_2 )
                    // InternalLogicFunctionLanguage.g:694:4: rule__XOR__ArgumentsAssignment_3_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__XOR__ArgumentsAssignment_3_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLogicFunctionLanguage.g:698:2: ( ( rule__XOR__ArgumentsAssignment_3_1_3 ) )
                    {
                    // InternalLogicFunctionLanguage.g:698:2: ( ( rule__XOR__ArgumentsAssignment_3_1_3 ) )
                    // InternalLogicFunctionLanguage.g:699:3: ( rule__XOR__ArgumentsAssignment_3_1_3 )
                    {
                     before(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_3()); 
                    // InternalLogicFunctionLanguage.g:700:3: ( rule__XOR__ArgumentsAssignment_3_1_3 )
                    // InternalLogicFunctionLanguage.g:700:4: rule__XOR__ArgumentsAssignment_3_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XOR__ArgumentsAssignment_3_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLogicFunctionLanguage.g:704:2: ( ( rule__XOR__ArgumentsAssignment_3_1_4 ) )
                    {
                    // InternalLogicFunctionLanguage.g:704:2: ( ( rule__XOR__ArgumentsAssignment_3_1_4 ) )
                    // InternalLogicFunctionLanguage.g:705:3: ( rule__XOR__ArgumentsAssignment_3_1_4 )
                    {
                     before(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_4()); 
                    // InternalLogicFunctionLanguage.g:706:3: ( rule__XOR__ArgumentsAssignment_3_1_4 )
                    // InternalLogicFunctionLanguage.g:706:4: rule__XOR__ArgumentsAssignment_3_1_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__XOR__ArgumentsAssignment_3_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLogicFunctionLanguage.g:710:2: ( ( rule__XOR__ArgumentsAssignment_3_1_5 ) )
                    {
                    // InternalLogicFunctionLanguage.g:710:2: ( ( rule__XOR__ArgumentsAssignment_3_1_5 ) )
                    // InternalLogicFunctionLanguage.g:711:3: ( rule__XOR__ArgumentsAssignment_3_1_5 )
                    {
                     before(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_5()); 
                    // InternalLogicFunctionLanguage.g:712:3: ( rule__XOR__ArgumentsAssignment_3_1_5 )
                    // InternalLogicFunctionLanguage.g:712:4: rule__XOR__ArgumentsAssignment_3_1_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__XOR__ArgumentsAssignment_3_1_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_5()); 

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
    // $ANTLR end "rule__XOR__Alternatives_3_1"


    // $ANTLR start "rule__NOT__Alternatives_2"
    // InternalLogicFunctionLanguage.g:720:1: rule__NOT__Alternatives_2 : ( ( ( rule__NOT__ArgumentAssignment_2_0 ) ) | ( ( rule__NOT__ArgumentAssignment_2_1 ) ) | ( ( rule__NOT__ArgumentAssignment_2_2 ) ) | ( ( rule__NOT__ArgumentAssignment_2_3 ) ) | ( ( rule__NOT__ArgumentAssignment_2_4 ) ) | ( ( rule__NOT__ArgumentAssignment_2_5 ) ) );
    public final void rule__NOT__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:724:1: ( ( ( rule__NOT__ArgumentAssignment_2_0 ) ) | ( ( rule__NOT__ArgumentAssignment_2_1 ) ) | ( ( rule__NOT__ArgumentAssignment_2_2 ) ) | ( ( rule__NOT__ArgumentAssignment_2_3 ) ) | ( ( rule__NOT__ArgumentAssignment_2_4 ) ) | ( ( rule__NOT__ArgumentAssignment_2_5 ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            case 26:
                {
                alt9=4;
                }
                break;
            case 28:
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
                    // InternalLogicFunctionLanguage.g:725:2: ( ( rule__NOT__ArgumentAssignment_2_0 ) )
                    {
                    // InternalLogicFunctionLanguage.g:725:2: ( ( rule__NOT__ArgumentAssignment_2_0 ) )
                    // InternalLogicFunctionLanguage.g:726:3: ( rule__NOT__ArgumentAssignment_2_0 )
                    {
                     before(grammarAccess.getNOTAccess().getArgumentAssignment_2_0()); 
                    // InternalLogicFunctionLanguage.g:727:3: ( rule__NOT__ArgumentAssignment_2_0 )
                    // InternalLogicFunctionLanguage.g:727:4: rule__NOT__ArgumentAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NOT__ArgumentAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNOTAccess().getArgumentAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:731:2: ( ( rule__NOT__ArgumentAssignment_2_1 ) )
                    {
                    // InternalLogicFunctionLanguage.g:731:2: ( ( rule__NOT__ArgumentAssignment_2_1 ) )
                    // InternalLogicFunctionLanguage.g:732:3: ( rule__NOT__ArgumentAssignment_2_1 )
                    {
                     before(grammarAccess.getNOTAccess().getArgumentAssignment_2_1()); 
                    // InternalLogicFunctionLanguage.g:733:3: ( rule__NOT__ArgumentAssignment_2_1 )
                    // InternalLogicFunctionLanguage.g:733:4: rule__NOT__ArgumentAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NOT__ArgumentAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNOTAccess().getArgumentAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLogicFunctionLanguage.g:737:2: ( ( rule__NOT__ArgumentAssignment_2_2 ) )
                    {
                    // InternalLogicFunctionLanguage.g:737:2: ( ( rule__NOT__ArgumentAssignment_2_2 ) )
                    // InternalLogicFunctionLanguage.g:738:3: ( rule__NOT__ArgumentAssignment_2_2 )
                    {
                     before(grammarAccess.getNOTAccess().getArgumentAssignment_2_2()); 
                    // InternalLogicFunctionLanguage.g:739:3: ( rule__NOT__ArgumentAssignment_2_2 )
                    // InternalLogicFunctionLanguage.g:739:4: rule__NOT__ArgumentAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__NOT__ArgumentAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNOTAccess().getArgumentAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLogicFunctionLanguage.g:743:2: ( ( rule__NOT__ArgumentAssignment_2_3 ) )
                    {
                    // InternalLogicFunctionLanguage.g:743:2: ( ( rule__NOT__ArgumentAssignment_2_3 ) )
                    // InternalLogicFunctionLanguage.g:744:3: ( rule__NOT__ArgumentAssignment_2_3 )
                    {
                     before(grammarAccess.getNOTAccess().getArgumentAssignment_2_3()); 
                    // InternalLogicFunctionLanguage.g:745:3: ( rule__NOT__ArgumentAssignment_2_3 )
                    // InternalLogicFunctionLanguage.g:745:4: rule__NOT__ArgumentAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__NOT__ArgumentAssignment_2_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getNOTAccess().getArgumentAssignment_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLogicFunctionLanguage.g:749:2: ( ( rule__NOT__ArgumentAssignment_2_4 ) )
                    {
                    // InternalLogicFunctionLanguage.g:749:2: ( ( rule__NOT__ArgumentAssignment_2_4 ) )
                    // InternalLogicFunctionLanguage.g:750:3: ( rule__NOT__ArgumentAssignment_2_4 )
                    {
                     before(grammarAccess.getNOTAccess().getArgumentAssignment_2_4()); 
                    // InternalLogicFunctionLanguage.g:751:3: ( rule__NOT__ArgumentAssignment_2_4 )
                    // InternalLogicFunctionLanguage.g:751:4: rule__NOT__ArgumentAssignment_2_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__NOT__ArgumentAssignment_2_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getNOTAccess().getArgumentAssignment_2_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLogicFunctionLanguage.g:755:2: ( ( rule__NOT__ArgumentAssignment_2_5 ) )
                    {
                    // InternalLogicFunctionLanguage.g:755:2: ( ( rule__NOT__ArgumentAssignment_2_5 ) )
                    // InternalLogicFunctionLanguage.g:756:3: ( rule__NOT__ArgumentAssignment_2_5 )
                    {
                     before(grammarAccess.getNOTAccess().getArgumentAssignment_2_5()); 
                    // InternalLogicFunctionLanguage.g:757:3: ( rule__NOT__ArgumentAssignment_2_5 )
                    // InternalLogicFunctionLanguage.g:757:4: rule__NOT__ArgumentAssignment_2_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__NOT__ArgumentAssignment_2_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getNOTAccess().getArgumentAssignment_2_5()); 

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
    // $ANTLR end "rule__NOT__Alternatives_2"


    // $ANTLR start "rule__EventDirection__Alternatives"
    // InternalLogicFunctionLanguage.g:765:1: rule__EventDirection__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );
    public final void rule__EventDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:769:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            else if ( (LA10_0==13) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:770:2: ( ( 'in' ) )
                    {
                    // InternalLogicFunctionLanguage.g:770:2: ( ( 'in' ) )
                    // InternalLogicFunctionLanguage.g:771:3: ( 'in' )
                    {
                     before(grammarAccess.getEventDirectionAccess().getINEnumLiteralDeclaration_0()); 
                    // InternalLogicFunctionLanguage.g:772:3: ( 'in' )
                    // InternalLogicFunctionLanguage.g:772:4: 'in'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventDirectionAccess().getINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLogicFunctionLanguage.g:776:2: ( ( 'out' ) )
                    {
                    // InternalLogicFunctionLanguage.g:776:2: ( ( 'out' ) )
                    // InternalLogicFunctionLanguage.g:777:3: ( 'out' )
                    {
                     before(grammarAccess.getEventDirectionAccess().getOUTEnumLiteralDeclaration_1()); 
                    // InternalLogicFunctionLanguage.g:778:3: ( 'out' )
                    // InternalLogicFunctionLanguage.g:778:4: 'out'
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


    // $ANTLR start "rule__LogicFunctionDiagram__Group__0"
    // InternalLogicFunctionLanguage.g:786:1: rule__LogicFunctionDiagram__Group__0 : rule__LogicFunctionDiagram__Group__0__Impl rule__LogicFunctionDiagram__Group__1 ;
    public final void rule__LogicFunctionDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:790:1: ( rule__LogicFunctionDiagram__Group__0__Impl rule__LogicFunctionDiagram__Group__1 )
            // InternalLogicFunctionLanguage.g:791:2: rule__LogicFunctionDiagram__Group__0__Impl rule__LogicFunctionDiagram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LogicFunctionDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicFunctionDiagram__Group__1();

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
    // $ANTLR end "rule__LogicFunctionDiagram__Group__0"


    // $ANTLR start "rule__LogicFunctionDiagram__Group__0__Impl"
    // InternalLogicFunctionLanguage.g:798:1: rule__LogicFunctionDiagram__Group__0__Impl : ( 'function' ) ;
    public final void rule__LogicFunctionDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:802:1: ( ( 'function' ) )
            // InternalLogicFunctionLanguage.g:803:1: ( 'function' )
            {
            // InternalLogicFunctionLanguage.g:803:1: ( 'function' )
            // InternalLogicFunctionLanguage.g:804:2: 'function'
            {
             before(grammarAccess.getLogicFunctionDiagramAccess().getFunctionKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLogicFunctionDiagramAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicFunctionDiagram__Group__0__Impl"


    // $ANTLR start "rule__LogicFunctionDiagram__Group__1"
    // InternalLogicFunctionLanguage.g:813:1: rule__LogicFunctionDiagram__Group__1 : rule__LogicFunctionDiagram__Group__1__Impl rule__LogicFunctionDiagram__Group__2 ;
    public final void rule__LogicFunctionDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:817:1: ( rule__LogicFunctionDiagram__Group__1__Impl rule__LogicFunctionDiagram__Group__2 )
            // InternalLogicFunctionLanguage.g:818:2: rule__LogicFunctionDiagram__Group__1__Impl rule__LogicFunctionDiagram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LogicFunctionDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicFunctionDiagram__Group__2();

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
    // $ANTLR end "rule__LogicFunctionDiagram__Group__1"


    // $ANTLR start "rule__LogicFunctionDiagram__Group__1__Impl"
    // InternalLogicFunctionLanguage.g:825:1: rule__LogicFunctionDiagram__Group__1__Impl : ( ( rule__LogicFunctionDiagram__NameAssignment_1 ) ) ;
    public final void rule__LogicFunctionDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:829:1: ( ( ( rule__LogicFunctionDiagram__NameAssignment_1 ) ) )
            // InternalLogicFunctionLanguage.g:830:1: ( ( rule__LogicFunctionDiagram__NameAssignment_1 ) )
            {
            // InternalLogicFunctionLanguage.g:830:1: ( ( rule__LogicFunctionDiagram__NameAssignment_1 ) )
            // InternalLogicFunctionLanguage.g:831:2: ( rule__LogicFunctionDiagram__NameAssignment_1 )
            {
             before(grammarAccess.getLogicFunctionDiagramAccess().getNameAssignment_1()); 
            // InternalLogicFunctionLanguage.g:832:2: ( rule__LogicFunctionDiagram__NameAssignment_1 )
            // InternalLogicFunctionLanguage.g:832:3: rule__LogicFunctionDiagram__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicFunctionDiagram__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicFunctionDiagramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicFunctionDiagram__Group__1__Impl"


    // $ANTLR start "rule__LogicFunctionDiagram__Group__2"
    // InternalLogicFunctionLanguage.g:840:1: rule__LogicFunctionDiagram__Group__2 : rule__LogicFunctionDiagram__Group__2__Impl rule__LogicFunctionDiagram__Group__3 ;
    public final void rule__LogicFunctionDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:844:1: ( rule__LogicFunctionDiagram__Group__2__Impl rule__LogicFunctionDiagram__Group__3 )
            // InternalLogicFunctionLanguage.g:845:2: rule__LogicFunctionDiagram__Group__2__Impl rule__LogicFunctionDiagram__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__LogicFunctionDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicFunctionDiagram__Group__3();

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
    // $ANTLR end "rule__LogicFunctionDiagram__Group__2"


    // $ANTLR start "rule__LogicFunctionDiagram__Group__2__Impl"
    // InternalLogicFunctionLanguage.g:852:1: rule__LogicFunctionDiagram__Group__2__Impl : ( '{' ) ;
    public final void rule__LogicFunctionDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:856:1: ( ( '{' ) )
            // InternalLogicFunctionLanguage.g:857:1: ( '{' )
            {
            // InternalLogicFunctionLanguage.g:857:1: ( '{' )
            // InternalLogicFunctionLanguage.g:858:2: '{'
            {
             before(grammarAccess.getLogicFunctionDiagramAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLogicFunctionDiagramAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicFunctionDiagram__Group__2__Impl"


    // $ANTLR start "rule__LogicFunctionDiagram__Group__3"
    // InternalLogicFunctionLanguage.g:867:1: rule__LogicFunctionDiagram__Group__3 : rule__LogicFunctionDiagram__Group__3__Impl rule__LogicFunctionDiagram__Group__4 ;
    public final void rule__LogicFunctionDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:871:1: ( rule__LogicFunctionDiagram__Group__3__Impl rule__LogicFunctionDiagram__Group__4 )
            // InternalLogicFunctionLanguage.g:872:2: rule__LogicFunctionDiagram__Group__3__Impl rule__LogicFunctionDiagram__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__LogicFunctionDiagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicFunctionDiagram__Group__4();

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
    // $ANTLR end "rule__LogicFunctionDiagram__Group__3"


    // $ANTLR start "rule__LogicFunctionDiagram__Group__3__Impl"
    // InternalLogicFunctionLanguage.g:879:1: rule__LogicFunctionDiagram__Group__3__Impl : ( ( rule__LogicFunctionDiagram__Alternatives_3 )* ) ;
    public final void rule__LogicFunctionDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:883:1: ( ( ( rule__LogicFunctionDiagram__Alternatives_3 )* ) )
            // InternalLogicFunctionLanguage.g:884:1: ( ( rule__LogicFunctionDiagram__Alternatives_3 )* )
            {
            // InternalLogicFunctionLanguage.g:884:1: ( ( rule__LogicFunctionDiagram__Alternatives_3 )* )
            // InternalLogicFunctionLanguage.g:885:2: ( rule__LogicFunctionDiagram__Alternatives_3 )*
            {
             before(grammarAccess.getLogicFunctionDiagramAccess().getAlternatives_3()); 
            // InternalLogicFunctionLanguage.g:886:2: ( rule__LogicFunctionDiagram__Alternatives_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17||LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLogicFunctionLanguage.g:886:3: rule__LogicFunctionDiagram__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__LogicFunctionDiagram__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLogicFunctionDiagramAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicFunctionDiagram__Group__3__Impl"


    // $ANTLR start "rule__LogicFunctionDiagram__Group__4"
    // InternalLogicFunctionLanguage.g:894:1: rule__LogicFunctionDiagram__Group__4 : rule__LogicFunctionDiagram__Group__4__Impl ;
    public final void rule__LogicFunctionDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:898:1: ( rule__LogicFunctionDiagram__Group__4__Impl )
            // InternalLogicFunctionLanguage.g:899:2: rule__LogicFunctionDiagram__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicFunctionDiagram__Group__4__Impl();

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
    // $ANTLR end "rule__LogicFunctionDiagram__Group__4"


    // $ANTLR start "rule__LogicFunctionDiagram__Group__4__Impl"
    // InternalLogicFunctionLanguage.g:905:1: rule__LogicFunctionDiagram__Group__4__Impl : ( '}' ) ;
    public final void rule__LogicFunctionDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:909:1: ( ( '}' ) )
            // InternalLogicFunctionLanguage.g:910:1: ( '}' )
            {
            // InternalLogicFunctionLanguage.g:910:1: ( '}' )
            // InternalLogicFunctionLanguage.g:911:2: '}'
            {
             before(grammarAccess.getLogicFunctionDiagramAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLogicFunctionDiagramAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicFunctionDiagram__Group__4__Impl"


    // $ANTLR start "rule__RuleDeclaration__Group__0"
    // InternalLogicFunctionLanguage.g:921:1: rule__RuleDeclaration__Group__0 : rule__RuleDeclaration__Group__0__Impl rule__RuleDeclaration__Group__1 ;
    public final void rule__RuleDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:925:1: ( rule__RuleDeclaration__Group__0__Impl rule__RuleDeclaration__Group__1 )
            // InternalLogicFunctionLanguage.g:926:2: rule__RuleDeclaration__Group__0__Impl rule__RuleDeclaration__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RuleDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__1();

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
    // $ANTLR end "rule__RuleDeclaration__Group__0"


    // $ANTLR start "rule__RuleDeclaration__Group__0__Impl"
    // InternalLogicFunctionLanguage.g:933:1: rule__RuleDeclaration__Group__0__Impl : ( 'rule' ) ;
    public final void rule__RuleDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:937:1: ( ( 'rule' ) )
            // InternalLogicFunctionLanguage.g:938:1: ( 'rule' )
            {
            // InternalLogicFunctionLanguage.g:938:1: ( 'rule' )
            // InternalLogicFunctionLanguage.g:939:2: 'rule'
            {
             before(grammarAccess.getRuleDeclarationAccess().getRuleKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRuleDeclarationAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group__0__Impl"


    // $ANTLR start "rule__RuleDeclaration__Group__1"
    // InternalLogicFunctionLanguage.g:948:1: rule__RuleDeclaration__Group__1 : rule__RuleDeclaration__Group__1__Impl rule__RuleDeclaration__Group__2 ;
    public final void rule__RuleDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:952:1: ( rule__RuleDeclaration__Group__1__Impl rule__RuleDeclaration__Group__2 )
            // InternalLogicFunctionLanguage.g:953:2: rule__RuleDeclaration__Group__1__Impl rule__RuleDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RuleDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__2();

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
    // $ANTLR end "rule__RuleDeclaration__Group__1"


    // $ANTLR start "rule__RuleDeclaration__Group__1__Impl"
    // InternalLogicFunctionLanguage.g:960:1: rule__RuleDeclaration__Group__1__Impl : ( ( rule__RuleDeclaration__NameAssignment_1 )? ) ;
    public final void rule__RuleDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:964:1: ( ( ( rule__RuleDeclaration__NameAssignment_1 )? ) )
            // InternalLogicFunctionLanguage.g:965:1: ( ( rule__RuleDeclaration__NameAssignment_1 )? )
            {
            // InternalLogicFunctionLanguage.g:965:1: ( ( rule__RuleDeclaration__NameAssignment_1 )? )
            // InternalLogicFunctionLanguage.g:966:2: ( rule__RuleDeclaration__NameAssignment_1 )?
            {
             before(grammarAccess.getRuleDeclarationAccess().getNameAssignment_1()); 
            // InternalLogicFunctionLanguage.g:967:2: ( rule__RuleDeclaration__NameAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:967:3: rule__RuleDeclaration__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleDeclaration__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group__1__Impl"


    // $ANTLR start "rule__RuleDeclaration__Group__2"
    // InternalLogicFunctionLanguage.g:975:1: rule__RuleDeclaration__Group__2 : rule__RuleDeclaration__Group__2__Impl rule__RuleDeclaration__Group__3 ;
    public final void rule__RuleDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:979:1: ( rule__RuleDeclaration__Group__2__Impl rule__RuleDeclaration__Group__3 )
            // InternalLogicFunctionLanguage.g:980:2: rule__RuleDeclaration__Group__2__Impl rule__RuleDeclaration__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RuleDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__3();

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
    // $ANTLR end "rule__RuleDeclaration__Group__2"


    // $ANTLR start "rule__RuleDeclaration__Group__2__Impl"
    // InternalLogicFunctionLanguage.g:987:1: rule__RuleDeclaration__Group__2__Impl : ( ':=' ) ;
    public final void rule__RuleDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:991:1: ( ( ':=' ) )
            // InternalLogicFunctionLanguage.g:992:1: ( ':=' )
            {
            // InternalLogicFunctionLanguage.g:992:1: ( ':=' )
            // InternalLogicFunctionLanguage.g:993:2: ':='
            {
             before(grammarAccess.getRuleDeclarationAccess().getColonEqualsSignKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRuleDeclarationAccess().getColonEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group__2__Impl"


    // $ANTLR start "rule__RuleDeclaration__Group__3"
    // InternalLogicFunctionLanguage.g:1002:1: rule__RuleDeclaration__Group__3 : rule__RuleDeclaration__Group__3__Impl rule__RuleDeclaration__Group__4 ;
    public final void rule__RuleDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1006:1: ( rule__RuleDeclaration__Group__3__Impl rule__RuleDeclaration__Group__4 )
            // InternalLogicFunctionLanguage.g:1007:2: rule__RuleDeclaration__Group__3__Impl rule__RuleDeclaration__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__RuleDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__4();

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
    // $ANTLR end "rule__RuleDeclaration__Group__3"


    // $ANTLR start "rule__RuleDeclaration__Group__3__Impl"
    // InternalLogicFunctionLanguage.g:1014:1: rule__RuleDeclaration__Group__3__Impl : ( ( rule__RuleDeclaration__Group_3__0 )? ) ;
    public final void rule__RuleDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1018:1: ( ( ( rule__RuleDeclaration__Group_3__0 )? ) )
            // InternalLogicFunctionLanguage.g:1019:1: ( ( rule__RuleDeclaration__Group_3__0 )? )
            {
            // InternalLogicFunctionLanguage.g:1019:1: ( ( rule__RuleDeclaration__Group_3__0 )? )
            // InternalLogicFunctionLanguage.g:1020:2: ( rule__RuleDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getRuleDeclarationAccess().getGroup_3()); 
            // InternalLogicFunctionLanguage.g:1021:2: ( rule__RuleDeclaration__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==19||LA13_1==29) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:1021:3: rule__RuleDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleDeclaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleDeclarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group__3__Impl"


    // $ANTLR start "rule__RuleDeclaration__Group__4"
    // InternalLogicFunctionLanguage.g:1029:1: rule__RuleDeclaration__Group__4 : rule__RuleDeclaration__Group__4__Impl ;
    public final void rule__RuleDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1033:1: ( rule__RuleDeclaration__Group__4__Impl )
            // InternalLogicFunctionLanguage.g:1034:2: rule__RuleDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__RuleDeclaration__Group__4"


    // $ANTLR start "rule__RuleDeclaration__Group__4__Impl"
    // InternalLogicFunctionLanguage.g:1040:1: rule__RuleDeclaration__Group__4__Impl : ( ( rule__RuleDeclaration__Alternatives_4 ) ) ;
    public final void rule__RuleDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1044:1: ( ( ( rule__RuleDeclaration__Alternatives_4 ) ) )
            // InternalLogicFunctionLanguage.g:1045:1: ( ( rule__RuleDeclaration__Alternatives_4 ) )
            {
            // InternalLogicFunctionLanguage.g:1045:1: ( ( rule__RuleDeclaration__Alternatives_4 ) )
            // InternalLogicFunctionLanguage.g:1046:2: ( rule__RuleDeclaration__Alternatives_4 )
            {
             before(grammarAccess.getRuleDeclarationAccess().getAlternatives_4()); 
            // InternalLogicFunctionLanguage.g:1047:2: ( rule__RuleDeclaration__Alternatives_4 )
            // InternalLogicFunctionLanguage.g:1047:3: rule__RuleDeclaration__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleDeclarationAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group__4__Impl"


    // $ANTLR start "rule__RuleDeclaration__Group_3__0"
    // InternalLogicFunctionLanguage.g:1056:1: rule__RuleDeclaration__Group_3__0 : rule__RuleDeclaration__Group_3__0__Impl rule__RuleDeclaration__Group_3__1 ;
    public final void rule__RuleDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1060:1: ( rule__RuleDeclaration__Group_3__0__Impl rule__RuleDeclaration__Group_3__1 )
            // InternalLogicFunctionLanguage.g:1061:2: rule__RuleDeclaration__Group_3__0__Impl rule__RuleDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__RuleDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group_3__1();

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
    // $ANTLR end "rule__RuleDeclaration__Group_3__0"


    // $ANTLR start "rule__RuleDeclaration__Group_3__0__Impl"
    // InternalLogicFunctionLanguage.g:1068:1: rule__RuleDeclaration__Group_3__0__Impl : ( ( rule__RuleDeclaration__RaisesAssignment_3_0 ) ) ;
    public final void rule__RuleDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1072:1: ( ( ( rule__RuleDeclaration__RaisesAssignment_3_0 ) ) )
            // InternalLogicFunctionLanguage.g:1073:1: ( ( rule__RuleDeclaration__RaisesAssignment_3_0 ) )
            {
            // InternalLogicFunctionLanguage.g:1073:1: ( ( rule__RuleDeclaration__RaisesAssignment_3_0 ) )
            // InternalLogicFunctionLanguage.g:1074:2: ( rule__RuleDeclaration__RaisesAssignment_3_0 )
            {
             before(grammarAccess.getRuleDeclarationAccess().getRaisesAssignment_3_0()); 
            // InternalLogicFunctionLanguage.g:1075:2: ( rule__RuleDeclaration__RaisesAssignment_3_0 )
            // InternalLogicFunctionLanguage.g:1075:3: rule__RuleDeclaration__RaisesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__RaisesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleDeclarationAccess().getRaisesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__RuleDeclaration__Group_3__1"
    // InternalLogicFunctionLanguage.g:1083:1: rule__RuleDeclaration__Group_3__1 : rule__RuleDeclaration__Group_3__1__Impl ;
    public final void rule__RuleDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1087:1: ( rule__RuleDeclaration__Group_3__1__Impl )
            // InternalLogicFunctionLanguage.g:1088:2: rule__RuleDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group_3__1__Impl();

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
    // $ANTLR end "rule__RuleDeclaration__Group_3__1"


    // $ANTLR start "rule__RuleDeclaration__Group_3__1__Impl"
    // InternalLogicFunctionLanguage.g:1094:1: rule__RuleDeclaration__Group_3__1__Impl : ( '<-' ) ;
    public final void rule__RuleDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1098:1: ( ( '<-' ) )
            // InternalLogicFunctionLanguage.g:1099:1: ( '<-' )
            {
            // InternalLogicFunctionLanguage.g:1099:1: ( '<-' )
            // InternalLogicFunctionLanguage.g:1100:2: '<-'
            {
             before(grammarAccess.getRuleDeclarationAccess().getLessThanSignHyphenMinusKeyword_3_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRuleDeclarationAccess().getLessThanSignHyphenMinusKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__AND__Group__0"
    // InternalLogicFunctionLanguage.g:1110:1: rule__AND__Group__0 : rule__AND__Group__0__Impl rule__AND__Group__1 ;
    public final void rule__AND__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1114:1: ( rule__AND__Group__0__Impl rule__AND__Group__1 )
            // InternalLogicFunctionLanguage.g:1115:2: rule__AND__Group__0__Impl rule__AND__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AND__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AND__Group__1();

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
    // $ANTLR end "rule__AND__Group__0"


    // $ANTLR start "rule__AND__Group__0__Impl"
    // InternalLogicFunctionLanguage.g:1122:1: rule__AND__Group__0__Impl : ( 'and' ) ;
    public final void rule__AND__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1126:1: ( ( 'and' ) )
            // InternalLogicFunctionLanguage.g:1127:1: ( 'and' )
            {
            // InternalLogicFunctionLanguage.g:1127:1: ( 'and' )
            // InternalLogicFunctionLanguage.g:1128:2: 'and'
            {
             before(grammarAccess.getANDAccess().getAndKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getANDAccess().getAndKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__0__Impl"


    // $ANTLR start "rule__AND__Group__1"
    // InternalLogicFunctionLanguage.g:1137:1: rule__AND__Group__1 : rule__AND__Group__1__Impl rule__AND__Group__2 ;
    public final void rule__AND__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1141:1: ( rule__AND__Group__1__Impl rule__AND__Group__2 )
            // InternalLogicFunctionLanguage.g:1142:2: rule__AND__Group__1__Impl rule__AND__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AND__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AND__Group__2();

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
    // $ANTLR end "rule__AND__Group__1"


    // $ANTLR start "rule__AND__Group__1__Impl"
    // InternalLogicFunctionLanguage.g:1149:1: rule__AND__Group__1__Impl : ( '(' ) ;
    public final void rule__AND__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1153:1: ( ( '(' ) )
            // InternalLogicFunctionLanguage.g:1154:1: ( '(' )
            {
            // InternalLogicFunctionLanguage.g:1154:1: ( '(' )
            // InternalLogicFunctionLanguage.g:1155:2: '('
            {
             before(grammarAccess.getANDAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getANDAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__1__Impl"


    // $ANTLR start "rule__AND__Group__2"
    // InternalLogicFunctionLanguage.g:1164:1: rule__AND__Group__2 : rule__AND__Group__2__Impl rule__AND__Group__3 ;
    public final void rule__AND__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1168:1: ( rule__AND__Group__2__Impl rule__AND__Group__3 )
            // InternalLogicFunctionLanguage.g:1169:2: rule__AND__Group__2__Impl rule__AND__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__AND__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AND__Group__3();

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
    // $ANTLR end "rule__AND__Group__2"


    // $ANTLR start "rule__AND__Group__2__Impl"
    // InternalLogicFunctionLanguage.g:1176:1: rule__AND__Group__2__Impl : ( ( rule__AND__Alternatives_2 ) ) ;
    public final void rule__AND__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1180:1: ( ( ( rule__AND__Alternatives_2 ) ) )
            // InternalLogicFunctionLanguage.g:1181:1: ( ( rule__AND__Alternatives_2 ) )
            {
            // InternalLogicFunctionLanguage.g:1181:1: ( ( rule__AND__Alternatives_2 ) )
            // InternalLogicFunctionLanguage.g:1182:2: ( rule__AND__Alternatives_2 )
            {
             before(grammarAccess.getANDAccess().getAlternatives_2()); 
            // InternalLogicFunctionLanguage.g:1183:2: ( rule__AND__Alternatives_2 )
            // InternalLogicFunctionLanguage.g:1183:3: rule__AND__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__AND__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getANDAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__2__Impl"


    // $ANTLR start "rule__AND__Group__3"
    // InternalLogicFunctionLanguage.g:1191:1: rule__AND__Group__3 : rule__AND__Group__3__Impl rule__AND__Group__4 ;
    public final void rule__AND__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1195:1: ( rule__AND__Group__3__Impl rule__AND__Group__4 )
            // InternalLogicFunctionLanguage.g:1196:2: rule__AND__Group__3__Impl rule__AND__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__AND__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AND__Group__4();

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
    // $ANTLR end "rule__AND__Group__3"


    // $ANTLR start "rule__AND__Group__3__Impl"
    // InternalLogicFunctionLanguage.g:1203:1: rule__AND__Group__3__Impl : ( ( rule__AND__Group_3__0 )* ) ;
    public final void rule__AND__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1207:1: ( ( ( rule__AND__Group_3__0 )* ) )
            // InternalLogicFunctionLanguage.g:1208:1: ( ( rule__AND__Group_3__0 )* )
            {
            // InternalLogicFunctionLanguage.g:1208:1: ( ( rule__AND__Group_3__0 )* )
            // InternalLogicFunctionLanguage.g:1209:2: ( rule__AND__Group_3__0 )*
            {
             before(grammarAccess.getANDAccess().getGroup_3()); 
            // InternalLogicFunctionLanguage.g:1210:2: ( rule__AND__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLogicFunctionLanguage.g:1210:3: rule__AND__Group_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__AND__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getANDAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__3__Impl"


    // $ANTLR start "rule__AND__Group__4"
    // InternalLogicFunctionLanguage.g:1218:1: rule__AND__Group__4 : rule__AND__Group__4__Impl ;
    public final void rule__AND__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1222:1: ( rule__AND__Group__4__Impl )
            // InternalLogicFunctionLanguage.g:1223:2: rule__AND__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AND__Group__4__Impl();

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
    // $ANTLR end "rule__AND__Group__4"


    // $ANTLR start "rule__AND__Group__4__Impl"
    // InternalLogicFunctionLanguage.g:1229:1: rule__AND__Group__4__Impl : ( ')' ) ;
    public final void rule__AND__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1233:1: ( ( ')' ) )
            // InternalLogicFunctionLanguage.g:1234:1: ( ')' )
            {
            // InternalLogicFunctionLanguage.g:1234:1: ( ')' )
            // InternalLogicFunctionLanguage.g:1235:2: ')'
            {
             before(grammarAccess.getANDAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getANDAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__4__Impl"


    // $ANTLR start "rule__AND__Group_3__0"
    // InternalLogicFunctionLanguage.g:1245:1: rule__AND__Group_3__0 : rule__AND__Group_3__0__Impl rule__AND__Group_3__1 ;
    public final void rule__AND__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1249:1: ( rule__AND__Group_3__0__Impl rule__AND__Group_3__1 )
            // InternalLogicFunctionLanguage.g:1250:2: rule__AND__Group_3__0__Impl rule__AND__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__AND__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AND__Group_3__1();

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
    // $ANTLR end "rule__AND__Group_3__0"


    // $ANTLR start "rule__AND__Group_3__0__Impl"
    // InternalLogicFunctionLanguage.g:1257:1: rule__AND__Group_3__0__Impl : ( ',' ) ;
    public final void rule__AND__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1261:1: ( ( ',' ) )
            // InternalLogicFunctionLanguage.g:1262:1: ( ',' )
            {
            // InternalLogicFunctionLanguage.g:1262:1: ( ',' )
            // InternalLogicFunctionLanguage.g:1263:2: ','
            {
             before(grammarAccess.getANDAccess().getCommaKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getANDAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group_3__0__Impl"


    // $ANTLR start "rule__AND__Group_3__1"
    // InternalLogicFunctionLanguage.g:1272:1: rule__AND__Group_3__1 : rule__AND__Group_3__1__Impl ;
    public final void rule__AND__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1276:1: ( rule__AND__Group_3__1__Impl )
            // InternalLogicFunctionLanguage.g:1277:2: rule__AND__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AND__Group_3__1__Impl();

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
    // $ANTLR end "rule__AND__Group_3__1"


    // $ANTLR start "rule__AND__Group_3__1__Impl"
    // InternalLogicFunctionLanguage.g:1283:1: rule__AND__Group_3__1__Impl : ( ( rule__AND__Alternatives_3_1 ) ) ;
    public final void rule__AND__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1287:1: ( ( ( rule__AND__Alternatives_3_1 ) ) )
            // InternalLogicFunctionLanguage.g:1288:1: ( ( rule__AND__Alternatives_3_1 ) )
            {
            // InternalLogicFunctionLanguage.g:1288:1: ( ( rule__AND__Alternatives_3_1 ) )
            // InternalLogicFunctionLanguage.g:1289:2: ( rule__AND__Alternatives_3_1 )
            {
             before(grammarAccess.getANDAccess().getAlternatives_3_1()); 
            // InternalLogicFunctionLanguage.g:1290:2: ( rule__AND__Alternatives_3_1 )
            // InternalLogicFunctionLanguage.g:1290:3: rule__AND__Alternatives_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AND__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getANDAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group_3__1__Impl"


    // $ANTLR start "rule__OR__Group__0"
    // InternalLogicFunctionLanguage.g:1299:1: rule__OR__Group__0 : rule__OR__Group__0__Impl rule__OR__Group__1 ;
    public final void rule__OR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1303:1: ( rule__OR__Group__0__Impl rule__OR__Group__1 )
            // InternalLogicFunctionLanguage.g:1304:2: rule__OR__Group__0__Impl rule__OR__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__OR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OR__Group__1();

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
    // $ANTLR end "rule__OR__Group__0"


    // $ANTLR start "rule__OR__Group__0__Impl"
    // InternalLogicFunctionLanguage.g:1311:1: rule__OR__Group__0__Impl : ( 'or' ) ;
    public final void rule__OR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1315:1: ( ( 'or' ) )
            // InternalLogicFunctionLanguage.g:1316:1: ( 'or' )
            {
            // InternalLogicFunctionLanguage.g:1316:1: ( 'or' )
            // InternalLogicFunctionLanguage.g:1317:2: 'or'
            {
             before(grammarAccess.getORAccess().getOrKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getORAccess().getOrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__0__Impl"


    // $ANTLR start "rule__OR__Group__1"
    // InternalLogicFunctionLanguage.g:1326:1: rule__OR__Group__1 : rule__OR__Group__1__Impl rule__OR__Group__2 ;
    public final void rule__OR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1330:1: ( rule__OR__Group__1__Impl rule__OR__Group__2 )
            // InternalLogicFunctionLanguage.g:1331:2: rule__OR__Group__1__Impl rule__OR__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__OR__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OR__Group__2();

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
    // $ANTLR end "rule__OR__Group__1"


    // $ANTLR start "rule__OR__Group__1__Impl"
    // InternalLogicFunctionLanguage.g:1338:1: rule__OR__Group__1__Impl : ( '(' ) ;
    public final void rule__OR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1342:1: ( ( '(' ) )
            // InternalLogicFunctionLanguage.g:1343:1: ( '(' )
            {
            // InternalLogicFunctionLanguage.g:1343:1: ( '(' )
            // InternalLogicFunctionLanguage.g:1344:2: '('
            {
             before(grammarAccess.getORAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getORAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__1__Impl"


    // $ANTLR start "rule__OR__Group__2"
    // InternalLogicFunctionLanguage.g:1353:1: rule__OR__Group__2 : rule__OR__Group__2__Impl rule__OR__Group__3 ;
    public final void rule__OR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1357:1: ( rule__OR__Group__2__Impl rule__OR__Group__3 )
            // InternalLogicFunctionLanguage.g:1358:2: rule__OR__Group__2__Impl rule__OR__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__OR__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OR__Group__3();

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
    // $ANTLR end "rule__OR__Group__2"


    // $ANTLR start "rule__OR__Group__2__Impl"
    // InternalLogicFunctionLanguage.g:1365:1: rule__OR__Group__2__Impl : ( ( rule__OR__Alternatives_2 ) ) ;
    public final void rule__OR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1369:1: ( ( ( rule__OR__Alternatives_2 ) ) )
            // InternalLogicFunctionLanguage.g:1370:1: ( ( rule__OR__Alternatives_2 ) )
            {
            // InternalLogicFunctionLanguage.g:1370:1: ( ( rule__OR__Alternatives_2 ) )
            // InternalLogicFunctionLanguage.g:1371:2: ( rule__OR__Alternatives_2 )
            {
             before(grammarAccess.getORAccess().getAlternatives_2()); 
            // InternalLogicFunctionLanguage.g:1372:2: ( rule__OR__Alternatives_2 )
            // InternalLogicFunctionLanguage.g:1372:3: rule__OR__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__OR__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getORAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__2__Impl"


    // $ANTLR start "rule__OR__Group__3"
    // InternalLogicFunctionLanguage.g:1380:1: rule__OR__Group__3 : rule__OR__Group__3__Impl rule__OR__Group__4 ;
    public final void rule__OR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1384:1: ( rule__OR__Group__3__Impl rule__OR__Group__4 )
            // InternalLogicFunctionLanguage.g:1385:2: rule__OR__Group__3__Impl rule__OR__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__OR__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OR__Group__4();

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
    // $ANTLR end "rule__OR__Group__3"


    // $ANTLR start "rule__OR__Group__3__Impl"
    // InternalLogicFunctionLanguage.g:1392:1: rule__OR__Group__3__Impl : ( ( rule__OR__Group_3__0 )* ) ;
    public final void rule__OR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1396:1: ( ( ( rule__OR__Group_3__0 )* ) )
            // InternalLogicFunctionLanguage.g:1397:1: ( ( rule__OR__Group_3__0 )* )
            {
            // InternalLogicFunctionLanguage.g:1397:1: ( ( rule__OR__Group_3__0 )* )
            // InternalLogicFunctionLanguage.g:1398:2: ( rule__OR__Group_3__0 )*
            {
             before(grammarAccess.getORAccess().getGroup_3()); 
            // InternalLogicFunctionLanguage.g:1399:2: ( rule__OR__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLogicFunctionLanguage.g:1399:3: rule__OR__Group_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__OR__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getORAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__3__Impl"


    // $ANTLR start "rule__OR__Group__4"
    // InternalLogicFunctionLanguage.g:1407:1: rule__OR__Group__4 : rule__OR__Group__4__Impl ;
    public final void rule__OR__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1411:1: ( rule__OR__Group__4__Impl )
            // InternalLogicFunctionLanguage.g:1412:2: rule__OR__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OR__Group__4__Impl();

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
    // $ANTLR end "rule__OR__Group__4"


    // $ANTLR start "rule__OR__Group__4__Impl"
    // InternalLogicFunctionLanguage.g:1418:1: rule__OR__Group__4__Impl : ( ')' ) ;
    public final void rule__OR__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1422:1: ( ( ')' ) )
            // InternalLogicFunctionLanguage.g:1423:1: ( ')' )
            {
            // InternalLogicFunctionLanguage.g:1423:1: ( ')' )
            // InternalLogicFunctionLanguage.g:1424:2: ')'
            {
             before(grammarAccess.getORAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getORAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__4__Impl"


    // $ANTLR start "rule__OR__Group_3__0"
    // InternalLogicFunctionLanguage.g:1434:1: rule__OR__Group_3__0 : rule__OR__Group_3__0__Impl rule__OR__Group_3__1 ;
    public final void rule__OR__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1438:1: ( rule__OR__Group_3__0__Impl rule__OR__Group_3__1 )
            // InternalLogicFunctionLanguage.g:1439:2: rule__OR__Group_3__0__Impl rule__OR__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__OR__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OR__Group_3__1();

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
    // $ANTLR end "rule__OR__Group_3__0"


    // $ANTLR start "rule__OR__Group_3__0__Impl"
    // InternalLogicFunctionLanguage.g:1446:1: rule__OR__Group_3__0__Impl : ( ',' ) ;
    public final void rule__OR__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1450:1: ( ( ',' ) )
            // InternalLogicFunctionLanguage.g:1451:1: ( ',' )
            {
            // InternalLogicFunctionLanguage.g:1451:1: ( ',' )
            // InternalLogicFunctionLanguage.g:1452:2: ','
            {
             before(grammarAccess.getORAccess().getCommaKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getORAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group_3__0__Impl"


    // $ANTLR start "rule__OR__Group_3__1"
    // InternalLogicFunctionLanguage.g:1461:1: rule__OR__Group_3__1 : rule__OR__Group_3__1__Impl ;
    public final void rule__OR__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1465:1: ( rule__OR__Group_3__1__Impl )
            // InternalLogicFunctionLanguage.g:1466:2: rule__OR__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OR__Group_3__1__Impl();

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
    // $ANTLR end "rule__OR__Group_3__1"


    // $ANTLR start "rule__OR__Group_3__1__Impl"
    // InternalLogicFunctionLanguage.g:1472:1: rule__OR__Group_3__1__Impl : ( ( rule__OR__Alternatives_3_1 ) ) ;
    public final void rule__OR__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1476:1: ( ( ( rule__OR__Alternatives_3_1 ) ) )
            // InternalLogicFunctionLanguage.g:1477:1: ( ( rule__OR__Alternatives_3_1 ) )
            {
            // InternalLogicFunctionLanguage.g:1477:1: ( ( rule__OR__Alternatives_3_1 ) )
            // InternalLogicFunctionLanguage.g:1478:2: ( rule__OR__Alternatives_3_1 )
            {
             before(grammarAccess.getORAccess().getAlternatives_3_1()); 
            // InternalLogicFunctionLanguage.g:1479:2: ( rule__OR__Alternatives_3_1 )
            // InternalLogicFunctionLanguage.g:1479:3: rule__OR__Alternatives_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OR__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getORAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group_3__1__Impl"


    // $ANTLR start "rule__XOR__Group__0"
    // InternalLogicFunctionLanguage.g:1488:1: rule__XOR__Group__0 : rule__XOR__Group__0__Impl rule__XOR__Group__1 ;
    public final void rule__XOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1492:1: ( rule__XOR__Group__0__Impl rule__XOR__Group__1 )
            // InternalLogicFunctionLanguage.g:1493:2: rule__XOR__Group__0__Impl rule__XOR__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__XOR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XOR__Group__1();

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
    // $ANTLR end "rule__XOR__Group__0"


    // $ANTLR start "rule__XOR__Group__0__Impl"
    // InternalLogicFunctionLanguage.g:1500:1: rule__XOR__Group__0__Impl : ( 'xor' ) ;
    public final void rule__XOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1504:1: ( ( 'xor' ) )
            // InternalLogicFunctionLanguage.g:1505:1: ( 'xor' )
            {
            // InternalLogicFunctionLanguage.g:1505:1: ( 'xor' )
            // InternalLogicFunctionLanguage.g:1506:2: 'xor'
            {
             before(grammarAccess.getXORAccess().getXorKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getXORAccess().getXorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__Group__0__Impl"


    // $ANTLR start "rule__XOR__Group__1"
    // InternalLogicFunctionLanguage.g:1515:1: rule__XOR__Group__1 : rule__XOR__Group__1__Impl rule__XOR__Group__2 ;
    public final void rule__XOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1519:1: ( rule__XOR__Group__1__Impl rule__XOR__Group__2 )
            // InternalLogicFunctionLanguage.g:1520:2: rule__XOR__Group__1__Impl rule__XOR__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__XOR__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XOR__Group__2();

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
    // $ANTLR end "rule__XOR__Group__1"


    // $ANTLR start "rule__XOR__Group__1__Impl"
    // InternalLogicFunctionLanguage.g:1527:1: rule__XOR__Group__1__Impl : ( '(' ) ;
    public final void rule__XOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1531:1: ( ( '(' ) )
            // InternalLogicFunctionLanguage.g:1532:1: ( '(' )
            {
            // InternalLogicFunctionLanguage.g:1532:1: ( '(' )
            // InternalLogicFunctionLanguage.g:1533:2: '('
            {
             before(grammarAccess.getXORAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getXORAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__Group__1__Impl"


    // $ANTLR start "rule__XOR__Group__2"
    // InternalLogicFunctionLanguage.g:1542:1: rule__XOR__Group__2 : rule__XOR__Group__2__Impl rule__XOR__Group__3 ;
    public final void rule__XOR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1546:1: ( rule__XOR__Group__2__Impl rule__XOR__Group__3 )
            // InternalLogicFunctionLanguage.g:1547:2: rule__XOR__Group__2__Impl rule__XOR__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__XOR__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XOR__Group__3();

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
    // $ANTLR end "rule__XOR__Group__2"


    // $ANTLR start "rule__XOR__Group__2__Impl"
    // InternalLogicFunctionLanguage.g:1554:1: rule__XOR__Group__2__Impl : ( ( rule__XOR__Alternatives_2 ) ) ;
    public final void rule__XOR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1558:1: ( ( ( rule__XOR__Alternatives_2 ) ) )
            // InternalLogicFunctionLanguage.g:1559:1: ( ( rule__XOR__Alternatives_2 ) )
            {
            // InternalLogicFunctionLanguage.g:1559:1: ( ( rule__XOR__Alternatives_2 ) )
            // InternalLogicFunctionLanguage.g:1560:2: ( rule__XOR__Alternatives_2 )
            {
             before(grammarAccess.getXORAccess().getAlternatives_2()); 
            // InternalLogicFunctionLanguage.g:1561:2: ( rule__XOR__Alternatives_2 )
            // InternalLogicFunctionLanguage.g:1561:3: rule__XOR__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__XOR__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getXORAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__Group__2__Impl"


    // $ANTLR start "rule__XOR__Group__3"
    // InternalLogicFunctionLanguage.g:1569:1: rule__XOR__Group__3 : rule__XOR__Group__3__Impl rule__XOR__Group__4 ;
    public final void rule__XOR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1573:1: ( rule__XOR__Group__3__Impl rule__XOR__Group__4 )
            // InternalLogicFunctionLanguage.g:1574:2: rule__XOR__Group__3__Impl rule__XOR__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__XOR__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XOR__Group__4();

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
    // $ANTLR end "rule__XOR__Group__3"


    // $ANTLR start "rule__XOR__Group__3__Impl"
    // InternalLogicFunctionLanguage.g:1581:1: rule__XOR__Group__3__Impl : ( ( rule__XOR__Group_3__0 )* ) ;
    public final void rule__XOR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1585:1: ( ( ( rule__XOR__Group_3__0 )* ) )
            // InternalLogicFunctionLanguage.g:1586:1: ( ( rule__XOR__Group_3__0 )* )
            {
            // InternalLogicFunctionLanguage.g:1586:1: ( ( rule__XOR__Group_3__0 )* )
            // InternalLogicFunctionLanguage.g:1587:2: ( rule__XOR__Group_3__0 )*
            {
             before(grammarAccess.getXORAccess().getGroup_3()); 
            // InternalLogicFunctionLanguage.g:1588:2: ( rule__XOR__Group_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLogicFunctionLanguage.g:1588:3: rule__XOR__Group_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__XOR__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getXORAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__Group__3__Impl"


    // $ANTLR start "rule__XOR__Group__4"
    // InternalLogicFunctionLanguage.g:1596:1: rule__XOR__Group__4 : rule__XOR__Group__4__Impl ;
    public final void rule__XOR__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1600:1: ( rule__XOR__Group__4__Impl )
            // InternalLogicFunctionLanguage.g:1601:2: rule__XOR__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XOR__Group__4__Impl();

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
    // $ANTLR end "rule__XOR__Group__4"


    // $ANTLR start "rule__XOR__Group__4__Impl"
    // InternalLogicFunctionLanguage.g:1607:1: rule__XOR__Group__4__Impl : ( ')' ) ;
    public final void rule__XOR__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1611:1: ( ( ')' ) )
            // InternalLogicFunctionLanguage.g:1612:1: ( ')' )
            {
            // InternalLogicFunctionLanguage.g:1612:1: ( ')' )
            // InternalLogicFunctionLanguage.g:1613:2: ')'
            {
             before(grammarAccess.getXORAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getXORAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__Group__4__Impl"


    // $ANTLR start "rule__XOR__Group_3__0"
    // InternalLogicFunctionLanguage.g:1623:1: rule__XOR__Group_3__0 : rule__XOR__Group_3__0__Impl rule__XOR__Group_3__1 ;
    public final void rule__XOR__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1627:1: ( rule__XOR__Group_3__0__Impl rule__XOR__Group_3__1 )
            // InternalLogicFunctionLanguage.g:1628:2: rule__XOR__Group_3__0__Impl rule__XOR__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__XOR__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XOR__Group_3__1();

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
    // $ANTLR end "rule__XOR__Group_3__0"


    // $ANTLR start "rule__XOR__Group_3__0__Impl"
    // InternalLogicFunctionLanguage.g:1635:1: rule__XOR__Group_3__0__Impl : ( ',' ) ;
    public final void rule__XOR__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1639:1: ( ( ',' ) )
            // InternalLogicFunctionLanguage.g:1640:1: ( ',' )
            {
            // InternalLogicFunctionLanguage.g:1640:1: ( ',' )
            // InternalLogicFunctionLanguage.g:1641:2: ','
            {
             before(grammarAccess.getXORAccess().getCommaKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXORAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__Group_3__0__Impl"


    // $ANTLR start "rule__XOR__Group_3__1"
    // InternalLogicFunctionLanguage.g:1650:1: rule__XOR__Group_3__1 : rule__XOR__Group_3__1__Impl ;
    public final void rule__XOR__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1654:1: ( rule__XOR__Group_3__1__Impl )
            // InternalLogicFunctionLanguage.g:1655:2: rule__XOR__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XOR__Group_3__1__Impl();

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
    // $ANTLR end "rule__XOR__Group_3__1"


    // $ANTLR start "rule__XOR__Group_3__1__Impl"
    // InternalLogicFunctionLanguage.g:1661:1: rule__XOR__Group_3__1__Impl : ( ( rule__XOR__Alternatives_3_1 ) ) ;
    public final void rule__XOR__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1665:1: ( ( ( rule__XOR__Alternatives_3_1 ) ) )
            // InternalLogicFunctionLanguage.g:1666:1: ( ( rule__XOR__Alternatives_3_1 ) )
            {
            // InternalLogicFunctionLanguage.g:1666:1: ( ( rule__XOR__Alternatives_3_1 ) )
            // InternalLogicFunctionLanguage.g:1667:2: ( rule__XOR__Alternatives_3_1 )
            {
             before(grammarAccess.getXORAccess().getAlternatives_3_1()); 
            // InternalLogicFunctionLanguage.g:1668:2: ( rule__XOR__Alternatives_3_1 )
            // InternalLogicFunctionLanguage.g:1668:3: rule__XOR__Alternatives_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XOR__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXORAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__Group_3__1__Impl"


    // $ANTLR start "rule__NOT__Group__0"
    // InternalLogicFunctionLanguage.g:1677:1: rule__NOT__Group__0 : rule__NOT__Group__0__Impl rule__NOT__Group__1 ;
    public final void rule__NOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1681:1: ( rule__NOT__Group__0__Impl rule__NOT__Group__1 )
            // InternalLogicFunctionLanguage.g:1682:2: rule__NOT__Group__0__Impl rule__NOT__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__NOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NOT__Group__1();

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
    // $ANTLR end "rule__NOT__Group__0"


    // $ANTLR start "rule__NOT__Group__0__Impl"
    // InternalLogicFunctionLanguage.g:1689:1: rule__NOT__Group__0__Impl : ( 'not' ) ;
    public final void rule__NOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1693:1: ( ( 'not' ) )
            // InternalLogicFunctionLanguage.g:1694:1: ( 'not' )
            {
            // InternalLogicFunctionLanguage.g:1694:1: ( 'not' )
            // InternalLogicFunctionLanguage.g:1695:2: 'not'
            {
             before(grammarAccess.getNOTAccess().getNotKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNOTAccess().getNotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NOT__Group__0__Impl"


    // $ANTLR start "rule__NOT__Group__1"
    // InternalLogicFunctionLanguage.g:1704:1: rule__NOT__Group__1 : rule__NOT__Group__1__Impl rule__NOT__Group__2 ;
    public final void rule__NOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1708:1: ( rule__NOT__Group__1__Impl rule__NOT__Group__2 )
            // InternalLogicFunctionLanguage.g:1709:2: rule__NOT__Group__1__Impl rule__NOT__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__NOT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NOT__Group__2();

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
    // $ANTLR end "rule__NOT__Group__1"


    // $ANTLR start "rule__NOT__Group__1__Impl"
    // InternalLogicFunctionLanguage.g:1716:1: rule__NOT__Group__1__Impl : ( '(' ) ;
    public final void rule__NOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1720:1: ( ( '(' ) )
            // InternalLogicFunctionLanguage.g:1721:1: ( '(' )
            {
            // InternalLogicFunctionLanguage.g:1721:1: ( '(' )
            // InternalLogicFunctionLanguage.g:1722:2: '('
            {
             before(grammarAccess.getNOTAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNOTAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NOT__Group__1__Impl"


    // $ANTLR start "rule__NOT__Group__2"
    // InternalLogicFunctionLanguage.g:1731:1: rule__NOT__Group__2 : rule__NOT__Group__2__Impl rule__NOT__Group__3 ;
    public final void rule__NOT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1735:1: ( rule__NOT__Group__2__Impl rule__NOT__Group__3 )
            // InternalLogicFunctionLanguage.g:1736:2: rule__NOT__Group__2__Impl rule__NOT__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__NOT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NOT__Group__3();

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
    // $ANTLR end "rule__NOT__Group__2"


    // $ANTLR start "rule__NOT__Group__2__Impl"
    // InternalLogicFunctionLanguage.g:1743:1: rule__NOT__Group__2__Impl : ( ( rule__NOT__Alternatives_2 ) ) ;
    public final void rule__NOT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1747:1: ( ( ( rule__NOT__Alternatives_2 ) ) )
            // InternalLogicFunctionLanguage.g:1748:1: ( ( rule__NOT__Alternatives_2 ) )
            {
            // InternalLogicFunctionLanguage.g:1748:1: ( ( rule__NOT__Alternatives_2 ) )
            // InternalLogicFunctionLanguage.g:1749:2: ( rule__NOT__Alternatives_2 )
            {
             before(grammarAccess.getNOTAccess().getAlternatives_2()); 
            // InternalLogicFunctionLanguage.g:1750:2: ( rule__NOT__Alternatives_2 )
            // InternalLogicFunctionLanguage.g:1750:3: rule__NOT__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__NOT__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getNOTAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NOT__Group__2__Impl"


    // $ANTLR start "rule__NOT__Group__3"
    // InternalLogicFunctionLanguage.g:1758:1: rule__NOT__Group__3 : rule__NOT__Group__3__Impl ;
    public final void rule__NOT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1762:1: ( rule__NOT__Group__3__Impl )
            // InternalLogicFunctionLanguage.g:1763:2: rule__NOT__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NOT__Group__3__Impl();

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
    // $ANTLR end "rule__NOT__Group__3"


    // $ANTLR start "rule__NOT__Group__3__Impl"
    // InternalLogicFunctionLanguage.g:1769:1: rule__NOT__Group__3__Impl : ( ')' ) ;
    public final void rule__NOT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1773:1: ( ( ')' ) )
            // InternalLogicFunctionLanguage.g:1774:1: ( ')' )
            {
            // InternalLogicFunctionLanguage.g:1774:1: ( ')' )
            // InternalLogicFunctionLanguage.g:1775:2: ')'
            {
             before(grammarAccess.getNOTAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNOTAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NOT__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalLogicFunctionLanguage.g:1785:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1789:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalLogicFunctionLanguage.g:1790:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
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
    // InternalLogicFunctionLanguage.g:1797:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1801:1: ( ( 'interface' ) )
            // InternalLogicFunctionLanguage.g:1802:1: ( 'interface' )
            {
            // InternalLogicFunctionLanguage.g:1802:1: ( 'interface' )
            // InternalLogicFunctionLanguage.g:1803:2: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalLogicFunctionLanguage.g:1812:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1816:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalLogicFunctionLanguage.g:1817:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
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
    // InternalLogicFunctionLanguage.g:1824:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1828:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // InternalLogicFunctionLanguage.g:1829:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // InternalLogicFunctionLanguage.g:1829:1: ( ( rule__Interface__NameAssignment_1 ) )
            // InternalLogicFunctionLanguage.g:1830:2: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // InternalLogicFunctionLanguage.g:1831:2: ( rule__Interface__NameAssignment_1 )
            // InternalLogicFunctionLanguage.g:1831:3: rule__Interface__NameAssignment_1
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
    // InternalLogicFunctionLanguage.g:1839:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1843:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalLogicFunctionLanguage.g:1844:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalLogicFunctionLanguage.g:1851:1: rule__Interface__Group__2__Impl : ( '{' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1855:1: ( ( '{' ) )
            // InternalLogicFunctionLanguage.g:1856:1: ( '{' )
            {
            // InternalLogicFunctionLanguage.g:1856:1: ( '{' )
            // InternalLogicFunctionLanguage.g:1857:2: '{'
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
    // InternalLogicFunctionLanguage.g:1866:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1870:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalLogicFunctionLanguage.g:1871:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalLogicFunctionLanguage.g:1878:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__EventsAssignment_3 )* ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1882:1: ( ( ( rule__Interface__EventsAssignment_3 )* ) )
            // InternalLogicFunctionLanguage.g:1883:1: ( ( rule__Interface__EventsAssignment_3 )* )
            {
            // InternalLogicFunctionLanguage.g:1883:1: ( ( rule__Interface__EventsAssignment_3 )* )
            // InternalLogicFunctionLanguage.g:1884:2: ( rule__Interface__EventsAssignment_3 )*
            {
             before(grammarAccess.getInterfaceAccess().getEventsAssignment_3()); 
            // InternalLogicFunctionLanguage.g:1885:2: ( rule__Interface__EventsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=12 && LA17_0<=13)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLogicFunctionLanguage.g:1885:3: rule__Interface__EventsAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Interface__EventsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalLogicFunctionLanguage.g:1893:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1897:1: ( rule__Interface__Group__4__Impl )
            // InternalLogicFunctionLanguage.g:1898:2: rule__Interface__Group__4__Impl
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
    // InternalLogicFunctionLanguage.g:1904:1: rule__Interface__Group__4__Impl : ( '}' ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1908:1: ( ( '}' ) )
            // InternalLogicFunctionLanguage.g:1909:1: ( '}' )
            {
            // InternalLogicFunctionLanguage.g:1909:1: ( '}' )
            // InternalLogicFunctionLanguage.g:1910:2: '}'
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
    // InternalLogicFunctionLanguage.g:1920:1: rule__EventDeclaration__Group__0 : rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 ;
    public final void rule__EventDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1924:1: ( rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 )
            // InternalLogicFunctionLanguage.g:1925:2: rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalLogicFunctionLanguage.g:1932:1: rule__EventDeclaration__Group__0__Impl : ( ( rule__EventDeclaration__DirectionAssignment_0 ) ) ;
    public final void rule__EventDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1936:1: ( ( ( rule__EventDeclaration__DirectionAssignment_0 ) ) )
            // InternalLogicFunctionLanguage.g:1937:1: ( ( rule__EventDeclaration__DirectionAssignment_0 ) )
            {
            // InternalLogicFunctionLanguage.g:1937:1: ( ( rule__EventDeclaration__DirectionAssignment_0 ) )
            // InternalLogicFunctionLanguage.g:1938:2: ( rule__EventDeclaration__DirectionAssignment_0 )
            {
             before(grammarAccess.getEventDeclarationAccess().getDirectionAssignment_0()); 
            // InternalLogicFunctionLanguage.g:1939:2: ( rule__EventDeclaration__DirectionAssignment_0 )
            // InternalLogicFunctionLanguage.g:1939:3: rule__EventDeclaration__DirectionAssignment_0
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
    // InternalLogicFunctionLanguage.g:1947:1: rule__EventDeclaration__Group__1 : rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 ;
    public final void rule__EventDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1951:1: ( rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 )
            // InternalLogicFunctionLanguage.g:1952:2: rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalLogicFunctionLanguage.g:1959:1: rule__EventDeclaration__Group__1__Impl : ( ( rule__EventDeclaration__ExtraValueTypeAssignment_1 )? ) ;
    public final void rule__EventDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1963:1: ( ( ( rule__EventDeclaration__ExtraValueTypeAssignment_1 )? ) )
            // InternalLogicFunctionLanguage.g:1964:1: ( ( rule__EventDeclaration__ExtraValueTypeAssignment_1 )? )
            {
            // InternalLogicFunctionLanguage.g:1964:1: ( ( rule__EventDeclaration__ExtraValueTypeAssignment_1 )? )
            // InternalLogicFunctionLanguage.g:1965:2: ( rule__EventDeclaration__ExtraValueTypeAssignment_1 )?
            {
             before(grammarAccess.getEventDeclarationAccess().getExtraValueTypeAssignment_1()); 
            // InternalLogicFunctionLanguage.g:1966:2: ( rule__EventDeclaration__ExtraValueTypeAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==11) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLogicFunctionLanguage.g:1966:3: rule__EventDeclaration__ExtraValueTypeAssignment_1
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
    // InternalLogicFunctionLanguage.g:1974:1: rule__EventDeclaration__Group__2 : rule__EventDeclaration__Group__2__Impl ;
    public final void rule__EventDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1978:1: ( rule__EventDeclaration__Group__2__Impl )
            // InternalLogicFunctionLanguage.g:1979:2: rule__EventDeclaration__Group__2__Impl
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
    // InternalLogicFunctionLanguage.g:1985:1: rule__EventDeclaration__Group__2__Impl : ( ( rule__EventDeclaration__NameAssignment_2 ) ) ;
    public final void rule__EventDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:1989:1: ( ( ( rule__EventDeclaration__NameAssignment_2 ) ) )
            // InternalLogicFunctionLanguage.g:1990:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            {
            // InternalLogicFunctionLanguage.g:1990:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            // InternalLogicFunctionLanguage.g:1991:2: ( rule__EventDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getEventDeclarationAccess().getNameAssignment_2()); 
            // InternalLogicFunctionLanguage.g:1992:2: ( rule__EventDeclaration__NameAssignment_2 )
            // InternalLogicFunctionLanguage.g:1992:3: rule__EventDeclaration__NameAssignment_2
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


    // $ANTLR start "rule__Predicate__Group__0"
    // InternalLogicFunctionLanguage.g:2001:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2005:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // InternalLogicFunctionLanguage.g:2006:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Predicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__1();

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
    // $ANTLR end "rule__Predicate__Group__0"


    // $ANTLR start "rule__Predicate__Group__0__Impl"
    // InternalLogicFunctionLanguage.g:2013:1: rule__Predicate__Group__0__Impl : ( 'income' ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2017:1: ( ( 'income' ) )
            // InternalLogicFunctionLanguage.g:2018:1: ( 'income' )
            {
            // InternalLogicFunctionLanguage.g:2018:1: ( 'income' )
            // InternalLogicFunctionLanguage.g:2019:2: 'income'
            {
             before(grammarAccess.getPredicateAccess().getIncomeKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getIncomeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__0__Impl"


    // $ANTLR start "rule__Predicate__Group__1"
    // InternalLogicFunctionLanguage.g:2028:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2032:1: ( rule__Predicate__Group__1__Impl )
            // InternalLogicFunctionLanguage.g:2033:2: rule__Predicate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__1__Impl();

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
    // $ANTLR end "rule__Predicate__Group__1"


    // $ANTLR start "rule__Predicate__Group__1__Impl"
    // InternalLogicFunctionLanguage.g:2039:1: rule__Predicate__Group__1__Impl : ( ( rule__Predicate__ListensAssignment_1 ) ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2043:1: ( ( ( rule__Predicate__ListensAssignment_1 ) ) )
            // InternalLogicFunctionLanguage.g:2044:1: ( ( rule__Predicate__ListensAssignment_1 ) )
            {
            // InternalLogicFunctionLanguage.g:2044:1: ( ( rule__Predicate__ListensAssignment_1 ) )
            // InternalLogicFunctionLanguage.g:2045:2: ( rule__Predicate__ListensAssignment_1 )
            {
             before(grammarAccess.getPredicateAccess().getListensAssignment_1()); 
            // InternalLogicFunctionLanguage.g:2046:2: ( rule__Predicate__ListensAssignment_1 )
            // InternalLogicFunctionLanguage.g:2046:3: rule__Predicate__ListensAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__ListensAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getListensAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalLogicFunctionLanguage.g:2055:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2059:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalLogicFunctionLanguage.g:2060:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalLogicFunctionLanguage.g:2067:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2071:1: ( ( RULE_ID ) )
            // InternalLogicFunctionLanguage.g:2072:1: ( RULE_ID )
            {
            // InternalLogicFunctionLanguage.g:2072:1: ( RULE_ID )
            // InternalLogicFunctionLanguage.g:2073:2: RULE_ID
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
    // InternalLogicFunctionLanguage.g:2082:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2086:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalLogicFunctionLanguage.g:2087:2: rule__QualifiedName__Group__1__Impl
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
    // InternalLogicFunctionLanguage.g:2093:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2097:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalLogicFunctionLanguage.g:2098:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalLogicFunctionLanguage.g:2098:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalLogicFunctionLanguage.g:2099:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalLogicFunctionLanguage.g:2100:2: ( rule__QualifiedName__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLogicFunctionLanguage.g:2100:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalLogicFunctionLanguage.g:2109:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2113:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalLogicFunctionLanguage.g:2114:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalLogicFunctionLanguage.g:2121:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2125:1: ( ( '.' ) )
            // InternalLogicFunctionLanguage.g:2126:1: ( '.' )
            {
            // InternalLogicFunctionLanguage.g:2126:1: ( '.' )
            // InternalLogicFunctionLanguage.g:2127:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalLogicFunctionLanguage.g:2136:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2140:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalLogicFunctionLanguage.g:2141:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalLogicFunctionLanguage.g:2147:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2151:1: ( ( RULE_ID ) )
            // InternalLogicFunctionLanguage.g:2152:1: ( RULE_ID )
            {
            // InternalLogicFunctionLanguage.g:2152:1: ( RULE_ID )
            // InternalLogicFunctionLanguage.g:2153:2: RULE_ID
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


    // $ANTLR start "rule__LogicFunctionDiagram__NameAssignment_1"
    // InternalLogicFunctionLanguage.g:2163:1: rule__LogicFunctionDiagram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LogicFunctionDiagram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2167:1: ( ( RULE_ID ) )
            // InternalLogicFunctionLanguage.g:2168:2: ( RULE_ID )
            {
            // InternalLogicFunctionLanguage.g:2168:2: ( RULE_ID )
            // InternalLogicFunctionLanguage.g:2169:3: RULE_ID
            {
             before(grammarAccess.getLogicFunctionDiagramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLogicFunctionDiagramAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicFunctionDiagram__NameAssignment_1"


    // $ANTLR start "rule__LogicFunctionDiagram__RuleAssignment_3_0"
    // InternalLogicFunctionLanguage.g:2178:1: rule__LogicFunctionDiagram__RuleAssignment_3_0 : ( ruleRuleDeclaration ) ;
    public final void rule__LogicFunctionDiagram__RuleAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2182:1: ( ( ruleRuleDeclaration ) )
            // InternalLogicFunctionLanguage.g:2183:2: ( ruleRuleDeclaration )
            {
            // InternalLogicFunctionLanguage.g:2183:2: ( ruleRuleDeclaration )
            // InternalLogicFunctionLanguage.g:2184:3: ruleRuleDeclaration
            {
             before(grammarAccess.getLogicFunctionDiagramAccess().getRuleRuleDeclarationParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleDeclaration();

            state._fsp--;

             after(grammarAccess.getLogicFunctionDiagramAccess().getRuleRuleDeclarationParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicFunctionDiagram__RuleAssignment_3_0"


    // $ANTLR start "rule__LogicFunctionDiagram__InterfacesAssignment_3_1"
    // InternalLogicFunctionLanguage.g:2193:1: rule__LogicFunctionDiagram__InterfacesAssignment_3_1 : ( ruleInterface ) ;
    public final void rule__LogicFunctionDiagram__InterfacesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2197:1: ( ( ruleInterface ) )
            // InternalLogicFunctionLanguage.g:2198:2: ( ruleInterface )
            {
            // InternalLogicFunctionLanguage.g:2198:2: ( ruleInterface )
            // InternalLogicFunctionLanguage.g:2199:3: ruleInterface
            {
             before(grammarAccess.getLogicFunctionDiagramAccess().getInterfacesInterfaceParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getLogicFunctionDiagramAccess().getInterfacesInterfaceParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicFunctionDiagram__InterfacesAssignment_3_1"


    // $ANTLR start "rule__RuleDeclaration__NameAssignment_1"
    // InternalLogicFunctionLanguage.g:2208:1: rule__RuleDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2212:1: ( ( RULE_ID ) )
            // InternalLogicFunctionLanguage.g:2213:2: ( RULE_ID )
            {
            // InternalLogicFunctionLanguage.g:2213:2: ( RULE_ID )
            // InternalLogicFunctionLanguage.g:2214:3: RULE_ID
            {
             before(grammarAccess.getRuleDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__NameAssignment_1"


    // $ANTLR start "rule__RuleDeclaration__RaisesAssignment_3_0"
    // InternalLogicFunctionLanguage.g:2223:1: rule__RuleDeclaration__RaisesAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RuleDeclaration__RaisesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2227:1: ( ( ( ruleQualifiedName ) ) )
            // InternalLogicFunctionLanguage.g:2228:2: ( ( ruleQualifiedName ) )
            {
            // InternalLogicFunctionLanguage.g:2228:2: ( ( ruleQualifiedName ) )
            // InternalLogicFunctionLanguage.g:2229:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRuleDeclarationAccess().getRaisesEventCrossReference_3_0_0()); 
            // InternalLogicFunctionLanguage.g:2230:3: ( ruleQualifiedName )
            // InternalLogicFunctionLanguage.g:2231:4: ruleQualifiedName
            {
             before(grammarAccess.getRuleDeclarationAccess().getRaisesEventQualifiedNameParserRuleCall_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRuleDeclarationAccess().getRaisesEventQualifiedNameParserRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getRuleDeclarationAccess().getRaisesEventCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__RaisesAssignment_3_0"


    // $ANTLR start "rule__RuleDeclaration__ExpressionAssignment_4_0"
    // InternalLogicFunctionLanguage.g:2242:1: rule__RuleDeclaration__ExpressionAssignment_4_0 : ( ruleAND ) ;
    public final void rule__RuleDeclaration__ExpressionAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2246:1: ( ( ruleAND ) )
            // InternalLogicFunctionLanguage.g:2247:2: ( ruleAND )
            {
            // InternalLogicFunctionLanguage.g:2247:2: ( ruleAND )
            // InternalLogicFunctionLanguage.g:2248:3: ruleAND
            {
             before(grammarAccess.getRuleDeclarationAccess().getExpressionANDParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAND();

            state._fsp--;

             after(grammarAccess.getRuleDeclarationAccess().getExpressionANDParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__ExpressionAssignment_4_0"


    // $ANTLR start "rule__RuleDeclaration__ExpressionAssignment_4_1"
    // InternalLogicFunctionLanguage.g:2257:1: rule__RuleDeclaration__ExpressionAssignment_4_1 : ( ruleOR ) ;
    public final void rule__RuleDeclaration__ExpressionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2261:1: ( ( ruleOR ) )
            // InternalLogicFunctionLanguage.g:2262:2: ( ruleOR )
            {
            // InternalLogicFunctionLanguage.g:2262:2: ( ruleOR )
            // InternalLogicFunctionLanguage.g:2263:3: ruleOR
            {
             before(grammarAccess.getRuleDeclarationAccess().getExpressionORParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOR();

            state._fsp--;

             after(grammarAccess.getRuleDeclarationAccess().getExpressionORParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__ExpressionAssignment_4_1"


    // $ANTLR start "rule__RuleDeclaration__ExpressionAssignment_4_2"
    // InternalLogicFunctionLanguage.g:2272:1: rule__RuleDeclaration__ExpressionAssignment_4_2 : ( ruleXOR ) ;
    public final void rule__RuleDeclaration__ExpressionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2276:1: ( ( ruleXOR ) )
            // InternalLogicFunctionLanguage.g:2277:2: ( ruleXOR )
            {
            // InternalLogicFunctionLanguage.g:2277:2: ( ruleXOR )
            // InternalLogicFunctionLanguage.g:2278:3: ruleXOR
            {
             before(grammarAccess.getRuleDeclarationAccess().getExpressionXORParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXOR();

            state._fsp--;

             after(grammarAccess.getRuleDeclarationAccess().getExpressionXORParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__ExpressionAssignment_4_2"


    // $ANTLR start "rule__RuleDeclaration__ExpressionAssignment_4_3"
    // InternalLogicFunctionLanguage.g:2287:1: rule__RuleDeclaration__ExpressionAssignment_4_3 : ( ruleNOT ) ;
    public final void rule__RuleDeclaration__ExpressionAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2291:1: ( ( ruleNOT ) )
            // InternalLogicFunctionLanguage.g:2292:2: ( ruleNOT )
            {
            // InternalLogicFunctionLanguage.g:2292:2: ( ruleNOT )
            // InternalLogicFunctionLanguage.g:2293:3: ruleNOT
            {
             before(grammarAccess.getRuleDeclarationAccess().getExpressionNOTParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNOT();

            state._fsp--;

             after(grammarAccess.getRuleDeclarationAccess().getExpressionNOTParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__ExpressionAssignment_4_3"


    // $ANTLR start "rule__RuleDeclaration__ExpressionAssignment_4_4"
    // InternalLogicFunctionLanguage.g:2302:1: rule__RuleDeclaration__ExpressionAssignment_4_4 : ( rulePredicateListen ) ;
    public final void rule__RuleDeclaration__ExpressionAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2306:1: ( ( rulePredicateListen ) )
            // InternalLogicFunctionLanguage.g:2307:2: ( rulePredicateListen )
            {
            // InternalLogicFunctionLanguage.g:2307:2: ( rulePredicateListen )
            // InternalLogicFunctionLanguage.g:2308:3: rulePredicateListen
            {
             before(grammarAccess.getRuleDeclarationAccess().getExpressionPredicateListenParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_2);
            rulePredicateListen();

            state._fsp--;

             after(grammarAccess.getRuleDeclarationAccess().getExpressionPredicateListenParserRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__ExpressionAssignment_4_4"


    // $ANTLR start "rule__RuleDeclaration__ExpressionAssignment_4_5"
    // InternalLogicFunctionLanguage.g:2317:1: rule__RuleDeclaration__ExpressionAssignment_4_5 : ( ruleRuleListen ) ;
    public final void rule__RuleDeclaration__ExpressionAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2321:1: ( ( ruleRuleListen ) )
            // InternalLogicFunctionLanguage.g:2322:2: ( ruleRuleListen )
            {
            // InternalLogicFunctionLanguage.g:2322:2: ( ruleRuleListen )
            // InternalLogicFunctionLanguage.g:2323:3: ruleRuleListen
            {
             before(grammarAccess.getRuleDeclarationAccess().getExpressionRuleListenParserRuleCall_4_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleListen();

            state._fsp--;

             after(grammarAccess.getRuleDeclarationAccess().getExpressionRuleListenParserRuleCall_4_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__ExpressionAssignment_4_5"


    // $ANTLR start "rule__AND__ArgumentsAssignment_2_0"
    // InternalLogicFunctionLanguage.g:2332:1: rule__AND__ArgumentsAssignment_2_0 : ( ruleAND ) ;
    public final void rule__AND__ArgumentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2336:1: ( ( ruleAND ) )
            // InternalLogicFunctionLanguage.g:2337:2: ( ruleAND )
            {
            // InternalLogicFunctionLanguage.g:2337:2: ( ruleAND )
            // InternalLogicFunctionLanguage.g:2338:3: ruleAND
            {
             before(grammarAccess.getANDAccess().getArgumentsANDParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAND();

            state._fsp--;

             after(grammarAccess.getANDAccess().getArgumentsANDParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__ArgumentsAssignment_2_0"


    // $ANTLR start "rule__AND__ArgumentsAssignment_2_1"
    // InternalLogicFunctionLanguage.g:2347:1: rule__AND__ArgumentsAssignment_2_1 : ( ruleOR ) ;
    public final void rule__AND__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2351:1: ( ( ruleOR ) )
            // InternalLogicFunctionLanguage.g:2352:2: ( ruleOR )
            {
            // InternalLogicFunctionLanguage.g:2352:2: ( ruleOR )
            // InternalLogicFunctionLanguage.g:2353:3: ruleOR
            {
             before(grammarAccess.getANDAccess().getArgumentsORParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOR();

            state._fsp--;

             after(grammarAccess.getANDAccess().getArgumentsORParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__ArgumentsAssignment_2_1"


    // $ANTLR start "rule__AND__ArgumentsAssignment_2_2"
    // InternalLogicFunctionLanguage.g:2362:1: rule__AND__ArgumentsAssignment_2_2 : ( ruleXOR ) ;
    public final void rule__AND__ArgumentsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2366:1: ( ( ruleXOR ) )
            // InternalLogicFunctionLanguage.g:2367:2: ( ruleXOR )
            {
            // InternalLogicFunctionLanguage.g:2367:2: ( ruleXOR )
            // InternalLogicFunctionLanguage.g:2368:3: ruleXOR
            {
             before(grammarAccess.getANDAccess().getArgumentsXORParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXOR();

            state._fsp--;

             after(grammarAccess.getANDAccess().getArgumentsXORParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__ArgumentsAssignment_2_2"


    // $ANTLR start "rule__AND__ArgumentsAssignment_2_3"
    // InternalLogicFunctionLanguage.g:2377:1: rule__AND__ArgumentsAssignment_2_3 : ( ruleNOT ) ;
    public final void rule__AND__ArgumentsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2381:1: ( ( ruleNOT ) )
            // InternalLogicFunctionLanguage.g:2382:2: ( ruleNOT )
            {
            // InternalLogicFunctionLanguage.g:2382:2: ( ruleNOT )
            // InternalLogicFunctionLanguage.g:2383:3: ruleNOT
            {
             before(grammarAccess.getANDAccess().getArgumentsNOTParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNOT();

            state._fsp--;

             after(grammarAccess.getANDAccess().getArgumentsNOTParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__ArgumentsAssignment_2_3"


    // $ANTLR start "rule__AND__ArgumentsAssignment_2_4"
    // InternalLogicFunctionLanguage.g:2392:1: rule__AND__ArgumentsAssignment_2_4 : ( rulePredicateListen ) ;
    public final void rule__AND__ArgumentsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2396:1: ( ( rulePredicateListen ) )
            // InternalLogicFunctionLanguage.g:2397:2: ( rulePredicateListen )
            {
            // InternalLogicFunctionLanguage.g:2397:2: ( rulePredicateListen )
            // InternalLogicFunctionLanguage.g:2398:3: rulePredicateListen
            {
             before(grammarAccess.getANDAccess().getArgumentsPredicateListenParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            rulePredicateListen();

            state._fsp--;

             after(grammarAccess.getANDAccess().getArgumentsPredicateListenParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__ArgumentsAssignment_2_4"


    // $ANTLR start "rule__AND__ArgumentsAssignment_2_5"
    // InternalLogicFunctionLanguage.g:2407:1: rule__AND__ArgumentsAssignment_2_5 : ( ruleRuleListen ) ;
    public final void rule__AND__ArgumentsAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2411:1: ( ( ruleRuleListen ) )
            // InternalLogicFunctionLanguage.g:2412:2: ( ruleRuleListen )
            {
            // InternalLogicFunctionLanguage.g:2412:2: ( ruleRuleListen )
            // InternalLogicFunctionLanguage.g:2413:3: ruleRuleListen
            {
             before(grammarAccess.getANDAccess().getArgumentsRuleListenParserRuleCall_2_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleListen();

            state._fsp--;

             after(grammarAccess.getANDAccess().getArgumentsRuleListenParserRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__ArgumentsAssignment_2_5"


    // $ANTLR start "rule__AND__ArgumentsAssignment_3_1_0"
    // InternalLogicFunctionLanguage.g:2422:1: rule__AND__ArgumentsAssignment_3_1_0 : ( ruleAND ) ;
    public final void rule__AND__ArgumentsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2426:1: ( ( ruleAND ) )
            // InternalLogicFunctionLanguage.g:2427:2: ( ruleAND )
            {
            // InternalLogicFunctionLanguage.g:2427:2: ( ruleAND )
            // InternalLogicFunctionLanguage.g:2428:3: ruleAND
            {
             before(grammarAccess.getANDAccess().getArgumentsANDParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAND();

            state._fsp--;

             after(grammarAccess.getANDAccess().getArgumentsANDParserRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__ArgumentsAssignment_3_1_0"


    // $ANTLR start "rule__AND__ArgumentsAssignment_3_1_1"
    // InternalLogicFunctionLanguage.g:2437:1: rule__AND__ArgumentsAssignment_3_1_1 : ( ruleOR ) ;
    public final void rule__AND__ArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2441:1: ( ( ruleOR ) )
            // InternalLogicFunctionLanguage.g:2442:2: ( ruleOR )
            {
            // InternalLogicFunctionLanguage.g:2442:2: ( ruleOR )
            // InternalLogicFunctionLanguage.g:2443:3: ruleOR
            {
             before(grammarAccess.getANDAccess().getArgumentsORParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOR();

            state._fsp--;

             after(grammarAccess.getANDAccess().getArgumentsORParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__ArgumentsAssignment_3_1_1"


    // $ANTLR start "rule__AND__ArgumentsAssignment_3_1_2"
    // InternalLogicFunctionLanguage.g:2452:1: rule__AND__ArgumentsAssignment_3_1_2 : ( ruleXOR ) ;
    public final void rule__AND__ArgumentsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2456:1: ( ( ruleXOR ) )
            // InternalLogicFunctionLanguage.g:2457:2: ( ruleXOR )
            {
            // InternalLogicFunctionLanguage.g:2457:2: ( ruleXOR )
            // InternalLogicFunctionLanguage.g:2458:3: ruleXOR
            {
             before(grammarAccess.getANDAccess().getArgumentsXORParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXOR();

            state._fsp--;

             after(grammarAccess.getANDAccess().getArgumentsXORParserRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__ArgumentsAssignment_3_1_2"


    // $ANTLR start "rule__AND__ArgumentsAssignment_3_1_3"
    // InternalLogicFunctionLanguage.g:2467:1: rule__AND__ArgumentsAssignment_3_1_3 : ( ruleNOT ) ;
    public final void rule__AND__ArgumentsAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2471:1: ( ( ruleNOT ) )
            // InternalLogicFunctionLanguage.g:2472:2: ( ruleNOT )
            {
            // InternalLogicFunctionLanguage.g:2472:2: ( ruleNOT )
            // InternalLogicFunctionLanguage.g:2473:3: ruleNOT
            {
             before(grammarAccess.getANDAccess().getArgumentsNOTParserRuleCall_3_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNOT();

            state._fsp--;

             after(grammarAccess.getANDAccess().getArgumentsNOTParserRuleCall_3_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__ArgumentsAssignment_3_1_3"


    // $ANTLR start "rule__AND__ArgumentsAssignment_3_1_4"
    // InternalLogicFunctionLanguage.g:2482:1: rule__AND__ArgumentsAssignment_3_1_4 : ( rulePredicateListen ) ;
    public final void rule__AND__ArgumentsAssignment_3_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2486:1: ( ( rulePredicateListen ) )
            // InternalLogicFunctionLanguage.g:2487:2: ( rulePredicateListen )
            {
            // InternalLogicFunctionLanguage.g:2487:2: ( rulePredicateListen )
            // InternalLogicFunctionLanguage.g:2488:3: rulePredicateListen
            {
             before(grammarAccess.getANDAccess().getArgumentsPredicateListenParserRuleCall_3_1_4_0()); 
            pushFollow(FOLLOW_2);
            rulePredicateListen();

            state._fsp--;

             after(grammarAccess.getANDAccess().getArgumentsPredicateListenParserRuleCall_3_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__ArgumentsAssignment_3_1_4"


    // $ANTLR start "rule__AND__ArgumentsAssignment_3_1_5"
    // InternalLogicFunctionLanguage.g:2497:1: rule__AND__ArgumentsAssignment_3_1_5 : ( ruleRuleListen ) ;
    public final void rule__AND__ArgumentsAssignment_3_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2501:1: ( ( ruleRuleListen ) )
            // InternalLogicFunctionLanguage.g:2502:2: ( ruleRuleListen )
            {
            // InternalLogicFunctionLanguage.g:2502:2: ( ruleRuleListen )
            // InternalLogicFunctionLanguage.g:2503:3: ruleRuleListen
            {
             before(grammarAccess.getANDAccess().getArgumentsRuleListenParserRuleCall_3_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleListen();

            state._fsp--;

             after(grammarAccess.getANDAccess().getArgumentsRuleListenParserRuleCall_3_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__ArgumentsAssignment_3_1_5"


    // $ANTLR start "rule__OR__ArgumentsAssignment_2_0"
    // InternalLogicFunctionLanguage.g:2512:1: rule__OR__ArgumentsAssignment_2_0 : ( ruleAND ) ;
    public final void rule__OR__ArgumentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2516:1: ( ( ruleAND ) )
            // InternalLogicFunctionLanguage.g:2517:2: ( ruleAND )
            {
            // InternalLogicFunctionLanguage.g:2517:2: ( ruleAND )
            // InternalLogicFunctionLanguage.g:2518:3: ruleAND
            {
             before(grammarAccess.getORAccess().getArgumentsANDParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAND();

            state._fsp--;

             after(grammarAccess.getORAccess().getArgumentsANDParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__ArgumentsAssignment_2_0"


    // $ANTLR start "rule__OR__ArgumentsAssignment_2_1"
    // InternalLogicFunctionLanguage.g:2527:1: rule__OR__ArgumentsAssignment_2_1 : ( ruleOR ) ;
    public final void rule__OR__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2531:1: ( ( ruleOR ) )
            // InternalLogicFunctionLanguage.g:2532:2: ( ruleOR )
            {
            // InternalLogicFunctionLanguage.g:2532:2: ( ruleOR )
            // InternalLogicFunctionLanguage.g:2533:3: ruleOR
            {
             before(grammarAccess.getORAccess().getArgumentsORParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOR();

            state._fsp--;

             after(grammarAccess.getORAccess().getArgumentsORParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__ArgumentsAssignment_2_1"


    // $ANTLR start "rule__OR__ArgumentsAssignment_2_2"
    // InternalLogicFunctionLanguage.g:2542:1: rule__OR__ArgumentsAssignment_2_2 : ( ruleXOR ) ;
    public final void rule__OR__ArgumentsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2546:1: ( ( ruleXOR ) )
            // InternalLogicFunctionLanguage.g:2547:2: ( ruleXOR )
            {
            // InternalLogicFunctionLanguage.g:2547:2: ( ruleXOR )
            // InternalLogicFunctionLanguage.g:2548:3: ruleXOR
            {
             before(grammarAccess.getORAccess().getArgumentsXORParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXOR();

            state._fsp--;

             after(grammarAccess.getORAccess().getArgumentsXORParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__ArgumentsAssignment_2_2"


    // $ANTLR start "rule__OR__ArgumentsAssignment_2_3"
    // InternalLogicFunctionLanguage.g:2557:1: rule__OR__ArgumentsAssignment_2_3 : ( ruleNOT ) ;
    public final void rule__OR__ArgumentsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2561:1: ( ( ruleNOT ) )
            // InternalLogicFunctionLanguage.g:2562:2: ( ruleNOT )
            {
            // InternalLogicFunctionLanguage.g:2562:2: ( ruleNOT )
            // InternalLogicFunctionLanguage.g:2563:3: ruleNOT
            {
             before(grammarAccess.getORAccess().getArgumentsNOTParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNOT();

            state._fsp--;

             after(grammarAccess.getORAccess().getArgumentsNOTParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__ArgumentsAssignment_2_3"


    // $ANTLR start "rule__OR__ArgumentsAssignment_2_4"
    // InternalLogicFunctionLanguage.g:2572:1: rule__OR__ArgumentsAssignment_2_4 : ( rulePredicateListen ) ;
    public final void rule__OR__ArgumentsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2576:1: ( ( rulePredicateListen ) )
            // InternalLogicFunctionLanguage.g:2577:2: ( rulePredicateListen )
            {
            // InternalLogicFunctionLanguage.g:2577:2: ( rulePredicateListen )
            // InternalLogicFunctionLanguage.g:2578:3: rulePredicateListen
            {
             before(grammarAccess.getORAccess().getArgumentsPredicateListenParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            rulePredicateListen();

            state._fsp--;

             after(grammarAccess.getORAccess().getArgumentsPredicateListenParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__ArgumentsAssignment_2_4"


    // $ANTLR start "rule__OR__ArgumentsAssignment_2_5"
    // InternalLogicFunctionLanguage.g:2587:1: rule__OR__ArgumentsAssignment_2_5 : ( ruleRuleListen ) ;
    public final void rule__OR__ArgumentsAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2591:1: ( ( ruleRuleListen ) )
            // InternalLogicFunctionLanguage.g:2592:2: ( ruleRuleListen )
            {
            // InternalLogicFunctionLanguage.g:2592:2: ( ruleRuleListen )
            // InternalLogicFunctionLanguage.g:2593:3: ruleRuleListen
            {
             before(grammarAccess.getORAccess().getArgumentsRuleListenParserRuleCall_2_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleListen();

            state._fsp--;

             after(grammarAccess.getORAccess().getArgumentsRuleListenParserRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__ArgumentsAssignment_2_5"


    // $ANTLR start "rule__OR__ArgumentsAssignment_3_1_0"
    // InternalLogicFunctionLanguage.g:2602:1: rule__OR__ArgumentsAssignment_3_1_0 : ( ruleAND ) ;
    public final void rule__OR__ArgumentsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2606:1: ( ( ruleAND ) )
            // InternalLogicFunctionLanguage.g:2607:2: ( ruleAND )
            {
            // InternalLogicFunctionLanguage.g:2607:2: ( ruleAND )
            // InternalLogicFunctionLanguage.g:2608:3: ruleAND
            {
             before(grammarAccess.getORAccess().getArgumentsANDParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAND();

            state._fsp--;

             after(grammarAccess.getORAccess().getArgumentsANDParserRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__ArgumentsAssignment_3_1_0"


    // $ANTLR start "rule__OR__ArgumentsAssignment_3_1_1"
    // InternalLogicFunctionLanguage.g:2617:1: rule__OR__ArgumentsAssignment_3_1_1 : ( ruleOR ) ;
    public final void rule__OR__ArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2621:1: ( ( ruleOR ) )
            // InternalLogicFunctionLanguage.g:2622:2: ( ruleOR )
            {
            // InternalLogicFunctionLanguage.g:2622:2: ( ruleOR )
            // InternalLogicFunctionLanguage.g:2623:3: ruleOR
            {
             before(grammarAccess.getORAccess().getArgumentsORParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOR();

            state._fsp--;

             after(grammarAccess.getORAccess().getArgumentsORParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__ArgumentsAssignment_3_1_1"


    // $ANTLR start "rule__OR__ArgumentsAssignment_3_1_2"
    // InternalLogicFunctionLanguage.g:2632:1: rule__OR__ArgumentsAssignment_3_1_2 : ( ruleXOR ) ;
    public final void rule__OR__ArgumentsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2636:1: ( ( ruleXOR ) )
            // InternalLogicFunctionLanguage.g:2637:2: ( ruleXOR )
            {
            // InternalLogicFunctionLanguage.g:2637:2: ( ruleXOR )
            // InternalLogicFunctionLanguage.g:2638:3: ruleXOR
            {
             before(grammarAccess.getORAccess().getArgumentsXORParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXOR();

            state._fsp--;

             after(grammarAccess.getORAccess().getArgumentsXORParserRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__ArgumentsAssignment_3_1_2"


    // $ANTLR start "rule__OR__ArgumentsAssignment_3_1_3"
    // InternalLogicFunctionLanguage.g:2647:1: rule__OR__ArgumentsAssignment_3_1_3 : ( ruleNOT ) ;
    public final void rule__OR__ArgumentsAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2651:1: ( ( ruleNOT ) )
            // InternalLogicFunctionLanguage.g:2652:2: ( ruleNOT )
            {
            // InternalLogicFunctionLanguage.g:2652:2: ( ruleNOT )
            // InternalLogicFunctionLanguage.g:2653:3: ruleNOT
            {
             before(grammarAccess.getORAccess().getArgumentsNOTParserRuleCall_3_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNOT();

            state._fsp--;

             after(grammarAccess.getORAccess().getArgumentsNOTParserRuleCall_3_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__ArgumentsAssignment_3_1_3"


    // $ANTLR start "rule__OR__ArgumentsAssignment_3_1_4"
    // InternalLogicFunctionLanguage.g:2662:1: rule__OR__ArgumentsAssignment_3_1_4 : ( rulePredicateListen ) ;
    public final void rule__OR__ArgumentsAssignment_3_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2666:1: ( ( rulePredicateListen ) )
            // InternalLogicFunctionLanguage.g:2667:2: ( rulePredicateListen )
            {
            // InternalLogicFunctionLanguage.g:2667:2: ( rulePredicateListen )
            // InternalLogicFunctionLanguage.g:2668:3: rulePredicateListen
            {
             before(grammarAccess.getORAccess().getArgumentsPredicateListenParserRuleCall_3_1_4_0()); 
            pushFollow(FOLLOW_2);
            rulePredicateListen();

            state._fsp--;

             after(grammarAccess.getORAccess().getArgumentsPredicateListenParserRuleCall_3_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__ArgumentsAssignment_3_1_4"


    // $ANTLR start "rule__OR__ArgumentsAssignment_3_1_5"
    // InternalLogicFunctionLanguage.g:2677:1: rule__OR__ArgumentsAssignment_3_1_5 : ( ruleRuleListen ) ;
    public final void rule__OR__ArgumentsAssignment_3_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2681:1: ( ( ruleRuleListen ) )
            // InternalLogicFunctionLanguage.g:2682:2: ( ruleRuleListen )
            {
            // InternalLogicFunctionLanguage.g:2682:2: ( ruleRuleListen )
            // InternalLogicFunctionLanguage.g:2683:3: ruleRuleListen
            {
             before(grammarAccess.getORAccess().getArgumentsRuleListenParserRuleCall_3_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleListen();

            state._fsp--;

             after(grammarAccess.getORAccess().getArgumentsRuleListenParserRuleCall_3_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__ArgumentsAssignment_3_1_5"


    // $ANTLR start "rule__XOR__ArgumentsAssignment_2_0"
    // InternalLogicFunctionLanguage.g:2692:1: rule__XOR__ArgumentsAssignment_2_0 : ( ruleAND ) ;
    public final void rule__XOR__ArgumentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2696:1: ( ( ruleAND ) )
            // InternalLogicFunctionLanguage.g:2697:2: ( ruleAND )
            {
            // InternalLogicFunctionLanguage.g:2697:2: ( ruleAND )
            // InternalLogicFunctionLanguage.g:2698:3: ruleAND
            {
             before(grammarAccess.getXORAccess().getArgumentsANDParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAND();

            state._fsp--;

             after(grammarAccess.getXORAccess().getArgumentsANDParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__ArgumentsAssignment_2_0"


    // $ANTLR start "rule__XOR__ArgumentsAssignment_2_1"
    // InternalLogicFunctionLanguage.g:2707:1: rule__XOR__ArgumentsAssignment_2_1 : ( ruleOR ) ;
    public final void rule__XOR__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2711:1: ( ( ruleOR ) )
            // InternalLogicFunctionLanguage.g:2712:2: ( ruleOR )
            {
            // InternalLogicFunctionLanguage.g:2712:2: ( ruleOR )
            // InternalLogicFunctionLanguage.g:2713:3: ruleOR
            {
             before(grammarAccess.getXORAccess().getArgumentsORParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOR();

            state._fsp--;

             after(grammarAccess.getXORAccess().getArgumentsORParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__ArgumentsAssignment_2_1"


    // $ANTLR start "rule__XOR__ArgumentsAssignment_2_2"
    // InternalLogicFunctionLanguage.g:2722:1: rule__XOR__ArgumentsAssignment_2_2 : ( ruleXOR ) ;
    public final void rule__XOR__ArgumentsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2726:1: ( ( ruleXOR ) )
            // InternalLogicFunctionLanguage.g:2727:2: ( ruleXOR )
            {
            // InternalLogicFunctionLanguage.g:2727:2: ( ruleXOR )
            // InternalLogicFunctionLanguage.g:2728:3: ruleXOR
            {
             before(grammarAccess.getXORAccess().getArgumentsXORParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXOR();

            state._fsp--;

             after(grammarAccess.getXORAccess().getArgumentsXORParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__ArgumentsAssignment_2_2"


    // $ANTLR start "rule__XOR__ArgumentsAssignment_2_3"
    // InternalLogicFunctionLanguage.g:2737:1: rule__XOR__ArgumentsAssignment_2_3 : ( ruleNOT ) ;
    public final void rule__XOR__ArgumentsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2741:1: ( ( ruleNOT ) )
            // InternalLogicFunctionLanguage.g:2742:2: ( ruleNOT )
            {
            // InternalLogicFunctionLanguage.g:2742:2: ( ruleNOT )
            // InternalLogicFunctionLanguage.g:2743:3: ruleNOT
            {
             before(grammarAccess.getXORAccess().getArgumentsNOTParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNOT();

            state._fsp--;

             after(grammarAccess.getXORAccess().getArgumentsNOTParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__ArgumentsAssignment_2_3"


    // $ANTLR start "rule__XOR__ArgumentsAssignment_2_4"
    // InternalLogicFunctionLanguage.g:2752:1: rule__XOR__ArgumentsAssignment_2_4 : ( rulePredicateListen ) ;
    public final void rule__XOR__ArgumentsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2756:1: ( ( rulePredicateListen ) )
            // InternalLogicFunctionLanguage.g:2757:2: ( rulePredicateListen )
            {
            // InternalLogicFunctionLanguage.g:2757:2: ( rulePredicateListen )
            // InternalLogicFunctionLanguage.g:2758:3: rulePredicateListen
            {
             before(grammarAccess.getXORAccess().getArgumentsPredicateListenParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            rulePredicateListen();

            state._fsp--;

             after(grammarAccess.getXORAccess().getArgumentsPredicateListenParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__ArgumentsAssignment_2_4"


    // $ANTLR start "rule__XOR__ArgumentsAssignment_2_5"
    // InternalLogicFunctionLanguage.g:2767:1: rule__XOR__ArgumentsAssignment_2_5 : ( ruleRuleListen ) ;
    public final void rule__XOR__ArgumentsAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2771:1: ( ( ruleRuleListen ) )
            // InternalLogicFunctionLanguage.g:2772:2: ( ruleRuleListen )
            {
            // InternalLogicFunctionLanguage.g:2772:2: ( ruleRuleListen )
            // InternalLogicFunctionLanguage.g:2773:3: ruleRuleListen
            {
             before(grammarAccess.getXORAccess().getArgumentsRuleListenParserRuleCall_2_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleListen();

            state._fsp--;

             after(grammarAccess.getXORAccess().getArgumentsRuleListenParserRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__ArgumentsAssignment_2_5"


    // $ANTLR start "rule__XOR__ArgumentsAssignment_3_1_0"
    // InternalLogicFunctionLanguage.g:2782:1: rule__XOR__ArgumentsAssignment_3_1_0 : ( ruleAND ) ;
    public final void rule__XOR__ArgumentsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2786:1: ( ( ruleAND ) )
            // InternalLogicFunctionLanguage.g:2787:2: ( ruleAND )
            {
            // InternalLogicFunctionLanguage.g:2787:2: ( ruleAND )
            // InternalLogicFunctionLanguage.g:2788:3: ruleAND
            {
             before(grammarAccess.getXORAccess().getArgumentsANDParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAND();

            state._fsp--;

             after(grammarAccess.getXORAccess().getArgumentsANDParserRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__ArgumentsAssignment_3_1_0"


    // $ANTLR start "rule__XOR__ArgumentsAssignment_3_1_1"
    // InternalLogicFunctionLanguage.g:2797:1: rule__XOR__ArgumentsAssignment_3_1_1 : ( ruleOR ) ;
    public final void rule__XOR__ArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2801:1: ( ( ruleOR ) )
            // InternalLogicFunctionLanguage.g:2802:2: ( ruleOR )
            {
            // InternalLogicFunctionLanguage.g:2802:2: ( ruleOR )
            // InternalLogicFunctionLanguage.g:2803:3: ruleOR
            {
             before(grammarAccess.getXORAccess().getArgumentsORParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOR();

            state._fsp--;

             after(grammarAccess.getXORAccess().getArgumentsORParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__ArgumentsAssignment_3_1_1"


    // $ANTLR start "rule__XOR__ArgumentsAssignment_3_1_2"
    // InternalLogicFunctionLanguage.g:2812:1: rule__XOR__ArgumentsAssignment_3_1_2 : ( ruleXOR ) ;
    public final void rule__XOR__ArgumentsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2816:1: ( ( ruleXOR ) )
            // InternalLogicFunctionLanguage.g:2817:2: ( ruleXOR )
            {
            // InternalLogicFunctionLanguage.g:2817:2: ( ruleXOR )
            // InternalLogicFunctionLanguage.g:2818:3: ruleXOR
            {
             before(grammarAccess.getXORAccess().getArgumentsXORParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXOR();

            state._fsp--;

             after(grammarAccess.getXORAccess().getArgumentsXORParserRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__ArgumentsAssignment_3_1_2"


    // $ANTLR start "rule__XOR__ArgumentsAssignment_3_1_3"
    // InternalLogicFunctionLanguage.g:2827:1: rule__XOR__ArgumentsAssignment_3_1_3 : ( ruleNOT ) ;
    public final void rule__XOR__ArgumentsAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2831:1: ( ( ruleNOT ) )
            // InternalLogicFunctionLanguage.g:2832:2: ( ruleNOT )
            {
            // InternalLogicFunctionLanguage.g:2832:2: ( ruleNOT )
            // InternalLogicFunctionLanguage.g:2833:3: ruleNOT
            {
             before(grammarAccess.getXORAccess().getArgumentsNOTParserRuleCall_3_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNOT();

            state._fsp--;

             after(grammarAccess.getXORAccess().getArgumentsNOTParserRuleCall_3_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__ArgumentsAssignment_3_1_3"


    // $ANTLR start "rule__XOR__ArgumentsAssignment_3_1_4"
    // InternalLogicFunctionLanguage.g:2842:1: rule__XOR__ArgumentsAssignment_3_1_4 : ( rulePredicateListen ) ;
    public final void rule__XOR__ArgumentsAssignment_3_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2846:1: ( ( rulePredicateListen ) )
            // InternalLogicFunctionLanguage.g:2847:2: ( rulePredicateListen )
            {
            // InternalLogicFunctionLanguage.g:2847:2: ( rulePredicateListen )
            // InternalLogicFunctionLanguage.g:2848:3: rulePredicateListen
            {
             before(grammarAccess.getXORAccess().getArgumentsPredicateListenParserRuleCall_3_1_4_0()); 
            pushFollow(FOLLOW_2);
            rulePredicateListen();

            state._fsp--;

             after(grammarAccess.getXORAccess().getArgumentsPredicateListenParserRuleCall_3_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__ArgumentsAssignment_3_1_4"


    // $ANTLR start "rule__XOR__ArgumentsAssignment_3_1_5"
    // InternalLogicFunctionLanguage.g:2857:1: rule__XOR__ArgumentsAssignment_3_1_5 : ( ruleRuleListen ) ;
    public final void rule__XOR__ArgumentsAssignment_3_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2861:1: ( ( ruleRuleListen ) )
            // InternalLogicFunctionLanguage.g:2862:2: ( ruleRuleListen )
            {
            // InternalLogicFunctionLanguage.g:2862:2: ( ruleRuleListen )
            // InternalLogicFunctionLanguage.g:2863:3: ruleRuleListen
            {
             before(grammarAccess.getXORAccess().getArgumentsRuleListenParserRuleCall_3_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleListen();

            state._fsp--;

             after(grammarAccess.getXORAccess().getArgumentsRuleListenParserRuleCall_3_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XOR__ArgumentsAssignment_3_1_5"


    // $ANTLR start "rule__NOT__ArgumentAssignment_2_0"
    // InternalLogicFunctionLanguage.g:2872:1: rule__NOT__ArgumentAssignment_2_0 : ( ruleAND ) ;
    public final void rule__NOT__ArgumentAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2876:1: ( ( ruleAND ) )
            // InternalLogicFunctionLanguage.g:2877:2: ( ruleAND )
            {
            // InternalLogicFunctionLanguage.g:2877:2: ( ruleAND )
            // InternalLogicFunctionLanguage.g:2878:3: ruleAND
            {
             before(grammarAccess.getNOTAccess().getArgumentANDParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAND();

            state._fsp--;

             after(grammarAccess.getNOTAccess().getArgumentANDParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NOT__ArgumentAssignment_2_0"


    // $ANTLR start "rule__NOT__ArgumentAssignment_2_1"
    // InternalLogicFunctionLanguage.g:2887:1: rule__NOT__ArgumentAssignment_2_1 : ( ruleOR ) ;
    public final void rule__NOT__ArgumentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2891:1: ( ( ruleOR ) )
            // InternalLogicFunctionLanguage.g:2892:2: ( ruleOR )
            {
            // InternalLogicFunctionLanguage.g:2892:2: ( ruleOR )
            // InternalLogicFunctionLanguage.g:2893:3: ruleOR
            {
             before(grammarAccess.getNOTAccess().getArgumentORParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOR();

            state._fsp--;

             after(grammarAccess.getNOTAccess().getArgumentORParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NOT__ArgumentAssignment_2_1"


    // $ANTLR start "rule__NOT__ArgumentAssignment_2_2"
    // InternalLogicFunctionLanguage.g:2902:1: rule__NOT__ArgumentAssignment_2_2 : ( ruleXOR ) ;
    public final void rule__NOT__ArgumentAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2906:1: ( ( ruleXOR ) )
            // InternalLogicFunctionLanguage.g:2907:2: ( ruleXOR )
            {
            // InternalLogicFunctionLanguage.g:2907:2: ( ruleXOR )
            // InternalLogicFunctionLanguage.g:2908:3: ruleXOR
            {
             before(grammarAccess.getNOTAccess().getArgumentXORParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXOR();

            state._fsp--;

             after(grammarAccess.getNOTAccess().getArgumentXORParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NOT__ArgumentAssignment_2_2"


    // $ANTLR start "rule__NOT__ArgumentAssignment_2_3"
    // InternalLogicFunctionLanguage.g:2917:1: rule__NOT__ArgumentAssignment_2_3 : ( ruleNOT ) ;
    public final void rule__NOT__ArgumentAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2921:1: ( ( ruleNOT ) )
            // InternalLogicFunctionLanguage.g:2922:2: ( ruleNOT )
            {
            // InternalLogicFunctionLanguage.g:2922:2: ( ruleNOT )
            // InternalLogicFunctionLanguage.g:2923:3: ruleNOT
            {
             before(grammarAccess.getNOTAccess().getArgumentNOTParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNOT();

            state._fsp--;

             after(grammarAccess.getNOTAccess().getArgumentNOTParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NOT__ArgumentAssignment_2_3"


    // $ANTLR start "rule__NOT__ArgumentAssignment_2_4"
    // InternalLogicFunctionLanguage.g:2932:1: rule__NOT__ArgumentAssignment_2_4 : ( rulePredicateListen ) ;
    public final void rule__NOT__ArgumentAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2936:1: ( ( rulePredicateListen ) )
            // InternalLogicFunctionLanguage.g:2937:2: ( rulePredicateListen )
            {
            // InternalLogicFunctionLanguage.g:2937:2: ( rulePredicateListen )
            // InternalLogicFunctionLanguage.g:2938:3: rulePredicateListen
            {
             before(grammarAccess.getNOTAccess().getArgumentPredicateListenParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            rulePredicateListen();

            state._fsp--;

             after(grammarAccess.getNOTAccess().getArgumentPredicateListenParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NOT__ArgumentAssignment_2_4"


    // $ANTLR start "rule__NOT__ArgumentAssignment_2_5"
    // InternalLogicFunctionLanguage.g:2947:1: rule__NOT__ArgumentAssignment_2_5 : ( ruleRuleListen ) ;
    public final void rule__NOT__ArgumentAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2951:1: ( ( ruleRuleListen ) )
            // InternalLogicFunctionLanguage.g:2952:2: ( ruleRuleListen )
            {
            // InternalLogicFunctionLanguage.g:2952:2: ( ruleRuleListen )
            // InternalLogicFunctionLanguage.g:2953:3: ruleRuleListen
            {
             before(grammarAccess.getNOTAccess().getArgumentRuleListenParserRuleCall_2_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleListen();

            state._fsp--;

             after(grammarAccess.getNOTAccess().getArgumentRuleListenParserRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NOT__ArgumentAssignment_2_5"


    // $ANTLR start "rule__PredicateListen__ListensAssignment"
    // InternalLogicFunctionLanguage.g:2962:1: rule__PredicateListen__ListensAssignment : ( rulePredicate ) ;
    public final void rule__PredicateListen__ListensAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2966:1: ( ( rulePredicate ) )
            // InternalLogicFunctionLanguage.g:2967:2: ( rulePredicate )
            {
            // InternalLogicFunctionLanguage.g:2967:2: ( rulePredicate )
            // InternalLogicFunctionLanguage.g:2968:3: rulePredicate
            {
             before(grammarAccess.getPredicateListenAccess().getListensPredicateParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateListenAccess().getListensPredicateParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateListen__ListensAssignment"


    // $ANTLR start "rule__RuleListen__ListensAssignment"
    // InternalLogicFunctionLanguage.g:2977:1: rule__RuleListen__ListensAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RuleListen__ListensAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:2981:1: ( ( ( RULE_ID ) ) )
            // InternalLogicFunctionLanguage.g:2982:2: ( ( RULE_ID ) )
            {
            // InternalLogicFunctionLanguage.g:2982:2: ( ( RULE_ID ) )
            // InternalLogicFunctionLanguage.g:2983:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleListenAccess().getListensRuleCrossReference_0()); 
            // InternalLogicFunctionLanguage.g:2984:3: ( RULE_ID )
            // InternalLogicFunctionLanguage.g:2985:4: RULE_ID
            {
             before(grammarAccess.getRuleListenAccess().getListensRuleIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleListenAccess().getListensRuleIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getRuleListenAccess().getListensRuleCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleListen__ListensAssignment"


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // InternalLogicFunctionLanguage.g:2996:1: rule__Interface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:3000:1: ( ( RULE_ID ) )
            // InternalLogicFunctionLanguage.g:3001:2: ( RULE_ID )
            {
            // InternalLogicFunctionLanguage.g:3001:2: ( RULE_ID )
            // InternalLogicFunctionLanguage.g:3002:3: RULE_ID
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
    // InternalLogicFunctionLanguage.g:3011:1: rule__Interface__EventsAssignment_3 : ( ruleEventDeclaration ) ;
    public final void rule__Interface__EventsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:3015:1: ( ( ruleEventDeclaration ) )
            // InternalLogicFunctionLanguage.g:3016:2: ( ruleEventDeclaration )
            {
            // InternalLogicFunctionLanguage.g:3016:2: ( ruleEventDeclaration )
            // InternalLogicFunctionLanguage.g:3017:3: ruleEventDeclaration
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
    // InternalLogicFunctionLanguage.g:3026:1: rule__EventDeclaration__DirectionAssignment_0 : ( ruleEventDirection ) ;
    public final void rule__EventDeclaration__DirectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:3030:1: ( ( ruleEventDirection ) )
            // InternalLogicFunctionLanguage.g:3031:2: ( ruleEventDirection )
            {
            // InternalLogicFunctionLanguage.g:3031:2: ( ruleEventDirection )
            // InternalLogicFunctionLanguage.g:3032:3: ruleEventDirection
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
    // InternalLogicFunctionLanguage.g:3041:1: rule__EventDeclaration__ExtraValueTypeAssignment_1 : ( ruleValueType ) ;
    public final void rule__EventDeclaration__ExtraValueTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:3045:1: ( ( ruleValueType ) )
            // InternalLogicFunctionLanguage.g:3046:2: ( ruleValueType )
            {
            // InternalLogicFunctionLanguage.g:3046:2: ( ruleValueType )
            // InternalLogicFunctionLanguage.g:3047:3: ruleValueType
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
    // InternalLogicFunctionLanguage.g:3056:1: rule__EventDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EventDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:3060:1: ( ( RULE_ID ) )
            // InternalLogicFunctionLanguage.g:3061:2: ( RULE_ID )
            {
            // InternalLogicFunctionLanguage.g:3061:2: ( RULE_ID )
            // InternalLogicFunctionLanguage.g:3062:3: RULE_ID
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


    // $ANTLR start "rule__Predicate__ListensAssignment_1"
    // InternalLogicFunctionLanguage.g:3071:1: rule__Predicate__ListensAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Predicate__ListensAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogicFunctionLanguage.g:3075:1: ( ( ( ruleQualifiedName ) ) )
            // InternalLogicFunctionLanguage.g:3076:2: ( ( ruleQualifiedName ) )
            {
            // InternalLogicFunctionLanguage.g:3076:2: ( ( ruleQualifiedName ) )
            // InternalLogicFunctionLanguage.g:3077:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPredicateAccess().getListensEventCrossReference_1_0()); 
            // InternalLogicFunctionLanguage.g:3078:3: ( ruleQualifiedName )
            // InternalLogicFunctionLanguage.g:3079:4: ruleQualifiedName
            {
             before(grammarAccess.getPredicateAccess().getListensEventQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getListensEventQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPredicateAccess().getListensEventCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__ListensAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000017100010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000013000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});

}