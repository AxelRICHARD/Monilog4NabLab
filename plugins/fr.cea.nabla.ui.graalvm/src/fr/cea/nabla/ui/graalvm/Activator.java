package fr.cea.nabla.ui.graalvm;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// fr.cea.nabla.ui.graalvm.NablabGraalVMExecutableExtensionFactory:
	
	// The plug-in ID
	public static final String PLUGIN_ID = "fr.cea.nabla.ui.graalvm"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private Injector injector = Guice.createInjector(new NablabGraalVMModule());
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	public Injector getInjector() {
		return injector;
	}

}
