/*
 * generated by Xtext 2.17.0
 */
package hu.bme.mit.gamma.logical.logicFunction.language.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import hu.bme.mit.gamma.logical.logicFunction.language.ide.contentassist.antlr.internal.InternalLogicFunctionLanguageParser;
import hu.bme.mit.gamma.logical.logicFunction.language.services.LogicFunctionLanguageGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LogicFunctionLanguageParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LogicFunctionLanguageGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LogicFunctionLanguageGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getLogicFunctionDiagramAccess().getAlternatives_3(), "rule__LogicFunctionDiagram__Alternatives_3");
			builder.put(grammarAccess.getRuleDeclarationAccess().getAlternatives_4(), "rule__RuleDeclaration__Alternatives_4");
			builder.put(grammarAccess.getANDAccess().getAlternatives_2(), "rule__AND__Alternatives_2");
			builder.put(grammarAccess.getANDAccess().getAlternatives_3_1(), "rule__AND__Alternatives_3_1");
			builder.put(grammarAccess.getORAccess().getAlternatives_2(), "rule__OR__Alternatives_2");
			builder.put(grammarAccess.getORAccess().getAlternatives_3_1(), "rule__OR__Alternatives_3_1");
			builder.put(grammarAccess.getXORAccess().getAlternatives_2(), "rule__XOR__Alternatives_2");
			builder.put(grammarAccess.getXORAccess().getAlternatives_3_1(), "rule__XOR__Alternatives_3_1");
			builder.put(grammarAccess.getNOTAccess().getAlternatives_2(), "rule__NOT__Alternatives_2");
			builder.put(grammarAccess.getEventDirectionAccess().getAlternatives(), "rule__EventDirection__Alternatives");
			builder.put(grammarAccess.getLogicFunctionDiagramAccess().getGroup(), "rule__LogicFunctionDiagram__Group__0");
			builder.put(grammarAccess.getRuleDeclarationAccess().getGroup(), "rule__RuleDeclaration__Group__0");
			builder.put(grammarAccess.getRuleDeclarationAccess().getGroup_3(), "rule__RuleDeclaration__Group_3__0");
			builder.put(grammarAccess.getANDAccess().getGroup(), "rule__AND__Group__0");
			builder.put(grammarAccess.getANDAccess().getGroup_3(), "rule__AND__Group_3__0");
			builder.put(grammarAccess.getORAccess().getGroup(), "rule__OR__Group__0");
			builder.put(grammarAccess.getORAccess().getGroup_3(), "rule__OR__Group_3__0");
			builder.put(grammarAccess.getXORAccess().getGroup(), "rule__XOR__Group__0");
			builder.put(grammarAccess.getXORAccess().getGroup_3(), "rule__XOR__Group_3__0");
			builder.put(grammarAccess.getNOTAccess().getGroup(), "rule__NOT__Group__0");
			builder.put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
			builder.put(grammarAccess.getEventDeclarationAccess().getGroup(), "rule__EventDeclaration__Group__0");
			builder.put(grammarAccess.getPredicateAccess().getGroup(), "rule__Predicate__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getLogicFunctionDiagramAccess().getNameAssignment_1(), "rule__LogicFunctionDiagram__NameAssignment_1");
			builder.put(grammarAccess.getLogicFunctionDiagramAccess().getRuleAssignment_3_0(), "rule__LogicFunctionDiagram__RuleAssignment_3_0");
			builder.put(grammarAccess.getLogicFunctionDiagramAccess().getInterfacesAssignment_3_1(), "rule__LogicFunctionDiagram__InterfacesAssignment_3_1");
			builder.put(grammarAccess.getRuleDeclarationAccess().getNameAssignment_1(), "rule__RuleDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getRuleDeclarationAccess().getRaisesAssignment_3_0(), "rule__RuleDeclaration__RaisesAssignment_3_0");
			builder.put(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_0(), "rule__RuleDeclaration__ExpressionAssignment_4_0");
			builder.put(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_1(), "rule__RuleDeclaration__ExpressionAssignment_4_1");
			builder.put(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_2(), "rule__RuleDeclaration__ExpressionAssignment_4_2");
			builder.put(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_3(), "rule__RuleDeclaration__ExpressionAssignment_4_3");
			builder.put(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_4(), "rule__RuleDeclaration__ExpressionAssignment_4_4");
			builder.put(grammarAccess.getRuleDeclarationAccess().getExpressionAssignment_4_5(), "rule__RuleDeclaration__ExpressionAssignment_4_5");
			builder.put(grammarAccess.getANDAccess().getArgumentsAssignment_2_0(), "rule__AND__ArgumentsAssignment_2_0");
			builder.put(grammarAccess.getANDAccess().getArgumentsAssignment_2_1(), "rule__AND__ArgumentsAssignment_2_1");
			builder.put(grammarAccess.getANDAccess().getArgumentsAssignment_2_2(), "rule__AND__ArgumentsAssignment_2_2");
			builder.put(grammarAccess.getANDAccess().getArgumentsAssignment_2_3(), "rule__AND__ArgumentsAssignment_2_3");
			builder.put(grammarAccess.getANDAccess().getArgumentsAssignment_2_4(), "rule__AND__ArgumentsAssignment_2_4");
			builder.put(grammarAccess.getANDAccess().getArgumentsAssignment_2_5(), "rule__AND__ArgumentsAssignment_2_5");
			builder.put(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_0(), "rule__AND__ArgumentsAssignment_3_1_0");
			builder.put(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_1(), "rule__AND__ArgumentsAssignment_3_1_1");
			builder.put(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_2(), "rule__AND__ArgumentsAssignment_3_1_2");
			builder.put(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_3(), "rule__AND__ArgumentsAssignment_3_1_3");
			builder.put(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_4(), "rule__AND__ArgumentsAssignment_3_1_4");
			builder.put(grammarAccess.getANDAccess().getArgumentsAssignment_3_1_5(), "rule__AND__ArgumentsAssignment_3_1_5");
			builder.put(grammarAccess.getORAccess().getArgumentsAssignment_2_0(), "rule__OR__ArgumentsAssignment_2_0");
			builder.put(grammarAccess.getORAccess().getArgumentsAssignment_2_1(), "rule__OR__ArgumentsAssignment_2_1");
			builder.put(grammarAccess.getORAccess().getArgumentsAssignment_2_2(), "rule__OR__ArgumentsAssignment_2_2");
			builder.put(grammarAccess.getORAccess().getArgumentsAssignment_2_3(), "rule__OR__ArgumentsAssignment_2_3");
			builder.put(grammarAccess.getORAccess().getArgumentsAssignment_2_4(), "rule__OR__ArgumentsAssignment_2_4");
			builder.put(grammarAccess.getORAccess().getArgumentsAssignment_2_5(), "rule__OR__ArgumentsAssignment_2_5");
			builder.put(grammarAccess.getORAccess().getArgumentsAssignment_3_1_0(), "rule__OR__ArgumentsAssignment_3_1_0");
			builder.put(grammarAccess.getORAccess().getArgumentsAssignment_3_1_1(), "rule__OR__ArgumentsAssignment_3_1_1");
			builder.put(grammarAccess.getORAccess().getArgumentsAssignment_3_1_2(), "rule__OR__ArgumentsAssignment_3_1_2");
			builder.put(grammarAccess.getORAccess().getArgumentsAssignment_3_1_3(), "rule__OR__ArgumentsAssignment_3_1_3");
			builder.put(grammarAccess.getORAccess().getArgumentsAssignment_3_1_4(), "rule__OR__ArgumentsAssignment_3_1_4");
			builder.put(grammarAccess.getORAccess().getArgumentsAssignment_3_1_5(), "rule__OR__ArgumentsAssignment_3_1_5");
			builder.put(grammarAccess.getXORAccess().getArgumentsAssignment_2_0(), "rule__XOR__ArgumentsAssignment_2_0");
			builder.put(grammarAccess.getXORAccess().getArgumentsAssignment_2_1(), "rule__XOR__ArgumentsAssignment_2_1");
			builder.put(grammarAccess.getXORAccess().getArgumentsAssignment_2_2(), "rule__XOR__ArgumentsAssignment_2_2");
			builder.put(grammarAccess.getXORAccess().getArgumentsAssignment_2_3(), "rule__XOR__ArgumentsAssignment_2_3");
			builder.put(grammarAccess.getXORAccess().getArgumentsAssignment_2_4(), "rule__XOR__ArgumentsAssignment_2_4");
			builder.put(grammarAccess.getXORAccess().getArgumentsAssignment_2_5(), "rule__XOR__ArgumentsAssignment_2_5");
			builder.put(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_0(), "rule__XOR__ArgumentsAssignment_3_1_0");
			builder.put(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_1(), "rule__XOR__ArgumentsAssignment_3_1_1");
			builder.put(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_2(), "rule__XOR__ArgumentsAssignment_3_1_2");
			builder.put(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_3(), "rule__XOR__ArgumentsAssignment_3_1_3");
			builder.put(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_4(), "rule__XOR__ArgumentsAssignment_3_1_4");
			builder.put(grammarAccess.getXORAccess().getArgumentsAssignment_3_1_5(), "rule__XOR__ArgumentsAssignment_3_1_5");
			builder.put(grammarAccess.getNOTAccess().getArgumentAssignment_2_0(), "rule__NOT__ArgumentAssignment_2_0");
			builder.put(grammarAccess.getNOTAccess().getArgumentAssignment_2_1(), "rule__NOT__ArgumentAssignment_2_1");
			builder.put(grammarAccess.getNOTAccess().getArgumentAssignment_2_2(), "rule__NOT__ArgumentAssignment_2_2");
			builder.put(grammarAccess.getNOTAccess().getArgumentAssignment_2_3(), "rule__NOT__ArgumentAssignment_2_3");
			builder.put(grammarAccess.getNOTAccess().getArgumentAssignment_2_4(), "rule__NOT__ArgumentAssignment_2_4");
			builder.put(grammarAccess.getNOTAccess().getArgumentAssignment_2_5(), "rule__NOT__ArgumentAssignment_2_5");
			builder.put(grammarAccess.getPredicateListenAccess().getListensAssignment(), "rule__PredicateListen__ListensAssignment");
			builder.put(grammarAccess.getRuleListenAccess().getListensAssignment(), "rule__RuleListen__ListensAssignment");
			builder.put(grammarAccess.getInterfaceAccess().getNameAssignment_1(), "rule__Interface__NameAssignment_1");
			builder.put(grammarAccess.getInterfaceAccess().getEventsAssignment_3(), "rule__Interface__EventsAssignment_3");
			builder.put(grammarAccess.getEventDeclarationAccess().getDirectionAssignment_0(), "rule__EventDeclaration__DirectionAssignment_0");
			builder.put(grammarAccess.getEventDeclarationAccess().getExtraValueTypeAssignment_1(), "rule__EventDeclaration__ExtraValueTypeAssignment_1");
			builder.put(grammarAccess.getEventDeclarationAccess().getNameAssignment_2(), "rule__EventDeclaration__NameAssignment_2");
			builder.put(grammarAccess.getPredicateAccess().getListensAssignment_1(), "rule__Predicate__ListensAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LogicFunctionLanguageGrammarAccess grammarAccess;

	@Override
	protected InternalLogicFunctionLanguageParser createParser() {
		InternalLogicFunctionLanguageParser result = new InternalLogicFunctionLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LogicFunctionLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LogicFunctionLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}