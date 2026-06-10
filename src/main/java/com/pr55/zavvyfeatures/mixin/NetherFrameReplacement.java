package com.pr55.zavvyfeatures.mixin;
// (state, world, pos) -> state.isOf(Blocks.OBSIDIAN);


import com.pr55.zavvyfeatures.block.ModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.dimension.NetherPortal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;

@Mixin(NetherPortal.class)
public class NetherFrameReplacement {
    @Shadow
    public static AbstractBlock.ContextPredicate IS_VALID_FRAME_BLOCK = (state, world, pos) -> state.isOf(ModBlocks.POKE_PORTAL);

}

