/**
 * generated by Xtext 2.17.0
 */
package hu.bme.mit.gamma.logical.logicBase.language;

import hu.bme.mit.gamma.logical.logicBase.language.LogicBaseLanguageStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class LogicBaseLanguageStandaloneSetup extends LogicBaseLanguageStandaloneSetupGenerated {
  public static void doSetup() {
    new LogicBaseLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}