package com.castaways.client;

import com.castaways.client.render.entity.ModEntityRenderers;
import net.fabricmc.api.ClientModInitializer;

public class SimpleSeafaringClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		ModEntityRenderers.register();
	}
}