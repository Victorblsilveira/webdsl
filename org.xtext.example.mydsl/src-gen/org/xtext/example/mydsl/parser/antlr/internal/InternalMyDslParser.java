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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'{'", "'code'", "','", "'}'", "'Code'", "'id'", "'Front'", "'language'", "'Back'", "'Language'", "'type'", "'requisition'", "'interceptor'", "'Requisition'", "'method'", "'url'", "'Interceptor'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Application";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleApplication"
    // InternalMyDsl.g:64:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalMyDsl.g:64:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalMyDsl.g:65:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalMyDsl.g:71:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'Application' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'code' otherlv_4= '{' ( (lv_code_5_0= ruleCode ) ) (otherlv_6= ',' ( (lv_code_7_0= ruleCode ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_code_5_0 = null;

        EObject lv_code_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'Application' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'code' otherlv_4= '{' ( (lv_code_5_0= ruleCode ) ) (otherlv_6= ',' ( (lv_code_7_0= ruleCode ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'Application' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'code' otherlv_4= '{' ( (lv_code_5_0= ruleCode ) ) (otherlv_6= ',' ( (lv_code_7_0= ruleCode ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'Application' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'code' otherlv_4= '{' ( (lv_code_5_0= ruleCode ) ) (otherlv_6= ',' ( (lv_code_7_0= ruleCode ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'Application' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'code' otherlv_4= '{' ( (lv_code_5_0= ruleCode ) ) (otherlv_6= ',' ( (lv_code_7_0= ruleCode ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getCodeKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:114:3: ( (lv_code_5_0= ruleCode ) )
            // InternalMyDsl.g:115:4: (lv_code_5_0= ruleCode )
            {
            // InternalMyDsl.g:115:4: (lv_code_5_0= ruleCode )
            // InternalMyDsl.g:116:5: lv_code_5_0= ruleCode
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getCodeCodeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_code_5_0=ruleCode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					add(
            						current,
            						"code",
            						lv_code_5_0,
            						"org.xtext.example.mydsl.MyDsl.Code");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:133:3: (otherlv_6= ',' ( (lv_code_7_0= ruleCode ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:134:4: otherlv_6= ',' ( (lv_code_7_0= ruleCode ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:138:4: ( (lv_code_7_0= ruleCode ) )
            	    // InternalMyDsl.g:139:5: (lv_code_7_0= ruleCode )
            	    {
            	    // InternalMyDsl.g:139:5: (lv_code_7_0= ruleCode )
            	    // InternalMyDsl.g:140:6: lv_code_7_0= ruleCode
            	    {

            	    						newCompositeNode(grammarAccess.getApplicationAccess().getCodeCodeParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_code_7_0=ruleCode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getApplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"code",
            	    							lv_code_7_0,
            	    							"org.xtext.example.mydsl.MyDsl.Code");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleCode"
    // InternalMyDsl.g:170:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // InternalMyDsl.g:170:45: (iv_ruleCode= ruleCode EOF )
            // InternalMyDsl.g:171:2: iv_ruleCode= ruleCode EOF
            {
             newCompositeNode(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCode=ruleCode();

            state._fsp--;

             current =iv_ruleCode; 
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
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // InternalMyDsl.g:177:1: ruleCode returns [EObject current=null] : (this_Code_Impl_0= ruleCode_Impl | this_Front_1= ruleFront | this_Back_2= ruleBack ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        EObject this_Code_Impl_0 = null;

        EObject this_Front_1 = null;

        EObject this_Back_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:183:2: ( (this_Code_Impl_0= ruleCode_Impl | this_Front_1= ruleFront | this_Back_2= ruleBack ) )
            // InternalMyDsl.g:184:2: (this_Code_Impl_0= ruleCode_Impl | this_Front_1= ruleFront | this_Back_2= ruleBack )
            {
            // InternalMyDsl.g:184:2: (this_Code_Impl_0= ruleCode_Impl | this_Front_1= ruleFront | this_Back_2= ruleBack )
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
            case 20:
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
                    // InternalMyDsl.g:185:3: this_Code_Impl_0= ruleCode_Impl
                    {

                    			newCompositeNode(grammarAccess.getCodeAccess().getCode_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Code_Impl_0=ruleCode_Impl();

                    state._fsp--;


                    			current = this_Code_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:194:3: this_Front_1= ruleFront
                    {

                    			newCompositeNode(grammarAccess.getCodeAccess().getFrontParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Front_1=ruleFront();

                    state._fsp--;


                    			current = this_Front_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:203:3: this_Back_2= ruleBack
                    {

                    			newCompositeNode(grammarAccess.getCodeAccess().getBackParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Back_2=ruleBack();

                    state._fsp--;


                    			current = this_Back_2;
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
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:215:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:215:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:216:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:222:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:228:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:229:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:229:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:230:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:238:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCode_Impl"
    // InternalMyDsl.g:249:1: entryRuleCode_Impl returns [EObject current=null] : iv_ruleCode_Impl= ruleCode_Impl EOF ;
    public final EObject entryRuleCode_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode_Impl = null;


        try {
            // InternalMyDsl.g:249:50: (iv_ruleCode_Impl= ruleCode_Impl EOF )
            // InternalMyDsl.g:250:2: iv_ruleCode_Impl= ruleCode_Impl EOF
            {
             newCompositeNode(grammarAccess.getCode_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCode_Impl=ruleCode_Impl();

            state._fsp--;

             current =iv_ruleCode_Impl; 
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
    // $ANTLR end "entryRuleCode_Impl"


    // $ANTLR start "ruleCode_Impl"
    // InternalMyDsl.g:256:1: ruleCode_Impl returns [EObject current=null] : (otherlv_0= 'Code' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleCode_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:262:2: ( (otherlv_0= 'Code' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:263:2: (otherlv_0= 'Code' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:263:2: (otherlv_0= 'Code' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalMyDsl.g:264:3: otherlv_0= 'Code' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCode_ImplAccess().getCodeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCode_ImplAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCode_ImplAccess().getIdKeyword_2());
            		
            // InternalMyDsl.g:276:3: ( (lv_id_3_0= ruleEString ) )
            // InternalMyDsl.g:277:4: (lv_id_3_0= ruleEString )
            {
            // InternalMyDsl.g:277:4: (lv_id_3_0= ruleEString )
            // InternalMyDsl.g:278:5: lv_id_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCode_ImplAccess().getIdEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_id_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCode_ImplRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCode_ImplAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCode_Impl"


    // $ANTLR start "entryRuleFront"
    // InternalMyDsl.g:303:1: entryRuleFront returns [EObject current=null] : iv_ruleFront= ruleFront EOF ;
    public final EObject entryRuleFront() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFront = null;


        try {
            // InternalMyDsl.g:303:46: (iv_ruleFront= ruleFront EOF )
            // InternalMyDsl.g:304:2: iv_ruleFront= ruleFront EOF
            {
             newCompositeNode(grammarAccess.getFrontRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFront=ruleFront();

            state._fsp--;

             current =iv_ruleFront; 
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
    // $ANTLR end "entryRuleFront"


    // $ANTLR start "ruleFront"
    // InternalMyDsl.g:310:1: ruleFront returns [EObject current=null] : (otherlv_0= 'Front' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= 'language' ( (lv_language_5_0= ruleLanguage ) ) otherlv_6= '}' ) ;
    public final EObject ruleFront() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_language_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:316:2: ( (otherlv_0= 'Front' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= 'language' ( (lv_language_5_0= ruleLanguage ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:317:2: (otherlv_0= 'Front' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= 'language' ( (lv_language_5_0= ruleLanguage ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:317:2: (otherlv_0= 'Front' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= 'language' ( (lv_language_5_0= ruleLanguage ) ) otherlv_6= '}' )
            // InternalMyDsl.g:318:3: otherlv_0= 'Front' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= 'language' ( (lv_language_5_0= ruleLanguage ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFrontAccess().getFrontKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFrontAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getFrontAccess().getIdKeyword_2());
            		
            // InternalMyDsl.g:330:3: ( (lv_id_3_0= ruleEString ) )
            // InternalMyDsl.g:331:4: (lv_id_3_0= ruleEString )
            {
            // InternalMyDsl.g:331:4: (lv_id_3_0= ruleEString )
            // InternalMyDsl.g:332:5: lv_id_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFrontAccess().getIdEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_id_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFrontRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getFrontAccess().getLanguageKeyword_4());
            		
            // InternalMyDsl.g:353:3: ( (lv_language_5_0= ruleLanguage ) )
            // InternalMyDsl.g:354:4: (lv_language_5_0= ruleLanguage )
            {
            // InternalMyDsl.g:354:4: (lv_language_5_0= ruleLanguage )
            // InternalMyDsl.g:355:5: lv_language_5_0= ruleLanguage
            {

            					newCompositeNode(grammarAccess.getFrontAccess().getLanguageLanguageParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_language_5_0=ruleLanguage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFrontRule());
            					}
            					set(
            						current,
            						"language",
            						lv_language_5_0,
            						"org.xtext.example.mydsl.MyDsl.Language");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFrontAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleFront"


    // $ANTLR start "entryRuleBack"
    // InternalMyDsl.g:380:1: entryRuleBack returns [EObject current=null] : iv_ruleBack= ruleBack EOF ;
    public final EObject entryRuleBack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBack = null;


        try {
            // InternalMyDsl.g:380:45: (iv_ruleBack= ruleBack EOF )
            // InternalMyDsl.g:381:2: iv_ruleBack= ruleBack EOF
            {
             newCompositeNode(grammarAccess.getBackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBack=ruleBack();

            state._fsp--;

             current =iv_ruleBack; 
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
    // $ANTLR end "entryRuleBack"


    // $ANTLR start "ruleBack"
    // InternalMyDsl.g:387:1: ruleBack returns [EObject current=null] : (otherlv_0= 'Back' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleBack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:393:2: ( (otherlv_0= 'Back' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:394:2: (otherlv_0= 'Back' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:394:2: (otherlv_0= 'Back' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalMyDsl.g:395:3: otherlv_0= 'Back' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBackAccess().getBackKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getBackAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBackAccess().getIdKeyword_2());
            		
            // InternalMyDsl.g:407:3: ( (lv_id_3_0= ruleEString ) )
            // InternalMyDsl.g:408:4: (lv_id_3_0= ruleEString )
            {
            // InternalMyDsl.g:408:4: (lv_id_3_0= ruleEString )
            // InternalMyDsl.g:409:5: lv_id_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBackAccess().getIdEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_id_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBackAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBack"


    // $ANTLR start "entryRuleLanguage"
    // InternalMyDsl.g:434:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // InternalMyDsl.g:434:49: (iv_ruleLanguage= ruleLanguage EOF )
            // InternalMyDsl.g:435:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage; 
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
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // InternalMyDsl.g:441:1: ruleLanguage returns [EObject current=null] : (otherlv_0= 'Language' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= 'requisition' otherlv_5= '{' ( (lv_requisition_6_0= ruleRequisition ) ) (otherlv_7= ',' ( (lv_requisition_8_0= ruleRequisition ) ) )* otherlv_9= '}' )? (otherlv_10= 'interceptor' otherlv_11= '{' ( (lv_interceptor_12_0= ruleInterceptor ) ) (otherlv_13= ',' ( (lv_interceptor_14_0= ruleInterceptor ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        EObject lv_requisition_6_0 = null;

        EObject lv_requisition_8_0 = null;

        EObject lv_interceptor_12_0 = null;

        EObject lv_interceptor_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:447:2: ( (otherlv_0= 'Language' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= 'requisition' otherlv_5= '{' ( (lv_requisition_6_0= ruleRequisition ) ) (otherlv_7= ',' ( (lv_requisition_8_0= ruleRequisition ) ) )* otherlv_9= '}' )? (otherlv_10= 'interceptor' otherlv_11= '{' ( (lv_interceptor_12_0= ruleInterceptor ) ) (otherlv_13= ',' ( (lv_interceptor_14_0= ruleInterceptor ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalMyDsl.g:448:2: (otherlv_0= 'Language' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= 'requisition' otherlv_5= '{' ( (lv_requisition_6_0= ruleRequisition ) ) (otherlv_7= ',' ( (lv_requisition_8_0= ruleRequisition ) ) )* otherlv_9= '}' )? (otherlv_10= 'interceptor' otherlv_11= '{' ( (lv_interceptor_12_0= ruleInterceptor ) ) (otherlv_13= ',' ( (lv_interceptor_14_0= ruleInterceptor ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalMyDsl.g:448:2: (otherlv_0= 'Language' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= 'requisition' otherlv_5= '{' ( (lv_requisition_6_0= ruleRequisition ) ) (otherlv_7= ',' ( (lv_requisition_8_0= ruleRequisition ) ) )* otherlv_9= '}' )? (otherlv_10= 'interceptor' otherlv_11= '{' ( (lv_interceptor_12_0= ruleInterceptor ) ) (otherlv_13= ',' ( (lv_interceptor_14_0= ruleInterceptor ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalMyDsl.g:449:3: otherlv_0= 'Language' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= 'requisition' otherlv_5= '{' ( (lv_requisition_6_0= ruleRequisition ) ) (otherlv_7= ',' ( (lv_requisition_8_0= ruleRequisition ) ) )* otherlv_9= '}' )? (otherlv_10= 'interceptor' otherlv_11= '{' ( (lv_interceptor_12_0= ruleInterceptor ) ) (otherlv_13= ',' ( (lv_interceptor_14_0= ruleInterceptor ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLanguageAccess().getLanguageKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getLanguageAccess().getTypeKeyword_2());
            		
            // InternalMyDsl.g:461:3: ( (lv_type_3_0= ruleEString ) )
            // InternalMyDsl.g:462:4: (lv_type_3_0= ruleEString )
            {
            // InternalMyDsl.g:462:4: (lv_type_3_0= ruleEString )
            // InternalMyDsl.g:463:5: lv_type_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLanguageAccess().getTypeEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLanguageRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:480:3: (otherlv_4= 'requisition' otherlv_5= '{' ( (lv_requisition_6_0= ruleRequisition ) ) (otherlv_7= ',' ( (lv_requisition_8_0= ruleRequisition ) ) )* otherlv_9= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:481:4: otherlv_4= 'requisition' otherlv_5= '{' ( (lv_requisition_6_0= ruleRequisition ) ) (otherlv_7= ',' ( (lv_requisition_8_0= ruleRequisition ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getLanguageAccess().getRequisitionKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:489:4: ( (lv_requisition_6_0= ruleRequisition ) )
                    // InternalMyDsl.g:490:5: (lv_requisition_6_0= ruleRequisition )
                    {
                    // InternalMyDsl.g:490:5: (lv_requisition_6_0= ruleRequisition )
                    // InternalMyDsl.g:491:6: lv_requisition_6_0= ruleRequisition
                    {

                    						newCompositeNode(grammarAccess.getLanguageAccess().getRequisitionRequisitionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_requisition_6_0=ruleRequisition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLanguageRule());
                    						}
                    						add(
                    							current,
                    							"requisition",
                    							lv_requisition_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Requisition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:508:4: (otherlv_7= ',' ( (lv_requisition_8_0= ruleRequisition ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:509:5: otherlv_7= ',' ( (lv_requisition_8_0= ruleRequisition ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getLanguageAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:513:5: ( (lv_requisition_8_0= ruleRequisition ) )
                    	    // InternalMyDsl.g:514:6: (lv_requisition_8_0= ruleRequisition )
                    	    {
                    	    // InternalMyDsl.g:514:6: (lv_requisition_8_0= ruleRequisition )
                    	    // InternalMyDsl.g:515:7: lv_requisition_8_0= ruleRequisition
                    	    {

                    	    							newCompositeNode(grammarAccess.getLanguageAccess().getRequisitionRequisitionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_requisition_8_0=ruleRequisition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLanguageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requisition",
                    	    								lv_requisition_8_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Requisition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:538:3: (otherlv_10= 'interceptor' otherlv_11= '{' ( (lv_interceptor_12_0= ruleInterceptor ) ) (otherlv_13= ',' ( (lv_interceptor_14_0= ruleInterceptor ) ) )* otherlv_15= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:539:4: otherlv_10= 'interceptor' otherlv_11= '{' ( (lv_interceptor_12_0= ruleInterceptor ) ) (otherlv_13= ',' ( (lv_interceptor_14_0= ruleInterceptor ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getLanguageAccess().getInterceptorKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:547:4: ( (lv_interceptor_12_0= ruleInterceptor ) )
                    // InternalMyDsl.g:548:5: (lv_interceptor_12_0= ruleInterceptor )
                    {
                    // InternalMyDsl.g:548:5: (lv_interceptor_12_0= ruleInterceptor )
                    // InternalMyDsl.g:549:6: lv_interceptor_12_0= ruleInterceptor
                    {

                    						newCompositeNode(grammarAccess.getLanguageAccess().getInterceptorInterceptorParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_interceptor_12_0=ruleInterceptor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLanguageRule());
                    						}
                    						add(
                    							current,
                    							"interceptor",
                    							lv_interceptor_12_0,
                    							"org.xtext.example.mydsl.MyDsl.Interceptor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:566:4: (otherlv_13= ',' ( (lv_interceptor_14_0= ruleInterceptor ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:567:5: otherlv_13= ',' ( (lv_interceptor_14_0= ruleInterceptor ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getLanguageAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:571:5: ( (lv_interceptor_14_0= ruleInterceptor ) )
                    	    // InternalMyDsl.g:572:6: (lv_interceptor_14_0= ruleInterceptor )
                    	    {
                    	    // InternalMyDsl.g:572:6: (lv_interceptor_14_0= ruleInterceptor )
                    	    // InternalMyDsl.g:573:7: lv_interceptor_14_0= ruleInterceptor
                    	    {

                    	    							newCompositeNode(grammarAccess.getLanguageAccess().getInterceptorInterceptorParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_interceptor_14_0=ruleInterceptor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLanguageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interceptor",
                    	    								lv_interceptor_14_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Interceptor");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleRequisition"
    // InternalMyDsl.g:604:1: entryRuleRequisition returns [EObject current=null] : iv_ruleRequisition= ruleRequisition EOF ;
    public final EObject entryRuleRequisition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequisition = null;


        try {
            // InternalMyDsl.g:604:52: (iv_ruleRequisition= ruleRequisition EOF )
            // InternalMyDsl.g:605:2: iv_ruleRequisition= ruleRequisition EOF
            {
             newCompositeNode(grammarAccess.getRequisitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequisition=ruleRequisition();

            state._fsp--;

             current =iv_ruleRequisition; 
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
    // $ANTLR end "entryRuleRequisition"


    // $ANTLR start "ruleRequisition"
    // InternalMyDsl.g:611:1: ruleRequisition returns [EObject current=null] : (otherlv_0= 'Requisition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) otherlv_5= 'url' ( (lv_url_6_0= ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleRequisition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_method_4_0 = null;

        AntlrDatatypeRuleToken lv_url_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:617:2: ( (otherlv_0= 'Requisition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) otherlv_5= 'url' ( (lv_url_6_0= ruleEString ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:618:2: (otherlv_0= 'Requisition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) otherlv_5= 'url' ( (lv_url_6_0= ruleEString ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:618:2: (otherlv_0= 'Requisition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) otherlv_5= 'url' ( (lv_url_6_0= ruleEString ) ) otherlv_7= '}' )
            // InternalMyDsl.g:619:3: otherlv_0= 'Requisition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) otherlv_5= 'url' ( (lv_url_6_0= ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequisitionAccess().getRequisitionKeyword_0());
            		
            // InternalMyDsl.g:623:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:624:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:624:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:625:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequisitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequisitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getRequisitionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRequisitionAccess().getMethodKeyword_3());
            		
            // InternalMyDsl.g:650:3: ( (lv_method_4_0= ruleEString ) )
            // InternalMyDsl.g:651:4: (lv_method_4_0= ruleEString )
            {
            // InternalMyDsl.g:651:4: (lv_method_4_0= ruleEString )
            // InternalMyDsl.g:652:5: lv_method_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequisitionAccess().getMethodEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_method_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequisitionRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRequisitionAccess().getUrlKeyword_5());
            		
            // InternalMyDsl.g:673:3: ( (lv_url_6_0= ruleEString ) )
            // InternalMyDsl.g:674:4: (lv_url_6_0= ruleEString )
            {
            // InternalMyDsl.g:674:4: (lv_url_6_0= ruleEString )
            // InternalMyDsl.g:675:5: lv_url_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequisitionAccess().getUrlEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_url_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequisitionRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_6_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRequisitionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRequisition"


    // $ANTLR start "entryRuleInterceptor"
    // InternalMyDsl.g:700:1: entryRuleInterceptor returns [EObject current=null] : iv_ruleInterceptor= ruleInterceptor EOF ;
    public final EObject entryRuleInterceptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterceptor = null;


        try {
            // InternalMyDsl.g:700:52: (iv_ruleInterceptor= ruleInterceptor EOF )
            // InternalMyDsl.g:701:2: iv_ruleInterceptor= ruleInterceptor EOF
            {
             newCompositeNode(grammarAccess.getInterceptorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterceptor=ruleInterceptor();

            state._fsp--;

             current =iv_ruleInterceptor; 
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
    // $ANTLR end "entryRuleInterceptor"


    // $ANTLR start "ruleInterceptor"
    // InternalMyDsl.g:707:1: ruleInterceptor returns [EObject current=null] : (otherlv_0= 'Interceptor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) otherlv_5= 'url' ( (lv_url_6_0= ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleInterceptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_method_4_0 = null;

        AntlrDatatypeRuleToken lv_url_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:713:2: ( (otherlv_0= 'Interceptor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) otherlv_5= 'url' ( (lv_url_6_0= ruleEString ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:714:2: (otherlv_0= 'Interceptor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) otherlv_5= 'url' ( (lv_url_6_0= ruleEString ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:714:2: (otherlv_0= 'Interceptor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) otherlv_5= 'url' ( (lv_url_6_0= ruleEString ) ) otherlv_7= '}' )
            // InternalMyDsl.g:715:3: otherlv_0= 'Interceptor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) otherlv_5= 'url' ( (lv_url_6_0= ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInterceptorAccess().getInterceptorKeyword_0());
            		
            // InternalMyDsl.g:719:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:720:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:720:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:721:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterceptorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterceptorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getInterceptorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getInterceptorAccess().getMethodKeyword_3());
            		
            // InternalMyDsl.g:746:3: ( (lv_method_4_0= ruleEString ) )
            // InternalMyDsl.g:747:4: (lv_method_4_0= ruleEString )
            {
            // InternalMyDsl.g:747:4: (lv_method_4_0= ruleEString )
            // InternalMyDsl.g:748:5: lv_method_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterceptorAccess().getMethodEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_method_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterceptorRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getInterceptorAccess().getUrlKeyword_5());
            		
            // InternalMyDsl.g:769:3: ( (lv_url_6_0= ruleEString ) )
            // InternalMyDsl.g:770:4: (lv_url_6_0= ruleEString )
            {
            // InternalMyDsl.g:770:4: (lv_url_6_0= ruleEString )
            // InternalMyDsl.g:771:5: lv_url_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterceptorAccess().getUrlEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_url_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterceptorRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_6_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInterceptorAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleInterceptor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000150000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});

}