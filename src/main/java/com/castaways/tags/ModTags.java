package com.castaways.tags;

import com.castaways.SimpleSeafaring;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static final TagKey<Block> PALM_LOGS = TagKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(SimpleSeafaring.MOD_ID, "palm_logs")
    );
}
