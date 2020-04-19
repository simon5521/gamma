/*
 * generated by Xtext 2.17.0
 */
package hu.bme.mit.gamma.logical.logicBase.language.ide

import com.google.inject.Guice
import hu.bme.mit.gamma.logical.logicBase.language.LogicBaseLanguageRuntimeModule
import hu.bme.mit.gamma.logical.logicBase.language.LogicBaseLanguageStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class LogicBaseLanguageIdeSetup extends LogicBaseLanguageStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new LogicBaseLanguageRuntimeModule, new LogicBaseLanguageIdeModule))
	}
	
}
