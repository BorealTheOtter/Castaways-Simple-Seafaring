package com.castaways.client.entity;
import com.castaways.SimpleSeafaring;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class ModModelLayers {

    public static final EntityModelLayer SEAL =
            new EntityModelLayer(SimpleSeafaring.id("seal"), "main");

    public static void registerModelLayers() {
        EntityModelLayerRegistry.registerModelLayer(
                SEAL,
                Seal::getTexturedModelData
        );
    }
}
