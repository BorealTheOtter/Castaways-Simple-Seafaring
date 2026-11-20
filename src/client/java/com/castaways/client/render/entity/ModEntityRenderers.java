package com.castaways.client.render.entity;

import com.castaways.SimpleSeafaring;
import com.castaways.entity.ModEntityType;
import com.castaways.entity.vehicle.ModBoatEntity;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.EntityRendererFactories;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;

public class ModEntityRenderers {

    public static final EntityModelLayer PALM_BOAT_LAYER = registerVanillaBoat("palm", ModEntityType.PALM_BOAT, false);


    private static EntityModelLayer registerVanillaBoat(String woodName, EntityType<? extends ModBoatEntity> type, boolean isChestBoat){
        EntityModelLayer layer = new EntityModelLayer(Identifier.of(SimpleSeafaring.MOD_ID, (isChestBoat ? "chest_boat/" : "boat/") + woodName), "main");

        EntityModelLayerRegistry.registerModelLayer(layer, isChestBoat ? BoatEntityModel::getChestTexturedModelData : BoatEntityModel::getTexturedModelData);

        EntityRendererFactories.register(type, (context) -> new ModBoatEntityRenderer(context, layer));
        return layer;
    }

    public static void register(){

    }
}
