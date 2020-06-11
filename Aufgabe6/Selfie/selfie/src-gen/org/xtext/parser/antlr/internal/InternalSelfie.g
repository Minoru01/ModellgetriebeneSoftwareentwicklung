/*
 * generated by Xtext 2.21.0
 */
grammar InternalSelfie;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.SelfieGrammarAccess;

}

@parser::members {

 	private SelfieGrammarAccess grammarAccess;

    public InternalSelfieParser(TokenStream input, SelfieGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected SelfieGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getExpressionsExpressionParserRuleCall_0());
			}
			lv_expressions_0_0=ruleExpression
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"expressions",
					lv_expressions_0_0,
					"org.xtext.Selfie.Expression");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getDeclarationParserRuleCall_0());
		}
		this_Declaration_0=ruleDeclaration
		{
			$current = $this_Declaration_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall_1());
		}
		this_Assignment_1=ruleAssignment
		{
			$current = $this_Assignment_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclarationRule()); }
	iv_ruleDeclaration=ruleDeclaration
	{ $current=$iv_ruleDeclaration.current; }
	EOF;

// Rule Declaration
ruleDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='def'
		{
			newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getDefKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDeclarationAccess().getVariableVariableParserRuleCall_1_0());
				}
				lv_variable_1_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeclarationRule());
					}
					set(
						$current,
						"variable",
						lv_variable_1_0,
						"org.xtext.Selfie.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDeclarationAccess().getValueValueParserRuleCall_3_0());
				}
				lv_value_3_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeclarationRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"org.xtext.Selfie.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleAssignment
entryRuleAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignmentRule()); }
	iv_ruleAssignment=ruleAssignment
	{ $current=$iv_ruleAssignment.current; }
	EOF;

// Rule Assignment
ruleAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getAssignmentAccess().getVariableVariableParserRuleCall_0_0_0());
					}
					lv_variable_0_0=ruleVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAssignmentRule());
						}
						set(
							$current,
							"variable",
							lv_variable_0_0,
							"org.xtext.Selfie.Variable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_1=':='
			{
				newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAssignmentAccess().getValuableValuableParserRuleCall_0_2_0());
					}
					lv_valuable_2_0=ruleValuable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAssignmentRule());
						}
						set(
							$current,
							"valuable",
							lv_valuable_2_0,
							"org.xtext.Selfie.Valuable");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			{
				newCompositeNode(grammarAccess.getAssignmentAccess().getCalculationParserRuleCall_1_0());
			}
			this_Calculation_3=ruleCalculation
			{
				$current = $this_Calculation_3.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_4=';'
			{
				newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getSemicolonKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current.getText(); }
	EOF;

// Rule Value
ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INTEGER_0=RULE_INTEGER
		{
			$current.merge(this_INTEGER_0);
		}
		{
			newLeafNode(this_INTEGER_0, grammarAccess.getValueAccess().getINTEGERTerminalRuleCall_0());
		}
		    |
		this_DOUBLE_1=RULE_DOUBLE
		{
			$current.merge(this_DOUBLE_1);
		}
		{
			newLeafNode(this_DOUBLE_1, grammarAccess.getValueAccess().getDOUBLETerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleValuable
entryRuleValuable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValuableRule()); }
	iv_ruleValuable=ruleValuable
	{ $current=$iv_ruleValuable.current; }
	EOF;

// Rule Valuable
ruleValuable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getValuableAccess().getLiteralParserRuleCall_0());
		}
		ruleLiteral
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValuableAccess().getVariableRefParserRuleCall_1());
		}
		this_VariableRef_1=ruleVariableRef
		{
			$current = $this_VariableRef_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLiteral
entryRuleLiteral returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLiteralRule()); }
	iv_ruleLiteral=ruleLiteral
	{ $current=$iv_ruleLiteral.current.getText(); }
	EOF;

// Rule Literal
ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getLiteralAccess().getValueParserRuleCall());
	}
	this_Value_0=ruleValue
	{
		$current.merge(this_Value_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getVariableRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleVariableRef
entryRuleVariableRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRefRule()); }
	iv_ruleVariableRef=ruleVariableRef
	{ $current=$iv_ruleVariableRef.current; }
	EOF;

// Rule VariableRef
ruleVariableRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getVariableRefAccess().getVariableVariableParserRuleCall_0());
			}
			lv_variable_0_0=ruleVariable
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getVariableRefRule());
				}
				set(
					$current,
					"variable",
					lv_variable_0_0,
					"org.xtext.Selfie.Variable");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleOperator
entryRuleOperator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOperatorRule()); }
	iv_ruleOperator=ruleOperator
	{ $current=$iv_ruleOperator.current.getText(); }
	EOF;

// Rule Operator
ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='+'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1());
		}
		    |
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_2());
		}
		    |
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_3());
		}
	)
;

// Entry rule entryRuleCalculation
entryRuleCalculation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCalculationRule()); }
	iv_ruleCalculation=ruleCalculation
	{ $current=$iv_ruleCalculation.current; }
	EOF;

// Rule Calculation
ruleCalculation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getCalculationAccess().getLeftValuableParserRuleCall_0_0_0());
					}
					lv_left_0_0=ruleValuable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCalculationRule());
						}
						set(
							$current,
							"left",
							lv_left_0_0,
							"org.xtext.Selfie.Valuable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getCalculationAccess().getOperatorOperatorParserRuleCall_0_1_0());
					}
					lv_operator_1_0=ruleOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCalculationRule());
						}
						set(
							$current,
							"operator",
							lv_operator_1_0,
							"org.xtext.Selfie.Operator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getCalculationAccess().getRightValuableParserRuleCall_0_2_0());
					}
					lv_right_2_0=ruleValuable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCalculationRule());
						}
						set(
							$current,
							"right",
							lv_right_2_0,
							"org.xtext.Selfie.Valuable");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			{
				newCompositeNode(grammarAccess.getCalculationAccess().getParenthesizedExpressionParserRuleCall_1_0());
			}
			this_ParenthesizedExpression_3=ruleParenthesizedExpression
			{
				$current = $this_ParenthesizedExpression_3.current;
				afterParserOrEnumRuleCall();
			}
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getCalculationAccess().getCalculationLeftAction_1_1(),
						$current);
				}
			)
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getCalculationAccess().getOperatorOperatorParserRuleCall_1_2_0_0());
						}
						lv_operator_5_0=ruleOperator
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCalculationRule());
							}
							set(
								$current,
								"operator",
								lv_operator_5_0,
								"org.xtext.Selfie.Operator");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getCalculationAccess().getRightValuableParserRuleCall_1_2_1_0());
						}
						lv_right_6_0=ruleValuable
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCalculationRule());
							}
							set(
								$current,
								"right",
								lv_right_6_0,
								"org.xtext.Selfie.Valuable");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
		)
	)
;

// Entry rule entryRuleParenthesizedExpression
entryRuleParenthesizedExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); }
	iv_ruleParenthesizedExpression=ruleParenthesizedExpression
	{ $current=$iv_ruleParenthesizedExpression.current; }
	EOF;

// Rule ParenthesizedExpression
ruleParenthesizedExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getCalculationParserRuleCall_1());
		}
		this_Calculation_1=ruleCalculation
		{
			$current = $this_Calculation_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
		}
	)
;

RULE_INTEGER : '-'? ('0'..'9')+;

RULE_DOUBLE : '-'? ('0'..'9')+ '.' ('0'..'9')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
