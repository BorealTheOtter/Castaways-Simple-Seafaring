package com.castaways.world.tree;

import com.castaways.SimpleSeafaring;
import com.castaways.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator PALM = new SaplingGenerator(SimpleSeafaring.MOD_ID + ":palm",
            Optional.empty(), Optional.of(ModConfiguredFeatures.PALM_KEY), Optional.empty());
}
