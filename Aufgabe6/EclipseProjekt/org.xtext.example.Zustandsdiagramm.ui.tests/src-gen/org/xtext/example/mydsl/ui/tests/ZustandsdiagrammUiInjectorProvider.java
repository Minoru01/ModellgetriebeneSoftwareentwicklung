/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.Zustandsdiagramm.ui.internal.ZustandsdiagrammActivator;

public class ZustandsdiagrammUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ZustandsdiagrammActivator.getInstance().getInjector("org.xtext.example.mydsl.Zustandsdiagramm");
	}

}
