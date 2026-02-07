package com.pr55.zavvyfeatures.block.custom;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.serialization.MapCodec;
import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.component.ModDataComponentTypes;
import com.pr55.zavvyfeatures.item.ModItems;
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
        tokenValues.put(Registries.ITEM.getId(ModItems.BULBA_TOKEN).toString(),"bulbasaur");
        tokenValues.put(Registries.ITEM.getId(ModItems.CHAR_TOKEN).toString(),"charmander");
        tokenValues.put(Registries.ITEM.getId(ModItems.SQUIR_TOKEN).toString(),"squirtle");
        tokenValues.put(Registries.ITEM.getId(ModItems.PIKA_TOKEN).toString(),"pikachu");
        tokenValues.put(Registries.ITEM.getId(ModItems.EVE_TOKEN).toString(),"eevee");
        tokenValues.put(Registries.ITEM.getId(ModItems.LAP_TOKEN).toString(),"lapras");
        tokenValues.put(Registries.ITEM.getId(ModItems.MAGNE_TOKEN).toString(),"magnemite");
        tokenValues.put(Registries.ITEM.getId(ModItems.DRAT_TOKEN).toString(),"dratini");
        tokenValues.put(Registries.ITEM.getId(ModItems.AERODA_TOKEN).toString(),"aerodactyl");
        // Gen 2
        tokenValues.put(Registries.ITEM.getId(ModItems.CHIK_TOKEN).toString(),"chikorita");
        tokenValues.put(Registries.ITEM.getId(ModItems.CYND_TOKEN).toString(),"cyndaquil");
        tokenValues.put(Registries.ITEM.getId(ModItems.TOTO_TOKEN).toString(),"totodile");
        tokenValues.put(Registries.ITEM.getId(ModItems.PICHU_TOKEN).toString(),"pichu");
        tokenValues.put(Registries.ITEM.getId(ModItems.TOGI_TOKEN).toString(),"togepi");
        tokenValues.put(Registries.ITEM.getId(ModItems.CLEFF_TOKEN).toString(),"cleffa");
        tokenValues.put(Registries.ITEM.getId(ModItems.ELE_TOKEN).toString(),"elekid");
        tokenValues.put(Registries.ITEM.getId(ModItems.IGG_TOKEN).toString(),"igglybuff");
        tokenValues.put(Registries.ITEM.getId(ModItems.MAG_TOKEN).toString(),"magby");
        tokenValues.put(Registries.ITEM.getId(ModItems.SMOO_TOKEN).toString(),"smoochum");
        tokenValues.put(Registries.ITEM.getId(ModItems.TYR_TOKEN).toString(),"tyrogue");
        tokenValues.put(Registries.ITEM.getId(ModItems.TEDDI_TOKEN).toString(),"teddiursa");
        tokenValues.put(Registries.ITEM.getId(ModItems.SWIN_TOKEN).toString(),"swinub");

        // Gen 3
        tokenValues.put(Registries.ITEM.getId(ModItems.TREE_TOKEN).toString(),"treecko");
        tokenValues.put(Registries.ITEM.getId(ModItems.KIP_TOKEN).toString(),"mudkip");
        tokenValues.put(Registries.ITEM.getId(ModItems.TOR_TOKEN).toString(),"torchic");
        tokenValues.put(Registries.ITEM.getId(ModItems.AZURILL_TOKEN).toString(),"azurill");
        tokenValues.put(Registries.ITEM.getId(ModItems.WY_TOKEN).toString(),"wynaut");
        tokenValues.put(Registries.ITEM.getId(ModItems.WAILM_TOKEN).toString(),"wailmer");
        tokenValues.put(Registries.ITEM.getId(ModItems.TRAP_TOKEN).toString(),"trapinch");
        tokenValues.put(Registries.ITEM.getId(ModItems.SWAB_TOKEN).toString(),"swablu");
        // Gen 4
        tokenValues.put(Registries.ITEM.getId(ModItems.TUR_TOKEN).toString(),"turtwig");
        tokenValues.put(Registries.ITEM.getId(ModItems.CHIM_TOKEN).toString(),"chimchar");
        tokenValues.put(Registries.ITEM.getId(ModItems.PIP_TOKEN).toString(),"piplup");
        tokenValues.put(Registries.ITEM.getId(ModItems.BONS_TOKEN).toString(),"bonsly");
        tokenValues.put(Registries.ITEM.getId(ModItems.BUD_TOKEN).toString(),"budew");
        tokenValues.put(Registries.ITEM.getId(ModItems.CHING_TOKEN).toString(),"chingling");
        tokenValues.put(Registries.ITEM.getId(ModItems.PINY_TOKEN).toString(),"happiny");
        tokenValues.put(Registries.ITEM.getId(ModItems.MANTY_TOKEN).toString(),"mantyke");
        tokenValues.put(Registries.ITEM.getId(ModItems.MIMJR_TOKEN).toString(),"mimejr");
        tokenValues.put(Registries.ITEM.getId(ModItems.MUNCH_TOKEN).toString(),"munchlax");
        tokenValues.put(Registries.ITEM.getId(ModItems.RIO_TOKEN).toString(),"riolu");
        // Gen 5
        tokenValues.put(Registries.ITEM.getId(ModItems.SNIV_TOKEN).toString(),"snivy");
        tokenValues.put(Registries.ITEM.getId(ModItems.TEP_TOKEN).toString(),"tepig");
        tokenValues.put(Registries.ITEM.getId(ModItems.OSHA_TOKEN).toString(),"oshawott");
        tokenValues.put(Registries.ITEM.getId(ModItems.BLITZ_TOKEN).toString(),"blitzle");
        // Gen 6
        tokenValues.put(Registries.ITEM.getId(ModItems.CHESP_TOKEN).toString(),"chespin");
        tokenValues.put(Registries.ITEM.getId(ModItems.FENNE_TOKEN).toString(),"fennekin");
        tokenValues.put(Registries.ITEM.getId(ModItems.FROAK_TOKEN).toString(),"froakie");
        tokenValues.put(Registries.ITEM.getId(ModItems.SKID_TOKEN).toString(),"skiddo");
        tokenValues.put(Registries.ITEM.getId(ModItems.NOI_TOKEN).toString(),"noibat");
        tokenValues.put(Registries.ITEM.getId(ModItems.TYRUNT_TOKEN).toString(),"tyrunt");
        // Gen 7
        tokenValues.put(Registries.ITEM.getId(ModItems.ROW_TOKEN).toString(),"rowlet");
        tokenValues.put(Registries.ITEM.getId(ModItems.LIT_TOKEN).toString(),"litten");
        tokenValues.put(Registries.ITEM.getId(ModItems.POP_TOKEN).toString(),"popplio");
        // Gen 8
        tokenValues.put(Registries.ITEM.getId(ModItems.GROO_TOKEN).toString(),"grookey");
        tokenValues.put(Registries.ITEM.getId(ModItems.SCOR_TOKEN).toString(),"scorbunny");
        tokenValues.put(Registries.ITEM.getId(ModItems.SOB_TOKEN).toString(),"sobble");
        tokenValues.put(Registries.ITEM.getId(ModItems.TOX_TOKEN).toString(),"toxel");
        tokenValues.put(Registries.ITEM.getId(ModItems.SNEASE_TOKEN).toString(),"sneasel");
        // Gen 9
        tokenValues.put(Registries.ITEM.getId(ModItems.SPRIG_TOKEN).toString(),"sprigatito");
        tokenValues.put(Registries.ITEM.getId(ModItems.COCO_TOKEN).toString(),"fuecoco");
        tokenValues.put(Registries.ITEM.getId(ModItems.QUAX_TOKEN).toString(),"quaxly");

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
