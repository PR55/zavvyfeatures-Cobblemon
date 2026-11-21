package com.pr55.cobblemonservertools.mixin;
// (state, world, pos) -> state.isOf(Blocks.OBSIDIAN);


import com.pr55.cobblemonservertools.block.ModBlocks;
import com.pr55.cobblemonservertools.config.custom.MixinConfig;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.Blocks;
import net.minecraft.world.dimension.NetherPortal;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(NetherPortal.class)
public class NetherFrameReplacement {


    @Shadow
    @Final
    @Mutable
    private static final AbstractBlock.ContextPredicate IS_VALID_FRAME_BLOCK = MixinConfig.toggleNetherPortal ? (state, world, pos) -> state.isOf(ModBlocks.POKE_PORTAL) : (state, world, pos) -> state.isOf(Blocks.OBSIDIAN);

}

