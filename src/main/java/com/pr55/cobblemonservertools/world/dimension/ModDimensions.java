package com.pr55.cobblemonservertools.world.dimension;

import com.pr55.cobblemonservertools.Zavvyfeatures;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

import java.util.OptionalLong;

public class ModDimensions {
    public static final RegistryKey<DimensionOptions> test_key = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(Zavvyfeatures.MOD_ID, "test_dimension"));

    public static final RegistryKey<World> test_level_key = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(Zavvyfeatures.MOD_ID, "test_dimension"));

    public static final RegistryKey<DimensionType> test_dim_type = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(Zavvyfeatures.MOD_ID, "test_dimension"));


    // Dimension Writer: https://misode.github.io/dimension/

    public static void bootstrap(Registerable<DimensionType> context){
        context.register(test_dim_type, new DimensionType(
                OptionalLong.of(12000), // Fixed Time
                false,
                false,
                false,
                true,
                1.0,
                true,
                false,
                0,
                256,
                256,
                BlockTags.INFINIBURN_OVERWORLD,
                DimensionTypes.OVERWORLD_ID,
                1.0f,
                new DimensionType.MonsterSettings(false,false, UniformIntProvider.create(0,0),0)));
    }

}
