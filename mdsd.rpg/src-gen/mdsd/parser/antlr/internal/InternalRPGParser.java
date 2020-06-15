package mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mdsd.services.RPGGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRPGParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'effects'", "'effect'", "'buff'", "','", "'move'", "'after'", "'attributes'", "'unmodified'", "'attribute'", "'location'", "'type'", "'effectiveness'", "'opponents'", "'relations'", "'modifiers'", "'synergy'", "'effective'", "'ineffective'", "'<'", "'moves'", "'is'", "'if'", "'then'", "'hits'", "'user'", "'enemy'", "'entities'", "'death'", "'entity'", "'extends'", "'teams'", "'team'", "'members'", "'require'", "'OR'", "'AND'", "'('", "')'", "'<='", "'=='", "'>='", "'>'", "'!='", "'+'", "'-'", "'*'", "'/'", "'.'", "'Float'", "'Integer'"
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

        public InternalRPGParser(TokenStream input, RPGGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SystemRPG";
       	}

       	@Override
       	protected RPGGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystemRPG"
    // InternalRPG.g:64:1: entryRuleSystemRPG returns [EObject current=null] : iv_ruleSystemRPG= ruleSystemRPG EOF ;
    public final EObject entryRuleSystemRPG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemRPG = null;


        try {
            // InternalRPG.g:64:50: (iv_ruleSystemRPG= ruleSystemRPG EOF )
            // InternalRPG.g:65:2: iv_ruleSystemRPG= ruleSystemRPG EOF
            {
             newCompositeNode(grammarAccess.getSystemRPGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemRPG=ruleSystemRPG();

            state._fsp--;

             current =iv_ruleSystemRPG; 
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
    // $ANTLR end "entryRuleSystemRPG"


    // $ANTLR start "ruleSystemRPG"
    // InternalRPG.g:71:1: ruleSystemRPG returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) ;
    public final EObject ruleSystemRPG() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_declarations_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:77:2: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) )
            // InternalRPG.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            {
            // InternalRPG.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            // InternalRPG.g:79:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemRPGAccess().getGameKeyword_0());
            		
            // InternalRPG.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemRPGAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRPGRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:101:3: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==18||LA1_0==21||LA1_0==25||LA1_0==31||(LA1_0>=38 && LA1_0<=39)||LA1_0==42) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRPG.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // InternalRPG.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    // InternalRPG.g:103:5: lv_declarations_2_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getSystemRPGAccess().getDeclarationsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRPGRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_2_0,
            	    						"mdsd.RPG.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleSystemRPG"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRPG.g:124:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalRPG.g:124:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalRPG.g:125:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRPG.g:131:1: ruleDeclaration returns [EObject current=null] : (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Locations_0 = null;

        EObject this_Relations_1 = null;

        EObject this_Moves_2 = null;

        EObject this_Entities_3 = null;

        EObject this_Teams_4 = null;

        EObject this_Death_5 = null;

        EObject this_Attributes_6 = null;

        EObject this_Effects_7 = null;



        	enterRule();

        try {
            // InternalRPG.g:137:2: ( (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects ) )
            // InternalRPG.g:138:2: (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects )
            {
            // InternalRPG.g:138:2: (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            case 38:
                {
                alt2=4;
                }
                break;
            case 42:
                {
                alt2=5;
                }
                break;
            case 39:
                {
                alt2=6;
                }
                break;
            case 18:
                {
                alt2=7;
                }
                break;
            case 12:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRPG.g:139:3: this_Locations_0= ruleLocations
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getLocationsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Locations_0=ruleLocations();

                    state._fsp--;


                    			current = this_Locations_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:148:3: this_Relations_1= ruleRelations
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getRelationsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relations_1=ruleRelations();

                    state._fsp--;


                    			current = this_Relations_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRPG.g:157:3: this_Moves_2= ruleMoves
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getMovesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Moves_2=ruleMoves();

                    state._fsp--;


                    			current = this_Moves_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRPG.g:166:3: this_Entities_3= ruleEntities
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getEntitiesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entities_3=ruleEntities();

                    state._fsp--;


                    			current = this_Entities_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRPG.g:175:3: this_Teams_4= ruleTeams
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getTeamsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Teams_4=ruleTeams();

                    state._fsp--;


                    			current = this_Teams_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRPG.g:184:3: this_Death_5= ruleDeath
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getDeathParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Death_5=ruleDeath();

                    state._fsp--;


                    			current = this_Death_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRPG.g:193:3: this_Attributes_6= ruleAttributes
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getAttributesParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attributes_6=ruleAttributes();

                    state._fsp--;


                    			current = this_Attributes_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRPG.g:202:3: this_Effects_7= ruleEffects
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getEffectsParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Effects_7=ruleEffects();

                    state._fsp--;


                    			current = this_Effects_7;
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEffects"
    // InternalRPG.g:214:1: entryRuleEffects returns [EObject current=null] : iv_ruleEffects= ruleEffects EOF ;
    public final EObject entryRuleEffects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffects = null;


        try {
            // InternalRPG.g:214:48: (iv_ruleEffects= ruleEffects EOF )
            // InternalRPG.g:215:2: iv_ruleEffects= ruleEffects EOF
            {
             newCompositeNode(grammarAccess.getEffectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffects=ruleEffects();

            state._fsp--;

             current =iv_ruleEffects; 
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
    // $ANTLR end "entryRuleEffects"


    // $ANTLR start "ruleEffects"
    // InternalRPG.g:221:1: ruleEffects returns [EObject current=null] : (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ ) ;
    public final EObject ruleEffects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_effect_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:227:2: ( (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ ) )
            // InternalRPG.g:228:2: (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ )
            {
            // InternalRPG.g:228:2: (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ )
            // InternalRPG.g:229:3: otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectsAccess().getEffectsKeyword_0());
            		
            // InternalRPG.g:233:3: ( (lv_effect_1_0= ruleEffect ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRPG.g:234:4: (lv_effect_1_0= ruleEffect )
            	    {
            	    // InternalRPG.g:234:4: (lv_effect_1_0= ruleEffect )
            	    // InternalRPG.g:235:5: lv_effect_1_0= ruleEffect
            	    {

            	    					newCompositeNode(grammarAccess.getEffectsAccess().getEffectEffectParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_effect_1_0=ruleEffect();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEffectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"effect",
            	    						lv_effect_1_0,
            	    						"mdsd.RPG.Effect");
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
    // $ANTLR end "ruleEffects"


    // $ANTLR start "entryRuleEffect"
    // InternalRPG.g:256:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalRPG.g:256:47: (iv_ruleEffect= ruleEffect EOF )
            // InternalRPG.g:257:2: iv_ruleEffect= ruleEffect EOF
            {
             newCompositeNode(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffect=ruleEffect();

            state._fsp--;

             current =iv_ruleEffect; 
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
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalRPG.g:263:1: ruleEffect returns [EObject current=null] : (otherlv_0= 'effect' (this_Buff_1= ruleBuff | this_MoveE_2= ruleMoveE | this_AfterE_3= ruleAfterE ) ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Buff_1 = null;

        EObject this_MoveE_2 = null;

        EObject this_AfterE_3 = null;



        	enterRule();

        try {
            // InternalRPG.g:269:2: ( (otherlv_0= 'effect' (this_Buff_1= ruleBuff | this_MoveE_2= ruleMoveE | this_AfterE_3= ruleAfterE ) ) )
            // InternalRPG.g:270:2: (otherlv_0= 'effect' (this_Buff_1= ruleBuff | this_MoveE_2= ruleMoveE | this_AfterE_3= ruleAfterE ) )
            {
            // InternalRPG.g:270:2: (otherlv_0= 'effect' (this_Buff_1= ruleBuff | this_MoveE_2= ruleMoveE | this_AfterE_3= ruleAfterE ) )
            // InternalRPG.g:271:3: otherlv_0= 'effect' (this_Buff_1= ruleBuff | this_MoveE_2= ruleMoveE | this_AfterE_3= ruleAfterE )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectAccess().getEffectKeyword_0());
            		
            // InternalRPG.g:275:3: (this_Buff_1= ruleBuff | this_MoveE_2= ruleMoveE | this_AfterE_3= ruleAfterE )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRPG.g:276:4: this_Buff_1= ruleBuff
                    {

                    				newCompositeNode(grammarAccess.getEffectAccess().getBuffParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Buff_1=ruleBuff();

                    state._fsp--;


                    				current = this_Buff_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalRPG.g:285:4: this_MoveE_2= ruleMoveE
                    {

                    				newCompositeNode(grammarAccess.getEffectAccess().getMoveEParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_MoveE_2=ruleMoveE();

                    state._fsp--;


                    				current = this_MoveE_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalRPG.g:294:4: this_AfterE_3= ruleAfterE
                    {

                    				newCompositeNode(grammarAccess.getEffectAccess().getAfterEParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_AfterE_3=ruleAfterE();

                    state._fsp--;


                    				current = this_AfterE_3;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleBuff"
    // InternalRPG.g:307:1: entryRuleBuff returns [EObject current=null] : iv_ruleBuff= ruleBuff EOF ;
    public final EObject entryRuleBuff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuff = null;


        try {
            // InternalRPG.g:307:45: (iv_ruleBuff= ruleBuff EOF )
            // InternalRPG.g:308:2: iv_ruleBuff= ruleBuff EOF
            {
             newCompositeNode(grammarAccess.getBuffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuff=ruleBuff();

            state._fsp--;

             current =iv_ruleBuff; 
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
    // $ANTLR end "entryRuleBuff"


    // $ANTLR start "ruleBuff"
    // InternalRPG.g:314:1: ruleBuff returns [EObject current=null] : (otherlv_0= 'buff' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_extraRule_4_0= ruleAdditionalBuffRule ) ) )* ) ;
    public final EObject ruleBuff() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_rule_2_0 = null;

        EObject lv_extraRule_4_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:320:2: ( (otherlv_0= 'buff' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_extraRule_4_0= ruleAdditionalBuffRule ) ) )* ) )
            // InternalRPG.g:321:2: (otherlv_0= 'buff' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_extraRule_4_0= ruleAdditionalBuffRule ) ) )* )
            {
            // InternalRPG.g:321:2: (otherlv_0= 'buff' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_extraRule_4_0= ruleAdditionalBuffRule ) ) )* )
            // InternalRPG.g:322:3: otherlv_0= 'buff' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_extraRule_4_0= ruleAdditionalBuffRule ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBuffAccess().getBuffKeyword_0());
            		
            // InternalRPG.g:326:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:327:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:327:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:328:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBuffAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuffRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:344:3: ( (lv_rule_2_0= ruleRule ) )
            // InternalRPG.g:345:4: (lv_rule_2_0= ruleRule )
            {
            // InternalRPG.g:345:4: (lv_rule_2_0= ruleRule )
            // InternalRPG.g:346:5: lv_rule_2_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getBuffAccess().getRuleRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_rule_2_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuffRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_2_0,
            						"mdsd.RPG.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPG.g:363:3: (otherlv_3= ',' ( (lv_extraRule_4_0= ruleAdditionalBuffRule ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRPG.g:364:4: otherlv_3= ',' ( (lv_extraRule_4_0= ruleAdditionalBuffRule ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getBuffAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRPG.g:368:4: ( (lv_extraRule_4_0= ruleAdditionalBuffRule ) )
            	    // InternalRPG.g:369:5: (lv_extraRule_4_0= ruleAdditionalBuffRule )
            	    {
            	    // InternalRPG.g:369:5: (lv_extraRule_4_0= ruleAdditionalBuffRule )
            	    // InternalRPG.g:370:6: lv_extraRule_4_0= ruleAdditionalBuffRule
            	    {

            	    						newCompositeNode(grammarAccess.getBuffAccess().getExtraRuleAdditionalBuffRuleParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_extraRule_4_0=ruleAdditionalBuffRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBuffRule());
            	    						}
            	    						add(
            	    							current,
            	    							"extraRule",
            	    							lv_extraRule_4_0,
            	    							"mdsd.RPG.AdditionalBuffRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleBuff"


    // $ANTLR start "entryRuleMoveE"
    // InternalRPG.g:392:1: entryRuleMoveE returns [EObject current=null] : iv_ruleMoveE= ruleMoveE EOF ;
    public final EObject entryRuleMoveE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveE = null;


        try {
            // InternalRPG.g:392:46: (iv_ruleMoveE= ruleMoveE EOF )
            // InternalRPG.g:393:2: iv_ruleMoveE= ruleMoveE EOF
            {
             newCompositeNode(grammarAccess.getMoveERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveE=ruleMoveE();

            state._fsp--;

             current =iv_ruleMoveE; 
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
    // $ANTLR end "entryRuleMoveE"


    // $ANTLR start "ruleMoveE"
    // InternalRPG.g:399:1: ruleMoveE returns [EObject current=null] : (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_extraRule_4_0= ruleAdditionalRule ) ) )* ) ;
    public final EObject ruleMoveE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_rule_2_0 = null;

        EObject lv_extraRule_4_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:405:2: ( (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_extraRule_4_0= ruleAdditionalRule ) ) )* ) )
            // InternalRPG.g:406:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_extraRule_4_0= ruleAdditionalRule ) ) )* )
            {
            // InternalRPG.g:406:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_extraRule_4_0= ruleAdditionalRule ) ) )* )
            // InternalRPG.g:407:3: otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_extraRule_4_0= ruleAdditionalRule ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveEAccess().getMoveKeyword_0());
            		
            // InternalRPG.g:411:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:412:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:412:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:413:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMoveEAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveERule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:429:3: ( (lv_rule_2_0= ruleRule ) )
            // InternalRPG.g:430:4: (lv_rule_2_0= ruleRule )
            {
            // InternalRPG.g:430:4: (lv_rule_2_0= ruleRule )
            // InternalRPG.g:431:5: lv_rule_2_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getMoveEAccess().getRuleRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_rule_2_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveERule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_2_0,
            						"mdsd.RPG.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPG.g:448:3: (otherlv_3= ',' ( (lv_extraRule_4_0= ruleAdditionalRule ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRPG.g:449:4: otherlv_3= ',' ( (lv_extraRule_4_0= ruleAdditionalRule ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMoveEAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRPG.g:453:4: ( (lv_extraRule_4_0= ruleAdditionalRule ) )
            	    // InternalRPG.g:454:5: (lv_extraRule_4_0= ruleAdditionalRule )
            	    {
            	    // InternalRPG.g:454:5: (lv_extraRule_4_0= ruleAdditionalRule )
            	    // InternalRPG.g:455:6: lv_extraRule_4_0= ruleAdditionalRule
            	    {

            	    						newCompositeNode(grammarAccess.getMoveEAccess().getExtraRuleAdditionalRuleParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_extraRule_4_0=ruleAdditionalRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMoveERule());
            	    						}
            	    						add(
            	    							current,
            	    							"extraRule",
            	    							lv_extraRule_4_0,
            	    							"mdsd.RPG.AdditionalRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleMoveE"


    // $ANTLR start "entryRuleAfterE"
    // InternalRPG.g:477:1: entryRuleAfterE returns [EObject current=null] : iv_ruleAfterE= ruleAfterE EOF ;
    public final EObject entryRuleAfterE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterE = null;


        try {
            // InternalRPG.g:477:47: (iv_ruleAfterE= ruleAfterE EOF )
            // InternalRPG.g:478:2: iv_ruleAfterE= ruleAfterE EOF
            {
             newCompositeNode(grammarAccess.getAfterERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAfterE=ruleAfterE();

            state._fsp--;

             current =iv_ruleAfterE; 
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
    // $ANTLR end "entryRuleAfterE"


    // $ANTLR start "ruleAfterE"
    // InternalRPG.g:484:1: ruleAfterE returns [EObject current=null] : (otherlv_0= 'after' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) ) ;
    public final EObject ruleAfterE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:490:2: ( (otherlv_0= 'after' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) ) )
            // InternalRPG.g:491:2: (otherlv_0= 'after' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) )
            {
            // InternalRPG.g:491:2: (otherlv_0= 'after' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) )
            // InternalRPG.g:492:3: otherlv_0= 'after' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAfterEAccess().getAfterKeyword_0());
            		
            // InternalRPG.g:496:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:497:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:497:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:498:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAfterEAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAfterERule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:514:3: ( (lv_rule_2_0= ruleRule ) )
            // InternalRPG.g:515:4: (lv_rule_2_0= ruleRule )
            {
            // InternalRPG.g:515:4: (lv_rule_2_0= ruleRule )
            // InternalRPG.g:516:5: lv_rule_2_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getAfterEAccess().getRuleRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rule_2_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAfterERule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_2_0,
            						"mdsd.RPG.Rule");
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
    // $ANTLR end "ruleAfterE"


    // $ANTLR start "entryRuleAttributes"
    // InternalRPG.g:537:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalRPG.g:537:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalRPG.g:538:2: iv_ruleAttributes= ruleAttributes EOF
            {
             newCompositeNode(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributes=ruleAttributes();

            state._fsp--;

             current =iv_ruleAttributes; 
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
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalRPG.g:544:1: ruleAttributes returns [EObject current=null] : (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attribute_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:550:2: ( (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ ) )
            // InternalRPG.g:551:2: (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ )
            {
            // InternalRPG.g:551:2: (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ )
            // InternalRPG.g:552:3: otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributesAccess().getAttributesKeyword_0());
            		
            // InternalRPG.g:556:3: ( (lv_attribute_1_0= ruleAttribute ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=19 && LA7_0<=20)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRPG.g:557:4: (lv_attribute_1_0= ruleAttribute )
            	    {
            	    // InternalRPG.g:557:4: (lv_attribute_1_0= ruleAttribute )
            	    // InternalRPG.g:558:5: lv_attribute_1_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_attribute_1_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attribute",
            	    						lv_attribute_1_0,
            	    						"mdsd.RPG.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleAttribute"
    // InternalRPG.g:579:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRPG.g:579:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRPG.g:580:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalRPG.g:586:1: ruleAttribute returns [EObject current=null] : ( ( (lv_modified_0_0= 'unmodified' ) )? otherlv_1= 'attribute' ( (lv_name_2_0= RULE_ID ) ) ( (lv_aVal_3_0= ruleAttributeValues ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_modified_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_aVal_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:592:2: ( ( ( (lv_modified_0_0= 'unmodified' ) )? otherlv_1= 'attribute' ( (lv_name_2_0= RULE_ID ) ) ( (lv_aVal_3_0= ruleAttributeValues ) ) ) )
            // InternalRPG.g:593:2: ( ( (lv_modified_0_0= 'unmodified' ) )? otherlv_1= 'attribute' ( (lv_name_2_0= RULE_ID ) ) ( (lv_aVal_3_0= ruleAttributeValues ) ) )
            {
            // InternalRPG.g:593:2: ( ( (lv_modified_0_0= 'unmodified' ) )? otherlv_1= 'attribute' ( (lv_name_2_0= RULE_ID ) ) ( (lv_aVal_3_0= ruleAttributeValues ) ) )
            // InternalRPG.g:594:3: ( (lv_modified_0_0= 'unmodified' ) )? otherlv_1= 'attribute' ( (lv_name_2_0= RULE_ID ) ) ( (lv_aVal_3_0= ruleAttributeValues ) )
            {
            // InternalRPG.g:594:3: ( (lv_modified_0_0= 'unmodified' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRPG.g:595:4: (lv_modified_0_0= 'unmodified' )
                    {
                    // InternalRPG.g:595:4: (lv_modified_0_0= 'unmodified' )
                    // InternalRPG.g:596:5: lv_modified_0_0= 'unmodified'
                    {
                    lv_modified_0_0=(Token)match(input,19,FOLLOW_12); 

                    					newLeafNode(lv_modified_0_0, grammarAccess.getAttributeAccess().getModifiedUnmodifiedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "modified", lv_modified_0_0, "unmodified");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
            		
            // InternalRPG.g:612:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPG.g:613:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPG.g:613:4: (lv_name_2_0= RULE_ID )
            // InternalRPG.g:614:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:630:3: ( (lv_aVal_3_0= ruleAttributeValues ) )
            // InternalRPG.g:631:4: (lv_aVal_3_0= ruleAttributeValues )
            {
            // InternalRPG.g:631:4: (lv_aVal_3_0= ruleAttributeValues )
            // InternalRPG.g:632:5: lv_aVal_3_0= ruleAttributeValues
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getAValAttributeValuesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_aVal_3_0=ruleAttributeValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"aVal",
            						lv_aVal_3_0,
            						"mdsd.RPG.AttributeValues");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleLocations"
    // InternalRPG.g:653:1: entryRuleLocations returns [EObject current=null] : iv_ruleLocations= ruleLocations EOF ;
    public final EObject entryRuleLocations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocations = null;


        try {
            // InternalRPG.g:653:50: (iv_ruleLocations= ruleLocations EOF )
            // InternalRPG.g:654:2: iv_ruleLocations= ruleLocations EOF
            {
             newCompositeNode(grammarAccess.getLocationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocations=ruleLocations();

            state._fsp--;

             current =iv_ruleLocations; 
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
    // $ANTLR end "entryRuleLocations"


    // $ANTLR start "ruleLocations"
    // InternalRPG.g:660:1: ruleLocations returns [EObject current=null] : (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ ) ;
    public final EObject ruleLocations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_loc_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:666:2: ( (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ ) )
            // InternalRPG.g:667:2: (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ )
            {
            // InternalRPG.g:667:2: (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ )
            // InternalRPG.g:668:3: otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationsAccess().getLocationKeyword_0());
            		
            // InternalRPG.g:672:3: ( (lv_loc_1_0= ruleLoc ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRPG.g:673:4: (lv_loc_1_0= ruleLoc )
            	    {
            	    // InternalRPG.g:673:4: (lv_loc_1_0= ruleLoc )
            	    // InternalRPG.g:674:5: lv_loc_1_0= ruleLoc
            	    {

            	    					newCompositeNode(grammarAccess.getLocationsAccess().getLocLocParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_loc_1_0=ruleLoc();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLocationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"loc",
            	    						lv_loc_1_0,
            	    						"mdsd.RPG.Loc");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // $ANTLR end "ruleLocations"


    // $ANTLR start "entryRuleLoc"
    // InternalRPG.g:695:1: entryRuleLoc returns [EObject current=null] : iv_ruleLoc= ruleLoc EOF ;
    public final EObject entryRuleLoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoc = null;


        try {
            // InternalRPG.g:695:44: (iv_ruleLoc= ruleLoc EOF )
            // InternalRPG.g:696:2: iv_ruleLoc= ruleLoc EOF
            {
             newCompositeNode(grammarAccess.getLocRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoc=ruleLoc();

            state._fsp--;

             current =iv_ruleLoc; 
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
    // $ANTLR end "entryRuleLoc"


    // $ANTLR start "ruleLoc"
    // InternalRPG.g:702:1: ruleLoc returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'effectiveness' ( (lv_eff_4_0= ruleActualNumbers ) ) )? otherlv_5= 'opponents' ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleLoc() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_eff_4_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:708:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'effectiveness' ( (lv_eff_4_0= ruleActualNumbers ) ) )? otherlv_5= 'opponents' ( (otherlv_6= RULE_ID ) ) ) )
            // InternalRPG.g:709:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'effectiveness' ( (lv_eff_4_0= ruleActualNumbers ) ) )? otherlv_5= 'opponents' ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalRPG.g:709:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'effectiveness' ( (lv_eff_4_0= ruleActualNumbers ) ) )? otherlv_5= 'opponents' ( (otherlv_6= RULE_ID ) ) )
            // InternalRPG.g:710:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'effectiveness' ( (lv_eff_4_0= ruleActualNumbers ) ) )? otherlv_5= 'opponents' ( (otherlv_6= RULE_ID ) )
            {
            // InternalRPG.g:710:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPG.g:711:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRPG.g:711:4: (lv_name_0_0= RULE_ID )
            // InternalRPG.g:712:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLocAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:728:3: (otherlv_1= 'type' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'effectiveness' ( (lv_eff_4_0= ruleActualNumbers ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRPG.g:729:4: otherlv_1= 'type' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'effectiveness' ( (lv_eff_4_0= ruleActualNumbers ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getLocAccess().getTypeKeyword_1_0());
                    			
                    // InternalRPG.g:733:4: ( (otherlv_2= RULE_ID ) )
                    // InternalRPG.g:734:5: (otherlv_2= RULE_ID )
                    {
                    // InternalRPG.g:734:5: (otherlv_2= RULE_ID )
                    // InternalRPG.g:735:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLocRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_2, grammarAccess.getLocAccess().getTipeTypeCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getLocAccess().getEffectivenessKeyword_1_2());
                    			
                    // InternalRPG.g:750:4: ( (lv_eff_4_0= ruleActualNumbers ) )
                    // InternalRPG.g:751:5: (lv_eff_4_0= ruleActualNumbers )
                    {
                    // InternalRPG.g:751:5: (lv_eff_4_0= ruleActualNumbers )
                    // InternalRPG.g:752:6: lv_eff_4_0= ruleActualNumbers
                    {

                    						newCompositeNode(grammarAccess.getLocAccess().getEffActualNumbersParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_eff_4_0=ruleActualNumbers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocRule());
                    						}
                    						set(
                    							current,
                    							"eff",
                    							lv_eff_4_0,
                    							"mdsd.RPG.ActualNumbers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getLocAccess().getOpponentsKeyword_2());
            		
            // InternalRPG.g:774:3: ( (otherlv_6= RULE_ID ) )
            // InternalRPG.g:775:4: (otherlv_6= RULE_ID )
            {
            // InternalRPG.g:775:4: (otherlv_6= RULE_ID )
            // InternalRPG.g:776:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_6, grammarAccess.getLocAccess().getTeamTeamCrossReference_3_0());
            				

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
    // $ANTLR end "ruleLoc"


    // $ANTLR start "entryRuleRelations"
    // InternalRPG.g:791:1: entryRuleRelations returns [EObject current=null] : iv_ruleRelations= ruleRelations EOF ;
    public final EObject entryRuleRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelations = null;


        try {
            // InternalRPG.g:791:50: (iv_ruleRelations= ruleRelations EOF )
            // InternalRPG.g:792:2: iv_ruleRelations= ruleRelations EOF
            {
             newCompositeNode(grammarAccess.getRelationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelations=ruleRelations();

            state._fsp--;

             current =iv_ruleRelations; 
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
    // $ANTLR end "entryRuleRelations"


    // $ANTLR start "ruleRelations"
    // InternalRPG.g:798:1: ruleRelations returns [EObject current=null] : (otherlv_0= 'relations' (this_RelationModifiers_1= ruleRelationModifiers )? ( (lv_type_2_0= ruleType ) )+ ) ;
    public final EObject ruleRelations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_RelationModifiers_1 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:804:2: ( (otherlv_0= 'relations' (this_RelationModifiers_1= ruleRelationModifiers )? ( (lv_type_2_0= ruleType ) )+ ) )
            // InternalRPG.g:805:2: (otherlv_0= 'relations' (this_RelationModifiers_1= ruleRelationModifiers )? ( (lv_type_2_0= ruleType ) )+ )
            {
            // InternalRPG.g:805:2: (otherlv_0= 'relations' (this_RelationModifiers_1= ruleRelationModifiers )? ( (lv_type_2_0= ruleType ) )+ )
            // InternalRPG.g:806:3: otherlv_0= 'relations' (this_RelationModifiers_1= ruleRelationModifiers )? ( (lv_type_2_0= ruleType ) )+
            {
            otherlv_0=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationsAccess().getRelationsKeyword_0());
            		
            // InternalRPG.g:810:3: (this_RelationModifiers_1= ruleRelationModifiers )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRPG.g:811:4: this_RelationModifiers_1= ruleRelationModifiers
                    {

                    				newCompositeNode(grammarAccess.getRelationsAccess().getRelationModifiersParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_RelationModifiers_1=ruleRelationModifiers();

                    state._fsp--;


                    				current = this_RelationModifiers_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalRPG.g:820:3: ( (lv_type_2_0= ruleType ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRPG.g:821:4: (lv_type_2_0= ruleType )
            	    {
            	    // InternalRPG.g:821:4: (lv_type_2_0= ruleType )
            	    // InternalRPG.g:822:5: lv_type_2_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getRelationsAccess().getTypeTypeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_type_2_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRelationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"type",
            	    						lv_type_2_0,
            	    						"mdsd.RPG.Type");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "ruleRelations"


    // $ANTLR start "entryRuleRelationModifiers"
    // InternalRPG.g:843:1: entryRuleRelationModifiers returns [EObject current=null] : iv_ruleRelationModifiers= ruleRelationModifiers EOF ;
    public final EObject entryRuleRelationModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationModifiers = null;


        try {
            // InternalRPG.g:843:58: (iv_ruleRelationModifiers= ruleRelationModifiers EOF )
            // InternalRPG.g:844:2: iv_ruleRelationModifiers= ruleRelationModifiers EOF
            {
             newCompositeNode(grammarAccess.getRelationModifiersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationModifiers=ruleRelationModifiers();

            state._fsp--;

             current =iv_ruleRelationModifiers; 
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
    // $ANTLR end "entryRuleRelationModifiers"


    // $ANTLR start "ruleRelationModifiers"
    // InternalRPG.g:850:1: ruleRelationModifiers returns [EObject current=null] : (otherlv_0= 'modifiers' otherlv_1= 'synergy' ( (lv_syn_2_0= ruleActualNumbers ) ) otherlv_3= 'effective' ( (lv_eff_4_0= ruleActualNumbers ) ) otherlv_5= 'ineffective' ( (lv_ineff_6_0= ruleActualNumbers ) ) ) ;
    public final EObject ruleRelationModifiers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_syn_2_0 = null;

        EObject lv_eff_4_0 = null;

        EObject lv_ineff_6_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:856:2: ( (otherlv_0= 'modifiers' otherlv_1= 'synergy' ( (lv_syn_2_0= ruleActualNumbers ) ) otherlv_3= 'effective' ( (lv_eff_4_0= ruleActualNumbers ) ) otherlv_5= 'ineffective' ( (lv_ineff_6_0= ruleActualNumbers ) ) ) )
            // InternalRPG.g:857:2: (otherlv_0= 'modifiers' otherlv_1= 'synergy' ( (lv_syn_2_0= ruleActualNumbers ) ) otherlv_3= 'effective' ( (lv_eff_4_0= ruleActualNumbers ) ) otherlv_5= 'ineffective' ( (lv_ineff_6_0= ruleActualNumbers ) ) )
            {
            // InternalRPG.g:857:2: (otherlv_0= 'modifiers' otherlv_1= 'synergy' ( (lv_syn_2_0= ruleActualNumbers ) ) otherlv_3= 'effective' ( (lv_eff_4_0= ruleActualNumbers ) ) otherlv_5= 'ineffective' ( (lv_ineff_6_0= ruleActualNumbers ) ) )
            // InternalRPG.g:858:3: otherlv_0= 'modifiers' otherlv_1= 'synergy' ( (lv_syn_2_0= ruleActualNumbers ) ) otherlv_3= 'effective' ( (lv_eff_4_0= ruleActualNumbers ) ) otherlv_5= 'ineffective' ( (lv_ineff_6_0= ruleActualNumbers ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationModifiersAccess().getModifiersKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationModifiersAccess().getSynergyKeyword_1());
            		
            // InternalRPG.g:866:3: ( (lv_syn_2_0= ruleActualNumbers ) )
            // InternalRPG.g:867:4: (lv_syn_2_0= ruleActualNumbers )
            {
            // InternalRPG.g:867:4: (lv_syn_2_0= ruleActualNumbers )
            // InternalRPG.g:868:5: lv_syn_2_0= ruleActualNumbers
            {

            					newCompositeNode(grammarAccess.getRelationModifiersAccess().getSynActualNumbersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_syn_2_0=ruleActualNumbers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationModifiersRule());
            					}
            					set(
            						current,
            						"syn",
            						lv_syn_2_0,
            						"mdsd.RPG.ActualNumbers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationModifiersAccess().getEffectiveKeyword_3());
            		
            // InternalRPG.g:889:3: ( (lv_eff_4_0= ruleActualNumbers ) )
            // InternalRPG.g:890:4: (lv_eff_4_0= ruleActualNumbers )
            {
            // InternalRPG.g:890:4: (lv_eff_4_0= ruleActualNumbers )
            // InternalRPG.g:891:5: lv_eff_4_0= ruleActualNumbers
            {

            					newCompositeNode(grammarAccess.getRelationModifiersAccess().getEffActualNumbersParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_eff_4_0=ruleActualNumbers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationModifiersRule());
            					}
            					set(
            						current,
            						"eff",
            						lv_eff_4_0,
            						"mdsd.RPG.ActualNumbers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationModifiersAccess().getIneffectiveKeyword_5());
            		
            // InternalRPG.g:912:3: ( (lv_ineff_6_0= ruleActualNumbers ) )
            // InternalRPG.g:913:4: (lv_ineff_6_0= ruleActualNumbers )
            {
            // InternalRPG.g:913:4: (lv_ineff_6_0= ruleActualNumbers )
            // InternalRPG.g:914:5: lv_ineff_6_0= ruleActualNumbers
            {

            					newCompositeNode(grammarAccess.getRelationModifiersAccess().getIneffActualNumbersParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_ineff_6_0=ruleActualNumbers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationModifiersRule());
            					}
            					set(
            						current,
            						"ineff",
            						lv_ineff_6_0,
            						"mdsd.RPG.ActualNumbers");
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
    // $ANTLR end "ruleRelationModifiers"


    // $ANTLR start "entryRuleType"
    // InternalRPG.g:935:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalRPG.g:935:45: (iv_ruleType= ruleType EOF )
            // InternalRPG.g:936:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalRPG.g:942:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_tExpression_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:948:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? ) )
            // InternalRPG.g:949:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? )
            {
            // InternalRPG.g:949:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? )
            // InternalRPG.g:950:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalRPG.g:954:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:955:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:955:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:956:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:972:3: ( (lv_tExpression_2_0= ruleTypeExpression ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRPG.g:973:4: (lv_tExpression_2_0= ruleTypeExpression )
                    {
                    // InternalRPG.g:973:4: (lv_tExpression_2_0= ruleTypeExpression )
                    // InternalRPG.g:974:5: lv_tExpression_2_0= ruleTypeExpression
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getTExpressionTypeExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tExpression_2_0=ruleTypeExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"tExpression",
                    						lv_tExpression_2_0,
                    						"mdsd.RPG.TypeExpression");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeExpression"
    // InternalRPG.g:995:1: entryRuleTypeExpression returns [EObject current=null] : iv_ruleTypeExpression= ruleTypeExpression EOF ;
    public final EObject entryRuleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpression = null;


        try {
            // InternalRPG.g:995:55: (iv_ruleTypeExpression= ruleTypeExpression EOF )
            // InternalRPG.g:996:2: iv_ruleTypeExpression= ruleTypeExpression EOF
            {
             newCompositeNode(grammarAccess.getTypeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeExpression=ruleTypeExpression();

            state._fsp--;

             current =iv_ruleTypeExpression; 
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
    // $ANTLR end "entryRuleTypeExpression"


    // $ANTLR start "ruleTypeExpression"
    // InternalRPG.g:1002:1: ruleTypeExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) ;
    public final EObject ruleTypeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalRPG.g:1008:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) )
            // InternalRPG.g:1009:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )
            {
            // InternalRPG.g:1009:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )
            // InternalRPG.g:1010:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            {
            // InternalRPG.g:1010:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPG.g:1011:4: (otherlv_0= RULE_ID )
            {
            // InternalRPG.g:1011:4: (otherlv_0= RULE_ID )
            // InternalRPG.g:1012:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getTypeExpressionAccess().getStrongTypeCrossReference_0_0());
            				

            }


            }

            // InternalRPG.g:1023:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRPG.g:1024:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTypeExpressionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRPG.g:1028:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalRPG.g:1029:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalRPG.g:1029:5: (otherlv_2= RULE_ID )
            	    // InternalRPG.g:1030:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeExpressionRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_2, grammarAccess.getTypeExpressionAccess().getStrong2TypeCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_2());
            		
            // InternalRPG.g:1046:3: ( (otherlv_4= RULE_ID ) )
            // InternalRPG.g:1047:4: (otherlv_4= RULE_ID )
            {
            // InternalRPG.g:1047:4: (otherlv_4= RULE_ID )
            // InternalRPG.g:1048:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_4, grammarAccess.getTypeExpressionAccess().getCurrentTTypeCrossReference_3_0());
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_4());
            		
            // InternalRPG.g:1063:3: ( (otherlv_6= RULE_ID ) )
            // InternalRPG.g:1064:4: (otherlv_6= RULE_ID )
            {
            // InternalRPG.g:1064:4: (otherlv_6= RULE_ID )
            // InternalRPG.g:1065:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_6, grammarAccess.getTypeExpressionAccess().getWeakTypeCrossReference_5_0());
            				

            }


            }

            // InternalRPG.g:1076:3: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRPG.g:1077:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getTypeExpressionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRPG.g:1081:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalRPG.g:1082:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalRPG.g:1082:5: (otherlv_8= RULE_ID )
            	    // InternalRPG.g:1083:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeExpressionRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(otherlv_8, grammarAccess.getTypeExpressionAccess().getWeak2TypeCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleTypeExpression"


    // $ANTLR start "entryRuleMoves"
    // InternalRPG.g:1099:1: entryRuleMoves returns [EObject current=null] : iv_ruleMoves= ruleMoves EOF ;
    public final EObject entryRuleMoves() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoves = null;


        try {
            // InternalRPG.g:1099:46: (iv_ruleMoves= ruleMoves EOF )
            // InternalRPG.g:1100:2: iv_ruleMoves= ruleMoves EOF
            {
             newCompositeNode(grammarAccess.getMovesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoves=ruleMoves();

            state._fsp--;

             current =iv_ruleMoves; 
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
    // $ANTLR end "entryRuleMoves"


    // $ANTLR start "ruleMoves"
    // InternalRPG.g:1106:1: ruleMoves returns [EObject current=null] : (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ ) ;
    public final EObject ruleMoves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_move_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1112:2: ( (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ ) )
            // InternalRPG.g:1113:2: (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ )
            {
            // InternalRPG.g:1113:2: (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ )
            // InternalRPG.g:1114:3: otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+
            {
            otherlv_0=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getMovesAccess().getMovesKeyword_0());
            		
            // InternalRPG.g:1118:3: ( (lv_move_1_0= ruleMove ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRPG.g:1119:4: (lv_move_1_0= ruleMove )
            	    {
            	    // InternalRPG.g:1119:4: (lv_move_1_0= ruleMove )
            	    // InternalRPG.g:1120:5: lv_move_1_0= ruleMove
            	    {

            	    					newCompositeNode(grammarAccess.getMovesAccess().getMoveMoveParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_move_1_0=ruleMove();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMovesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"move",
            	    						lv_move_1_0,
            	    						"mdsd.RPG.Move");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // $ANTLR end "ruleMoves"


    // $ANTLR start "entryRuleMove"
    // InternalRPG.g:1141:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalRPG.g:1141:45: (iv_ruleMove= ruleMove EOF )
            // InternalRPG.g:1142:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalRPG.g:1148:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( ( (lv_mEffect_4_0= ruleMEffect ) ) | ( (lv_bEffect_5_0= ruleBEffect ) ) | ( (lv_aEffect_6_0= ruleAEffect ) ) )* ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_eType_2_0 = null;

        EObject lv_att_3_0 = null;

        EObject lv_mEffect_4_0 = null;

        EObject lv_bEffect_5_0 = null;

        EObject lv_aEffect_6_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1154:2: ( (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( ( (lv_mEffect_4_0= ruleMEffect ) ) | ( (lv_bEffect_5_0= ruleBEffect ) ) | ( (lv_aEffect_6_0= ruleAEffect ) ) )* ) )
            // InternalRPG.g:1155:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( ( (lv_mEffect_4_0= ruleMEffect ) ) | ( (lv_bEffect_5_0= ruleBEffect ) ) | ( (lv_aEffect_6_0= ruleAEffect ) ) )* )
            {
            // InternalRPG.g:1155:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( ( (lv_mEffect_4_0= ruleMEffect ) ) | ( (lv_bEffect_5_0= ruleBEffect ) ) | ( (lv_aEffect_6_0= ruleAEffect ) ) )* )
            // InternalRPG.g:1156:3: otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( ( (lv_mEffect_4_0= ruleMEffect ) ) | ( (lv_bEffect_5_0= ruleBEffect ) ) | ( (lv_aEffect_6_0= ruleAEffect ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
            		
            // InternalRPG.g:1160:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:1161:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:1161:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:1162:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMoveAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:1178:3: ( (lv_eType_2_0= ruleEType ) )
            // InternalRPG.g:1179:4: (lv_eType_2_0= ruleEType )
            {
            // InternalRPG.g:1179:4: (lv_eType_2_0= ruleEType )
            // InternalRPG.g:1180:5: lv_eType_2_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getETypeETypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
            lv_eType_2_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"eType",
            						lv_eType_2_0,
            						"mdsd.RPG.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPG.g:1197:3: ( (lv_att_3_0= ruleAltAttribute ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRPG.g:1198:4: (lv_att_3_0= ruleAltAttribute )
            	    {
            	    // InternalRPG.g:1198:4: (lv_att_3_0= ruleAltAttribute )
            	    // InternalRPG.g:1199:5: lv_att_3_0= ruleAltAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getMoveAccess().getAttAltAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_att_3_0=ruleAltAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMoveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"att",
            	    						lv_att_3_0,
            	    						"mdsd.RPG.AltAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalRPG.g:1216:3: ( ( (lv_mEffect_4_0= ruleMEffect ) ) | ( (lv_bEffect_5_0= ruleBEffect ) ) | ( (lv_aEffect_6_0= ruleAEffect ) ) )*
            loop18:
            do {
                int alt18=4;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==13) ) {
                    switch ( input.LA(2) ) {
                    case 14:
                        {
                        alt18=2;
                        }
                        break;
                    case 17:
                        {
                        alt18=3;
                        }
                        break;
                    case 16:
                        {
                        alt18=1;
                        }
                        break;

                    }

                }


                switch (alt18) {
            	case 1 :
            	    // InternalRPG.g:1217:4: ( (lv_mEffect_4_0= ruleMEffect ) )
            	    {
            	    // InternalRPG.g:1217:4: ( (lv_mEffect_4_0= ruleMEffect ) )
            	    // InternalRPG.g:1218:5: (lv_mEffect_4_0= ruleMEffect )
            	    {
            	    // InternalRPG.g:1218:5: (lv_mEffect_4_0= ruleMEffect )
            	    // InternalRPG.g:1219:6: lv_mEffect_4_0= ruleMEffect
            	    {

            	    						newCompositeNode(grammarAccess.getMoveAccess().getMEffectMEffectParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_mEffect_4_0=ruleMEffect();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMoveRule());
            	    						}
            	    						add(
            	    							current,
            	    							"mEffect",
            	    							lv_mEffect_4_0,
            	    							"mdsd.RPG.MEffect");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRPG.g:1237:4: ( (lv_bEffect_5_0= ruleBEffect ) )
            	    {
            	    // InternalRPG.g:1237:4: ( (lv_bEffect_5_0= ruleBEffect ) )
            	    // InternalRPG.g:1238:5: (lv_bEffect_5_0= ruleBEffect )
            	    {
            	    // InternalRPG.g:1238:5: (lv_bEffect_5_0= ruleBEffect )
            	    // InternalRPG.g:1239:6: lv_bEffect_5_0= ruleBEffect
            	    {

            	    						newCompositeNode(grammarAccess.getMoveAccess().getBEffectBEffectParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_bEffect_5_0=ruleBEffect();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMoveRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bEffect",
            	    							lv_bEffect_5_0,
            	    							"mdsd.RPG.BEffect");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRPG.g:1257:4: ( (lv_aEffect_6_0= ruleAEffect ) )
            	    {
            	    // InternalRPG.g:1257:4: ( (lv_aEffect_6_0= ruleAEffect ) )
            	    // InternalRPG.g:1258:5: (lv_aEffect_6_0= ruleAEffect )
            	    {
            	    // InternalRPG.g:1258:5: (lv_aEffect_6_0= ruleAEffect )
            	    // InternalRPG.g:1259:6: lv_aEffect_6_0= ruleAEffect
            	    {

            	    						newCompositeNode(grammarAccess.getMoveAccess().getAEffectAEffectParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_aEffect_6_0=ruleAEffect();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMoveRule());
            	    						}
            	    						add(
            	    							current,
            	    							"aEffect",
            	    							lv_aEffect_6_0,
            	    							"mdsd.RPG.AEffect");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleMEffect"
    // InternalRPG.g:1281:1: entryRuleMEffect returns [EObject current=null] : iv_ruleMEffect= ruleMEffect EOF ;
    public final EObject entryRuleMEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEffect = null;


        try {
            // InternalRPG.g:1281:48: (iv_ruleMEffect= ruleMEffect EOF )
            // InternalRPG.g:1282:2: iv_ruleMEffect= ruleMEffect EOF
            {
             newCompositeNode(grammarAccess.getMEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMEffect=ruleMEffect();

            state._fsp--;

             current =iv_ruleMEffect; 
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
    // $ANTLR end "entryRuleMEffect"


    // $ANTLR start "ruleMEffect"
    // InternalRPG.g:1288:1: ruleMEffect returns [EObject current=null] : (otherlv_0= 'effect' otherlv_1= 'move' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleMEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRPG.g:1294:2: ( (otherlv_0= 'effect' otherlv_1= 'move' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRPG.g:1295:2: (otherlv_0= 'effect' otherlv_1= 'move' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRPG.g:1295:2: (otherlv_0= 'effect' otherlv_1= 'move' ( (otherlv_2= RULE_ID ) ) )
            // InternalRPG.g:1296:3: otherlv_0= 'effect' otherlv_1= 'move' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getMEffectAccess().getEffectKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMEffectAccess().getMoveKeyword_1());
            		
            // InternalRPG.g:1304:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPG.g:1305:4: (otherlv_2= RULE_ID )
            {
            // InternalRPG.g:1305:4: (otherlv_2= RULE_ID )
            // InternalRPG.g:1306:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMEffectRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getMEffectAccess().getMoveENameMoveECrossReference_2_0());
            				

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
    // $ANTLR end "ruleMEffect"


    // $ANTLR start "entryRuleBEffect"
    // InternalRPG.g:1321:1: entryRuleBEffect returns [EObject current=null] : iv_ruleBEffect= ruleBEffect EOF ;
    public final EObject entryRuleBEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBEffect = null;


        try {
            // InternalRPG.g:1321:48: (iv_ruleBEffect= ruleBEffect EOF )
            // InternalRPG.g:1322:2: iv_ruleBEffect= ruleBEffect EOF
            {
             newCompositeNode(grammarAccess.getBEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBEffect=ruleBEffect();

            state._fsp--;

             current =iv_ruleBEffect; 
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
    // $ANTLR end "entryRuleBEffect"


    // $ANTLR start "ruleBEffect"
    // InternalRPG.g:1328:1: ruleBEffect returns [EObject current=null] : (otherlv_0= 'effect' otherlv_1= 'buff' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleBEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRPG.g:1334:2: ( (otherlv_0= 'effect' otherlv_1= 'buff' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRPG.g:1335:2: (otherlv_0= 'effect' otherlv_1= 'buff' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRPG.g:1335:2: (otherlv_0= 'effect' otherlv_1= 'buff' ( (otherlv_2= RULE_ID ) ) )
            // InternalRPG.g:1336:3: otherlv_0= 'effect' otherlv_1= 'buff' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getBEffectAccess().getEffectKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBEffectAccess().getBuffKeyword_1());
            		
            // InternalRPG.g:1344:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPG.g:1345:4: (otherlv_2= RULE_ID )
            {
            // InternalRPG.g:1345:4: (otherlv_2= RULE_ID )
            // InternalRPG.g:1346:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBEffectRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getBEffectAccess().getBuffENameBuffCrossReference_2_0());
            				

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
    // $ANTLR end "ruleBEffect"


    // $ANTLR start "entryRuleAEffect"
    // InternalRPG.g:1361:1: entryRuleAEffect returns [EObject current=null] : iv_ruleAEffect= ruleAEffect EOF ;
    public final EObject entryRuleAEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAEffect = null;


        try {
            // InternalRPG.g:1361:48: (iv_ruleAEffect= ruleAEffect EOF )
            // InternalRPG.g:1362:2: iv_ruleAEffect= ruleAEffect EOF
            {
             newCompositeNode(grammarAccess.getAEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAEffect=ruleAEffect();

            state._fsp--;

             current =iv_ruleAEffect; 
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
    // $ANTLR end "entryRuleAEffect"


    // $ANTLR start "ruleAEffect"
    // InternalRPG.g:1368:1: ruleAEffect returns [EObject current=null] : (otherlv_0= 'effect' otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleAEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRPG.g:1374:2: ( (otherlv_0= 'effect' otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRPG.g:1375:2: (otherlv_0= 'effect' otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRPG.g:1375:2: (otherlv_0= 'effect' otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )
            // InternalRPG.g:1376:3: otherlv_0= 'effect' otherlv_1= 'after' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getAEffectAccess().getEffectKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAEffectAccess().getAfterKeyword_1());
            		
            // InternalRPG.g:1384:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPG.g:1385:4: (otherlv_2= RULE_ID )
            {
            // InternalRPG.g:1385:4: (otherlv_2= RULE_ID )
            // InternalRPG.g:1386:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAEffectRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getAEffectAccess().getAfterENameAfterECrossReference_2_0());
            				

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
    // $ANTLR end "ruleAEffect"


    // $ANTLR start "entryRuleEType"
    // InternalRPG.g:1401:1: entryRuleEType returns [EObject current=null] : iv_ruleEType= ruleEType EOF ;
    public final EObject entryRuleEType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEType = null;


        try {
            // InternalRPG.g:1401:46: (iv_ruleEType= ruleEType EOF )
            // InternalRPG.g:1402:2: iv_ruleEType= ruleEType EOF
            {
             newCompositeNode(grammarAccess.getETypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEType=ruleEType();

            state._fsp--;

             current =iv_ruleEType; 
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
    // $ANTLR end "entryRuleEType"


    // $ANTLR start "ruleEType"
    // InternalRPG.g:1408:1: ruleEType returns [EObject current=null] : (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRPG.g:1414:2: ( (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRPG.g:1415:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRPG.g:1415:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) )
            // InternalRPG.g:1416:3: otherlv_0= 'type' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getETypeAccess().getTypeKeyword_0());
            		
            // InternalRPG.g:1420:3: ( (otherlv_1= RULE_ID ) )
            // InternalRPG.g:1421:4: (otherlv_1= RULE_ID )
            {
            // InternalRPG.g:1421:4: (otherlv_1= RULE_ID )
            // InternalRPG.g:1422:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getETypeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getETypeAccess().getTypeTypeCrossReference_1_0());
            				

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
    // $ANTLR end "ruleEType"


    // $ANTLR start "entryRuleAttributeValues"
    // InternalRPG.g:1437:1: entryRuleAttributeValues returns [EObject current=null] : iv_ruleAttributeValues= ruleAttributeValues EOF ;
    public final EObject entryRuleAttributeValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValues = null;


        try {
            // InternalRPG.g:1437:56: (iv_ruleAttributeValues= ruleAttributeValues EOF )
            // InternalRPG.g:1438:2: iv_ruleAttributeValues= ruleAttributeValues EOF
            {
             newCompositeNode(grammarAccess.getAttributeValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValues=ruleAttributeValues();

            state._fsp--;

             current =iv_ruleAttributeValues; 
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
    // $ANTLR end "entryRuleAttributeValues"


    // $ANTLR start "ruleAttributeValues"
    // InternalRPG.g:1444:1: ruleAttributeValues returns [EObject current=null] : (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) ) ;
    public final EObject ruleAttributeValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_lTypes_1_0 = null;

        EObject lv_an_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1450:2: ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) ) )
            // InternalRPG.g:1451:2: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) )
            {
            // InternalRPG.g:1451:2: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) )
            // InternalRPG.g:1452:3: otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeValuesAccess().getIsKeyword_0());
            		
            // InternalRPG.g:1456:3: ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=60 && LA19_0<=61)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_INT) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalRPG.g:1457:4: ( (lv_lTypes_1_0= ruleLegalType ) )
                    {
                    // InternalRPG.g:1457:4: ( (lv_lTypes_1_0= ruleLegalType ) )
                    // InternalRPG.g:1458:5: (lv_lTypes_1_0= ruleLegalType )
                    {
                    // InternalRPG.g:1458:5: (lv_lTypes_1_0= ruleLegalType )
                    // InternalRPG.g:1459:6: lv_lTypes_1_0= ruleLegalType
                    {

                    						newCompositeNode(grammarAccess.getAttributeValuesAccess().getLTypesLegalTypeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_lTypes_1_0=ruleLegalType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValuesRule());
                    						}
                    						set(
                    							current,
                    							"lTypes",
                    							lv_lTypes_1_0,
                    							"mdsd.RPG.LegalType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1477:4: ( (lv_an_2_0= ruleActualNumbers ) )
                    {
                    // InternalRPG.g:1477:4: ( (lv_an_2_0= ruleActualNumbers ) )
                    // InternalRPG.g:1478:5: (lv_an_2_0= ruleActualNumbers )
                    {
                    // InternalRPG.g:1478:5: (lv_an_2_0= ruleActualNumbers )
                    // InternalRPG.g:1479:6: lv_an_2_0= ruleActualNumbers
                    {

                    						newCompositeNode(grammarAccess.getAttributeValuesAccess().getAnActualNumbersParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_an_2_0=ruleActualNumbers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValuesRule());
                    						}
                    						set(
                    							current,
                    							"an",
                    							lv_an_2_0,
                    							"mdsd.RPG.ActualNumbers");
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
    // $ANTLR end "ruleAttributeValues"


    // $ANTLR start "entryRuleAltAttribute"
    // InternalRPG.g:1501:1: entryRuleAltAttribute returns [EObject current=null] : iv_ruleAltAttribute= ruleAltAttribute EOF ;
    public final EObject entryRuleAltAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAltAttribute = null;


        try {
            // InternalRPG.g:1501:53: (iv_ruleAltAttribute= ruleAltAttribute EOF )
            // InternalRPG.g:1502:2: iv_ruleAltAttribute= ruleAltAttribute EOF
            {
             newCompositeNode(grammarAccess.getAltAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAltAttribute=ruleAltAttribute();

            state._fsp--;

             current =iv_ruleAltAttribute; 
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
    // $ANTLR end "entryRuleAltAttribute"


    // $ANTLR start "ruleAltAttribute"
    // InternalRPG.g:1508:1: ruleAltAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? ) ;
    public final EObject ruleAltAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_av_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1514:2: ( (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? ) )
            // InternalRPG.g:1515:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? )
            {
            // InternalRPG.g:1515:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? )
            // InternalRPG.g:1516:3: otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAltAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRPG.g:1520:3: ( (otherlv_1= RULE_ID ) )
            // InternalRPG.g:1521:4: (otherlv_1= RULE_ID )
            {
            // InternalRPG.g:1521:4: (otherlv_1= RULE_ID )
            // InternalRPG.g:1522:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAltAttributeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_1, grammarAccess.getAltAttributeAccess().getAttributeAttributeCrossReference_1_0());
            				

            }


            }

            // InternalRPG.g:1533:3: ( (lv_av_2_0= ruleAttributeValues ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRPG.g:1534:4: (lv_av_2_0= ruleAttributeValues )
                    {
                    // InternalRPG.g:1534:4: (lv_av_2_0= ruleAttributeValues )
                    // InternalRPG.g:1535:5: lv_av_2_0= ruleAttributeValues
                    {

                    					newCompositeNode(grammarAccess.getAltAttributeAccess().getAvAttributeValuesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_av_2_0=ruleAttributeValues();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAltAttributeRule());
                    					}
                    					set(
                    						current,
                    						"av",
                    						lv_av_2_0,
                    						"mdsd.RPG.AttributeValues");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleAltAttribute"


    // $ANTLR start "entryRuleRule"
    // InternalRPG.g:1556:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRPG.g:1556:45: (iv_ruleRule= ruleRule EOF )
            // InternalRPG.g:1557:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRPG.g:1563:1: ruleRule returns [EObject current=null] : ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'is' ( (lv_sum_5_0= ruleSum ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_or_1_0 = null;

        EObject lv_sum_5_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1569:2: ( ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'is' ( (lv_sum_5_0= ruleSum ) ) ) )
            // InternalRPG.g:1570:2: ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'is' ( (lv_sum_5_0= ruleSum ) ) )
            {
            // InternalRPG.g:1570:2: ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'is' ( (lv_sum_5_0= ruleSum ) ) )
            // InternalRPG.g:1571:3: (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'is' ( (lv_sum_5_0= ruleSum ) )
            {
            // InternalRPG.g:1571:3: (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRPG.g:1572:4: otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_34); 

                    				newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIfKeyword_0_0());
                    			
                    // InternalRPG.g:1576:4: ( (lv_or_1_0= ruleORcondition ) )
                    // InternalRPG.g:1577:5: (lv_or_1_0= ruleORcondition )
                    {
                    // InternalRPG.g:1577:5: (lv_or_1_0= ruleORcondition )
                    // InternalRPG.g:1578:6: lv_or_1_0= ruleORcondition
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getOrORconditionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_or_1_0=ruleORcondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"or",
                    							lv_or_1_0,
                    							"mdsd.RPG.ORcondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getThenKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRPG.g:1600:3: ( (otherlv_3= RULE_ID ) )
            // InternalRPG.g:1601:4: (otherlv_3= RULE_ID )
            {
            // InternalRPG.g:1601:4: (otherlv_3= RULE_ID )
            // InternalRPG.g:1602:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getTargetAttributeCrossReference_1_0());
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getIsKeyword_2());
            		
            // InternalRPG.g:1617:3: ( (lv_sum_5_0= ruleSum ) )
            // InternalRPG.g:1618:4: (lv_sum_5_0= ruleSum )
            {
            // InternalRPG.g:1618:4: (lv_sum_5_0= ruleSum )
            // InternalRPG.g:1619:5: lv_sum_5_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getSumSumParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_sum_5_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"sum",
            						lv_sum_5_0,
            						"mdsd.RPG.Sum");
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleAdditionalRule"
    // InternalRPG.g:1640:1: entryRuleAdditionalRule returns [EObject current=null] : iv_ruleAdditionalRule= ruleAdditionalRule EOF ;
    public final EObject entryRuleAdditionalRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalRule = null;


        try {
            // InternalRPG.g:1640:55: (iv_ruleAdditionalRule= ruleAdditionalRule EOF )
            // InternalRPG.g:1641:2: iv_ruleAdditionalRule= ruleAdditionalRule EOF
            {
             newCompositeNode(grammarAccess.getAdditionalRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionalRule=ruleAdditionalRule();

            state._fsp--;

             current =iv_ruleAdditionalRule; 
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
    // $ANTLR end "entryRuleAdditionalRule"


    // $ANTLR start "ruleAdditionalRule"
    // InternalRPG.g:1647:1: ruleAdditionalRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_sum_2_0= ruleSum ) ) otherlv_3= 'hits' ( ( (lv_hits_4_0= 'user' ) ) | ( (lv_hits_5_0= 'enemy' ) ) ) ) ;
    public final EObject ruleAdditionalRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_hits_4_0=null;
        Token lv_hits_5_0=null;
        EObject lv_sum_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1653:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_sum_2_0= ruleSum ) ) otherlv_3= 'hits' ( ( (lv_hits_4_0= 'user' ) ) | ( (lv_hits_5_0= 'enemy' ) ) ) ) )
            // InternalRPG.g:1654:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_sum_2_0= ruleSum ) ) otherlv_3= 'hits' ( ( (lv_hits_4_0= 'user' ) ) | ( (lv_hits_5_0= 'enemy' ) ) ) )
            {
            // InternalRPG.g:1654:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_sum_2_0= ruleSum ) ) otherlv_3= 'hits' ( ( (lv_hits_4_0= 'user' ) ) | ( (lv_hits_5_0= 'enemy' ) ) ) )
            // InternalRPG.g:1655:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_sum_2_0= ruleSum ) ) otherlv_3= 'hits' ( ( (lv_hits_4_0= 'user' ) ) | ( (lv_hits_5_0= 'enemy' ) ) )
            {
            // InternalRPG.g:1655:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPG.g:1656:4: (otherlv_0= RULE_ID )
            {
            // InternalRPG.g:1656:4: (otherlv_0= RULE_ID )
            // InternalRPG.g:1657:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdditionalRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getAdditionalRuleAccess().getTargetAttributeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getAdditionalRuleAccess().getIsKeyword_1());
            		
            // InternalRPG.g:1672:3: ( (lv_sum_2_0= ruleSum ) )
            // InternalRPG.g:1673:4: (lv_sum_2_0= ruleSum )
            {
            // InternalRPG.g:1673:4: (lv_sum_2_0= ruleSum )
            // InternalRPG.g:1674:5: lv_sum_2_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getAdditionalRuleAccess().getSumSumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_37);
            lv_sum_2_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdditionalRuleRule());
            					}
            					set(
            						current,
            						"sum",
            						lv_sum_2_0,
            						"mdsd.RPG.Sum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getAdditionalRuleAccess().getHitsKeyword_3());
            		
            // InternalRPG.g:1695:3: ( ( (lv_hits_4_0= 'user' ) ) | ( (lv_hits_5_0= 'enemy' ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            else if ( (LA22_0==37) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalRPG.g:1696:4: ( (lv_hits_4_0= 'user' ) )
                    {
                    // InternalRPG.g:1696:4: ( (lv_hits_4_0= 'user' ) )
                    // InternalRPG.g:1697:5: (lv_hits_4_0= 'user' )
                    {
                    // InternalRPG.g:1697:5: (lv_hits_4_0= 'user' )
                    // InternalRPG.g:1698:6: lv_hits_4_0= 'user'
                    {
                    lv_hits_4_0=(Token)match(input,36,FOLLOW_2); 

                    						newLeafNode(lv_hits_4_0, grammarAccess.getAdditionalRuleAccess().getHitsUserKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAdditionalRuleRule());
                    						}
                    						setWithLastConsumed(current, "hits", lv_hits_4_0, "user");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:1711:4: ( (lv_hits_5_0= 'enemy' ) )
                    {
                    // InternalRPG.g:1711:4: ( (lv_hits_5_0= 'enemy' ) )
                    // InternalRPG.g:1712:5: (lv_hits_5_0= 'enemy' )
                    {
                    // InternalRPG.g:1712:5: (lv_hits_5_0= 'enemy' )
                    // InternalRPG.g:1713:6: lv_hits_5_0= 'enemy'
                    {
                    lv_hits_5_0=(Token)match(input,37,FOLLOW_2); 

                    						newLeafNode(lv_hits_5_0, grammarAccess.getAdditionalRuleAccess().getHitsEnemyKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAdditionalRuleRule());
                    						}
                    						setWithLastConsumed(current, "hits", lv_hits_5_0, "enemy");
                    					

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
    // $ANTLR end "ruleAdditionalRule"


    // $ANTLR start "entryRuleAdditionalBuffRule"
    // InternalRPG.g:1730:1: entryRuleAdditionalBuffRule returns [EObject current=null] : iv_ruleAdditionalBuffRule= ruleAdditionalBuffRule EOF ;
    public final EObject entryRuleAdditionalBuffRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalBuffRule = null;


        try {
            // InternalRPG.g:1730:59: (iv_ruleAdditionalBuffRule= ruleAdditionalBuffRule EOF )
            // InternalRPG.g:1731:2: iv_ruleAdditionalBuffRule= ruleAdditionalBuffRule EOF
            {
             newCompositeNode(grammarAccess.getAdditionalBuffRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionalBuffRule=ruleAdditionalBuffRule();

            state._fsp--;

             current =iv_ruleAdditionalBuffRule; 
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
    // $ANTLR end "entryRuleAdditionalBuffRule"


    // $ANTLR start "ruleAdditionalBuffRule"
    // InternalRPG.g:1737:1: ruleAdditionalBuffRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_sum_2_0= ruleSum ) ) ) ;
    public final EObject ruleAdditionalBuffRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_sum_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1743:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_sum_2_0= ruleSum ) ) ) )
            // InternalRPG.g:1744:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_sum_2_0= ruleSum ) ) )
            {
            // InternalRPG.g:1744:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_sum_2_0= ruleSum ) ) )
            // InternalRPG.g:1745:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_sum_2_0= ruleSum ) )
            {
            // InternalRPG.g:1745:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPG.g:1746:4: (otherlv_0= RULE_ID )
            {
            // InternalRPG.g:1746:4: (otherlv_0= RULE_ID )
            // InternalRPG.g:1747:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdditionalBuffRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getAdditionalBuffRuleAccess().getTargetAttributeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getAdditionalBuffRuleAccess().getIsKeyword_1());
            		
            // InternalRPG.g:1762:3: ( (lv_sum_2_0= ruleSum ) )
            // InternalRPG.g:1763:4: (lv_sum_2_0= ruleSum )
            {
            // InternalRPG.g:1763:4: (lv_sum_2_0= ruleSum )
            // InternalRPG.g:1764:5: lv_sum_2_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getAdditionalBuffRuleAccess().getSumSumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_sum_2_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdditionalBuffRuleRule());
            					}
            					set(
            						current,
            						"sum",
            						lv_sum_2_0,
            						"mdsd.RPG.Sum");
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
    // $ANTLR end "ruleAdditionalBuffRule"


    // $ANTLR start "entryRuleEntities"
    // InternalRPG.g:1785:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // InternalRPG.g:1785:49: (iv_ruleEntities= ruleEntities EOF )
            // InternalRPG.g:1786:2: iv_ruleEntities= ruleEntities EOF
            {
             newCompositeNode(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntities=ruleEntities();

            state._fsp--;

             current =iv_ruleEntities; 
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
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // InternalRPG.g:1792:1: ruleEntities returns [EObject current=null] : (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_entity_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1798:2: ( (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) )
            // InternalRPG.g:1799:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            {
            // InternalRPG.g:1799:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            // InternalRPG.g:1800:3: otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+
            {
            otherlv_0=(Token)match(input,38,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getEntitiesAccess().getEntitiesKeyword_0());
            		
            // InternalRPG.g:1804:3: ( (lv_entity_1_0= ruleEntity ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRPG.g:1805:4: (lv_entity_1_0= ruleEntity )
            	    {
            	    // InternalRPG.g:1805:4: (lv_entity_1_0= ruleEntity )
            	    // InternalRPG.g:1806:5: lv_entity_1_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getEntityEntityParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_40);
            	    lv_entity_1_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entity",
            	    						lv_entity_1_0,
            	    						"mdsd.RPG.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRuleDeath"
    // InternalRPG.g:1827:1: entryRuleDeath returns [EObject current=null] : iv_ruleDeath= ruleDeath EOF ;
    public final EObject entryRuleDeath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeath = null;


        try {
            // InternalRPG.g:1827:46: (iv_ruleDeath= ruleDeath EOF )
            // InternalRPG.g:1828:2: iv_ruleDeath= ruleDeath EOF
            {
             newCompositeNode(grammarAccess.getDeathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeath=ruleDeath();

            state._fsp--;

             current =iv_ruleDeath; 
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
    // $ANTLR end "entryRuleDeath"


    // $ANTLR start "ruleDeath"
    // InternalRPG.g:1834:1: ruleDeath returns [EObject current=null] : (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) ) ;
    public final EObject ruleDeath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_req_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1840:2: ( (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) ) )
            // InternalRPG.g:1841:2: (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) )
            {
            // InternalRPG.g:1841:2: (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) )
            // InternalRPG.g:1842:3: otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getDeathAccess().getDeathKeyword_0());
            		
            // InternalRPG.g:1846:3: ( (lv_req_1_0= ruleRequire ) )
            // InternalRPG.g:1847:4: (lv_req_1_0= ruleRequire )
            {
            // InternalRPG.g:1847:4: (lv_req_1_0= ruleRequire )
            // InternalRPG.g:1848:5: lv_req_1_0= ruleRequire
            {

            					newCompositeNode(grammarAccess.getDeathAccess().getReqRequireParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_req_1_0=ruleRequire();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeathRule());
            					}
            					set(
            						current,
            						"req",
            						lv_req_1_0,
            						"mdsd.RPG.Require");
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
    // $ANTLR end "ruleDeath"


    // $ANTLR start "entryRuleEntity"
    // InternalRPG.g:1869:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalRPG.g:1869:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalRPG.g:1870:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalRPG.g:1876:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_eType_4_0= ruleEType ) ) ( (lv_att_5_0= ruleAltAttribute ) )* ( (lv_eMoves_6_0= ruleEntityMoves ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_eType_4_0 = null;

        EObject lv_att_5_0 = null;

        EObject lv_eMoves_6_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:1882:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_eType_4_0= ruleEType ) ) ( (lv_att_5_0= ruleAltAttribute ) )* ( (lv_eMoves_6_0= ruleEntityMoves ) ) ) )
            // InternalRPG.g:1883:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_eType_4_0= ruleEType ) ) ( (lv_att_5_0= ruleAltAttribute ) )* ( (lv_eMoves_6_0= ruleEntityMoves ) ) )
            {
            // InternalRPG.g:1883:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_eType_4_0= ruleEType ) ) ( (lv_att_5_0= ruleAltAttribute ) )* ( (lv_eMoves_6_0= ruleEntityMoves ) ) )
            // InternalRPG.g:1884:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_eType_4_0= ruleEType ) ) ( (lv_att_5_0= ruleAltAttribute ) )* ( (lv_eMoves_6_0= ruleEntityMoves ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalRPG.g:1888:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:1889:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:1889:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:1890:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:1906:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRPG.g:1907:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalRPG.g:1911:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRPG.g:1912:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRPG.g:1912:5: (otherlv_3= RULE_ID )
                    // InternalRPG.g:1913:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRPG.g:1925:3: ( (lv_eType_4_0= ruleEType ) )
            // InternalRPG.g:1926:4: (lv_eType_4_0= ruleEType )
            {
            // InternalRPG.g:1926:4: (lv_eType_4_0= ruleEType )
            // InternalRPG.g:1927:5: lv_eType_4_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getETypeETypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_43);
            lv_eType_4_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"eType",
            						lv_eType_4_0,
            						"mdsd.RPG.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPG.g:1944:3: ( (lv_att_5_0= ruleAltAttribute ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==20) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRPG.g:1945:4: (lv_att_5_0= ruleAltAttribute )
            	    {
            	    // InternalRPG.g:1945:4: (lv_att_5_0= ruleAltAttribute )
            	    // InternalRPG.g:1946:5: lv_att_5_0= ruleAltAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttAltAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_att_5_0=ruleAltAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"att",
            	    						lv_att_5_0,
            	    						"mdsd.RPG.AltAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalRPG.g:1963:3: ( (lv_eMoves_6_0= ruleEntityMoves ) )
            // InternalRPG.g:1964:4: (lv_eMoves_6_0= ruleEntityMoves )
            {
            // InternalRPG.g:1964:4: (lv_eMoves_6_0= ruleEntityMoves )
            // InternalRPG.g:1965:5: lv_eMoves_6_0= ruleEntityMoves
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getEMovesEntityMovesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_eMoves_6_0=ruleEntityMoves();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"eMoves",
            						lv_eMoves_6_0,
            						"mdsd.RPG.EntityMoves");
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityMoves"
    // InternalRPG.g:1986:1: entryRuleEntityMoves returns [EObject current=null] : iv_ruleEntityMoves= ruleEntityMoves EOF ;
    public final EObject entryRuleEntityMoves() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMoves = null;


        try {
            // InternalRPG.g:1986:52: (iv_ruleEntityMoves= ruleEntityMoves EOF )
            // InternalRPG.g:1987:2: iv_ruleEntityMoves= ruleEntityMoves EOF
            {
             newCompositeNode(grammarAccess.getEntityMovesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityMoves=ruleEntityMoves();

            state._fsp--;

             current =iv_ruleEntityMoves; 
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
    // $ANTLR end "entryRuleEntityMoves"


    // $ANTLR start "ruleEntityMoves"
    // InternalRPG.g:1993:1: ruleEntityMoves returns [EObject current=null] : (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ ) ;
    public final EObject ruleEntityMoves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRPG.g:1999:2: ( (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ ) )
            // InternalRPG.g:2000:2: (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ )
            {
            // InternalRPG.g:2000:2: (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ )
            // InternalRPG.g:2001:3: otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityMovesAccess().getMoveKeyword_0());
            		
            // InternalRPG.g:2005:3: ( (otherlv_1= RULE_ID ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRPG.g:2006:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalRPG.g:2006:4: (otherlv_1= RULE_ID )
            	    // InternalRPG.g:2007:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEntityMovesRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    					newLeafNode(otherlv_1, grammarAccess.getEntityMovesAccess().getMoveMoveCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
    // $ANTLR end "ruleEntityMoves"


    // $ANTLR start "entryRuleTeams"
    // InternalRPG.g:2022:1: entryRuleTeams returns [EObject current=null] : iv_ruleTeams= ruleTeams EOF ;
    public final EObject entryRuleTeams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeams = null;


        try {
            // InternalRPG.g:2022:46: (iv_ruleTeams= ruleTeams EOF )
            // InternalRPG.g:2023:2: iv_ruleTeams= ruleTeams EOF
            {
             newCompositeNode(grammarAccess.getTeamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeams=ruleTeams();

            state._fsp--;

             current =iv_ruleTeams; 
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
    // $ANTLR end "entryRuleTeams"


    // $ANTLR start "ruleTeams"
    // InternalRPG.g:2029:1: ruleTeams returns [EObject current=null] : (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ ) ;
    public final EObject ruleTeams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_team_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2035:2: ( (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ ) )
            // InternalRPG.g:2036:2: (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ )
            {
            // InternalRPG.g:2036:2: (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ )
            // InternalRPG.g:2037:3: otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+
            {
            otherlv_0=(Token)match(input,42,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamsAccess().getTeamsKeyword_0());
            		
            // InternalRPG.g:2041:3: ( (lv_team_1_0= ruleTeam ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==43) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRPG.g:2042:4: (lv_team_1_0= ruleTeam )
            	    {
            	    // InternalRPG.g:2042:4: (lv_team_1_0= ruleTeam )
            	    // InternalRPG.g:2043:5: lv_team_1_0= ruleTeam
            	    {

            	    					newCompositeNode(grammarAccess.getTeamsAccess().getTeamTeamParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_45);
            	    lv_team_1_0=ruleTeam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTeamsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"team",
            	    						lv_team_1_0,
            	    						"mdsd.RPG.Team");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
    // $ANTLR end "ruleTeams"


    // $ANTLR start "entryRuleTeam"
    // InternalRPG.g:2064:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // InternalRPG.g:2064:45: (iv_ruleTeam= ruleTeam EOF )
            // InternalRPG.g:2065:2: iv_ruleTeam= ruleTeam EOF
            {
             newCompositeNode(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeam=ruleTeam();

            state._fsp--;

             current =iv_ruleTeam; 
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
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalRPG.g:2071:1: ruleTeam returns [EObject current=null] : (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) ) ;
    public final EObject ruleTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_members_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2077:2: ( (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) ) )
            // InternalRPG.g:2078:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) )
            {
            // InternalRPG.g:2078:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) )
            // InternalRPG.g:2079:3: otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamAccess().getTeamKeyword_0());
            		
            // InternalRPG.g:2083:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPG.g:2084:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPG.g:2084:4: (lv_name_1_0= RULE_ID )
            // InternalRPG.g:2085:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPG.g:2101:3: ( (lv_members_2_0= ruleMembers ) )
            // InternalRPG.g:2102:4: (lv_members_2_0= ruleMembers )
            {
            // InternalRPG.g:2102:4: (lv_members_2_0= ruleMembers )
            // InternalRPG.g:2103:5: lv_members_2_0= ruleMembers
            {

            					newCompositeNode(grammarAccess.getTeamAccess().getMembersMembersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_members_2_0=ruleMembers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamRule());
            					}
            					set(
            						current,
            						"members",
            						lv_members_2_0,
            						"mdsd.RPG.Members");
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
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleMembers"
    // InternalRPG.g:2124:1: entryRuleMembers returns [EObject current=null] : iv_ruleMembers= ruleMembers EOF ;
    public final EObject entryRuleMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembers = null;


        try {
            // InternalRPG.g:2124:48: (iv_ruleMembers= ruleMembers EOF )
            // InternalRPG.g:2125:2: iv_ruleMembers= ruleMembers EOF
            {
             newCompositeNode(grammarAccess.getMembersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMembers=ruleMembers();

            state._fsp--;

             current =iv_ruleMembers; 
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
    // $ANTLR end "entryRuleMembers"


    // $ANTLR start "ruleMembers"
    // InternalRPG.g:2131:1: ruleMembers returns [EObject current=null] : (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) ;
    public final EObject ruleMembers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRPG.g:2137:2: ( (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) )
            // InternalRPG.g:2138:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            {
            // InternalRPG.g:2138:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            // InternalRPG.g:2139:3: otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMembersAccess().getMembersKeyword_0());
            		
            // InternalRPG.g:2143:3: ( (otherlv_1= RULE_ID ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRPG.g:2144:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalRPG.g:2144:4: (otherlv_1= RULE_ID )
            	    // InternalRPG.g:2145:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMembersRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMembersAccess().getEntityEntityCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // $ANTLR end "ruleMembers"


    // $ANTLR start "entryRuleRequire"
    // InternalRPG.g:2160:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalRPG.g:2160:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalRPG.g:2161:2: iv_ruleRequire= ruleRequire EOF
            {
             newCompositeNode(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequire=ruleRequire();

            state._fsp--;

             current =iv_ruleRequire; 
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
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalRPG.g:2167:1: ruleRequire returns [EObject current=null] : (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_log_1_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2173:2: ( (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) ) )
            // InternalRPG.g:2174:2: (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) )
            {
            // InternalRPG.g:2174:2: (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) )
            // InternalRPG.g:2175:3: otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireKeyword_0());
            		
            // InternalRPG.g:2179:3: ( (lv_log_1_0= ruleORcondition ) )
            // InternalRPG.g:2180:4: (lv_log_1_0= ruleORcondition )
            {
            // InternalRPG.g:2180:4: (lv_log_1_0= ruleORcondition )
            // InternalRPG.g:2181:5: lv_log_1_0= ruleORcondition
            {

            					newCompositeNode(grammarAccess.getRequireAccess().getLogORconditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_log_1_0=ruleORcondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequireRule());
            					}
            					set(
            						current,
            						"log",
            						lv_log_1_0,
            						"mdsd.RPG.ORcondition");
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
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleORcondition"
    // InternalRPG.g:2202:1: entryRuleORcondition returns [EObject current=null] : iv_ruleORcondition= ruleORcondition EOF ;
    public final EObject entryRuleORcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORcondition = null;


        try {
            // InternalRPG.g:2202:52: (iv_ruleORcondition= ruleORcondition EOF )
            // InternalRPG.g:2203:2: iv_ruleORcondition= ruleORcondition EOF
            {
             newCompositeNode(grammarAccess.getORconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleORcondition=ruleORcondition();

            state._fsp--;

             current =iv_ruleORcondition; 
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
    // $ANTLR end "entryRuleORcondition"


    // $ANTLR start "ruleORcondition"
    // InternalRPG.g:2209:1: ruleORcondition returns [EObject current=null] : (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) ;
    public final EObject ruleORcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ANDcondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2215:2: ( (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) )
            // InternalRPG.g:2216:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            {
            // InternalRPG.g:2216:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            // InternalRPG.g:2217:3: this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            {

            			newCompositeNode(grammarAccess.getORconditionAccess().getANDconditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_ANDcondition_0=ruleANDcondition();

            state._fsp--;


            			current = this_ANDcondition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:2225:3: (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==46) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRPG.g:2226:4: otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) )
            	    {
            	    otherlv_1=(Token)match(input,46,FOLLOW_34); 

            	    				newLeafNode(otherlv_1, grammarAccess.getORconditionAccess().getORKeyword_1_0());
            	    			
            	    // InternalRPG.g:2230:4: ()
            	    // InternalRPG.g:2231:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getORconditionAccess().getOrLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRPG.g:2237:4: ( (lv_right_3_0= ruleANDcondition ) )
            	    // InternalRPG.g:2238:5: (lv_right_3_0= ruleANDcondition )
            	    {
            	    // InternalRPG.g:2238:5: (lv_right_3_0= ruleANDcondition )
            	    // InternalRPG.g:2239:6: lv_right_3_0= ruleANDcondition
            	    {

            	    						newCompositeNode(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_47);
            	    lv_right_3_0=ruleANDcondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getORconditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"mdsd.RPG.ANDcondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleORcondition"


    // $ANTLR start "entryRuleANDcondition"
    // InternalRPG.g:2261:1: entryRuleANDcondition returns [EObject current=null] : iv_ruleANDcondition= ruleANDcondition EOF ;
    public final EObject entryRuleANDcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDcondition = null;


        try {
            // InternalRPG.g:2261:53: (iv_ruleANDcondition= ruleANDcondition EOF )
            // InternalRPG.g:2262:2: iv_ruleANDcondition= ruleANDcondition EOF
            {
             newCompositeNode(grammarAccess.getANDconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleANDcondition=ruleANDcondition();

            state._fsp--;

             current =iv_ruleANDcondition; 
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
    // $ANTLR end "entryRuleANDcondition"


    // $ANTLR start "ruleANDcondition"
    // InternalRPG.g:2268:1: ruleANDcondition returns [EObject current=null] : (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) ;
    public final EObject ruleANDcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Statement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2274:2: ( (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) )
            // InternalRPG.g:2275:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            {
            // InternalRPG.g:2275:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            // InternalRPG.g:2276:3: this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            {

            			newCompositeNode(grammarAccess.getANDconditionAccess().getStatementParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_Statement_0=ruleStatement();

            state._fsp--;


            			current = this_Statement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:2284:3: (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRPG.g:2285:4: otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) )
            	    {
            	    otherlv_1=(Token)match(input,47,FOLLOW_34); 

            	    				newLeafNode(otherlv_1, grammarAccess.getANDconditionAccess().getANDKeyword_1_0());
            	    			
            	    // InternalRPG.g:2289:4: ()
            	    // InternalRPG.g:2290:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getANDconditionAccess().getAndLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRPG.g:2296:4: ( (lv_right_3_0= ruleStatement ) )
            	    // InternalRPG.g:2297:5: (lv_right_3_0= ruleStatement )
            	    {
            	    // InternalRPG.g:2297:5: (lv_right_3_0= ruleStatement )
            	    // InternalRPG.g:2298:6: lv_right_3_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_right_3_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getANDconditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"mdsd.RPG.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleANDcondition"


    // $ANTLR start "entryRuleStatement"
    // InternalRPG.g:2320:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRPG.g:2320:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRPG.g:2321:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRPG.g:2327:1: ruleStatement returns [EObject current=null] : (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_NumberComparing_0 = null;

        EObject this_ORcondition_2 = null;



        	enterRule();

        try {
            // InternalRPG.g:2333:2: ( (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) ) )
            // InternalRPG.g:2334:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) )
            {
            // InternalRPG.g:2334:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_INT)) ) {
                alt31=1;
            }
            else if ( (LA31_0==48) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalRPG.g:2335:3: this_NumberComparing_0= ruleNumberComparing
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getNumberComparingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberComparing_0=ruleNumberComparing();

                    state._fsp--;


                    			current = this_NumberComparing_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:2344:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    {
                    // InternalRPG.g:2344:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    // InternalRPG.g:2345:4: otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_34); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getStatementAccess().getORconditionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_49);
                    this_ORcondition_2=ruleORcondition();

                    state._fsp--;


                    				current = this_ORcondition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,49,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleNumberComparing"
    // InternalRPG.g:2366:1: entryRuleNumberComparing returns [EObject current=null] : iv_ruleNumberComparing= ruleNumberComparing EOF ;
    public final EObject entryRuleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberComparing = null;


        try {
            // InternalRPG.g:2366:56: (iv_ruleNumberComparing= ruleNumberComparing EOF )
            // InternalRPG.g:2367:2: iv_ruleNumberComparing= ruleNumberComparing EOF
            {
             newCompositeNode(grammarAccess.getNumberComparingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberComparing=ruleNumberComparing();

            state._fsp--;

             current =iv_ruleNumberComparing; 
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
    // $ANTLR end "entryRuleNumberComparing"


    // $ANTLR start "ruleNumberComparing"
    // InternalRPG.g:2373:1: ruleNumberComparing returns [EObject current=null] : ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) ;
    public final EObject ruleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_comp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2379:2: ( ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) )
            // InternalRPG.g:2380:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            {
            // InternalRPG.g:2380:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            // InternalRPG.g:2381:3: ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) )
            {
            // InternalRPG.g:2381:3: ( (lv_left_0_0= ruleSum ) )
            // InternalRPG.g:2382:4: (lv_left_0_0= ruleSum )
            {
            // InternalRPG.g:2382:4: (lv_left_0_0= ruleSum )
            // InternalRPG.g:2383:5: lv_left_0_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_50);
            lv_left_0_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberComparingRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"mdsd.RPG.Sum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPG.g:2400:3: ( (lv_comp_1_0= ruleComparator ) )
            // InternalRPG.g:2401:4: (lv_comp_1_0= ruleComparator )
            {
            // InternalRPG.g:2401:4: (lv_comp_1_0= ruleComparator )
            // InternalRPG.g:2402:5: lv_comp_1_0= ruleComparator
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getCompComparatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
            lv_comp_1_0=ruleComparator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberComparingRule());
            					}
            					set(
            						current,
            						"comp",
            						lv_comp_1_0,
            						"mdsd.RPG.Comparator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPG.g:2419:3: ( (lv_right_2_0= ruleSum ) )
            // InternalRPG.g:2420:4: (lv_right_2_0= ruleSum )
            {
            // InternalRPG.g:2420:4: (lv_right_2_0= ruleSum )
            // InternalRPG.g:2421:5: lv_right_2_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getRightSumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberComparingRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"mdsd.RPG.Sum");
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
    // $ANTLR end "ruleNumberComparing"


    // $ANTLR start "entryRuleComparator"
    // InternalRPG.g:2442:1: entryRuleComparator returns [EObject current=null] : iv_ruleComparator= ruleComparator EOF ;
    public final EObject entryRuleComparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparator = null;


        try {
            // InternalRPG.g:2442:51: (iv_ruleComparator= ruleComparator EOF )
            // InternalRPG.g:2443:2: iv_ruleComparator= ruleComparator EOF
            {
             newCompositeNode(grammarAccess.getComparatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparator=ruleComparator();

            state._fsp--;

             current =iv_ruleComparator; 
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
    // $ANTLR end "entryRuleComparator"


    // $ANTLR start "ruleComparator"
    // InternalRPG.g:2449:1: ruleComparator returns [EObject current=null] : ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) ) ;
    public final EObject ruleComparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalRPG.g:2455:2: ( ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) ) )
            // InternalRPG.g:2456:2: ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) )
            {
            // InternalRPG.g:2456:2: ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt32=1;
                }
                break;
            case 50:
                {
                alt32=2;
                }
                break;
            case 51:
                {
                alt32=3;
                }
                break;
            case 52:
                {
                alt32=4;
                }
                break;
            case 53:
                {
                alt32=5;
                }
                break;
            case 54:
                {
                alt32=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalRPG.g:2457:3: ( () otherlv_1= '<' )
                    {
                    // InternalRPG.g:2457:3: ( () otherlv_1= '<' )
                    // InternalRPG.g:2458:4: () otherlv_1= '<'
                    {
                    // InternalRPG.g:2458:4: ()
                    // InternalRPG.g:2459:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getSmallerAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getComparatorAccess().getLessThanSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPG.g:2471:3: ( () otherlv_3= '<=' )
                    {
                    // InternalRPG.g:2471:3: ( () otherlv_3= '<=' )
                    // InternalRPG.g:2472:4: () otherlv_3= '<='
                    {
                    // InternalRPG.g:2472:4: ()
                    // InternalRPG.g:2473:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getSmallerEqAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,50,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getComparatorAccess().getLessThanSignEqualsSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPG.g:2485:3: ( () otherlv_5= '==' )
                    {
                    // InternalRPG.g:2485:3: ( () otherlv_5= '==' )
                    // InternalRPG.g:2486:4: () otherlv_5= '=='
                    {
                    // InternalRPG.g:2486:4: ()
                    // InternalRPG.g:2487:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getEqAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,51,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getComparatorAccess().getEqualsSignEqualsSignKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRPG.g:2499:3: ( () otherlv_7= '>=' )
                    {
                    // InternalRPG.g:2499:3: ( () otherlv_7= '>=' )
                    // InternalRPG.g:2500:4: () otherlv_7= '>='
                    {
                    // InternalRPG.g:2500:4: ()
                    // InternalRPG.g:2501:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getBiggerEqAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,52,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getComparatorAccess().getGreaterThanSignEqualsSignKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRPG.g:2513:3: ( () otherlv_9= '>' )
                    {
                    // InternalRPG.g:2513:3: ( () otherlv_9= '>' )
                    // InternalRPG.g:2514:4: () otherlv_9= '>'
                    {
                    // InternalRPG.g:2514:4: ()
                    // InternalRPG.g:2515:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getBiggerAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getComparatorAccess().getGreaterThanSignKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRPG.g:2527:3: ( () otherlv_11= '!=' )
                    {
                    // InternalRPG.g:2527:3: ( () otherlv_11= '!=' )
                    // InternalRPG.g:2528:4: () otherlv_11= '!='
                    {
                    // InternalRPG.g:2528:4: ()
                    // InternalRPG.g:2529:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getNEqAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,54,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getComparatorAccess().getExclamationMarkEqualsSignKeyword_5_1());
                    			

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
    // $ANTLR end "ruleComparator"


    // $ANTLR start "entryRuleSum"
    // InternalRPG.g:2544:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalRPG.g:2544:44: (iv_ruleSum= ruleSum EOF )
            // InternalRPG.g:2545:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
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
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalRPG.g:2551:1: ruleSum returns [EObject current=null] : (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Multiply_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2557:2: ( (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) )
            // InternalRPG.g:2558:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            {
            // InternalRPG.g:2558:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            // InternalRPG.g:2559:3: this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            {

            			newCompositeNode(grammarAccess.getSumAccess().getMultiplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_51);
            this_Multiply_0=ruleMultiply();

            state._fsp--;


            			current = this_Multiply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:2567:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=55 && LA34_0<=56)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalRPG.g:2568:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) )
            	    {
            	    // InternalRPG.g:2568:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==55) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==56) ) {
            	        alt33=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalRPG.g:2569:5: (otherlv_1= '+' () )
            	            {
            	            // InternalRPG.g:2569:5: (otherlv_1= '+' () )
            	            // InternalRPG.g:2570:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,55,FOLLOW_36); 

            	            						newLeafNode(otherlv_1, grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalRPG.g:2574:6: ()
            	            // InternalRPG.g:2575:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRPG.g:2583:5: (otherlv_3= '-' () )
            	            {
            	            // InternalRPG.g:2583:5: (otherlv_3= '-' () )
            	            // InternalRPG.g:2584:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,56,FOLLOW_36); 

            	            						newLeafNode(otherlv_3, grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalRPG.g:2588:6: ()
            	            // InternalRPG.g:2589:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRPG.g:2597:4: ( (lv_right_5_0= ruleMultiply ) )
            	    // InternalRPG.g:2598:5: (lv_right_5_0= ruleMultiply )
            	    {
            	    // InternalRPG.g:2598:5: (lv_right_5_0= ruleMultiply )
            	    // InternalRPG.g:2599:6: lv_right_5_0= ruleMultiply
            	    {

            	    						newCompositeNode(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_51);
            	    lv_right_5_0=ruleMultiply();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSumRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"mdsd.RPG.Multiply");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleMultiply"
    // InternalRPG.g:2621:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalRPG.g:2621:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalRPG.g:2622:2: iv_ruleMultiply= ruleMultiply EOF
            {
             newCompositeNode(grammarAccess.getMultiplyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiply=ruleMultiply();

            state._fsp--;

             current =iv_ruleMultiply; 
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
    // $ANTLR end "entryRuleMultiply"


    // $ANTLR start "ruleMultiply"
    // InternalRPG.g:2628:1: ruleMultiply returns [EObject current=null] : (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_AtomicNumber_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRPG.g:2634:2: ( (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* ) )
            // InternalRPG.g:2635:2: (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* )
            {
            // InternalRPG.g:2635:2: (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* )
            // InternalRPG.g:2636:3: this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplyAccess().getAtomicNumberParserRuleCall_0());
            		
            pushFollow(FOLLOW_52);
            this_AtomicNumber_0=ruleAtomicNumber();

            state._fsp--;


            			current = this_AtomicNumber_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPG.g:2644:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=57 && LA36_0<=58)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRPG.g:2645:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) )
            	    {
            	    // InternalRPG.g:2645:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==57) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==58) ) {
            	        alt35=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalRPG.g:2646:5: (otherlv_1= '*' () )
            	            {
            	            // InternalRPG.g:2646:5: (otherlv_1= '*' () )
            	            // InternalRPG.g:2647:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,57,FOLLOW_36); 

            	            						newLeafNode(otherlv_1, grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalRPG.g:2651:6: ()
            	            // InternalRPG.g:2652:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRPG.g:2660:5: (otherlv_3= '/' () )
            	            {
            	            // InternalRPG.g:2660:5: (otherlv_3= '/' () )
            	            // InternalRPG.g:2661:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,58,FOLLOW_36); 

            	            						newLeafNode(otherlv_3, grammarAccess.getMultiplyAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalRPG.g:2665:6: ()
            	            // InternalRPG.g:2666:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRPG.g:2674:4: ( (lv_right_5_0= ruleAtomicNumber ) )
            	    // InternalRPG.g:2675:5: (lv_right_5_0= ruleAtomicNumber )
            	    {
            	    // InternalRPG.g:2675:5: (lv_right_5_0= ruleAtomicNumber )
            	    // InternalRPG.g:2676:6: lv_right_5_0= ruleAtomicNumber
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_52);
            	    lv_right_5_0=ruleAtomicNumber();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplyRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"mdsd.RPG.AtomicNumber");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // $ANTLR end "ruleMultiply"


    // $ANTLR start "entryRuleAtomicNumber"
    // InternalRPG.g:2698:1: entryRuleAtomicNumber returns [EObject current=null] : iv_ruleAtomicNumber= ruleAtomicNumber EOF ;
    public final EObject entryRuleAtomicNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicNumber = null;


        try {
            // InternalRPG.g:2698:53: (iv_ruleAtomicNumber= ruleAtomicNumber EOF )
            // InternalRPG.g:2699:2: iv_ruleAtomicNumber= ruleAtomicNumber EOF
            {
             newCompositeNode(grammarAccess.getAtomicNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicNumber=ruleAtomicNumber();

            state._fsp--;

             current =iv_ruleAtomicNumber; 
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
    // $ANTLR end "entryRuleAtomicNumber"


    // $ANTLR start "ruleAtomicNumber"
    // InternalRPG.g:2705:1: ruleAtomicNumber returns [EObject current=null] : (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute ) ;
    public final EObject ruleAtomicNumber() throws RecognitionException {
        EObject current = null;

        EObject this_ActualNumbers_0 = null;

        EObject this_NameAttribute_1 = null;



        	enterRule();

        try {
            // InternalRPG.g:2711:2: ( (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute ) )
            // InternalRPG.g:2712:2: (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute )
            {
            // InternalRPG.g:2712:2: (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalRPG.g:2713:3: this_ActualNumbers_0= ruleActualNumbers
                    {

                    			newCompositeNode(grammarAccess.getAtomicNumberAccess().getActualNumbersParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActualNumbers_0=ruleActualNumbers();

                    state._fsp--;


                    			current = this_ActualNumbers_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:2722:3: this_NameAttribute_1= ruleNameAttribute
                    {

                    			newCompositeNode(grammarAccess.getAtomicNumberAccess().getNameAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameAttribute_1=ruleNameAttribute();

                    state._fsp--;


                    			current = this_NameAttribute_1;
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
    // $ANTLR end "ruleAtomicNumber"


    // $ANTLR start "entryRuleActualNumbers"
    // InternalRPG.g:2734:1: entryRuleActualNumbers returns [EObject current=null] : iv_ruleActualNumbers= ruleActualNumbers EOF ;
    public final EObject entryRuleActualNumbers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualNumbers = null;


        try {
            // InternalRPG.g:2734:54: (iv_ruleActualNumbers= ruleActualNumbers EOF )
            // InternalRPG.g:2735:2: iv_ruleActualNumbers= ruleActualNumbers EOF
            {
             newCompositeNode(grammarAccess.getActualNumbersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActualNumbers=ruleActualNumbers();

            state._fsp--;

             current =iv_ruleActualNumbers; 
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
    // $ANTLR end "entryRuleActualNumbers"


    // $ANTLR start "ruleActualNumbers"
    // InternalRPG.g:2741:1: ruleActualNumbers returns [EObject current=null] : (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum ) ;
    public final EObject ruleActualNumbers() throws RecognitionException {
        EObject current = null;

        EObject this_FloatNum_0 = null;

        EObject this_IntNum_1 = null;



        	enterRule();

        try {
            // InternalRPG.g:2747:2: ( (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum ) )
            // InternalRPG.g:2748:2: (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum )
            {
            // InternalRPG.g:2748:2: (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==EOF||(LA38_1>=12 && LA38_1<=13)||(LA38_1>=15 && LA38_1<=16)||(LA38_1>=18 && LA38_1<=22)||(LA38_1>=24 && LA38_1<=25)||(LA38_1>=28 && LA38_1<=31)||(LA38_1>=34 && LA38_1<=35)||(LA38_1>=38 && LA38_1<=39)||LA38_1==42||(LA38_1>=46 && LA38_1<=47)||(LA38_1>=49 && LA38_1<=58)) ) {
                    alt38=2;
                }
                else if ( (LA38_1==59) ) {
                    alt38=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalRPG.g:2749:3: this_FloatNum_0= ruleFloatNum
                    {

                    			newCompositeNode(grammarAccess.getActualNumbersAccess().getFloatNumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatNum_0=ruleFloatNum();

                    state._fsp--;


                    			current = this_FloatNum_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:2758:3: this_IntNum_1= ruleIntNum
                    {

                    			newCompositeNode(grammarAccess.getActualNumbersAccess().getIntNumParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntNum_1=ruleIntNum();

                    state._fsp--;


                    			current = this_IntNum_1;
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
    // $ANTLR end "ruleActualNumbers"


    // $ANTLR start "entryRuleNameAttribute"
    // InternalRPG.g:2770:1: entryRuleNameAttribute returns [EObject current=null] : iv_ruleNameAttribute= ruleNameAttribute EOF ;
    public final EObject entryRuleNameAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameAttribute = null;


        try {
            // InternalRPG.g:2770:54: (iv_ruleNameAttribute= ruleNameAttribute EOF )
            // InternalRPG.g:2771:2: iv_ruleNameAttribute= ruleNameAttribute EOF
            {
             newCompositeNode(grammarAccess.getNameAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameAttribute=ruleNameAttribute();

            state._fsp--;

             current =iv_ruleNameAttribute; 
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
    // $ANTLR end "entryRuleNameAttribute"


    // $ANTLR start "ruleNameAttribute"
    // InternalRPG.g:2777:1: ruleNameAttribute returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNameAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRPG.g:2783:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRPG.g:2784:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRPG.g:2784:2: ( (otherlv_0= RULE_ID ) )
            // InternalRPG.g:2785:3: (otherlv_0= RULE_ID )
            {
            // InternalRPG.g:2785:3: (otherlv_0= RULE_ID )
            // InternalRPG.g:2786:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNameAttributeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getNameAttributeAccess().getAttributeAttributeCrossReference_0());
            			

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
    // $ANTLR end "ruleNameAttribute"


    // $ANTLR start "entryRuleIntNum"
    // InternalRPG.g:2800:1: entryRuleIntNum returns [EObject current=null] : iv_ruleIntNum= ruleIntNum EOF ;
    public final EObject entryRuleIntNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntNum = null;


        try {
            // InternalRPG.g:2800:47: (iv_ruleIntNum= ruleIntNum EOF )
            // InternalRPG.g:2801:2: iv_ruleIntNum= ruleIntNum EOF
            {
             newCompositeNode(grammarAccess.getIntNumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntNum=ruleIntNum();

            state._fsp--;

             current =iv_ruleIntNum; 
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
    // $ANTLR end "entryRuleIntNum"


    // $ANTLR start "ruleIntNum"
    // InternalRPG.g:2807:1: ruleIntNum returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntNum() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRPG.g:2813:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRPG.g:2814:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRPG.g:2814:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRPG.g:2815:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRPG.g:2815:3: (lv_value_0_0= RULE_INT )
            // InternalRPG.g:2816:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntNumAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntNumRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntNum"


    // $ANTLR start "entryRuleFloatNum"
    // InternalRPG.g:2835:1: entryRuleFloatNum returns [EObject current=null] : iv_ruleFloatNum= ruleFloatNum EOF ;
    public final EObject entryRuleFloatNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatNum = null;


        try {
            // InternalRPG.g:2835:49: (iv_ruleFloatNum= ruleFloatNum EOF )
            // InternalRPG.g:2836:2: iv_ruleFloatNum= ruleFloatNum EOF
            {
             newCompositeNode(grammarAccess.getFloatNumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatNum=ruleFloatNum();

            state._fsp--;

             current =iv_ruleFloatNum; 
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
    // $ANTLR end "entryRuleFloatNum"


    // $ANTLR start "ruleFloatNum"
    // InternalRPG.g:2842:1: ruleFloatNum returns [EObject current=null] : ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFloatNum() throws RecognitionException {
        EObject current = null;

        Token lv_i_0_0=null;
        Token otherlv_1=null;
        Token lv_decimal_2_0=null;


        	enterRule();

        try {
            // InternalRPG.g:2848:2: ( ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) ) )
            // InternalRPG.g:2849:2: ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )
            {
            // InternalRPG.g:2849:2: ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )
            // InternalRPG.g:2850:3: ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )
            {
            // InternalRPG.g:2850:3: ( (lv_i_0_0= RULE_INT ) )
            // InternalRPG.g:2851:4: (lv_i_0_0= RULE_INT )
            {
            // InternalRPG.g:2851:4: (lv_i_0_0= RULE_INT )
            // InternalRPG.g:2852:5: lv_i_0_0= RULE_INT
            {
            lv_i_0_0=(Token)match(input,RULE_INT,FOLLOW_53); 

            					newLeafNode(lv_i_0_0, grammarAccess.getFloatNumAccess().getIINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFloatNumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"i",
            						lv_i_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,59,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatNumAccess().getFullStopKeyword_1());
            		
            // InternalRPG.g:2872:3: ( (lv_decimal_2_0= RULE_INT ) )
            // InternalRPG.g:2873:4: (lv_decimal_2_0= RULE_INT )
            {
            // InternalRPG.g:2873:4: (lv_decimal_2_0= RULE_INT )
            // InternalRPG.g:2874:5: lv_decimal_2_0= RULE_INT
            {
            lv_decimal_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_decimal_2_0, grammarAccess.getFloatNumAccess().getDecimalINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFloatNumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"decimal",
            						lv_decimal_2_0,
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
    // $ANTLR end "ruleFloatNum"


    // $ANTLR start "entryRuleLegalType"
    // InternalRPG.g:2894:1: entryRuleLegalType returns [String current=null] : iv_ruleLegalType= ruleLegalType EOF ;
    public final String entryRuleLegalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLegalType = null;


        try {
            // InternalRPG.g:2894:49: (iv_ruleLegalType= ruleLegalType EOF )
            // InternalRPG.g:2895:2: iv_ruleLegalType= ruleLegalType EOF
            {
             newCompositeNode(grammarAccess.getLegalTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLegalType=ruleLegalType();

            state._fsp--;

             current =iv_ruleLegalType.getText(); 
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
    // $ANTLR end "entryRuleLegalType"


    // $ANTLR start "ruleLegalType"
    // InternalRPG.g:2901:1: ruleLegalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Float' | kw= 'Integer' ) ;
    public final AntlrDatatypeRuleToken ruleLegalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRPG.g:2907:2: ( (kw= 'Float' | kw= 'Integer' ) )
            // InternalRPG.g:2908:2: (kw= 'Float' | kw= 'Integer' )
            {
            // InternalRPG.g:2908:2: (kw= 'Float' | kw= 'Integer' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==60) ) {
                alt39=1;
            }
            else if ( (LA39_0==61) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalRPG.g:2909:3: kw= 'Float'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLegalTypeAccess().getFloatKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRPG.g:2915:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLegalTypeAccess().getIntegerKeyword_1());
                    		

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
    // $ANTLR end "ruleLegalType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000004C082241002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004400002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000102002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x3000000000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000400000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x007C000040000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0800000000000000L});

}