package com.castaways.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.castaways.SimpleSeafaring;

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
                entries.add(ModItems.COCONUT);
                //add more items here
            }).build();


    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, GROUP_KEY, CUSTOM_GROUP);
    }

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SimpleSeafaring.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        return Registry.register(Registries.ITEM, itemKey, item);
    }

    //ITEMS

    public static final Item COCONUT = register("coconut", Item::new, new Item.Settings());
}
