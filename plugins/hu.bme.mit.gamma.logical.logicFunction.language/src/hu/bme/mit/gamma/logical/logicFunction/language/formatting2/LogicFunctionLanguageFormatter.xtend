/*
 * generated by Xtext 2.17.0
 */
package hu.bme.mit.gamma.logical.logicFunction.language.formatting2

import com.google.inject.Inject
import hu.bme.mit.gamma.logical.logicBase.language.formatting2.LogicBaseLanguageFormatter
import hu.bme.mit.gamma.logical.logicFunction.language.services.LogicFunctionLanguageGrammarAccess
import hu.bme.mit.gamma.logical.logicFunction.model.LogicFunctionDiagram
import hu.bme.mit.gamma.logical.logicFunction.model.Rule
import org.eclipse.xtext.formatting2.IFormattableDocument

class LogicFunctionLanguageFormatter extends LogicBaseLanguageFormatter {
	
	@Inject extension LogicFunctionLanguageGrammarAccess

	def dispatch void format(LogicFunctionDiagram logicFunctionDiagram, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (rule : logicFunctionDiagram.rule) {
			rule.format
		}
		for (logicInterfaceSpecification : logicFunctionDiagram.interfaces) {
			logicInterfaceSpecification.format
		}
	}

	def dispatch void format(Rule rule, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		rule.expression.format
	}
	
	// TODO: implement for AND, OR, XOR, NOT, PredicateListen
}
