package com.pr55.zavvyfeatures.item.custom;


import com.pr55.zavvyfeatures.block.custom.pokeSpawner;
import com.pr55.zavvyfeatures.sound.ModSounds;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class wrenchItem extends Item {
    public wrenchItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {


        World world = context.getWorld();
        if(!world.isClient){
            PlayerEntity player = context.getPlayer();
            BlockPos pos = context.getBlockPos();
            BlockState state = world.getBlockState(pos);
            if(state.getBlock() instanceof pokeSpawner spawner){
                if(!player.isSneaking()){
                    world.setBlockState(pos, state.cycle(pokeSpawner.POKESPAWNERDIRECTION));
                }else{
                    world.setBlockState(pos, state.cycle(pokeSpawner.POKESPAWNERDISTANCE));
                }

                spawner.sendUpdateMessage(world, pos, player);

                world.playSound(null, pos, ModSounds.EGG_READY, SoundCategory.BLOCKS, 1f,1f);
                return ActionResult.SUCCESS;
            }
        }



        return ActionResult.FAIL;
    }
}
