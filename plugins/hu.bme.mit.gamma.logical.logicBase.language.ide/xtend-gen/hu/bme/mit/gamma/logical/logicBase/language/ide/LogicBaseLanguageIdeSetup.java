/**
 * generated by Xtext 2.17.0
 */
package hu.bme.mit.gamma.logical.logicBase.language.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import hu.bme.mit.gamma.logical.logicBase.language.LogicBaseLanguageRuntimeModule;
import hu.bme.mit.gamma.logical.logicBase.language.LogicBaseLanguageStandaloneSetup;
import hu.bme.mit.gamma.logical.logicBase.language.ide.LogicBaseLanguageIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class LogicBaseLanguageIdeSetup extends LogicBaseLanguageStandaloneSetup {
  @Override
  public Injector createInjector() {
    LogicBaseLanguageRuntimeModule _logicBaseLanguageRuntimeModule = new LogicBaseLanguageRuntimeModule();
    LogicBaseLanguageIdeModule _logicBaseLanguageIdeModule = new LogicBaseLanguageIdeModule();
    return Guice.createInjector(Modules2.mixin(_logicBaseLanguageRuntimeModule, _logicBaseLanguageIdeModule));
  }
}