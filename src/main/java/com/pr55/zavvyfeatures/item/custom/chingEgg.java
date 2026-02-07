package com.pr55.zavvyfeatures.item.custom;

import com.pr55.zavvyfeatures.item.ModItems;

import java.util.ArrayList;

public class chingEgg extends EggItemPoke {


    public chingEgg(Settings settings) {
        super(settings);
        this.SHINY_CHANCE = 2048;
        this.ACTIVATE_GUIDE = "tooltip.zavvyfeatures.egg_item_pichu.tooltip";
        this.tokens = new ArrayList<>();
        this.tokens.add(ModItems.CHING_TOKEN);
    }
}
