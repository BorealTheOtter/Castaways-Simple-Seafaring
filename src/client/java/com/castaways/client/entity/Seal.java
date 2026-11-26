package com.castaways.client.entity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.*;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
// Made with Blockbench 5.2.2
// Updated for Minecraft 1.21.11 Yarn
public class Seal extends EntityModel<LivingEntityRenderState> {
    private final ModelPart bb_main;
    public Seal(ModelPart root) {
        super(root);
        this.bb_main = root.getChild("bb_main");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData bb_main = modelPartData.addChild(
                "bb_main",
                ModelPartBuilder.create()
                        .uv(0, 0).cuboid(-2.0F, -4.0F, -6.0F, 5.0F, 4.0F, 9.0F, new Dilation(0.0F))
                        .uv(10, 21).cuboid(-1.0F, -3.0F, -8.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
                        .uv(16, 15).cuboid(-3.0F, -3.0F, -5.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
                        .uv(0, 17).cuboid(3.0F, -3.0F, -5.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
                        .uv(20, 21).cuboid(-1.0F, -3.0F, 3.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
                        .uv(0, 23).cuboid(-1.0F, -2.0F, 5.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
                        .uv(20, 13).cuboid(-2.0F, -2.0F, 7.0F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
                        .uv(0, 15).cuboid(-3.0F, -2.0F, 8.0F, 7.0F, 1.0F, 1.0F, new Dilation(0.0F))
                        .uv(0, 13).cuboid(-4.0F, -2.0F, 9.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F)),
                ModelTransform.origin(0.0F, 24.0F, 0.0F)
        );
        return TexturedModelData.of(modelData, 32, 32);
    }
    @Override
    public void setAngles(LivingEntityRenderState state) {
        // Model animation goes here.
    }
}
