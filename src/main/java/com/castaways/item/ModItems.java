package com.castaways.item;

import com.castaways.entity.ModEntityType;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.castaways.SimpleSeafaring;
import com.castaways.blocks.ModBlocks;
import java.util.function.Function;

public class ModItems {
    public static final RegistryKey<ItemGroup> GROUP_KEY = RegistryKey.of(
            RegistryKeys.ITEM_GROUP,
            Identifier.of(SimpleSeafaring.MOD_ID, "simple_seafarers")
    );

    public static final ItemGroup CUSTOM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.COCONUT))
            .displayName(Text.translatable("itemgroup." + SimpleSeafaring.MOD_ID))
            .entries((displayContext, entries) -> {
                //BLOCKS
                entries.add(ModBlocks.PALM_LOG);
                entries.add(ModBlocks.PALM_WOOD);
                entries.add(ModBlocks.STRIPPED_PALM_LOG);
                entries.add(ModBlocks.STRIPPED_PALM_WOOD);
                entries.add(ModBlocks.PALM_LEAVES);
                entries.add(ModBlocks.PALM_SAPLING);
                entries.add(ModBlocks.PALM_PLANKS);
                //ITEMS
                entries.add(ModItems.COCONUT);
                //ENTITY
                entries.add(ModItems.PALM_BOAT);
            }).build();


    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, GROUP_KEY, CUSTOM_GROUP);
    }

    public static void registerFuels() {
        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(PALM_BOAT, 1200);
            builder.add(ModBlocks.PALM_SAPLING, 100);
            builder.add(ModBlocks.PALM_PLANKS, 300);
            builder.add(ModBlocks.PALM_LEAVES, 1);
        });
    }

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SimpleSeafaring.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        return Registry.register(Registries.ITEM, itemKey, item);
    }


    //ITEMS

    public static final Item COCONUT = register("coconut", Item::new, new Item.Settings().food(new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(2.5f)
            .alwaysEdible()
            .build()
            )
    );

    public static final Item PALM_BOAT = register("palm_boat", settings -> new BoatItem(ModEntityType.PALM_BOAT, settings), new Item.Settings().maxCount(1));
}
