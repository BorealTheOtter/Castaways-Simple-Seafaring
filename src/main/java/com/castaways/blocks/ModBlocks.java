package com.castaways.blocks;


import com.castaways.item.PalmLeavesBlock;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import java.util.function.Function;
import com.castaways.SimpleSeafaring;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

import static net.minecraft.block.Blocks.createLeavesSettings;

public class ModBlocks {

    public static final Block STRIPPED_PALM_LOG = register("stripped_palm_log", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable());

    public static final Block PALM_LOG = register("palm_log", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LOG)
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable());

    public static final Block PALM_WOOD = register("palm_wood", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_WOOD)
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable());

    public static final Block STRIPPED_PALM_WOOD = register("stripped_palm_wood", PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable());

    public static final Block PALM_LEAVES = register("palm_leaves", PalmLeavesBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.GRASS)
                    .burnable());

    public static final Block PALM_PLANKS = register("palm_planks", Block::new, AbstractBlock.Settings.create()
            .mapColor(MapColor.RAW_IRON_PINK).instrument(NoteBlockInstrument.BASS)
            .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)
            .burnable());

    //TEMP BLOCK TO SATISFY DROP TABLE
    public static final Block PALM_SAPLING = register("palm_sapling", Block::new, AbstractBlock.Settings.copy(Blocks.COBBLESTONE).strength(2f));

    private static Block register(String name, Function<AbstractBlock.Settings, Block> factory,
                                  AbstractBlock.Settings settings) {
        Identifier id = Identifier.of(SimpleSeafaring.MOD_ID, name);

        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, id);
        Block block = factory.apply(settings.registryKey(blockKey));

        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, id);
        BlockItem item = new BlockItem(block,
                new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey());

        Registry.register(Registries.ITEM, itemKey, item);
        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    public static void initialize() {
        StrippableBlockRegistry.register(PALM_LOG, STRIPPED_PALM_LOG);


        //Flammable registry
        FlammableBlockRegistry flammableRegistry = FlammableBlockRegistry.getDefaultInstance();

        // Logs and wood
        flammableRegistry.add(PALM_LOG, 5, 5);
        flammableRegistry.add(STRIPPED_PALM_LOG, 5, 5);
        flammableRegistry.add(PALM_WOOD, 5, 5);
        flammableRegistry.add(STRIPPED_PALM_WOOD, 5, 5);

        // Leaves
        flammableRegistry.add(PALM_LEAVES, 30, 60);

        // Planks
        flammableRegistry.add(PALM_PLANKS, 5, 20);
    }
}
