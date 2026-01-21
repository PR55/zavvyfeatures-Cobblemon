package com.pr55.zavvyfeatures.component;

import com.mojang.serialization.Codec;
import com.pr55.zavvyfeatures.Zavvyfeatures;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.UnaryOperator;

public class ModDataComponentTypes {
    public static final ComponentType<Integer> TIMER = register(
            "timer",
            builder -> ComponentType.<Integer>builder().codec(Codec.INT));
    public static final ComponentType<Integer> SECONDS = register(
            "seconds",
            builder -> ComponentType.<Integer>builder().codec(Codec.INT));
    public static final ComponentType<Boolean> ACTIVE = register(
            "active",
            builder -> ComponentType.<Boolean>builder().codec(Codec.BOOL));

    public static final ComponentType<Boolean> HATCHABLE = register(
            "hatchable",
            builder -> ComponentType.<Boolean>builder().codec(Codec.BOOL));

    public static final ComponentType<Boolean> SHINY = register(
            "zavvy_shiny",
            builder -> ComponentType.<Boolean>builder().codec(Codec.BOOL));

    public static final ComponentType<Boolean> ALOLAN = register(
            "zavvy_alola",
            builder -> ComponentType.<Boolean>builder().codec(Codec.BOOL));

    public static final ComponentType<Boolean> HISUIAN = register(
            "zavvy_hisui",
            builder -> ComponentType.<Boolean>builder().codec(Codec.BOOL));


    private  static <T>ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> builderOperator){
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(Zavvyfeatures.MOD_ID, name),
                builderOperator.apply(ComponentType.builder()).build());
    }

    public static void registerDataComponentTypes(){
        Zavvyfeatures.LOGGER.info("Registering Data Component Types for " + Zavvyfeatures.MOD_ID + "!");
    }
}
