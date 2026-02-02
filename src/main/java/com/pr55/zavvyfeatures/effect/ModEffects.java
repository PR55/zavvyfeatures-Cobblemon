package com.pr55.zavvyfeatures.effect;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> ROCKENT_ESPIONAGE = registerStatusEffect("rocket_espionage",
            new RocketEspionage(StatusEffectCategory.BENEFICIAL, 0x36ebab));

    public static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect){
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Zavvyfeatures.MOD_ID, name),statusEffect);
    }

    public static void registerEffects(){
        Zavvyfeatures.LOGGER.info("Registering moid effects for " + Zavvyfeatures.MOD_ID);
    }

}
