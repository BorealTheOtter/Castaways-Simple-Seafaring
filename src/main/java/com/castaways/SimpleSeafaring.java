package com.castaways;

import com.castaways.blocks.ModBlocks;
import com.castaways.entity.ModEntityType;
import com.castaways.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.castaways.blocks.ModBlocks;

public class SimpleSeafaring implements ModInitializer {
	public static final String MOD_ID = "simple-seafaring";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
        ModBlocks.initialize();
		ModEntityType.initialize();

		ModItems.registerItemGroups();
        ModItems.registerFuels();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
