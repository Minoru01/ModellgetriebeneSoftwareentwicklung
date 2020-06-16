package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.ZustandsdiagrammGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalZustandsdiagrammParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'initialState'", "':'", "'with'", "';'", "'finalState'", "'genericState'", "'event'", "'to'", "'and'", "'guard'"
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
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalZustandsdiagrammParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalZustandsdiagrammParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalZustandsdiagrammParser.tokenNames; }
    public String getGrammarFileName() { return "InternalZustandsdiagramm.g"; }



     	private ZustandsdiagrammGrammarAccess grammarAccess;

        public InternalZustandsdiagrammParser(TokenStream input, ZustandsdiagrammGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ZustandsdiagrammGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalZustandsdiagramm.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalZustandsdiagramm.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalZustandsdiagramm.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalZustandsdiagramm.g:71:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+ ) ) )+ {...}?) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_initialState_1_0 = null;

        EObject lv_finalState_2_0 = null;

        EObject lv_genericState_3_0 = null;



        	enterRule();

        try {
            // InternalZustandsdiagramm.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+ ) ) )+ {...}?) ) ) )
            // InternalZustandsdiagramm.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+ ) ) )+ {...}?) ) )
            {
            // InternalZustandsdiagramm.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+ ) ) )+ {...}?) ) )
            // InternalZustandsdiagramm.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+ ) ) )+ {...}?) )
            {
            // InternalZustandsdiagramm.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+ ) ) )+ {...}?) )
            // InternalZustandsdiagramm.g:80:4: ( ( ({...}? => ( ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+ ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            			
            // InternalZustandsdiagramm.g:83:4: ( ( ({...}? => ( ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+ ) ) )+ {...}?)
            // InternalZustandsdiagramm.g:84:5: ( ({...}? => ( ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+ ) ) )+ {...}?
            {
            // InternalZustandsdiagramm.g:84:5: ( ({...}? => ( ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+ ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                    alt3=3;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalZustandsdiagramm.g:85:3: ({...}? => ( ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) ) ) )
            	    {
            	    // InternalZustandsdiagramm.g:85:3: ({...}? => ( ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) ) ) )
            	    // InternalZustandsdiagramm.g:86:4: {...}? => ( ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalZustandsdiagramm.g:86:99: ( ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) ) )
            	    // InternalZustandsdiagramm.g:87:5: ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalZustandsdiagramm.g:90:8: ({...}? => ( (lv_initialState_1_0= ruleInitialState ) ) )
            	    // InternalZustandsdiagramm.g:90:9: {...}? => ( (lv_initialState_1_0= ruleInitialState ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalZustandsdiagramm.g:90:18: ( (lv_initialState_1_0= ruleInitialState ) )
            	    // InternalZustandsdiagramm.g:90:19: (lv_initialState_1_0= ruleInitialState )
            	    {
            	    // InternalZustandsdiagramm.g:90:19: (lv_initialState_1_0= ruleInitialState )
            	    // InternalZustandsdiagramm.g:91:9: lv_initialState_1_0= ruleInitialState
            	    {

            	    									newCompositeNode(grammarAccess.getModelAccess().getInitialStateInitialStateParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_initialState_1_0=ruleInitialState();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    									}
            	    									add(
            	    										current,
            	    										"initialState",
            	    										lv_initialState_1_0,
            	    										"org.xtext.example.mydsl.Zustandsdiagramm.InitialState");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalZustandsdiagramm.g:113:3: ({...}? => ( ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+ ) )
            	    {
            	    // InternalZustandsdiagramm.g:113:3: ({...}? => ( ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+ ) )
            	    // InternalZustandsdiagramm.g:114:4: {...}? => ( ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalZustandsdiagramm.g:114:99: ( ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+ )
            	    // InternalZustandsdiagramm.g:115:5: ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalZustandsdiagramm.g:118:8: ({...}? => ( (lv_finalState_2_0= ruleFinalState ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==15) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalZustandsdiagramm.g:118:9: {...}? => ( (lv_finalState_2_0= ruleFinalState ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // InternalZustandsdiagramm.g:118:18: ( (lv_finalState_2_0= ruleFinalState ) )
            	    	    // InternalZustandsdiagramm.g:118:19: (lv_finalState_2_0= ruleFinalState )
            	    	    {
            	    	    // InternalZustandsdiagramm.g:118:19: (lv_finalState_2_0= ruleFinalState )
            	    	    // InternalZustandsdiagramm.g:119:9: lv_finalState_2_0= ruleFinalState
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getModelAccess().getFinalStateFinalStateParserRuleCall_1_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_finalState_2_0=ruleFinalState();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"finalState",
            	    	    										lv_finalState_2_0,
            	    	    										"org.xtext.example.mydsl.Zustandsdiagramm.FinalState");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalZustandsdiagramm.g:141:3: ({...}? => ( ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+ ) )
            	    {
            	    // InternalZustandsdiagramm.g:141:3: ({...}? => ( ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+ ) )
            	    // InternalZustandsdiagramm.g:142:4: {...}? => ( ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalZustandsdiagramm.g:142:99: ( ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+ )
            	    // InternalZustandsdiagramm.g:143:5: ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalZustandsdiagramm.g:146:8: ({...}? => ( (lv_genericState_3_0= ruleGenericState ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==16) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalZustandsdiagramm.g:146:9: {...}? => ( (lv_genericState_3_0= ruleGenericState ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // InternalZustandsdiagramm.g:146:18: ( (lv_genericState_3_0= ruleGenericState ) )
            	    	    // InternalZustandsdiagramm.g:146:19: (lv_genericState_3_0= ruleGenericState )
            	    	    {
            	    	    // InternalZustandsdiagramm.g:146:19: (lv_genericState_3_0= ruleGenericState )
            	    	    // InternalZustandsdiagramm.g:147:9: lv_genericState_3_0= ruleGenericState
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getModelAccess().getGenericStateGenericStateParserRuleCall_2_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_genericState_3_0=ruleGenericState();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"genericState",
            	    	    										lv_genericState_3_0,
            	    	    										"org.xtext.example.mydsl.Zustandsdiagramm.GenericState");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTargetableState"
    // InternalZustandsdiagramm.g:180:1: entryRuleTargetableState returns [EObject current=null] : iv_ruleTargetableState= ruleTargetableState EOF ;
    public final EObject entryRuleTargetableState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetableState = null;


        try {
            // InternalZustandsdiagramm.g:180:56: (iv_ruleTargetableState= ruleTargetableState EOF )
            // InternalZustandsdiagramm.g:181:2: iv_ruleTargetableState= ruleTargetableState EOF
            {
             newCompositeNode(grammarAccess.getTargetableStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetableState=ruleTargetableState();

            state._fsp--;

             current =iv_ruleTargetableState; 
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
    // $ANTLR end "entryRuleTargetableState"


    // $ANTLR start "ruleTargetableState"
    // InternalZustandsdiagramm.g:187:1: ruleTargetableState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTargetableState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalZustandsdiagramm.g:193:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalZustandsdiagramm.g:194:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalZustandsdiagramm.g:194:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalZustandsdiagramm.g:195:3: (lv_name_0_0= RULE_ID )
            {
            // InternalZustandsdiagramm.g:195:3: (lv_name_0_0= RULE_ID )
            // InternalZustandsdiagramm.g:196:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTargetableStateAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTargetableStateRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleTargetableState"


    // $ANTLR start "entryRuleInitialState"
    // InternalZustandsdiagramm.g:215:1: entryRuleInitialState returns [EObject current=null] : iv_ruleInitialState= ruleInitialState EOF ;
    public final EObject entryRuleInitialState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialState = null;


        try {
            // InternalZustandsdiagramm.g:215:53: (iv_ruleInitialState= ruleInitialState EOF )
            // InternalZustandsdiagramm.g:216:2: iv_ruleInitialState= ruleInitialState EOF
            {
             newCompositeNode(grammarAccess.getInitialStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialState=ruleInitialState();

            state._fsp--;

             current =iv_ruleInitialState; 
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
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // InternalZustandsdiagramm.g:222:1: ruleInitialState returns [EObject current=null] : (otherlv_0= 'initialState' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= ';' ) ;
    public final EObject ruleInitialState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_transition_4_0 = null;



        	enterRule();

        try {
            // InternalZustandsdiagramm.g:228:2: ( (otherlv_0= 'initialState' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= ';' ) )
            // InternalZustandsdiagramm.g:229:2: (otherlv_0= 'initialState' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= ';' )
            {
            // InternalZustandsdiagramm.g:229:2: (otherlv_0= 'initialState' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= ';' )
            // InternalZustandsdiagramm.g:230:3: otherlv_0= 'initialState' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialStateAccess().getInitialStateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialStateAccess().getColonKeyword_1());
            		
            // InternalZustandsdiagramm.g:238:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalZustandsdiagramm.g:239:4: (lv_name_2_0= RULE_ID )
            {
            // InternalZustandsdiagramm.g:239:4: (lv_name_2_0= RULE_ID )
            // InternalZustandsdiagramm.g:240:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInitialStateAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getInitialStateAccess().getWithKeyword_3());
            		
            // InternalZustandsdiagramm.g:260:3: ( (lv_transition_4_0= ruleTransition ) )
            // InternalZustandsdiagramm.g:261:4: (lv_transition_4_0= ruleTransition )
            {
            // InternalZustandsdiagramm.g:261:4: (lv_transition_4_0= ruleTransition )
            // InternalZustandsdiagramm.g:262:5: lv_transition_4_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getInitialStateAccess().getTransitionTransitionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_transition_4_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialStateRule());
            					}
            					set(
            						current,
            						"transition",
            						lv_transition_4_0,
            						"org.xtext.example.mydsl.Zustandsdiagramm.Transition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInitialStateAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleFinalState"
    // InternalZustandsdiagramm.g:287:1: entryRuleFinalState returns [EObject current=null] : iv_ruleFinalState= ruleFinalState EOF ;
    public final EObject entryRuleFinalState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalState = null;


        try {
            // InternalZustandsdiagramm.g:287:51: (iv_ruleFinalState= ruleFinalState EOF )
            // InternalZustandsdiagramm.g:288:2: iv_ruleFinalState= ruleFinalState EOF
            {
             newCompositeNode(grammarAccess.getFinalStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalState=ruleFinalState();

            state._fsp--;

             current =iv_ruleFinalState; 
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
    // $ANTLR end "entryRuleFinalState"


    // $ANTLR start "ruleFinalState"
    // InternalZustandsdiagramm.g:294:1: ruleFinalState returns [EObject current=null] : (otherlv_0= 'finalState' otherlv_1= ':' ( (lv_name_2_0= ruleTargetableState ) ) otherlv_3= ';' ) ;
    public final EObject ruleFinalState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalZustandsdiagramm.g:300:2: ( (otherlv_0= 'finalState' otherlv_1= ':' ( (lv_name_2_0= ruleTargetableState ) ) otherlv_3= ';' ) )
            // InternalZustandsdiagramm.g:301:2: (otherlv_0= 'finalState' otherlv_1= ':' ( (lv_name_2_0= ruleTargetableState ) ) otherlv_3= ';' )
            {
            // InternalZustandsdiagramm.g:301:2: (otherlv_0= 'finalState' otherlv_1= ':' ( (lv_name_2_0= ruleTargetableState ) ) otherlv_3= ';' )
            // InternalZustandsdiagramm.g:302:3: otherlv_0= 'finalState' otherlv_1= ':' ( (lv_name_2_0= ruleTargetableState ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFinalStateAccess().getFinalStateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFinalStateAccess().getColonKeyword_1());
            		
            // InternalZustandsdiagramm.g:310:3: ( (lv_name_2_0= ruleTargetableState ) )
            // InternalZustandsdiagramm.g:311:4: (lv_name_2_0= ruleTargetableState )
            {
            // InternalZustandsdiagramm.g:311:4: (lv_name_2_0= ruleTargetableState )
            // InternalZustandsdiagramm.g:312:5: lv_name_2_0= ruleTargetableState
            {

            					newCompositeNode(grammarAccess.getFinalStateAccess().getNameTargetableStateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleTargetableState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.Zustandsdiagramm.TargetableState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFinalStateAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleFinalState"


    // $ANTLR start "entryRuleGenericState"
    // InternalZustandsdiagramm.g:337:1: entryRuleGenericState returns [EObject current=null] : iv_ruleGenericState= ruleGenericState EOF ;
    public final EObject entryRuleGenericState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericState = null;


        try {
            // InternalZustandsdiagramm.g:337:53: (iv_ruleGenericState= ruleGenericState EOF )
            // InternalZustandsdiagramm.g:338:2: iv_ruleGenericState= ruleGenericState EOF
            {
             newCompositeNode(grammarAccess.getGenericStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenericState=ruleGenericState();

            state._fsp--;

             current =iv_ruleGenericState; 
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
    // $ANTLR end "entryRuleGenericState"


    // $ANTLR start "ruleGenericState"
    // InternalZustandsdiagramm.g:344:1: ruleGenericState returns [EObject current=null] : (otherlv_0= 'genericState' otherlv_1= ':' ( (lv_name_2_0= ruleTargetableState ) ) otherlv_3= 'with' ( (lv_transitions_4_0= ruleTransition ) )+ otherlv_5= ';' ) ;
    public final EObject ruleGenericState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_name_2_0 = null;

        EObject lv_transitions_4_0 = null;



        	enterRule();

        try {
            // InternalZustandsdiagramm.g:350:2: ( (otherlv_0= 'genericState' otherlv_1= ':' ( (lv_name_2_0= ruleTargetableState ) ) otherlv_3= 'with' ( (lv_transitions_4_0= ruleTransition ) )+ otherlv_5= ';' ) )
            // InternalZustandsdiagramm.g:351:2: (otherlv_0= 'genericState' otherlv_1= ':' ( (lv_name_2_0= ruleTargetableState ) ) otherlv_3= 'with' ( (lv_transitions_4_0= ruleTransition ) )+ otherlv_5= ';' )
            {
            // InternalZustandsdiagramm.g:351:2: (otherlv_0= 'genericState' otherlv_1= ':' ( (lv_name_2_0= ruleTargetableState ) ) otherlv_3= 'with' ( (lv_transitions_4_0= ruleTransition ) )+ otherlv_5= ';' )
            // InternalZustandsdiagramm.g:352:3: otherlv_0= 'genericState' otherlv_1= ':' ( (lv_name_2_0= ruleTargetableState ) ) otherlv_3= 'with' ( (lv_transitions_4_0= ruleTransition ) )+ otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGenericStateAccess().getGenericStateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGenericStateAccess().getColonKeyword_1());
            		
            // InternalZustandsdiagramm.g:360:3: ( (lv_name_2_0= ruleTargetableState ) )
            // InternalZustandsdiagramm.g:361:4: (lv_name_2_0= ruleTargetableState )
            {
            // InternalZustandsdiagramm.g:361:4: (lv_name_2_0= ruleTargetableState )
            // InternalZustandsdiagramm.g:362:5: lv_name_2_0= ruleTargetableState
            {

            					newCompositeNode(grammarAccess.getGenericStateAccess().getNameTargetableStateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleTargetableState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenericStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.Zustandsdiagramm.TargetableState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getGenericStateAccess().getWithKeyword_3());
            		
            // InternalZustandsdiagramm.g:383:3: ( (lv_transitions_4_0= ruleTransition ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalZustandsdiagramm.g:384:4: (lv_transitions_4_0= ruleTransition )
            	    {
            	    // InternalZustandsdiagramm.g:384:4: (lv_transitions_4_0= ruleTransition )
            	    // InternalZustandsdiagramm.g:385:5: lv_transitions_4_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getGenericStateAccess().getTransitionsTransitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_transitions_4_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGenericStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_4_0,
            	    						"org.xtext.example.mydsl.Zustandsdiagramm.Transition");
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

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGenericStateAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleGenericState"


    // $ANTLR start "entryRuleTransition"
    // InternalZustandsdiagramm.g:410:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalZustandsdiagramm.g:410:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalZustandsdiagramm.g:411:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalZustandsdiagramm.g:417:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'event' otherlv_1= ':' ( (lv_event_2_0= ruleEvent ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_event_2_0 = null;



        	enterRule();

        try {
            // InternalZustandsdiagramm.g:423:2: ( (otherlv_0= 'event' otherlv_1= ':' ( (lv_event_2_0= ruleEvent ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalZustandsdiagramm.g:424:2: (otherlv_0= 'event' otherlv_1= ':' ( (lv_event_2_0= ruleEvent ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalZustandsdiagramm.g:424:2: (otherlv_0= 'event' otherlv_1= ':' ( (lv_event_2_0= ruleEvent ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )
            // InternalZustandsdiagramm.g:425:3: otherlv_0= 'event' otherlv_1= ':' ( (lv_event_2_0= ruleEvent ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getColonKeyword_1());
            		
            // InternalZustandsdiagramm.g:433:3: ( (lv_event_2_0= ruleEvent ) )
            // InternalZustandsdiagramm.g:434:4: (lv_event_2_0= ruleEvent )
            {
            // InternalZustandsdiagramm.g:434:4: (lv_event_2_0= ruleEvent )
            // InternalZustandsdiagramm.g:435:5: lv_event_2_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_event_2_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_2_0,
            						"org.xtext.example.mydsl.Zustandsdiagramm.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getToKeyword_3());
            		
            // InternalZustandsdiagramm.g:456:3: ( (otherlv_4= RULE_ID ) )
            // InternalZustandsdiagramm.g:457:4: (otherlv_4= RULE_ID )
            {
            // InternalZustandsdiagramm.g:457:4: (otherlv_4= RULE_ID )
            // InternalZustandsdiagramm.g:458:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getToTargetableStateCrossReference_4_0());
            				

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEvent"
    // InternalZustandsdiagramm.g:473:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalZustandsdiagramm.g:473:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalZustandsdiagramm.g:474:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalZustandsdiagramm.g:480:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_guard_2_0= ruleGuard ) ) )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_guard_2_0 = null;



        	enterRule();

        try {
            // InternalZustandsdiagramm.g:486:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_guard_2_0= ruleGuard ) ) )? ) )
            // InternalZustandsdiagramm.g:487:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_guard_2_0= ruleGuard ) ) )? )
            {
            // InternalZustandsdiagramm.g:487:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_guard_2_0= ruleGuard ) ) )? )
            // InternalZustandsdiagramm.g:488:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_guard_2_0= ruleGuard ) ) )?
            {
            // InternalZustandsdiagramm.g:488:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalZustandsdiagramm.g:489:4: (lv_name_0_0= RULE_ID )
            {
            // InternalZustandsdiagramm.g:489:4: (lv_name_0_0= RULE_ID )
            // InternalZustandsdiagramm.g:490:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalZustandsdiagramm.g:506:3: (otherlv_1= 'and' ( (lv_guard_2_0= ruleGuard ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalZustandsdiagramm.g:507:4: otherlv_1= 'and' ( (lv_guard_2_0= ruleGuard ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getEventAccess().getAndKeyword_1_0());
                    			
                    // InternalZustandsdiagramm.g:511:4: ( (lv_guard_2_0= ruleGuard ) )
                    // InternalZustandsdiagramm.g:512:5: (lv_guard_2_0= ruleGuard )
                    {
                    // InternalZustandsdiagramm.g:512:5: (lv_guard_2_0= ruleGuard )
                    // InternalZustandsdiagramm.g:513:6: lv_guard_2_0= ruleGuard
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getGuardGuardParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_guard_2_0=ruleGuard();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"guard",
                    							lv_guard_2_0,
                    							"org.xtext.example.mydsl.Zustandsdiagramm.Guard");
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleGuard"
    // InternalZustandsdiagramm.g:535:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // InternalZustandsdiagramm.g:535:46: (iv_ruleGuard= ruleGuard EOF )
            // InternalZustandsdiagramm.g:536:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // InternalZustandsdiagramm.g:542:1: ruleGuard returns [EObject current=null] : (otherlv_0= 'guard' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalZustandsdiagramm.g:548:2: ( (otherlv_0= 'guard' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalZustandsdiagramm.g:549:2: (otherlv_0= 'guard' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalZustandsdiagramm.g:549:2: (otherlv_0= 'guard' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalZustandsdiagramm.g:550:3: otherlv_0= 'guard' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGuardAccess().getGuardKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGuardAccess().getColonKeyword_1());
            		
            // InternalZustandsdiagramm.g:558:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalZustandsdiagramm.g:559:4: (lv_name_2_0= RULE_ID )
            {
            // InternalZustandsdiagramm.g:559:4: (lv_name_2_0= RULE_ID )
            // InternalZustandsdiagramm.g:560:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGuardAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuardRule());
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
    // $ANTLR end "ruleGuard"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000018802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});

}
