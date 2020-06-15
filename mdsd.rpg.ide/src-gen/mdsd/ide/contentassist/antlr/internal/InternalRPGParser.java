package mdsd.ide.contentassist.antlr.internal;

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
import mdsd.services.RPGGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRPGParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Float'", "'Integer'", "'game'", "'effects'", "'effect'", "'buff'", "','", "'move'", "'after'", "'attributes'", "'attribute'", "'location'", "'opponents'", "'type'", "'effectiveness'", "'relations'", "'modifiers'", "'synergy'", "'effective'", "'ineffective'", "'<'", "'moves'", "'is'", "'if'", "'then'", "'hits'", "'entities'", "'death'", "'entity'", "'extends'", "'teams'", "'team'", "'members'", "'require'", "'OR'", "'AND'", "'('", "')'", "'<='", "'=='", "'>='", "'>'", "'!='", "'+'", "'-'", "'*'", "'/'", "'.'", "'unmodified'", "'user'", "'enemy'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRPGParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRPGParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRPGParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRPG.g"; }


    	private RPGGrammarAccess grammarAccess;

    	public void setGrammarAccess(RPGGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSystemRPG"
    // InternalRPG.g:53:1: entryRuleSystemRPG : ruleSystemRPG EOF ;
    public final void entryRuleSystemRPG() throws RecognitionException {
        try {
            // InternalRPG.g:54:1: ( ruleSystemRPG EOF )
            // InternalRPG.g:55:1: ruleSystemRPG EOF
            {
             before(grammarAccess.getSystemRPGRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemRPG();

            state._fsp--;

             after(grammarAccess.getSystemRPGRule()); 
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
    // $ANTLR end "entryRuleSystemRPG"


    // $ANTLR start "ruleSystemRPG"
    // InternalRPG.g:62:1: ruleSystemRPG : ( ( rule__SystemRPG__Group__0 ) ) ;
    public final void ruleSystemRPG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:66:2: ( ( ( rule__SystemRPG__Group__0 ) ) )
            // InternalRPG.g:67:2: ( ( rule__SystemRPG__Group__0 ) )
            {
            // InternalRPG.g:67:2: ( ( rule__SystemRPG__Group__0 ) )
            // InternalRPG.g:68:3: ( rule__SystemRPG__Group__0 )
            {
             before(grammarAccess.getSystemRPGAccess().getGroup()); 
            // InternalRPG.g:69:3: ( rule__SystemRPG__Group__0 )
            // InternalRPG.g:69:4: rule__SystemRPG__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemRPG__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemRPGAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemRPG"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRPG.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalRPG.g:79:1: ( ruleDeclaration EOF )
            // InternalRPG.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRPG.g:87:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:91:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalRPG.g:92:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalRPG.g:92:2: ( ( rule__Declaration__Alternatives ) )
            // InternalRPG.g:93:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalRPG.g:94:3: ( rule__Declaration__Alternatives )
            // InternalRPG.g:94:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEffects"
    // InternalRPG.g:103:1: entryRuleEffects : ruleEffects EOF ;
    public final void entryRuleEffects() throws RecognitionException {
        try {
            // InternalRPG.g:104:1: ( ruleEffects EOF )
            // InternalRPG.g:105:1: ruleEffects EOF
            {
             before(grammarAccess.getEffectsRule()); 
            pushFollow(FOLLOW_1);
            ruleEffects();

            state._fsp--;

             after(grammarAccess.getEffectsRule()); 
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
    // $ANTLR end "entryRuleEffects"


    // $ANTLR start "ruleEffects"
    // InternalRPG.g:112:1: ruleEffects : ( ( rule__Effects__Group__0 ) ) ;
    public final void ruleEffects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:116:2: ( ( ( rule__Effects__Group__0 ) ) )
            // InternalRPG.g:117:2: ( ( rule__Effects__Group__0 ) )
            {
            // InternalRPG.g:117:2: ( ( rule__Effects__Group__0 ) )
            // InternalRPG.g:118:3: ( rule__Effects__Group__0 )
            {
             before(grammarAccess.getEffectsAccess().getGroup()); 
            // InternalRPG.g:119:3: ( rule__Effects__Group__0 )
            // InternalRPG.g:119:4: rule__Effects__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Effects__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffects"


    // $ANTLR start "entryRuleEffect"
    // InternalRPG.g:128:1: entryRuleEffect : ruleEffect EOF ;
    public final void entryRuleEffect() throws RecognitionException {
        try {
            // InternalRPG.g:129:1: ( ruleEffect EOF )
            // InternalRPG.g:130:1: ruleEffect EOF
            {
             before(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getEffectRule()); 
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
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalRPG.g:137:1: ruleEffect : ( ( rule__Effect__Group__0 ) ) ;
    public final void ruleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:141:2: ( ( ( rule__Effect__Group__0 ) ) )
            // InternalRPG.g:142:2: ( ( rule__Effect__Group__0 ) )
            {
            // InternalRPG.g:142:2: ( ( rule__Effect__Group__0 ) )
            // InternalRPG.g:143:3: ( rule__Effect__Group__0 )
            {
             before(grammarAccess.getEffectAccess().getGroup()); 
            // InternalRPG.g:144:3: ( rule__Effect__Group__0 )
            // InternalRPG.g:144:4: rule__Effect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Effect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleBuff"
    // InternalRPG.g:153:1: entryRuleBuff : ruleBuff EOF ;
    public final void entryRuleBuff() throws RecognitionException {
        try {
            // InternalRPG.g:154:1: ( ruleBuff EOF )
            // InternalRPG.g:155:1: ruleBuff EOF
            {
             before(grammarAccess.getBuffRule()); 
            pushFollow(FOLLOW_1);
            ruleBuff();

            state._fsp--;

             after(grammarAccess.getBuffRule()); 
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
    // $ANTLR end "entryRuleBuff"


    // $ANTLR start "ruleBuff"
    // InternalRPG.g:162:1: ruleBuff : ( ( rule__Buff__Group__0 ) ) ;
    public final void ruleBuff() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:166:2: ( ( ( rule__Buff__Group__0 ) ) )
            // InternalRPG.g:167:2: ( ( rule__Buff__Group__0 ) )
            {
            // InternalRPG.g:167:2: ( ( rule__Buff__Group__0 ) )
            // InternalRPG.g:168:3: ( rule__Buff__Group__0 )
            {
             before(grammarAccess.getBuffAccess().getGroup()); 
            // InternalRPG.g:169:3: ( rule__Buff__Group__0 )
            // InternalRPG.g:169:4: rule__Buff__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Buff__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBuffAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuff"


    // $ANTLR start "entryRuleMoveE"
    // InternalRPG.g:178:1: entryRuleMoveE : ruleMoveE EOF ;
    public final void entryRuleMoveE() throws RecognitionException {
        try {
            // InternalRPG.g:179:1: ( ruleMoveE EOF )
            // InternalRPG.g:180:1: ruleMoveE EOF
            {
             before(grammarAccess.getMoveERule()); 
            pushFollow(FOLLOW_1);
            ruleMoveE();

            state._fsp--;

             after(grammarAccess.getMoveERule()); 
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
    // $ANTLR end "entryRuleMoveE"


    // $ANTLR start "ruleMoveE"
    // InternalRPG.g:187:1: ruleMoveE : ( ( rule__MoveE__Group__0 ) ) ;
    public final void ruleMoveE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:191:2: ( ( ( rule__MoveE__Group__0 ) ) )
            // InternalRPG.g:192:2: ( ( rule__MoveE__Group__0 ) )
            {
            // InternalRPG.g:192:2: ( ( rule__MoveE__Group__0 ) )
            // InternalRPG.g:193:3: ( rule__MoveE__Group__0 )
            {
             before(grammarAccess.getMoveEAccess().getGroup()); 
            // InternalRPG.g:194:3: ( rule__MoveE__Group__0 )
            // InternalRPG.g:194:4: rule__MoveE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveE"


    // $ANTLR start "entryRuleAfterE"
    // InternalRPG.g:203:1: entryRuleAfterE : ruleAfterE EOF ;
    public final void entryRuleAfterE() throws RecognitionException {
        try {
            // InternalRPG.g:204:1: ( ruleAfterE EOF )
            // InternalRPG.g:205:1: ruleAfterE EOF
            {
             before(grammarAccess.getAfterERule()); 
            pushFollow(FOLLOW_1);
            ruleAfterE();

            state._fsp--;

             after(grammarAccess.getAfterERule()); 
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
    // $ANTLR end "entryRuleAfterE"


    // $ANTLR start "ruleAfterE"
    // InternalRPG.g:212:1: ruleAfterE : ( ( rule__AfterE__Group__0 ) ) ;
    public final void ruleAfterE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:216:2: ( ( ( rule__AfterE__Group__0 ) ) )
            // InternalRPG.g:217:2: ( ( rule__AfterE__Group__0 ) )
            {
            // InternalRPG.g:217:2: ( ( rule__AfterE__Group__0 ) )
            // InternalRPG.g:218:3: ( rule__AfterE__Group__0 )
            {
             before(grammarAccess.getAfterEAccess().getGroup()); 
            // InternalRPG.g:219:3: ( rule__AfterE__Group__0 )
            // InternalRPG.g:219:4: rule__AfterE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AfterE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAfterEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAfterE"


    // $ANTLR start "entryRuleAttributes"
    // InternalRPG.g:228:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalRPG.g:229:1: ( ruleAttributes EOF )
            // InternalRPG.g:230:1: ruleAttributes EOF
            {
             before(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getAttributesRule()); 
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
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalRPG.g:237:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:241:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalRPG.g:242:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalRPG.g:242:2: ( ( rule__Attributes__Group__0 ) )
            // InternalRPG.g:243:3: ( rule__Attributes__Group__0 )
            {
             before(grammarAccess.getAttributesAccess().getGroup()); 
            // InternalRPG.g:244:3: ( rule__Attributes__Group__0 )
            // InternalRPG.g:244:4: rule__Attributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleAttribute"
    // InternalRPG.g:253:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalRPG.g:254:1: ( ruleAttribute EOF )
            // InternalRPG.g:255:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalRPG.g:262:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:266:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalRPG.g:267:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalRPG.g:267:2: ( ( rule__Attribute__Group__0 ) )
            // InternalRPG.g:268:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalRPG.g:269:3: ( rule__Attribute__Group__0 )
            // InternalRPG.g:269:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleLocations"
    // InternalRPG.g:278:1: entryRuleLocations : ruleLocations EOF ;
    public final void entryRuleLocations() throws RecognitionException {
        try {
            // InternalRPG.g:279:1: ( ruleLocations EOF )
            // InternalRPG.g:280:1: ruleLocations EOF
            {
             before(grammarAccess.getLocationsRule()); 
            pushFollow(FOLLOW_1);
            ruleLocations();

            state._fsp--;

             after(grammarAccess.getLocationsRule()); 
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
    // $ANTLR end "entryRuleLocations"


    // $ANTLR start "ruleLocations"
    // InternalRPG.g:287:1: ruleLocations : ( ( rule__Locations__Group__0 ) ) ;
    public final void ruleLocations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:291:2: ( ( ( rule__Locations__Group__0 ) ) )
            // InternalRPG.g:292:2: ( ( rule__Locations__Group__0 ) )
            {
            // InternalRPG.g:292:2: ( ( rule__Locations__Group__0 ) )
            // InternalRPG.g:293:3: ( rule__Locations__Group__0 )
            {
             before(grammarAccess.getLocationsAccess().getGroup()); 
            // InternalRPG.g:294:3: ( rule__Locations__Group__0 )
            // InternalRPG.g:294:4: rule__Locations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Locations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocations"


    // $ANTLR start "entryRuleLoc"
    // InternalRPG.g:303:1: entryRuleLoc : ruleLoc EOF ;
    public final void entryRuleLoc() throws RecognitionException {
        try {
            // InternalRPG.g:304:1: ( ruleLoc EOF )
            // InternalRPG.g:305:1: ruleLoc EOF
            {
             before(grammarAccess.getLocRule()); 
            pushFollow(FOLLOW_1);
            ruleLoc();

            state._fsp--;

             after(grammarAccess.getLocRule()); 
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
    // $ANTLR end "entryRuleLoc"


    // $ANTLR start "ruleLoc"
    // InternalRPG.g:312:1: ruleLoc : ( ( rule__Loc__Group__0 ) ) ;
    public final void ruleLoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:316:2: ( ( ( rule__Loc__Group__0 ) ) )
            // InternalRPG.g:317:2: ( ( rule__Loc__Group__0 ) )
            {
            // InternalRPG.g:317:2: ( ( rule__Loc__Group__0 ) )
            // InternalRPG.g:318:3: ( rule__Loc__Group__0 )
            {
             before(grammarAccess.getLocAccess().getGroup()); 
            // InternalRPG.g:319:3: ( rule__Loc__Group__0 )
            // InternalRPG.g:319:4: rule__Loc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoc"


    // $ANTLR start "entryRuleRelations"
    // InternalRPG.g:328:1: entryRuleRelations : ruleRelations EOF ;
    public final void entryRuleRelations() throws RecognitionException {
        try {
            // InternalRPG.g:329:1: ( ruleRelations EOF )
            // InternalRPG.g:330:1: ruleRelations EOF
            {
             before(grammarAccess.getRelationsRule()); 
            pushFollow(FOLLOW_1);
            ruleRelations();

            state._fsp--;

             after(grammarAccess.getRelationsRule()); 
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
    // $ANTLR end "entryRuleRelations"


    // $ANTLR start "ruleRelations"
    // InternalRPG.g:337:1: ruleRelations : ( ( rule__Relations__Group__0 ) ) ;
    public final void ruleRelations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:341:2: ( ( ( rule__Relations__Group__0 ) ) )
            // InternalRPG.g:342:2: ( ( rule__Relations__Group__0 ) )
            {
            // InternalRPG.g:342:2: ( ( rule__Relations__Group__0 ) )
            // InternalRPG.g:343:3: ( rule__Relations__Group__0 )
            {
             before(grammarAccess.getRelationsAccess().getGroup()); 
            // InternalRPG.g:344:3: ( rule__Relations__Group__0 )
            // InternalRPG.g:344:4: rule__Relations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelations"


    // $ANTLR start "entryRuleRelationModifiers"
    // InternalRPG.g:353:1: entryRuleRelationModifiers : ruleRelationModifiers EOF ;
    public final void entryRuleRelationModifiers() throws RecognitionException {
        try {
            // InternalRPG.g:354:1: ( ruleRelationModifiers EOF )
            // InternalRPG.g:355:1: ruleRelationModifiers EOF
            {
             before(grammarAccess.getRelationModifiersRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationModifiers();

            state._fsp--;

             after(grammarAccess.getRelationModifiersRule()); 
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
    // $ANTLR end "entryRuleRelationModifiers"


    // $ANTLR start "ruleRelationModifiers"
    // InternalRPG.g:362:1: ruleRelationModifiers : ( ( rule__RelationModifiers__Group__0 ) ) ;
    public final void ruleRelationModifiers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:366:2: ( ( ( rule__RelationModifiers__Group__0 ) ) )
            // InternalRPG.g:367:2: ( ( rule__RelationModifiers__Group__0 ) )
            {
            // InternalRPG.g:367:2: ( ( rule__RelationModifiers__Group__0 ) )
            // InternalRPG.g:368:3: ( rule__RelationModifiers__Group__0 )
            {
             before(grammarAccess.getRelationModifiersAccess().getGroup()); 
            // InternalRPG.g:369:3: ( rule__RelationModifiers__Group__0 )
            // InternalRPG.g:369:4: rule__RelationModifiers__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationModifiers__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationModifiersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationModifiers"


    // $ANTLR start "entryRuleType"
    // InternalRPG.g:378:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalRPG.g:379:1: ( ruleType EOF )
            // InternalRPG.g:380:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalRPG.g:387:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:391:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalRPG.g:392:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalRPG.g:392:2: ( ( rule__Type__Group__0 ) )
            // InternalRPG.g:393:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalRPG.g:394:3: ( rule__Type__Group__0 )
            // InternalRPG.g:394:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeExpression"
    // InternalRPG.g:403:1: entryRuleTypeExpression : ruleTypeExpression EOF ;
    public final void entryRuleTypeExpression() throws RecognitionException {
        try {
            // InternalRPG.g:404:1: ( ruleTypeExpression EOF )
            // InternalRPG.g:405:1: ruleTypeExpression EOF
            {
             before(grammarAccess.getTypeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeExpression();

            state._fsp--;

             after(grammarAccess.getTypeExpressionRule()); 
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
    // $ANTLR end "entryRuleTypeExpression"


    // $ANTLR start "ruleTypeExpression"
    // InternalRPG.g:412:1: ruleTypeExpression : ( ( rule__TypeExpression__Group__0 ) ) ;
    public final void ruleTypeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:416:2: ( ( ( rule__TypeExpression__Group__0 ) ) )
            // InternalRPG.g:417:2: ( ( rule__TypeExpression__Group__0 ) )
            {
            // InternalRPG.g:417:2: ( ( rule__TypeExpression__Group__0 ) )
            // InternalRPG.g:418:3: ( rule__TypeExpression__Group__0 )
            {
             before(grammarAccess.getTypeExpressionAccess().getGroup()); 
            // InternalRPG.g:419:3: ( rule__TypeExpression__Group__0 )
            // InternalRPG.g:419:4: rule__TypeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeExpression"


    // $ANTLR start "entryRuleMoves"
    // InternalRPG.g:428:1: entryRuleMoves : ruleMoves EOF ;
    public final void entryRuleMoves() throws RecognitionException {
        try {
            // InternalRPG.g:429:1: ( ruleMoves EOF )
            // InternalRPG.g:430:1: ruleMoves EOF
            {
             before(grammarAccess.getMovesRule()); 
            pushFollow(FOLLOW_1);
            ruleMoves();

            state._fsp--;

             after(grammarAccess.getMovesRule()); 
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
    // $ANTLR end "entryRuleMoves"


    // $ANTLR start "ruleMoves"
    // InternalRPG.g:437:1: ruleMoves : ( ( rule__Moves__Group__0 ) ) ;
    public final void ruleMoves() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:441:2: ( ( ( rule__Moves__Group__0 ) ) )
            // InternalRPG.g:442:2: ( ( rule__Moves__Group__0 ) )
            {
            // InternalRPG.g:442:2: ( ( rule__Moves__Group__0 ) )
            // InternalRPG.g:443:3: ( rule__Moves__Group__0 )
            {
             before(grammarAccess.getMovesAccess().getGroup()); 
            // InternalRPG.g:444:3: ( rule__Moves__Group__0 )
            // InternalRPG.g:444:4: rule__Moves__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Moves__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMovesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoves"


    // $ANTLR start "entryRuleMove"
    // InternalRPG.g:453:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalRPG.g:454:1: ( ruleMove EOF )
            // InternalRPG.g:455:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalRPG.g:462:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:466:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalRPG.g:467:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalRPG.g:467:2: ( ( rule__Move__Group__0 ) )
            // InternalRPG.g:468:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalRPG.g:469:3: ( rule__Move__Group__0 )
            // InternalRPG.g:469:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleMEffect"
    // InternalRPG.g:478:1: entryRuleMEffect : ruleMEffect EOF ;
    public final void entryRuleMEffect() throws RecognitionException {
        try {
            // InternalRPG.g:479:1: ( ruleMEffect EOF )
            // InternalRPG.g:480:1: ruleMEffect EOF
            {
             before(grammarAccess.getMEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleMEffect();

            state._fsp--;

             after(grammarAccess.getMEffectRule()); 
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
    // $ANTLR end "entryRuleMEffect"


    // $ANTLR start "ruleMEffect"
    // InternalRPG.g:487:1: ruleMEffect : ( ( rule__MEffect__Group__0 ) ) ;
    public final void ruleMEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:491:2: ( ( ( rule__MEffect__Group__0 ) ) )
            // InternalRPG.g:492:2: ( ( rule__MEffect__Group__0 ) )
            {
            // InternalRPG.g:492:2: ( ( rule__MEffect__Group__0 ) )
            // InternalRPG.g:493:3: ( rule__MEffect__Group__0 )
            {
             before(grammarAccess.getMEffectAccess().getGroup()); 
            // InternalRPG.g:494:3: ( rule__MEffect__Group__0 )
            // InternalRPG.g:494:4: rule__MEffect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MEffect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMEffectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMEffect"


    // $ANTLR start "entryRuleBEffect"
    // InternalRPG.g:503:1: entryRuleBEffect : ruleBEffect EOF ;
    public final void entryRuleBEffect() throws RecognitionException {
        try {
            // InternalRPG.g:504:1: ( ruleBEffect EOF )
            // InternalRPG.g:505:1: ruleBEffect EOF
            {
             before(grammarAccess.getBEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleBEffect();

            state._fsp--;

             after(grammarAccess.getBEffectRule()); 
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
    // $ANTLR end "entryRuleBEffect"


    // $ANTLR start "ruleBEffect"
    // InternalRPG.g:512:1: ruleBEffect : ( ( rule__BEffect__Group__0 ) ) ;
    public final void ruleBEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:516:2: ( ( ( rule__BEffect__Group__0 ) ) )
            // InternalRPG.g:517:2: ( ( rule__BEffect__Group__0 ) )
            {
            // InternalRPG.g:517:2: ( ( rule__BEffect__Group__0 ) )
            // InternalRPG.g:518:3: ( rule__BEffect__Group__0 )
            {
             before(grammarAccess.getBEffectAccess().getGroup()); 
            // InternalRPG.g:519:3: ( rule__BEffect__Group__0 )
            // InternalRPG.g:519:4: rule__BEffect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BEffect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBEffectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBEffect"


    // $ANTLR start "entryRuleAEffect"
    // InternalRPG.g:528:1: entryRuleAEffect : ruleAEffect EOF ;
    public final void entryRuleAEffect() throws RecognitionException {
        try {
            // InternalRPG.g:529:1: ( ruleAEffect EOF )
            // InternalRPG.g:530:1: ruleAEffect EOF
            {
             before(grammarAccess.getAEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleAEffect();

            state._fsp--;

             after(grammarAccess.getAEffectRule()); 
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
    // $ANTLR end "entryRuleAEffect"


    // $ANTLR start "ruleAEffect"
    // InternalRPG.g:537:1: ruleAEffect : ( ( rule__AEffect__Group__0 ) ) ;
    public final void ruleAEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:541:2: ( ( ( rule__AEffect__Group__0 ) ) )
            // InternalRPG.g:542:2: ( ( rule__AEffect__Group__0 ) )
            {
            // InternalRPG.g:542:2: ( ( rule__AEffect__Group__0 ) )
            // InternalRPG.g:543:3: ( rule__AEffect__Group__0 )
            {
             before(grammarAccess.getAEffectAccess().getGroup()); 
            // InternalRPG.g:544:3: ( rule__AEffect__Group__0 )
            // InternalRPG.g:544:4: rule__AEffect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AEffect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAEffectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAEffect"


    // $ANTLR start "entryRuleEType"
    // InternalRPG.g:553:1: entryRuleEType : ruleEType EOF ;
    public final void entryRuleEType() throws RecognitionException {
        try {
            // InternalRPG.g:554:1: ( ruleEType EOF )
            // InternalRPG.g:555:1: ruleEType EOF
            {
             before(grammarAccess.getETypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getETypeRule()); 
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
    // $ANTLR end "entryRuleEType"


    // $ANTLR start "ruleEType"
    // InternalRPG.g:562:1: ruleEType : ( ( rule__EType__Group__0 ) ) ;
    public final void ruleEType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:566:2: ( ( ( rule__EType__Group__0 ) ) )
            // InternalRPG.g:567:2: ( ( rule__EType__Group__0 ) )
            {
            // InternalRPG.g:567:2: ( ( rule__EType__Group__0 ) )
            // InternalRPG.g:568:3: ( rule__EType__Group__0 )
            {
             before(grammarAccess.getETypeAccess().getGroup()); 
            // InternalRPG.g:569:3: ( rule__EType__Group__0 )
            // InternalRPG.g:569:4: rule__EType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getETypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEType"


    // $ANTLR start "entryRuleAttributeValues"
    // InternalRPG.g:578:1: entryRuleAttributeValues : ruleAttributeValues EOF ;
    public final void entryRuleAttributeValues() throws RecognitionException {
        try {
            // InternalRPG.g:579:1: ( ruleAttributeValues EOF )
            // InternalRPG.g:580:1: ruleAttributeValues EOF
            {
             before(grammarAccess.getAttributeValuesRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeValues();

            state._fsp--;

             after(grammarAccess.getAttributeValuesRule()); 
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
    // $ANTLR end "entryRuleAttributeValues"


    // $ANTLR start "ruleAttributeValues"
    // InternalRPG.g:587:1: ruleAttributeValues : ( ( rule__AttributeValues__Group__0 ) ) ;
    public final void ruleAttributeValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:591:2: ( ( ( rule__AttributeValues__Group__0 ) ) )
            // InternalRPG.g:592:2: ( ( rule__AttributeValues__Group__0 ) )
            {
            // InternalRPG.g:592:2: ( ( rule__AttributeValues__Group__0 ) )
            // InternalRPG.g:593:3: ( rule__AttributeValues__Group__0 )
            {
             before(grammarAccess.getAttributeValuesAccess().getGroup()); 
            // InternalRPG.g:594:3: ( rule__AttributeValues__Group__0 )
            // InternalRPG.g:594:4: rule__AttributeValues__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValues__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValuesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeValues"


    // $ANTLR start "entryRuleAltAttribute"
    // InternalRPG.g:603:1: entryRuleAltAttribute : ruleAltAttribute EOF ;
    public final void entryRuleAltAttribute() throws RecognitionException {
        try {
            // InternalRPG.g:604:1: ( ruleAltAttribute EOF )
            // InternalRPG.g:605:1: ruleAltAttribute EOF
            {
             before(grammarAccess.getAltAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAltAttribute();

            state._fsp--;

             after(grammarAccess.getAltAttributeRule()); 
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
    // $ANTLR end "entryRuleAltAttribute"


    // $ANTLR start "ruleAltAttribute"
    // InternalRPG.g:612:1: ruleAltAttribute : ( ( rule__AltAttribute__Group__0 ) ) ;
    public final void ruleAltAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:616:2: ( ( ( rule__AltAttribute__Group__0 ) ) )
            // InternalRPG.g:617:2: ( ( rule__AltAttribute__Group__0 ) )
            {
            // InternalRPG.g:617:2: ( ( rule__AltAttribute__Group__0 ) )
            // InternalRPG.g:618:3: ( rule__AltAttribute__Group__0 )
            {
             before(grammarAccess.getAltAttributeAccess().getGroup()); 
            // InternalRPG.g:619:3: ( rule__AltAttribute__Group__0 )
            // InternalRPG.g:619:4: rule__AltAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AltAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAltAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAltAttribute"


    // $ANTLR start "entryRuleRule"
    // InternalRPG.g:628:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalRPG.g:629:1: ( ruleRule EOF )
            // InternalRPG.g:630:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRPG.g:637:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:641:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalRPG.g:642:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalRPG.g:642:2: ( ( rule__Rule__Group__0 ) )
            // InternalRPG.g:643:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalRPG.g:644:3: ( rule__Rule__Group__0 )
            // InternalRPG.g:644:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleAdditionalRule"
    // InternalRPG.g:653:1: entryRuleAdditionalRule : ruleAdditionalRule EOF ;
    public final void entryRuleAdditionalRule() throws RecognitionException {
        try {
            // InternalRPG.g:654:1: ( ruleAdditionalRule EOF )
            // InternalRPG.g:655:1: ruleAdditionalRule EOF
            {
             before(grammarAccess.getAdditionalRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditionalRule();

            state._fsp--;

             after(grammarAccess.getAdditionalRuleRule()); 
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
    // $ANTLR end "entryRuleAdditionalRule"


    // $ANTLR start "ruleAdditionalRule"
    // InternalRPG.g:662:1: ruleAdditionalRule : ( ( rule__AdditionalRule__Group__0 ) ) ;
    public final void ruleAdditionalRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:666:2: ( ( ( rule__AdditionalRule__Group__0 ) ) )
            // InternalRPG.g:667:2: ( ( rule__AdditionalRule__Group__0 ) )
            {
            // InternalRPG.g:667:2: ( ( rule__AdditionalRule__Group__0 ) )
            // InternalRPG.g:668:3: ( rule__AdditionalRule__Group__0 )
            {
             before(grammarAccess.getAdditionalRuleAccess().getGroup()); 
            // InternalRPG.g:669:3: ( rule__AdditionalRule__Group__0 )
            // InternalRPG.g:669:4: rule__AdditionalRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionalRule"


    // $ANTLR start "entryRuleAdditionalBuffRule"
    // InternalRPG.g:678:1: entryRuleAdditionalBuffRule : ruleAdditionalBuffRule EOF ;
    public final void entryRuleAdditionalBuffRule() throws RecognitionException {
        try {
            // InternalRPG.g:679:1: ( ruleAdditionalBuffRule EOF )
            // InternalRPG.g:680:1: ruleAdditionalBuffRule EOF
            {
             before(grammarAccess.getAdditionalBuffRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditionalBuffRule();

            state._fsp--;

             after(grammarAccess.getAdditionalBuffRuleRule()); 
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
    // $ANTLR end "entryRuleAdditionalBuffRule"


    // $ANTLR start "ruleAdditionalBuffRule"
    // InternalRPG.g:687:1: ruleAdditionalBuffRule : ( ( rule__AdditionalBuffRule__Group__0 ) ) ;
    public final void ruleAdditionalBuffRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:691:2: ( ( ( rule__AdditionalBuffRule__Group__0 ) ) )
            // InternalRPG.g:692:2: ( ( rule__AdditionalBuffRule__Group__0 ) )
            {
            // InternalRPG.g:692:2: ( ( rule__AdditionalBuffRule__Group__0 ) )
            // InternalRPG.g:693:3: ( rule__AdditionalBuffRule__Group__0 )
            {
             before(grammarAccess.getAdditionalBuffRuleAccess().getGroup()); 
            // InternalRPG.g:694:3: ( rule__AdditionalBuffRule__Group__0 )
            // InternalRPG.g:694:4: rule__AdditionalBuffRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalBuffRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalBuffRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionalBuffRule"


    // $ANTLR start "entryRuleEntities"
    // InternalRPG.g:703:1: entryRuleEntities : ruleEntities EOF ;
    public final void entryRuleEntities() throws RecognitionException {
        try {
            // InternalRPG.g:704:1: ( ruleEntities EOF )
            // InternalRPG.g:705:1: ruleEntities EOF
            {
             before(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_1);
            ruleEntities();

            state._fsp--;

             after(grammarAccess.getEntitiesRule()); 
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
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // InternalRPG.g:712:1: ruleEntities : ( ( rule__Entities__Group__0 ) ) ;
    public final void ruleEntities() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:716:2: ( ( ( rule__Entities__Group__0 ) ) )
            // InternalRPG.g:717:2: ( ( rule__Entities__Group__0 ) )
            {
            // InternalRPG.g:717:2: ( ( rule__Entities__Group__0 ) )
            // InternalRPG.g:718:3: ( rule__Entities__Group__0 )
            {
             before(grammarAccess.getEntitiesAccess().getGroup()); 
            // InternalRPG.g:719:3: ( rule__Entities__Group__0 )
            // InternalRPG.g:719:4: rule__Entities__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entities__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRuleDeath"
    // InternalRPG.g:728:1: entryRuleDeath : ruleDeath EOF ;
    public final void entryRuleDeath() throws RecognitionException {
        try {
            // InternalRPG.g:729:1: ( ruleDeath EOF )
            // InternalRPG.g:730:1: ruleDeath EOF
            {
             before(grammarAccess.getDeathRule()); 
            pushFollow(FOLLOW_1);
            ruleDeath();

            state._fsp--;

             after(grammarAccess.getDeathRule()); 
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
    // $ANTLR end "entryRuleDeath"


    // $ANTLR start "ruleDeath"
    // InternalRPG.g:737:1: ruleDeath : ( ( rule__Death__Group__0 ) ) ;
    public final void ruleDeath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:741:2: ( ( ( rule__Death__Group__0 ) ) )
            // InternalRPG.g:742:2: ( ( rule__Death__Group__0 ) )
            {
            // InternalRPG.g:742:2: ( ( rule__Death__Group__0 ) )
            // InternalRPG.g:743:3: ( rule__Death__Group__0 )
            {
             before(grammarAccess.getDeathAccess().getGroup()); 
            // InternalRPG.g:744:3: ( rule__Death__Group__0 )
            // InternalRPG.g:744:4: rule__Death__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Death__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeath"


    // $ANTLR start "entryRuleEntity"
    // InternalRPG.g:753:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalRPG.g:754:1: ( ruleEntity EOF )
            // InternalRPG.g:755:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalRPG.g:762:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:766:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalRPG.g:767:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalRPG.g:767:2: ( ( rule__Entity__Group__0 ) )
            // InternalRPG.g:768:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalRPG.g:769:3: ( rule__Entity__Group__0 )
            // InternalRPG.g:769:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityMoves"
    // InternalRPG.g:778:1: entryRuleEntityMoves : ruleEntityMoves EOF ;
    public final void entryRuleEntityMoves() throws RecognitionException {
        try {
            // InternalRPG.g:779:1: ( ruleEntityMoves EOF )
            // InternalRPG.g:780:1: ruleEntityMoves EOF
            {
             before(grammarAccess.getEntityMovesRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityMoves();

            state._fsp--;

             after(grammarAccess.getEntityMovesRule()); 
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
    // $ANTLR end "entryRuleEntityMoves"


    // $ANTLR start "ruleEntityMoves"
    // InternalRPG.g:787:1: ruleEntityMoves : ( ( rule__EntityMoves__Group__0 ) ) ;
    public final void ruleEntityMoves() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:791:2: ( ( ( rule__EntityMoves__Group__0 ) ) )
            // InternalRPG.g:792:2: ( ( rule__EntityMoves__Group__0 ) )
            {
            // InternalRPG.g:792:2: ( ( rule__EntityMoves__Group__0 ) )
            // InternalRPG.g:793:3: ( rule__EntityMoves__Group__0 )
            {
             before(grammarAccess.getEntityMovesAccess().getGroup()); 
            // InternalRPG.g:794:3: ( rule__EntityMoves__Group__0 )
            // InternalRPG.g:794:4: rule__EntityMoves__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoves__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityMovesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityMoves"


    // $ANTLR start "entryRuleTeams"
    // InternalRPG.g:803:1: entryRuleTeams : ruleTeams EOF ;
    public final void entryRuleTeams() throws RecognitionException {
        try {
            // InternalRPG.g:804:1: ( ruleTeams EOF )
            // InternalRPG.g:805:1: ruleTeams EOF
            {
             before(grammarAccess.getTeamsRule()); 
            pushFollow(FOLLOW_1);
            ruleTeams();

            state._fsp--;

             after(grammarAccess.getTeamsRule()); 
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
    // $ANTLR end "entryRuleTeams"


    // $ANTLR start "ruleTeams"
    // InternalRPG.g:812:1: ruleTeams : ( ( rule__Teams__Group__0 ) ) ;
    public final void ruleTeams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:816:2: ( ( ( rule__Teams__Group__0 ) ) )
            // InternalRPG.g:817:2: ( ( rule__Teams__Group__0 ) )
            {
            // InternalRPG.g:817:2: ( ( rule__Teams__Group__0 ) )
            // InternalRPG.g:818:3: ( rule__Teams__Group__0 )
            {
             before(grammarAccess.getTeamsAccess().getGroup()); 
            // InternalRPG.g:819:3: ( rule__Teams__Group__0 )
            // InternalRPG.g:819:4: rule__Teams__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Teams__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeamsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeams"


    // $ANTLR start "entryRuleTeam"
    // InternalRPG.g:828:1: entryRuleTeam : ruleTeam EOF ;
    public final void entryRuleTeam() throws RecognitionException {
        try {
            // InternalRPG.g:829:1: ( ruleTeam EOF )
            // InternalRPG.g:830:1: ruleTeam EOF
            {
             before(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getTeamRule()); 
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
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalRPG.g:837:1: ruleTeam : ( ( rule__Team__Group__0 ) ) ;
    public final void ruleTeam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:841:2: ( ( ( rule__Team__Group__0 ) ) )
            // InternalRPG.g:842:2: ( ( rule__Team__Group__0 ) )
            {
            // InternalRPG.g:842:2: ( ( rule__Team__Group__0 ) )
            // InternalRPG.g:843:3: ( rule__Team__Group__0 )
            {
             before(grammarAccess.getTeamAccess().getGroup()); 
            // InternalRPG.g:844:3: ( rule__Team__Group__0 )
            // InternalRPG.g:844:4: rule__Team__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleMembers"
    // InternalRPG.g:853:1: entryRuleMembers : ruleMembers EOF ;
    public final void entryRuleMembers() throws RecognitionException {
        try {
            // InternalRPG.g:854:1: ( ruleMembers EOF )
            // InternalRPG.g:855:1: ruleMembers EOF
            {
             before(grammarAccess.getMembersRule()); 
            pushFollow(FOLLOW_1);
            ruleMembers();

            state._fsp--;

             after(grammarAccess.getMembersRule()); 
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
    // $ANTLR end "entryRuleMembers"


    // $ANTLR start "ruleMembers"
    // InternalRPG.g:862:1: ruleMembers : ( ( rule__Members__Group__0 ) ) ;
    public final void ruleMembers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:866:2: ( ( ( rule__Members__Group__0 ) ) )
            // InternalRPG.g:867:2: ( ( rule__Members__Group__0 ) )
            {
            // InternalRPG.g:867:2: ( ( rule__Members__Group__0 ) )
            // InternalRPG.g:868:3: ( rule__Members__Group__0 )
            {
             before(grammarAccess.getMembersAccess().getGroup()); 
            // InternalRPG.g:869:3: ( rule__Members__Group__0 )
            // InternalRPG.g:869:4: rule__Members__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Members__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMembersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMembers"


    // $ANTLR start "entryRuleRequire"
    // InternalRPG.g:878:1: entryRuleRequire : ruleRequire EOF ;
    public final void entryRuleRequire() throws RecognitionException {
        try {
            // InternalRPG.g:879:1: ( ruleRequire EOF )
            // InternalRPG.g:880:1: ruleRequire EOF
            {
             before(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            ruleRequire();

            state._fsp--;

             after(grammarAccess.getRequireRule()); 
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
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalRPG.g:887:1: ruleRequire : ( ( rule__Require__Group__0 ) ) ;
    public final void ruleRequire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:891:2: ( ( ( rule__Require__Group__0 ) ) )
            // InternalRPG.g:892:2: ( ( rule__Require__Group__0 ) )
            {
            // InternalRPG.g:892:2: ( ( rule__Require__Group__0 ) )
            // InternalRPG.g:893:3: ( rule__Require__Group__0 )
            {
             before(grammarAccess.getRequireAccess().getGroup()); 
            // InternalRPG.g:894:3: ( rule__Require__Group__0 )
            // InternalRPG.g:894:4: rule__Require__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Require__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequireAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleORcondition"
    // InternalRPG.g:903:1: entryRuleORcondition : ruleORcondition EOF ;
    public final void entryRuleORcondition() throws RecognitionException {
        try {
            // InternalRPG.g:904:1: ( ruleORcondition EOF )
            // InternalRPG.g:905:1: ruleORcondition EOF
            {
             before(grammarAccess.getORconditionRule()); 
            pushFollow(FOLLOW_1);
            ruleORcondition();

            state._fsp--;

             after(grammarAccess.getORconditionRule()); 
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
    // $ANTLR end "entryRuleORcondition"


    // $ANTLR start "ruleORcondition"
    // InternalRPG.g:912:1: ruleORcondition : ( ( rule__ORcondition__Group__0 ) ) ;
    public final void ruleORcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:916:2: ( ( ( rule__ORcondition__Group__0 ) ) )
            // InternalRPG.g:917:2: ( ( rule__ORcondition__Group__0 ) )
            {
            // InternalRPG.g:917:2: ( ( rule__ORcondition__Group__0 ) )
            // InternalRPG.g:918:3: ( rule__ORcondition__Group__0 )
            {
             before(grammarAccess.getORconditionAccess().getGroup()); 
            // InternalRPG.g:919:3: ( rule__ORcondition__Group__0 )
            // InternalRPG.g:919:4: rule__ORcondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ORcondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getORconditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleORcondition"


    // $ANTLR start "entryRuleANDcondition"
    // InternalRPG.g:928:1: entryRuleANDcondition : ruleANDcondition EOF ;
    public final void entryRuleANDcondition() throws RecognitionException {
        try {
            // InternalRPG.g:929:1: ( ruleANDcondition EOF )
            // InternalRPG.g:930:1: ruleANDcondition EOF
            {
             before(grammarAccess.getANDconditionRule()); 
            pushFollow(FOLLOW_1);
            ruleANDcondition();

            state._fsp--;

             after(grammarAccess.getANDconditionRule()); 
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
    // $ANTLR end "entryRuleANDcondition"


    // $ANTLR start "ruleANDcondition"
    // InternalRPG.g:937:1: ruleANDcondition : ( ( rule__ANDcondition__Group__0 ) ) ;
    public final void ruleANDcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:941:2: ( ( ( rule__ANDcondition__Group__0 ) ) )
            // InternalRPG.g:942:2: ( ( rule__ANDcondition__Group__0 ) )
            {
            // InternalRPG.g:942:2: ( ( rule__ANDcondition__Group__0 ) )
            // InternalRPG.g:943:3: ( rule__ANDcondition__Group__0 )
            {
             before(grammarAccess.getANDconditionAccess().getGroup()); 
            // InternalRPG.g:944:3: ( rule__ANDcondition__Group__0 )
            // InternalRPG.g:944:4: rule__ANDcondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getANDconditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleANDcondition"


    // $ANTLR start "entryRuleStatement"
    // InternalRPG.g:953:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalRPG.g:954:1: ( ruleStatement EOF )
            // InternalRPG.g:955:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRPG.g:962:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:966:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalRPG.g:967:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalRPG.g:967:2: ( ( rule__Statement__Alternatives ) )
            // InternalRPG.g:968:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalRPG.g:969:3: ( rule__Statement__Alternatives )
            // InternalRPG.g:969:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleNumberComparing"
    // InternalRPG.g:978:1: entryRuleNumberComparing : ruleNumberComparing EOF ;
    public final void entryRuleNumberComparing() throws RecognitionException {
        try {
            // InternalRPG.g:979:1: ( ruleNumberComparing EOF )
            // InternalRPG.g:980:1: ruleNumberComparing EOF
            {
             before(grammarAccess.getNumberComparingRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberComparing();

            state._fsp--;

             after(grammarAccess.getNumberComparingRule()); 
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
    // $ANTLR end "entryRuleNumberComparing"


    // $ANTLR start "ruleNumberComparing"
    // InternalRPG.g:987:1: ruleNumberComparing : ( ( rule__NumberComparing__Group__0 ) ) ;
    public final void ruleNumberComparing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:991:2: ( ( ( rule__NumberComparing__Group__0 ) ) )
            // InternalRPG.g:992:2: ( ( rule__NumberComparing__Group__0 ) )
            {
            // InternalRPG.g:992:2: ( ( rule__NumberComparing__Group__0 ) )
            // InternalRPG.g:993:3: ( rule__NumberComparing__Group__0 )
            {
             before(grammarAccess.getNumberComparingAccess().getGroup()); 
            // InternalRPG.g:994:3: ( rule__NumberComparing__Group__0 )
            // InternalRPG.g:994:4: rule__NumberComparing__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberComparing__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberComparingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberComparing"


    // $ANTLR start "entryRuleComparator"
    // InternalRPG.g:1003:1: entryRuleComparator : ruleComparator EOF ;
    public final void entryRuleComparator() throws RecognitionException {
        try {
            // InternalRPG.g:1004:1: ( ruleComparator EOF )
            // InternalRPG.g:1005:1: ruleComparator EOF
            {
             before(grammarAccess.getComparatorRule()); 
            pushFollow(FOLLOW_1);
            ruleComparator();

            state._fsp--;

             after(grammarAccess.getComparatorRule()); 
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
    // $ANTLR end "entryRuleComparator"


    // $ANTLR start "ruleComparator"
    // InternalRPG.g:1012:1: ruleComparator : ( ( rule__Comparator__Alternatives ) ) ;
    public final void ruleComparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1016:2: ( ( ( rule__Comparator__Alternatives ) ) )
            // InternalRPG.g:1017:2: ( ( rule__Comparator__Alternatives ) )
            {
            // InternalRPG.g:1017:2: ( ( rule__Comparator__Alternatives ) )
            // InternalRPG.g:1018:3: ( rule__Comparator__Alternatives )
            {
             before(grammarAccess.getComparatorAccess().getAlternatives()); 
            // InternalRPG.g:1019:3: ( rule__Comparator__Alternatives )
            // InternalRPG.g:1019:4: rule__Comparator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparator"


    // $ANTLR start "entryRuleSum"
    // InternalRPG.g:1028:1: entryRuleSum : ruleSum EOF ;
    public final void entryRuleSum() throws RecognitionException {
        try {
            // InternalRPG.g:1029:1: ( ruleSum EOF )
            // InternalRPG.g:1030:1: ruleSum EOF
            {
             before(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getSumRule()); 
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
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalRPG.g:1037:1: ruleSum : ( ( rule__Sum__Group__0 ) ) ;
    public final void ruleSum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1041:2: ( ( ( rule__Sum__Group__0 ) ) )
            // InternalRPG.g:1042:2: ( ( rule__Sum__Group__0 ) )
            {
            // InternalRPG.g:1042:2: ( ( rule__Sum__Group__0 ) )
            // InternalRPG.g:1043:3: ( rule__Sum__Group__0 )
            {
             before(grammarAccess.getSumAccess().getGroup()); 
            // InternalRPG.g:1044:3: ( rule__Sum__Group__0 )
            // InternalRPG.g:1044:4: rule__Sum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleMultiply"
    // InternalRPG.g:1053:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalRPG.g:1054:1: ( ruleMultiply EOF )
            // InternalRPG.g:1055:1: ruleMultiply EOF
            {
             before(grammarAccess.getMultiplyRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getMultiplyRule()); 
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
    // $ANTLR end "entryRuleMultiply"


    // $ANTLR start "ruleMultiply"
    // InternalRPG.g:1062:1: ruleMultiply : ( ( rule__Multiply__Group__0 ) ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1066:2: ( ( ( rule__Multiply__Group__0 ) ) )
            // InternalRPG.g:1067:2: ( ( rule__Multiply__Group__0 ) )
            {
            // InternalRPG.g:1067:2: ( ( rule__Multiply__Group__0 ) )
            // InternalRPG.g:1068:3: ( rule__Multiply__Group__0 )
            {
             before(grammarAccess.getMultiplyAccess().getGroup()); 
            // InternalRPG.g:1069:3: ( rule__Multiply__Group__0 )
            // InternalRPG.g:1069:4: rule__Multiply__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiply"


    // $ANTLR start "entryRuleAtomicNumber"
    // InternalRPG.g:1078:1: entryRuleAtomicNumber : ruleAtomicNumber EOF ;
    public final void entryRuleAtomicNumber() throws RecognitionException {
        try {
            // InternalRPG.g:1079:1: ( ruleAtomicNumber EOF )
            // InternalRPG.g:1080:1: ruleAtomicNumber EOF
            {
             before(grammarAccess.getAtomicNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomicNumber();

            state._fsp--;

             after(grammarAccess.getAtomicNumberRule()); 
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
    // $ANTLR end "entryRuleAtomicNumber"


    // $ANTLR start "ruleAtomicNumber"
    // InternalRPG.g:1087:1: ruleAtomicNumber : ( ( rule__AtomicNumber__Alternatives ) ) ;
    public final void ruleAtomicNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1091:2: ( ( ( rule__AtomicNumber__Alternatives ) ) )
            // InternalRPG.g:1092:2: ( ( rule__AtomicNumber__Alternatives ) )
            {
            // InternalRPG.g:1092:2: ( ( rule__AtomicNumber__Alternatives ) )
            // InternalRPG.g:1093:3: ( rule__AtomicNumber__Alternatives )
            {
             before(grammarAccess.getAtomicNumberAccess().getAlternatives()); 
            // InternalRPG.g:1094:3: ( rule__AtomicNumber__Alternatives )
            // InternalRPG.g:1094:4: rule__AtomicNumber__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AtomicNumber__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomicNumber"


    // $ANTLR start "entryRuleActualNumbers"
    // InternalRPG.g:1103:1: entryRuleActualNumbers : ruleActualNumbers EOF ;
    public final void entryRuleActualNumbers() throws RecognitionException {
        try {
            // InternalRPG.g:1104:1: ( ruleActualNumbers EOF )
            // InternalRPG.g:1105:1: ruleActualNumbers EOF
            {
             before(grammarAccess.getActualNumbersRule()); 
            pushFollow(FOLLOW_1);
            ruleActualNumbers();

            state._fsp--;

             after(grammarAccess.getActualNumbersRule()); 
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
    // $ANTLR end "entryRuleActualNumbers"


    // $ANTLR start "ruleActualNumbers"
    // InternalRPG.g:1112:1: ruleActualNumbers : ( ( rule__ActualNumbers__Alternatives ) ) ;
    public final void ruleActualNumbers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1116:2: ( ( ( rule__ActualNumbers__Alternatives ) ) )
            // InternalRPG.g:1117:2: ( ( rule__ActualNumbers__Alternatives ) )
            {
            // InternalRPG.g:1117:2: ( ( rule__ActualNumbers__Alternatives ) )
            // InternalRPG.g:1118:3: ( rule__ActualNumbers__Alternatives )
            {
             before(grammarAccess.getActualNumbersAccess().getAlternatives()); 
            // InternalRPG.g:1119:3: ( rule__ActualNumbers__Alternatives )
            // InternalRPG.g:1119:4: rule__ActualNumbers__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActualNumbers__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActualNumbersAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActualNumbers"


    // $ANTLR start "entryRuleNameAttribute"
    // InternalRPG.g:1128:1: entryRuleNameAttribute : ruleNameAttribute EOF ;
    public final void entryRuleNameAttribute() throws RecognitionException {
        try {
            // InternalRPG.g:1129:1: ( ruleNameAttribute EOF )
            // InternalRPG.g:1130:1: ruleNameAttribute EOF
            {
             before(grammarAccess.getNameAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleNameAttribute();

            state._fsp--;

             after(grammarAccess.getNameAttributeRule()); 
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
    // $ANTLR end "entryRuleNameAttribute"


    // $ANTLR start "ruleNameAttribute"
    // InternalRPG.g:1137:1: ruleNameAttribute : ( ( rule__NameAttribute__AttributeAssignment ) ) ;
    public final void ruleNameAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1141:2: ( ( ( rule__NameAttribute__AttributeAssignment ) ) )
            // InternalRPG.g:1142:2: ( ( rule__NameAttribute__AttributeAssignment ) )
            {
            // InternalRPG.g:1142:2: ( ( rule__NameAttribute__AttributeAssignment ) )
            // InternalRPG.g:1143:3: ( rule__NameAttribute__AttributeAssignment )
            {
             before(grammarAccess.getNameAttributeAccess().getAttributeAssignment()); 
            // InternalRPG.g:1144:3: ( rule__NameAttribute__AttributeAssignment )
            // InternalRPG.g:1144:4: rule__NameAttribute__AttributeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NameAttribute__AttributeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNameAttributeAccess().getAttributeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameAttribute"


    // $ANTLR start "entryRuleIntNum"
    // InternalRPG.g:1153:1: entryRuleIntNum : ruleIntNum EOF ;
    public final void entryRuleIntNum() throws RecognitionException {
        try {
            // InternalRPG.g:1154:1: ( ruleIntNum EOF )
            // InternalRPG.g:1155:1: ruleIntNum EOF
            {
             before(grammarAccess.getIntNumRule()); 
            pushFollow(FOLLOW_1);
            ruleIntNum();

            state._fsp--;

             after(grammarAccess.getIntNumRule()); 
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
    // $ANTLR end "entryRuleIntNum"


    // $ANTLR start "ruleIntNum"
    // InternalRPG.g:1162:1: ruleIntNum : ( ( rule__IntNum__ValueAssignment ) ) ;
    public final void ruleIntNum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1166:2: ( ( ( rule__IntNum__ValueAssignment ) ) )
            // InternalRPG.g:1167:2: ( ( rule__IntNum__ValueAssignment ) )
            {
            // InternalRPG.g:1167:2: ( ( rule__IntNum__ValueAssignment ) )
            // InternalRPG.g:1168:3: ( rule__IntNum__ValueAssignment )
            {
             before(grammarAccess.getIntNumAccess().getValueAssignment()); 
            // InternalRPG.g:1169:3: ( rule__IntNum__ValueAssignment )
            // InternalRPG.g:1169:4: rule__IntNum__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntNum__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntNumAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntNum"


    // $ANTLR start "entryRuleFloatNum"
    // InternalRPG.g:1178:1: entryRuleFloatNum : ruleFloatNum EOF ;
    public final void entryRuleFloatNum() throws RecognitionException {
        try {
            // InternalRPG.g:1179:1: ( ruleFloatNum EOF )
            // InternalRPG.g:1180:1: ruleFloatNum EOF
            {
             before(grammarAccess.getFloatNumRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatNum();

            state._fsp--;

             after(grammarAccess.getFloatNumRule()); 
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
    // $ANTLR end "entryRuleFloatNum"


    // $ANTLR start "ruleFloatNum"
    // InternalRPG.g:1187:1: ruleFloatNum : ( ( rule__FloatNum__Group__0 ) ) ;
    public final void ruleFloatNum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1191:2: ( ( ( rule__FloatNum__Group__0 ) ) )
            // InternalRPG.g:1192:2: ( ( rule__FloatNum__Group__0 ) )
            {
            // InternalRPG.g:1192:2: ( ( rule__FloatNum__Group__0 ) )
            // InternalRPG.g:1193:3: ( rule__FloatNum__Group__0 )
            {
             before(grammarAccess.getFloatNumAccess().getGroup()); 
            // InternalRPG.g:1194:3: ( rule__FloatNum__Group__0 )
            // InternalRPG.g:1194:4: rule__FloatNum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FloatNum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatNumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatNum"


    // $ANTLR start "entryRuleLegalType"
    // InternalRPG.g:1203:1: entryRuleLegalType : ruleLegalType EOF ;
    public final void entryRuleLegalType() throws RecognitionException {
        try {
            // InternalRPG.g:1204:1: ( ruleLegalType EOF )
            // InternalRPG.g:1205:1: ruleLegalType EOF
            {
             before(grammarAccess.getLegalTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleLegalType();

            state._fsp--;

             after(grammarAccess.getLegalTypeRule()); 
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
    // $ANTLR end "entryRuleLegalType"


    // $ANTLR start "ruleLegalType"
    // InternalRPG.g:1212:1: ruleLegalType : ( ( rule__LegalType__Alternatives ) ) ;
    public final void ruleLegalType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1216:2: ( ( ( rule__LegalType__Alternatives ) ) )
            // InternalRPG.g:1217:2: ( ( rule__LegalType__Alternatives ) )
            {
            // InternalRPG.g:1217:2: ( ( rule__LegalType__Alternatives ) )
            // InternalRPG.g:1218:3: ( rule__LegalType__Alternatives )
            {
             before(grammarAccess.getLegalTypeAccess().getAlternatives()); 
            // InternalRPG.g:1219:3: ( rule__LegalType__Alternatives )
            // InternalRPG.g:1219:4: rule__LegalType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LegalType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLegalTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLegalType"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalRPG.g:1227:1: rule__Declaration__Alternatives : ( ( ruleLocations ) | ( ruleRelations ) | ( ruleMoves ) | ( ruleEntities ) | ( ruleTeams ) | ( ruleDeath ) | ( ruleAttributes ) | ( ruleEffects ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1231:1: ( ( ruleLocations ) | ( ruleRelations ) | ( ruleMoves ) | ( ruleEntities ) | ( ruleTeams ) | ( ruleDeath ) | ( ruleAttributes ) | ( ruleEffects ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 32:
                {
                alt1=3;
                }
                break;
            case 37:
                {
                alt1=4;
                }
                break;
            case 41:
                {
                alt1=5;
                }
                break;
            case 38:
                {
                alt1=6;
                }
                break;
            case 20:
                {
                alt1=7;
                }
                break;
            case 14:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRPG.g:1232:2: ( ruleLocations )
                    {
                    // InternalRPG.g:1232:2: ( ruleLocations )
                    // InternalRPG.g:1233:3: ruleLocations
                    {
                     before(grammarAccess.getDeclarationAccess().getLocationsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLocations();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getLocationsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1238:2: ( ruleRelations )
                    {
                    // InternalRPG.g:1238:2: ( ruleRelations )
                    // InternalRPG.g:1239:3: ruleRelations
                    {
                     before(grammarAccess.getDeclarationAccess().getRelationsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelations();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getRelationsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRPG.g:1244:2: ( ruleMoves )
                    {
                    // InternalRPG.g:1244:2: ( ruleMoves )
                    // InternalRPG.g:1245:3: ruleMoves
                    {
                     before(grammarAccess.getDeclarationAccess().getMovesParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMoves();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getMovesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRPG.g:1250:2: ( ruleEntities )
                    {
                    // InternalRPG.g:1250:2: ( ruleEntities )
                    // InternalRPG.g:1251:3: ruleEntities
                    {
                     before(grammarAccess.getDeclarationAccess().getEntitiesParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEntities();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getEntitiesParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRPG.g:1256:2: ( ruleTeams )
                    {
                    // InternalRPG.g:1256:2: ( ruleTeams )
                    // InternalRPG.g:1257:3: ruleTeams
                    {
                     before(grammarAccess.getDeclarationAccess().getTeamsParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTeams();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getTeamsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRPG.g:1262:2: ( ruleDeath )
                    {
                    // InternalRPG.g:1262:2: ( ruleDeath )
                    // InternalRPG.g:1263:3: ruleDeath
                    {
                     before(grammarAccess.getDeclarationAccess().getDeathParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDeath();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getDeathParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRPG.g:1268:2: ( ruleAttributes )
                    {
                    // InternalRPG.g:1268:2: ( ruleAttributes )
                    // InternalRPG.g:1269:3: ruleAttributes
                    {
                     before(grammarAccess.getDeclarationAccess().getAttributesParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributes();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getAttributesParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRPG.g:1274:2: ( ruleEffects )
                    {
                    // InternalRPG.g:1274:2: ( ruleEffects )
                    // InternalRPG.g:1275:3: ruleEffects
                    {
                     before(grammarAccess.getDeclarationAccess().getEffectsParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleEffects();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getEffectsParserRuleCall_7()); 

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
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__Effect__Alternatives_1"
    // InternalRPG.g:1284:1: rule__Effect__Alternatives_1 : ( ( ruleBuff ) | ( ruleMoveE ) | ( ruleAfterE ) );
    public final void rule__Effect__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1288:1: ( ( ruleBuff ) | ( ruleMoveE ) | ( ruleAfterE ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
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
                    // InternalRPG.g:1289:2: ( ruleBuff )
                    {
                    // InternalRPG.g:1289:2: ( ruleBuff )
                    // InternalRPG.g:1290:3: ruleBuff
                    {
                     before(grammarAccess.getEffectAccess().getBuffParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBuff();

                    state._fsp--;

                     after(grammarAccess.getEffectAccess().getBuffParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1295:2: ( ruleMoveE )
                    {
                    // InternalRPG.g:1295:2: ( ruleMoveE )
                    // InternalRPG.g:1296:3: ruleMoveE
                    {
                     before(grammarAccess.getEffectAccess().getMoveEParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveE();

                    state._fsp--;

                     after(grammarAccess.getEffectAccess().getMoveEParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRPG.g:1301:2: ( ruleAfterE )
                    {
                    // InternalRPG.g:1301:2: ( ruleAfterE )
                    // InternalRPG.g:1302:3: ruleAfterE
                    {
                     before(grammarAccess.getEffectAccess().getAfterEParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAfterE();

                    state._fsp--;

                     after(grammarAccess.getEffectAccess().getAfterEParserRuleCall_1_2()); 

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
    // $ANTLR end "rule__Effect__Alternatives_1"


    // $ANTLR start "rule__Move__Alternatives_4"
    // InternalRPG.g:1311:1: rule__Move__Alternatives_4 : ( ( ( rule__Move__MEffectAssignment_4_0 ) ) | ( ( rule__Move__BEffectAssignment_4_1 ) ) | ( ( rule__Move__AEffectAssignment_4_2 ) ) );
    public final void rule__Move__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1315:1: ( ( ( rule__Move__MEffectAssignment_4_0 ) ) | ( ( rule__Move__BEffectAssignment_4_1 ) ) | ( ( rule__Move__AEffectAssignment_4_2 ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt3=1;
                    }
                    break;
                case 16:
                    {
                    alt3=2;
                    }
                    break;
                case 19:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRPG.g:1316:2: ( ( rule__Move__MEffectAssignment_4_0 ) )
                    {
                    // InternalRPG.g:1316:2: ( ( rule__Move__MEffectAssignment_4_0 ) )
                    // InternalRPG.g:1317:3: ( rule__Move__MEffectAssignment_4_0 )
                    {
                     before(grammarAccess.getMoveAccess().getMEffectAssignment_4_0()); 
                    // InternalRPG.g:1318:3: ( rule__Move__MEffectAssignment_4_0 )
                    // InternalRPG.g:1318:4: rule__Move__MEffectAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__MEffectAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMoveAccess().getMEffectAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1322:2: ( ( rule__Move__BEffectAssignment_4_1 ) )
                    {
                    // InternalRPG.g:1322:2: ( ( rule__Move__BEffectAssignment_4_1 ) )
                    // InternalRPG.g:1323:3: ( rule__Move__BEffectAssignment_4_1 )
                    {
                     before(grammarAccess.getMoveAccess().getBEffectAssignment_4_1()); 
                    // InternalRPG.g:1324:3: ( rule__Move__BEffectAssignment_4_1 )
                    // InternalRPG.g:1324:4: rule__Move__BEffectAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__BEffectAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMoveAccess().getBEffectAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRPG.g:1328:2: ( ( rule__Move__AEffectAssignment_4_2 ) )
                    {
                    // InternalRPG.g:1328:2: ( ( rule__Move__AEffectAssignment_4_2 ) )
                    // InternalRPG.g:1329:3: ( rule__Move__AEffectAssignment_4_2 )
                    {
                     before(grammarAccess.getMoveAccess().getAEffectAssignment_4_2()); 
                    // InternalRPG.g:1330:3: ( rule__Move__AEffectAssignment_4_2 )
                    // InternalRPG.g:1330:4: rule__Move__AEffectAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__AEffectAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMoveAccess().getAEffectAssignment_4_2()); 

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
    // $ANTLR end "rule__Move__Alternatives_4"


    // $ANTLR start "rule__AttributeValues__Alternatives_1"
    // InternalRPG.g:1338:1: rule__AttributeValues__Alternatives_1 : ( ( ( rule__AttributeValues__LTypesAssignment_1_0 ) ) | ( ( rule__AttributeValues__AnAssignment_1_1 ) ) );
    public final void rule__AttributeValues__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1342:1: ( ( ( rule__AttributeValues__LTypesAssignment_1_0 ) ) | ( ( rule__AttributeValues__AnAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRPG.g:1343:2: ( ( rule__AttributeValues__LTypesAssignment_1_0 ) )
                    {
                    // InternalRPG.g:1343:2: ( ( rule__AttributeValues__LTypesAssignment_1_0 ) )
                    // InternalRPG.g:1344:3: ( rule__AttributeValues__LTypesAssignment_1_0 )
                    {
                     before(grammarAccess.getAttributeValuesAccess().getLTypesAssignment_1_0()); 
                    // InternalRPG.g:1345:3: ( rule__AttributeValues__LTypesAssignment_1_0 )
                    // InternalRPG.g:1345:4: rule__AttributeValues__LTypesAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeValues__LTypesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValuesAccess().getLTypesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1349:2: ( ( rule__AttributeValues__AnAssignment_1_1 ) )
                    {
                    // InternalRPG.g:1349:2: ( ( rule__AttributeValues__AnAssignment_1_1 ) )
                    // InternalRPG.g:1350:3: ( rule__AttributeValues__AnAssignment_1_1 )
                    {
                     before(grammarAccess.getAttributeValuesAccess().getAnAssignment_1_1()); 
                    // InternalRPG.g:1351:3: ( rule__AttributeValues__AnAssignment_1_1 )
                    // InternalRPG.g:1351:4: rule__AttributeValues__AnAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeValues__AnAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValuesAccess().getAnAssignment_1_1()); 

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
    // $ANTLR end "rule__AttributeValues__Alternatives_1"


    // $ANTLR start "rule__AdditionalRule__Alternatives_4"
    // InternalRPG.g:1359:1: rule__AdditionalRule__Alternatives_4 : ( ( ( rule__AdditionalRule__HitsAssignment_4_0 ) ) | ( ( rule__AdditionalRule__HitsAssignment_4_1 ) ) );
    public final void rule__AdditionalRule__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1363:1: ( ( ( rule__AdditionalRule__HitsAssignment_4_0 ) ) | ( ( rule__AdditionalRule__HitsAssignment_4_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==60) ) {
                alt5=1;
            }
            else if ( (LA5_0==61) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRPG.g:1364:2: ( ( rule__AdditionalRule__HitsAssignment_4_0 ) )
                    {
                    // InternalRPG.g:1364:2: ( ( rule__AdditionalRule__HitsAssignment_4_0 ) )
                    // InternalRPG.g:1365:3: ( rule__AdditionalRule__HitsAssignment_4_0 )
                    {
                     before(grammarAccess.getAdditionalRuleAccess().getHitsAssignment_4_0()); 
                    // InternalRPG.g:1366:3: ( rule__AdditionalRule__HitsAssignment_4_0 )
                    // InternalRPG.g:1366:4: rule__AdditionalRule__HitsAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AdditionalRule__HitsAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionalRuleAccess().getHitsAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1370:2: ( ( rule__AdditionalRule__HitsAssignment_4_1 ) )
                    {
                    // InternalRPG.g:1370:2: ( ( rule__AdditionalRule__HitsAssignment_4_1 ) )
                    // InternalRPG.g:1371:3: ( rule__AdditionalRule__HitsAssignment_4_1 )
                    {
                     before(grammarAccess.getAdditionalRuleAccess().getHitsAssignment_4_1()); 
                    // InternalRPG.g:1372:3: ( rule__AdditionalRule__HitsAssignment_4_1 )
                    // InternalRPG.g:1372:4: rule__AdditionalRule__HitsAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AdditionalRule__HitsAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionalRuleAccess().getHitsAssignment_4_1()); 

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
    // $ANTLR end "rule__AdditionalRule__Alternatives_4"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalRPG.g:1380:1: rule__Statement__Alternatives : ( ( ruleNumberComparing ) | ( ( rule__Statement__Group_1__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1384:1: ( ( ruleNumberComparing ) | ( ( rule__Statement__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)) ) {
                alt6=1;
            }
            else if ( (LA6_0==47) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRPG.g:1385:2: ( ruleNumberComparing )
                    {
                    // InternalRPG.g:1385:2: ( ruleNumberComparing )
                    // InternalRPG.g:1386:3: ruleNumberComparing
                    {
                     before(grammarAccess.getStatementAccess().getNumberComparingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberComparing();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getNumberComparingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1391:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalRPG.g:1391:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalRPG.g:1392:3: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // InternalRPG.g:1393:3: ( rule__Statement__Group_1__0 )
                    // InternalRPG.g:1393:4: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Comparator__Alternatives"
    // InternalRPG.g:1401:1: rule__Comparator__Alternatives : ( ( ( rule__Comparator__Group_0__0 ) ) | ( ( rule__Comparator__Group_1__0 ) ) | ( ( rule__Comparator__Group_2__0 ) ) | ( ( rule__Comparator__Group_3__0 ) ) | ( ( rule__Comparator__Group_4__0 ) ) | ( ( rule__Comparator__Group_5__0 ) ) );
    public final void rule__Comparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1405:1: ( ( ( rule__Comparator__Group_0__0 ) ) | ( ( rule__Comparator__Group_1__0 ) ) | ( ( rule__Comparator__Group_2__0 ) ) | ( ( rule__Comparator__Group_3__0 ) ) | ( ( rule__Comparator__Group_4__0 ) ) | ( ( rule__Comparator__Group_5__0 ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 49:
                {
                alt7=2;
                }
                break;
            case 50:
                {
                alt7=3;
                }
                break;
            case 51:
                {
                alt7=4;
                }
                break;
            case 52:
                {
                alt7=5;
                }
                break;
            case 53:
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
                    // InternalRPG.g:1406:2: ( ( rule__Comparator__Group_0__0 ) )
                    {
                    // InternalRPG.g:1406:2: ( ( rule__Comparator__Group_0__0 ) )
                    // InternalRPG.g:1407:3: ( rule__Comparator__Group_0__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_0()); 
                    // InternalRPG.g:1408:3: ( rule__Comparator__Group_0__0 )
                    // InternalRPG.g:1408:4: rule__Comparator__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1412:2: ( ( rule__Comparator__Group_1__0 ) )
                    {
                    // InternalRPG.g:1412:2: ( ( rule__Comparator__Group_1__0 ) )
                    // InternalRPG.g:1413:3: ( rule__Comparator__Group_1__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_1()); 
                    // InternalRPG.g:1414:3: ( rule__Comparator__Group_1__0 )
                    // InternalRPG.g:1414:4: rule__Comparator__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRPG.g:1418:2: ( ( rule__Comparator__Group_2__0 ) )
                    {
                    // InternalRPG.g:1418:2: ( ( rule__Comparator__Group_2__0 ) )
                    // InternalRPG.g:1419:3: ( rule__Comparator__Group_2__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_2()); 
                    // InternalRPG.g:1420:3: ( rule__Comparator__Group_2__0 )
                    // InternalRPG.g:1420:4: rule__Comparator__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRPG.g:1424:2: ( ( rule__Comparator__Group_3__0 ) )
                    {
                    // InternalRPG.g:1424:2: ( ( rule__Comparator__Group_3__0 ) )
                    // InternalRPG.g:1425:3: ( rule__Comparator__Group_3__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_3()); 
                    // InternalRPG.g:1426:3: ( rule__Comparator__Group_3__0 )
                    // InternalRPG.g:1426:4: rule__Comparator__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRPG.g:1430:2: ( ( rule__Comparator__Group_4__0 ) )
                    {
                    // InternalRPG.g:1430:2: ( ( rule__Comparator__Group_4__0 ) )
                    // InternalRPG.g:1431:3: ( rule__Comparator__Group_4__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_4()); 
                    // InternalRPG.g:1432:3: ( rule__Comparator__Group_4__0 )
                    // InternalRPG.g:1432:4: rule__Comparator__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRPG.g:1436:2: ( ( rule__Comparator__Group_5__0 ) )
                    {
                    // InternalRPG.g:1436:2: ( ( rule__Comparator__Group_5__0 ) )
                    // InternalRPG.g:1437:3: ( rule__Comparator__Group_5__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_5()); 
                    // InternalRPG.g:1438:3: ( rule__Comparator__Group_5__0 )
                    // InternalRPG.g:1438:4: rule__Comparator__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Comparator__Alternatives"


    // $ANTLR start "rule__Sum__Alternatives_1_0"
    // InternalRPG.g:1446:1: rule__Sum__Alternatives_1_0 : ( ( ( rule__Sum__Group_1_0_0__0 ) ) | ( ( rule__Sum__Group_1_0_1__0 ) ) );
    public final void rule__Sum__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1450:1: ( ( ( rule__Sum__Group_1_0_0__0 ) ) | ( ( rule__Sum__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==54) ) {
                alt8=1;
            }
            else if ( (LA8_0==55) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRPG.g:1451:2: ( ( rule__Sum__Group_1_0_0__0 ) )
                    {
                    // InternalRPG.g:1451:2: ( ( rule__Sum__Group_1_0_0__0 ) )
                    // InternalRPG.g:1452:3: ( rule__Sum__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getSumAccess().getGroup_1_0_0()); 
                    // InternalRPG.g:1453:3: ( rule__Sum__Group_1_0_0__0 )
                    // InternalRPG.g:1453:4: rule__Sum__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sum__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSumAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1457:2: ( ( rule__Sum__Group_1_0_1__0 ) )
                    {
                    // InternalRPG.g:1457:2: ( ( rule__Sum__Group_1_0_1__0 ) )
                    // InternalRPG.g:1458:3: ( rule__Sum__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getSumAccess().getGroup_1_0_1()); 
                    // InternalRPG.g:1459:3: ( rule__Sum__Group_1_0_1__0 )
                    // InternalRPG.g:1459:4: rule__Sum__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sum__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSumAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Sum__Alternatives_1_0"


    // $ANTLR start "rule__Multiply__Alternatives_1_0"
    // InternalRPG.g:1467:1: rule__Multiply__Alternatives_1_0 : ( ( ( rule__Multiply__Group_1_0_0__0 ) ) | ( ( rule__Multiply__Group_1_0_1__0 ) ) );
    public final void rule__Multiply__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1471:1: ( ( ( rule__Multiply__Group_1_0_0__0 ) ) | ( ( rule__Multiply__Group_1_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==56) ) {
                alt9=1;
            }
            else if ( (LA9_0==57) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRPG.g:1472:2: ( ( rule__Multiply__Group_1_0_0__0 ) )
                    {
                    // InternalRPG.g:1472:2: ( ( rule__Multiply__Group_1_0_0__0 ) )
                    // InternalRPG.g:1473:3: ( rule__Multiply__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplyAccess().getGroup_1_0_0()); 
                    // InternalRPG.g:1474:3: ( rule__Multiply__Group_1_0_0__0 )
                    // InternalRPG.g:1474:4: rule__Multiply__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiply__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplyAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1478:2: ( ( rule__Multiply__Group_1_0_1__0 ) )
                    {
                    // InternalRPG.g:1478:2: ( ( rule__Multiply__Group_1_0_1__0 ) )
                    // InternalRPG.g:1479:3: ( rule__Multiply__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplyAccess().getGroup_1_0_1()); 
                    // InternalRPG.g:1480:3: ( rule__Multiply__Group_1_0_1__0 )
                    // InternalRPG.g:1480:4: rule__Multiply__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiply__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplyAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Multiply__Alternatives_1_0"


    // $ANTLR start "rule__AtomicNumber__Alternatives"
    // InternalRPG.g:1488:1: rule__AtomicNumber__Alternatives : ( ( ruleActualNumbers ) | ( ruleNameAttribute ) );
    public final void rule__AtomicNumber__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1492:1: ( ( ruleActualNumbers ) | ( ruleNameAttribute ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRPG.g:1493:2: ( ruleActualNumbers )
                    {
                    // InternalRPG.g:1493:2: ( ruleActualNumbers )
                    // InternalRPG.g:1494:3: ruleActualNumbers
                    {
                     before(grammarAccess.getAtomicNumberAccess().getActualNumbersParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActualNumbers();

                    state._fsp--;

                     after(grammarAccess.getAtomicNumberAccess().getActualNumbersParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1499:2: ( ruleNameAttribute )
                    {
                    // InternalRPG.g:1499:2: ( ruleNameAttribute )
                    // InternalRPG.g:1500:3: ruleNameAttribute
                    {
                     before(grammarAccess.getAtomicNumberAccess().getNameAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNameAttribute();

                    state._fsp--;

                     after(grammarAccess.getAtomicNumberAccess().getNameAttributeParserRuleCall_1()); 

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
    // $ANTLR end "rule__AtomicNumber__Alternatives"


    // $ANTLR start "rule__ActualNumbers__Alternatives"
    // InternalRPG.g:1509:1: rule__ActualNumbers__Alternatives : ( ( ruleFloatNum ) | ( ruleIntNum ) );
    public final void rule__ActualNumbers__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1513:1: ( ( ruleFloatNum ) | ( ruleIntNum ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||(LA11_1>=14 && LA11_1<=15)||(LA11_1>=17 && LA11_1<=18)||(LA11_1>=20 && LA11_1<=24)||LA11_1==26||(LA11_1>=29 && LA11_1<=32)||(LA11_1>=35 && LA11_1<=38)||LA11_1==41||(LA11_1>=45 && LA11_1<=46)||(LA11_1>=48 && LA11_1<=57)||LA11_1==59) ) {
                    alt11=2;
                }
                else if ( (LA11_1==58) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRPG.g:1514:2: ( ruleFloatNum )
                    {
                    // InternalRPG.g:1514:2: ( ruleFloatNum )
                    // InternalRPG.g:1515:3: ruleFloatNum
                    {
                     before(grammarAccess.getActualNumbersAccess().getFloatNumParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFloatNum();

                    state._fsp--;

                     after(grammarAccess.getActualNumbersAccess().getFloatNumParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1520:2: ( ruleIntNum )
                    {
                    // InternalRPG.g:1520:2: ( ruleIntNum )
                    // InternalRPG.g:1521:3: ruleIntNum
                    {
                     before(grammarAccess.getActualNumbersAccess().getIntNumParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntNum();

                    state._fsp--;

                     after(grammarAccess.getActualNumbersAccess().getIntNumParserRuleCall_1()); 

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
    // $ANTLR end "rule__ActualNumbers__Alternatives"


    // $ANTLR start "rule__LegalType__Alternatives"
    // InternalRPG.g:1530:1: rule__LegalType__Alternatives : ( ( 'Float' ) | ( 'Integer' ) );
    public final void rule__LegalType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1534:1: ( ( 'Float' ) | ( 'Integer' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==11) ) {
                alt12=1;
            }
            else if ( (LA12_0==12) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRPG.g:1535:2: ( 'Float' )
                    {
                    // InternalRPG.g:1535:2: ( 'Float' )
                    // InternalRPG.g:1536:3: 'Float'
                    {
                     before(grammarAccess.getLegalTypeAccess().getFloatKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getLegalTypeAccess().getFloatKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1541:2: ( 'Integer' )
                    {
                    // InternalRPG.g:1541:2: ( 'Integer' )
                    // InternalRPG.g:1542:3: 'Integer'
                    {
                     before(grammarAccess.getLegalTypeAccess().getIntegerKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getLegalTypeAccess().getIntegerKeyword_1()); 

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
    // $ANTLR end "rule__LegalType__Alternatives"


    // $ANTLR start "rule__SystemRPG__Group__0"
    // InternalRPG.g:1551:1: rule__SystemRPG__Group__0 : rule__SystemRPG__Group__0__Impl rule__SystemRPG__Group__1 ;
    public final void rule__SystemRPG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1555:1: ( rule__SystemRPG__Group__0__Impl rule__SystemRPG__Group__1 )
            // InternalRPG.g:1556:2: rule__SystemRPG__Group__0__Impl rule__SystemRPG__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SystemRPG__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemRPG__Group__1();

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
    // $ANTLR end "rule__SystemRPG__Group__0"


    // $ANTLR start "rule__SystemRPG__Group__0__Impl"
    // InternalRPG.g:1563:1: rule__SystemRPG__Group__0__Impl : ( 'game' ) ;
    public final void rule__SystemRPG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1567:1: ( ( 'game' ) )
            // InternalRPG.g:1568:1: ( 'game' )
            {
            // InternalRPG.g:1568:1: ( 'game' )
            // InternalRPG.g:1569:2: 'game'
            {
             before(grammarAccess.getSystemRPGAccess().getGameKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSystemRPGAccess().getGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRPG__Group__0__Impl"


    // $ANTLR start "rule__SystemRPG__Group__1"
    // InternalRPG.g:1578:1: rule__SystemRPG__Group__1 : rule__SystemRPG__Group__1__Impl rule__SystemRPG__Group__2 ;
    public final void rule__SystemRPG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1582:1: ( rule__SystemRPG__Group__1__Impl rule__SystemRPG__Group__2 )
            // InternalRPG.g:1583:2: rule__SystemRPG__Group__1__Impl rule__SystemRPG__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SystemRPG__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemRPG__Group__2();

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
    // $ANTLR end "rule__SystemRPG__Group__1"


    // $ANTLR start "rule__SystemRPG__Group__1__Impl"
    // InternalRPG.g:1590:1: rule__SystemRPG__Group__1__Impl : ( ( rule__SystemRPG__NameAssignment_1 ) ) ;
    public final void rule__SystemRPG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1594:1: ( ( ( rule__SystemRPG__NameAssignment_1 ) ) )
            // InternalRPG.g:1595:1: ( ( rule__SystemRPG__NameAssignment_1 ) )
            {
            // InternalRPG.g:1595:1: ( ( rule__SystemRPG__NameAssignment_1 ) )
            // InternalRPG.g:1596:2: ( rule__SystemRPG__NameAssignment_1 )
            {
             before(grammarAccess.getSystemRPGAccess().getNameAssignment_1()); 
            // InternalRPG.g:1597:2: ( rule__SystemRPG__NameAssignment_1 )
            // InternalRPG.g:1597:3: rule__SystemRPG__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemRPG__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemRPGAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRPG__Group__1__Impl"


    // $ANTLR start "rule__SystemRPG__Group__2"
    // InternalRPG.g:1605:1: rule__SystemRPG__Group__2 : rule__SystemRPG__Group__2__Impl ;
    public final void rule__SystemRPG__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1609:1: ( rule__SystemRPG__Group__2__Impl )
            // InternalRPG.g:1610:2: rule__SystemRPG__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemRPG__Group__2__Impl();

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
    // $ANTLR end "rule__SystemRPG__Group__2"


    // $ANTLR start "rule__SystemRPG__Group__2__Impl"
    // InternalRPG.g:1616:1: rule__SystemRPG__Group__2__Impl : ( ( rule__SystemRPG__DeclarationsAssignment_2 )* ) ;
    public final void rule__SystemRPG__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1620:1: ( ( ( rule__SystemRPG__DeclarationsAssignment_2 )* ) )
            // InternalRPG.g:1621:1: ( ( rule__SystemRPG__DeclarationsAssignment_2 )* )
            {
            // InternalRPG.g:1621:1: ( ( rule__SystemRPG__DeclarationsAssignment_2 )* )
            // InternalRPG.g:1622:2: ( rule__SystemRPG__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getSystemRPGAccess().getDeclarationsAssignment_2()); 
            // InternalRPG.g:1623:2: ( rule__SystemRPG__DeclarationsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14||LA13_0==20||LA13_0==22||LA13_0==26||LA13_0==32||(LA13_0>=37 && LA13_0<=38)||LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRPG.g:1623:3: rule__SystemRPG__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SystemRPG__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSystemRPGAccess().getDeclarationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRPG__Group__2__Impl"


    // $ANTLR start "rule__Effects__Group__0"
    // InternalRPG.g:1632:1: rule__Effects__Group__0 : rule__Effects__Group__0__Impl rule__Effects__Group__1 ;
    public final void rule__Effects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1636:1: ( rule__Effects__Group__0__Impl rule__Effects__Group__1 )
            // InternalRPG.g:1637:2: rule__Effects__Group__0__Impl rule__Effects__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Effects__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effects__Group__1();

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
    // $ANTLR end "rule__Effects__Group__0"


    // $ANTLR start "rule__Effects__Group__0__Impl"
    // InternalRPG.g:1644:1: rule__Effects__Group__0__Impl : ( 'effects' ) ;
    public final void rule__Effects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1648:1: ( ( 'effects' ) )
            // InternalRPG.g:1649:1: ( 'effects' )
            {
            // InternalRPG.g:1649:1: ( 'effects' )
            // InternalRPG.g:1650:2: 'effects'
            {
             before(grammarAccess.getEffectsAccess().getEffectsKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEffectsAccess().getEffectsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effects__Group__0__Impl"


    // $ANTLR start "rule__Effects__Group__1"
    // InternalRPG.g:1659:1: rule__Effects__Group__1 : rule__Effects__Group__1__Impl ;
    public final void rule__Effects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1663:1: ( rule__Effects__Group__1__Impl )
            // InternalRPG.g:1664:2: rule__Effects__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Effects__Group__1__Impl();

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
    // $ANTLR end "rule__Effects__Group__1"


    // $ANTLR start "rule__Effects__Group__1__Impl"
    // InternalRPG.g:1670:1: rule__Effects__Group__1__Impl : ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) ) ;
    public final void rule__Effects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1674:1: ( ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) ) )
            // InternalRPG.g:1675:1: ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) )
            {
            // InternalRPG.g:1675:1: ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) )
            // InternalRPG.g:1676:2: ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* )
            {
            // InternalRPG.g:1676:2: ( ( rule__Effects__EffectAssignment_1 ) )
            // InternalRPG.g:1677:3: ( rule__Effects__EffectAssignment_1 )
            {
             before(grammarAccess.getEffectsAccess().getEffectAssignment_1()); 
            // InternalRPG.g:1678:3: ( rule__Effects__EffectAssignment_1 )
            // InternalRPG.g:1678:4: rule__Effects__EffectAssignment_1
            {
            pushFollow(FOLLOW_7);
            rule__Effects__EffectAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectsAccess().getEffectAssignment_1()); 

            }

            // InternalRPG.g:1681:2: ( ( rule__Effects__EffectAssignment_1 )* )
            // InternalRPG.g:1682:3: ( rule__Effects__EffectAssignment_1 )*
            {
             before(grammarAccess.getEffectsAccess().getEffectAssignment_1()); 
            // InternalRPG.g:1683:3: ( rule__Effects__EffectAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRPG.g:1683:4: rule__Effects__EffectAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Effects__EffectAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEffectsAccess().getEffectAssignment_1()); 

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
    // $ANTLR end "rule__Effects__Group__1__Impl"


    // $ANTLR start "rule__Effect__Group__0"
    // InternalRPG.g:1693:1: rule__Effect__Group__0 : rule__Effect__Group__0__Impl rule__Effect__Group__1 ;
    public final void rule__Effect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1697:1: ( rule__Effect__Group__0__Impl rule__Effect__Group__1 )
            // InternalRPG.g:1698:2: rule__Effect__Group__0__Impl rule__Effect__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Effect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effect__Group__1();

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
    // $ANTLR end "rule__Effect__Group__0"


    // $ANTLR start "rule__Effect__Group__0__Impl"
    // InternalRPG.g:1705:1: rule__Effect__Group__0__Impl : ( 'effect' ) ;
    public final void rule__Effect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1709:1: ( ( 'effect' ) )
            // InternalRPG.g:1710:1: ( 'effect' )
            {
            // InternalRPG.g:1710:1: ( 'effect' )
            // InternalRPG.g:1711:2: 'effect'
            {
             before(grammarAccess.getEffectAccess().getEffectKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEffectAccess().getEffectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__0__Impl"


    // $ANTLR start "rule__Effect__Group__1"
    // InternalRPG.g:1720:1: rule__Effect__Group__1 : rule__Effect__Group__1__Impl ;
    public final void rule__Effect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1724:1: ( rule__Effect__Group__1__Impl )
            // InternalRPG.g:1725:2: rule__Effect__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Effect__Group__1__Impl();

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
    // $ANTLR end "rule__Effect__Group__1"


    // $ANTLR start "rule__Effect__Group__1__Impl"
    // InternalRPG.g:1731:1: rule__Effect__Group__1__Impl : ( ( rule__Effect__Alternatives_1 ) ) ;
    public final void rule__Effect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1735:1: ( ( ( rule__Effect__Alternatives_1 ) ) )
            // InternalRPG.g:1736:1: ( ( rule__Effect__Alternatives_1 ) )
            {
            // InternalRPG.g:1736:1: ( ( rule__Effect__Alternatives_1 ) )
            // InternalRPG.g:1737:2: ( rule__Effect__Alternatives_1 )
            {
             before(grammarAccess.getEffectAccess().getAlternatives_1()); 
            // InternalRPG.g:1738:2: ( rule__Effect__Alternatives_1 )
            // InternalRPG.g:1738:3: rule__Effect__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Effect__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__1__Impl"


    // $ANTLR start "rule__Buff__Group__0"
    // InternalRPG.g:1747:1: rule__Buff__Group__0 : rule__Buff__Group__0__Impl rule__Buff__Group__1 ;
    public final void rule__Buff__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1751:1: ( rule__Buff__Group__0__Impl rule__Buff__Group__1 )
            // InternalRPG.g:1752:2: rule__Buff__Group__0__Impl rule__Buff__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Buff__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Buff__Group__1();

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
    // $ANTLR end "rule__Buff__Group__0"


    // $ANTLR start "rule__Buff__Group__0__Impl"
    // InternalRPG.g:1759:1: rule__Buff__Group__0__Impl : ( 'buff' ) ;
    public final void rule__Buff__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1763:1: ( ( 'buff' ) )
            // InternalRPG.g:1764:1: ( 'buff' )
            {
            // InternalRPG.g:1764:1: ( 'buff' )
            // InternalRPG.g:1765:2: 'buff'
            {
             before(grammarAccess.getBuffAccess().getBuffKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBuffAccess().getBuffKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buff__Group__0__Impl"


    // $ANTLR start "rule__Buff__Group__1"
    // InternalRPG.g:1774:1: rule__Buff__Group__1 : rule__Buff__Group__1__Impl rule__Buff__Group__2 ;
    public final void rule__Buff__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1778:1: ( rule__Buff__Group__1__Impl rule__Buff__Group__2 )
            // InternalRPG.g:1779:2: rule__Buff__Group__1__Impl rule__Buff__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Buff__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Buff__Group__2();

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
    // $ANTLR end "rule__Buff__Group__1"


    // $ANTLR start "rule__Buff__Group__1__Impl"
    // InternalRPG.g:1786:1: rule__Buff__Group__1__Impl : ( ( rule__Buff__NameAssignment_1 ) ) ;
    public final void rule__Buff__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1790:1: ( ( ( rule__Buff__NameAssignment_1 ) ) )
            // InternalRPG.g:1791:1: ( ( rule__Buff__NameAssignment_1 ) )
            {
            // InternalRPG.g:1791:1: ( ( rule__Buff__NameAssignment_1 ) )
            // InternalRPG.g:1792:2: ( rule__Buff__NameAssignment_1 )
            {
             before(grammarAccess.getBuffAccess().getNameAssignment_1()); 
            // InternalRPG.g:1793:2: ( rule__Buff__NameAssignment_1 )
            // InternalRPG.g:1793:3: rule__Buff__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Buff__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBuffAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buff__Group__1__Impl"


    // $ANTLR start "rule__Buff__Group__2"
    // InternalRPG.g:1801:1: rule__Buff__Group__2 : rule__Buff__Group__2__Impl rule__Buff__Group__3 ;
    public final void rule__Buff__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1805:1: ( rule__Buff__Group__2__Impl rule__Buff__Group__3 )
            // InternalRPG.g:1806:2: rule__Buff__Group__2__Impl rule__Buff__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Buff__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Buff__Group__3();

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
    // $ANTLR end "rule__Buff__Group__2"


    // $ANTLR start "rule__Buff__Group__2__Impl"
    // InternalRPG.g:1813:1: rule__Buff__Group__2__Impl : ( ( rule__Buff__RuleAssignment_2 ) ) ;
    public final void rule__Buff__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1817:1: ( ( ( rule__Buff__RuleAssignment_2 ) ) )
            // InternalRPG.g:1818:1: ( ( rule__Buff__RuleAssignment_2 ) )
            {
            // InternalRPG.g:1818:1: ( ( rule__Buff__RuleAssignment_2 ) )
            // InternalRPG.g:1819:2: ( rule__Buff__RuleAssignment_2 )
            {
             before(grammarAccess.getBuffAccess().getRuleAssignment_2()); 
            // InternalRPG.g:1820:2: ( rule__Buff__RuleAssignment_2 )
            // InternalRPG.g:1820:3: rule__Buff__RuleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Buff__RuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBuffAccess().getRuleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buff__Group__2__Impl"


    // $ANTLR start "rule__Buff__Group__3"
    // InternalRPG.g:1828:1: rule__Buff__Group__3 : rule__Buff__Group__3__Impl ;
    public final void rule__Buff__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1832:1: ( rule__Buff__Group__3__Impl )
            // InternalRPG.g:1833:2: rule__Buff__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Buff__Group__3__Impl();

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
    // $ANTLR end "rule__Buff__Group__3"


    // $ANTLR start "rule__Buff__Group__3__Impl"
    // InternalRPG.g:1839:1: rule__Buff__Group__3__Impl : ( ( rule__Buff__Group_3__0 )* ) ;
    public final void rule__Buff__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1843:1: ( ( ( rule__Buff__Group_3__0 )* ) )
            // InternalRPG.g:1844:1: ( ( rule__Buff__Group_3__0 )* )
            {
            // InternalRPG.g:1844:1: ( ( rule__Buff__Group_3__0 )* )
            // InternalRPG.g:1845:2: ( rule__Buff__Group_3__0 )*
            {
             before(grammarAccess.getBuffAccess().getGroup_3()); 
            // InternalRPG.g:1846:2: ( rule__Buff__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRPG.g:1846:3: rule__Buff__Group_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Buff__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getBuffAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buff__Group__3__Impl"


    // $ANTLR start "rule__Buff__Group_3__0"
    // InternalRPG.g:1855:1: rule__Buff__Group_3__0 : rule__Buff__Group_3__0__Impl rule__Buff__Group_3__1 ;
    public final void rule__Buff__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1859:1: ( rule__Buff__Group_3__0__Impl rule__Buff__Group_3__1 )
            // InternalRPG.g:1860:2: rule__Buff__Group_3__0__Impl rule__Buff__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Buff__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Buff__Group_3__1();

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
    // $ANTLR end "rule__Buff__Group_3__0"


    // $ANTLR start "rule__Buff__Group_3__0__Impl"
    // InternalRPG.g:1867:1: rule__Buff__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Buff__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1871:1: ( ( ',' ) )
            // InternalRPG.g:1872:1: ( ',' )
            {
            // InternalRPG.g:1872:1: ( ',' )
            // InternalRPG.g:1873:2: ','
            {
             before(grammarAccess.getBuffAccess().getCommaKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBuffAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buff__Group_3__0__Impl"


    // $ANTLR start "rule__Buff__Group_3__1"
    // InternalRPG.g:1882:1: rule__Buff__Group_3__1 : rule__Buff__Group_3__1__Impl ;
    public final void rule__Buff__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1886:1: ( rule__Buff__Group_3__1__Impl )
            // InternalRPG.g:1887:2: rule__Buff__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Buff__Group_3__1__Impl();

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
    // $ANTLR end "rule__Buff__Group_3__1"


    // $ANTLR start "rule__Buff__Group_3__1__Impl"
    // InternalRPG.g:1893:1: rule__Buff__Group_3__1__Impl : ( ( rule__Buff__ExtraRuleAssignment_3_1 ) ) ;
    public final void rule__Buff__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1897:1: ( ( ( rule__Buff__ExtraRuleAssignment_3_1 ) ) )
            // InternalRPG.g:1898:1: ( ( rule__Buff__ExtraRuleAssignment_3_1 ) )
            {
            // InternalRPG.g:1898:1: ( ( rule__Buff__ExtraRuleAssignment_3_1 ) )
            // InternalRPG.g:1899:2: ( rule__Buff__ExtraRuleAssignment_3_1 )
            {
             before(grammarAccess.getBuffAccess().getExtraRuleAssignment_3_1()); 
            // InternalRPG.g:1900:2: ( rule__Buff__ExtraRuleAssignment_3_1 )
            // InternalRPG.g:1900:3: rule__Buff__ExtraRuleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Buff__ExtraRuleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBuffAccess().getExtraRuleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buff__Group_3__1__Impl"


    // $ANTLR start "rule__MoveE__Group__0"
    // InternalRPG.g:1909:1: rule__MoveE__Group__0 : rule__MoveE__Group__0__Impl rule__MoveE__Group__1 ;
    public final void rule__MoveE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1913:1: ( rule__MoveE__Group__0__Impl rule__MoveE__Group__1 )
            // InternalRPG.g:1914:2: rule__MoveE__Group__0__Impl rule__MoveE__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MoveE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveE__Group__1();

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
    // $ANTLR end "rule__MoveE__Group__0"


    // $ANTLR start "rule__MoveE__Group__0__Impl"
    // InternalRPG.g:1921:1: rule__MoveE__Group__0__Impl : ( 'move' ) ;
    public final void rule__MoveE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1925:1: ( ( 'move' ) )
            // InternalRPG.g:1926:1: ( 'move' )
            {
            // InternalRPG.g:1926:1: ( 'move' )
            // InternalRPG.g:1927:2: 'move'
            {
             before(grammarAccess.getMoveEAccess().getMoveKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMoveEAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveE__Group__0__Impl"


    // $ANTLR start "rule__MoveE__Group__1"
    // InternalRPG.g:1936:1: rule__MoveE__Group__1 : rule__MoveE__Group__1__Impl rule__MoveE__Group__2 ;
    public final void rule__MoveE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1940:1: ( rule__MoveE__Group__1__Impl rule__MoveE__Group__2 )
            // InternalRPG.g:1941:2: rule__MoveE__Group__1__Impl rule__MoveE__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MoveE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveE__Group__2();

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
    // $ANTLR end "rule__MoveE__Group__1"


    // $ANTLR start "rule__MoveE__Group__1__Impl"
    // InternalRPG.g:1948:1: rule__MoveE__Group__1__Impl : ( ( rule__MoveE__NameAssignment_1 ) ) ;
    public final void rule__MoveE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1952:1: ( ( ( rule__MoveE__NameAssignment_1 ) ) )
            // InternalRPG.g:1953:1: ( ( rule__MoveE__NameAssignment_1 ) )
            {
            // InternalRPG.g:1953:1: ( ( rule__MoveE__NameAssignment_1 ) )
            // InternalRPG.g:1954:2: ( rule__MoveE__NameAssignment_1 )
            {
             before(grammarAccess.getMoveEAccess().getNameAssignment_1()); 
            // InternalRPG.g:1955:2: ( rule__MoveE__NameAssignment_1 )
            // InternalRPG.g:1955:3: rule__MoveE__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveE__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveEAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveE__Group__1__Impl"


    // $ANTLR start "rule__MoveE__Group__2"
    // InternalRPG.g:1963:1: rule__MoveE__Group__2 : rule__MoveE__Group__2__Impl rule__MoveE__Group__3 ;
    public final void rule__MoveE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1967:1: ( rule__MoveE__Group__2__Impl rule__MoveE__Group__3 )
            // InternalRPG.g:1968:2: rule__MoveE__Group__2__Impl rule__MoveE__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MoveE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveE__Group__3();

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
    // $ANTLR end "rule__MoveE__Group__2"


    // $ANTLR start "rule__MoveE__Group__2__Impl"
    // InternalRPG.g:1975:1: rule__MoveE__Group__2__Impl : ( ( rule__MoveE__RuleAssignment_2 ) ) ;
    public final void rule__MoveE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1979:1: ( ( ( rule__MoveE__RuleAssignment_2 ) ) )
            // InternalRPG.g:1980:1: ( ( rule__MoveE__RuleAssignment_2 ) )
            {
            // InternalRPG.g:1980:1: ( ( rule__MoveE__RuleAssignment_2 ) )
            // InternalRPG.g:1981:2: ( rule__MoveE__RuleAssignment_2 )
            {
             before(grammarAccess.getMoveEAccess().getRuleAssignment_2()); 
            // InternalRPG.g:1982:2: ( rule__MoveE__RuleAssignment_2 )
            // InternalRPG.g:1982:3: rule__MoveE__RuleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MoveE__RuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveEAccess().getRuleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveE__Group__2__Impl"


    // $ANTLR start "rule__MoveE__Group__3"
    // InternalRPG.g:1990:1: rule__MoveE__Group__3 : rule__MoveE__Group__3__Impl ;
    public final void rule__MoveE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:1994:1: ( rule__MoveE__Group__3__Impl )
            // InternalRPG.g:1995:2: rule__MoveE__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveE__Group__3__Impl();

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
    // $ANTLR end "rule__MoveE__Group__3"


    // $ANTLR start "rule__MoveE__Group__3__Impl"
    // InternalRPG.g:2001:1: rule__MoveE__Group__3__Impl : ( ( rule__MoveE__Group_3__0 )* ) ;
    public final void rule__MoveE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2005:1: ( ( ( rule__MoveE__Group_3__0 )* ) )
            // InternalRPG.g:2006:1: ( ( rule__MoveE__Group_3__0 )* )
            {
            // InternalRPG.g:2006:1: ( ( rule__MoveE__Group_3__0 )* )
            // InternalRPG.g:2007:2: ( rule__MoveE__Group_3__0 )*
            {
             before(grammarAccess.getMoveEAccess().getGroup_3()); 
            // InternalRPG.g:2008:2: ( rule__MoveE__Group_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRPG.g:2008:3: rule__MoveE__Group_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__MoveE__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMoveEAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveE__Group__3__Impl"


    // $ANTLR start "rule__MoveE__Group_3__0"
    // InternalRPG.g:2017:1: rule__MoveE__Group_3__0 : rule__MoveE__Group_3__0__Impl rule__MoveE__Group_3__1 ;
    public final void rule__MoveE__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2021:1: ( rule__MoveE__Group_3__0__Impl rule__MoveE__Group_3__1 )
            // InternalRPG.g:2022:2: rule__MoveE__Group_3__0__Impl rule__MoveE__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__MoveE__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveE__Group_3__1();

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
    // $ANTLR end "rule__MoveE__Group_3__0"


    // $ANTLR start "rule__MoveE__Group_3__0__Impl"
    // InternalRPG.g:2029:1: rule__MoveE__Group_3__0__Impl : ( ',' ) ;
    public final void rule__MoveE__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2033:1: ( ( ',' ) )
            // InternalRPG.g:2034:1: ( ',' )
            {
            // InternalRPG.g:2034:1: ( ',' )
            // InternalRPG.g:2035:2: ','
            {
             before(grammarAccess.getMoveEAccess().getCommaKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMoveEAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveE__Group_3__0__Impl"


    // $ANTLR start "rule__MoveE__Group_3__1"
    // InternalRPG.g:2044:1: rule__MoveE__Group_3__1 : rule__MoveE__Group_3__1__Impl ;
    public final void rule__MoveE__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2048:1: ( rule__MoveE__Group_3__1__Impl )
            // InternalRPG.g:2049:2: rule__MoveE__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveE__Group_3__1__Impl();

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
    // $ANTLR end "rule__MoveE__Group_3__1"


    // $ANTLR start "rule__MoveE__Group_3__1__Impl"
    // InternalRPG.g:2055:1: rule__MoveE__Group_3__1__Impl : ( ( rule__MoveE__ExtraRuleAssignment_3_1 ) ) ;
    public final void rule__MoveE__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2059:1: ( ( ( rule__MoveE__ExtraRuleAssignment_3_1 ) ) )
            // InternalRPG.g:2060:1: ( ( rule__MoveE__ExtraRuleAssignment_3_1 ) )
            {
            // InternalRPG.g:2060:1: ( ( rule__MoveE__ExtraRuleAssignment_3_1 ) )
            // InternalRPG.g:2061:2: ( rule__MoveE__ExtraRuleAssignment_3_1 )
            {
             before(grammarAccess.getMoveEAccess().getExtraRuleAssignment_3_1()); 
            // InternalRPG.g:2062:2: ( rule__MoveE__ExtraRuleAssignment_3_1 )
            // InternalRPG.g:2062:3: rule__MoveE__ExtraRuleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveE__ExtraRuleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveEAccess().getExtraRuleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveE__Group_3__1__Impl"


    // $ANTLR start "rule__AfterE__Group__0"
    // InternalRPG.g:2071:1: rule__AfterE__Group__0 : rule__AfterE__Group__0__Impl rule__AfterE__Group__1 ;
    public final void rule__AfterE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2075:1: ( rule__AfterE__Group__0__Impl rule__AfterE__Group__1 )
            // InternalRPG.g:2076:2: rule__AfterE__Group__0__Impl rule__AfterE__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AfterE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AfterE__Group__1();

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
    // $ANTLR end "rule__AfterE__Group__0"


    // $ANTLR start "rule__AfterE__Group__0__Impl"
    // InternalRPG.g:2083:1: rule__AfterE__Group__0__Impl : ( 'after' ) ;
    public final void rule__AfterE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2087:1: ( ( 'after' ) )
            // InternalRPG.g:2088:1: ( 'after' )
            {
            // InternalRPG.g:2088:1: ( 'after' )
            // InternalRPG.g:2089:2: 'after'
            {
             before(grammarAccess.getAfterEAccess().getAfterKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAfterEAccess().getAfterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterE__Group__0__Impl"


    // $ANTLR start "rule__AfterE__Group__1"
    // InternalRPG.g:2098:1: rule__AfterE__Group__1 : rule__AfterE__Group__1__Impl rule__AfterE__Group__2 ;
    public final void rule__AfterE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2102:1: ( rule__AfterE__Group__1__Impl rule__AfterE__Group__2 )
            // InternalRPG.g:2103:2: rule__AfterE__Group__1__Impl rule__AfterE__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__AfterE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AfterE__Group__2();

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
    // $ANTLR end "rule__AfterE__Group__1"


    // $ANTLR start "rule__AfterE__Group__1__Impl"
    // InternalRPG.g:2110:1: rule__AfterE__Group__1__Impl : ( ( rule__AfterE__NameAssignment_1 ) ) ;
    public final void rule__AfterE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2114:1: ( ( ( rule__AfterE__NameAssignment_1 ) ) )
            // InternalRPG.g:2115:1: ( ( rule__AfterE__NameAssignment_1 ) )
            {
            // InternalRPG.g:2115:1: ( ( rule__AfterE__NameAssignment_1 ) )
            // InternalRPG.g:2116:2: ( rule__AfterE__NameAssignment_1 )
            {
             before(grammarAccess.getAfterEAccess().getNameAssignment_1()); 
            // InternalRPG.g:2117:2: ( rule__AfterE__NameAssignment_1 )
            // InternalRPG.g:2117:3: rule__AfterE__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AfterE__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAfterEAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterE__Group__1__Impl"


    // $ANTLR start "rule__AfterE__Group__2"
    // InternalRPG.g:2125:1: rule__AfterE__Group__2 : rule__AfterE__Group__2__Impl ;
    public final void rule__AfterE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2129:1: ( rule__AfterE__Group__2__Impl )
            // InternalRPG.g:2130:2: rule__AfterE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AfterE__Group__2__Impl();

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
    // $ANTLR end "rule__AfterE__Group__2"


    // $ANTLR start "rule__AfterE__Group__2__Impl"
    // InternalRPG.g:2136:1: rule__AfterE__Group__2__Impl : ( ( rule__AfterE__RuleAssignment_2 ) ) ;
    public final void rule__AfterE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2140:1: ( ( ( rule__AfterE__RuleAssignment_2 ) ) )
            // InternalRPG.g:2141:1: ( ( rule__AfterE__RuleAssignment_2 ) )
            {
            // InternalRPG.g:2141:1: ( ( rule__AfterE__RuleAssignment_2 ) )
            // InternalRPG.g:2142:2: ( rule__AfterE__RuleAssignment_2 )
            {
             before(grammarAccess.getAfterEAccess().getRuleAssignment_2()); 
            // InternalRPG.g:2143:2: ( rule__AfterE__RuleAssignment_2 )
            // InternalRPG.g:2143:3: rule__AfterE__RuleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AfterE__RuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAfterEAccess().getRuleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterE__Group__2__Impl"


    // $ANTLR start "rule__Attributes__Group__0"
    // InternalRPG.g:2152:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2156:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalRPG.g:2157:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Attributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1();

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
    // $ANTLR end "rule__Attributes__Group__0"


    // $ANTLR start "rule__Attributes__Group__0__Impl"
    // InternalRPG.g:2164:1: rule__Attributes__Group__0__Impl : ( 'attributes' ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2168:1: ( ( 'attributes' ) )
            // InternalRPG.g:2169:1: ( 'attributes' )
            {
            // InternalRPG.g:2169:1: ( 'attributes' )
            // InternalRPG.g:2170:2: 'attributes'
            {
             before(grammarAccess.getAttributesAccess().getAttributesKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributesAccess().getAttributesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__0__Impl"


    // $ANTLR start "rule__Attributes__Group__1"
    // InternalRPG.g:2179:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2183:1: ( rule__Attributes__Group__1__Impl )
            // InternalRPG.g:2184:2: rule__Attributes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1__Impl();

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
    // $ANTLR end "rule__Attributes__Group__1"


    // $ANTLR start "rule__Attributes__Group__1__Impl"
    // InternalRPG.g:2190:1: rule__Attributes__Group__1__Impl : ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2194:1: ( ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) ) )
            // InternalRPG.g:2195:1: ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) )
            {
            // InternalRPG.g:2195:1: ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) )
            // InternalRPG.g:2196:2: ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* )
            {
            // InternalRPG.g:2196:2: ( ( rule__Attributes__AttributeAssignment_1 ) )
            // InternalRPG.g:2197:3: ( rule__Attributes__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 
            // InternalRPG.g:2198:3: ( rule__Attributes__AttributeAssignment_1 )
            // InternalRPG.g:2198:4: rule__Attributes__AttributeAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__Attributes__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 

            }

            // InternalRPG.g:2201:2: ( ( rule__Attributes__AttributeAssignment_1 )* )
            // InternalRPG.g:2202:3: ( rule__Attributes__AttributeAssignment_1 )*
            {
             before(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 
            // InternalRPG.g:2203:3: ( rule__Attributes__AttributeAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21||LA17_0==59) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRPG.g:2203:4: rule__Attributes__AttributeAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Attributes__AttributeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 

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
    // $ANTLR end "rule__Attributes__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalRPG.g:2213:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2217:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalRPG.g:2218:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalRPG.g:2225:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__ModifiedAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2229:1: ( ( ( rule__Attribute__ModifiedAssignment_0 )? ) )
            // InternalRPG.g:2230:1: ( ( rule__Attribute__ModifiedAssignment_0 )? )
            {
            // InternalRPG.g:2230:1: ( ( rule__Attribute__ModifiedAssignment_0 )? )
            // InternalRPG.g:2231:2: ( rule__Attribute__ModifiedAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getModifiedAssignment_0()); 
            // InternalRPG.g:2232:2: ( rule__Attribute__ModifiedAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==59) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRPG.g:2232:3: rule__Attribute__ModifiedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__ModifiedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getModifiedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalRPG.g:2240:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2244:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalRPG.g:2245:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalRPG.g:2252:1: rule__Attribute__Group__1__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2256:1: ( ( 'attribute' ) )
            // InternalRPG.g:2257:1: ( 'attribute' )
            {
            // InternalRPG.g:2257:1: ( 'attribute' )
            // InternalRPG.g:2258:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalRPG.g:2267:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2271:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalRPG.g:2272:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalRPG.g:2279:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2283:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // InternalRPG.g:2284:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // InternalRPG.g:2284:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // InternalRPG.g:2285:2: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // InternalRPG.g:2286:2: ( rule__Attribute__NameAssignment_2 )
            // InternalRPG.g:2286:3: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalRPG.g:2294:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2298:1: ( rule__Attribute__Group__3__Impl )
            // InternalRPG.g:2299:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalRPG.g:2305:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__AValAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2309:1: ( ( ( rule__Attribute__AValAssignment_3 ) ) )
            // InternalRPG.g:2310:1: ( ( rule__Attribute__AValAssignment_3 ) )
            {
            // InternalRPG.g:2310:1: ( ( rule__Attribute__AValAssignment_3 ) )
            // InternalRPG.g:2311:2: ( rule__Attribute__AValAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getAValAssignment_3()); 
            // InternalRPG.g:2312:2: ( rule__Attribute__AValAssignment_3 )
            // InternalRPG.g:2312:3: rule__Attribute__AValAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AValAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAValAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Locations__Group__0"
    // InternalRPG.g:2321:1: rule__Locations__Group__0 : rule__Locations__Group__0__Impl rule__Locations__Group__1 ;
    public final void rule__Locations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2325:1: ( rule__Locations__Group__0__Impl rule__Locations__Group__1 )
            // InternalRPG.g:2326:2: rule__Locations__Group__0__Impl rule__Locations__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Locations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Locations__Group__1();

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
    // $ANTLR end "rule__Locations__Group__0"


    // $ANTLR start "rule__Locations__Group__0__Impl"
    // InternalRPG.g:2333:1: rule__Locations__Group__0__Impl : ( 'location' ) ;
    public final void rule__Locations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2337:1: ( ( 'location' ) )
            // InternalRPG.g:2338:1: ( 'location' )
            {
            // InternalRPG.g:2338:1: ( 'location' )
            // InternalRPG.g:2339:2: 'location'
            {
             before(grammarAccess.getLocationsAccess().getLocationKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLocationsAccess().getLocationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locations__Group__0__Impl"


    // $ANTLR start "rule__Locations__Group__1"
    // InternalRPG.g:2348:1: rule__Locations__Group__1 : rule__Locations__Group__1__Impl ;
    public final void rule__Locations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2352:1: ( rule__Locations__Group__1__Impl )
            // InternalRPG.g:2353:2: rule__Locations__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Locations__Group__1__Impl();

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
    // $ANTLR end "rule__Locations__Group__1"


    // $ANTLR start "rule__Locations__Group__1__Impl"
    // InternalRPG.g:2359:1: rule__Locations__Group__1__Impl : ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) ) ;
    public final void rule__Locations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2363:1: ( ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) ) )
            // InternalRPG.g:2364:1: ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) )
            {
            // InternalRPG.g:2364:1: ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) )
            // InternalRPG.g:2365:2: ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* )
            {
            // InternalRPG.g:2365:2: ( ( rule__Locations__LocAssignment_1 ) )
            // InternalRPG.g:2366:3: ( rule__Locations__LocAssignment_1 )
            {
             before(grammarAccess.getLocationsAccess().getLocAssignment_1()); 
            // InternalRPG.g:2367:3: ( rule__Locations__LocAssignment_1 )
            // InternalRPG.g:2367:4: rule__Locations__LocAssignment_1
            {
            pushFollow(FOLLOW_15);
            rule__Locations__LocAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationsAccess().getLocAssignment_1()); 

            }

            // InternalRPG.g:2370:2: ( ( rule__Locations__LocAssignment_1 )* )
            // InternalRPG.g:2371:3: ( rule__Locations__LocAssignment_1 )*
            {
             before(grammarAccess.getLocationsAccess().getLocAssignment_1()); 
            // InternalRPG.g:2372:3: ( rule__Locations__LocAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRPG.g:2372:4: rule__Locations__LocAssignment_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Locations__LocAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getLocationsAccess().getLocAssignment_1()); 

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
    // $ANTLR end "rule__Locations__Group__1__Impl"


    // $ANTLR start "rule__Loc__Group__0"
    // InternalRPG.g:2382:1: rule__Loc__Group__0 : rule__Loc__Group__0__Impl rule__Loc__Group__1 ;
    public final void rule__Loc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2386:1: ( rule__Loc__Group__0__Impl rule__Loc__Group__1 )
            // InternalRPG.g:2387:2: rule__Loc__Group__0__Impl rule__Loc__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Loc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loc__Group__1();

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
    // $ANTLR end "rule__Loc__Group__0"


    // $ANTLR start "rule__Loc__Group__0__Impl"
    // InternalRPG.g:2394:1: rule__Loc__Group__0__Impl : ( ( rule__Loc__NameAssignment_0 ) ) ;
    public final void rule__Loc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2398:1: ( ( ( rule__Loc__NameAssignment_0 ) ) )
            // InternalRPG.g:2399:1: ( ( rule__Loc__NameAssignment_0 ) )
            {
            // InternalRPG.g:2399:1: ( ( rule__Loc__NameAssignment_0 ) )
            // InternalRPG.g:2400:2: ( rule__Loc__NameAssignment_0 )
            {
             before(grammarAccess.getLocAccess().getNameAssignment_0()); 
            // InternalRPG.g:2401:2: ( rule__Loc__NameAssignment_0 )
            // InternalRPG.g:2401:3: rule__Loc__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Loc__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLocAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__Group__0__Impl"


    // $ANTLR start "rule__Loc__Group__1"
    // InternalRPG.g:2409:1: rule__Loc__Group__1 : rule__Loc__Group__1__Impl rule__Loc__Group__2 ;
    public final void rule__Loc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2413:1: ( rule__Loc__Group__1__Impl rule__Loc__Group__2 )
            // InternalRPG.g:2414:2: rule__Loc__Group__1__Impl rule__Loc__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Loc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loc__Group__2();

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
    // $ANTLR end "rule__Loc__Group__1"


    // $ANTLR start "rule__Loc__Group__1__Impl"
    // InternalRPG.g:2421:1: rule__Loc__Group__1__Impl : ( ( rule__Loc__Group_1__0 )? ) ;
    public final void rule__Loc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2425:1: ( ( ( rule__Loc__Group_1__0 )? ) )
            // InternalRPG.g:2426:1: ( ( rule__Loc__Group_1__0 )? )
            {
            // InternalRPG.g:2426:1: ( ( rule__Loc__Group_1__0 )? )
            // InternalRPG.g:2427:2: ( rule__Loc__Group_1__0 )?
            {
             before(grammarAccess.getLocAccess().getGroup_1()); 
            // InternalRPG.g:2428:2: ( rule__Loc__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRPG.g:2428:3: rule__Loc__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loc__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__Group__1__Impl"


    // $ANTLR start "rule__Loc__Group__2"
    // InternalRPG.g:2436:1: rule__Loc__Group__2 : rule__Loc__Group__2__Impl rule__Loc__Group__3 ;
    public final void rule__Loc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2440:1: ( rule__Loc__Group__2__Impl rule__Loc__Group__3 )
            // InternalRPG.g:2441:2: rule__Loc__Group__2__Impl rule__Loc__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Loc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loc__Group__3();

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
    // $ANTLR end "rule__Loc__Group__2"


    // $ANTLR start "rule__Loc__Group__2__Impl"
    // InternalRPG.g:2448:1: rule__Loc__Group__2__Impl : ( 'opponents' ) ;
    public final void rule__Loc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2452:1: ( ( 'opponents' ) )
            // InternalRPG.g:2453:1: ( 'opponents' )
            {
            // InternalRPG.g:2453:1: ( 'opponents' )
            // InternalRPG.g:2454:2: 'opponents'
            {
             before(grammarAccess.getLocAccess().getOpponentsKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLocAccess().getOpponentsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__Group__2__Impl"


    // $ANTLR start "rule__Loc__Group__3"
    // InternalRPG.g:2463:1: rule__Loc__Group__3 : rule__Loc__Group__3__Impl ;
    public final void rule__Loc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2467:1: ( rule__Loc__Group__3__Impl )
            // InternalRPG.g:2468:2: rule__Loc__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loc__Group__3__Impl();

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
    // $ANTLR end "rule__Loc__Group__3"


    // $ANTLR start "rule__Loc__Group__3__Impl"
    // InternalRPG.g:2474:1: rule__Loc__Group__3__Impl : ( ( rule__Loc__TeamAssignment_3 ) ) ;
    public final void rule__Loc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2478:1: ( ( ( rule__Loc__TeamAssignment_3 ) ) )
            // InternalRPG.g:2479:1: ( ( rule__Loc__TeamAssignment_3 ) )
            {
            // InternalRPG.g:2479:1: ( ( rule__Loc__TeamAssignment_3 ) )
            // InternalRPG.g:2480:2: ( rule__Loc__TeamAssignment_3 )
            {
             before(grammarAccess.getLocAccess().getTeamAssignment_3()); 
            // InternalRPG.g:2481:2: ( rule__Loc__TeamAssignment_3 )
            // InternalRPG.g:2481:3: rule__Loc__TeamAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Loc__TeamAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLocAccess().getTeamAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__Group__3__Impl"


    // $ANTLR start "rule__Loc__Group_1__0"
    // InternalRPG.g:2490:1: rule__Loc__Group_1__0 : rule__Loc__Group_1__0__Impl rule__Loc__Group_1__1 ;
    public final void rule__Loc__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2494:1: ( rule__Loc__Group_1__0__Impl rule__Loc__Group_1__1 )
            // InternalRPG.g:2495:2: rule__Loc__Group_1__0__Impl rule__Loc__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Loc__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loc__Group_1__1();

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
    // $ANTLR end "rule__Loc__Group_1__0"


    // $ANTLR start "rule__Loc__Group_1__0__Impl"
    // InternalRPG.g:2502:1: rule__Loc__Group_1__0__Impl : ( 'type' ) ;
    public final void rule__Loc__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2506:1: ( ( 'type' ) )
            // InternalRPG.g:2507:1: ( 'type' )
            {
            // InternalRPG.g:2507:1: ( 'type' )
            // InternalRPG.g:2508:2: 'type'
            {
             before(grammarAccess.getLocAccess().getTypeKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLocAccess().getTypeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__Group_1__0__Impl"


    // $ANTLR start "rule__Loc__Group_1__1"
    // InternalRPG.g:2517:1: rule__Loc__Group_1__1 : rule__Loc__Group_1__1__Impl rule__Loc__Group_1__2 ;
    public final void rule__Loc__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2521:1: ( rule__Loc__Group_1__1__Impl rule__Loc__Group_1__2 )
            // InternalRPG.g:2522:2: rule__Loc__Group_1__1__Impl rule__Loc__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Loc__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loc__Group_1__2();

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
    // $ANTLR end "rule__Loc__Group_1__1"


    // $ANTLR start "rule__Loc__Group_1__1__Impl"
    // InternalRPG.g:2529:1: rule__Loc__Group_1__1__Impl : ( ( rule__Loc__TipeAssignment_1_1 ) ) ;
    public final void rule__Loc__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2533:1: ( ( ( rule__Loc__TipeAssignment_1_1 ) ) )
            // InternalRPG.g:2534:1: ( ( rule__Loc__TipeAssignment_1_1 ) )
            {
            // InternalRPG.g:2534:1: ( ( rule__Loc__TipeAssignment_1_1 ) )
            // InternalRPG.g:2535:2: ( rule__Loc__TipeAssignment_1_1 )
            {
             before(grammarAccess.getLocAccess().getTipeAssignment_1_1()); 
            // InternalRPG.g:2536:2: ( rule__Loc__TipeAssignment_1_1 )
            // InternalRPG.g:2536:3: rule__Loc__TipeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Loc__TipeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLocAccess().getTipeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__Group_1__1__Impl"


    // $ANTLR start "rule__Loc__Group_1__2"
    // InternalRPG.g:2544:1: rule__Loc__Group_1__2 : rule__Loc__Group_1__2__Impl rule__Loc__Group_1__3 ;
    public final void rule__Loc__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2548:1: ( rule__Loc__Group_1__2__Impl rule__Loc__Group_1__3 )
            // InternalRPG.g:2549:2: rule__Loc__Group_1__2__Impl rule__Loc__Group_1__3
            {
            pushFollow(FOLLOW_18);
            rule__Loc__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loc__Group_1__3();

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
    // $ANTLR end "rule__Loc__Group_1__2"


    // $ANTLR start "rule__Loc__Group_1__2__Impl"
    // InternalRPG.g:2556:1: rule__Loc__Group_1__2__Impl : ( 'effectiveness' ) ;
    public final void rule__Loc__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2560:1: ( ( 'effectiveness' ) )
            // InternalRPG.g:2561:1: ( 'effectiveness' )
            {
            // InternalRPG.g:2561:1: ( 'effectiveness' )
            // InternalRPG.g:2562:2: 'effectiveness'
            {
             before(grammarAccess.getLocAccess().getEffectivenessKeyword_1_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLocAccess().getEffectivenessKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__Group_1__2__Impl"


    // $ANTLR start "rule__Loc__Group_1__3"
    // InternalRPG.g:2571:1: rule__Loc__Group_1__3 : rule__Loc__Group_1__3__Impl ;
    public final void rule__Loc__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2575:1: ( rule__Loc__Group_1__3__Impl )
            // InternalRPG.g:2576:2: rule__Loc__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loc__Group_1__3__Impl();

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
    // $ANTLR end "rule__Loc__Group_1__3"


    // $ANTLR start "rule__Loc__Group_1__3__Impl"
    // InternalRPG.g:2582:1: rule__Loc__Group_1__3__Impl : ( ( rule__Loc__EffAssignment_1_3 ) ) ;
    public final void rule__Loc__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2586:1: ( ( ( rule__Loc__EffAssignment_1_3 ) ) )
            // InternalRPG.g:2587:1: ( ( rule__Loc__EffAssignment_1_3 ) )
            {
            // InternalRPG.g:2587:1: ( ( rule__Loc__EffAssignment_1_3 ) )
            // InternalRPG.g:2588:2: ( rule__Loc__EffAssignment_1_3 )
            {
             before(grammarAccess.getLocAccess().getEffAssignment_1_3()); 
            // InternalRPG.g:2589:2: ( rule__Loc__EffAssignment_1_3 )
            // InternalRPG.g:2589:3: rule__Loc__EffAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Loc__EffAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getLocAccess().getEffAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__Group_1__3__Impl"


    // $ANTLR start "rule__Relations__Group__0"
    // InternalRPG.g:2598:1: rule__Relations__Group__0 : rule__Relations__Group__0__Impl rule__Relations__Group__1 ;
    public final void rule__Relations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2602:1: ( rule__Relations__Group__0__Impl rule__Relations__Group__1 )
            // InternalRPG.g:2603:2: rule__Relations__Group__0__Impl rule__Relations__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Relations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__1();

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
    // $ANTLR end "rule__Relations__Group__0"


    // $ANTLR start "rule__Relations__Group__0__Impl"
    // InternalRPG.g:2610:1: rule__Relations__Group__0__Impl : ( 'relations' ) ;
    public final void rule__Relations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2614:1: ( ( 'relations' ) )
            // InternalRPG.g:2615:1: ( 'relations' )
            {
            // InternalRPG.g:2615:1: ( 'relations' )
            // InternalRPG.g:2616:2: 'relations'
            {
             before(grammarAccess.getRelationsAccess().getRelationsKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRelationsAccess().getRelationsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relations__Group__0__Impl"


    // $ANTLR start "rule__Relations__Group__1"
    // InternalRPG.g:2625:1: rule__Relations__Group__1 : rule__Relations__Group__1__Impl rule__Relations__Group__2 ;
    public final void rule__Relations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2629:1: ( rule__Relations__Group__1__Impl rule__Relations__Group__2 )
            // InternalRPG.g:2630:2: rule__Relations__Group__1__Impl rule__Relations__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Relations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__2();

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
    // $ANTLR end "rule__Relations__Group__1"


    // $ANTLR start "rule__Relations__Group__1__Impl"
    // InternalRPG.g:2637:1: rule__Relations__Group__1__Impl : ( ( ruleRelationModifiers )? ) ;
    public final void rule__Relations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2641:1: ( ( ( ruleRelationModifiers )? ) )
            // InternalRPG.g:2642:1: ( ( ruleRelationModifiers )? )
            {
            // InternalRPG.g:2642:1: ( ( ruleRelationModifiers )? )
            // InternalRPG.g:2643:2: ( ruleRelationModifiers )?
            {
             before(grammarAccess.getRelationsAccess().getRelationModifiersParserRuleCall_1()); 
            // InternalRPG.g:2644:2: ( ruleRelationModifiers )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRPG.g:2644:3: ruleRelationModifiers
                    {
                    pushFollow(FOLLOW_2);
                    ruleRelationModifiers();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationsAccess().getRelationModifiersParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relations__Group__1__Impl"


    // $ANTLR start "rule__Relations__Group__2"
    // InternalRPG.g:2652:1: rule__Relations__Group__2 : rule__Relations__Group__2__Impl ;
    public final void rule__Relations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2656:1: ( rule__Relations__Group__2__Impl )
            // InternalRPG.g:2657:2: rule__Relations__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relations__Group__2__Impl();

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
    // $ANTLR end "rule__Relations__Group__2"


    // $ANTLR start "rule__Relations__Group__2__Impl"
    // InternalRPG.g:2663:1: rule__Relations__Group__2__Impl : ( ( ( rule__Relations__TypeAssignment_2 ) ) ( ( rule__Relations__TypeAssignment_2 )* ) ) ;
    public final void rule__Relations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2667:1: ( ( ( ( rule__Relations__TypeAssignment_2 ) ) ( ( rule__Relations__TypeAssignment_2 )* ) ) )
            // InternalRPG.g:2668:1: ( ( ( rule__Relations__TypeAssignment_2 ) ) ( ( rule__Relations__TypeAssignment_2 )* ) )
            {
            // InternalRPG.g:2668:1: ( ( ( rule__Relations__TypeAssignment_2 ) ) ( ( rule__Relations__TypeAssignment_2 )* ) )
            // InternalRPG.g:2669:2: ( ( rule__Relations__TypeAssignment_2 ) ) ( ( rule__Relations__TypeAssignment_2 )* )
            {
            // InternalRPG.g:2669:2: ( ( rule__Relations__TypeAssignment_2 ) )
            // InternalRPG.g:2670:3: ( rule__Relations__TypeAssignment_2 )
            {
             before(grammarAccess.getRelationsAccess().getTypeAssignment_2()); 
            // InternalRPG.g:2671:3: ( rule__Relations__TypeAssignment_2 )
            // InternalRPG.g:2671:4: rule__Relations__TypeAssignment_2
            {
            pushFollow(FOLLOW_20);
            rule__Relations__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getTypeAssignment_2()); 

            }

            // InternalRPG.g:2674:2: ( ( rule__Relations__TypeAssignment_2 )* )
            // InternalRPG.g:2675:3: ( rule__Relations__TypeAssignment_2 )*
            {
             before(grammarAccess.getRelationsAccess().getTypeAssignment_2()); 
            // InternalRPG.g:2676:3: ( rule__Relations__TypeAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==24) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRPG.g:2676:4: rule__Relations__TypeAssignment_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Relations__TypeAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getRelationsAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Relations__Group__2__Impl"


    // $ANTLR start "rule__RelationModifiers__Group__0"
    // InternalRPG.g:2686:1: rule__RelationModifiers__Group__0 : rule__RelationModifiers__Group__0__Impl rule__RelationModifiers__Group__1 ;
    public final void rule__RelationModifiers__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2690:1: ( rule__RelationModifiers__Group__0__Impl rule__RelationModifiers__Group__1 )
            // InternalRPG.g:2691:2: rule__RelationModifiers__Group__0__Impl rule__RelationModifiers__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__RelationModifiers__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationModifiers__Group__1();

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
    // $ANTLR end "rule__RelationModifiers__Group__0"


    // $ANTLR start "rule__RelationModifiers__Group__0__Impl"
    // InternalRPG.g:2698:1: rule__RelationModifiers__Group__0__Impl : ( 'modifiers' ) ;
    public final void rule__RelationModifiers__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2702:1: ( ( 'modifiers' ) )
            // InternalRPG.g:2703:1: ( 'modifiers' )
            {
            // InternalRPG.g:2703:1: ( 'modifiers' )
            // InternalRPG.g:2704:2: 'modifiers'
            {
             before(grammarAccess.getRelationModifiersAccess().getModifiersKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRelationModifiersAccess().getModifiersKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationModifiers__Group__0__Impl"


    // $ANTLR start "rule__RelationModifiers__Group__1"
    // InternalRPG.g:2713:1: rule__RelationModifiers__Group__1 : rule__RelationModifiers__Group__1__Impl rule__RelationModifiers__Group__2 ;
    public final void rule__RelationModifiers__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2717:1: ( rule__RelationModifiers__Group__1__Impl rule__RelationModifiers__Group__2 )
            // InternalRPG.g:2718:2: rule__RelationModifiers__Group__1__Impl rule__RelationModifiers__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__RelationModifiers__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationModifiers__Group__2();

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
    // $ANTLR end "rule__RelationModifiers__Group__1"


    // $ANTLR start "rule__RelationModifiers__Group__1__Impl"
    // InternalRPG.g:2725:1: rule__RelationModifiers__Group__1__Impl : ( 'synergy' ) ;
    public final void rule__RelationModifiers__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2729:1: ( ( 'synergy' ) )
            // InternalRPG.g:2730:1: ( 'synergy' )
            {
            // InternalRPG.g:2730:1: ( 'synergy' )
            // InternalRPG.g:2731:2: 'synergy'
            {
             before(grammarAccess.getRelationModifiersAccess().getSynergyKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRelationModifiersAccess().getSynergyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationModifiers__Group__1__Impl"


    // $ANTLR start "rule__RelationModifiers__Group__2"
    // InternalRPG.g:2740:1: rule__RelationModifiers__Group__2 : rule__RelationModifiers__Group__2__Impl rule__RelationModifiers__Group__3 ;
    public final void rule__RelationModifiers__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2744:1: ( rule__RelationModifiers__Group__2__Impl rule__RelationModifiers__Group__3 )
            // InternalRPG.g:2745:2: rule__RelationModifiers__Group__2__Impl rule__RelationModifiers__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__RelationModifiers__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationModifiers__Group__3();

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
    // $ANTLR end "rule__RelationModifiers__Group__2"


    // $ANTLR start "rule__RelationModifiers__Group__2__Impl"
    // InternalRPG.g:2752:1: rule__RelationModifiers__Group__2__Impl : ( ( rule__RelationModifiers__SynAssignment_2 ) ) ;
    public final void rule__RelationModifiers__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2756:1: ( ( ( rule__RelationModifiers__SynAssignment_2 ) ) )
            // InternalRPG.g:2757:1: ( ( rule__RelationModifiers__SynAssignment_2 ) )
            {
            // InternalRPG.g:2757:1: ( ( rule__RelationModifiers__SynAssignment_2 ) )
            // InternalRPG.g:2758:2: ( rule__RelationModifiers__SynAssignment_2 )
            {
             before(grammarAccess.getRelationModifiersAccess().getSynAssignment_2()); 
            // InternalRPG.g:2759:2: ( rule__RelationModifiers__SynAssignment_2 )
            // InternalRPG.g:2759:3: rule__RelationModifiers__SynAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationModifiers__SynAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationModifiersAccess().getSynAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationModifiers__Group__2__Impl"


    // $ANTLR start "rule__RelationModifiers__Group__3"
    // InternalRPG.g:2767:1: rule__RelationModifiers__Group__3 : rule__RelationModifiers__Group__3__Impl rule__RelationModifiers__Group__4 ;
    public final void rule__RelationModifiers__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2771:1: ( rule__RelationModifiers__Group__3__Impl rule__RelationModifiers__Group__4 )
            // InternalRPG.g:2772:2: rule__RelationModifiers__Group__3__Impl rule__RelationModifiers__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__RelationModifiers__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationModifiers__Group__4();

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
    // $ANTLR end "rule__RelationModifiers__Group__3"


    // $ANTLR start "rule__RelationModifiers__Group__3__Impl"
    // InternalRPG.g:2779:1: rule__RelationModifiers__Group__3__Impl : ( 'effective' ) ;
    public final void rule__RelationModifiers__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2783:1: ( ( 'effective' ) )
            // InternalRPG.g:2784:1: ( 'effective' )
            {
            // InternalRPG.g:2784:1: ( 'effective' )
            // InternalRPG.g:2785:2: 'effective'
            {
             before(grammarAccess.getRelationModifiersAccess().getEffectiveKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRelationModifiersAccess().getEffectiveKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationModifiers__Group__3__Impl"


    // $ANTLR start "rule__RelationModifiers__Group__4"
    // InternalRPG.g:2794:1: rule__RelationModifiers__Group__4 : rule__RelationModifiers__Group__4__Impl rule__RelationModifiers__Group__5 ;
    public final void rule__RelationModifiers__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2798:1: ( rule__RelationModifiers__Group__4__Impl rule__RelationModifiers__Group__5 )
            // InternalRPG.g:2799:2: rule__RelationModifiers__Group__4__Impl rule__RelationModifiers__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__RelationModifiers__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationModifiers__Group__5();

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
    // $ANTLR end "rule__RelationModifiers__Group__4"


    // $ANTLR start "rule__RelationModifiers__Group__4__Impl"
    // InternalRPG.g:2806:1: rule__RelationModifiers__Group__4__Impl : ( ( rule__RelationModifiers__EffAssignment_4 ) ) ;
    public final void rule__RelationModifiers__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2810:1: ( ( ( rule__RelationModifiers__EffAssignment_4 ) ) )
            // InternalRPG.g:2811:1: ( ( rule__RelationModifiers__EffAssignment_4 ) )
            {
            // InternalRPG.g:2811:1: ( ( rule__RelationModifiers__EffAssignment_4 ) )
            // InternalRPG.g:2812:2: ( rule__RelationModifiers__EffAssignment_4 )
            {
             before(grammarAccess.getRelationModifiersAccess().getEffAssignment_4()); 
            // InternalRPG.g:2813:2: ( rule__RelationModifiers__EffAssignment_4 )
            // InternalRPG.g:2813:3: rule__RelationModifiers__EffAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RelationModifiers__EffAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationModifiersAccess().getEffAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationModifiers__Group__4__Impl"


    // $ANTLR start "rule__RelationModifiers__Group__5"
    // InternalRPG.g:2821:1: rule__RelationModifiers__Group__5 : rule__RelationModifiers__Group__5__Impl rule__RelationModifiers__Group__6 ;
    public final void rule__RelationModifiers__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2825:1: ( rule__RelationModifiers__Group__5__Impl rule__RelationModifiers__Group__6 )
            // InternalRPG.g:2826:2: rule__RelationModifiers__Group__5__Impl rule__RelationModifiers__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__RelationModifiers__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationModifiers__Group__6();

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
    // $ANTLR end "rule__RelationModifiers__Group__5"


    // $ANTLR start "rule__RelationModifiers__Group__5__Impl"
    // InternalRPG.g:2833:1: rule__RelationModifiers__Group__5__Impl : ( 'ineffective' ) ;
    public final void rule__RelationModifiers__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2837:1: ( ( 'ineffective' ) )
            // InternalRPG.g:2838:1: ( 'ineffective' )
            {
            // InternalRPG.g:2838:1: ( 'ineffective' )
            // InternalRPG.g:2839:2: 'ineffective'
            {
             before(grammarAccess.getRelationModifiersAccess().getIneffectiveKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRelationModifiersAccess().getIneffectiveKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationModifiers__Group__5__Impl"


    // $ANTLR start "rule__RelationModifiers__Group__6"
    // InternalRPG.g:2848:1: rule__RelationModifiers__Group__6 : rule__RelationModifiers__Group__6__Impl ;
    public final void rule__RelationModifiers__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2852:1: ( rule__RelationModifiers__Group__6__Impl )
            // InternalRPG.g:2853:2: rule__RelationModifiers__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationModifiers__Group__6__Impl();

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
    // $ANTLR end "rule__RelationModifiers__Group__6"


    // $ANTLR start "rule__RelationModifiers__Group__6__Impl"
    // InternalRPG.g:2859:1: rule__RelationModifiers__Group__6__Impl : ( ( rule__RelationModifiers__IneffAssignment_6 ) ) ;
    public final void rule__RelationModifiers__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2863:1: ( ( ( rule__RelationModifiers__IneffAssignment_6 ) ) )
            // InternalRPG.g:2864:1: ( ( rule__RelationModifiers__IneffAssignment_6 ) )
            {
            // InternalRPG.g:2864:1: ( ( rule__RelationModifiers__IneffAssignment_6 ) )
            // InternalRPG.g:2865:2: ( rule__RelationModifiers__IneffAssignment_6 )
            {
             before(grammarAccess.getRelationModifiersAccess().getIneffAssignment_6()); 
            // InternalRPG.g:2866:2: ( rule__RelationModifiers__IneffAssignment_6 )
            // InternalRPG.g:2866:3: rule__RelationModifiers__IneffAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RelationModifiers__IneffAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRelationModifiersAccess().getIneffAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationModifiers__Group__6__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalRPG.g:2875:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2879:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalRPG.g:2880:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

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
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalRPG.g:2887:1: rule__Type__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2891:1: ( ( 'type' ) )
            // InternalRPG.g:2892:1: ( 'type' )
            {
            // InternalRPG.g:2892:1: ( 'type' )
            // InternalRPG.g:2893:2: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalRPG.g:2902:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2906:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalRPG.g:2907:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

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
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalRPG.g:2914:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2918:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalRPG.g:2919:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalRPG.g:2919:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalRPG.g:2920:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalRPG.g:2921:2: ( rule__Type__NameAssignment_1 )
            // InternalRPG.g:2921:3: rule__Type__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalRPG.g:2929:1: rule__Type__Group__2 : rule__Type__Group__2__Impl ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2933:1: ( rule__Type__Group__2__Impl )
            // InternalRPG.g:2934:2: rule__Type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__2__Impl();

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
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalRPG.g:2940:1: rule__Type__Group__2__Impl : ( ( rule__Type__TExpressionAssignment_2 )? ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2944:1: ( ( ( rule__Type__TExpressionAssignment_2 )? ) )
            // InternalRPG.g:2945:1: ( ( rule__Type__TExpressionAssignment_2 )? )
            {
            // InternalRPG.g:2945:1: ( ( rule__Type__TExpressionAssignment_2 )? )
            // InternalRPG.g:2946:2: ( rule__Type__TExpressionAssignment_2 )?
            {
             before(grammarAccess.getTypeAccess().getTExpressionAssignment_2()); 
            // InternalRPG.g:2947:2: ( rule__Type__TExpressionAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRPG.g:2947:3: rule__Type__TExpressionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TExpressionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getTExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__TypeExpression__Group__0"
    // InternalRPG.g:2956:1: rule__TypeExpression__Group__0 : rule__TypeExpression__Group__0__Impl rule__TypeExpression__Group__1 ;
    public final void rule__TypeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2960:1: ( rule__TypeExpression__Group__0__Impl rule__TypeExpression__Group__1 )
            // InternalRPG.g:2961:2: rule__TypeExpression__Group__0__Impl rule__TypeExpression__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__TypeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__1();

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
    // $ANTLR end "rule__TypeExpression__Group__0"


    // $ANTLR start "rule__TypeExpression__Group__0__Impl"
    // InternalRPG.g:2968:1: rule__TypeExpression__Group__0__Impl : ( ( rule__TypeExpression__StrongAssignment_0 ) ) ;
    public final void rule__TypeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2972:1: ( ( ( rule__TypeExpression__StrongAssignment_0 ) ) )
            // InternalRPG.g:2973:1: ( ( rule__TypeExpression__StrongAssignment_0 ) )
            {
            // InternalRPG.g:2973:1: ( ( rule__TypeExpression__StrongAssignment_0 ) )
            // InternalRPG.g:2974:2: ( rule__TypeExpression__StrongAssignment_0 )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrongAssignment_0()); 
            // InternalRPG.g:2975:2: ( rule__TypeExpression__StrongAssignment_0 )
            // InternalRPG.g:2975:3: rule__TypeExpression__StrongAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__StrongAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getStrongAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__0__Impl"


    // $ANTLR start "rule__TypeExpression__Group__1"
    // InternalRPG.g:2983:1: rule__TypeExpression__Group__1 : rule__TypeExpression__Group__1__Impl rule__TypeExpression__Group__2 ;
    public final void rule__TypeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2987:1: ( rule__TypeExpression__Group__1__Impl rule__TypeExpression__Group__2 )
            // InternalRPG.g:2988:2: rule__TypeExpression__Group__1__Impl rule__TypeExpression__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__TypeExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__2();

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
    // $ANTLR end "rule__TypeExpression__Group__1"


    // $ANTLR start "rule__TypeExpression__Group__1__Impl"
    // InternalRPG.g:2995:1: rule__TypeExpression__Group__1__Impl : ( ( rule__TypeExpression__Group_1__0 )* ) ;
    public final void rule__TypeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:2999:1: ( ( ( rule__TypeExpression__Group_1__0 )* ) )
            // InternalRPG.g:3000:1: ( ( rule__TypeExpression__Group_1__0 )* )
            {
            // InternalRPG.g:3000:1: ( ( rule__TypeExpression__Group_1__0 )* )
            // InternalRPG.g:3001:2: ( rule__TypeExpression__Group_1__0 )*
            {
             before(grammarAccess.getTypeExpressionAccess().getGroup_1()); 
            // InternalRPG.g:3002:2: ( rule__TypeExpression__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==17) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRPG.g:3002:3: rule__TypeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TypeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getTypeExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__1__Impl"


    // $ANTLR start "rule__TypeExpression__Group__2"
    // InternalRPG.g:3010:1: rule__TypeExpression__Group__2 : rule__TypeExpression__Group__2__Impl rule__TypeExpression__Group__3 ;
    public final void rule__TypeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3014:1: ( rule__TypeExpression__Group__2__Impl rule__TypeExpression__Group__3 )
            // InternalRPG.g:3015:2: rule__TypeExpression__Group__2__Impl rule__TypeExpression__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__TypeExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__3();

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
    // $ANTLR end "rule__TypeExpression__Group__2"


    // $ANTLR start "rule__TypeExpression__Group__2__Impl"
    // InternalRPG.g:3022:1: rule__TypeExpression__Group__2__Impl : ( '<' ) ;
    public final void rule__TypeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3026:1: ( ( '<' ) )
            // InternalRPG.g:3027:1: ( '<' )
            {
            // InternalRPG.g:3027:1: ( '<' )
            // InternalRPG.g:3028:2: '<'
            {
             before(grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__2__Impl"


    // $ANTLR start "rule__TypeExpression__Group__3"
    // InternalRPG.g:3037:1: rule__TypeExpression__Group__3 : rule__TypeExpression__Group__3__Impl rule__TypeExpression__Group__4 ;
    public final void rule__TypeExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3041:1: ( rule__TypeExpression__Group__3__Impl rule__TypeExpression__Group__4 )
            // InternalRPG.g:3042:2: rule__TypeExpression__Group__3__Impl rule__TypeExpression__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__TypeExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__4();

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
    // $ANTLR end "rule__TypeExpression__Group__3"


    // $ANTLR start "rule__TypeExpression__Group__3__Impl"
    // InternalRPG.g:3049:1: rule__TypeExpression__Group__3__Impl : ( ( rule__TypeExpression__CurrentTAssignment_3 ) ) ;
    public final void rule__TypeExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3053:1: ( ( ( rule__TypeExpression__CurrentTAssignment_3 ) ) )
            // InternalRPG.g:3054:1: ( ( rule__TypeExpression__CurrentTAssignment_3 ) )
            {
            // InternalRPG.g:3054:1: ( ( rule__TypeExpression__CurrentTAssignment_3 ) )
            // InternalRPG.g:3055:2: ( rule__TypeExpression__CurrentTAssignment_3 )
            {
             before(grammarAccess.getTypeExpressionAccess().getCurrentTAssignment_3()); 
            // InternalRPG.g:3056:2: ( rule__TypeExpression__CurrentTAssignment_3 )
            // InternalRPG.g:3056:3: rule__TypeExpression__CurrentTAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__CurrentTAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getCurrentTAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__3__Impl"


    // $ANTLR start "rule__TypeExpression__Group__4"
    // InternalRPG.g:3064:1: rule__TypeExpression__Group__4 : rule__TypeExpression__Group__4__Impl rule__TypeExpression__Group__5 ;
    public final void rule__TypeExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3068:1: ( rule__TypeExpression__Group__4__Impl rule__TypeExpression__Group__5 )
            // InternalRPG.g:3069:2: rule__TypeExpression__Group__4__Impl rule__TypeExpression__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__TypeExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__5();

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
    // $ANTLR end "rule__TypeExpression__Group__4"


    // $ANTLR start "rule__TypeExpression__Group__4__Impl"
    // InternalRPG.g:3076:1: rule__TypeExpression__Group__4__Impl : ( '<' ) ;
    public final void rule__TypeExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3080:1: ( ( '<' ) )
            // InternalRPG.g:3081:1: ( '<' )
            {
            // InternalRPG.g:3081:1: ( '<' )
            // InternalRPG.g:3082:2: '<'
            {
             before(grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__4__Impl"


    // $ANTLR start "rule__TypeExpression__Group__5"
    // InternalRPG.g:3091:1: rule__TypeExpression__Group__5 : rule__TypeExpression__Group__5__Impl rule__TypeExpression__Group__6 ;
    public final void rule__TypeExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3095:1: ( rule__TypeExpression__Group__5__Impl rule__TypeExpression__Group__6 )
            // InternalRPG.g:3096:2: rule__TypeExpression__Group__5__Impl rule__TypeExpression__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__TypeExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__6();

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
    // $ANTLR end "rule__TypeExpression__Group__5"


    // $ANTLR start "rule__TypeExpression__Group__5__Impl"
    // InternalRPG.g:3103:1: rule__TypeExpression__Group__5__Impl : ( ( rule__TypeExpression__WeakAssignment_5 ) ) ;
    public final void rule__TypeExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3107:1: ( ( ( rule__TypeExpression__WeakAssignment_5 ) ) )
            // InternalRPG.g:3108:1: ( ( rule__TypeExpression__WeakAssignment_5 ) )
            {
            // InternalRPG.g:3108:1: ( ( rule__TypeExpression__WeakAssignment_5 ) )
            // InternalRPG.g:3109:2: ( rule__TypeExpression__WeakAssignment_5 )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeakAssignment_5()); 
            // InternalRPG.g:3110:2: ( rule__TypeExpression__WeakAssignment_5 )
            // InternalRPG.g:3110:3: rule__TypeExpression__WeakAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__WeakAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getWeakAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__5__Impl"


    // $ANTLR start "rule__TypeExpression__Group__6"
    // InternalRPG.g:3118:1: rule__TypeExpression__Group__6 : rule__TypeExpression__Group__6__Impl ;
    public final void rule__TypeExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3122:1: ( rule__TypeExpression__Group__6__Impl )
            // InternalRPG.g:3123:2: rule__TypeExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__6__Impl();

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
    // $ANTLR end "rule__TypeExpression__Group__6"


    // $ANTLR start "rule__TypeExpression__Group__6__Impl"
    // InternalRPG.g:3129:1: rule__TypeExpression__Group__6__Impl : ( ( rule__TypeExpression__Group_6__0 )* ) ;
    public final void rule__TypeExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3133:1: ( ( ( rule__TypeExpression__Group_6__0 )* ) )
            // InternalRPG.g:3134:1: ( ( rule__TypeExpression__Group_6__0 )* )
            {
            // InternalRPG.g:3134:1: ( ( rule__TypeExpression__Group_6__0 )* )
            // InternalRPG.g:3135:2: ( rule__TypeExpression__Group_6__0 )*
            {
             before(grammarAccess.getTypeExpressionAccess().getGroup_6()); 
            // InternalRPG.g:3136:2: ( rule__TypeExpression__Group_6__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==17) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRPG.g:3136:3: rule__TypeExpression__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TypeExpression__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getTypeExpressionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__6__Impl"


    // $ANTLR start "rule__TypeExpression__Group_1__0"
    // InternalRPG.g:3145:1: rule__TypeExpression__Group_1__0 : rule__TypeExpression__Group_1__0__Impl rule__TypeExpression__Group_1__1 ;
    public final void rule__TypeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3149:1: ( rule__TypeExpression__Group_1__0__Impl rule__TypeExpression__Group_1__1 )
            // InternalRPG.g:3150:2: rule__TypeExpression__Group_1__0__Impl rule__TypeExpression__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__TypeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group_1__1();

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
    // $ANTLR end "rule__TypeExpression__Group_1__0"


    // $ANTLR start "rule__TypeExpression__Group_1__0__Impl"
    // InternalRPG.g:3157:1: rule__TypeExpression__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TypeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3161:1: ( ( ',' ) )
            // InternalRPG.g:3162:1: ( ',' )
            {
            // InternalRPG.g:3162:1: ( ',' )
            // InternalRPG.g:3163:2: ','
            {
             before(grammarAccess.getTypeExpressionAccess().getCommaKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TypeExpression__Group_1__1"
    // InternalRPG.g:3172:1: rule__TypeExpression__Group_1__1 : rule__TypeExpression__Group_1__1__Impl ;
    public final void rule__TypeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3176:1: ( rule__TypeExpression__Group_1__1__Impl )
            // InternalRPG.g:3177:2: rule__TypeExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__TypeExpression__Group_1__1"


    // $ANTLR start "rule__TypeExpression__Group_1__1__Impl"
    // InternalRPG.g:3183:1: rule__TypeExpression__Group_1__1__Impl : ( ( rule__TypeExpression__Strong2Assignment_1_1 ) ) ;
    public final void rule__TypeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3187:1: ( ( ( rule__TypeExpression__Strong2Assignment_1_1 ) ) )
            // InternalRPG.g:3188:1: ( ( rule__TypeExpression__Strong2Assignment_1_1 ) )
            {
            // InternalRPG.g:3188:1: ( ( rule__TypeExpression__Strong2Assignment_1_1 ) )
            // InternalRPG.g:3189:2: ( rule__TypeExpression__Strong2Assignment_1_1 )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrong2Assignment_1_1()); 
            // InternalRPG.g:3190:2: ( rule__TypeExpression__Strong2Assignment_1_1 )
            // InternalRPG.g:3190:3: rule__TypeExpression__Strong2Assignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Strong2Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getStrong2Assignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TypeExpression__Group_6__0"
    // InternalRPG.g:3199:1: rule__TypeExpression__Group_6__0 : rule__TypeExpression__Group_6__0__Impl rule__TypeExpression__Group_6__1 ;
    public final void rule__TypeExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3203:1: ( rule__TypeExpression__Group_6__0__Impl rule__TypeExpression__Group_6__1 )
            // InternalRPG.g:3204:2: rule__TypeExpression__Group_6__0__Impl rule__TypeExpression__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__TypeExpression__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group_6__1();

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
    // $ANTLR end "rule__TypeExpression__Group_6__0"


    // $ANTLR start "rule__TypeExpression__Group_6__0__Impl"
    // InternalRPG.g:3211:1: rule__TypeExpression__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypeExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3215:1: ( ( ',' ) )
            // InternalRPG.g:3216:1: ( ',' )
            {
            // InternalRPG.g:3216:1: ( ',' )
            // InternalRPG.g:3217:2: ','
            {
             before(grammarAccess.getTypeExpressionAccess().getCommaKeyword_6_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group_6__0__Impl"


    // $ANTLR start "rule__TypeExpression__Group_6__1"
    // InternalRPG.g:3226:1: rule__TypeExpression__Group_6__1 : rule__TypeExpression__Group_6__1__Impl ;
    public final void rule__TypeExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3230:1: ( rule__TypeExpression__Group_6__1__Impl )
            // InternalRPG.g:3231:2: rule__TypeExpression__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group_6__1__Impl();

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
    // $ANTLR end "rule__TypeExpression__Group_6__1"


    // $ANTLR start "rule__TypeExpression__Group_6__1__Impl"
    // InternalRPG.g:3237:1: rule__TypeExpression__Group_6__1__Impl : ( ( rule__TypeExpression__Weak2Assignment_6_1 ) ) ;
    public final void rule__TypeExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3241:1: ( ( ( rule__TypeExpression__Weak2Assignment_6_1 ) ) )
            // InternalRPG.g:3242:1: ( ( rule__TypeExpression__Weak2Assignment_6_1 ) )
            {
            // InternalRPG.g:3242:1: ( ( rule__TypeExpression__Weak2Assignment_6_1 ) )
            // InternalRPG.g:3243:2: ( rule__TypeExpression__Weak2Assignment_6_1 )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeak2Assignment_6_1()); 
            // InternalRPG.g:3244:2: ( rule__TypeExpression__Weak2Assignment_6_1 )
            // InternalRPG.g:3244:3: rule__TypeExpression__Weak2Assignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Weak2Assignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getWeak2Assignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group_6__1__Impl"


    // $ANTLR start "rule__Moves__Group__0"
    // InternalRPG.g:3253:1: rule__Moves__Group__0 : rule__Moves__Group__0__Impl rule__Moves__Group__1 ;
    public final void rule__Moves__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3257:1: ( rule__Moves__Group__0__Impl rule__Moves__Group__1 )
            // InternalRPG.g:3258:2: rule__Moves__Group__0__Impl rule__Moves__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Moves__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Moves__Group__1();

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
    // $ANTLR end "rule__Moves__Group__0"


    // $ANTLR start "rule__Moves__Group__0__Impl"
    // InternalRPG.g:3265:1: rule__Moves__Group__0__Impl : ( 'moves' ) ;
    public final void rule__Moves__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3269:1: ( ( 'moves' ) )
            // InternalRPG.g:3270:1: ( 'moves' )
            {
            // InternalRPG.g:3270:1: ( 'moves' )
            // InternalRPG.g:3271:2: 'moves'
            {
             before(grammarAccess.getMovesAccess().getMovesKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMovesAccess().getMovesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moves__Group__0__Impl"


    // $ANTLR start "rule__Moves__Group__1"
    // InternalRPG.g:3280:1: rule__Moves__Group__1 : rule__Moves__Group__1__Impl ;
    public final void rule__Moves__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3284:1: ( rule__Moves__Group__1__Impl )
            // InternalRPG.g:3285:2: rule__Moves__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Moves__Group__1__Impl();

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
    // $ANTLR end "rule__Moves__Group__1"


    // $ANTLR start "rule__Moves__Group__1__Impl"
    // InternalRPG.g:3291:1: rule__Moves__Group__1__Impl : ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) ) ;
    public final void rule__Moves__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3295:1: ( ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) ) )
            // InternalRPG.g:3296:1: ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) )
            {
            // InternalRPG.g:3296:1: ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) )
            // InternalRPG.g:3297:2: ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* )
            {
            // InternalRPG.g:3297:2: ( ( rule__Moves__MoveAssignment_1 ) )
            // InternalRPG.g:3298:3: ( rule__Moves__MoveAssignment_1 )
            {
             before(grammarAccess.getMovesAccess().getMoveAssignment_1()); 
            // InternalRPG.g:3299:3: ( rule__Moves__MoveAssignment_1 )
            // InternalRPG.g:3299:4: rule__Moves__MoveAssignment_1
            {
            pushFollow(FOLLOW_27);
            rule__Moves__MoveAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMovesAccess().getMoveAssignment_1()); 

            }

            // InternalRPG.g:3302:2: ( ( rule__Moves__MoveAssignment_1 )* )
            // InternalRPG.g:3303:3: ( rule__Moves__MoveAssignment_1 )*
            {
             before(grammarAccess.getMovesAccess().getMoveAssignment_1()); 
            // InternalRPG.g:3304:3: ( rule__Moves__MoveAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRPG.g:3304:4: rule__Moves__MoveAssignment_1
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Moves__MoveAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMovesAccess().getMoveAssignment_1()); 

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
    // $ANTLR end "rule__Moves__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalRPG.g:3314:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3318:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalRPG.g:3319:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

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
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalRPG.g:3326:1: rule__Move__Group__0__Impl : ( 'move' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3330:1: ( ( 'move' ) )
            // InternalRPG.g:3331:1: ( 'move' )
            {
            // InternalRPG.g:3331:1: ( 'move' )
            // InternalRPG.g:3332:2: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalRPG.g:3341:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3345:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalRPG.g:3346:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__2();

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
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalRPG.g:3353:1: rule__Move__Group__1__Impl : ( ( rule__Move__NameAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3357:1: ( ( ( rule__Move__NameAssignment_1 ) ) )
            // InternalRPG.g:3358:1: ( ( rule__Move__NameAssignment_1 ) )
            {
            // InternalRPG.g:3358:1: ( ( rule__Move__NameAssignment_1 ) )
            // InternalRPG.g:3359:2: ( rule__Move__NameAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getNameAssignment_1()); 
            // InternalRPG.g:3360:2: ( rule__Move__NameAssignment_1 )
            // InternalRPG.g:3360:3: rule__Move__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__2"
    // InternalRPG.g:3368:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3372:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // InternalRPG.g:3373:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__3();

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
    // $ANTLR end "rule__Move__Group__2"


    // $ANTLR start "rule__Move__Group__2__Impl"
    // InternalRPG.g:3380:1: rule__Move__Group__2__Impl : ( ( rule__Move__ETypeAssignment_2 ) ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3384:1: ( ( ( rule__Move__ETypeAssignment_2 ) ) )
            // InternalRPG.g:3385:1: ( ( rule__Move__ETypeAssignment_2 ) )
            {
            // InternalRPG.g:3385:1: ( ( rule__Move__ETypeAssignment_2 ) )
            // InternalRPG.g:3386:2: ( rule__Move__ETypeAssignment_2 )
            {
             before(grammarAccess.getMoveAccess().getETypeAssignment_2()); 
            // InternalRPG.g:3387:2: ( rule__Move__ETypeAssignment_2 )
            // InternalRPG.g:3387:3: rule__Move__ETypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Move__ETypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getETypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__3"
    // InternalRPG.g:3395:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3399:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // InternalRPG.g:3400:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__4();

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
    // $ANTLR end "rule__Move__Group__3"


    // $ANTLR start "rule__Move__Group__3__Impl"
    // InternalRPG.g:3407:1: rule__Move__Group__3__Impl : ( ( rule__Move__AttAssignment_3 )* ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3411:1: ( ( ( rule__Move__AttAssignment_3 )* ) )
            // InternalRPG.g:3412:1: ( ( rule__Move__AttAssignment_3 )* )
            {
            // InternalRPG.g:3412:1: ( ( rule__Move__AttAssignment_3 )* )
            // InternalRPG.g:3413:2: ( rule__Move__AttAssignment_3 )*
            {
             before(grammarAccess.getMoveAccess().getAttAssignment_3()); 
            // InternalRPG.g:3414:2: ( rule__Move__AttAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRPG.g:3414:3: rule__Move__AttAssignment_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Move__AttAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMoveAccess().getAttAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3__Impl"


    // $ANTLR start "rule__Move__Group__4"
    // InternalRPG.g:3422:1: rule__Move__Group__4 : rule__Move__Group__4__Impl ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3426:1: ( rule__Move__Group__4__Impl )
            // InternalRPG.g:3427:2: rule__Move__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__4__Impl();

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
    // $ANTLR end "rule__Move__Group__4"


    // $ANTLR start "rule__Move__Group__4__Impl"
    // InternalRPG.g:3433:1: rule__Move__Group__4__Impl : ( ( rule__Move__Alternatives_4 )* ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3437:1: ( ( ( rule__Move__Alternatives_4 )* ) )
            // InternalRPG.g:3438:1: ( ( rule__Move__Alternatives_4 )* )
            {
            // InternalRPG.g:3438:1: ( ( rule__Move__Alternatives_4 )* )
            // InternalRPG.g:3439:2: ( rule__Move__Alternatives_4 )*
            {
             before(grammarAccess.getMoveAccess().getAlternatives_4()); 
            // InternalRPG.g:3440:2: ( rule__Move__Alternatives_4 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRPG.g:3440:3: rule__Move__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Move__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getMoveAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4__Impl"


    // $ANTLR start "rule__MEffect__Group__0"
    // InternalRPG.g:3449:1: rule__MEffect__Group__0 : rule__MEffect__Group__0__Impl rule__MEffect__Group__1 ;
    public final void rule__MEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3453:1: ( rule__MEffect__Group__0__Impl rule__MEffect__Group__1 )
            // InternalRPG.g:3454:2: rule__MEffect__Group__0__Impl rule__MEffect__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__MEffect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MEffect__Group__1();

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
    // $ANTLR end "rule__MEffect__Group__0"


    // $ANTLR start "rule__MEffect__Group__0__Impl"
    // InternalRPG.g:3461:1: rule__MEffect__Group__0__Impl : ( 'effect' ) ;
    public final void rule__MEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3465:1: ( ( 'effect' ) )
            // InternalRPG.g:3466:1: ( 'effect' )
            {
            // InternalRPG.g:3466:1: ( 'effect' )
            // InternalRPG.g:3467:2: 'effect'
            {
             before(grammarAccess.getMEffectAccess().getEffectKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMEffectAccess().getEffectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEffect__Group__0__Impl"


    // $ANTLR start "rule__MEffect__Group__1"
    // InternalRPG.g:3476:1: rule__MEffect__Group__1 : rule__MEffect__Group__1__Impl rule__MEffect__Group__2 ;
    public final void rule__MEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3480:1: ( rule__MEffect__Group__1__Impl rule__MEffect__Group__2 )
            // InternalRPG.g:3481:2: rule__MEffect__Group__1__Impl rule__MEffect__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MEffect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MEffect__Group__2();

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
    // $ANTLR end "rule__MEffect__Group__1"


    // $ANTLR start "rule__MEffect__Group__1__Impl"
    // InternalRPG.g:3488:1: rule__MEffect__Group__1__Impl : ( 'move' ) ;
    public final void rule__MEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3492:1: ( ( 'move' ) )
            // InternalRPG.g:3493:1: ( 'move' )
            {
            // InternalRPG.g:3493:1: ( 'move' )
            // InternalRPG.g:3494:2: 'move'
            {
             before(grammarAccess.getMEffectAccess().getMoveKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMEffectAccess().getMoveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEffect__Group__1__Impl"


    // $ANTLR start "rule__MEffect__Group__2"
    // InternalRPG.g:3503:1: rule__MEffect__Group__2 : rule__MEffect__Group__2__Impl ;
    public final void rule__MEffect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3507:1: ( rule__MEffect__Group__2__Impl )
            // InternalRPG.g:3508:2: rule__MEffect__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MEffect__Group__2__Impl();

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
    // $ANTLR end "rule__MEffect__Group__2"


    // $ANTLR start "rule__MEffect__Group__2__Impl"
    // InternalRPG.g:3514:1: rule__MEffect__Group__2__Impl : ( ( rule__MEffect__MoveENameAssignment_2 ) ) ;
    public final void rule__MEffect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3518:1: ( ( ( rule__MEffect__MoveENameAssignment_2 ) ) )
            // InternalRPG.g:3519:1: ( ( rule__MEffect__MoveENameAssignment_2 ) )
            {
            // InternalRPG.g:3519:1: ( ( rule__MEffect__MoveENameAssignment_2 ) )
            // InternalRPG.g:3520:2: ( rule__MEffect__MoveENameAssignment_2 )
            {
             before(grammarAccess.getMEffectAccess().getMoveENameAssignment_2()); 
            // InternalRPG.g:3521:2: ( rule__MEffect__MoveENameAssignment_2 )
            // InternalRPG.g:3521:3: rule__MEffect__MoveENameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MEffect__MoveENameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMEffectAccess().getMoveENameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEffect__Group__2__Impl"


    // $ANTLR start "rule__BEffect__Group__0"
    // InternalRPG.g:3530:1: rule__BEffect__Group__0 : rule__BEffect__Group__0__Impl rule__BEffect__Group__1 ;
    public final void rule__BEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3534:1: ( rule__BEffect__Group__0__Impl rule__BEffect__Group__1 )
            // InternalRPG.g:3535:2: rule__BEffect__Group__0__Impl rule__BEffect__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__BEffect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BEffect__Group__1();

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
    // $ANTLR end "rule__BEffect__Group__0"


    // $ANTLR start "rule__BEffect__Group__0__Impl"
    // InternalRPG.g:3542:1: rule__BEffect__Group__0__Impl : ( 'effect' ) ;
    public final void rule__BEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3546:1: ( ( 'effect' ) )
            // InternalRPG.g:3547:1: ( 'effect' )
            {
            // InternalRPG.g:3547:1: ( 'effect' )
            // InternalRPG.g:3548:2: 'effect'
            {
             before(grammarAccess.getBEffectAccess().getEffectKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBEffectAccess().getEffectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BEffect__Group__0__Impl"


    // $ANTLR start "rule__BEffect__Group__1"
    // InternalRPG.g:3557:1: rule__BEffect__Group__1 : rule__BEffect__Group__1__Impl rule__BEffect__Group__2 ;
    public final void rule__BEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3561:1: ( rule__BEffect__Group__1__Impl rule__BEffect__Group__2 )
            // InternalRPG.g:3562:2: rule__BEffect__Group__1__Impl rule__BEffect__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BEffect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BEffect__Group__2();

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
    // $ANTLR end "rule__BEffect__Group__1"


    // $ANTLR start "rule__BEffect__Group__1__Impl"
    // InternalRPG.g:3569:1: rule__BEffect__Group__1__Impl : ( 'buff' ) ;
    public final void rule__BEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3573:1: ( ( 'buff' ) )
            // InternalRPG.g:3574:1: ( 'buff' )
            {
            // InternalRPG.g:3574:1: ( 'buff' )
            // InternalRPG.g:3575:2: 'buff'
            {
             before(grammarAccess.getBEffectAccess().getBuffKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBEffectAccess().getBuffKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BEffect__Group__1__Impl"


    // $ANTLR start "rule__BEffect__Group__2"
    // InternalRPG.g:3584:1: rule__BEffect__Group__2 : rule__BEffect__Group__2__Impl ;
    public final void rule__BEffect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3588:1: ( rule__BEffect__Group__2__Impl )
            // InternalRPG.g:3589:2: rule__BEffect__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BEffect__Group__2__Impl();

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
    // $ANTLR end "rule__BEffect__Group__2"


    // $ANTLR start "rule__BEffect__Group__2__Impl"
    // InternalRPG.g:3595:1: rule__BEffect__Group__2__Impl : ( ( rule__BEffect__BuffENameAssignment_2 ) ) ;
    public final void rule__BEffect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3599:1: ( ( ( rule__BEffect__BuffENameAssignment_2 ) ) )
            // InternalRPG.g:3600:1: ( ( rule__BEffect__BuffENameAssignment_2 ) )
            {
            // InternalRPG.g:3600:1: ( ( rule__BEffect__BuffENameAssignment_2 ) )
            // InternalRPG.g:3601:2: ( rule__BEffect__BuffENameAssignment_2 )
            {
             before(grammarAccess.getBEffectAccess().getBuffENameAssignment_2()); 
            // InternalRPG.g:3602:2: ( rule__BEffect__BuffENameAssignment_2 )
            // InternalRPG.g:3602:3: rule__BEffect__BuffENameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BEffect__BuffENameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBEffectAccess().getBuffENameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BEffect__Group__2__Impl"


    // $ANTLR start "rule__AEffect__Group__0"
    // InternalRPG.g:3611:1: rule__AEffect__Group__0 : rule__AEffect__Group__0__Impl rule__AEffect__Group__1 ;
    public final void rule__AEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3615:1: ( rule__AEffect__Group__0__Impl rule__AEffect__Group__1 )
            // InternalRPG.g:3616:2: rule__AEffect__Group__0__Impl rule__AEffect__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__AEffect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AEffect__Group__1();

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
    // $ANTLR end "rule__AEffect__Group__0"


    // $ANTLR start "rule__AEffect__Group__0__Impl"
    // InternalRPG.g:3623:1: rule__AEffect__Group__0__Impl : ( 'effect' ) ;
    public final void rule__AEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3627:1: ( ( 'effect' ) )
            // InternalRPG.g:3628:1: ( 'effect' )
            {
            // InternalRPG.g:3628:1: ( 'effect' )
            // InternalRPG.g:3629:2: 'effect'
            {
             before(grammarAccess.getAEffectAccess().getEffectKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAEffectAccess().getEffectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AEffect__Group__0__Impl"


    // $ANTLR start "rule__AEffect__Group__1"
    // InternalRPG.g:3638:1: rule__AEffect__Group__1 : rule__AEffect__Group__1__Impl rule__AEffect__Group__2 ;
    public final void rule__AEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3642:1: ( rule__AEffect__Group__1__Impl rule__AEffect__Group__2 )
            // InternalRPG.g:3643:2: rule__AEffect__Group__1__Impl rule__AEffect__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AEffect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AEffect__Group__2();

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
    // $ANTLR end "rule__AEffect__Group__1"


    // $ANTLR start "rule__AEffect__Group__1__Impl"
    // InternalRPG.g:3650:1: rule__AEffect__Group__1__Impl : ( 'after' ) ;
    public final void rule__AEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3654:1: ( ( 'after' ) )
            // InternalRPG.g:3655:1: ( 'after' )
            {
            // InternalRPG.g:3655:1: ( 'after' )
            // InternalRPG.g:3656:2: 'after'
            {
             before(grammarAccess.getAEffectAccess().getAfterKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAEffectAccess().getAfterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AEffect__Group__1__Impl"


    // $ANTLR start "rule__AEffect__Group__2"
    // InternalRPG.g:3665:1: rule__AEffect__Group__2 : rule__AEffect__Group__2__Impl ;
    public final void rule__AEffect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3669:1: ( rule__AEffect__Group__2__Impl )
            // InternalRPG.g:3670:2: rule__AEffect__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AEffect__Group__2__Impl();

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
    // $ANTLR end "rule__AEffect__Group__2"


    // $ANTLR start "rule__AEffect__Group__2__Impl"
    // InternalRPG.g:3676:1: rule__AEffect__Group__2__Impl : ( ( rule__AEffect__AfterENameAssignment_2 ) ) ;
    public final void rule__AEffect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3680:1: ( ( ( rule__AEffect__AfterENameAssignment_2 ) ) )
            // InternalRPG.g:3681:1: ( ( rule__AEffect__AfterENameAssignment_2 ) )
            {
            // InternalRPG.g:3681:1: ( ( rule__AEffect__AfterENameAssignment_2 ) )
            // InternalRPG.g:3682:2: ( rule__AEffect__AfterENameAssignment_2 )
            {
             before(grammarAccess.getAEffectAccess().getAfterENameAssignment_2()); 
            // InternalRPG.g:3683:2: ( rule__AEffect__AfterENameAssignment_2 )
            // InternalRPG.g:3683:3: rule__AEffect__AfterENameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AEffect__AfterENameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAEffectAccess().getAfterENameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AEffect__Group__2__Impl"


    // $ANTLR start "rule__EType__Group__0"
    // InternalRPG.g:3692:1: rule__EType__Group__0 : rule__EType__Group__0__Impl rule__EType__Group__1 ;
    public final void rule__EType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3696:1: ( rule__EType__Group__0__Impl rule__EType__Group__1 )
            // InternalRPG.g:3697:2: rule__EType__Group__0__Impl rule__EType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EType__Group__1();

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
    // $ANTLR end "rule__EType__Group__0"


    // $ANTLR start "rule__EType__Group__0__Impl"
    // InternalRPG.g:3704:1: rule__EType__Group__0__Impl : ( 'type' ) ;
    public final void rule__EType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3708:1: ( ( 'type' ) )
            // InternalRPG.g:3709:1: ( 'type' )
            {
            // InternalRPG.g:3709:1: ( 'type' )
            // InternalRPG.g:3710:2: 'type'
            {
             before(grammarAccess.getETypeAccess().getTypeKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getETypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EType__Group__0__Impl"


    // $ANTLR start "rule__EType__Group__1"
    // InternalRPG.g:3719:1: rule__EType__Group__1 : rule__EType__Group__1__Impl ;
    public final void rule__EType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3723:1: ( rule__EType__Group__1__Impl )
            // InternalRPG.g:3724:2: rule__EType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EType__Group__1__Impl();

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
    // $ANTLR end "rule__EType__Group__1"


    // $ANTLR start "rule__EType__Group__1__Impl"
    // InternalRPG.g:3730:1: rule__EType__Group__1__Impl : ( ( rule__EType__TypeAssignment_1 ) ) ;
    public final void rule__EType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3734:1: ( ( ( rule__EType__TypeAssignment_1 ) ) )
            // InternalRPG.g:3735:1: ( ( rule__EType__TypeAssignment_1 ) )
            {
            // InternalRPG.g:3735:1: ( ( rule__EType__TypeAssignment_1 ) )
            // InternalRPG.g:3736:2: ( rule__EType__TypeAssignment_1 )
            {
             before(grammarAccess.getETypeAccess().getTypeAssignment_1()); 
            // InternalRPG.g:3737:2: ( rule__EType__TypeAssignment_1 )
            // InternalRPG.g:3737:3: rule__EType__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getETypeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EType__Group__1__Impl"


    // $ANTLR start "rule__AttributeValues__Group__0"
    // InternalRPG.g:3746:1: rule__AttributeValues__Group__0 : rule__AttributeValues__Group__0__Impl rule__AttributeValues__Group__1 ;
    public final void rule__AttributeValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3750:1: ( rule__AttributeValues__Group__0__Impl rule__AttributeValues__Group__1 )
            // InternalRPG.g:3751:2: rule__AttributeValues__Group__0__Impl rule__AttributeValues__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__AttributeValues__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeValues__Group__1();

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
    // $ANTLR end "rule__AttributeValues__Group__0"


    // $ANTLR start "rule__AttributeValues__Group__0__Impl"
    // InternalRPG.g:3758:1: rule__AttributeValues__Group__0__Impl : ( 'is' ) ;
    public final void rule__AttributeValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3762:1: ( ( 'is' ) )
            // InternalRPG.g:3763:1: ( 'is' )
            {
            // InternalRPG.g:3763:1: ( 'is' )
            // InternalRPG.g:3764:2: 'is'
            {
             before(grammarAccess.getAttributeValuesAccess().getIsKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttributeValuesAccess().getIsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValues__Group__0__Impl"


    // $ANTLR start "rule__AttributeValues__Group__1"
    // InternalRPG.g:3773:1: rule__AttributeValues__Group__1 : rule__AttributeValues__Group__1__Impl ;
    public final void rule__AttributeValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3777:1: ( rule__AttributeValues__Group__1__Impl )
            // InternalRPG.g:3778:2: rule__AttributeValues__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValues__Group__1__Impl();

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
    // $ANTLR end "rule__AttributeValues__Group__1"


    // $ANTLR start "rule__AttributeValues__Group__1__Impl"
    // InternalRPG.g:3784:1: rule__AttributeValues__Group__1__Impl : ( ( rule__AttributeValues__Alternatives_1 ) ) ;
    public final void rule__AttributeValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3788:1: ( ( ( rule__AttributeValues__Alternatives_1 ) ) )
            // InternalRPG.g:3789:1: ( ( rule__AttributeValues__Alternatives_1 ) )
            {
            // InternalRPG.g:3789:1: ( ( rule__AttributeValues__Alternatives_1 ) )
            // InternalRPG.g:3790:2: ( rule__AttributeValues__Alternatives_1 )
            {
             before(grammarAccess.getAttributeValuesAccess().getAlternatives_1()); 
            // InternalRPG.g:3791:2: ( rule__AttributeValues__Alternatives_1 )
            // InternalRPG.g:3791:3: rule__AttributeValues__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValues__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValuesAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValues__Group__1__Impl"


    // $ANTLR start "rule__AltAttribute__Group__0"
    // InternalRPG.g:3800:1: rule__AltAttribute__Group__0 : rule__AltAttribute__Group__0__Impl rule__AltAttribute__Group__1 ;
    public final void rule__AltAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3804:1: ( rule__AltAttribute__Group__0__Impl rule__AltAttribute__Group__1 )
            // InternalRPG.g:3805:2: rule__AltAttribute__Group__0__Impl rule__AltAttribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AltAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AltAttribute__Group__1();

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
    // $ANTLR end "rule__AltAttribute__Group__0"


    // $ANTLR start "rule__AltAttribute__Group__0__Impl"
    // InternalRPG.g:3812:1: rule__AltAttribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__AltAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3816:1: ( ( 'attribute' ) )
            // InternalRPG.g:3817:1: ( 'attribute' )
            {
            // InternalRPG.g:3817:1: ( 'attribute' )
            // InternalRPG.g:3818:2: 'attribute'
            {
             before(grammarAccess.getAltAttributeAccess().getAttributeKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAltAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AltAttribute__Group__0__Impl"


    // $ANTLR start "rule__AltAttribute__Group__1"
    // InternalRPG.g:3827:1: rule__AltAttribute__Group__1 : rule__AltAttribute__Group__1__Impl rule__AltAttribute__Group__2 ;
    public final void rule__AltAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3831:1: ( rule__AltAttribute__Group__1__Impl rule__AltAttribute__Group__2 )
            // InternalRPG.g:3832:2: rule__AltAttribute__Group__1__Impl rule__AltAttribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AltAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AltAttribute__Group__2();

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
    // $ANTLR end "rule__AltAttribute__Group__1"


    // $ANTLR start "rule__AltAttribute__Group__1__Impl"
    // InternalRPG.g:3839:1: rule__AltAttribute__Group__1__Impl : ( ( rule__AltAttribute__AttributeAssignment_1 ) ) ;
    public final void rule__AltAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3843:1: ( ( ( rule__AltAttribute__AttributeAssignment_1 ) ) )
            // InternalRPG.g:3844:1: ( ( rule__AltAttribute__AttributeAssignment_1 ) )
            {
            // InternalRPG.g:3844:1: ( ( rule__AltAttribute__AttributeAssignment_1 ) )
            // InternalRPG.g:3845:2: ( rule__AltAttribute__AttributeAssignment_1 )
            {
             before(grammarAccess.getAltAttributeAccess().getAttributeAssignment_1()); 
            // InternalRPG.g:3846:2: ( rule__AltAttribute__AttributeAssignment_1 )
            // InternalRPG.g:3846:3: rule__AltAttribute__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AltAttribute__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAltAttributeAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AltAttribute__Group__1__Impl"


    // $ANTLR start "rule__AltAttribute__Group__2"
    // InternalRPG.g:3854:1: rule__AltAttribute__Group__2 : rule__AltAttribute__Group__2__Impl ;
    public final void rule__AltAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3858:1: ( rule__AltAttribute__Group__2__Impl )
            // InternalRPG.g:3859:2: rule__AltAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AltAttribute__Group__2__Impl();

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
    // $ANTLR end "rule__AltAttribute__Group__2"


    // $ANTLR start "rule__AltAttribute__Group__2__Impl"
    // InternalRPG.g:3865:1: rule__AltAttribute__Group__2__Impl : ( ( rule__AltAttribute__AvAssignment_2 )? ) ;
    public final void rule__AltAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3869:1: ( ( ( rule__AltAttribute__AvAssignment_2 )? ) )
            // InternalRPG.g:3870:1: ( ( rule__AltAttribute__AvAssignment_2 )? )
            {
            // InternalRPG.g:3870:1: ( ( rule__AltAttribute__AvAssignment_2 )? )
            // InternalRPG.g:3871:2: ( rule__AltAttribute__AvAssignment_2 )?
            {
             before(grammarAccess.getAltAttributeAccess().getAvAssignment_2()); 
            // InternalRPG.g:3872:2: ( rule__AltAttribute__AvAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRPG.g:3872:3: rule__AltAttribute__AvAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AltAttribute__AvAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAltAttributeAccess().getAvAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AltAttribute__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalRPG.g:3881:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3885:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalRPG.g:3886:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalRPG.g:3893:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__Group_0__0 )? ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3897:1: ( ( ( rule__Rule__Group_0__0 )? ) )
            // InternalRPG.g:3898:1: ( ( rule__Rule__Group_0__0 )? )
            {
            // InternalRPG.g:3898:1: ( ( rule__Rule__Group_0__0 )? )
            // InternalRPG.g:3899:2: ( rule__Rule__Group_0__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_0()); 
            // InternalRPG.g:3900:2: ( rule__Rule__Group_0__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRPG.g:3900:3: rule__Rule__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalRPG.g:3908:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3912:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalRPG.g:3913:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalRPG.g:3920:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__TargetAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3924:1: ( ( ( rule__Rule__TargetAssignment_1 ) ) )
            // InternalRPG.g:3925:1: ( ( rule__Rule__TargetAssignment_1 ) )
            {
            // InternalRPG.g:3925:1: ( ( rule__Rule__TargetAssignment_1 ) )
            // InternalRPG.g:3926:2: ( rule__Rule__TargetAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getTargetAssignment_1()); 
            // InternalRPG.g:3927:2: ( rule__Rule__TargetAssignment_1 )
            // InternalRPG.g:3927:3: rule__Rule__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTargetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalRPG.g:3935:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3939:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalRPG.g:3940:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalRPG.g:3947:1: rule__Rule__Group__2__Impl : ( 'is' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3951:1: ( ( 'is' ) )
            // InternalRPG.g:3952:1: ( 'is' )
            {
            // InternalRPG.g:3952:1: ( 'is' )
            // InternalRPG.g:3953:2: 'is'
            {
             before(grammarAccess.getRuleAccess().getIsKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalRPG.g:3962:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3966:1: ( rule__Rule__Group__3__Impl )
            // InternalRPG.g:3967:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__3__Impl();

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalRPG.g:3973:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__SumAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3977:1: ( ( ( rule__Rule__SumAssignment_3 ) ) )
            // InternalRPG.g:3978:1: ( ( rule__Rule__SumAssignment_3 ) )
            {
            // InternalRPG.g:3978:1: ( ( rule__Rule__SumAssignment_3 ) )
            // InternalRPG.g:3979:2: ( rule__Rule__SumAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getSumAssignment_3()); 
            // InternalRPG.g:3980:2: ( rule__Rule__SumAssignment_3 )
            // InternalRPG.g:3980:3: rule__Rule__SumAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__SumAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getSumAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group_0__0"
    // InternalRPG.g:3989:1: rule__Rule__Group_0__0 : rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1 ;
    public final void rule__Rule__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:3993:1: ( rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1 )
            // InternalRPG.g:3994:2: rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1
            {
            pushFollow(FOLLOW_35);
            rule__Rule__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_0__1();

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
    // $ANTLR end "rule__Rule__Group_0__0"


    // $ANTLR start "rule__Rule__Group_0__0__Impl"
    // InternalRPG.g:4001:1: rule__Rule__Group_0__0__Impl : ( 'if' ) ;
    public final void rule__Rule__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4005:1: ( ( 'if' ) )
            // InternalRPG.g:4006:1: ( 'if' )
            {
            // InternalRPG.g:4006:1: ( 'if' )
            // InternalRPG.g:4007:2: 'if'
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getIfKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_0__0__Impl"


    // $ANTLR start "rule__Rule__Group_0__1"
    // InternalRPG.g:4016:1: rule__Rule__Group_0__1 : rule__Rule__Group_0__1__Impl rule__Rule__Group_0__2 ;
    public final void rule__Rule__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4020:1: ( rule__Rule__Group_0__1__Impl rule__Rule__Group_0__2 )
            // InternalRPG.g:4021:2: rule__Rule__Group_0__1__Impl rule__Rule__Group_0__2
            {
            pushFollow(FOLLOW_36);
            rule__Rule__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_0__2();

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
    // $ANTLR end "rule__Rule__Group_0__1"


    // $ANTLR start "rule__Rule__Group_0__1__Impl"
    // InternalRPG.g:4028:1: rule__Rule__Group_0__1__Impl : ( ( rule__Rule__OrAssignment_0_1 ) ) ;
    public final void rule__Rule__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4032:1: ( ( ( rule__Rule__OrAssignment_0_1 ) ) )
            // InternalRPG.g:4033:1: ( ( rule__Rule__OrAssignment_0_1 ) )
            {
            // InternalRPG.g:4033:1: ( ( rule__Rule__OrAssignment_0_1 ) )
            // InternalRPG.g:4034:2: ( rule__Rule__OrAssignment_0_1 )
            {
             before(grammarAccess.getRuleAccess().getOrAssignment_0_1()); 
            // InternalRPG.g:4035:2: ( rule__Rule__OrAssignment_0_1 )
            // InternalRPG.g:4035:3: rule__Rule__OrAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__OrAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getOrAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_0__1__Impl"


    // $ANTLR start "rule__Rule__Group_0__2"
    // InternalRPG.g:4043:1: rule__Rule__Group_0__2 : rule__Rule__Group_0__2__Impl ;
    public final void rule__Rule__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4047:1: ( rule__Rule__Group_0__2__Impl )
            // InternalRPG.g:4048:2: rule__Rule__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_0__2__Impl();

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
    // $ANTLR end "rule__Rule__Group_0__2"


    // $ANTLR start "rule__Rule__Group_0__2__Impl"
    // InternalRPG.g:4054:1: rule__Rule__Group_0__2__Impl : ( 'then' ) ;
    public final void rule__Rule__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4058:1: ( ( 'then' ) )
            // InternalRPG.g:4059:1: ( 'then' )
            {
            // InternalRPG.g:4059:1: ( 'then' )
            // InternalRPG.g:4060:2: 'then'
            {
             before(grammarAccess.getRuleAccess().getThenKeyword_0_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getThenKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_0__2__Impl"


    // $ANTLR start "rule__AdditionalRule__Group__0"
    // InternalRPG.g:4070:1: rule__AdditionalRule__Group__0 : rule__AdditionalRule__Group__0__Impl rule__AdditionalRule__Group__1 ;
    public final void rule__AdditionalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4074:1: ( rule__AdditionalRule__Group__0__Impl rule__AdditionalRule__Group__1 )
            // InternalRPG.g:4075:2: rule__AdditionalRule__Group__0__Impl rule__AdditionalRule__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__AdditionalRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalRule__Group__1();

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
    // $ANTLR end "rule__AdditionalRule__Group__0"


    // $ANTLR start "rule__AdditionalRule__Group__0__Impl"
    // InternalRPG.g:4082:1: rule__AdditionalRule__Group__0__Impl : ( ( rule__AdditionalRule__TargetAssignment_0 ) ) ;
    public final void rule__AdditionalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4086:1: ( ( ( rule__AdditionalRule__TargetAssignment_0 ) ) )
            // InternalRPG.g:4087:1: ( ( rule__AdditionalRule__TargetAssignment_0 ) )
            {
            // InternalRPG.g:4087:1: ( ( rule__AdditionalRule__TargetAssignment_0 ) )
            // InternalRPG.g:4088:2: ( rule__AdditionalRule__TargetAssignment_0 )
            {
             before(grammarAccess.getAdditionalRuleAccess().getTargetAssignment_0()); 
            // InternalRPG.g:4089:2: ( rule__AdditionalRule__TargetAssignment_0 )
            // InternalRPG.g:4089:3: rule__AdditionalRule__TargetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalRule__TargetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalRuleAccess().getTargetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalRule__Group__0__Impl"


    // $ANTLR start "rule__AdditionalRule__Group__1"
    // InternalRPG.g:4097:1: rule__AdditionalRule__Group__1 : rule__AdditionalRule__Group__1__Impl rule__AdditionalRule__Group__2 ;
    public final void rule__AdditionalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4101:1: ( rule__AdditionalRule__Group__1__Impl rule__AdditionalRule__Group__2 )
            // InternalRPG.g:4102:2: rule__AdditionalRule__Group__1__Impl rule__AdditionalRule__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__AdditionalRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalRule__Group__2();

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
    // $ANTLR end "rule__AdditionalRule__Group__1"


    // $ANTLR start "rule__AdditionalRule__Group__1__Impl"
    // InternalRPG.g:4109:1: rule__AdditionalRule__Group__1__Impl : ( 'is' ) ;
    public final void rule__AdditionalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4113:1: ( ( 'is' ) )
            // InternalRPG.g:4114:1: ( 'is' )
            {
            // InternalRPG.g:4114:1: ( 'is' )
            // InternalRPG.g:4115:2: 'is'
            {
             before(grammarAccess.getAdditionalRuleAccess().getIsKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAdditionalRuleAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalRule__Group__1__Impl"


    // $ANTLR start "rule__AdditionalRule__Group__2"
    // InternalRPG.g:4124:1: rule__AdditionalRule__Group__2 : rule__AdditionalRule__Group__2__Impl rule__AdditionalRule__Group__3 ;
    public final void rule__AdditionalRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4128:1: ( rule__AdditionalRule__Group__2__Impl rule__AdditionalRule__Group__3 )
            // InternalRPG.g:4129:2: rule__AdditionalRule__Group__2__Impl rule__AdditionalRule__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__AdditionalRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalRule__Group__3();

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
    // $ANTLR end "rule__AdditionalRule__Group__2"


    // $ANTLR start "rule__AdditionalRule__Group__2__Impl"
    // InternalRPG.g:4136:1: rule__AdditionalRule__Group__2__Impl : ( ( rule__AdditionalRule__SumAssignment_2 ) ) ;
    public final void rule__AdditionalRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4140:1: ( ( ( rule__AdditionalRule__SumAssignment_2 ) ) )
            // InternalRPG.g:4141:1: ( ( rule__AdditionalRule__SumAssignment_2 ) )
            {
            // InternalRPG.g:4141:1: ( ( rule__AdditionalRule__SumAssignment_2 ) )
            // InternalRPG.g:4142:2: ( rule__AdditionalRule__SumAssignment_2 )
            {
             before(grammarAccess.getAdditionalRuleAccess().getSumAssignment_2()); 
            // InternalRPG.g:4143:2: ( rule__AdditionalRule__SumAssignment_2 )
            // InternalRPG.g:4143:3: rule__AdditionalRule__SumAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalRule__SumAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalRuleAccess().getSumAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalRule__Group__2__Impl"


    // $ANTLR start "rule__AdditionalRule__Group__3"
    // InternalRPG.g:4151:1: rule__AdditionalRule__Group__3 : rule__AdditionalRule__Group__3__Impl rule__AdditionalRule__Group__4 ;
    public final void rule__AdditionalRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4155:1: ( rule__AdditionalRule__Group__3__Impl rule__AdditionalRule__Group__4 )
            // InternalRPG.g:4156:2: rule__AdditionalRule__Group__3__Impl rule__AdditionalRule__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__AdditionalRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalRule__Group__4();

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
    // $ANTLR end "rule__AdditionalRule__Group__3"


    // $ANTLR start "rule__AdditionalRule__Group__3__Impl"
    // InternalRPG.g:4163:1: rule__AdditionalRule__Group__3__Impl : ( 'hits' ) ;
    public final void rule__AdditionalRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4167:1: ( ( 'hits' ) )
            // InternalRPG.g:4168:1: ( 'hits' )
            {
            // InternalRPG.g:4168:1: ( 'hits' )
            // InternalRPG.g:4169:2: 'hits'
            {
             before(grammarAccess.getAdditionalRuleAccess().getHitsKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAdditionalRuleAccess().getHitsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalRule__Group__3__Impl"


    // $ANTLR start "rule__AdditionalRule__Group__4"
    // InternalRPG.g:4178:1: rule__AdditionalRule__Group__4 : rule__AdditionalRule__Group__4__Impl ;
    public final void rule__AdditionalRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4182:1: ( rule__AdditionalRule__Group__4__Impl )
            // InternalRPG.g:4183:2: rule__AdditionalRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalRule__Group__4__Impl();

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
    // $ANTLR end "rule__AdditionalRule__Group__4"


    // $ANTLR start "rule__AdditionalRule__Group__4__Impl"
    // InternalRPG.g:4189:1: rule__AdditionalRule__Group__4__Impl : ( ( rule__AdditionalRule__Alternatives_4 ) ) ;
    public final void rule__AdditionalRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4193:1: ( ( ( rule__AdditionalRule__Alternatives_4 ) ) )
            // InternalRPG.g:4194:1: ( ( rule__AdditionalRule__Alternatives_4 ) )
            {
            // InternalRPG.g:4194:1: ( ( rule__AdditionalRule__Alternatives_4 ) )
            // InternalRPG.g:4195:2: ( rule__AdditionalRule__Alternatives_4 )
            {
             before(grammarAccess.getAdditionalRuleAccess().getAlternatives_4()); 
            // InternalRPG.g:4196:2: ( rule__AdditionalRule__Alternatives_4 )
            // InternalRPG.g:4196:3: rule__AdditionalRule__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalRule__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalRuleAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalRule__Group__4__Impl"


    // $ANTLR start "rule__AdditionalBuffRule__Group__0"
    // InternalRPG.g:4205:1: rule__AdditionalBuffRule__Group__0 : rule__AdditionalBuffRule__Group__0__Impl rule__AdditionalBuffRule__Group__1 ;
    public final void rule__AdditionalBuffRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4209:1: ( rule__AdditionalBuffRule__Group__0__Impl rule__AdditionalBuffRule__Group__1 )
            // InternalRPG.g:4210:2: rule__AdditionalBuffRule__Group__0__Impl rule__AdditionalBuffRule__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__AdditionalBuffRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalBuffRule__Group__1();

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
    // $ANTLR end "rule__AdditionalBuffRule__Group__0"


    // $ANTLR start "rule__AdditionalBuffRule__Group__0__Impl"
    // InternalRPG.g:4217:1: rule__AdditionalBuffRule__Group__0__Impl : ( ( rule__AdditionalBuffRule__TargetAssignment_0 ) ) ;
    public final void rule__AdditionalBuffRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4221:1: ( ( ( rule__AdditionalBuffRule__TargetAssignment_0 ) ) )
            // InternalRPG.g:4222:1: ( ( rule__AdditionalBuffRule__TargetAssignment_0 ) )
            {
            // InternalRPG.g:4222:1: ( ( rule__AdditionalBuffRule__TargetAssignment_0 ) )
            // InternalRPG.g:4223:2: ( rule__AdditionalBuffRule__TargetAssignment_0 )
            {
             before(grammarAccess.getAdditionalBuffRuleAccess().getTargetAssignment_0()); 
            // InternalRPG.g:4224:2: ( rule__AdditionalBuffRule__TargetAssignment_0 )
            // InternalRPG.g:4224:3: rule__AdditionalBuffRule__TargetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalBuffRule__TargetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalBuffRuleAccess().getTargetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalBuffRule__Group__0__Impl"


    // $ANTLR start "rule__AdditionalBuffRule__Group__1"
    // InternalRPG.g:4232:1: rule__AdditionalBuffRule__Group__1 : rule__AdditionalBuffRule__Group__1__Impl rule__AdditionalBuffRule__Group__2 ;
    public final void rule__AdditionalBuffRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4236:1: ( rule__AdditionalBuffRule__Group__1__Impl rule__AdditionalBuffRule__Group__2 )
            // InternalRPG.g:4237:2: rule__AdditionalBuffRule__Group__1__Impl rule__AdditionalBuffRule__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__AdditionalBuffRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalBuffRule__Group__2();

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
    // $ANTLR end "rule__AdditionalBuffRule__Group__1"


    // $ANTLR start "rule__AdditionalBuffRule__Group__1__Impl"
    // InternalRPG.g:4244:1: rule__AdditionalBuffRule__Group__1__Impl : ( 'is' ) ;
    public final void rule__AdditionalBuffRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4248:1: ( ( 'is' ) )
            // InternalRPG.g:4249:1: ( 'is' )
            {
            // InternalRPG.g:4249:1: ( 'is' )
            // InternalRPG.g:4250:2: 'is'
            {
             before(grammarAccess.getAdditionalBuffRuleAccess().getIsKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAdditionalBuffRuleAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalBuffRule__Group__1__Impl"


    // $ANTLR start "rule__AdditionalBuffRule__Group__2"
    // InternalRPG.g:4259:1: rule__AdditionalBuffRule__Group__2 : rule__AdditionalBuffRule__Group__2__Impl ;
    public final void rule__AdditionalBuffRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4263:1: ( rule__AdditionalBuffRule__Group__2__Impl )
            // InternalRPG.g:4264:2: rule__AdditionalBuffRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalBuffRule__Group__2__Impl();

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
    // $ANTLR end "rule__AdditionalBuffRule__Group__2"


    // $ANTLR start "rule__AdditionalBuffRule__Group__2__Impl"
    // InternalRPG.g:4270:1: rule__AdditionalBuffRule__Group__2__Impl : ( ( rule__AdditionalBuffRule__SumAssignment_2 ) ) ;
    public final void rule__AdditionalBuffRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4274:1: ( ( ( rule__AdditionalBuffRule__SumAssignment_2 ) ) )
            // InternalRPG.g:4275:1: ( ( rule__AdditionalBuffRule__SumAssignment_2 ) )
            {
            // InternalRPG.g:4275:1: ( ( rule__AdditionalBuffRule__SumAssignment_2 ) )
            // InternalRPG.g:4276:2: ( rule__AdditionalBuffRule__SumAssignment_2 )
            {
             before(grammarAccess.getAdditionalBuffRuleAccess().getSumAssignment_2()); 
            // InternalRPG.g:4277:2: ( rule__AdditionalBuffRule__SumAssignment_2 )
            // InternalRPG.g:4277:3: rule__AdditionalBuffRule__SumAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalBuffRule__SumAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalBuffRuleAccess().getSumAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalBuffRule__Group__2__Impl"


    // $ANTLR start "rule__Entities__Group__0"
    // InternalRPG.g:4286:1: rule__Entities__Group__0 : rule__Entities__Group__0__Impl rule__Entities__Group__1 ;
    public final void rule__Entities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4290:1: ( rule__Entities__Group__0__Impl rule__Entities__Group__1 )
            // InternalRPG.g:4291:2: rule__Entities__Group__0__Impl rule__Entities__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Entities__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entities__Group__1();

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
    // $ANTLR end "rule__Entities__Group__0"


    // $ANTLR start "rule__Entities__Group__0__Impl"
    // InternalRPG.g:4298:1: rule__Entities__Group__0__Impl : ( 'entities' ) ;
    public final void rule__Entities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4302:1: ( ( 'entities' ) )
            // InternalRPG.g:4303:1: ( 'entities' )
            {
            // InternalRPG.g:4303:1: ( 'entities' )
            // InternalRPG.g:4304:2: 'entities'
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEntitiesAccess().getEntitiesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__0__Impl"


    // $ANTLR start "rule__Entities__Group__1"
    // InternalRPG.g:4313:1: rule__Entities__Group__1 : rule__Entities__Group__1__Impl ;
    public final void rule__Entities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4317:1: ( rule__Entities__Group__1__Impl )
            // InternalRPG.g:4318:2: rule__Entities__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entities__Group__1__Impl();

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
    // $ANTLR end "rule__Entities__Group__1"


    // $ANTLR start "rule__Entities__Group__1__Impl"
    // InternalRPG.g:4324:1: rule__Entities__Group__1__Impl : ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) ) ;
    public final void rule__Entities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4328:1: ( ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) ) )
            // InternalRPG.g:4329:1: ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) )
            {
            // InternalRPG.g:4329:1: ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) )
            // InternalRPG.g:4330:2: ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* )
            {
            // InternalRPG.g:4330:2: ( ( rule__Entities__EntityAssignment_1 ) )
            // InternalRPG.g:4331:3: ( rule__Entities__EntityAssignment_1 )
            {
             before(grammarAccess.getEntitiesAccess().getEntityAssignment_1()); 
            // InternalRPG.g:4332:3: ( rule__Entities__EntityAssignment_1 )
            // InternalRPG.g:4332:4: rule__Entities__EntityAssignment_1
            {
            pushFollow(FOLLOW_40);
            rule__Entities__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getEntityAssignment_1()); 

            }

            // InternalRPG.g:4335:2: ( ( rule__Entities__EntityAssignment_1 )* )
            // InternalRPG.g:4336:3: ( rule__Entities__EntityAssignment_1 )*
            {
             before(grammarAccess.getEntitiesAccess().getEntityAssignment_1()); 
            // InternalRPG.g:4337:3: ( rule__Entities__EntityAssignment_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==39) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRPG.g:4337:4: rule__Entities__EntityAssignment_1
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Entities__EntityAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getEntitiesAccess().getEntityAssignment_1()); 

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
    // $ANTLR end "rule__Entities__Group__1__Impl"


    // $ANTLR start "rule__Death__Group__0"
    // InternalRPG.g:4347:1: rule__Death__Group__0 : rule__Death__Group__0__Impl rule__Death__Group__1 ;
    public final void rule__Death__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4351:1: ( rule__Death__Group__0__Impl rule__Death__Group__1 )
            // InternalRPG.g:4352:2: rule__Death__Group__0__Impl rule__Death__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Death__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Death__Group__1();

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
    // $ANTLR end "rule__Death__Group__0"


    // $ANTLR start "rule__Death__Group__0__Impl"
    // InternalRPG.g:4359:1: rule__Death__Group__0__Impl : ( 'death' ) ;
    public final void rule__Death__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4363:1: ( ( 'death' ) )
            // InternalRPG.g:4364:1: ( 'death' )
            {
            // InternalRPG.g:4364:1: ( 'death' )
            // InternalRPG.g:4365:2: 'death'
            {
             before(grammarAccess.getDeathAccess().getDeathKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDeathAccess().getDeathKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Death__Group__0__Impl"


    // $ANTLR start "rule__Death__Group__1"
    // InternalRPG.g:4374:1: rule__Death__Group__1 : rule__Death__Group__1__Impl ;
    public final void rule__Death__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4378:1: ( rule__Death__Group__1__Impl )
            // InternalRPG.g:4379:2: rule__Death__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Death__Group__1__Impl();

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
    // $ANTLR end "rule__Death__Group__1"


    // $ANTLR start "rule__Death__Group__1__Impl"
    // InternalRPG.g:4385:1: rule__Death__Group__1__Impl : ( ( rule__Death__ReqAssignment_1 ) ) ;
    public final void rule__Death__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4389:1: ( ( ( rule__Death__ReqAssignment_1 ) ) )
            // InternalRPG.g:4390:1: ( ( rule__Death__ReqAssignment_1 ) )
            {
            // InternalRPG.g:4390:1: ( ( rule__Death__ReqAssignment_1 ) )
            // InternalRPG.g:4391:2: ( rule__Death__ReqAssignment_1 )
            {
             before(grammarAccess.getDeathAccess().getReqAssignment_1()); 
            // InternalRPG.g:4392:2: ( rule__Death__ReqAssignment_1 )
            // InternalRPG.g:4392:3: rule__Death__ReqAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Death__ReqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeathAccess().getReqAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Death__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalRPG.g:4401:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4405:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalRPG.g:4406:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalRPG.g:4413:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4417:1: ( ( 'entity' ) )
            // InternalRPG.g:4418:1: ( 'entity' )
            {
            // InternalRPG.g:4418:1: ( 'entity' )
            // InternalRPG.g:4419:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalRPG.g:4428:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4432:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalRPG.g:4433:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalRPG.g:4440:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4444:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalRPG.g:4445:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalRPG.g:4445:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalRPG.g:4446:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalRPG.g:4447:2: ( rule__Entity__NameAssignment_1 )
            // InternalRPG.g:4447:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalRPG.g:4455:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4459:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalRPG.g:4460:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalRPG.g:4467:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4471:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalRPG.g:4472:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalRPG.g:4472:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalRPG.g:4473:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalRPG.g:4474:2: ( rule__Entity__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRPG.g:4474:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalRPG.g:4482:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4486:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalRPG.g:4487:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalRPG.g:4494:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__ETypeAssignment_3 ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4498:1: ( ( ( rule__Entity__ETypeAssignment_3 ) ) )
            // InternalRPG.g:4499:1: ( ( rule__Entity__ETypeAssignment_3 ) )
            {
            // InternalRPG.g:4499:1: ( ( rule__Entity__ETypeAssignment_3 ) )
            // InternalRPG.g:4500:2: ( rule__Entity__ETypeAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getETypeAssignment_3()); 
            // InternalRPG.g:4501:2: ( rule__Entity__ETypeAssignment_3 )
            // InternalRPG.g:4501:3: rule__Entity__ETypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ETypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getETypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalRPG.g:4509:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4513:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalRPG.g:4514:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalRPG.g:4521:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__AttAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4525:1: ( ( ( rule__Entity__AttAssignment_4 )* ) )
            // InternalRPG.g:4526:1: ( ( rule__Entity__AttAssignment_4 )* )
            {
            // InternalRPG.g:4526:1: ( ( rule__Entity__AttAssignment_4 )* )
            // InternalRPG.g:4527:2: ( rule__Entity__AttAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttAssignment_4()); 
            // InternalRPG.g:4528:2: ( rule__Entity__AttAssignment_4 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==21) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRPG.g:4528:3: rule__Entity__AttAssignment_4
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Entity__AttAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalRPG.g:4536:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4540:1: ( rule__Entity__Group__5__Impl )
            // InternalRPG.g:4541:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalRPG.g:4547:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__EMovesAssignment_5 ) ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4551:1: ( ( ( rule__Entity__EMovesAssignment_5 ) ) )
            // InternalRPG.g:4552:1: ( ( rule__Entity__EMovesAssignment_5 ) )
            {
            // InternalRPG.g:4552:1: ( ( rule__Entity__EMovesAssignment_5 ) )
            // InternalRPG.g:4553:2: ( rule__Entity__EMovesAssignment_5 )
            {
             before(grammarAccess.getEntityAccess().getEMovesAssignment_5()); 
            // InternalRPG.g:4554:2: ( rule__Entity__EMovesAssignment_5 )
            // InternalRPG.g:4554:3: rule__Entity__EMovesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Entity__EMovesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getEMovesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalRPG.g:4563:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4567:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalRPG.g:4568:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalRPG.g:4575:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4579:1: ( ( 'extends' ) )
            // InternalRPG.g:4580:1: ( 'extends' )
            {
            // InternalRPG.g:4580:1: ( 'extends' )
            // InternalRPG.g:4581:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalRPG.g:4590:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4594:1: ( rule__Entity__Group_2__1__Impl )
            // InternalRPG.g:4595:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalRPG.g:4601:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__ExtendAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4605:1: ( ( ( rule__Entity__ExtendAssignment_2_1 ) ) )
            // InternalRPG.g:4606:1: ( ( rule__Entity__ExtendAssignment_2_1 ) )
            {
            // InternalRPG.g:4606:1: ( ( rule__Entity__ExtendAssignment_2_1 ) )
            // InternalRPG.g:4607:2: ( rule__Entity__ExtendAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getExtendAssignment_2_1()); 
            // InternalRPG.g:4608:2: ( rule__Entity__ExtendAssignment_2_1 )
            // InternalRPG.g:4608:3: rule__Entity__ExtendAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ExtendAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getExtendAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__EntityMoves__Group__0"
    // InternalRPG.g:4617:1: rule__EntityMoves__Group__0 : rule__EntityMoves__Group__0__Impl rule__EntityMoves__Group__1 ;
    public final void rule__EntityMoves__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4621:1: ( rule__EntityMoves__Group__0__Impl rule__EntityMoves__Group__1 )
            // InternalRPG.g:4622:2: rule__EntityMoves__Group__0__Impl rule__EntityMoves__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EntityMoves__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMoves__Group__1();

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
    // $ANTLR end "rule__EntityMoves__Group__0"


    // $ANTLR start "rule__EntityMoves__Group__0__Impl"
    // InternalRPG.g:4629:1: rule__EntityMoves__Group__0__Impl : ( 'move' ) ;
    public final void rule__EntityMoves__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4633:1: ( ( 'move' ) )
            // InternalRPG.g:4634:1: ( 'move' )
            {
            // InternalRPG.g:4634:1: ( 'move' )
            // InternalRPG.g:4635:2: 'move'
            {
             before(grammarAccess.getEntityMovesAccess().getMoveKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityMovesAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoves__Group__0__Impl"


    // $ANTLR start "rule__EntityMoves__Group__1"
    // InternalRPG.g:4644:1: rule__EntityMoves__Group__1 : rule__EntityMoves__Group__1__Impl ;
    public final void rule__EntityMoves__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4648:1: ( rule__EntityMoves__Group__1__Impl )
            // InternalRPG.g:4649:2: rule__EntityMoves__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoves__Group__1__Impl();

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
    // $ANTLR end "rule__EntityMoves__Group__1"


    // $ANTLR start "rule__EntityMoves__Group__1__Impl"
    // InternalRPG.g:4655:1: rule__EntityMoves__Group__1__Impl : ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) ) ;
    public final void rule__EntityMoves__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4659:1: ( ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) ) )
            // InternalRPG.g:4660:1: ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) )
            {
            // InternalRPG.g:4660:1: ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) )
            // InternalRPG.g:4661:2: ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* )
            {
            // InternalRPG.g:4661:2: ( ( rule__EntityMoves__MoveAssignment_1 ) )
            // InternalRPG.g:4662:3: ( rule__EntityMoves__MoveAssignment_1 )
            {
             before(grammarAccess.getEntityMovesAccess().getMoveAssignment_1()); 
            // InternalRPG.g:4663:3: ( rule__EntityMoves__MoveAssignment_1 )
            // InternalRPG.g:4663:4: rule__EntityMoves__MoveAssignment_1
            {
            pushFollow(FOLLOW_15);
            rule__EntityMoves__MoveAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityMovesAccess().getMoveAssignment_1()); 

            }

            // InternalRPG.g:4666:2: ( ( rule__EntityMoves__MoveAssignment_1 )* )
            // InternalRPG.g:4667:3: ( rule__EntityMoves__MoveAssignment_1 )*
            {
             before(grammarAccess.getEntityMovesAccess().getMoveAssignment_1()); 
            // InternalRPG.g:4668:3: ( rule__EntityMoves__MoveAssignment_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalRPG.g:4668:4: rule__EntityMoves__MoveAssignment_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__EntityMoves__MoveAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getEntityMovesAccess().getMoveAssignment_1()); 

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
    // $ANTLR end "rule__EntityMoves__Group__1__Impl"


    // $ANTLR start "rule__Teams__Group__0"
    // InternalRPG.g:4678:1: rule__Teams__Group__0 : rule__Teams__Group__0__Impl rule__Teams__Group__1 ;
    public final void rule__Teams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4682:1: ( rule__Teams__Group__0__Impl rule__Teams__Group__1 )
            // InternalRPG.g:4683:2: rule__Teams__Group__0__Impl rule__Teams__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Teams__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teams__Group__1();

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
    // $ANTLR end "rule__Teams__Group__0"


    // $ANTLR start "rule__Teams__Group__0__Impl"
    // InternalRPG.g:4690:1: rule__Teams__Group__0__Impl : ( 'teams' ) ;
    public final void rule__Teams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4694:1: ( ( 'teams' ) )
            // InternalRPG.g:4695:1: ( 'teams' )
            {
            // InternalRPG.g:4695:1: ( 'teams' )
            // InternalRPG.g:4696:2: 'teams'
            {
             before(grammarAccess.getTeamsAccess().getTeamsKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTeamsAccess().getTeamsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teams__Group__0__Impl"


    // $ANTLR start "rule__Teams__Group__1"
    // InternalRPG.g:4705:1: rule__Teams__Group__1 : rule__Teams__Group__1__Impl ;
    public final void rule__Teams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4709:1: ( rule__Teams__Group__1__Impl )
            // InternalRPG.g:4710:2: rule__Teams__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teams__Group__1__Impl();

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
    // $ANTLR end "rule__Teams__Group__1"


    // $ANTLR start "rule__Teams__Group__1__Impl"
    // InternalRPG.g:4716:1: rule__Teams__Group__1__Impl : ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) ) ;
    public final void rule__Teams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4720:1: ( ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) ) )
            // InternalRPG.g:4721:1: ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) )
            {
            // InternalRPG.g:4721:1: ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) )
            // InternalRPG.g:4722:2: ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* )
            {
            // InternalRPG.g:4722:2: ( ( rule__Teams__TeamAssignment_1 ) )
            // InternalRPG.g:4723:3: ( rule__Teams__TeamAssignment_1 )
            {
             before(grammarAccess.getTeamsAccess().getTeamAssignment_1()); 
            // InternalRPG.g:4724:3: ( rule__Teams__TeamAssignment_1 )
            // InternalRPG.g:4724:4: rule__Teams__TeamAssignment_1
            {
            pushFollow(FOLLOW_45);
            rule__Teams__TeamAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTeamsAccess().getTeamAssignment_1()); 

            }

            // InternalRPG.g:4727:2: ( ( rule__Teams__TeamAssignment_1 )* )
            // InternalRPG.g:4728:3: ( rule__Teams__TeamAssignment_1 )*
            {
             before(grammarAccess.getTeamsAccess().getTeamAssignment_1()); 
            // InternalRPG.g:4729:3: ( rule__Teams__TeamAssignment_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==42) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRPG.g:4729:4: rule__Teams__TeamAssignment_1
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Teams__TeamAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getTeamsAccess().getTeamAssignment_1()); 

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
    // $ANTLR end "rule__Teams__Group__1__Impl"


    // $ANTLR start "rule__Team__Group__0"
    // InternalRPG.g:4739:1: rule__Team__Group__0 : rule__Team__Group__0__Impl rule__Team__Group__1 ;
    public final void rule__Team__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4743:1: ( rule__Team__Group__0__Impl rule__Team__Group__1 )
            // InternalRPG.g:4744:2: rule__Team__Group__0__Impl rule__Team__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Team__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__1();

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
    // $ANTLR end "rule__Team__Group__0"


    // $ANTLR start "rule__Team__Group__0__Impl"
    // InternalRPG.g:4751:1: rule__Team__Group__0__Impl : ( 'team' ) ;
    public final void rule__Team__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4755:1: ( ( 'team' ) )
            // InternalRPG.g:4756:1: ( 'team' )
            {
            // InternalRPG.g:4756:1: ( 'team' )
            // InternalRPG.g:4757:2: 'team'
            {
             before(grammarAccess.getTeamAccess().getTeamKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getTeamKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__0__Impl"


    // $ANTLR start "rule__Team__Group__1"
    // InternalRPG.g:4766:1: rule__Team__Group__1 : rule__Team__Group__1__Impl rule__Team__Group__2 ;
    public final void rule__Team__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4770:1: ( rule__Team__Group__1__Impl rule__Team__Group__2 )
            // InternalRPG.g:4771:2: rule__Team__Group__1__Impl rule__Team__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__Team__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__2();

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
    // $ANTLR end "rule__Team__Group__1"


    // $ANTLR start "rule__Team__Group__1__Impl"
    // InternalRPG.g:4778:1: rule__Team__Group__1__Impl : ( ( rule__Team__NameAssignment_1 ) ) ;
    public final void rule__Team__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4782:1: ( ( ( rule__Team__NameAssignment_1 ) ) )
            // InternalRPG.g:4783:1: ( ( rule__Team__NameAssignment_1 ) )
            {
            // InternalRPG.g:4783:1: ( ( rule__Team__NameAssignment_1 ) )
            // InternalRPG.g:4784:2: ( rule__Team__NameAssignment_1 )
            {
             before(grammarAccess.getTeamAccess().getNameAssignment_1()); 
            // InternalRPG.g:4785:2: ( rule__Team__NameAssignment_1 )
            // InternalRPG.g:4785:3: rule__Team__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Team__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__1__Impl"


    // $ANTLR start "rule__Team__Group__2"
    // InternalRPG.g:4793:1: rule__Team__Group__2 : rule__Team__Group__2__Impl ;
    public final void rule__Team__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4797:1: ( rule__Team__Group__2__Impl )
            // InternalRPG.g:4798:2: rule__Team__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group__2__Impl();

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
    // $ANTLR end "rule__Team__Group__2"


    // $ANTLR start "rule__Team__Group__2__Impl"
    // InternalRPG.g:4804:1: rule__Team__Group__2__Impl : ( ( rule__Team__MembersAssignment_2 ) ) ;
    public final void rule__Team__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4808:1: ( ( ( rule__Team__MembersAssignment_2 ) ) )
            // InternalRPG.g:4809:1: ( ( rule__Team__MembersAssignment_2 ) )
            {
            // InternalRPG.g:4809:1: ( ( rule__Team__MembersAssignment_2 ) )
            // InternalRPG.g:4810:2: ( rule__Team__MembersAssignment_2 )
            {
             before(grammarAccess.getTeamAccess().getMembersAssignment_2()); 
            // InternalRPG.g:4811:2: ( rule__Team__MembersAssignment_2 )
            // InternalRPG.g:4811:3: rule__Team__MembersAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Team__MembersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getMembersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__2__Impl"


    // $ANTLR start "rule__Members__Group__0"
    // InternalRPG.g:4820:1: rule__Members__Group__0 : rule__Members__Group__0__Impl rule__Members__Group__1 ;
    public final void rule__Members__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4824:1: ( rule__Members__Group__0__Impl rule__Members__Group__1 )
            // InternalRPG.g:4825:2: rule__Members__Group__0__Impl rule__Members__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Members__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Members__Group__1();

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
    // $ANTLR end "rule__Members__Group__0"


    // $ANTLR start "rule__Members__Group__0__Impl"
    // InternalRPG.g:4832:1: rule__Members__Group__0__Impl : ( 'members' ) ;
    public final void rule__Members__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4836:1: ( ( 'members' ) )
            // InternalRPG.g:4837:1: ( 'members' )
            {
            // InternalRPG.g:4837:1: ( 'members' )
            // InternalRPG.g:4838:2: 'members'
            {
             before(grammarAccess.getMembersAccess().getMembersKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMembersAccess().getMembersKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Members__Group__0__Impl"


    // $ANTLR start "rule__Members__Group__1"
    // InternalRPG.g:4847:1: rule__Members__Group__1 : rule__Members__Group__1__Impl ;
    public final void rule__Members__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4851:1: ( rule__Members__Group__1__Impl )
            // InternalRPG.g:4852:2: rule__Members__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Members__Group__1__Impl();

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
    // $ANTLR end "rule__Members__Group__1"


    // $ANTLR start "rule__Members__Group__1__Impl"
    // InternalRPG.g:4858:1: rule__Members__Group__1__Impl : ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) ) ;
    public final void rule__Members__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4862:1: ( ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) ) )
            // InternalRPG.g:4863:1: ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) )
            {
            // InternalRPG.g:4863:1: ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) )
            // InternalRPG.g:4864:2: ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* )
            {
            // InternalRPG.g:4864:2: ( ( rule__Members__EntityAssignment_1 ) )
            // InternalRPG.g:4865:3: ( rule__Members__EntityAssignment_1 )
            {
             before(grammarAccess.getMembersAccess().getEntityAssignment_1()); 
            // InternalRPG.g:4866:3: ( rule__Members__EntityAssignment_1 )
            // InternalRPG.g:4866:4: rule__Members__EntityAssignment_1
            {
            pushFollow(FOLLOW_15);
            rule__Members__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMembersAccess().getEntityAssignment_1()); 

            }

            // InternalRPG.g:4869:2: ( ( rule__Members__EntityAssignment_1 )* )
            // InternalRPG.g:4870:3: ( rule__Members__EntityAssignment_1 )*
            {
             before(grammarAccess.getMembersAccess().getEntityAssignment_1()); 
            // InternalRPG.g:4871:3: ( rule__Members__EntityAssignment_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRPG.g:4871:4: rule__Members__EntityAssignment_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Members__EntityAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getMembersAccess().getEntityAssignment_1()); 

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
    // $ANTLR end "rule__Members__Group__1__Impl"


    // $ANTLR start "rule__Require__Group__0"
    // InternalRPG.g:4881:1: rule__Require__Group__0 : rule__Require__Group__0__Impl rule__Require__Group__1 ;
    public final void rule__Require__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4885:1: ( rule__Require__Group__0__Impl rule__Require__Group__1 )
            // InternalRPG.g:4886:2: rule__Require__Group__0__Impl rule__Require__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Require__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Require__Group__1();

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
    // $ANTLR end "rule__Require__Group__0"


    // $ANTLR start "rule__Require__Group__0__Impl"
    // InternalRPG.g:4893:1: rule__Require__Group__0__Impl : ( 'require' ) ;
    public final void rule__Require__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4897:1: ( ( 'require' ) )
            // InternalRPG.g:4898:1: ( 'require' )
            {
            // InternalRPG.g:4898:1: ( 'require' )
            // InternalRPG.g:4899:2: 'require'
            {
             before(grammarAccess.getRequireAccess().getRequireKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRequireAccess().getRequireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__0__Impl"


    // $ANTLR start "rule__Require__Group__1"
    // InternalRPG.g:4908:1: rule__Require__Group__1 : rule__Require__Group__1__Impl ;
    public final void rule__Require__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4912:1: ( rule__Require__Group__1__Impl )
            // InternalRPG.g:4913:2: rule__Require__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Require__Group__1__Impl();

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
    // $ANTLR end "rule__Require__Group__1"


    // $ANTLR start "rule__Require__Group__1__Impl"
    // InternalRPG.g:4919:1: rule__Require__Group__1__Impl : ( ( rule__Require__LogAssignment_1 ) ) ;
    public final void rule__Require__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4923:1: ( ( ( rule__Require__LogAssignment_1 ) ) )
            // InternalRPG.g:4924:1: ( ( rule__Require__LogAssignment_1 ) )
            {
            // InternalRPG.g:4924:1: ( ( rule__Require__LogAssignment_1 ) )
            // InternalRPG.g:4925:2: ( rule__Require__LogAssignment_1 )
            {
             before(grammarAccess.getRequireAccess().getLogAssignment_1()); 
            // InternalRPG.g:4926:2: ( rule__Require__LogAssignment_1 )
            // InternalRPG.g:4926:3: rule__Require__LogAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Require__LogAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequireAccess().getLogAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__1__Impl"


    // $ANTLR start "rule__ORcondition__Group__0"
    // InternalRPG.g:4935:1: rule__ORcondition__Group__0 : rule__ORcondition__Group__0__Impl rule__ORcondition__Group__1 ;
    public final void rule__ORcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4939:1: ( rule__ORcondition__Group__0__Impl rule__ORcondition__Group__1 )
            // InternalRPG.g:4940:2: rule__ORcondition__Group__0__Impl rule__ORcondition__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__ORcondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORcondition__Group__1();

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
    // $ANTLR end "rule__ORcondition__Group__0"


    // $ANTLR start "rule__ORcondition__Group__0__Impl"
    // InternalRPG.g:4947:1: rule__ORcondition__Group__0__Impl : ( ruleANDcondition ) ;
    public final void rule__ORcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4951:1: ( ( ruleANDcondition ) )
            // InternalRPG.g:4952:1: ( ruleANDcondition )
            {
            // InternalRPG.g:4952:1: ( ruleANDcondition )
            // InternalRPG.g:4953:2: ruleANDcondition
            {
             before(grammarAccess.getORconditionAccess().getANDconditionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleANDcondition();

            state._fsp--;

             after(grammarAccess.getORconditionAccess().getANDconditionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group__0__Impl"


    // $ANTLR start "rule__ORcondition__Group__1"
    // InternalRPG.g:4962:1: rule__ORcondition__Group__1 : rule__ORcondition__Group__1__Impl ;
    public final void rule__ORcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4966:1: ( rule__ORcondition__Group__1__Impl )
            // InternalRPG.g:4967:2: rule__ORcondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ORcondition__Group__1__Impl();

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
    // $ANTLR end "rule__ORcondition__Group__1"


    // $ANTLR start "rule__ORcondition__Group__1__Impl"
    // InternalRPG.g:4973:1: rule__ORcondition__Group__1__Impl : ( ( rule__ORcondition__Group_1__0 )* ) ;
    public final void rule__ORcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4977:1: ( ( ( rule__ORcondition__Group_1__0 )* ) )
            // InternalRPG.g:4978:1: ( ( rule__ORcondition__Group_1__0 )* )
            {
            // InternalRPG.g:4978:1: ( ( rule__ORcondition__Group_1__0 )* )
            // InternalRPG.g:4979:2: ( rule__ORcondition__Group_1__0 )*
            {
             before(grammarAccess.getORconditionAccess().getGroup_1()); 
            // InternalRPG.g:4980:2: ( rule__ORcondition__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==45) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalRPG.g:4980:3: rule__ORcondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__ORcondition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getORconditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group__1__Impl"


    // $ANTLR start "rule__ORcondition__Group_1__0"
    // InternalRPG.g:4989:1: rule__ORcondition__Group_1__0 : rule__ORcondition__Group_1__0__Impl rule__ORcondition__Group_1__1 ;
    public final void rule__ORcondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:4993:1: ( rule__ORcondition__Group_1__0__Impl rule__ORcondition__Group_1__1 )
            // InternalRPG.g:4994:2: rule__ORcondition__Group_1__0__Impl rule__ORcondition__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__ORcondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORcondition__Group_1__1();

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
    // $ANTLR end "rule__ORcondition__Group_1__0"


    // $ANTLR start "rule__ORcondition__Group_1__0__Impl"
    // InternalRPG.g:5001:1: rule__ORcondition__Group_1__0__Impl : ( 'OR' ) ;
    public final void rule__ORcondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5005:1: ( ( 'OR' ) )
            // InternalRPG.g:5006:1: ( 'OR' )
            {
            // InternalRPG.g:5006:1: ( 'OR' )
            // InternalRPG.g:5007:2: 'OR'
            {
             before(grammarAccess.getORconditionAccess().getORKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getORconditionAccess().getORKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group_1__0__Impl"


    // $ANTLR start "rule__ORcondition__Group_1__1"
    // InternalRPG.g:5016:1: rule__ORcondition__Group_1__1 : rule__ORcondition__Group_1__1__Impl rule__ORcondition__Group_1__2 ;
    public final void rule__ORcondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5020:1: ( rule__ORcondition__Group_1__1__Impl rule__ORcondition__Group_1__2 )
            // InternalRPG.g:5021:2: rule__ORcondition__Group_1__1__Impl rule__ORcondition__Group_1__2
            {
            pushFollow(FOLLOW_35);
            rule__ORcondition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORcondition__Group_1__2();

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
    // $ANTLR end "rule__ORcondition__Group_1__1"


    // $ANTLR start "rule__ORcondition__Group_1__1__Impl"
    // InternalRPG.g:5028:1: rule__ORcondition__Group_1__1__Impl : ( () ) ;
    public final void rule__ORcondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5032:1: ( ( () ) )
            // InternalRPG.g:5033:1: ( () )
            {
            // InternalRPG.g:5033:1: ( () )
            // InternalRPG.g:5034:2: ()
            {
             before(grammarAccess.getORconditionAccess().getOrLeftAction_1_1()); 
            // InternalRPG.g:5035:2: ()
            // InternalRPG.g:5035:3: 
            {
            }

             after(grammarAccess.getORconditionAccess().getOrLeftAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group_1__1__Impl"


    // $ANTLR start "rule__ORcondition__Group_1__2"
    // InternalRPG.g:5043:1: rule__ORcondition__Group_1__2 : rule__ORcondition__Group_1__2__Impl ;
    public final void rule__ORcondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5047:1: ( rule__ORcondition__Group_1__2__Impl )
            // InternalRPG.g:5048:2: rule__ORcondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ORcondition__Group_1__2__Impl();

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
    // $ANTLR end "rule__ORcondition__Group_1__2"


    // $ANTLR start "rule__ORcondition__Group_1__2__Impl"
    // InternalRPG.g:5054:1: rule__ORcondition__Group_1__2__Impl : ( ( rule__ORcondition__RightAssignment_1_2 ) ) ;
    public final void rule__ORcondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5058:1: ( ( ( rule__ORcondition__RightAssignment_1_2 ) ) )
            // InternalRPG.g:5059:1: ( ( rule__ORcondition__RightAssignment_1_2 ) )
            {
            // InternalRPG.g:5059:1: ( ( rule__ORcondition__RightAssignment_1_2 ) )
            // InternalRPG.g:5060:2: ( rule__ORcondition__RightAssignment_1_2 )
            {
             before(grammarAccess.getORconditionAccess().getRightAssignment_1_2()); 
            // InternalRPG.g:5061:2: ( rule__ORcondition__RightAssignment_1_2 )
            // InternalRPG.g:5061:3: rule__ORcondition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ORcondition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getORconditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group_1__2__Impl"


    // $ANTLR start "rule__ANDcondition__Group__0"
    // InternalRPG.g:5070:1: rule__ANDcondition__Group__0 : rule__ANDcondition__Group__0__Impl rule__ANDcondition__Group__1 ;
    public final void rule__ANDcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5074:1: ( rule__ANDcondition__Group__0__Impl rule__ANDcondition__Group__1 )
            // InternalRPG.g:5075:2: rule__ANDcondition__Group__0__Impl rule__ANDcondition__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__ANDcondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group__1();

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
    // $ANTLR end "rule__ANDcondition__Group__0"


    // $ANTLR start "rule__ANDcondition__Group__0__Impl"
    // InternalRPG.g:5082:1: rule__ANDcondition__Group__0__Impl : ( ruleStatement ) ;
    public final void rule__ANDcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5086:1: ( ( ruleStatement ) )
            // InternalRPG.g:5087:1: ( ruleStatement )
            {
            // InternalRPG.g:5087:1: ( ruleStatement )
            // InternalRPG.g:5088:2: ruleStatement
            {
             before(grammarAccess.getANDconditionAccess().getStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getANDconditionAccess().getStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group__0__Impl"


    // $ANTLR start "rule__ANDcondition__Group__1"
    // InternalRPG.g:5097:1: rule__ANDcondition__Group__1 : rule__ANDcondition__Group__1__Impl ;
    public final void rule__ANDcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5101:1: ( rule__ANDcondition__Group__1__Impl )
            // InternalRPG.g:5102:2: rule__ANDcondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group__1__Impl();

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
    // $ANTLR end "rule__ANDcondition__Group__1"


    // $ANTLR start "rule__ANDcondition__Group__1__Impl"
    // InternalRPG.g:5108:1: rule__ANDcondition__Group__1__Impl : ( ( rule__ANDcondition__Group_1__0 )* ) ;
    public final void rule__ANDcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5112:1: ( ( ( rule__ANDcondition__Group_1__0 )* ) )
            // InternalRPG.g:5113:1: ( ( rule__ANDcondition__Group_1__0 )* )
            {
            // InternalRPG.g:5113:1: ( ( rule__ANDcondition__Group_1__0 )* )
            // InternalRPG.g:5114:2: ( rule__ANDcondition__Group_1__0 )*
            {
             before(grammarAccess.getANDconditionAccess().getGroup_1()); 
            // InternalRPG.g:5115:2: ( rule__ANDcondition__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==46) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalRPG.g:5115:3: rule__ANDcondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__ANDcondition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getANDconditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group__1__Impl"


    // $ANTLR start "rule__ANDcondition__Group_1__0"
    // InternalRPG.g:5124:1: rule__ANDcondition__Group_1__0 : rule__ANDcondition__Group_1__0__Impl rule__ANDcondition__Group_1__1 ;
    public final void rule__ANDcondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5128:1: ( rule__ANDcondition__Group_1__0__Impl rule__ANDcondition__Group_1__1 )
            // InternalRPG.g:5129:2: rule__ANDcondition__Group_1__0__Impl rule__ANDcondition__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__ANDcondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group_1__1();

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
    // $ANTLR end "rule__ANDcondition__Group_1__0"


    // $ANTLR start "rule__ANDcondition__Group_1__0__Impl"
    // InternalRPG.g:5136:1: rule__ANDcondition__Group_1__0__Impl : ( 'AND' ) ;
    public final void rule__ANDcondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5140:1: ( ( 'AND' ) )
            // InternalRPG.g:5141:1: ( 'AND' )
            {
            // InternalRPG.g:5141:1: ( 'AND' )
            // InternalRPG.g:5142:2: 'AND'
            {
             before(grammarAccess.getANDconditionAccess().getANDKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getANDconditionAccess().getANDKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group_1__0__Impl"


    // $ANTLR start "rule__ANDcondition__Group_1__1"
    // InternalRPG.g:5151:1: rule__ANDcondition__Group_1__1 : rule__ANDcondition__Group_1__1__Impl rule__ANDcondition__Group_1__2 ;
    public final void rule__ANDcondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5155:1: ( rule__ANDcondition__Group_1__1__Impl rule__ANDcondition__Group_1__2 )
            // InternalRPG.g:5156:2: rule__ANDcondition__Group_1__1__Impl rule__ANDcondition__Group_1__2
            {
            pushFollow(FOLLOW_35);
            rule__ANDcondition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group_1__2();

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
    // $ANTLR end "rule__ANDcondition__Group_1__1"


    // $ANTLR start "rule__ANDcondition__Group_1__1__Impl"
    // InternalRPG.g:5163:1: rule__ANDcondition__Group_1__1__Impl : ( () ) ;
    public final void rule__ANDcondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5167:1: ( ( () ) )
            // InternalRPG.g:5168:1: ( () )
            {
            // InternalRPG.g:5168:1: ( () )
            // InternalRPG.g:5169:2: ()
            {
             before(grammarAccess.getANDconditionAccess().getAndLeftAction_1_1()); 
            // InternalRPG.g:5170:2: ()
            // InternalRPG.g:5170:3: 
            {
            }

             after(grammarAccess.getANDconditionAccess().getAndLeftAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group_1__1__Impl"


    // $ANTLR start "rule__ANDcondition__Group_1__2"
    // InternalRPG.g:5178:1: rule__ANDcondition__Group_1__2 : rule__ANDcondition__Group_1__2__Impl ;
    public final void rule__ANDcondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5182:1: ( rule__ANDcondition__Group_1__2__Impl )
            // InternalRPG.g:5183:2: rule__ANDcondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group_1__2__Impl();

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
    // $ANTLR end "rule__ANDcondition__Group_1__2"


    // $ANTLR start "rule__ANDcondition__Group_1__2__Impl"
    // InternalRPG.g:5189:1: rule__ANDcondition__Group_1__2__Impl : ( ( rule__ANDcondition__RightAssignment_1_2 ) ) ;
    public final void rule__ANDcondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5193:1: ( ( ( rule__ANDcondition__RightAssignment_1_2 ) ) )
            // InternalRPG.g:5194:1: ( ( rule__ANDcondition__RightAssignment_1_2 ) )
            {
            // InternalRPG.g:5194:1: ( ( rule__ANDcondition__RightAssignment_1_2 ) )
            // InternalRPG.g:5195:2: ( rule__ANDcondition__RightAssignment_1_2 )
            {
             before(grammarAccess.getANDconditionAccess().getRightAssignment_1_2()); 
            // InternalRPG.g:5196:2: ( rule__ANDcondition__RightAssignment_1_2 )
            // InternalRPG.g:5196:3: rule__ANDcondition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ANDcondition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getANDconditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group_1__2__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // InternalRPG.g:5205:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5209:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalRPG.g:5210:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1();

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
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // InternalRPG.g:5217:1: rule__Statement__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5221:1: ( ( '(' ) )
            // InternalRPG.g:5222:1: ( '(' )
            {
            // InternalRPG.g:5222:1: ( '(' )
            // InternalRPG.g:5223:2: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // InternalRPG.g:5232:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5236:1: ( rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 )
            // InternalRPG.g:5237:2: rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2
            {
            pushFollow(FOLLOW_51);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__2();

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
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // InternalRPG.g:5244:1: rule__Statement__Group_1__1__Impl : ( ruleORcondition ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5248:1: ( ( ruleORcondition ) )
            // InternalRPG.g:5249:1: ( ruleORcondition )
            {
            // InternalRPG.g:5249:1: ( ruleORcondition )
            // InternalRPG.g:5250:2: ruleORcondition
            {
             before(grammarAccess.getStatementAccess().getORconditionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleORcondition();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getORconditionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__2"
    // InternalRPG.g:5259:1: rule__Statement__Group_1__2 : rule__Statement__Group_1__2__Impl ;
    public final void rule__Statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5263:1: ( rule__Statement__Group_1__2__Impl )
            // InternalRPG.g:5264:2: rule__Statement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__2__Impl();

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
    // $ANTLR end "rule__Statement__Group_1__2"


    // $ANTLR start "rule__Statement__Group_1__2__Impl"
    // InternalRPG.g:5270:1: rule__Statement__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5274:1: ( ( ')' ) )
            // InternalRPG.g:5275:1: ( ')' )
            {
            // InternalRPG.g:5275:1: ( ')' )
            // InternalRPG.g:5276:2: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__2__Impl"


    // $ANTLR start "rule__NumberComparing__Group__0"
    // InternalRPG.g:5286:1: rule__NumberComparing__Group__0 : rule__NumberComparing__Group__0__Impl rule__NumberComparing__Group__1 ;
    public final void rule__NumberComparing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5290:1: ( rule__NumberComparing__Group__0__Impl rule__NumberComparing__Group__1 )
            // InternalRPG.g:5291:2: rule__NumberComparing__Group__0__Impl rule__NumberComparing__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__NumberComparing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberComparing__Group__1();

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
    // $ANTLR end "rule__NumberComparing__Group__0"


    // $ANTLR start "rule__NumberComparing__Group__0__Impl"
    // InternalRPG.g:5298:1: rule__NumberComparing__Group__0__Impl : ( ( rule__NumberComparing__LeftAssignment_0 ) ) ;
    public final void rule__NumberComparing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5302:1: ( ( ( rule__NumberComparing__LeftAssignment_0 ) ) )
            // InternalRPG.g:5303:1: ( ( rule__NumberComparing__LeftAssignment_0 ) )
            {
            // InternalRPG.g:5303:1: ( ( rule__NumberComparing__LeftAssignment_0 ) )
            // InternalRPG.g:5304:2: ( rule__NumberComparing__LeftAssignment_0 )
            {
             before(grammarAccess.getNumberComparingAccess().getLeftAssignment_0()); 
            // InternalRPG.g:5305:2: ( rule__NumberComparing__LeftAssignment_0 )
            // InternalRPG.g:5305:3: rule__NumberComparing__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NumberComparing__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberComparingAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberComparing__Group__0__Impl"


    // $ANTLR start "rule__NumberComparing__Group__1"
    // InternalRPG.g:5313:1: rule__NumberComparing__Group__1 : rule__NumberComparing__Group__1__Impl rule__NumberComparing__Group__2 ;
    public final void rule__NumberComparing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5317:1: ( rule__NumberComparing__Group__1__Impl rule__NumberComparing__Group__2 )
            // InternalRPG.g:5318:2: rule__NumberComparing__Group__1__Impl rule__NumberComparing__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__NumberComparing__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberComparing__Group__2();

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
    // $ANTLR end "rule__NumberComparing__Group__1"


    // $ANTLR start "rule__NumberComparing__Group__1__Impl"
    // InternalRPG.g:5325:1: rule__NumberComparing__Group__1__Impl : ( ( rule__NumberComparing__CompAssignment_1 ) ) ;
    public final void rule__NumberComparing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5329:1: ( ( ( rule__NumberComparing__CompAssignment_1 ) ) )
            // InternalRPG.g:5330:1: ( ( rule__NumberComparing__CompAssignment_1 ) )
            {
            // InternalRPG.g:5330:1: ( ( rule__NumberComparing__CompAssignment_1 ) )
            // InternalRPG.g:5331:2: ( rule__NumberComparing__CompAssignment_1 )
            {
             before(grammarAccess.getNumberComparingAccess().getCompAssignment_1()); 
            // InternalRPG.g:5332:2: ( rule__NumberComparing__CompAssignment_1 )
            // InternalRPG.g:5332:3: rule__NumberComparing__CompAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NumberComparing__CompAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberComparingAccess().getCompAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberComparing__Group__1__Impl"


    // $ANTLR start "rule__NumberComparing__Group__2"
    // InternalRPG.g:5340:1: rule__NumberComparing__Group__2 : rule__NumberComparing__Group__2__Impl ;
    public final void rule__NumberComparing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5344:1: ( rule__NumberComparing__Group__2__Impl )
            // InternalRPG.g:5345:2: rule__NumberComparing__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberComparing__Group__2__Impl();

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
    // $ANTLR end "rule__NumberComparing__Group__2"


    // $ANTLR start "rule__NumberComparing__Group__2__Impl"
    // InternalRPG.g:5351:1: rule__NumberComparing__Group__2__Impl : ( ( rule__NumberComparing__RightAssignment_2 ) ) ;
    public final void rule__NumberComparing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5355:1: ( ( ( rule__NumberComparing__RightAssignment_2 ) ) )
            // InternalRPG.g:5356:1: ( ( rule__NumberComparing__RightAssignment_2 ) )
            {
            // InternalRPG.g:5356:1: ( ( rule__NumberComparing__RightAssignment_2 ) )
            // InternalRPG.g:5357:2: ( rule__NumberComparing__RightAssignment_2 )
            {
             before(grammarAccess.getNumberComparingAccess().getRightAssignment_2()); 
            // InternalRPG.g:5358:2: ( rule__NumberComparing__RightAssignment_2 )
            // InternalRPG.g:5358:3: rule__NumberComparing__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NumberComparing__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNumberComparingAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberComparing__Group__2__Impl"


    // $ANTLR start "rule__Comparator__Group_0__0"
    // InternalRPG.g:5367:1: rule__Comparator__Group_0__0 : rule__Comparator__Group_0__0__Impl rule__Comparator__Group_0__1 ;
    public final void rule__Comparator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5371:1: ( rule__Comparator__Group_0__0__Impl rule__Comparator__Group_0__1 )
            // InternalRPG.g:5372:2: rule__Comparator__Group_0__0__Impl rule__Comparator__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__Comparator__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_0__1();

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
    // $ANTLR end "rule__Comparator__Group_0__0"


    // $ANTLR start "rule__Comparator__Group_0__0__Impl"
    // InternalRPG.g:5379:1: rule__Comparator__Group_0__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5383:1: ( ( () ) )
            // InternalRPG.g:5384:1: ( () )
            {
            // InternalRPG.g:5384:1: ( () )
            // InternalRPG.g:5385:2: ()
            {
             before(grammarAccess.getComparatorAccess().getSmallerAction_0_0()); 
            // InternalRPG.g:5386:2: ()
            // InternalRPG.g:5386:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getSmallerAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_0__0__Impl"


    // $ANTLR start "rule__Comparator__Group_0__1"
    // InternalRPG.g:5394:1: rule__Comparator__Group_0__1 : rule__Comparator__Group_0__1__Impl ;
    public final void rule__Comparator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5398:1: ( rule__Comparator__Group_0__1__Impl )
            // InternalRPG.g:5399:2: rule__Comparator__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_0__1__Impl();

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
    // $ANTLR end "rule__Comparator__Group_0__1"


    // $ANTLR start "rule__Comparator__Group_0__1__Impl"
    // InternalRPG.g:5405:1: rule__Comparator__Group_0__1__Impl : ( '<' ) ;
    public final void rule__Comparator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5409:1: ( ( '<' ) )
            // InternalRPG.g:5410:1: ( '<' )
            {
            // InternalRPG.g:5410:1: ( '<' )
            // InternalRPG.g:5411:2: '<'
            {
             before(grammarAccess.getComparatorAccess().getLessThanSignKeyword_0_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getLessThanSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_0__1__Impl"


    // $ANTLR start "rule__Comparator__Group_1__0"
    // InternalRPG.g:5421:1: rule__Comparator__Group_1__0 : rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 ;
    public final void rule__Comparator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5425:1: ( rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 )
            // InternalRPG.g:5426:2: rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1
            {
            pushFollow(FOLLOW_53);
            rule__Comparator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_1__1();

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
    // $ANTLR end "rule__Comparator__Group_1__0"


    // $ANTLR start "rule__Comparator__Group_1__0__Impl"
    // InternalRPG.g:5433:1: rule__Comparator__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5437:1: ( ( () ) )
            // InternalRPG.g:5438:1: ( () )
            {
            // InternalRPG.g:5438:1: ( () )
            // InternalRPG.g:5439:2: ()
            {
             before(grammarAccess.getComparatorAccess().getSmallerEqAction_1_0()); 
            // InternalRPG.g:5440:2: ()
            // InternalRPG.g:5440:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getSmallerEqAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_1__0__Impl"


    // $ANTLR start "rule__Comparator__Group_1__1"
    // InternalRPG.g:5448:1: rule__Comparator__Group_1__1 : rule__Comparator__Group_1__1__Impl ;
    public final void rule__Comparator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5452:1: ( rule__Comparator__Group_1__1__Impl )
            // InternalRPG.g:5453:2: rule__Comparator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_1__1__Impl();

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
    // $ANTLR end "rule__Comparator__Group_1__1"


    // $ANTLR start "rule__Comparator__Group_1__1__Impl"
    // InternalRPG.g:5459:1: rule__Comparator__Group_1__1__Impl : ( '<=' ) ;
    public final void rule__Comparator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5463:1: ( ( '<=' ) )
            // InternalRPG.g:5464:1: ( '<=' )
            {
            // InternalRPG.g:5464:1: ( '<=' )
            // InternalRPG.g:5465:2: '<='
            {
             before(grammarAccess.getComparatorAccess().getLessThanSignEqualsSignKeyword_1_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getLessThanSignEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_1__1__Impl"


    // $ANTLR start "rule__Comparator__Group_2__0"
    // InternalRPG.g:5475:1: rule__Comparator__Group_2__0 : rule__Comparator__Group_2__0__Impl rule__Comparator__Group_2__1 ;
    public final void rule__Comparator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5479:1: ( rule__Comparator__Group_2__0__Impl rule__Comparator__Group_2__1 )
            // InternalRPG.g:5480:2: rule__Comparator__Group_2__0__Impl rule__Comparator__Group_2__1
            {
            pushFollow(FOLLOW_54);
            rule__Comparator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_2__1();

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
    // $ANTLR end "rule__Comparator__Group_2__0"


    // $ANTLR start "rule__Comparator__Group_2__0__Impl"
    // InternalRPG.g:5487:1: rule__Comparator__Group_2__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5491:1: ( ( () ) )
            // InternalRPG.g:5492:1: ( () )
            {
            // InternalRPG.g:5492:1: ( () )
            // InternalRPG.g:5493:2: ()
            {
             before(grammarAccess.getComparatorAccess().getEqAction_2_0()); 
            // InternalRPG.g:5494:2: ()
            // InternalRPG.g:5494:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getEqAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_2__0__Impl"


    // $ANTLR start "rule__Comparator__Group_2__1"
    // InternalRPG.g:5502:1: rule__Comparator__Group_2__1 : rule__Comparator__Group_2__1__Impl ;
    public final void rule__Comparator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5506:1: ( rule__Comparator__Group_2__1__Impl )
            // InternalRPG.g:5507:2: rule__Comparator__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_2__1__Impl();

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
    // $ANTLR end "rule__Comparator__Group_2__1"


    // $ANTLR start "rule__Comparator__Group_2__1__Impl"
    // InternalRPG.g:5513:1: rule__Comparator__Group_2__1__Impl : ( '==' ) ;
    public final void rule__Comparator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5517:1: ( ( '==' ) )
            // InternalRPG.g:5518:1: ( '==' )
            {
            // InternalRPG.g:5518:1: ( '==' )
            // InternalRPG.g:5519:2: '=='
            {
             before(grammarAccess.getComparatorAccess().getEqualsSignEqualsSignKeyword_2_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getEqualsSignEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_2__1__Impl"


    // $ANTLR start "rule__Comparator__Group_3__0"
    // InternalRPG.g:5529:1: rule__Comparator__Group_3__0 : rule__Comparator__Group_3__0__Impl rule__Comparator__Group_3__1 ;
    public final void rule__Comparator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5533:1: ( rule__Comparator__Group_3__0__Impl rule__Comparator__Group_3__1 )
            // InternalRPG.g:5534:2: rule__Comparator__Group_3__0__Impl rule__Comparator__Group_3__1
            {
            pushFollow(FOLLOW_55);
            rule__Comparator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_3__1();

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
    // $ANTLR end "rule__Comparator__Group_3__0"


    // $ANTLR start "rule__Comparator__Group_3__0__Impl"
    // InternalRPG.g:5541:1: rule__Comparator__Group_3__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5545:1: ( ( () ) )
            // InternalRPG.g:5546:1: ( () )
            {
            // InternalRPG.g:5546:1: ( () )
            // InternalRPG.g:5547:2: ()
            {
             before(grammarAccess.getComparatorAccess().getBiggerEqAction_3_0()); 
            // InternalRPG.g:5548:2: ()
            // InternalRPG.g:5548:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getBiggerEqAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_3__0__Impl"


    // $ANTLR start "rule__Comparator__Group_3__1"
    // InternalRPG.g:5556:1: rule__Comparator__Group_3__1 : rule__Comparator__Group_3__1__Impl ;
    public final void rule__Comparator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5560:1: ( rule__Comparator__Group_3__1__Impl )
            // InternalRPG.g:5561:2: rule__Comparator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_3__1__Impl();

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
    // $ANTLR end "rule__Comparator__Group_3__1"


    // $ANTLR start "rule__Comparator__Group_3__1__Impl"
    // InternalRPG.g:5567:1: rule__Comparator__Group_3__1__Impl : ( '>=' ) ;
    public final void rule__Comparator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5571:1: ( ( '>=' ) )
            // InternalRPG.g:5572:1: ( '>=' )
            {
            // InternalRPG.g:5572:1: ( '>=' )
            // InternalRPG.g:5573:2: '>='
            {
             before(grammarAccess.getComparatorAccess().getGreaterThanSignEqualsSignKeyword_3_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getGreaterThanSignEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_3__1__Impl"


    // $ANTLR start "rule__Comparator__Group_4__0"
    // InternalRPG.g:5583:1: rule__Comparator__Group_4__0 : rule__Comparator__Group_4__0__Impl rule__Comparator__Group_4__1 ;
    public final void rule__Comparator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5587:1: ( rule__Comparator__Group_4__0__Impl rule__Comparator__Group_4__1 )
            // InternalRPG.g:5588:2: rule__Comparator__Group_4__0__Impl rule__Comparator__Group_4__1
            {
            pushFollow(FOLLOW_56);
            rule__Comparator__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_4__1();

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
    // $ANTLR end "rule__Comparator__Group_4__0"


    // $ANTLR start "rule__Comparator__Group_4__0__Impl"
    // InternalRPG.g:5595:1: rule__Comparator__Group_4__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5599:1: ( ( () ) )
            // InternalRPG.g:5600:1: ( () )
            {
            // InternalRPG.g:5600:1: ( () )
            // InternalRPG.g:5601:2: ()
            {
             before(grammarAccess.getComparatorAccess().getBiggerAction_4_0()); 
            // InternalRPG.g:5602:2: ()
            // InternalRPG.g:5602:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getBiggerAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_4__0__Impl"


    // $ANTLR start "rule__Comparator__Group_4__1"
    // InternalRPG.g:5610:1: rule__Comparator__Group_4__1 : rule__Comparator__Group_4__1__Impl ;
    public final void rule__Comparator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5614:1: ( rule__Comparator__Group_4__1__Impl )
            // InternalRPG.g:5615:2: rule__Comparator__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_4__1__Impl();

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
    // $ANTLR end "rule__Comparator__Group_4__1"


    // $ANTLR start "rule__Comparator__Group_4__1__Impl"
    // InternalRPG.g:5621:1: rule__Comparator__Group_4__1__Impl : ( '>' ) ;
    public final void rule__Comparator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5625:1: ( ( '>' ) )
            // InternalRPG.g:5626:1: ( '>' )
            {
            // InternalRPG.g:5626:1: ( '>' )
            // InternalRPG.g:5627:2: '>'
            {
             before(grammarAccess.getComparatorAccess().getGreaterThanSignKeyword_4_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getGreaterThanSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_4__1__Impl"


    // $ANTLR start "rule__Comparator__Group_5__0"
    // InternalRPG.g:5637:1: rule__Comparator__Group_5__0 : rule__Comparator__Group_5__0__Impl rule__Comparator__Group_5__1 ;
    public final void rule__Comparator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5641:1: ( rule__Comparator__Group_5__0__Impl rule__Comparator__Group_5__1 )
            // InternalRPG.g:5642:2: rule__Comparator__Group_5__0__Impl rule__Comparator__Group_5__1
            {
            pushFollow(FOLLOW_52);
            rule__Comparator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_5__1();

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
    // $ANTLR end "rule__Comparator__Group_5__0"


    // $ANTLR start "rule__Comparator__Group_5__0__Impl"
    // InternalRPG.g:5649:1: rule__Comparator__Group_5__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5653:1: ( ( () ) )
            // InternalRPG.g:5654:1: ( () )
            {
            // InternalRPG.g:5654:1: ( () )
            // InternalRPG.g:5655:2: ()
            {
             before(grammarAccess.getComparatorAccess().getNEqAction_5_0()); 
            // InternalRPG.g:5656:2: ()
            // InternalRPG.g:5656:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getNEqAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_5__0__Impl"


    // $ANTLR start "rule__Comparator__Group_5__1"
    // InternalRPG.g:5664:1: rule__Comparator__Group_5__1 : rule__Comparator__Group_5__1__Impl ;
    public final void rule__Comparator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5668:1: ( rule__Comparator__Group_5__1__Impl )
            // InternalRPG.g:5669:2: rule__Comparator__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_5__1__Impl();

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
    // $ANTLR end "rule__Comparator__Group_5__1"


    // $ANTLR start "rule__Comparator__Group_5__1__Impl"
    // InternalRPG.g:5675:1: rule__Comparator__Group_5__1__Impl : ( '!=' ) ;
    public final void rule__Comparator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5679:1: ( ( '!=' ) )
            // InternalRPG.g:5680:1: ( '!=' )
            {
            // InternalRPG.g:5680:1: ( '!=' )
            // InternalRPG.g:5681:2: '!='
            {
             before(grammarAccess.getComparatorAccess().getExclamationMarkEqualsSignKeyword_5_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getExclamationMarkEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_5__1__Impl"


    // $ANTLR start "rule__Sum__Group__0"
    // InternalRPG.g:5691:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5695:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // InternalRPG.g:5696:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_57);
            rule__Sum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group__1();

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
    // $ANTLR end "rule__Sum__Group__0"


    // $ANTLR start "rule__Sum__Group__0__Impl"
    // InternalRPG.g:5703:1: rule__Sum__Group__0__Impl : ( ruleMultiply ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5707:1: ( ( ruleMultiply ) )
            // InternalRPG.g:5708:1: ( ruleMultiply )
            {
            // InternalRPG.g:5708:1: ( ruleMultiply )
            // InternalRPG.g:5709:2: ruleMultiply
            {
             before(grammarAccess.getSumAccess().getMultiplyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getSumAccess().getMultiplyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__0__Impl"


    // $ANTLR start "rule__Sum__Group__1"
    // InternalRPG.g:5718:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5722:1: ( rule__Sum__Group__1__Impl )
            // InternalRPG.g:5723:2: rule__Sum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__1__Impl();

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
    // $ANTLR end "rule__Sum__Group__1"


    // $ANTLR start "rule__Sum__Group__1__Impl"
    // InternalRPG.g:5729:1: rule__Sum__Group__1__Impl : ( ( rule__Sum__Group_1__0 )* ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5733:1: ( ( ( rule__Sum__Group_1__0 )* ) )
            // InternalRPG.g:5734:1: ( ( rule__Sum__Group_1__0 )* )
            {
            // InternalRPG.g:5734:1: ( ( rule__Sum__Group_1__0 )* )
            // InternalRPG.g:5735:2: ( rule__Sum__Group_1__0 )*
            {
             before(grammarAccess.getSumAccess().getGroup_1()); 
            // InternalRPG.g:5736:2: ( rule__Sum__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=54 && LA39_0<=55)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalRPG.g:5736:3: rule__Sum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_58);
            	    rule__Sum__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getSumAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__1__Impl"


    // $ANTLR start "rule__Sum__Group_1__0"
    // InternalRPG.g:5745:1: rule__Sum__Group_1__0 : rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 ;
    public final void rule__Sum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5749:1: ( rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 )
            // InternalRPG.g:5750:2: rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Sum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group_1__1();

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
    // $ANTLR end "rule__Sum__Group_1__0"


    // $ANTLR start "rule__Sum__Group_1__0__Impl"
    // InternalRPG.g:5757:1: rule__Sum__Group_1__0__Impl : ( ( rule__Sum__Alternatives_1_0 ) ) ;
    public final void rule__Sum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5761:1: ( ( ( rule__Sum__Alternatives_1_0 ) ) )
            // InternalRPG.g:5762:1: ( ( rule__Sum__Alternatives_1_0 ) )
            {
            // InternalRPG.g:5762:1: ( ( rule__Sum__Alternatives_1_0 ) )
            // InternalRPG.g:5763:2: ( rule__Sum__Alternatives_1_0 )
            {
             before(grammarAccess.getSumAccess().getAlternatives_1_0()); 
            // InternalRPG.g:5764:2: ( rule__Sum__Alternatives_1_0 )
            // InternalRPG.g:5764:3: rule__Sum__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__0__Impl"


    // $ANTLR start "rule__Sum__Group_1__1"
    // InternalRPG.g:5772:1: rule__Sum__Group_1__1 : rule__Sum__Group_1__1__Impl ;
    public final void rule__Sum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5776:1: ( rule__Sum__Group_1__1__Impl )
            // InternalRPG.g:5777:2: rule__Sum__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1__1__Impl();

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
    // $ANTLR end "rule__Sum__Group_1__1"


    // $ANTLR start "rule__Sum__Group_1__1__Impl"
    // InternalRPG.g:5783:1: rule__Sum__Group_1__1__Impl : ( ( rule__Sum__RightAssignment_1_1 ) ) ;
    public final void rule__Sum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5787:1: ( ( ( rule__Sum__RightAssignment_1_1 ) ) )
            // InternalRPG.g:5788:1: ( ( rule__Sum__RightAssignment_1_1 ) )
            {
            // InternalRPG.g:5788:1: ( ( rule__Sum__RightAssignment_1_1 ) )
            // InternalRPG.g:5789:2: ( rule__Sum__RightAssignment_1_1 )
            {
             before(grammarAccess.getSumAccess().getRightAssignment_1_1()); 
            // InternalRPG.g:5790:2: ( rule__Sum__RightAssignment_1_1 )
            // InternalRPG.g:5790:3: rule__Sum__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Sum__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__1__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_0__0"
    // InternalRPG.g:5799:1: rule__Sum__Group_1_0_0__0 : rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1 ;
    public final void rule__Sum__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5803:1: ( rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1 )
            // InternalRPG.g:5804:2: rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Sum__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_0__1();

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
    // $ANTLR end "rule__Sum__Group_1_0_0__0"


    // $ANTLR start "rule__Sum__Group_1_0_0__0__Impl"
    // InternalRPG.g:5811:1: rule__Sum__Group_1_0_0__0__Impl : ( '+' ) ;
    public final void rule__Sum__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5815:1: ( ( '+' ) )
            // InternalRPG.g:5816:1: ( '+' )
            {
            // InternalRPG.g:5816:1: ( '+' )
            // InternalRPG.g:5817:2: '+'
            {
             before(grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_0__1"
    // InternalRPG.g:5826:1: rule__Sum__Group_1_0_0__1 : rule__Sum__Group_1_0_0__1__Impl ;
    public final void rule__Sum__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5830:1: ( rule__Sum__Group_1_0_0__1__Impl )
            // InternalRPG.g:5831:2: rule__Sum__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Sum__Group_1_0_0__1"


    // $ANTLR start "rule__Sum__Group_1_0_0__1__Impl"
    // InternalRPG.g:5837:1: rule__Sum__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Sum__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5841:1: ( ( () ) )
            // InternalRPG.g:5842:1: ( () )
            {
            // InternalRPG.g:5842:1: ( () )
            // InternalRPG.g:5843:2: ()
            {
             before(grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1()); 
            // InternalRPG.g:5844:2: ()
            // InternalRPG.g:5844:3: 
            {
            }

             after(grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_1__0"
    // InternalRPG.g:5853:1: rule__Sum__Group_1_0_1__0 : rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1 ;
    public final void rule__Sum__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5857:1: ( rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1 )
            // InternalRPG.g:5858:2: rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Sum__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_1__1();

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
    // $ANTLR end "rule__Sum__Group_1_0_1__0"


    // $ANTLR start "rule__Sum__Group_1_0_1__0__Impl"
    // InternalRPG.g:5865:1: rule__Sum__Group_1_0_1__0__Impl : ( '-' ) ;
    public final void rule__Sum__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5869:1: ( ( '-' ) )
            // InternalRPG.g:5870:1: ( '-' )
            {
            // InternalRPG.g:5870:1: ( '-' )
            // InternalRPG.g:5871:2: '-'
            {
             before(grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_1__1"
    // InternalRPG.g:5880:1: rule__Sum__Group_1_0_1__1 : rule__Sum__Group_1_0_1__1__Impl ;
    public final void rule__Sum__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5884:1: ( rule__Sum__Group_1_0_1__1__Impl )
            // InternalRPG.g:5885:2: rule__Sum__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Sum__Group_1_0_1__1"


    // $ANTLR start "rule__Sum__Group_1_0_1__1__Impl"
    // InternalRPG.g:5891:1: rule__Sum__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Sum__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5895:1: ( ( () ) )
            // InternalRPG.g:5896:1: ( () )
            {
            // InternalRPG.g:5896:1: ( () )
            // InternalRPG.g:5897:2: ()
            {
             before(grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1()); 
            // InternalRPG.g:5898:2: ()
            // InternalRPG.g:5898:3: 
            {
            }

             after(grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiply__Group__0"
    // InternalRPG.g:5907:1: rule__Multiply__Group__0 : rule__Multiply__Group__0__Impl rule__Multiply__Group__1 ;
    public final void rule__Multiply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5911:1: ( rule__Multiply__Group__0__Impl rule__Multiply__Group__1 )
            // InternalRPG.g:5912:2: rule__Multiply__Group__0__Impl rule__Multiply__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__Multiply__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group__1();

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
    // $ANTLR end "rule__Multiply__Group__0"


    // $ANTLR start "rule__Multiply__Group__0__Impl"
    // InternalRPG.g:5919:1: rule__Multiply__Group__0__Impl : ( ruleAtomicNumber ) ;
    public final void rule__Multiply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5923:1: ( ( ruleAtomicNumber ) )
            // InternalRPG.g:5924:1: ( ruleAtomicNumber )
            {
            // InternalRPG.g:5924:1: ( ruleAtomicNumber )
            // InternalRPG.g:5925:2: ruleAtomicNumber
            {
             before(grammarAccess.getMultiplyAccess().getAtomicNumberParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomicNumber();

            state._fsp--;

             after(grammarAccess.getMultiplyAccess().getAtomicNumberParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group__0__Impl"


    // $ANTLR start "rule__Multiply__Group__1"
    // InternalRPG.g:5934:1: rule__Multiply__Group__1 : rule__Multiply__Group__1__Impl ;
    public final void rule__Multiply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5938:1: ( rule__Multiply__Group__1__Impl )
            // InternalRPG.g:5939:2: rule__Multiply__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group__1__Impl();

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
    // $ANTLR end "rule__Multiply__Group__1"


    // $ANTLR start "rule__Multiply__Group__1__Impl"
    // InternalRPG.g:5945:1: rule__Multiply__Group__1__Impl : ( ( rule__Multiply__Group_1__0 )* ) ;
    public final void rule__Multiply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5949:1: ( ( ( rule__Multiply__Group_1__0 )* ) )
            // InternalRPG.g:5950:1: ( ( rule__Multiply__Group_1__0 )* )
            {
            // InternalRPG.g:5950:1: ( ( rule__Multiply__Group_1__0 )* )
            // InternalRPG.g:5951:2: ( rule__Multiply__Group_1__0 )*
            {
             before(grammarAccess.getMultiplyAccess().getGroup_1()); 
            // InternalRPG.g:5952:2: ( rule__Multiply__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=56 && LA40_0<=57)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalRPG.g:5952:3: rule__Multiply__Group_1__0
            	    {
            	    pushFollow(FOLLOW_60);
            	    rule__Multiply__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getMultiplyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group__1__Impl"


    // $ANTLR start "rule__Multiply__Group_1__0"
    // InternalRPG.g:5961:1: rule__Multiply__Group_1__0 : rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 ;
    public final void rule__Multiply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5965:1: ( rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 )
            // InternalRPG.g:5966:2: rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Multiply__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1__1();

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
    // $ANTLR end "rule__Multiply__Group_1__0"


    // $ANTLR start "rule__Multiply__Group_1__0__Impl"
    // InternalRPG.g:5973:1: rule__Multiply__Group_1__0__Impl : ( ( rule__Multiply__Alternatives_1_0 ) ) ;
    public final void rule__Multiply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5977:1: ( ( ( rule__Multiply__Alternatives_1_0 ) ) )
            // InternalRPG.g:5978:1: ( ( rule__Multiply__Alternatives_1_0 ) )
            {
            // InternalRPG.g:5978:1: ( ( rule__Multiply__Alternatives_1_0 ) )
            // InternalRPG.g:5979:2: ( rule__Multiply__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplyAccess().getAlternatives_1_0()); 
            // InternalRPG.g:5980:2: ( rule__Multiply__Alternatives_1_0 )
            // InternalRPG.g:5980:3: rule__Multiply__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__0__Impl"


    // $ANTLR start "rule__Multiply__Group_1__1"
    // InternalRPG.g:5988:1: rule__Multiply__Group_1__1 : rule__Multiply__Group_1__1__Impl ;
    public final void rule__Multiply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:5992:1: ( rule__Multiply__Group_1__1__Impl )
            // InternalRPG.g:5993:2: rule__Multiply__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1__1__Impl();

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
    // $ANTLR end "rule__Multiply__Group_1__1"


    // $ANTLR start "rule__Multiply__Group_1__1__Impl"
    // InternalRPG.g:5999:1: rule__Multiply__Group_1__1__Impl : ( ( rule__Multiply__RightAssignment_1_1 ) ) ;
    public final void rule__Multiply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6003:1: ( ( ( rule__Multiply__RightAssignment_1_1 ) ) )
            // InternalRPG.g:6004:1: ( ( rule__Multiply__RightAssignment_1_1 ) )
            {
            // InternalRPG.g:6004:1: ( ( rule__Multiply__RightAssignment_1_1 ) )
            // InternalRPG.g:6005:2: ( rule__Multiply__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplyAccess().getRightAssignment_1_1()); 
            // InternalRPG.g:6006:2: ( rule__Multiply__RightAssignment_1_1 )
            // InternalRPG.g:6006:3: rule__Multiply__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__1__Impl"


    // $ANTLR start "rule__Multiply__Group_1_0_0__0"
    // InternalRPG.g:6015:1: rule__Multiply__Group_1_0_0__0 : rule__Multiply__Group_1_0_0__0__Impl rule__Multiply__Group_1_0_0__1 ;
    public final void rule__Multiply__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6019:1: ( rule__Multiply__Group_1_0_0__0__Impl rule__Multiply__Group_1_0_0__1 )
            // InternalRPG.g:6020:2: rule__Multiply__Group_1_0_0__0__Impl rule__Multiply__Group_1_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Multiply__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1_0_0__1();

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
    // $ANTLR end "rule__Multiply__Group_1_0_0__0"


    // $ANTLR start "rule__Multiply__Group_1_0_0__0__Impl"
    // InternalRPG.g:6027:1: rule__Multiply__Group_1_0_0__0__Impl : ( '*' ) ;
    public final void rule__Multiply__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6031:1: ( ( '*' ) )
            // InternalRPG.g:6032:1: ( '*' )
            {
            // InternalRPG.g:6032:1: ( '*' )
            // InternalRPG.g:6033:2: '*'
            {
             before(grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_0_0_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiply__Group_1_0_0__1"
    // InternalRPG.g:6042:1: rule__Multiply__Group_1_0_0__1 : rule__Multiply__Group_1_0_0__1__Impl ;
    public final void rule__Multiply__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6046:1: ( rule__Multiply__Group_1_0_0__1__Impl )
            // InternalRPG.g:6047:2: rule__Multiply__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Multiply__Group_1_0_0__1"


    // $ANTLR start "rule__Multiply__Group_1_0_0__1__Impl"
    // InternalRPG.g:6053:1: rule__Multiply__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Multiply__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6057:1: ( ( () ) )
            // InternalRPG.g:6058:1: ( () )
            {
            // InternalRPG.g:6058:1: ( () )
            // InternalRPG.g:6059:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1()); 
            // InternalRPG.g:6060:2: ()
            // InternalRPG.g:6060:3: 
            {
            }

             after(grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiply__Group_1_0_1__0"
    // InternalRPG.g:6069:1: rule__Multiply__Group_1_0_1__0 : rule__Multiply__Group_1_0_1__0__Impl rule__Multiply__Group_1_0_1__1 ;
    public final void rule__Multiply__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6073:1: ( rule__Multiply__Group_1_0_1__0__Impl rule__Multiply__Group_1_0_1__1 )
            // InternalRPG.g:6074:2: rule__Multiply__Group_1_0_1__0__Impl rule__Multiply__Group_1_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Multiply__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1_0_1__1();

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
    // $ANTLR end "rule__Multiply__Group_1_0_1__0"


    // $ANTLR start "rule__Multiply__Group_1_0_1__0__Impl"
    // InternalRPG.g:6081:1: rule__Multiply__Group_1_0_1__0__Impl : ( '/' ) ;
    public final void rule__Multiply__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6085:1: ( ( '/' ) )
            // InternalRPG.g:6086:1: ( '/' )
            {
            // InternalRPG.g:6086:1: ( '/' )
            // InternalRPG.g:6087:2: '/'
            {
             before(grammarAccess.getMultiplyAccess().getSolidusKeyword_1_0_1_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getMultiplyAccess().getSolidusKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiply__Group_1_0_1__1"
    // InternalRPG.g:6096:1: rule__Multiply__Group_1_0_1__1 : rule__Multiply__Group_1_0_1__1__Impl ;
    public final void rule__Multiply__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6100:1: ( rule__Multiply__Group_1_0_1__1__Impl )
            // InternalRPG.g:6101:2: rule__Multiply__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Multiply__Group_1_0_1__1"


    // $ANTLR start "rule__Multiply__Group_1_0_1__1__Impl"
    // InternalRPG.g:6107:1: rule__Multiply__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Multiply__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6111:1: ( ( () ) )
            // InternalRPG.g:6112:1: ( () )
            {
            // InternalRPG.g:6112:1: ( () )
            // InternalRPG.g:6113:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1()); 
            // InternalRPG.g:6114:2: ()
            // InternalRPG.g:6114:3: 
            {
            }

             after(grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__FloatNum__Group__0"
    // InternalRPG.g:6123:1: rule__FloatNum__Group__0 : rule__FloatNum__Group__0__Impl rule__FloatNum__Group__1 ;
    public final void rule__FloatNum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6127:1: ( rule__FloatNum__Group__0__Impl rule__FloatNum__Group__1 )
            // InternalRPG.g:6128:2: rule__FloatNum__Group__0__Impl rule__FloatNum__Group__1
            {
            pushFollow(FOLLOW_61);
            rule__FloatNum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatNum__Group__1();

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
    // $ANTLR end "rule__FloatNum__Group__0"


    // $ANTLR start "rule__FloatNum__Group__0__Impl"
    // InternalRPG.g:6135:1: rule__FloatNum__Group__0__Impl : ( ( rule__FloatNum__IAssignment_0 ) ) ;
    public final void rule__FloatNum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6139:1: ( ( ( rule__FloatNum__IAssignment_0 ) ) )
            // InternalRPG.g:6140:1: ( ( rule__FloatNum__IAssignment_0 ) )
            {
            // InternalRPG.g:6140:1: ( ( rule__FloatNum__IAssignment_0 ) )
            // InternalRPG.g:6141:2: ( rule__FloatNum__IAssignment_0 )
            {
             before(grammarAccess.getFloatNumAccess().getIAssignment_0()); 
            // InternalRPG.g:6142:2: ( rule__FloatNum__IAssignment_0 )
            // InternalRPG.g:6142:3: rule__FloatNum__IAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FloatNum__IAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFloatNumAccess().getIAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatNum__Group__0__Impl"


    // $ANTLR start "rule__FloatNum__Group__1"
    // InternalRPG.g:6150:1: rule__FloatNum__Group__1 : rule__FloatNum__Group__1__Impl rule__FloatNum__Group__2 ;
    public final void rule__FloatNum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6154:1: ( rule__FloatNum__Group__1__Impl rule__FloatNum__Group__2 )
            // InternalRPG.g:6155:2: rule__FloatNum__Group__1__Impl rule__FloatNum__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__FloatNum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatNum__Group__2();

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
    // $ANTLR end "rule__FloatNum__Group__1"


    // $ANTLR start "rule__FloatNum__Group__1__Impl"
    // InternalRPG.g:6162:1: rule__FloatNum__Group__1__Impl : ( '.' ) ;
    public final void rule__FloatNum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6166:1: ( ( '.' ) )
            // InternalRPG.g:6167:1: ( '.' )
            {
            // InternalRPG.g:6167:1: ( '.' )
            // InternalRPG.g:6168:2: '.'
            {
             before(grammarAccess.getFloatNumAccess().getFullStopKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getFloatNumAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatNum__Group__1__Impl"


    // $ANTLR start "rule__FloatNum__Group__2"
    // InternalRPG.g:6177:1: rule__FloatNum__Group__2 : rule__FloatNum__Group__2__Impl ;
    public final void rule__FloatNum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6181:1: ( rule__FloatNum__Group__2__Impl )
            // InternalRPG.g:6182:2: rule__FloatNum__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatNum__Group__2__Impl();

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
    // $ANTLR end "rule__FloatNum__Group__2"


    // $ANTLR start "rule__FloatNum__Group__2__Impl"
    // InternalRPG.g:6188:1: rule__FloatNum__Group__2__Impl : ( ( rule__FloatNum__DecimalAssignment_2 ) ) ;
    public final void rule__FloatNum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6192:1: ( ( ( rule__FloatNum__DecimalAssignment_2 ) ) )
            // InternalRPG.g:6193:1: ( ( rule__FloatNum__DecimalAssignment_2 ) )
            {
            // InternalRPG.g:6193:1: ( ( rule__FloatNum__DecimalAssignment_2 ) )
            // InternalRPG.g:6194:2: ( rule__FloatNum__DecimalAssignment_2 )
            {
             before(grammarAccess.getFloatNumAccess().getDecimalAssignment_2()); 
            // InternalRPG.g:6195:2: ( rule__FloatNum__DecimalAssignment_2 )
            // InternalRPG.g:6195:3: rule__FloatNum__DecimalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FloatNum__DecimalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFloatNumAccess().getDecimalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatNum__Group__2__Impl"


    // $ANTLR start "rule__SystemRPG__NameAssignment_1"
    // InternalRPG.g:6204:1: rule__SystemRPG__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SystemRPG__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6208:1: ( ( RULE_ID ) )
            // InternalRPG.g:6209:2: ( RULE_ID )
            {
            // InternalRPG.g:6209:2: ( RULE_ID )
            // InternalRPG.g:6210:3: RULE_ID
            {
             before(grammarAccess.getSystemRPGAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemRPGAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRPG__NameAssignment_1"


    // $ANTLR start "rule__SystemRPG__DeclarationsAssignment_2"
    // InternalRPG.g:6219:1: rule__SystemRPG__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__SystemRPG__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6223:1: ( ( ruleDeclaration ) )
            // InternalRPG.g:6224:2: ( ruleDeclaration )
            {
            // InternalRPG.g:6224:2: ( ruleDeclaration )
            // InternalRPG.g:6225:3: ruleDeclaration
            {
             before(grammarAccess.getSystemRPGAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getSystemRPGAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRPG__DeclarationsAssignment_2"


    // $ANTLR start "rule__Effects__EffectAssignment_1"
    // InternalRPG.g:6234:1: rule__Effects__EffectAssignment_1 : ( ruleEffect ) ;
    public final void rule__Effects__EffectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6238:1: ( ( ruleEffect ) )
            // InternalRPG.g:6239:2: ( ruleEffect )
            {
            // InternalRPG.g:6239:2: ( ruleEffect )
            // InternalRPG.g:6240:3: ruleEffect
            {
             before(grammarAccess.getEffectsAccess().getEffectEffectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getEffectsAccess().getEffectEffectParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effects__EffectAssignment_1"


    // $ANTLR start "rule__Buff__NameAssignment_1"
    // InternalRPG.g:6249:1: rule__Buff__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Buff__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6253:1: ( ( RULE_ID ) )
            // InternalRPG.g:6254:2: ( RULE_ID )
            {
            // InternalRPG.g:6254:2: ( RULE_ID )
            // InternalRPG.g:6255:3: RULE_ID
            {
             before(grammarAccess.getBuffAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBuffAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buff__NameAssignment_1"


    // $ANTLR start "rule__Buff__RuleAssignment_2"
    // InternalRPG.g:6264:1: rule__Buff__RuleAssignment_2 : ( ruleRule ) ;
    public final void rule__Buff__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6268:1: ( ( ruleRule ) )
            // InternalRPG.g:6269:2: ( ruleRule )
            {
            // InternalRPG.g:6269:2: ( ruleRule )
            // InternalRPG.g:6270:3: ruleRule
            {
             before(grammarAccess.getBuffAccess().getRuleRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getBuffAccess().getRuleRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buff__RuleAssignment_2"


    // $ANTLR start "rule__Buff__ExtraRuleAssignment_3_1"
    // InternalRPG.g:6279:1: rule__Buff__ExtraRuleAssignment_3_1 : ( ruleAdditionalBuffRule ) ;
    public final void rule__Buff__ExtraRuleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6283:1: ( ( ruleAdditionalBuffRule ) )
            // InternalRPG.g:6284:2: ( ruleAdditionalBuffRule )
            {
            // InternalRPG.g:6284:2: ( ruleAdditionalBuffRule )
            // InternalRPG.g:6285:3: ruleAdditionalBuffRule
            {
             before(grammarAccess.getBuffAccess().getExtraRuleAdditionalBuffRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditionalBuffRule();

            state._fsp--;

             after(grammarAccess.getBuffAccess().getExtraRuleAdditionalBuffRuleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buff__ExtraRuleAssignment_3_1"


    // $ANTLR start "rule__MoveE__NameAssignment_1"
    // InternalRPG.g:6294:1: rule__MoveE__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MoveE__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6298:1: ( ( RULE_ID ) )
            // InternalRPG.g:6299:2: ( RULE_ID )
            {
            // InternalRPG.g:6299:2: ( RULE_ID )
            // InternalRPG.g:6300:3: RULE_ID
            {
             before(grammarAccess.getMoveEAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMoveEAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveE__NameAssignment_1"


    // $ANTLR start "rule__MoveE__RuleAssignment_2"
    // InternalRPG.g:6309:1: rule__MoveE__RuleAssignment_2 : ( ruleRule ) ;
    public final void rule__MoveE__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6313:1: ( ( ruleRule ) )
            // InternalRPG.g:6314:2: ( ruleRule )
            {
            // InternalRPG.g:6314:2: ( ruleRule )
            // InternalRPG.g:6315:3: ruleRule
            {
             before(grammarAccess.getMoveEAccess().getRuleRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getMoveEAccess().getRuleRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveE__RuleAssignment_2"


    // $ANTLR start "rule__MoveE__ExtraRuleAssignment_3_1"
    // InternalRPG.g:6324:1: rule__MoveE__ExtraRuleAssignment_3_1 : ( ruleAdditionalRule ) ;
    public final void rule__MoveE__ExtraRuleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6328:1: ( ( ruleAdditionalRule ) )
            // InternalRPG.g:6329:2: ( ruleAdditionalRule )
            {
            // InternalRPG.g:6329:2: ( ruleAdditionalRule )
            // InternalRPG.g:6330:3: ruleAdditionalRule
            {
             before(grammarAccess.getMoveEAccess().getExtraRuleAdditionalRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditionalRule();

            state._fsp--;

             after(grammarAccess.getMoveEAccess().getExtraRuleAdditionalRuleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveE__ExtraRuleAssignment_3_1"


    // $ANTLR start "rule__AfterE__NameAssignment_1"
    // InternalRPG.g:6339:1: rule__AfterE__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AfterE__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6343:1: ( ( RULE_ID ) )
            // InternalRPG.g:6344:2: ( RULE_ID )
            {
            // InternalRPG.g:6344:2: ( RULE_ID )
            // InternalRPG.g:6345:3: RULE_ID
            {
             before(grammarAccess.getAfterEAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAfterEAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterE__NameAssignment_1"


    // $ANTLR start "rule__AfterE__RuleAssignment_2"
    // InternalRPG.g:6354:1: rule__AfterE__RuleAssignment_2 : ( ruleRule ) ;
    public final void rule__AfterE__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6358:1: ( ( ruleRule ) )
            // InternalRPG.g:6359:2: ( ruleRule )
            {
            // InternalRPG.g:6359:2: ( ruleRule )
            // InternalRPG.g:6360:3: ruleRule
            {
             before(grammarAccess.getAfterEAccess().getRuleRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getAfterEAccess().getRuleRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterE__RuleAssignment_2"


    // $ANTLR start "rule__Attributes__AttributeAssignment_1"
    // InternalRPG.g:6369:1: rule__Attributes__AttributeAssignment_1 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6373:1: ( ( ruleAttribute ) )
            // InternalRPG.g:6374:2: ( ruleAttribute )
            {
            // InternalRPG.g:6374:2: ( ruleAttribute )
            // InternalRPG.g:6375:3: ruleAttribute
            {
             before(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__AttributeAssignment_1"


    // $ANTLR start "rule__Attribute__ModifiedAssignment_0"
    // InternalRPG.g:6384:1: rule__Attribute__ModifiedAssignment_0 : ( ( 'unmodified' ) ) ;
    public final void rule__Attribute__ModifiedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6388:1: ( ( ( 'unmodified' ) ) )
            // InternalRPG.g:6389:2: ( ( 'unmodified' ) )
            {
            // InternalRPG.g:6389:2: ( ( 'unmodified' ) )
            // InternalRPG.g:6390:3: ( 'unmodified' )
            {
             before(grammarAccess.getAttributeAccess().getModifiedUnmodifiedKeyword_0_0()); 
            // InternalRPG.g:6391:3: ( 'unmodified' )
            // InternalRPG.g:6392:4: 'unmodified'
            {
             before(grammarAccess.getAttributeAccess().getModifiedUnmodifiedKeyword_0_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getModifiedUnmodifiedKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeAccess().getModifiedUnmodifiedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ModifiedAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // InternalRPG.g:6403:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6407:1: ( ( RULE_ID ) )
            // InternalRPG.g:6408:2: ( RULE_ID )
            {
            // InternalRPG.g:6408:2: ( RULE_ID )
            // InternalRPG.g:6409:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__Attribute__AValAssignment_3"
    // InternalRPG.g:6418:1: rule__Attribute__AValAssignment_3 : ( ruleAttributeValues ) ;
    public final void rule__Attribute__AValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6422:1: ( ( ruleAttributeValues ) )
            // InternalRPG.g:6423:2: ( ruleAttributeValues )
            {
            // InternalRPG.g:6423:2: ( ruleAttributeValues )
            // InternalRPG.g:6424:3: ruleAttributeValues
            {
             before(grammarAccess.getAttributeAccess().getAValAttributeValuesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeValues();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAValAttributeValuesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AValAssignment_3"


    // $ANTLR start "rule__Locations__LocAssignment_1"
    // InternalRPG.g:6433:1: rule__Locations__LocAssignment_1 : ( ruleLoc ) ;
    public final void rule__Locations__LocAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6437:1: ( ( ruleLoc ) )
            // InternalRPG.g:6438:2: ( ruleLoc )
            {
            // InternalRPG.g:6438:2: ( ruleLoc )
            // InternalRPG.g:6439:3: ruleLoc
            {
             before(grammarAccess.getLocationsAccess().getLocLocParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLoc();

            state._fsp--;

             after(grammarAccess.getLocationsAccess().getLocLocParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locations__LocAssignment_1"


    // $ANTLR start "rule__Loc__NameAssignment_0"
    // InternalRPG.g:6448:1: rule__Loc__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Loc__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6452:1: ( ( RULE_ID ) )
            // InternalRPG.g:6453:2: ( RULE_ID )
            {
            // InternalRPG.g:6453:2: ( RULE_ID )
            // InternalRPG.g:6454:3: RULE_ID
            {
             before(grammarAccess.getLocAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__NameAssignment_0"


    // $ANTLR start "rule__Loc__TipeAssignment_1_1"
    // InternalRPG.g:6463:1: rule__Loc__TipeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Loc__TipeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6467:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:6468:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:6468:2: ( ( RULE_ID ) )
            // InternalRPG.g:6469:3: ( RULE_ID )
            {
             before(grammarAccess.getLocAccess().getTipeTypeCrossReference_1_1_0()); 
            // InternalRPG.g:6470:3: ( RULE_ID )
            // InternalRPG.g:6471:4: RULE_ID
            {
             before(grammarAccess.getLocAccess().getTipeTypeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocAccess().getTipeTypeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getLocAccess().getTipeTypeCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__TipeAssignment_1_1"


    // $ANTLR start "rule__Loc__EffAssignment_1_3"
    // InternalRPG.g:6482:1: rule__Loc__EffAssignment_1_3 : ( ruleActualNumbers ) ;
    public final void rule__Loc__EffAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6486:1: ( ( ruleActualNumbers ) )
            // InternalRPG.g:6487:2: ( ruleActualNumbers )
            {
            // InternalRPG.g:6487:2: ( ruleActualNumbers )
            // InternalRPG.g:6488:3: ruleActualNumbers
            {
             before(grammarAccess.getLocAccess().getEffActualNumbersParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleActualNumbers();

            state._fsp--;

             after(grammarAccess.getLocAccess().getEffActualNumbersParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__EffAssignment_1_3"


    // $ANTLR start "rule__Loc__TeamAssignment_3"
    // InternalRPG.g:6497:1: rule__Loc__TeamAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Loc__TeamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6501:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:6502:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:6502:2: ( ( RULE_ID ) )
            // InternalRPG.g:6503:3: ( RULE_ID )
            {
             before(grammarAccess.getLocAccess().getTeamTeamCrossReference_3_0()); 
            // InternalRPG.g:6504:3: ( RULE_ID )
            // InternalRPG.g:6505:4: RULE_ID
            {
             before(grammarAccess.getLocAccess().getTeamTeamIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocAccess().getTeamTeamIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getLocAccess().getTeamTeamCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__TeamAssignment_3"


    // $ANTLR start "rule__Relations__TypeAssignment_2"
    // InternalRPG.g:6516:1: rule__Relations__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Relations__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6520:1: ( ( ruleType ) )
            // InternalRPG.g:6521:2: ( ruleType )
            {
            // InternalRPG.g:6521:2: ( ruleType )
            // InternalRPG.g:6522:3: ruleType
            {
             before(grammarAccess.getRelationsAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getRelationsAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relations__TypeAssignment_2"


    // $ANTLR start "rule__RelationModifiers__SynAssignment_2"
    // InternalRPG.g:6531:1: rule__RelationModifiers__SynAssignment_2 : ( ruleActualNumbers ) ;
    public final void rule__RelationModifiers__SynAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6535:1: ( ( ruleActualNumbers ) )
            // InternalRPG.g:6536:2: ( ruleActualNumbers )
            {
            // InternalRPG.g:6536:2: ( ruleActualNumbers )
            // InternalRPG.g:6537:3: ruleActualNumbers
            {
             before(grammarAccess.getRelationModifiersAccess().getSynActualNumbersParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActualNumbers();

            state._fsp--;

             after(grammarAccess.getRelationModifiersAccess().getSynActualNumbersParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationModifiers__SynAssignment_2"


    // $ANTLR start "rule__RelationModifiers__EffAssignment_4"
    // InternalRPG.g:6546:1: rule__RelationModifiers__EffAssignment_4 : ( ruleActualNumbers ) ;
    public final void rule__RelationModifiers__EffAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6550:1: ( ( ruleActualNumbers ) )
            // InternalRPG.g:6551:2: ( ruleActualNumbers )
            {
            // InternalRPG.g:6551:2: ( ruleActualNumbers )
            // InternalRPG.g:6552:3: ruleActualNumbers
            {
             before(grammarAccess.getRelationModifiersAccess().getEffActualNumbersParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleActualNumbers();

            state._fsp--;

             after(grammarAccess.getRelationModifiersAccess().getEffActualNumbersParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationModifiers__EffAssignment_4"


    // $ANTLR start "rule__RelationModifiers__IneffAssignment_6"
    // InternalRPG.g:6561:1: rule__RelationModifiers__IneffAssignment_6 : ( ruleActualNumbers ) ;
    public final void rule__RelationModifiers__IneffAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6565:1: ( ( ruleActualNumbers ) )
            // InternalRPG.g:6566:2: ( ruleActualNumbers )
            {
            // InternalRPG.g:6566:2: ( ruleActualNumbers )
            // InternalRPG.g:6567:3: ruleActualNumbers
            {
             before(grammarAccess.getRelationModifiersAccess().getIneffActualNumbersParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleActualNumbers();

            state._fsp--;

             after(grammarAccess.getRelationModifiersAccess().getIneffActualNumbersParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationModifiers__IneffAssignment_6"


    // $ANTLR start "rule__Type__NameAssignment_1"
    // InternalRPG.g:6576:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6580:1: ( ( RULE_ID ) )
            // InternalRPG.g:6581:2: ( RULE_ID )
            {
            // InternalRPG.g:6581:2: ( RULE_ID )
            // InternalRPG.g:6582:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_1"


    // $ANTLR start "rule__Type__TExpressionAssignment_2"
    // InternalRPG.g:6591:1: rule__Type__TExpressionAssignment_2 : ( ruleTypeExpression ) ;
    public final void rule__Type__TExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6595:1: ( ( ruleTypeExpression ) )
            // InternalRPG.g:6596:2: ( ruleTypeExpression )
            {
            // InternalRPG.g:6596:2: ( ruleTypeExpression )
            // InternalRPG.g:6597:3: ruleTypeExpression
            {
             before(grammarAccess.getTypeAccess().getTExpressionTypeExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeExpression();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTExpressionTypeExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TExpressionAssignment_2"


    // $ANTLR start "rule__TypeExpression__StrongAssignment_0"
    // InternalRPG.g:6606:1: rule__TypeExpression__StrongAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__StrongAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6610:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:6611:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:6611:2: ( ( RULE_ID ) )
            // InternalRPG.g:6612:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrongTypeCrossReference_0_0()); 
            // InternalRPG.g:6613:3: ( RULE_ID )
            // InternalRPG.g:6614:4: RULE_ID
            {
             before(grammarAccess.getTypeExpressionAccess().getStrongTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getStrongTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeExpressionAccess().getStrongTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__StrongAssignment_0"


    // $ANTLR start "rule__TypeExpression__Strong2Assignment_1_1"
    // InternalRPG.g:6625:1: rule__TypeExpression__Strong2Assignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__Strong2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6629:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:6630:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:6630:2: ( ( RULE_ID ) )
            // InternalRPG.g:6631:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrong2TypeCrossReference_1_1_0()); 
            // InternalRPG.g:6632:3: ( RULE_ID )
            // InternalRPG.g:6633:4: RULE_ID
            {
             before(grammarAccess.getTypeExpressionAccess().getStrong2TypeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getStrong2TypeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getTypeExpressionAccess().getStrong2TypeCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Strong2Assignment_1_1"


    // $ANTLR start "rule__TypeExpression__CurrentTAssignment_3"
    // InternalRPG.g:6644:1: rule__TypeExpression__CurrentTAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__CurrentTAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6648:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:6649:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:6649:2: ( ( RULE_ID ) )
            // InternalRPG.g:6650:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getCurrentTTypeCrossReference_3_0()); 
            // InternalRPG.g:6651:3: ( RULE_ID )
            // InternalRPG.g:6652:4: RULE_ID
            {
             before(grammarAccess.getTypeExpressionAccess().getCurrentTTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getCurrentTTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTypeExpressionAccess().getCurrentTTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__CurrentTAssignment_3"


    // $ANTLR start "rule__TypeExpression__WeakAssignment_5"
    // InternalRPG.g:6663:1: rule__TypeExpression__WeakAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__WeakAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6667:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:6668:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:6668:2: ( ( RULE_ID ) )
            // InternalRPG.g:6669:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeakTypeCrossReference_5_0()); 
            // InternalRPG.g:6670:3: ( RULE_ID )
            // InternalRPG.g:6671:4: RULE_ID
            {
             before(grammarAccess.getTypeExpressionAccess().getWeakTypeIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getWeakTypeIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTypeExpressionAccess().getWeakTypeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__WeakAssignment_5"


    // $ANTLR start "rule__TypeExpression__Weak2Assignment_6_1"
    // InternalRPG.g:6682:1: rule__TypeExpression__Weak2Assignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__Weak2Assignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6686:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:6687:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:6687:2: ( ( RULE_ID ) )
            // InternalRPG.g:6688:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeak2TypeCrossReference_6_1_0()); 
            // InternalRPG.g:6689:3: ( RULE_ID )
            // InternalRPG.g:6690:4: RULE_ID
            {
             before(grammarAccess.getTypeExpressionAccess().getWeak2TypeIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getWeak2TypeIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getTypeExpressionAccess().getWeak2TypeCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Weak2Assignment_6_1"


    // $ANTLR start "rule__Moves__MoveAssignment_1"
    // InternalRPG.g:6701:1: rule__Moves__MoveAssignment_1 : ( ruleMove ) ;
    public final void rule__Moves__MoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6705:1: ( ( ruleMove ) )
            // InternalRPG.g:6706:2: ( ruleMove )
            {
            // InternalRPG.g:6706:2: ( ruleMove )
            // InternalRPG.g:6707:3: ruleMove
            {
             before(grammarAccess.getMovesAccess().getMoveMoveParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMovesAccess().getMoveMoveParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moves__MoveAssignment_1"


    // $ANTLR start "rule__Move__NameAssignment_1"
    // InternalRPG.g:6716:1: rule__Move__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Move__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6720:1: ( ( RULE_ID ) )
            // InternalRPG.g:6721:2: ( RULE_ID )
            {
            // InternalRPG.g:6721:2: ( RULE_ID )
            // InternalRPG.g:6722:3: RULE_ID
            {
             before(grammarAccess.getMoveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__NameAssignment_1"


    // $ANTLR start "rule__Move__ETypeAssignment_2"
    // InternalRPG.g:6731:1: rule__Move__ETypeAssignment_2 : ( ruleEType ) ;
    public final void rule__Move__ETypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6735:1: ( ( ruleEType ) )
            // InternalRPG.g:6736:2: ( ruleEType )
            {
            // InternalRPG.g:6736:2: ( ruleEType )
            // InternalRPG.g:6737:3: ruleEType
            {
             before(grammarAccess.getMoveAccess().getETypeETypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getETypeETypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__ETypeAssignment_2"


    // $ANTLR start "rule__Move__AttAssignment_3"
    // InternalRPG.g:6746:1: rule__Move__AttAssignment_3 : ( ruleAltAttribute ) ;
    public final void rule__Move__AttAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6750:1: ( ( ruleAltAttribute ) )
            // InternalRPG.g:6751:2: ( ruleAltAttribute )
            {
            // InternalRPG.g:6751:2: ( ruleAltAttribute )
            // InternalRPG.g:6752:3: ruleAltAttribute
            {
             before(grammarAccess.getMoveAccess().getAttAltAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAltAttribute();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getAttAltAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__AttAssignment_3"


    // $ANTLR start "rule__Move__MEffectAssignment_4_0"
    // InternalRPG.g:6761:1: rule__Move__MEffectAssignment_4_0 : ( ruleMEffect ) ;
    public final void rule__Move__MEffectAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6765:1: ( ( ruleMEffect ) )
            // InternalRPG.g:6766:2: ( ruleMEffect )
            {
            // InternalRPG.g:6766:2: ( ruleMEffect )
            // InternalRPG.g:6767:3: ruleMEffect
            {
             before(grammarAccess.getMoveAccess().getMEffectMEffectParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMEffect();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getMEffectMEffectParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__MEffectAssignment_4_0"


    // $ANTLR start "rule__Move__BEffectAssignment_4_1"
    // InternalRPG.g:6776:1: rule__Move__BEffectAssignment_4_1 : ( ruleBEffect ) ;
    public final void rule__Move__BEffectAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6780:1: ( ( ruleBEffect ) )
            // InternalRPG.g:6781:2: ( ruleBEffect )
            {
            // InternalRPG.g:6781:2: ( ruleBEffect )
            // InternalRPG.g:6782:3: ruleBEffect
            {
             before(grammarAccess.getMoveAccess().getBEffectBEffectParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBEffect();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getBEffectBEffectParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__BEffectAssignment_4_1"


    // $ANTLR start "rule__Move__AEffectAssignment_4_2"
    // InternalRPG.g:6791:1: rule__Move__AEffectAssignment_4_2 : ( ruleAEffect ) ;
    public final void rule__Move__AEffectAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6795:1: ( ( ruleAEffect ) )
            // InternalRPG.g:6796:2: ( ruleAEffect )
            {
            // InternalRPG.g:6796:2: ( ruleAEffect )
            // InternalRPG.g:6797:3: ruleAEffect
            {
             before(grammarAccess.getMoveAccess().getAEffectAEffectParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAEffect();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getAEffectAEffectParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__AEffectAssignment_4_2"


    // $ANTLR start "rule__MEffect__MoveENameAssignment_2"
    // InternalRPG.g:6806:1: rule__MEffect__MoveENameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MEffect__MoveENameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6810:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:6811:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:6811:2: ( ( RULE_ID ) )
            // InternalRPG.g:6812:3: ( RULE_ID )
            {
             before(grammarAccess.getMEffectAccess().getMoveENameMoveECrossReference_2_0()); 
            // InternalRPG.g:6813:3: ( RULE_ID )
            // InternalRPG.g:6814:4: RULE_ID
            {
             before(grammarAccess.getMEffectAccess().getMoveENameMoveEIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMEffectAccess().getMoveENameMoveEIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMEffectAccess().getMoveENameMoveECrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEffect__MoveENameAssignment_2"


    // $ANTLR start "rule__BEffect__BuffENameAssignment_2"
    // InternalRPG.g:6825:1: rule__BEffect__BuffENameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BEffect__BuffENameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6829:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:6830:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:6830:2: ( ( RULE_ID ) )
            // InternalRPG.g:6831:3: ( RULE_ID )
            {
             before(grammarAccess.getBEffectAccess().getBuffENameBuffCrossReference_2_0()); 
            // InternalRPG.g:6832:3: ( RULE_ID )
            // InternalRPG.g:6833:4: RULE_ID
            {
             before(grammarAccess.getBEffectAccess().getBuffENameBuffIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBEffectAccess().getBuffENameBuffIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBEffectAccess().getBuffENameBuffCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BEffect__BuffENameAssignment_2"


    // $ANTLR start "rule__AEffect__AfterENameAssignment_2"
    // InternalRPG.g:6844:1: rule__AEffect__AfterENameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AEffect__AfterENameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6848:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:6849:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:6849:2: ( ( RULE_ID ) )
            // InternalRPG.g:6850:3: ( RULE_ID )
            {
             before(grammarAccess.getAEffectAccess().getAfterENameAfterECrossReference_2_0()); 
            // InternalRPG.g:6851:3: ( RULE_ID )
            // InternalRPG.g:6852:4: RULE_ID
            {
             before(grammarAccess.getAEffectAccess().getAfterENameAfterEIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAEffectAccess().getAfterENameAfterEIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAEffectAccess().getAfterENameAfterECrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AEffect__AfterENameAssignment_2"


    // $ANTLR start "rule__EType__TypeAssignment_1"
    // InternalRPG.g:6863:1: rule__EType__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6867:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:6868:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:6868:2: ( ( RULE_ID ) )
            // InternalRPG.g:6869:3: ( RULE_ID )
            {
             before(grammarAccess.getETypeAccess().getTypeTypeCrossReference_1_0()); 
            // InternalRPG.g:6870:3: ( RULE_ID )
            // InternalRPG.g:6871:4: RULE_ID
            {
             before(grammarAccess.getETypeAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getETypeAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getETypeAccess().getTypeTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EType__TypeAssignment_1"


    // $ANTLR start "rule__AttributeValues__LTypesAssignment_1_0"
    // InternalRPG.g:6882:1: rule__AttributeValues__LTypesAssignment_1_0 : ( ruleLegalType ) ;
    public final void rule__AttributeValues__LTypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6886:1: ( ( ruleLegalType ) )
            // InternalRPG.g:6887:2: ( ruleLegalType )
            {
            // InternalRPG.g:6887:2: ( ruleLegalType )
            // InternalRPG.g:6888:3: ruleLegalType
            {
             before(grammarAccess.getAttributeValuesAccess().getLTypesLegalTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLegalType();

            state._fsp--;

             after(grammarAccess.getAttributeValuesAccess().getLTypesLegalTypeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValues__LTypesAssignment_1_0"


    // $ANTLR start "rule__AttributeValues__AnAssignment_1_1"
    // InternalRPG.g:6897:1: rule__AttributeValues__AnAssignment_1_1 : ( ruleActualNumbers ) ;
    public final void rule__AttributeValues__AnAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6901:1: ( ( ruleActualNumbers ) )
            // InternalRPG.g:6902:2: ( ruleActualNumbers )
            {
            // InternalRPG.g:6902:2: ( ruleActualNumbers )
            // InternalRPG.g:6903:3: ruleActualNumbers
            {
             before(grammarAccess.getAttributeValuesAccess().getAnActualNumbersParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActualNumbers();

            state._fsp--;

             after(grammarAccess.getAttributeValuesAccess().getAnActualNumbersParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValues__AnAssignment_1_1"


    // $ANTLR start "rule__AltAttribute__AttributeAssignment_1"
    // InternalRPG.g:6912:1: rule__AltAttribute__AttributeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AltAttribute__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6916:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:6917:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:6917:2: ( ( RULE_ID ) )
            // InternalRPG.g:6918:3: ( RULE_ID )
            {
             before(grammarAccess.getAltAttributeAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalRPG.g:6919:3: ( RULE_ID )
            // InternalRPG.g:6920:4: RULE_ID
            {
             before(grammarAccess.getAltAttributeAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAltAttributeAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAltAttributeAccess().getAttributeAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AltAttribute__AttributeAssignment_1"


    // $ANTLR start "rule__AltAttribute__AvAssignment_2"
    // InternalRPG.g:6931:1: rule__AltAttribute__AvAssignment_2 : ( ruleAttributeValues ) ;
    public final void rule__AltAttribute__AvAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6935:1: ( ( ruleAttributeValues ) )
            // InternalRPG.g:6936:2: ( ruleAttributeValues )
            {
            // InternalRPG.g:6936:2: ( ruleAttributeValues )
            // InternalRPG.g:6937:3: ruleAttributeValues
            {
             before(grammarAccess.getAltAttributeAccess().getAvAttributeValuesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeValues();

            state._fsp--;

             after(grammarAccess.getAltAttributeAccess().getAvAttributeValuesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AltAttribute__AvAssignment_2"


    // $ANTLR start "rule__Rule__OrAssignment_0_1"
    // InternalRPG.g:6946:1: rule__Rule__OrAssignment_0_1 : ( ruleORcondition ) ;
    public final void rule__Rule__OrAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6950:1: ( ( ruleORcondition ) )
            // InternalRPG.g:6951:2: ( ruleORcondition )
            {
            // InternalRPG.g:6951:2: ( ruleORcondition )
            // InternalRPG.g:6952:3: ruleORcondition
            {
             before(grammarAccess.getRuleAccess().getOrORconditionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleORcondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getOrORconditionParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__OrAssignment_0_1"


    // $ANTLR start "rule__Rule__TargetAssignment_1"
    // InternalRPG.g:6961:1: rule__Rule__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6965:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:6966:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:6966:2: ( ( RULE_ID ) )
            // InternalRPG.g:6967:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getTargetAttributeCrossReference_1_0()); 
            // InternalRPG.g:6968:3: ( RULE_ID )
            // InternalRPG.g:6969:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getTargetAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getTargetAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getTargetAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__TargetAssignment_1"


    // $ANTLR start "rule__Rule__SumAssignment_3"
    // InternalRPG.g:6980:1: rule__Rule__SumAssignment_3 : ( ruleSum ) ;
    public final void rule__Rule__SumAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6984:1: ( ( ruleSum ) )
            // InternalRPG.g:6985:2: ( ruleSum )
            {
            // InternalRPG.g:6985:2: ( ruleSum )
            // InternalRPG.g:6986:3: ruleSum
            {
             before(grammarAccess.getRuleAccess().getSumSumParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getSumSumParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__SumAssignment_3"


    // $ANTLR start "rule__AdditionalRule__TargetAssignment_0"
    // InternalRPG.g:6995:1: rule__AdditionalRule__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AdditionalRule__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:6999:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:7000:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:7000:2: ( ( RULE_ID ) )
            // InternalRPG.g:7001:3: ( RULE_ID )
            {
             before(grammarAccess.getAdditionalRuleAccess().getTargetAttributeCrossReference_0_0()); 
            // InternalRPG.g:7002:3: ( RULE_ID )
            // InternalRPG.g:7003:4: RULE_ID
            {
             before(grammarAccess.getAdditionalRuleAccess().getTargetAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAdditionalRuleAccess().getTargetAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAdditionalRuleAccess().getTargetAttributeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalRule__TargetAssignment_0"


    // $ANTLR start "rule__AdditionalRule__SumAssignment_2"
    // InternalRPG.g:7014:1: rule__AdditionalRule__SumAssignment_2 : ( ruleSum ) ;
    public final void rule__AdditionalRule__SumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7018:1: ( ( ruleSum ) )
            // InternalRPG.g:7019:2: ( ruleSum )
            {
            // InternalRPG.g:7019:2: ( ruleSum )
            // InternalRPG.g:7020:3: ruleSum
            {
             before(grammarAccess.getAdditionalRuleAccess().getSumSumParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getAdditionalRuleAccess().getSumSumParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalRule__SumAssignment_2"


    // $ANTLR start "rule__AdditionalRule__HitsAssignment_4_0"
    // InternalRPG.g:7029:1: rule__AdditionalRule__HitsAssignment_4_0 : ( ( 'user' ) ) ;
    public final void rule__AdditionalRule__HitsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7033:1: ( ( ( 'user' ) ) )
            // InternalRPG.g:7034:2: ( ( 'user' ) )
            {
            // InternalRPG.g:7034:2: ( ( 'user' ) )
            // InternalRPG.g:7035:3: ( 'user' )
            {
             before(grammarAccess.getAdditionalRuleAccess().getHitsUserKeyword_4_0_0()); 
            // InternalRPG.g:7036:3: ( 'user' )
            // InternalRPG.g:7037:4: 'user'
            {
             before(grammarAccess.getAdditionalRuleAccess().getHitsUserKeyword_4_0_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getAdditionalRuleAccess().getHitsUserKeyword_4_0_0()); 

            }

             after(grammarAccess.getAdditionalRuleAccess().getHitsUserKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalRule__HitsAssignment_4_0"


    // $ANTLR start "rule__AdditionalRule__HitsAssignment_4_1"
    // InternalRPG.g:7048:1: rule__AdditionalRule__HitsAssignment_4_1 : ( ( 'enemy' ) ) ;
    public final void rule__AdditionalRule__HitsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7052:1: ( ( ( 'enemy' ) ) )
            // InternalRPG.g:7053:2: ( ( 'enemy' ) )
            {
            // InternalRPG.g:7053:2: ( ( 'enemy' ) )
            // InternalRPG.g:7054:3: ( 'enemy' )
            {
             before(grammarAccess.getAdditionalRuleAccess().getHitsEnemyKeyword_4_1_0()); 
            // InternalRPG.g:7055:3: ( 'enemy' )
            // InternalRPG.g:7056:4: 'enemy'
            {
             before(grammarAccess.getAdditionalRuleAccess().getHitsEnemyKeyword_4_1_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getAdditionalRuleAccess().getHitsEnemyKeyword_4_1_0()); 

            }

             after(grammarAccess.getAdditionalRuleAccess().getHitsEnemyKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalRule__HitsAssignment_4_1"


    // $ANTLR start "rule__AdditionalBuffRule__TargetAssignment_0"
    // InternalRPG.g:7067:1: rule__AdditionalBuffRule__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AdditionalBuffRule__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7071:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:7072:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:7072:2: ( ( RULE_ID ) )
            // InternalRPG.g:7073:3: ( RULE_ID )
            {
             before(grammarAccess.getAdditionalBuffRuleAccess().getTargetAttributeCrossReference_0_0()); 
            // InternalRPG.g:7074:3: ( RULE_ID )
            // InternalRPG.g:7075:4: RULE_ID
            {
             before(grammarAccess.getAdditionalBuffRuleAccess().getTargetAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAdditionalBuffRuleAccess().getTargetAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAdditionalBuffRuleAccess().getTargetAttributeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalBuffRule__TargetAssignment_0"


    // $ANTLR start "rule__AdditionalBuffRule__SumAssignment_2"
    // InternalRPG.g:7086:1: rule__AdditionalBuffRule__SumAssignment_2 : ( ruleSum ) ;
    public final void rule__AdditionalBuffRule__SumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7090:1: ( ( ruleSum ) )
            // InternalRPG.g:7091:2: ( ruleSum )
            {
            // InternalRPG.g:7091:2: ( ruleSum )
            // InternalRPG.g:7092:3: ruleSum
            {
             before(grammarAccess.getAdditionalBuffRuleAccess().getSumSumParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getAdditionalBuffRuleAccess().getSumSumParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalBuffRule__SumAssignment_2"


    // $ANTLR start "rule__Entities__EntityAssignment_1"
    // InternalRPG.g:7101:1: rule__Entities__EntityAssignment_1 : ( ruleEntity ) ;
    public final void rule__Entities__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7105:1: ( ( ruleEntity ) )
            // InternalRPG.g:7106:2: ( ruleEntity )
            {
            // InternalRPG.g:7106:2: ( ruleEntity )
            // InternalRPG.g:7107:3: ruleEntity
            {
             before(grammarAccess.getEntitiesAccess().getEntityEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntitiesAccess().getEntityEntityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__EntityAssignment_1"


    // $ANTLR start "rule__Death__ReqAssignment_1"
    // InternalRPG.g:7116:1: rule__Death__ReqAssignment_1 : ( ruleRequire ) ;
    public final void rule__Death__ReqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7120:1: ( ( ruleRequire ) )
            // InternalRPG.g:7121:2: ( ruleRequire )
            {
            // InternalRPG.g:7121:2: ( ruleRequire )
            // InternalRPG.g:7122:3: ruleRequire
            {
             before(grammarAccess.getDeathAccess().getReqRequireParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequire();

            state._fsp--;

             after(grammarAccess.getDeathAccess().getReqRequireParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Death__ReqAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalRPG.g:7131:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7135:1: ( ( RULE_ID ) )
            // InternalRPG.g:7136:2: ( RULE_ID )
            {
            // InternalRPG.g:7136:2: ( RULE_ID )
            // InternalRPG.g:7137:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__ExtendAssignment_2_1"
    // InternalRPG.g:7146:1: rule__Entity__ExtendAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__ExtendAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7150:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:7151:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:7151:2: ( ( RULE_ID ) )
            // InternalRPG.g:7152:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getExtendEntityCrossReference_2_1_0()); 
            // InternalRPG.g:7153:3: ( RULE_ID )
            // InternalRPG.g:7154:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getExtendEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getExtendEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ExtendAssignment_2_1"


    // $ANTLR start "rule__Entity__ETypeAssignment_3"
    // InternalRPG.g:7165:1: rule__Entity__ETypeAssignment_3 : ( ruleEType ) ;
    public final void rule__Entity__ETypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7169:1: ( ( ruleEType ) )
            // InternalRPG.g:7170:2: ( ruleEType )
            {
            // InternalRPG.g:7170:2: ( ruleEType )
            // InternalRPG.g:7171:3: ruleEType
            {
             before(grammarAccess.getEntityAccess().getETypeETypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getETypeETypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ETypeAssignment_3"


    // $ANTLR start "rule__Entity__AttAssignment_4"
    // InternalRPG.g:7180:1: rule__Entity__AttAssignment_4 : ( ruleAltAttribute ) ;
    public final void rule__Entity__AttAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7184:1: ( ( ruleAltAttribute ) )
            // InternalRPG.g:7185:2: ( ruleAltAttribute )
            {
            // InternalRPG.g:7185:2: ( ruleAltAttribute )
            // InternalRPG.g:7186:3: ruleAltAttribute
            {
             before(grammarAccess.getEntityAccess().getAttAltAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAltAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttAltAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttAssignment_4"


    // $ANTLR start "rule__Entity__EMovesAssignment_5"
    // InternalRPG.g:7195:1: rule__Entity__EMovesAssignment_5 : ( ruleEntityMoves ) ;
    public final void rule__Entity__EMovesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7199:1: ( ( ruleEntityMoves ) )
            // InternalRPG.g:7200:2: ( ruleEntityMoves )
            {
            // InternalRPG.g:7200:2: ( ruleEntityMoves )
            // InternalRPG.g:7201:3: ruleEntityMoves
            {
             before(grammarAccess.getEntityAccess().getEMovesEntityMovesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityMoves();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getEMovesEntityMovesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__EMovesAssignment_5"


    // $ANTLR start "rule__EntityMoves__MoveAssignment_1"
    // InternalRPG.g:7210:1: rule__EntityMoves__MoveAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EntityMoves__MoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7214:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:7215:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:7215:2: ( ( RULE_ID ) )
            // InternalRPG.g:7216:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityMovesAccess().getMoveMoveCrossReference_1_0()); 
            // InternalRPG.g:7217:3: ( RULE_ID )
            // InternalRPG.g:7218:4: RULE_ID
            {
             before(grammarAccess.getEntityMovesAccess().getMoveMoveIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityMovesAccess().getMoveMoveIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEntityMovesAccess().getMoveMoveCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoves__MoveAssignment_1"


    // $ANTLR start "rule__Teams__TeamAssignment_1"
    // InternalRPG.g:7229:1: rule__Teams__TeamAssignment_1 : ( ruleTeam ) ;
    public final void rule__Teams__TeamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7233:1: ( ( ruleTeam ) )
            // InternalRPG.g:7234:2: ( ruleTeam )
            {
            // InternalRPG.g:7234:2: ( ruleTeam )
            // InternalRPG.g:7235:3: ruleTeam
            {
             before(grammarAccess.getTeamsAccess().getTeamTeamParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getTeamsAccess().getTeamTeamParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teams__TeamAssignment_1"


    // $ANTLR start "rule__Team__NameAssignment_1"
    // InternalRPG.g:7244:1: rule__Team__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Team__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7248:1: ( ( RULE_ID ) )
            // InternalRPG.g:7249:2: ( RULE_ID )
            {
            // InternalRPG.g:7249:2: ( RULE_ID )
            // InternalRPG.g:7250:3: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__NameAssignment_1"


    // $ANTLR start "rule__Team__MembersAssignment_2"
    // InternalRPG.g:7259:1: rule__Team__MembersAssignment_2 : ( ruleMembers ) ;
    public final void rule__Team__MembersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7263:1: ( ( ruleMembers ) )
            // InternalRPG.g:7264:2: ( ruleMembers )
            {
            // InternalRPG.g:7264:2: ( ruleMembers )
            // InternalRPG.g:7265:3: ruleMembers
            {
             before(grammarAccess.getTeamAccess().getMembersMembersParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMembers();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getMembersMembersParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__MembersAssignment_2"


    // $ANTLR start "rule__Members__EntityAssignment_1"
    // InternalRPG.g:7274:1: rule__Members__EntityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Members__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7278:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:7279:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:7279:2: ( ( RULE_ID ) )
            // InternalRPG.g:7280:3: ( RULE_ID )
            {
             before(grammarAccess.getMembersAccess().getEntityEntityCrossReference_1_0()); 
            // InternalRPG.g:7281:3: ( RULE_ID )
            // InternalRPG.g:7282:4: RULE_ID
            {
             before(grammarAccess.getMembersAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMembersAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMembersAccess().getEntityEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Members__EntityAssignment_1"


    // $ANTLR start "rule__Require__LogAssignment_1"
    // InternalRPG.g:7293:1: rule__Require__LogAssignment_1 : ( ruleORcondition ) ;
    public final void rule__Require__LogAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7297:1: ( ( ruleORcondition ) )
            // InternalRPG.g:7298:2: ( ruleORcondition )
            {
            // InternalRPG.g:7298:2: ( ruleORcondition )
            // InternalRPG.g:7299:3: ruleORcondition
            {
             before(grammarAccess.getRequireAccess().getLogORconditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleORcondition();

            state._fsp--;

             after(grammarAccess.getRequireAccess().getLogORconditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__LogAssignment_1"


    // $ANTLR start "rule__ORcondition__RightAssignment_1_2"
    // InternalRPG.g:7308:1: rule__ORcondition__RightAssignment_1_2 : ( ruleANDcondition ) ;
    public final void rule__ORcondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7312:1: ( ( ruleANDcondition ) )
            // InternalRPG.g:7313:2: ( ruleANDcondition )
            {
            // InternalRPG.g:7313:2: ( ruleANDcondition )
            // InternalRPG.g:7314:3: ruleANDcondition
            {
             before(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleANDcondition();

            state._fsp--;

             after(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__RightAssignment_1_2"


    // $ANTLR start "rule__ANDcondition__RightAssignment_1_2"
    // InternalRPG.g:7323:1: rule__ANDcondition__RightAssignment_1_2 : ( ruleStatement ) ;
    public final void rule__ANDcondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7327:1: ( ( ruleStatement ) )
            // InternalRPG.g:7328:2: ( ruleStatement )
            {
            // InternalRPG.g:7328:2: ( ruleStatement )
            // InternalRPG.g:7329:3: ruleStatement
            {
             before(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__RightAssignment_1_2"


    // $ANTLR start "rule__NumberComparing__LeftAssignment_0"
    // InternalRPG.g:7338:1: rule__NumberComparing__LeftAssignment_0 : ( ruleSum ) ;
    public final void rule__NumberComparing__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7342:1: ( ( ruleSum ) )
            // InternalRPG.g:7343:2: ( ruleSum )
            {
            // InternalRPG.g:7343:2: ( ruleSum )
            // InternalRPG.g:7344:3: ruleSum
            {
             before(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberComparing__LeftAssignment_0"


    // $ANTLR start "rule__NumberComparing__CompAssignment_1"
    // InternalRPG.g:7353:1: rule__NumberComparing__CompAssignment_1 : ( ruleComparator ) ;
    public final void rule__NumberComparing__CompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7357:1: ( ( ruleComparator ) )
            // InternalRPG.g:7358:2: ( ruleComparator )
            {
            // InternalRPG.g:7358:2: ( ruleComparator )
            // InternalRPG.g:7359:3: ruleComparator
            {
             before(grammarAccess.getNumberComparingAccess().getCompComparatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparator();

            state._fsp--;

             after(grammarAccess.getNumberComparingAccess().getCompComparatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberComparing__CompAssignment_1"


    // $ANTLR start "rule__NumberComparing__RightAssignment_2"
    // InternalRPG.g:7368:1: rule__NumberComparing__RightAssignment_2 : ( ruleSum ) ;
    public final void rule__NumberComparing__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7372:1: ( ( ruleSum ) )
            // InternalRPG.g:7373:2: ( ruleSum )
            {
            // InternalRPG.g:7373:2: ( ruleSum )
            // InternalRPG.g:7374:3: ruleSum
            {
             before(grammarAccess.getNumberComparingAccess().getRightSumParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getNumberComparingAccess().getRightSumParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberComparing__RightAssignment_2"


    // $ANTLR start "rule__Sum__RightAssignment_1_1"
    // InternalRPG.g:7383:1: rule__Sum__RightAssignment_1_1 : ( ruleMultiply ) ;
    public final void rule__Sum__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7387:1: ( ( ruleMultiply ) )
            // InternalRPG.g:7388:2: ( ruleMultiply )
            {
            // InternalRPG.g:7388:2: ( ruleMultiply )
            // InternalRPG.g:7389:3: ruleMultiply
            {
             before(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__RightAssignment_1_1"


    // $ANTLR start "rule__Multiply__RightAssignment_1_1"
    // InternalRPG.g:7398:1: rule__Multiply__RightAssignment_1_1 : ( ruleAtomicNumber ) ;
    public final void rule__Multiply__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7402:1: ( ( ruleAtomicNumber ) )
            // InternalRPG.g:7403:2: ( ruleAtomicNumber )
            {
            // InternalRPG.g:7403:2: ( ruleAtomicNumber )
            // InternalRPG.g:7404:3: ruleAtomicNumber
            {
             before(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomicNumber();

            state._fsp--;

             after(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__RightAssignment_1_1"


    // $ANTLR start "rule__NameAttribute__AttributeAssignment"
    // InternalRPG.g:7413:1: rule__NameAttribute__AttributeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NameAttribute__AttributeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7417:1: ( ( ( RULE_ID ) ) )
            // InternalRPG.g:7418:2: ( ( RULE_ID ) )
            {
            // InternalRPG.g:7418:2: ( ( RULE_ID ) )
            // InternalRPG.g:7419:3: ( RULE_ID )
            {
             before(grammarAccess.getNameAttributeAccess().getAttributeAttributeCrossReference_0()); 
            // InternalRPG.g:7420:3: ( RULE_ID )
            // InternalRPG.g:7421:4: RULE_ID
            {
             before(grammarAccess.getNameAttributeAccess().getAttributeAttributeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAttributeAccess().getAttributeAttributeIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getNameAttributeAccess().getAttributeAttributeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAttribute__AttributeAssignment"


    // $ANTLR start "rule__IntNum__ValueAssignment"
    // InternalRPG.g:7432:1: rule__IntNum__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntNum__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7436:1: ( ( RULE_INT ) )
            // InternalRPG.g:7437:2: ( RULE_INT )
            {
            // InternalRPG.g:7437:2: ( RULE_INT )
            // InternalRPG.g:7438:3: RULE_INT
            {
             before(grammarAccess.getIntNumAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntNumAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntNum__ValueAssignment"


    // $ANTLR start "rule__FloatNum__IAssignment_0"
    // InternalRPG.g:7447:1: rule__FloatNum__IAssignment_0 : ( RULE_INT ) ;
    public final void rule__FloatNum__IAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7451:1: ( ( RULE_INT ) )
            // InternalRPG.g:7452:2: ( RULE_INT )
            {
            // InternalRPG.g:7452:2: ( RULE_INT )
            // InternalRPG.g:7453:3: RULE_INT
            {
             before(grammarAccess.getFloatNumAccess().getIINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatNumAccess().getIINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatNum__IAssignment_0"


    // $ANTLR start "rule__FloatNum__DecimalAssignment_2"
    // InternalRPG.g:7462:1: rule__FloatNum__DecimalAssignment_2 : ( RULE_INT ) ;
    public final void rule__FloatNum__DecimalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRPG.g:7466:1: ( ( RULE_INT ) )
            // InternalRPG.g:7467:2: ( RULE_INT )
            {
            // InternalRPG.g:7467:2: ( RULE_INT )
            // InternalRPG.g:7468:3: RULE_INT
            {
             before(grammarAccess.getFloatNumAccess().getDecimalINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatNumAccess().getDecimalINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatNum__DecimalAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000026104504000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000026104504002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0800000000200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000009000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000001820L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010001000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x003E000080000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0400000000000000L});

}