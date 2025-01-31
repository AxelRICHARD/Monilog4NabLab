/*
 * generated by Xtext 2.21.0
 */
package fr.cea.nabla.ui.graalvm;

import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

public class NablabGraalVMExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		Activator activator = Activator.getDefault();
		return activator != null ? activator.getInjector() : null;
	}

}
