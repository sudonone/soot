package ca.mcgill.sable.graph;

import org.eclipse.ui.plugin.*;
import org.eclipse.core.runtime.*;
import org.eclipse.core.resources.*;
import java.util.*;
import ca.mcgill.sable.graph.testing.*;

/**
 * The main plugin class to be used in the desktop.
 */
public class GraphPlugin extends AbstractUIPlugin {
	//The shared instance.
	private static GraphPlugin plugin;
	//Resource bundle.
	private ResourceBundle resourceBundle;
	
	private GraphGenerator generator;
	
	/**
	 * The constructor.
	 */
	public GraphPlugin(IPluginDescriptor descriptor) {
		super(descriptor);
		plugin = this;
		try {
			resourceBundle= ResourceBundle.getBundle("ca.mcgill.sable.graph.GraphPluginResources");
		} catch (MissingResourceException x) {
			resourceBundle = null;
		}
	}

	/**
	 * Returns the shared instance.
	 */
	public static GraphPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns the workspace instance.
	 */
	public static IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
	}

	/**
	 * Returns the string from the plugin's resource bundle,
	 * or 'key' if not found.
	 */
	public static String getResourceString(String key) {
		ResourceBundle bundle= GraphPlugin.getDefault().getResourceBundle();
		try {
			return bundle.getString(key);
		} catch (MissingResourceException e) {
			return key;
		}
	}

	/**
	 * Returns the plugin's resource bundle,
	 */
	public ResourceBundle getResourceBundle() {
		return resourceBundle;
	}
	/**
	 * @return
	 */
	public GraphGenerator getGenerator() {
		return generator;
	}

	/**
	 * @param generator
	 */
	public void setGenerator(GraphGenerator generator) {
		this.generator = generator;
	}

}
