package com.castaways.armor;


import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Map;

public class ModArmorMaterials {
    public static final RegistryKey<EquipmentAsset> SEAWEED_ASSET =
            RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of("simple-seafaring","seaweed"));

    public static final TagKey<Item> REPAIRS_SEAWEED =
            TagKey.of(RegistryKeys.ITEM, Identifier.of("simple-seafaring","repairs_seaweed_armor"));

    public static final ArmorMaterial SEAWEED = new ArmorMaterial(
            5,
            Map.of(
                    EquipmentType.HELMET, 1,
                    EquipmentType.LEGGINGS, 2,
                    EquipmentType.CHESTPLATE, 0,
                    EquipmentType.BOOTS, 0),
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0f,
            0.0f,
            REPAIRS_SEAWEED,
            SEAWEED_ASSET
    );
}
