package com.castaways.entity.vehicle;

import java.util.function.Supplier;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class ModChestBoatEntity extends ChestBoatEntity {

    public ModChestBoatEntity(EntityType<? extends net.minecraft.entity.vehicle.ChestBoatEntity> entityType, World world, Supplier<Item> supplier) {
        super(entityType, world, supplier);
    }
}

