package com.pr55.zavvyfeatures.mixin;

import com.pr55.zavvyfeatures.effect.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class CustomEffects {

    @Inject(method="updatePotionVisibility",at = @At("RETURN"))
    protected void injectPotionMethod(CallbackInfo ci){
        LivingEntity entity = (LivingEntity) (Object) this;

        if(entity.hasStatusEffect(ModEffects.ROCKENT_ESPIONAGE)){
            entity.setInvisible(true);
        }else{
            entity.setInvisible(entity.hasStatusEffect(StatusEffects.INVISIBILITY));
        }
    }

}
