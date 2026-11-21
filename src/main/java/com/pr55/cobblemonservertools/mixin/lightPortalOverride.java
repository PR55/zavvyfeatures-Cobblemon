package com.pr55.cobblemonservertools.mixin;

import com.pr55.cobblemonservertools.block.ModBlocks;
import com.pr55.cobblemonservertools.config.custom.GeneralConfig;
import com.pr55.cobblemonservertools.config.custom.MixinConfig;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.dimension.NetherPortal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(AbstractFireBlock.class)
public class lightPortalOverride {

    @Shadow
    private static boolean isOverworldOrNether(World world) {
        return world.getRegistryKey() == World.OVERWORLD || world.getRegistryKey() == World.NETHER;
    }

    @Redirect(method = "canPlaceAt", at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/block/AbstractFireBlock;shouldLightPortalAt(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction;)Z"
    ))
    private static boolean shouldLightPortalAtNew(World world, BlockPos pos, Direction direction) {
        if (GeneralConfig.toggleNetherPortal) {
            if (!isOverworldOrNether(world)) {
                return false;
            } else {
                BlockPos.Mutable mutable = pos.mutableCopy();
                boolean bl = false;

                for(Direction direction2 : Direction.values()) {
                    if (world.getBlockState(mutable.set(pos).move(direction2)).isOf(ModBlocks.POKE_PORTAL)) {
                        bl = true;
                        break;
                    }
                }

                if (!bl) {
                    return false;
                } else {
                    Direction.Axis axis = direction.getAxis().isHorizontal() ? direction.rotateYCounterclockwise().getAxis() : Direction.Type.HORIZONTAL.randomAxis(world.random);
                    return NetherPortal.getNewPortal(world, pos, axis).isPresent();
                }
            }

        }else{
            if (!isOverworldOrNether(world)) {
                return false;
            } else {
                BlockPos.Mutable mutable = pos.mutableCopy();
                boolean bl = false;

                for(Direction direction2 : Direction.values()) {
                    if (world.getBlockState(mutable.set(pos).move(direction2)).isOf(Blocks.OBSIDIAN)) {
                        bl = true;
                        break;
                    }
                }

                if (!bl) {
                    return false;
                } else {
                    Direction.Axis axis = direction.getAxis().isHorizontal() ? direction.rotateYCounterclockwise().getAxis() : Direction.Type.HORIZONTAL.randomAxis(world.random);
                    return NetherPortal.getNewPortal(world, pos, axis).isPresent();
                }
            }
        }
    }
}
