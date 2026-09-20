package com.pr55.cobblemonservertools.item.custom;

import com.pr55.cobblemonservertools.config.custom.GeneralConfig;
import com.pr55.cobblemonservertools.item.ModItems;

import java.util.ArrayList;

public class bonslyEgg extends EggItemPoke {


    public bonslyEgg(Settings settings) {
        super(settings);
        this.SHINY_CHANCE = GeneralConfig.babyEggRate;
        this.ACTIVATE_GUIDE = "tooltip.cobblemonservertools.egg_item_pichu.tooltip";
        this.tokens = new ArrayList<>();
        this.tokens.add(ModItems.BONS_TOKEN);
    }
}
