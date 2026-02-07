package com.pr55.zavvyfeatures.block.custom;

import com.mojang.serialization.MapCodec;
import com.pr55.zavvyfeatures.block.entity.ModBlockEntities;
import com.pr55.zavvyfeatures.block.entity.custom.incubatorBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class incubatorBlock extends BlockWithEntity implements BlockEntityProvider {

    private static VoxelShape VOXEL_SHAPE = Block.createCuboidShape(3,0,3,13,12,13);
    public static final IntProperty ITEM_CONTAINED = IntProperty.of("itemcontained",0,1);


    public static final MapCodec<incubatorBlock> CODEC = incubatorBlock.createCodec(incubatorBlock::new);

    public incubatorBlock(Settings settings) {
        super(settings);
    }


    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {

        tooltip.add(Text.translatable("block.zavvyfeatures.incubator_zavvy.tooltip"));

        super.appendTooltip(stack, context, tooltip, options);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VOXEL_SHAPE;
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new incubatorBlockEntity(pos, state);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if(state.getBlock() != newState.getBlock()){
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if(blockEntity instanceof incubatorBlockEntity){
                ItemScatterer.spawn(world,pos,((incubatorBlockEntity) blockEntity));
                world.updateComparators(pos,this);
            }
            super.onStateReplaced(state,world,pos,newState,moved);
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {

        builder.add(ITEM_CONTAINED);
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        if(world.getBlockEntity(pos) instanceof incubatorBlockEntity incubatorBlockE){
            if(incubatorBlockE.isEmpty() && !stack.isEmpty()){
                incubatorBlockE.setStack(0,stack.copyWithCount(1));
                world.playSound(player,pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS,1f,1f);
                stack.decrement(1);


                incubatorBlockE.markDirty();
                world.updateListeners(pos,state,state,0);
                world.setBlockState(pos,state.cycle(ITEM_CONTAINED));
            }else if(stack.isEmpty() && !player.isSneaking() && !incubatorBlockE.isEmpty()){
                ItemStack stackInIncubator = incubatorBlockE.getStack(0);
                player.setStackInHand(Hand.MAIN_HAND, stackInIncubator);
                world.playSound(player,pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS,1f,1f);
                incubatorBlockE.clear();

                incubatorBlockE.markDirty();
                world.updateListeners(pos,state,state,0);
                world.setBlockState(pos,state.cycle(ITEM_CONTAINED));
            }
        }

        return ItemActionResult.SUCCESS;
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return validateTicker(type, ModBlockEntities.INCUBATOR_BE,
                (world1,pos,state1,blockEntity) -> blockEntity.tick(world1,pos,state1));
    }


}
