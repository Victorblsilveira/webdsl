/*
 * generated by Xtext 2.12.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleApplication
entryRuleApplication returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getApplicationRule()); }
	iv_ruleApplication=ruleApplication
	{ $current=$iv_ruleApplication.current; }
	EOF;

// Rule Application
ruleApplication returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Application'
		{
			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getApplicationAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getApplicationRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='code'
		{
			newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getCodeKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getApplicationAccess().getCodeCodeParserRuleCall_5_0());
				}
				lv_code_5_0=ruleCode
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getApplicationRule());
					}
					add(
						$current,
						"code",
						lv_code_5_0,
						"org.xtext.example.mydsl.MyDsl.Code");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getApplicationAccess().getCodeCodeParserRuleCall_6_1_0());
					}
					lv_code_7_0=ruleCode
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getApplicationRule());
						}
						add(
							$current,
							"code",
							lv_code_7_0,
							"org.xtext.example.mydsl.MyDsl.Code");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleCode
entryRuleCode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCodeRule()); }
	iv_ruleCode=ruleCode
	{ $current=$iv_ruleCode.current; }
	EOF;

// Rule Code
ruleCode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCodeAccess().getCode_ImplParserRuleCall_0());
		}
		this_Code_Impl_0=ruleCode_Impl
		{
			$current = $this_Code_Impl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCodeAccess().getFrontParserRuleCall_1());
		}
		this_Front_1=ruleFront
		{
			$current = $this_Front_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCodeAccess().getBackParserRuleCall_2());
		}
		this_Back_2=ruleBack
		{
			$current = $this_Back_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleCode_Impl
entryRuleCode_Impl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCode_ImplRule()); }
	iv_ruleCode_Impl=ruleCode_Impl
	{ $current=$iv_ruleCode_Impl.current; }
	EOF;

// Rule Code_Impl
ruleCode_Impl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Code'
		{
			newLeafNode(otherlv_0, grammarAccess.getCode_ImplAccess().getCodeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getCode_ImplAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getCode_ImplAccess().getIdKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCode_ImplAccess().getIdEStringParserRuleCall_3_0());
				}
				lv_id_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCode_ImplRule());
					}
					set(
						$current,
						"id",
						lv_id_3_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getCode_ImplAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleFront
entryRuleFront returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFrontRule()); }
	iv_ruleFront=ruleFront
	{ $current=$iv_ruleFront.current; }
	EOF;

// Rule Front
ruleFront returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Front'
		{
			newLeafNode(otherlv_0, grammarAccess.getFrontAccess().getFrontKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getFrontAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getFrontAccess().getIdKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFrontAccess().getIdEStringParserRuleCall_3_0());
				}
				lv_id_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFrontRule());
					}
					set(
						$current,
						"id",
						lv_id_3_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='language'
		{
			newLeafNode(otherlv_4, grammarAccess.getFrontAccess().getLanguageKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFrontAccess().getLanguageLanguageParserRuleCall_5_0());
				}
				lv_language_5_0=ruleLanguage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFrontRule());
					}
					set(
						$current,
						"language",
						lv_language_5_0,
						"org.xtext.example.mydsl.MyDsl.Language");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getFrontAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleBack
entryRuleBack returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBackRule()); }
	iv_ruleBack=ruleBack
	{ $current=$iv_ruleBack.current; }
	EOF;

// Rule Back
ruleBack returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Back'
		{
			newLeafNode(otherlv_0, grammarAccess.getBackAccess().getBackKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getBackAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getBackAccess().getIdKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBackAccess().getIdEStringParserRuleCall_3_0());
				}
				lv_id_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBackRule());
					}
					set(
						$current,
						"id",
						lv_id_3_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getBackAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleLanguage
entryRuleLanguage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLanguageRule()); }
	iv_ruleLanguage=ruleLanguage
	{ $current=$iv_ruleLanguage.current; }
	EOF;

// Rule Language
ruleLanguage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Language'
		{
			newLeafNode(otherlv_0, grammarAccess.getLanguageAccess().getLanguageKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='type'
		{
			newLeafNode(otherlv_2, grammarAccess.getLanguageAccess().getTypeKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLanguageAccess().getTypeEStringParserRuleCall_3_0());
				}
				lv_type_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLanguageRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='requisition'
			{
				newLeafNode(otherlv_4, grammarAccess.getLanguageAccess().getRequisitionKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLanguageAccess().getRequisitionRequisitionParserRuleCall_4_2_0());
					}
					lv_requisition_6_0=ruleRequisition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLanguageRule());
						}
						add(
							$current,
							"requisition",
							lv_requisition_6_0,
							"org.xtext.example.mydsl.MyDsl.Requisition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getLanguageAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getLanguageAccess().getRequisitionRequisitionParserRuleCall_4_3_1_0());
						}
						lv_requisition_8_0=ruleRequisition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getLanguageRule());
							}
							add(
								$current,
								"requisition",
								lv_requisition_8_0,
								"org.xtext.example.mydsl.MyDsl.Requisition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		(
			otherlv_10='interceptor'
			{
				newLeafNode(otherlv_10, grammarAccess.getLanguageAccess().getInterceptorKeyword_5_0());
			}
			otherlv_11='{'
			{
				newLeafNode(otherlv_11, grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLanguageAccess().getInterceptorInterceptorParserRuleCall_5_2_0());
					}
					lv_interceptor_12_0=ruleInterceptor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLanguageRule());
						}
						add(
							$current,
							"interceptor",
							lv_interceptor_12_0,
							"org.xtext.example.mydsl.MyDsl.Interceptor");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_13=','
				{
					newLeafNode(otherlv_13, grammarAccess.getLanguageAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getLanguageAccess().getInterceptorInterceptorParserRuleCall_5_3_1_0());
						}
						lv_interceptor_14_0=ruleInterceptor
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getLanguageRule());
							}
							add(
								$current,
								"interceptor",
								lv_interceptor_14_0,
								"org.xtext.example.mydsl.MyDsl.Interceptor");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_15='}'
			{
				newLeafNode(otherlv_15, grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleRequisition
entryRuleRequisition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequisitionRule()); }
	iv_ruleRequisition=ruleRequisition
	{ $current=$iv_ruleRequisition.current; }
	EOF;

// Rule Requisition
ruleRequisition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Requisition'
		{
			newLeafNode(otherlv_0, grammarAccess.getRequisitionAccess().getRequisitionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequisitionAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequisitionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getRequisitionAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='method'
		{
			newLeafNode(otherlv_3, grammarAccess.getRequisitionAccess().getMethodKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequisitionAccess().getMethodEStringParserRuleCall_4_0());
				}
				lv_method_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequisitionRule());
					}
					set(
						$current,
						"method",
						lv_method_4_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='url'
		{
			newLeafNode(otherlv_5, grammarAccess.getRequisitionAccess().getUrlKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequisitionAccess().getUrlEStringParserRuleCall_6_0());
				}
				lv_url_6_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequisitionRule());
					}
					set(
						$current,
						"url",
						lv_url_6_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getRequisitionAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleInterceptor
entryRuleInterceptor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInterceptorRule()); }
	iv_ruleInterceptor=ruleInterceptor
	{ $current=$iv_ruleInterceptor.current; }
	EOF;

// Rule Interceptor
ruleInterceptor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Interceptor'
		{
			newLeafNode(otherlv_0, grammarAccess.getInterceptorAccess().getInterceptorKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInterceptorAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterceptorRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getInterceptorAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='method'
		{
			newLeafNode(otherlv_3, grammarAccess.getInterceptorAccess().getMethodKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInterceptorAccess().getMethodEStringParserRuleCall_4_0());
				}
				lv_method_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterceptorRule());
					}
					set(
						$current,
						"method",
						lv_method_4_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='url'
		{
			newLeafNode(otherlv_5, grammarAccess.getInterceptorAccess().getUrlKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInterceptorAccess().getUrlEStringParserRuleCall_6_0());
				}
				lv_url_6_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterceptorRule());
					}
					set(
						$current,
						"url",
						lv_url_6_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getInterceptorAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
