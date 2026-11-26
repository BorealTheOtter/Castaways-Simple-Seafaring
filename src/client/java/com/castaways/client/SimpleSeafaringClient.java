package com.castaways.client;

import com.castaways.blocks.ModBlocks;
import com.castaways.client.entity.ModModelLayers;
import com.castaways.client.entity.SealRenderer;
import com.castaways.client.render.entity.ModEntityRenderers;
import com.castaways.entity.ModEntityType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.entity.EntityRendererFactories;
import net.minecraft.world.biome.FoliageColors;

public class SimpleSeafaringClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
        BlockRenderLayerMap.putBlock(ModBlocks.PALM_SAPLING, BlockRenderLayer.CUTOUT);
        ModModelLayers.registerModelLayers();
        EntityRendererFactories.register(ModEntityType.SEAL, SealRenderer::new);
		ModEntityRenderers.register();

		ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
			if (world != null && pos != null) {
				return BiomeColors.getFoliageColor(world, pos);
			}
			return FoliageColors.DEFAULT;
		}, ModBlocks.PALM_LEAVES);
	}
}