package com.castaways.client.entity;

import com.castaways.SimpleSeafaring;
import com.castaways.entity.SealEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.util.Identifier;

public class SealRenderer extends MobEntityRenderer<
        SealEntity,
        LivingEntityRenderState,
        Seal> {

    private static final Identifier TEXTURE =
            SimpleSeafaring.id("textures/entity/seal.png");

    public SealRenderer(EntityRendererFactory.Context context) {
        super(
                context,
                new Seal(context.getPart(ModModelLayers.SEAL)),
                0.4F
        );
    }

    @Override
    public LivingEntityRenderState createRenderState() {
        return new LivingEntityRenderState();
    }

    @Override
    public Identifier getTexture(LivingEntityRenderState state) {
        return TEXTURE;
    }
}
