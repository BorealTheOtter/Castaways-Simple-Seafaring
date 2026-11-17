package com.castaways.item;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class PalmLeavesBlock extends LeavesBlock {
    public PalmLeavesBlock(AbstractBlock.Settings settings) {
        super(0.025f, settings);
    }

    @Override
    public MapCodec<? extends LeavesBlock> getCodec() {
        return null;
    }

    @Override
    protected void spawnLeafParticle(World world, BlockPos pos, Random random) {

    }
}
