package com.pr55.zavvyfeatures.enchantment.custom;

import com.mojang.serialization.MapCodec;
import com.pr55.zavvyfeatures.effect.ModEffects;
import net.minecraft.block.BlockState;
import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.EnchantmentLevelBasedValue;
import net.minecraft.enchantment.effect.AttributeEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.enchantment.effect.EnchantmentLocationBasedEffect;
import net.minecraft.enchantment.effect.entity.DamageItemEnchantmentEffect;
import net.minecraft.enchantment.effect.entity.PlaySoundEnchantmentEffect;
import net.minecraft.enchantment.effect.entity.SpawnParticlesEnchantmentEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.loot.condition.*;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.provider.number.EnchantmentLevelLootNumberProvider;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.BuiltinRegistries;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.floatprovider.ConstantFloatProvider;
import net.minecraft.util.math.floatprovider.UniformFloatProvider;

public class IceSkate implements EnchantmentLocationBasedEffect {

    public static final MapCodec<IceSkate> CODEC = MapCodec.unit(IceSkate::new);

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos, boolean newlyApplied) {
        if(world.isClient){
            return;
        }
        if(level > 0){
            BlockState check = world.getBlockState(user.getBlockPos().down());
//            register(registry, SOUL_SPEED, Enchantment.builder(Enchantment.definition(registryEntryLookup3.getOrThrow(ItemTags.FOOT_ARMOR_ENCHANTABLE), 1, 3, Enchantment.leveledCost(10, 10), Enchantment.leveledCost(25, 10), 8, new AttributeModifierSlot[]{AttributeModifierSlot.FEET})).addEffect(EnchantmentEffectComponentTypes.LOCATION_CHANGED, new AttributeEnchantmentEffect(Identifier.ofVanilla("enchantment.soul_speed"), EntityAttributes.GENERIC_MOVEMENT_SPEED, EnchantmentLevelBasedValue.linear(0.0405F, 0.0105F), EntityAttributeModifier.Operation.ADD_VALUE), AllOfLootCondition.builder(new LootCondition.Builder[]{InvertedLootCondition.builder(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, net.minecraft.predicate.entity.EntityPredicate.Builder.create().vehicle(net.minecraft.predicate.entity.EntityPredicate.Builder.create()))), AnyOfLootCondition.builder(new LootCondition.Builder[]{AllOfLootCondition.builder(new LootCondition.Builder[]{EnchantmentActiveCheckLootCondition.requireActive(), EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, net.minecraft.predicate.entity.EntityPredicate.Builder.create().flags(net.minecraft.predicate.entity.EntityFlagsPredicate.Builder.create().flying(false))), AnyOfLootCondition.builder(new LootCondition.Builder[]{EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, net.minecraft.predicate.entity.EntityPredicate.Builder.create().movementAffectedBy(net.minecraft.predicate.entity.LocationPredicate.Builder.create().block(net.minecraft.predicate.BlockPredicate.Builder.create().tag(BlockTags.SOUL_SPEED_BLOCKS)))), EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, net.minecraft.predicate.entity.EntityPredicate.Builder.create().flags(net.minecraft.predicate.entity.EntityFlagsPredicate.Builder.create().onGround(false)).build())})}), AllOfLootCondition.builder(new LootCondition.Builder[]{EnchantmentActiveCheckLootCondition.requireInactive(), EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, net.minecraft.predicate.entity.EntityPredicate.Builder.create().movementAffectedBy(net.minecraft.predicate.entity.LocationPredicate.Builder.create().block(net.minecraft.predicate.BlockPredicate.Builder.create().tag(BlockTags.SOUL_SPEED_BLOCKS))).flags(net.minecraft.predicate.entity.EntityFlagsPredicate.Builder.create().flying(false)))})})})).addEffect(EnchantmentEffectComponentTypes.LOCATION_CHANGED, new AttributeEnchantmentEffect(Identifier.ofVanilla("enchantment.soul_speed"), EntityAttributes.GENERIC_MOVEMENT_EFFICIENCY, EnchantmentLevelBasedValue.constant(1.0F), EntityAttributeModifier.Operation.ADD_VALUE), EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, net.minecraft.predicate.entity.EntityPredicate.Builder.create().movementAffectedBy(net.minecraft.predicate.entity.LocationPredicate.Builder.create().block(net.minecraft.predicate.BlockPredicate.Builder.create().tag(BlockTags.SOUL_SPEED_BLOCKS))))).addEffect(EnchantmentEffectComponentTypes.LOCATION_CHANGED, new DamageItemEnchantmentEffect(EnchantmentLevelBasedValue.constant(1.0F)), AllOfLootCondition.builder(new LootCondition.Builder[]{RandomChanceLootCondition.builder(EnchantmentLevelLootNumberProvider.create(EnchantmentLevelBasedValue.constant(0.04F))), EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, net.minecraft.predicate.entity.EntityPredicate.Builder.create().flags(net.minecraft.predicate.entity.EntityFlagsPredicate.Builder.create().onGround(true)).movementAffectedBy(net.minecraft.predicate.entity.LocationPredicate.Builder.create().block(net.minecraft.predicate.BlockPredicate.Builder.create().tag(BlockTags.SOUL_SPEED_BLOCKS))))})).addEffect(EnchantmentEffectComponentTypes.TICK, new SpawnParticlesEnchantmentEffect(ParticleTypes.SOUL, SpawnParticlesEnchantmentEffect.withinBoundingBox(), SpawnParticlesEnchantmentEffect.entityPosition(0.1F), SpawnParticlesEnchantmentEffect.scaledVelocity(-0.2F), SpawnParticlesEnchantmentEffect.fixedVelocity(ConstantFloatProvider.create(0.1F)), ConstantFloatProvider.create(1.0F)), EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, builder)).addEffect(EnchantmentEffectComponentTypes.TICK, new PlaySoundEnchantmentEffect(SoundEvents.PARTICLE_SOUL_ESCAPE, ConstantFloatProvider.create(0.6F), UniformFloatProvider.create(0.6F, 1.0F)), AllOfLootCondition.builder(new LootCondition.Builder[]{RandomChanceLootCondition.builder(0.35F), EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, builder)})));
            if(check.isIn(BlockTags.ICE)){
                if(user instanceof PlayerEntity player){
                    if(!player.hasStatusEffect(StatusEffects.SPEED)){
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED,1, (level - 1),false,false));
                    }
                }
            }else{
                if(user instanceof PlayerEntity player){
                    if(player.hasStatusEffect(StatusEffects.SPEED)){
                        player.removeStatusEffect(StatusEffects.SPEED);
                    }
                }
            }
        }

    }

    @Override
    public MapCodec<? extends EnchantmentLocationBasedEffect> getCodec() {
        return CODEC;
    }
}
