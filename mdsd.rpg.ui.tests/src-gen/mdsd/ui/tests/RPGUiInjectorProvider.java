/*
 * generated by Xtext 2.21.0
 */
package mdsd.ui.tests;

import com.google.inject.Injector;
import mdsd.rpg.ui.internal.RpgActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class RPGUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return RpgActivator.getInstance().getInjector("mdsd.RPG");
	}

}
