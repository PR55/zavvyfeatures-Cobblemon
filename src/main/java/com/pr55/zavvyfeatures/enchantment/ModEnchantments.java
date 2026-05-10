package com.pr55.zavvyfeatures.enchantment;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.enchantment.custom.IceSkate;
import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentLevelBasedValue;
import net.minecraft.enchantment.effect.AttributeEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.loot.condition.AnyOfLootCondition;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.EnchantmentTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    public static final RegistryKey<Enchantment> ICE_SKATE =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(Zavvyfeatures.MOD_ID, "ice_skater"));

    public static void bootstrap(Registerable<Enchantment> registerable){
        var enchantments = registerable.getRegistryLookup(RegistryKeys.ENCHANTMENT);
        var items = registerable.getRegistryLookup(RegistryKeys.ITEM);

        register(registerable, ICE_SKATE, Enchantment.builder(Enchantment.definition(
                items.getOrThrow(ItemTags.FOOT_ARMOR_ENCHANTABLE),
                items.getOrThrow(ItemTags.FOOT_ARMOR_ENCHANTABLE),
                5,
                200,
                Enchantment.leveledCost(5,7),
                Enchantment.leveledCost(25,9),
                2,
                AttributeModifierSlot.FEET))
                .exclusiveSet(enchantments.getOrThrow(EnchantmentTags.BOOTS_EXCLUSIVE_SET))
                .addEffect(EnchantmentEffectComponentTypes.LOCATION_CHANGED,
                        new AttributeEnchantmentEffect(Identifier.of("enchantment.zavvyfeatures.ice_skate"),
                                EntityAttributes.GENERIC_MOVEMENT_SPEED,
                                EnchantmentLevelBasedValue.linear(0.0105F, 0.0205F),
                                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL))
        );
    }

    private static void register(Registerable<Enchantment> registry, RegistryKey<Enchantment> key, Enchantment.Builder builder){
        registry.register(key, builder.build(key.getValue()));
    }


    public static void registerModEnchantments() {
        Zavvyfeatures.LOGGER.info("Registering Enchantments for" + Zavvyfeatures.MOD_ID);
    }

}
