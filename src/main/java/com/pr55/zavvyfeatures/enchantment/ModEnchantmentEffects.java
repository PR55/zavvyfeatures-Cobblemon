package com.pr55.zavvyfeatures.enchantment;

import com.mojang.serialization.MapCodec;
import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.enchantment.custom.IceSkate;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.enchantment.effect.EnchantmentLocationBasedEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantmentEffects {

    public static final MapCodec<? extends EnchantmentLocationBasedEffect> ICE_SKATE = registerLocationEffect("ice_skate",
            IceSkate.CODEC);

    private static MapCodec<? extends EnchantmentLocationBasedEffect> registerLocationEffect(String name,
                                                                                    MapCodec<? extends EnchantmentLocationBasedEffect> codec){
        return Registry.register(Registries.ENCHANTMENT_LOCATION_BASED_EFFECT_TYPE, Identifier.of(Zavvyfeatures.MOD_ID, name), codec);
    }

    private static MapCodec<? extends EnchantmentEntityEffect> registerEntityEffect(String name,
                                                                                    MapCodec<? extends EnchantmentEntityEffect> codec){
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(Zavvyfeatures.MOD_ID, name), codec);
    }

    public static void registerEnchantmentEffects(){
        Zavvyfeatures.LOGGER.info("Registering mod enchantment effects for " + Zavvyfeatures.MOD_ID);
    }
}
