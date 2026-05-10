package com.pr55.zavvyfeatures.item.custom;

import com.pr55.zavvyfeatures.config.custom.GeneralConfig;
import com.pr55.zavvyfeatures.item.ModItems;

import java.util.ArrayList;

public class tresEgg extends EggItemPoke {


    public tresEgg(Settings settings) {
        super(settings);
        this.DEFAULT_TIMER = GeneralConfig.legendaryEgg * 20;
        this.SHINY_CHANCE = GeneralConfig.babyEggRate;
        this.ACTIVATE_GUIDE = "tooltip.zavvyfeatures.egg_item_moltres.tooltip";
        this.tokens = new ArrayList<>();
        this.tokens.add(ModItems.TRES_TOKEN);
    }
}
