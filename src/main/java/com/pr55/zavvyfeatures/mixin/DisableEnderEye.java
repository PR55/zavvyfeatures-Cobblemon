package com.pr55.zavvyfeatures.mixin;
// (state, world, pos) -> state.isOf(Blocks.OBSIDIAN);


import com.pr55.zavvyfeatures.effect.ModEffects;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.EnderEyeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.dimension.NetherPortal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnderEyeItem.class)
public class DisableEnderEye {
//    @Inject(method="use",at = @At("HEAD"), cancellable = true)
//    protected void injectUseMethod(World world, PlayerEntity user, Hand hand, CallbackInfoReturnable<TypedActionResult<ItemStack>> cir){
//        ItemStack itemStack = user.getStackInHand(hand);
//
//        cir.setReturnValue(TypedActionResult.fail(itemStack));
//    }

    @Inject(method="useOnBlock",at = @At("HEAD"), cancellable = true)
    protected void injectUseOnBlockMethod(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir){

        cir.setReturnValue(ActionResult.FAIL);
    }
}

