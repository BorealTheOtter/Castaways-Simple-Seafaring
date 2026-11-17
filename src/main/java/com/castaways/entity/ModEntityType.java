package com.castaways.entity;

import com.castaways.SimpleSeafaring;
import com.castaways.entity.vehicle.ModBoatEntity;
import com.castaways.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntityType{

    public static void initialize(){}

    public static final EntityType<ModBoatEntity> PALM_BOAT;

    private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> builder) {
        RegistryKey<EntityType<?>> key = RegistryKey.of(
          RegistryKeys.ENTITY_TYPE,
          Identifier.of(SimpleSeafaring.MOD_ID, id)
        );
        return Registry.register(Registries.ENTITY_TYPE, key, builder.build(key));
    }

    static {
        PALM_BOAT = register("palm_boat", EntityType.Builder.<ModBoatEntity>create((type, world) -> new ModBoatEntity(type, world, () -> ModItems.PALM_BOAT), SpawnGroup.MISC)
                        .dropsNothing()
                        .dimensions(1.375F, 0.5625F)
                        .eyeHeight(0.5625F)
                        .maxTrackingRange(10)
        );
    }
}
