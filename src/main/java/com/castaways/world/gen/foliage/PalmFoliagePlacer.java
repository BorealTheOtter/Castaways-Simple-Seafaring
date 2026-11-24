//package com.castaways.world.gen.foliage;
//
//import com.mojang.serialization.MapCodec;
//import com.mojang.serialization.codecs.RecordCodecBuilder;
//import net.minecraft.util.math.intprovider.IntProvider;
//import net.minecraft.util.math.random.Random;
//import net.minecraft.world.TestableWorld;
//import net.minecraft.world.gen.feature.TreeFeatureConfig;
//import net.minecraft.world.gen.foliage.FoliagePlacer;
//import net.minecraft.world.gen.foliage.FoliagePlacerType;
//
//public class PalmFoliagePlacer extends FoliagePlacer {
//    public static final MapCodec<PalmFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(instance ->
//            fillFoliagePlacerFields(instance).apply(instance, PalmFoliagePlacer::new)
//    );
//
//    public PalmFoliagePlacer(IntProvider radius, IntProvider offset) {
//        super(radius, offset);
//    }
//
//    @Override
//    protected FoliagePlacerType<?> getType() {
//        return ModFoliagePlacers.PALM_FOLIAGE_PLACER;
//    }
//
//    @Override
//    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
//
//    }
//
//    @Override
//    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
//        return 0;
//    }
//
//    @Override
//    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
//        return false;
//    }
//}
