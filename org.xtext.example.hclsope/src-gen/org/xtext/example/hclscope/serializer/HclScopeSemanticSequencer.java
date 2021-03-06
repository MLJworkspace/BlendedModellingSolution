/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.hclscope.serializer;

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
import org.xtext.example.hclscope.hclScope.Choice;
import org.xtext.example.hclscope.hclScope.DeepHistory;
import org.xtext.example.hclscope.hclScope.EntryAction;
import org.xtext.example.hclscope.hclScope.EntryPoint;
import org.xtext.example.hclscope.hclScope.Event;
import org.xtext.example.hclscope.hclScope.ExitAction;
import org.xtext.example.hclscope.hclScope.ExitPoint;
import org.xtext.example.hclscope.hclScope.HclScopePackage;
import org.xtext.example.hclscope.hclScope.HistoryTransition;
import org.xtext.example.hclscope.hclScope.InitialState;
import org.xtext.example.hclscope.hclScope.InitialTransition;
import org.xtext.example.hclscope.hclScope.InternalTransition;
import org.xtext.example.hclscope.hclScope.Junction;
import org.xtext.example.hclscope.hclScope.Method;
import org.xtext.example.hclscope.hclScope.MethodParameterTrigger;
import org.xtext.example.hclscope.hclScope.Port;
import org.xtext.example.hclscope.hclScope.PortEventTrigger;
import org.xtext.example.hclscope.hclScope.State;
import org.xtext.example.hclscope.hclScope.StateMachine;
import org.xtext.example.hclscope.hclScope.Transition;
import org.xtext.example.hclscope.hclScope.TransitionBody;
import org.xtext.example.hclscope.hclScope.TransitionGuard;
import org.xtext.example.hclscope.hclScope.TransitionOperation;
import org.xtext.example.hclscope.hclScope.Trigger;
import org.xtext.example.hclscope.services.HclScopeGrammarAccess;

@SuppressWarnings("all")
public class HclScopeSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private HclScopeGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == HclScopePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case HclScopePackage.CHOICE:
				sequence_Choice(context, (Choice) semanticObject); 
				return; 
			case HclScopePackage.DEEP_HISTORY:
				sequence_DeepHistory(context, (DeepHistory) semanticObject); 
				return; 
			case HclScopePackage.ENTRY_ACTION:
				sequence_EntryAction(context, (EntryAction) semanticObject); 
				return; 
			case HclScopePackage.ENTRY_POINT:
				sequence_EntryPoint(context, (EntryPoint) semanticObject); 
				return; 
			case HclScopePackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case HclScopePackage.EXIT_ACTION:
				sequence_ExitAction(context, (ExitAction) semanticObject); 
				return; 
			case HclScopePackage.EXIT_POINT:
				sequence_ExitPoint(context, (ExitPoint) semanticObject); 
				return; 
			case HclScopePackage.HISTORY_TRANSITION:
				sequence_HistoryTransition(context, (HistoryTransition) semanticObject); 
				return; 
			case HclScopePackage.INITIAL_STATE:
				sequence_InitialState(context, (InitialState) semanticObject); 
				return; 
			case HclScopePackage.INITIAL_TRANSITION:
				sequence_InitialTransition(context, (InitialTransition) semanticObject); 
				return; 
			case HclScopePackage.INTERNAL_TRANSITION:
				sequence_InternalTransition(context, (InternalTransition) semanticObject); 
				return; 
			case HclScopePackage.JUNCTION:
				sequence_Junction(context, (Junction) semanticObject); 
				return; 
			case HclScopePackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case HclScopePackage.METHOD_PARAMETER_TRIGGER:
				sequence_MethodParameterTrigger(context, (MethodParameterTrigger) semanticObject); 
				return; 
			case HclScopePackage.PARAMETER:
				sequence_Parameter(context, (org.xtext.example.hclscope.hclScope.Parameter) semanticObject); 
				return; 
			case HclScopePackage.PORT:
				sequence_Port(context, (Port) semanticObject); 
				return; 
			case HclScopePackage.PORT_EVENT_TRIGGER:
				sequence_PortEventTrigger(context, (PortEventTrigger) semanticObject); 
				return; 
			case HclScopePackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case HclScopePackage.STATE_MACHINE:
				sequence_StateMachine(context, (StateMachine) semanticObject); 
				return; 
			case HclScopePackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			case HclScopePackage.TRANSITION_BODY:
				sequence_TransitionBody(context, (TransitionBody) semanticObject); 
				return; 
			case HclScopePackage.TRANSITION_GUARD:
				sequence_TransitionGuard(context, (TransitionGuard) semanticObject); 
				return; 
			case HclScopePackage.TRANSITION_OPERATION:
				sequence_TransitionOperation(context, (TransitionOperation) semanticObject); 
				return; 
			case HclScopePackage.TRIGGER:
				sequence_Trigger(context, (Trigger) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Choice returns Choice
	 *     Vertex returns Choice
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Choice(ISerializationContext context, Choice semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.VERTEX__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.VERTEX__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DeepHistory returns DeepHistory
	 *
	 * Constraint:
	 *     name='history*'
	 */
	protected void sequence_DeepHistory(ISerializationContext context, DeepHistory semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.DEEP_HISTORY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.DEEP_HISTORY__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeepHistoryAccess().getNameHistoryKeyword_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EntryAction returns EntryAction
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_EntryAction(ISerializationContext context, EntryAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.ENTRY_ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.ENTRY_ACTION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntryActionAccess().getNameSTRINGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EntryPoint returns EntryPoint
	 *     Vertex returns EntryPoint
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EntryPoint(ISerializationContext context, EntryPoint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.VERTEX__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.VERTEX__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntryPointAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Event
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.EVENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.EVENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExitAction returns ExitAction
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_ExitAction(ISerializationContext context, ExitAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.EXIT_ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.EXIT_ACTION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExitActionAccess().getNameSTRINGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExitPoint returns ExitPoint
	 *     Vertex returns ExitPoint
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ExitPoint(ISerializationContext context, ExitPoint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.VERTEX__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.VERTEX__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExitPointAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     HistoryTransition returns HistoryTransition
	 *     Transitions returns HistoryTransition
	 *
	 * Constraint:
	 *     ((name=ID | name=STRING)? from=[Vertex|QualifiedName] to=DeepHistory transitionbody=TransitionBody)
	 */
	protected void sequence_HistoryTransition(ISerializationContext context, HistoryTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InitialState returns InitialState
	 *
	 * Constraint:
	 *     name='initial'
	 */
	protected void sequence_InitialState(ISerializationContext context, InitialState semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.INITIAL_STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.INITIAL_STATE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInitialStateAccess().getNameInitialKeyword_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InitialTransition returns InitialTransition
	 *     Transitions returns InitialTransition
	 *
	 * Constraint:
	 *     (name=ID? initialstate=InitialState initialto=[Vertex|QualifiedName]? transitionbody=TransitionBody)
	 */
	protected void sequence_InitialTransition(ISerializationContext context, InitialTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InternalTransition returns InternalTransition
	 *
	 * Constraint:
	 *     (name=ID? transitionbody=TransitionBody)
	 */
	protected void sequence_InternalTransition(ISerializationContext context, InternalTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Junction returns Junction
	 *     Vertex returns Junction
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Junction(ISerializationContext context, Junction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.VERTEX__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.VERTEX__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJunctionAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MethodParameterTrigger returns MethodParameterTrigger
	 *
	 * Constraint:
	 *     (method=Method parameter=Parameter)
	 */
	protected void sequence_MethodParameterTrigger(ISerializationContext context, MethodParameterTrigger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.METHOD_PARAMETER_TRIGGER__METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.METHOD_PARAMETER_TRIGGER__METHOD));
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.METHOD_PARAMETER_TRIGGER__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.METHOD_PARAMETER_TRIGGER__PARAMETER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMethodParameterTriggerAccess().getMethodMethodParserRuleCall_0_0(), semanticObject.getMethod());
		feeder.accept(grammarAccess.getMethodParameterTriggerAccess().getParameterParameterParserRuleCall_2_0(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Method returns Method
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.METHOD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.METHOD__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Parameter(ISerializationContext context, org.xtext.example.hclscope.hclScope.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.PARAMETER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PortEventTrigger returns PortEventTrigger
	 *
	 * Constraint:
	 *     (port=Port event=Event)
	 */
	protected void sequence_PortEventTrigger(ISerializationContext context, PortEventTrigger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.PORT_EVENT_TRIGGER__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.PORT_EVENT_TRIGGER__PORT));
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.PORT_EVENT_TRIGGER__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.PORT_EVENT_TRIGGER__EVENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPortEventTriggerAccess().getPortPortParserRuleCall_0_0(), semanticObject.getPort());
		feeder.accept(grammarAccess.getPortEventTriggerAccess().getEventEventParserRuleCall_2_0(), semanticObject.getEvent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Port returns Port
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Port(ISerializationContext context, Port semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.PORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.PORT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StateMachine returns StateMachine
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (states+=State states+=State*)* 
	 *         initialtransition=InitialTransition? 
	 *         (junction+=Junction junction+=Junction*)* 
	 *         (choice+=Choice choice+=Choice*)* 
	 *         transition+=Transition*
	 *     )
	 */
	protected void sequence_StateMachine(ISerializationContext context, StateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *     Vertex returns State
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         internaltransition+=InternalTransition* 
	 *         entryaction+=EntryAction? 
	 *         exitaction+=ExitAction? 
	 *         (entrypoint+=EntryPoint entrypoint+=EntryPoint*)* 
	 *         (exitpoint+=ExitPoint exitpoint+=ExitPoint*)* 
	 *         (states+=State states+=State*)* 
	 *         initialtransition=InitialTransition? 
	 *         (junction+=Junction junction+=Junction*)* 
	 *         (choice+=Choice choice+=Choice*)* 
	 *         (transition+=Transition | historytransition+=HistoryTransition)*
	 *     )
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransitionBody returns TransitionBody
	 *
	 * Constraint:
	 *     (
	 *         (methodparameter+=MethodParameterTrigger | portevent+=PortEventTrigger | trigger+=Trigger)? 
	 *         transitionguard=TransitionGuard? 
	 *         transitionoperation=TransitionOperation? 
	 *         methodparameter+=MethodParameterTrigger? 
	 *         (
	 *             (portevent+=PortEventTrigger | trigger+=Trigger | transitionguard=TransitionGuard | transitionoperation=TransitionOperation)? 
	 *             methodparameter+=MethodParameterTrigger?
	 *         )*
	 *     )
	 */
	protected void sequence_TransitionBody(ISerializationContext context, TransitionBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransitionGuard returns TransitionGuard
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_TransitionGuard(ISerializationContext context, TransitionGuard semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.TRANSITION_GUARD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.TRANSITION_GUARD__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionGuardAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TransitionOperation returns TransitionOperation
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_TransitionOperation(ISerializationContext context, TransitionOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.TRANSITION_OPERATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.TRANSITION_OPERATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionOperationAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *     Transitions returns Transition
	 *
	 * Constraint:
	 *     ((name=ID | name=STRING)? from=[Vertex|QualifiedName] to=[Vertex|QualifiedName] transitionbody=TransitionBody)
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns Trigger
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Trigger(ISerializationContext context, Trigger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HclScopePackage.Literals.TRIGGER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HclScopePackage.Literals.TRIGGER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTriggerAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
