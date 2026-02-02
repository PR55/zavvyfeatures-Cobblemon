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
import net.minecraft.item.Item;
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
import net.minecraft.state.property.IntProperty;

import java.util.ArrayList;
import java.util.HashMap;

public class pokeSpawner extends Block {

    public static final MapCodec<pokeSpawner> CODEC = Block.createCodec(pokeSpawner::new);

    HashMap<String, String> tokenValues = new HashMap<>();

    public static final IntProperty POKESPAWNERDIRECTION = IntProperty.of("pokespawnerdirection",0,5);
    public static final IntProperty POKESPAWNERDISTANCE = IntProperty.of("pokespawnerdistance",1,5);

    public pokeSpawner(Settings settings){
        super(settings);
        setDefaultState(getDefaultState().with(Properties.FACING, Direction.NORTH));
        setDefaultState(getDefaultState().with(POKESPAWNERDIRECTION, 0));
        setDefaultState(getDefaultState().with(POKESPAWNERDISTANCE, 1));
        //Gen1
        tokenValues.put("zavvyfeatures:bulba_token","bulbasaur");
        tokenValues.put("zavvyfeatures:char_token","charmander");
        tokenValues.put("zavvyfeatures:squir_token","squirtle");
        tokenValues.put("zavvyfeatures:pika_token","pikachu");
        tokenValues.put("zavvyfeatures:eve_token","eevee");
        // Gen 2
        tokenValues.put("zavvyfeatures:chik_token","chikorita");
        tokenValues.put("zavvyfeatures:cynd_token","cyndaquil");
        tokenValues.put("zavvyfeatures:toto_token","totodile");
        tokenValues.put("zavvyfeatures:togi_token","togepi");
        tokenValues.put("zavvyfeatures:pichu_token","pichu");
        // Gen 3
        tokenValues.put("zavvyfeatures:tree_token","treecko");
        tokenValues.put("zavvyfeatures:tor_token","torchic");
        tokenValues.put("zavvyfeatures:kip_token","mudkip");
        // Gen 4
        tokenValues.put("zavvyfeatures:tur_token","turtwig");
        tokenValues.put("zavvyfeatures:chim_token","chimchar");
        tokenValues.put("zavvyfeatures:pip_token","piplup");
        // Gen 5
        tokenValues.put("zavvyfeatures:sniv_token","snivy");
        tokenValues.put("zavvyfeatures:tep_token","tepig");
        tokenValues.put("zavvyfeatures:osha_token","oshawott");
        // Gen 6
        tokenValues.put("zavvyfeatures:chesp_token","chespin");
        tokenValues.put("zavvyfeatures:fenne_token","fennekin");
        tokenValues.put("zavvyfeatures:froak_token","froakie");
        // Gen 7
        tokenValues.put("zavvyfeatures:row_token","rowlet");
        tokenValues.put("zavvyfeatures:lit_token","litten");
        tokenValues.put("zavvyfeatures:pop_token","popplio");
        // Gen 8
        tokenValues.put("zavvyfeatures:groo_token","grookey");
        tokenValues.put("zavvyfeatures:scor_token","scorbunny");
        tokenValues.put("zavvyfeatures:sob_token","sobble");
        // Gen 9
        tokenValues.put("zavvyfeatures:sprig_token","sprigatito");
        tokenValues.put("zavvyfeatures:coco_token","fuecoco");
        tokenValues.put("zavvyfeatures:quax_token","quaxly");

    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {

        if(!world.isClient){
            Hand hand = player.getActiveHand();
            ItemStack stack = player.getStackInHand(hand);
            if(stack.getItem() instanceof AirBlockItem){
                stack = player.getOffHandStack();
                if(stack.getItem() instanceof AirBlockItem){
                    world.playSound(null, pos, ModSounds.EGG_READY, SoundCategory.BLOCKS, 1f,1f);
                    String direxc = "";
                    if(state.get(POKESPAWNERDIRECTION) == 0){
                        direxc = "Above";
                    } else if(state.get(POKESPAWNERDIRECTION) == 1){
                        direxc = "Below";
                    } else if(state.get(POKESPAWNERDIRECTION) == 2){
                        direxc = "East of";
                    } else if(state.get(POKESPAWNERDIRECTION) == 3){
                        direxc = "West of";
                    } else if(state.get(POKESPAWNERDIRECTION) == 4){
                        direxc = "South of";
                    } else if(state.get(POKESPAWNERDIRECTION) == 5){
                        direxc = "North of";
                    }

                    player.sendMessage(Text.literal("Currently Spawning %s the block, at %s blocks away.".formatted(direxc, state.get(POKESPAWNERDISTANCE))), true);

                    return ActionResult.FAIL;
                }
            }
            if(stack.getItem() instanceof PokeToken token){
                BlockPos pos2 = pos.add(0,0,0);

                int distance = state.get(POKESPAWNERDISTANCE);

                if(state.get(POKESPAWNERDIRECTION) == 0){
                    pos2 = pos.add(0,distance,0); // Above
                } else if(state.get(POKESPAWNERDIRECTION) == 1){
                    pos2 = pos.add(0,-distance,0); // Below
                } else if(state.get(POKESPAWNERDIRECTION) == 2){
                    pos2 = pos.add(distance,0,0); // East
                } else if(state.get(POKESPAWNERDIRECTION) == 3){
                    pos2 = pos.add(-distance,0,0); // West
                } else if(state.get(POKESPAWNERDIRECTION) == 4){
                    pos2 = pos.add(0,0,distance); // South
                } else if(state.get(POKESPAWNERDIRECTION) == 5){
                    pos2 = pos.add(0,0,-distance); // North
                }
                Identifier itemId = Registries.ITEM.getId(token);
                String cmString = "pokespawnat " + pos2.getX() + " " + pos2.getY() + " " + pos2.getZ() + " " + tokenValues.get(itemId.toString()) + " status=paralysis";
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
                    if(!player.isCreative()){
                        stack.decrement(1);
                    }
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
        builder.add(POKESPAWNERDIRECTION);
        builder.add(POKESPAWNERDISTANCE);
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    public void sendUpdateMessage(World world, BlockPos pos, PlayerEntity player){
        String direxc = "";

        BlockState newS = world.getBlockState(pos);
        if(newS.get(POKESPAWNERDIRECTION) == 0){
            direxc = "Above";
        } else if(newS.get(POKESPAWNERDIRECTION) == 1){
            direxc = "Below";
        } else if(newS.get(POKESPAWNERDIRECTION) == 2){
            direxc = "East of";
        } else if(newS.get(POKESPAWNERDIRECTION) == 3){
            direxc = "West of";
        } else if(newS.get(POKESPAWNERDIRECTION) == 4){
            direxc = "South of";
        } else if(newS.get(POKESPAWNERDIRECTION) == 5){
            direxc = "North of";
        }

        player.sendMessage(Text.literal("Now Spawning %s the block, at %s blocks away!".formatted(direxc, newS.get(POKESPAWNERDISTANCE))), true);
    }
}
