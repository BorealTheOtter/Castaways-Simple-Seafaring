package com.castaways.entity.vehicle;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.function.Supplier;

public class ModBoatEntity extends BoatEntity {

    public ModBoatEntity(EntityType<? extends BoatEntity> entityType, World world, Supplier<Item> supplier) {
        super(entityType, world, supplier);
    }
}
