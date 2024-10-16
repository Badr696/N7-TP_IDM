package fr.n7.parser.antlr.internal;

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
import fr.n7.services.PDL1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Process'", "'{'", "'}'", "'wd'", "'with'", "'ws'", "'from'", "'to'", "'ressource'", "'note'", "'s2s'", "'f2s'", "'s2f'", "'f2f'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPDL1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDL1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDL1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL1.g"; }



     	private PDL1GrammarAccess grammarAccess;

        public InternalPDL1Parser(TokenStream input, PDL1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected PDL1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalPDL1.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalPDL1.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalPDL1.g:66:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL1.g:72:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_processElements_3_0 = null;



        	enterRule();

        try {
            // InternalPDL1.g:78:2: ( (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) )
            // InternalPDL1.g:79:2: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            {
            // InternalPDL1.g:79:2: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            // InternalPDL1.g:80:3: otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalPDL1.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL1.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL1.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalPDL1.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPDL1.g:106:3: ( (lv_processElements_3_0= ruleProcessElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||LA1_0==15||LA1_0==17||(LA1_0>=20 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPDL1.g:107:4: (lv_processElements_3_0= ruleProcessElement )
            	    {
            	    // InternalPDL1.g:107:4: (lv_processElements_3_0= ruleProcessElement )
            	    // InternalPDL1.g:108:5: lv_processElements_3_0= ruleProcessElement
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_processElements_3_0=ruleProcessElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processElements",
            	    						lv_processElements_3_0,
            	    						"fr.n7.PDL1.ProcessElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL1.g:133:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // InternalPDL1.g:133:55: (iv_ruleProcessElement= ruleProcessElement EOF )
            // InternalPDL1.g:134:2: iv_ruleProcessElement= ruleProcessElement EOF
            {
             newCompositeNode(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessElement=ruleProcessElement();

            state._fsp--;

             current =iv_ruleProcessElement; 
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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL1.g:140:1: ruleProcessElement returns [EObject current=null] : ( (this_WorkSequence_0= ruleWorkSequence | this_WorkDefinition_1= ruleWorkDefinition | this_Guidance_2= ruleGuidance | this_GestionRessources_3= ruleGestionRessources | this_Ressource_4= ruleRessource ) ( (otherlv_5= RULE_ID ) )? ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject this_WorkSequence_0 = null;

        EObject this_WorkDefinition_1 = null;

        EObject this_Guidance_2 = null;

        EObject this_GestionRessources_3 = null;

        EObject this_Ressource_4 = null;



        	enterRule();

        try {
            // InternalPDL1.g:146:2: ( ( (this_WorkSequence_0= ruleWorkSequence | this_WorkDefinition_1= ruleWorkDefinition | this_Guidance_2= ruleGuidance | this_GestionRessources_3= ruleGestionRessources | this_Ressource_4= ruleRessource ) ( (otherlv_5= RULE_ID ) )? ) )
            // InternalPDL1.g:147:2: ( (this_WorkSequence_0= ruleWorkSequence | this_WorkDefinition_1= ruleWorkDefinition | this_Guidance_2= ruleGuidance | this_GestionRessources_3= ruleGestionRessources | this_Ressource_4= ruleRessource ) ( (otherlv_5= RULE_ID ) )? )
            {
            // InternalPDL1.g:147:2: ( (this_WorkSequence_0= ruleWorkSequence | this_WorkDefinition_1= ruleWorkDefinition | this_Guidance_2= ruleGuidance | this_GestionRessources_3= ruleGestionRessources | this_Ressource_4= ruleRessource ) ( (otherlv_5= RULE_ID ) )? )
            // InternalPDL1.g:148:3: (this_WorkSequence_0= ruleWorkSequence | this_WorkDefinition_1= ruleWorkDefinition | this_Guidance_2= ruleGuidance | this_GestionRessources_3= ruleGestionRessources | this_Ressource_4= ruleRessource ) ( (otherlv_5= RULE_ID ) )?
            {
            // InternalPDL1.g:148:3: (this_WorkSequence_0= ruleWorkSequence | this_WorkDefinition_1= ruleWorkDefinition | this_Guidance_2= ruleGuidance | this_GestionRessources_3= ruleGestionRessources | this_Ressource_4= ruleRessource )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case RULE_INT:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPDL1.g:149:4: this_WorkSequence_0= ruleWorkSequence
                    {

                    				newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_WorkSequence_0=ruleWorkSequence();

                    state._fsp--;


                    				current = this_WorkSequence_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalPDL1.g:158:4: this_WorkDefinition_1= ruleWorkDefinition
                    {

                    				newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_6);
                    this_WorkDefinition_1=ruleWorkDefinition();

                    state._fsp--;


                    				current = this_WorkDefinition_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalPDL1.g:167:4: this_Guidance_2= ruleGuidance
                    {

                    				newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_6);
                    this_Guidance_2=ruleGuidance();

                    state._fsp--;


                    				current = this_Guidance_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalPDL1.g:176:4: this_GestionRessources_3= ruleGestionRessources
                    {

                    				newCompositeNode(grammarAccess.getProcessElementAccess().getGestionRessourcesParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_6);
                    this_GestionRessources_3=ruleGestionRessources();

                    state._fsp--;


                    				current = this_GestionRessources_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalPDL1.g:185:4: this_Ressource_4= ruleRessource
                    {

                    				newCompositeNode(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_6);
                    this_Ressource_4=ruleRessource();

                    state._fsp--;


                    				current = this_Ressource_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalPDL1.g:194:3: ( (otherlv_5= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPDL1.g:195:4: (otherlv_5= RULE_ID )
                    {
                    // InternalPDL1.g:195:4: (otherlv_5= RULE_ID )
                    // InternalPDL1.g:196:5: otherlv_5= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getProcessElementRule());
                    					}
                    				
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getProcessElementAccess().getProcessProcessCrossReference_1_0());
                    				

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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL1.g:211:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalPDL1.g:211:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalPDL1.g:212:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL1.g:218:1: ruleWorkDefinition returns [EObject current=null] : (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )* ( (otherlv_4= RULE_ID ) )? ( (otherlv_5= RULE_ID ) )? ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalPDL1.g:224:2: ( (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )* ( (otherlv_4= RULE_ID ) )? ( (otherlv_5= RULE_ID ) )? ) )
            // InternalPDL1.g:225:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )* ( (otherlv_4= RULE_ID ) )? ( (otherlv_5= RULE_ID ) )? )
            {
            // InternalPDL1.g:225:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )* ( (otherlv_4= RULE_ID ) )? ( (otherlv_5= RULE_ID ) )? )
            // InternalPDL1.g:226:3: otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )* ( (otherlv_4= RULE_ID ) )? ( (otherlv_5= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWdKeyword_0());
            		
            // InternalPDL1.g:230:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL1.g:231:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL1.g:231:4: (lv_name_1_0= RULE_ID )
            // InternalPDL1.g:232:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkDefinitionAccess().getWithKeyword_2());
            		
            // InternalPDL1.g:252:3: ( (otherlv_3= RULE_ID ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPDL1.g:253:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalPDL1.g:253:4: (otherlv_3= RULE_ID )
            	    // InternalPDL1.g:254:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getWorkDefinitionRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    					newLeafNode(otherlv_3, grammarAccess.getWorkDefinitionAccess().getGestionressourceGestionRessourcesCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalPDL1.g:265:3: ( (otherlv_4= RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPDL1.g:266:4: (otherlv_4= RULE_ID )
                    {
                    // InternalPDL1.g:266:4: (otherlv_4= RULE_ID )
                    // InternalPDL1.g:267:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_0());
                    				

                    }


                    }
                    break;

            }

            // InternalPDL1.g:278:3: ( (otherlv_5= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPDL1.g:279:4: (otherlv_5= RULE_ID )
                    {
                    // InternalPDL1.g:279:4: (otherlv_5= RULE_ID )
                    // InternalPDL1.g:280:5: otherlv_5= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    					}
                    				
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_0());
                    				

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL1.g:295:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalPDL1.g:295:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalPDL1.g:296:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL1.g:302:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_linkType_1_0 = null;



        	enterRule();

        try {
            // InternalPDL1.g:308:2: ( (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalPDL1.g:309:2: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalPDL1.g:309:2: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            // InternalPDL1.g:310:3: otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWsKeyword_0());
            		
            // InternalPDL1.g:314:3: ( (lv_linkType_1_0= ruleWorkSequenceType ) )
            // InternalPDL1.g:315:4: (lv_linkType_1_0= ruleWorkSequenceType )
            {
            // InternalPDL1.g:315:4: (lv_linkType_1_0= ruleWorkSequenceType )
            // InternalPDL1.g:316:5: lv_linkType_1_0= ruleWorkSequenceType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_linkType_1_0=ruleWorkSequenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"linkType",
            						lv_linkType_1_0,
            						"fr.n7.PDL1.WorkSequenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getFromKeyword_2());
            		
            // InternalPDL1.g:337:3: ( (otherlv_3= RULE_ID ) )
            // InternalPDL1.g:338:4: (otherlv_3= RULE_ID )
            {
            // InternalPDL1.g:338:4: (otherlv_3= RULE_ID )
            // InternalPDL1.g:339:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getToKeyword_4());
            		
            // InternalPDL1.g:354:3: ( (otherlv_5= RULE_ID ) )
            // InternalPDL1.g:355:4: (otherlv_5= RULE_ID )
            {
            // InternalPDL1.g:355:4: (otherlv_5= RULE_ID )
            // InternalPDL1.g:356:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0());
            				

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGestionRessources"
    // InternalPDL1.g:371:1: entryRuleGestionRessources returns [EObject current=null] : iv_ruleGestionRessources= ruleGestionRessources EOF ;
    public final EObject entryRuleGestionRessources() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGestionRessources = null;


        try {
            // InternalPDL1.g:371:58: (iv_ruleGestionRessources= ruleGestionRessources EOF )
            // InternalPDL1.g:372:2: iv_ruleGestionRessources= ruleGestionRessources EOF
            {
             newCompositeNode(grammarAccess.getGestionRessourcesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGestionRessources=ruleGestionRessources();

            state._fsp--;

             current =iv_ruleGestionRessources; 
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
    // $ANTLR end "entryRuleGestionRessources"


    // $ANTLR start "ruleGestionRessources"
    // InternalPDL1.g:378:1: ruleGestionRessources returns [EObject current=null] : ( ( (lv_quantite_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_utilisee_2_0= RULE_BOOLEAN ) )? ) ;
    public final EObject ruleGestionRessources() throws RecognitionException {
        EObject current = null;

        Token lv_quantite_0_0=null;
        Token otherlv_1=null;
        Token lv_utilisee_2_0=null;


        	enterRule();

        try {
            // InternalPDL1.g:384:2: ( ( ( (lv_quantite_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_utilisee_2_0= RULE_BOOLEAN ) )? ) )
            // InternalPDL1.g:385:2: ( ( (lv_quantite_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_utilisee_2_0= RULE_BOOLEAN ) )? )
            {
            // InternalPDL1.g:385:2: ( ( (lv_quantite_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_utilisee_2_0= RULE_BOOLEAN ) )? )
            // InternalPDL1.g:386:3: ( (lv_quantite_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_utilisee_2_0= RULE_BOOLEAN ) )?
            {
            // InternalPDL1.g:386:3: ( (lv_quantite_0_0= RULE_INT ) )
            // InternalPDL1.g:387:4: (lv_quantite_0_0= RULE_INT )
            {
            // InternalPDL1.g:387:4: (lv_quantite_0_0= RULE_INT )
            // InternalPDL1.g:388:5: lv_quantite_0_0= RULE_INT
            {
            lv_quantite_0_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_quantite_0_0, grammarAccess.getGestionRessourcesAccess().getQuantiteINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGestionRessourcesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantite",
            						lv_quantite_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalPDL1.g:404:3: ( (otherlv_1= RULE_ID ) )
            // InternalPDL1.g:405:4: (otherlv_1= RULE_ID )
            {
            // InternalPDL1.g:405:4: (otherlv_1= RULE_ID )
            // InternalPDL1.g:406:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGestionRessourcesRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_1, grammarAccess.getGestionRessourcesAccess().getRessourcesRessourceCrossReference_1_0());
            				

            }


            }

            // InternalPDL1.g:417:3: ( (lv_utilisee_2_0= RULE_BOOLEAN ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_BOOLEAN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPDL1.g:418:4: (lv_utilisee_2_0= RULE_BOOLEAN )
                    {
                    // InternalPDL1.g:418:4: (lv_utilisee_2_0= RULE_BOOLEAN )
                    // InternalPDL1.g:419:5: lv_utilisee_2_0= RULE_BOOLEAN
                    {
                    lv_utilisee_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    					newLeafNode(lv_utilisee_2_0, grammarAccess.getGestionRessourcesAccess().getUtiliseeBOOLEANTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGestionRessourcesRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"utilisee",
                    						lv_utilisee_2_0,
                    						"fr.n7.PDL1.BOOLEAN");
                    				

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
    // $ANTLR end "ruleGestionRessources"


    // $ANTLR start "entryRuleRessource"
    // InternalPDL1.g:439:1: entryRuleRessource returns [EObject current=null] : iv_ruleRessource= ruleRessource EOF ;
    public final EObject entryRuleRessource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessource = null;


        try {
            // InternalPDL1.g:439:50: (iv_ruleRessource= ruleRessource EOF )
            // InternalPDL1.g:440:2: iv_ruleRessource= ruleRessource EOF
            {
             newCompositeNode(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRessource=ruleRessource();

            state._fsp--;

             current =iv_ruleRessource; 
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
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalPDL1.g:446:1: ruleRessource returns [EObject current=null] : (otherlv_0= 'ressource' ( (lv_quantite_1_0= RULE_INT ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRessource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_quantite_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalPDL1.g:452:2: ( (otherlv_0= 'ressource' ( (lv_quantite_1_0= RULE_INT ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalPDL1.g:453:2: (otherlv_0= 'ressource' ( (lv_quantite_1_0= RULE_INT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalPDL1.g:453:2: (otherlv_0= 'ressource' ( (lv_quantite_1_0= RULE_INT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalPDL1.g:454:3: otherlv_0= 'ressource' ( (lv_quantite_1_0= RULE_INT ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRessourceAccess().getRessourceKeyword_0());
            		
            // InternalPDL1.g:458:3: ( (lv_quantite_1_0= RULE_INT ) )
            // InternalPDL1.g:459:4: (lv_quantite_1_0= RULE_INT )
            {
            // InternalPDL1.g:459:4: (lv_quantite_1_0= RULE_INT )
            // InternalPDL1.g:460:5: lv_quantite_1_0= RULE_INT
            {
            lv_quantite_1_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_quantite_1_0, grammarAccess.getRessourceAccess().getQuantiteINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantite",
            						lv_quantite_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalPDL1.g:476:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPDL1.g:477:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPDL1.g:477:4: (lv_name_2_0= RULE_ID )
            // InternalPDL1.g:478:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceRule());
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
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL1.g:498:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalPDL1.g:498:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalPDL1.g:499:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL1.g:505:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) ( (lv_elements_2_0= ruleProcessElement ) )* ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_texte_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalPDL1.g:511:2: ( (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) ( (lv_elements_2_0= ruleProcessElement ) )* ) )
            // InternalPDL1.g:512:2: (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) ( (lv_elements_2_0= ruleProcessElement ) )* )
            {
            // InternalPDL1.g:512:2: (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) ( (lv_elements_2_0= ruleProcessElement ) )* )
            // InternalPDL1.g:513:3: otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) ( (lv_elements_2_0= ruleProcessElement ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getNoteKeyword_0());
            		
            // InternalPDL1.g:517:3: ( (lv_texte_1_0= RULE_STRING ) )
            // InternalPDL1.g:518:4: (lv_texte_1_0= RULE_STRING )
            {
            // InternalPDL1.g:518:4: (lv_texte_1_0= RULE_STRING )
            // InternalPDL1.g:519:5: lv_texte_1_0= RULE_STRING
            {
            lv_texte_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_texte_1_0, grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuidanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texte",
            						lv_texte_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPDL1.g:535:3: ( (lv_elements_2_0= ruleProcessElement ) )*
            loop8:
            do {
                int alt8=2;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    alt8=1;
                    }
                    break;
                case 15:
                    {
                    alt8=1;
                    }
                    break;
                case 21:
                    {
                    alt8=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt8=1;
                    }
                    break;
                case 20:
                    {
                    alt8=1;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalPDL1.g:536:4: (lv_elements_2_0= ruleProcessElement )
            	    {
            	    // InternalPDL1.g:536:4: (lv_elements_2_0= ruleProcessElement )
            	    // InternalPDL1.g:537:5: lv_elements_2_0= ruleProcessElement
            	    {

            	    					newCompositeNode(grammarAccess.getGuidanceAccess().getElementsProcessElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_elements_2_0=ruleProcessElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGuidanceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"fr.n7.PDL1.ProcessElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL1.g:558:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPDL1.g:564:2: ( ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) )
            // InternalPDL1.g:565:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            {
            // InternalPDL1.g:565:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPDL1.g:566:3: (enumLiteral_0= 's2s' )
                    {
                    // InternalPDL1.g:566:3: (enumLiteral_0= 's2s' )
                    // InternalPDL1.g:567:4: enumLiteral_0= 's2s'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL1.g:574:3: (enumLiteral_1= 'f2s' )
                    {
                    // InternalPDL1.g:574:3: (enumLiteral_1= 'f2s' )
                    // InternalPDL1.g:575:4: enumLiteral_1= 'f2s'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL1.g:582:3: (enumLiteral_2= 's2f' )
                    {
                    // InternalPDL1.g:582:3: (enumLiteral_2= 's2f' )
                    // InternalPDL1.g:583:4: enumLiteral_2= 's2f'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL1.g:590:3: (enumLiteral_3= 'f2f' )
                    {
                    // InternalPDL1.g:590:3: (enumLiteral_3= 'f2f' )
                    // InternalPDL1.g:591:4: enumLiteral_3= 'f2f'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000032C020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000328022L});

}