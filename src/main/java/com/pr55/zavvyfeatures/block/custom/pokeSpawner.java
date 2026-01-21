package com.pr55.zavvyfeatures.block.custom;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.serialization.MapCodec;
import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.component.ModDataComponentTypes;
import com.pr55.zavvyfeatures.item.custom.PokeToken;
import com.pr55.zavvyfeatures.sound.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AirBlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public class pokeSpawner extends Block {

    public static final MapCodec<pokeSpawner> CODEC = Block.createCodec(pokeSpawner::new);

    HashMap<String, String> tokenValues = new HashMap<>();

    public pokeSpawner(Settings settings){
        super(settings);
        setDefaultState(getDefaultState().with(Properties.FACING, Direction.NORTH));
        tokenValues.put("zavvyfeatures:pika_token","pikachu");
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {

        if(!world.isClient){
            Hand hand = player.getActiveHand();
            ItemStack stack = player.getStackInHand(hand);
            if(stack.getItem() instanceof AirBlockItem){
                stack = player.getOffHandStack();
                if(stack.getItem() instanceof AirBlockItem){
                    return ActionResult.FAIL;
                }
            }
            if(stack.getItem() instanceof PokeToken token){
                BlockPos pos2 = pos.add(0,2,0);
                Identifier itemId = Registries.ITEM.getId(token);
                player.sendMessage(Text.literal(itemId.toString()), false);
                String cmString = "pokespawnat " + pos2.getX() + " " + pos2.getY() + " " + pos2.getZ() + " " + tokenValues.get(itemId.toString());
                if(stack.get(ModDataComponentTypes.SHINY) != null){
                    if(stack.get(ModDataComponentTypes.SHINY)){
                        cmString += " shiny";
                    }
                }

                if(stack.get(ModDataComponentTypes.ALOLAN) != null){
                    if(stack.get(ModDataComponentTypes.ALOLAN)){
                        cmString += " alolan";
                    }
                }

                if(stack.get(ModDataComponentTypes.HISUIAN) != null){
                    if(stack.get(ModDataComponentTypes.HISUIAN)){
                        cmString += " hisuian";
                    }
                }

                try {
                    CommandDispatcher<ServerCommandSource> dispatcher = world.getServer().getCommandManager().getDispatcher();
                    ServerCommandSource source = world.getServer().getCommandSource();
                    if(source != null) {
                        Zavvyfeatures.LOGGER.info("Source is not null!");
                    }else{
                        Zavvyfeatures.LOGGER.info("Source is null!");
                    }
                    dispatcher.execute(cmString, source);

                    world.playSound(null, pos, ModSounds.EGG_USE, SoundCategory.BLOCKS, 1f,1f);
                } catch (Exception e) {

                    player.sendMessage(Text.translatable("zavvyfeatures.error.contact"),false);
                    player.sendMessage(Text.literal(cmString),false);

                    Zavvyfeatures.LOGGER.info("Forced Pokemon Spawn Command failed! %s\n%s\n%s\n".formatted(e.getMessage(), e.getCause(), e.getLocalizedMessage()));

                    e.printStackTrace();
                }


                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.FAIL;

    }

    @Override
    protected MapCodec<? extends pokeSpawner> getCodec() {
        return CODEC;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.FACING);
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }
}
