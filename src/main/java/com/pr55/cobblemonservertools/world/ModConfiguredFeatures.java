package com.pr55.cobblemonservertools.world;

import com.pr55.cobblemonservertools.Zavvyfeatures;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {

//    public static final RegistryKey<ConfiguredFeature<?,?>> ANCIENT_DEBRIS_TEST = registerKey("ancient_debris_test_ore");

    // CF -> PF - WG

    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> context){
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);


//        List<OreFeatureConfig.Target> overworldDebrisOres =
//                List.of(OreFeatureConfig.createTarget(stoneReplaceables, Blocks.ANCIENT_DEBRIS.getDefaultState()));
//
//        register(context, ANCIENT_DEBRIS_TEST, Feature.ORE, new OreFeatureConfig(overworldDebrisOres, 16));

    }

    public static RegistryKey<ConfiguredFeature<?,?>> registerKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Zavvyfeatures.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?,?>> context,
            RegistryKey<ConfiguredFeature<?,?>> key,
            F feature, FC configuration
    ){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}

