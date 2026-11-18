package com.castaways.client;

import com.castaways.blocks.ModBlocks;
import com.castaways.client.render.entity.ModEntityRenderers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.RenderLayer;

public class SimpleSeafaringClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
        BlockRenderLayerMap.putBlock(ModBlocks.PALM_SAPLING, BlockRenderLayer.CUTOUT);
		ModEntityRenderers.register();
	}
}