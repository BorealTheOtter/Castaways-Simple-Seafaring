package com.castaways.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class PalmLeavesBlock extends LeavesBlock {

    public static final MapCodec<PalmLeavesBlock> CODEC = createCodec(PalmLeavesBlock::new);

    public PalmLeavesBlock(AbstractBlock.Settings settings) {
        super(0.025f, settings);
    }

    @Override
    public MapCodec<? extends LeavesBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected void spawnLeafParticle(World world, BlockPos pos, Random random) {

    }
}
