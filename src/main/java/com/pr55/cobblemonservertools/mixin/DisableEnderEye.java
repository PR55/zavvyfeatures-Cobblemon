package com.pr55.cobblemonservertools.mixin;
// (state, world, pos) -> state.isOf(Blocks.OBSIDIAN);


import net.minecraft.item.EnderEyeItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
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

