/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ZustandsdiagrammGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Zustandsdiagramm.Model");
		private final UnorderedGroup cUnorderedGroup = (UnorderedGroup)rule.eContents().get(1);
		private final Assignment cInitialStateAssignment_0 = (Assignment)cUnorderedGroup.eContents().get(0);
		private final RuleCall cInitialStateInitialStateParserRuleCall_0_0 = (RuleCall)cInitialStateAssignment_0.eContents().get(0);
		private final Assignment cFinalStateAssignment_1 = (Assignment)cUnorderedGroup.eContents().get(1);
		private final RuleCall cFinalStateFinalStateParserRuleCall_1_0 = (RuleCall)cFinalStateAssignment_1.eContents().get(0);
		private final Assignment cGenericStateAssignment_2 = (Assignment)cUnorderedGroup.eContents().get(2);
		private final RuleCall cGenericStateGenericStateParserRuleCall_2_0 = (RuleCall)cGenericStateAssignment_2.eContents().get(0);
		
		//Model:
		//	initialState+=InitialState & finalState+=FinalState & genericState+=GenericState*;
		@Override public ParserRule getRule() { return rule; }
		
		//initialState+=InitialState & finalState+=FinalState & genericState+=GenericState*
		public UnorderedGroup getUnorderedGroup() { return cUnorderedGroup; }
		
		//initialState+=InitialState
		public Assignment getInitialStateAssignment_0() { return cInitialStateAssignment_0; }
		
		//InitialState
		public RuleCall getInitialStateInitialStateParserRuleCall_0_0() { return cInitialStateInitialStateParserRuleCall_0_0; }
		
		//finalState+=FinalState
		public Assignment getFinalStateAssignment_1() { return cFinalStateAssignment_1; }
		
		//FinalState
		public RuleCall getFinalStateFinalStateParserRuleCall_1_0() { return cFinalStateFinalStateParserRuleCall_1_0; }
		
		//genericState+=GenericState*
		public Assignment getGenericStateAssignment_2() { return cGenericStateAssignment_2; }
		
		//GenericState
		public RuleCall getGenericStateGenericStateParserRuleCall_2_0() { return cGenericStateGenericStateParserRuleCall_2_0; }
	}
	public class TargetableStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Zustandsdiagramm.TargetableState");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//TargetableState:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class InitialStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Zustandsdiagramm.InitialState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInitialStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cWithKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTransitionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTransitionTransitionParserRuleCall_4_0 = (RuleCall)cTransitionAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//InitialState:
		//	'initialState' ':' name=ID 'with' transition=Transition ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'initialState' ':' name=ID 'with' transition=Transition ';'
		public Group getGroup() { return cGroup; }
		
		//'initialState'
		public Keyword getInitialStateKeyword_0() { return cInitialStateKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'with'
		public Keyword getWithKeyword_3() { return cWithKeyword_3; }
		
		//transition=Transition
		public Assignment getTransitionAssignment_4() { return cTransitionAssignment_4; }
		
		//Transition
		public RuleCall getTransitionTransitionParserRuleCall_4_0() { return cTransitionTransitionParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class FinalStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Zustandsdiagramm.FinalState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFinalStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameTargetableStateParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//FinalState:
		//	'finalState' ':' name=TargetableState ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'finalState' ':' name=TargetableState ';'
		public Group getGroup() { return cGroup; }
		
		//'finalState'
		public Keyword getFinalStateKeyword_0() { return cFinalStateKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//name=TargetableState
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//TargetableState
		public RuleCall getNameTargetableStateParserRuleCall_2_0() { return cNameTargetableStateParserRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class GenericStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Zustandsdiagramm.GenericState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGenericStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameTargetableStateParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cWithKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTransitionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTransitionsTransitionParserRuleCall_4_0 = (RuleCall)cTransitionsAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GenericState:
		//	'genericState' ':' name=TargetableState 'with' transitions+=Transition+ ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'genericState' ':' name=TargetableState 'with' transitions+=Transition+ ';'
		public Group getGroup() { return cGroup; }
		
		//'genericState'
		public Keyword getGenericStateKeyword_0() { return cGenericStateKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//name=TargetableState
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//TargetableState
		public RuleCall getNameTargetableStateParserRuleCall_2_0() { return cNameTargetableStateParserRuleCall_2_0; }
		
		//'with'
		public Keyword getWithKeyword_3() { return cWithKeyword_3; }
		
		//transitions+=Transition+
		public Assignment getTransitionsAssignment_4() { return cTransitionsAssignment_4; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_4_0() { return cTransitionsTransitionParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Zustandsdiagramm.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEventKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEventAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEventEventParserRuleCall_2_0 = (RuleCall)cEventAssignment_2.eContents().get(0);
		private final Keyword cToKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cToAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cToTargetableStateCrossReference_4_0 = (CrossReference)cToAssignment_4.eContents().get(0);
		private final RuleCall cToTargetableStateIDTerminalRuleCall_4_0_1 = (RuleCall)cToTargetableStateCrossReference_4_0.eContents().get(1);
		
		//Transition:
		//	'event' ':' event=Event 'to' to=[TargetableState];
		@Override public ParserRule getRule() { return rule; }
		
		//'event' ':' event=Event 'to' to=[TargetableState]
		public Group getGroup() { return cGroup; }
		
		//'event'
		public Keyword getEventKeyword_0() { return cEventKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//event=Event
		public Assignment getEventAssignment_2() { return cEventAssignment_2; }
		
		//Event
		public RuleCall getEventEventParserRuleCall_2_0() { return cEventEventParserRuleCall_2_0; }
		
		//'to'
		public Keyword getToKeyword_3() { return cToKeyword_3; }
		
		//to=[TargetableState]
		public Assignment getToAssignment_4() { return cToAssignment_4; }
		
		//[TargetableState]
		public CrossReference getToTargetableStateCrossReference_4_0() { return cToTargetableStateCrossReference_4_0; }
		
		//ID
		public RuleCall getToTargetableStateIDTerminalRuleCall_4_0_1() { return cToTargetableStateIDTerminalRuleCall_4_0_1; }
	}
	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Zustandsdiagramm.Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cAndKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cGuardAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cGuardGuardParserRuleCall_1_1_0 = (RuleCall)cGuardAssignment_1_1.eContents().get(0);
		
		//Event:
		//	name=ID ('and' guard=Guard)?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ('and' guard=Guard)?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//('and' guard=Guard)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'and'
		public Keyword getAndKeyword_1_0() { return cAndKeyword_1_0; }
		
		//guard=Guard
		public Assignment getGuardAssignment_1_1() { return cGuardAssignment_1_1; }
		
		//Guard
		public RuleCall getGuardGuardParserRuleCall_1_1_0() { return cGuardGuardParserRuleCall_1_1_0; }
	}
	public class GuardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Zustandsdiagramm.Guard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGuardKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Guard:
		//	'guard' ':' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'guard' ':' name=ID
		public Group getGroup() { return cGroup; }
		
		//'guard'
		public Keyword getGuardKeyword_0() { return cGuardKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	
	
	private final ModelElements pModel;
	private final TargetableStateElements pTargetableState;
	private final InitialStateElements pInitialState;
	private final FinalStateElements pFinalState;
	private final GenericStateElements pGenericState;
	private final TransitionElements pTransition;
	private final EventElements pEvent;
	private final GuardElements pGuard;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ZustandsdiagrammGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pTargetableState = new TargetableStateElements();
		this.pInitialState = new InitialStateElements();
		this.pFinalState = new FinalStateElements();
		this.pGenericState = new GenericStateElements();
		this.pTransition = new TransitionElements();
		this.pEvent = new EventElements();
		this.pGuard = new GuardElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.Zustandsdiagramm".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	initialState+=InitialState & finalState+=FinalState & genericState+=GenericState*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//TargetableState:
	//	name=ID;
	public TargetableStateElements getTargetableStateAccess() {
		return pTargetableState;
	}
	
	public ParserRule getTargetableStateRule() {
		return getTargetableStateAccess().getRule();
	}
	
	//InitialState:
	//	'initialState' ':' name=ID 'with' transition=Transition ';';
	public InitialStateElements getInitialStateAccess() {
		return pInitialState;
	}
	
	public ParserRule getInitialStateRule() {
		return getInitialStateAccess().getRule();
	}
	
	//FinalState:
	//	'finalState' ':' name=TargetableState ';';
	public FinalStateElements getFinalStateAccess() {
		return pFinalState;
	}
	
	public ParserRule getFinalStateRule() {
		return getFinalStateAccess().getRule();
	}
	
	//GenericState:
	//	'genericState' ':' name=TargetableState 'with' transitions+=Transition+ ';';
	public GenericStateElements getGenericStateAccess() {
		return pGenericState;
	}
	
	public ParserRule getGenericStateRule() {
		return getGenericStateAccess().getRule();
	}
	
	//Transition:
	//	'event' ':' event=Event 'to' to=[TargetableState];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//Event:
	//	name=ID ('and' guard=Guard)?;
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}
	
	//Guard:
	//	'guard' ':' name=ID;
	public GuardElements getGuardAccess() {
		return pGuard;
	}
	
	public ParserRule getGuardRule() {
		return getGuardAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
