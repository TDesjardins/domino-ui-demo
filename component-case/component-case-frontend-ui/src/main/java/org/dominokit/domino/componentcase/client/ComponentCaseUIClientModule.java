package org.dominokit.domino.componentcase.client;

import com.google.gwt.core.client.EntryPoint;
import org.dominokit.domino.api.client.ModuleConfigurator;
import org.dominokit.domino.api.client.annotations.ClientModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ClientModule(name="ComponentCaseUI")
public class ComponentCaseUIClientModule implements EntryPoint {

	private static final Logger LOGGER = LoggerFactory.getLogger(ComponentCaseUIClientModule.class);

	public void onModuleLoad() {
		LOGGER.info("Initializing ComponentCase frontend UI module ...");
		new ModuleConfigurator().configureModule(new ComponentCaseUIModuleConfiguration());
	}
}
