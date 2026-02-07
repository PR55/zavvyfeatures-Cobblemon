package com.pr55.zavvyfeatures.item.custom;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.item.ModItems;
import com.pr55.zavvyfeatures.sound.ModSounds;
import com.terraformersmc.modmenu.util.mod.Mod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import com.pr55.zavvyfeatures.component.ModDataComponentTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EggItemPoke extends Item {

    private final static int DEFAULT_TIMER = 100;
    private final static int DEFAULT_SECOND = 0;
    int SHINY_CHANCE = 8192;
    String ACTIVATE_GUIDE = "tooltip.zavvyfeatures.common";
    ArrayList<Item> tokens = new ArrayList<>();
    Random random = new Random();
    List<Item> alolanForms = Arrays.asList(
            ModItems.PIKA_TOKEN,
            ModItems.PICHU_TOKEN
    );
    List<Item> hisuiForms = Arrays.asList(
            ModItems.OSHA_TOKEN,
            ModItems.CYND_TOKEN,
            ModItems.ROW_TOKEN
    );

    @Override
    public boolean allowComponentsUpdateAnimation(PlayerEntity player, Hand hand, ItemStack oldStack, ItemStack newStack) {
        return false;
    }

    public EggItemPoke(Settings settings) {
        super(settings);
        this.tokens = new ArrayList<>();
        tokens.add(ModItems.BULBA_TOKEN);
        tokens.add(ModItems.CHAR_TOKEN);
        tokens.add(ModItems.SQUIR_TOKEN);
        tokens.add(ModItems.PIKA_TOKEN);
        tokens.add(ModItems.EVE_TOKEN);

        tokens.add(ModItems.CHIK_TOKEN);
        tokens.add(ModItems.CYND_TOKEN);
        tokens.add(ModItems.TOTO_TOKEN);

        tokens.add(ModItems.TREE_TOKEN);
        tokens.add(ModItems.TOR_TOKEN);
        tokens.add(ModItems.KIP_TOKEN);

        tokens.add(ModItems.TUR_TOKEN);
        tokens.add(ModItems.CHIM_TOKEN);
        tokens.add(ModItems.PIP_TOKEN);

        tokens.add(ModItems.SNIV_TOKEN);
        tokens.add(ModItems.TEP_TOKEN);
        tokens.add(ModItems.OSHA_TOKEN);

        tokens.add(ModItems.CHESP_TOKEN);
        tokens.add(ModItems.FENNE_TOKEN);
        tokens.add(ModItems.FROAK_TOKEN);

        tokens.add(ModItems.ROW_TOKEN);
        tokens.add(ModItems.LIT_TOKEN);
        tokens.add(ModItems.POP_TOKEN);

        tokens.add(ModItems.GROO_TOKEN);
        tokens.add(ModItems.SCOR_TOKEN);
        tokens.add(ModItems.SOB_TOKEN);

        tokens.add(ModItems.SPRIG_TOKEN);
        tokens.add(ModItems.COCO_TOKEN);
        tokens.add(ModItems.QUAX_TOKEN);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(stack.get(ModDataComponentTypes.HATCHABLE) == null){

            tooltip.add(Text.translatable(ACTIVATE_GUIDE));

        }

        if(stack.get(ModDataComponentTypes.TIMER) != null){

            if(stack.get(ModDataComponentTypes.TIMER) <= 0){
                tooltip.add(Text.translatable("tooltip.zavvyfeatures.egg_item_done.tooltip"));
            }else{
                tooltip.add(Text.translatable("tooltip.zavvyfeatures.egg_item.tooltip"));

                String time = TicksToTime(stack.get(ModDataComponentTypes.TIMER));

                Text text = Text.literal(time);
                tooltip.add(text);
            }


        }

        super.appendTooltip(stack, context, tooltip, type);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if(world.isClient()){return;}
        if(stack.get(ModDataComponentTypes.TIMER) == null || stack.get(ModDataComponentTypes.TIMER) <= 0){return;}

        if(entity instanceof PlayerEntity player){

            ItemStack eval = player.getOffHandStack();


            stack.set(ModDataComponentTypes.ACTIVE, eval == stack);
            determinTick(stack,world,entity,slot,selected);
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        // Ensure logic runs only on the server to prevent desync
        if (world.isClient() || !(user.getStackInHand(hand).getItem() instanceof EggItemPoke)) {
            return TypedActionResult.pass(user.getStackInHand(hand));
        }

        ItemStack stack = user.getStackInHand(hand);

        if(stack.get(ModDataComponentTypes.TIMER) == null){
            if(stack.get(ModDataComponentTypes.TIMER) == null){
                stack.set(ModDataComponentTypes.TIMER, DEFAULT_TIMER);
            }

            if(stack.get(ModDataComponentTypes.SECONDS) == null){
                stack.set(ModDataComponentTypes.SECONDS, DEFAULT_SECOND);
            }

            if(stack.get(ModDataComponentTypes.ACTIVE) == null){
                stack.set(ModDataComponentTypes.ACTIVE, false);
            }

            if(stack.get(ModDataComponentTypes.HATCHABLE) == null){
                stack.set(ModDataComponentTypes.HATCHABLE, true);
            }
            user.playSoundToPlayer(ModSounds.EGG_USE,SoundCategory.MASTER,1,1);
        } else if (stack.get(ModDataComponentTypes.TIMER) <= 0) {
            // Figure out random number generation, make list of item stacks
            // Give a random token item
            // Advanced blocks tutorial
            //
            handleRandomUse(stack,user);
            user.playSoundToPlayer(ModSounds.EGG_USE,SoundCategory.MASTER,1,1);
            return  TypedActionResult.consume(user.getStackInHand(hand));
        } else {
            user.playSoundToPlayer(ModSounds.EGG_DENY,SoundCategory.MASTER,1,1);
            return  TypedActionResult.fail(user.getStackInHand(hand));
        }



        return TypedActionResult.success(user.getStackInHand(hand));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return stack.get(ModDataComponentTypes.TIMER) != null && stack.get(ModDataComponentTypes.TIMER) <= 0;
    }

    private void determinTick(ItemStack stack, World world, Entity entity, int slot, boolean selected){
        if(stack.get(ModDataComponentTypes.TIMER) == null){return;}
        if(stack.get(ModDataComponentTypes.TIMER) <= 0 && stack.get(ModDataComponentTypes.TIMER) != null){return;}
        if(stack.get(ModDataComponentTypes.ACTIVE) && stack.get(ModDataComponentTypes.ACTIVE) != null && !world.isClient()){
            if(stack.get(ModDataComponentTypes.SECONDS) == null) return;
            int second = stack.get(ModDataComponentTypes.SECONDS);
            stack.set(ModDataComponentTypes.SECONDS,  second+1);
            if(stack.get(ModDataComponentTypes.SECONDS) < 20) return;
            stack.set(ModDataComponentTypes.SECONDS,  0);
            int timer = stack.get(ModDataComponentTypes.TIMER);
            stack.set(ModDataComponentTypes.TIMER, timer - 20);

            if(stack.get(ModDataComponentTypes.TIMER) <= 0 && entity instanceof PlayerEntity player){
                player.playSoundToPlayer(ModSounds.EGG_READY,SoundCategory.MASTER,1,1);
//                stack.decrement(1);
//                player.giveItemStack(new ItemStack(Items.DIAMOND, 1));
            }

            // Add item Tags
            // Grab all Items
            // Randomly Choose Items
            // Check discord for shiny chances

            // comamnd to give advancement

        }
    }

    private String TicksToTime(int ticks){

        String reduce = "" + (int) Math.floor(ticks/1200.0);
        String seconds = "" + (int) Math.round((ticks % 1200.0)/20);

        ArrayList<String> secondTimes = new ArrayList<String>();

        secondTimes.add("0");
        secondTimes.add("1");
        secondTimes.add("2");
        secondTimes.add("3");
        secondTimes.add("4");
        secondTimes.add("5");
        secondTimes.add("6");
        secondTimes.add("7");
        secondTimes.add("8");
        secondTimes.add("9");

        if(secondTimes.contains(seconds)){
            seconds = "0" + seconds;
        }

        if(secondTimes.contains(reduce)){
            reduce = "0" + reduce;
        }

        if(!reduce.equals("0")){
            return reduce + ":" + seconds;
        }else{
            return "00" + ":" + seconds;
        }

    }

    public void handleRandomUse(ItemStack stack, PlayerEntity user){
        stack.decrement(1);
        Item chosen = randomPoke();
        ItemStack token = new ItemStack(chosen,1);
        if(isShiny()){
            token.set(ModDataComponentTypes.SHINY, true);
        }else {
            token.set(ModDataComponentTypes.SHINY, false);
        }
        // Alolan Bias Check
        if(alolanForms.contains(chosen)){
            if(isAlternateForm()){
                token.set(ModDataComponentTypes.ALOLAN,true);
            }else{
                token.set(ModDataComponentTypes.ALOLAN,false);
            }
        }

        // Hisuian Bias Check
        if(hisuiForms.contains(chosen) && (token.get(ModDataComponentTypes.ALOLAN) == null || !token.get(ModDataComponentTypes.ALOLAN))){
            if(isAlternateForm()){
                token.set(ModDataComponentTypes.HISUIAN,true);
            }else{
                token.set(ModDataComponentTypes.HISUIAN,false);
            }
        }

        user.giveItemStack(token);
    }

    public boolean isShiny(){
        double r = random.nextDouble(SHINY_CHANCE);

        if(r < (double) 1/SHINY_CHANCE) return true;
        else return false;
    }

    public Item randomPoke(){
        int randomInd = random.nextInt(tokens.size());

        Zavvyfeatures.LOGGER.info("Random Pokemon Index: "+randomInd);

        //Item is null?

        return tokens.get(randomInd);
    }

    public boolean isAlternateForm(){
        return random.nextInt(10) < 3;
    }


}
