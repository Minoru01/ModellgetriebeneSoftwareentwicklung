/*
 * generated by Xtext 2.21.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.selfie.Assignment;
import org.xtext.selfie.Calculation;
import org.xtext.selfie.Declaration;
import org.xtext.selfie.Model;
import org.xtext.selfie.SelfiePackage;
import org.xtext.selfie.Valuable;
import org.xtext.selfie.Value;
import org.xtext.selfie.Variable;
import org.xtext.selfie.VariableRef;
import org.xtext.services.SelfieGrammarAccess;

@SuppressWarnings("all")
public class SelfieSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SelfieGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SelfiePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SelfiePackage.ASSIGNMENT:
				sequence_Assignment(context, (Assignment) semanticObject); 
				return; 
			case SelfiePackage.CALCULATION:
				sequence_Calculation(context, (Calculation) semanticObject); 
				return; 
			case SelfiePackage.DECLARATION:
				sequence_Declaration(context, (Declaration) semanticObject); 
				return; 
			case SelfiePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case SelfiePackage.VALUABLE:
				sequence_Calculation(context, (Valuable) semanticObject); 
				return; 
			case SelfiePackage.VALUE:
				sequence_Value(context, (Value) semanticObject); 
				return; 
			case SelfiePackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case SelfiePackage.VARIABLE_REF:
				sequence_VariableRef(context, (VariableRef) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns Assignment
	 *     Assignment returns Assignment
	 *
	 * Constraint:
	 *     (variable=Variable valuable=Valuable)
	 */
	protected void sequence_Assignment(ISerializationContext context, Assignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfiePackage.Literals.EXPRESSION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfiePackage.Literals.EXPRESSION__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, SelfiePackage.Literals.EXPRESSION__VALUABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfiePackage.Literals.EXPRESSION__VALUABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignmentAccess().getVariableVariableParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getAssignmentAccess().getValuableValuableParserRuleCall_2_0(), semanticObject.getValuable());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Valuable returns Calculation
	 *     Calculation returns Calculation
	 *     Calculation.Calculation_1_1 returns Calculation
	 *     ParenthesizedExpression returns Calculation
	 *
	 * Constraint:
	 *     (leftValue=Calculation_Calculation_1_1 (operator=Operator rightValue=Valuable)?)
	 */
	protected void sequence_Calculation(ISerializationContext context, Calculation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Valuable returns Valuable
	 *     Calculation returns Valuable
	 *     Calculation.Calculation_1_1 returns Valuable
	 *     ParenthesizedExpression returns Valuable
	 *
	 * Constraint:
	 *     ((leftValue=Literal | leftValue=VariableRef) operator=Operator rightValue=Valuable)
	 */
	protected void sequence_Calculation(ISerializationContext context, Valuable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Declaration
	 *     Declaration returns Declaration
	 *
	 * Constraint:
	 *     (variable=Variable valuable=Valuable)
	 */
	protected void sequence_Declaration(ISerializationContext context, Declaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfiePackage.Literals.EXPRESSION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfiePackage.Literals.EXPRESSION__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, SelfiePackage.Literals.EXPRESSION__VALUABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfiePackage.Literals.EXPRESSION__VALUABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeclarationAccess().getVariableVariableParserRuleCall_1_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getDeclarationAccess().getValuableValuableParserRuleCall_3_0(), semanticObject.getValuable());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     expressions+=Expression+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Valuable returns Value
	 *     Literal returns Value
	 *     Value returns Value
	 *
	 * Constraint:
	 *     (integer=INTEGER | double=DOUBLE)
	 */
	protected void sequence_Value(ISerializationContext context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Valuable returns VariableRef
	 *     VariableRef returns VariableRef
	 *
	 * Constraint:
	 *     variable=Variable
	 */
	protected void sequence_VariableRef(ISerializationContext context, VariableRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfiePackage.Literals.VARIABLE_REF__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfiePackage.Literals.VARIABLE_REF__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableRefAccess().getVariableVariableParserRuleCall_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfiePackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfiePackage.Literals.VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
