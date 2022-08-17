package com.hamza.infinitychem.world.gen;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event){
        for(OreType ore : OreType.values()){
            OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, //ensures ores are only spawned as default next to stone like most vanilla ores
                    ore.getBlock().get().getDefaultState(), ore.getMaxVeinSize());
            ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configure(
                    new TopSolidRangeConfig(ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight()));

            ConfiguredFeature<?, ?>oreFeature = registerOreFeature(ore, oreFeatureConfig, configuredPlacement);

            //add filter to check only biomes here

            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreFeature);
        }
    }
    private static ConfiguredFeature<? , ?> registerOreFeature(OreType ore, OreFeatureConfig oreFeatureConfig,
                                                               ConfiguredPlacement configuredPlacement){
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, ore.getBlock().get().getRegistryName(), Feature.ORE.withConfiguration(oreFeatureConfig).withPlacement(configuredPlacement).square().count(3));
    }
}
