package com.pr55.cobblemonservertools.item.custom;

import com.pr55.cobblemonservertools.component.ModDataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class PokeToken extends Item {
    public PokeToken(Settings settings) {
        super(settings);
    }

    // Find out what went wrong with Item Setup

    @Override
    public boolean hasGlint(ItemStack stack) {
        return stack.get(ModDataComponentTypes.SHINY) != null && stack.get(ModDataComponentTypes.SHINY);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {

        if(stack.get(ModDataComponentTypes.ALOLAN) != null && stack.get(ModDataComponentTypes.ALOLAN)) {
            tooltip.add(Text.translatable("item.cobblemonservertools.alola_token"));
        }

        if(stack.get(ModDataComponentTypes.HISUIAN) != null && stack.get(ModDataComponentTypes.HISUIAN)){
            tooltip.add(Text.translatable("item.cobblemonservertools.hisui_token"));
        }

        if(stack.get(ModDataComponentTypes.SHINY) != null && stack.get(ModDataComponentTypes.SHINY)){
            tooltip.add(Text.translatable("item.cobblemonservertools.shiny_token"));
        }

        if(stack.get(ModDataComponentTypes.ALPHA) != null && stack.get(ModDataComponentTypes.ALPHA)){
            tooltip.add(Text.translatable("item.cobblemonservertools.alpha_token"));
        }

        super.appendTooltip(stack, context, tooltip, type);
    }
}
