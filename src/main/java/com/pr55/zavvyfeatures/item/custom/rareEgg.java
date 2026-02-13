package com.pr55.zavvyfeatures.item.custom;

import com.pr55.zavvyfeatures.config.custom.GeneralConfig;

public class rareEgg extends EggItemPoke {


    public rareEgg(Settings settings) {
        super(settings);
        this.DEFAULT_TIMER = GeneralConfig.rareEgg * 20;
        this.SHINY_CHANCE = GeneralConfig.rareEggRate;
        this.ACTIVATE_GUIDE = "tooltip.zavvyfeatures.egg_item_rare.tooltip";
    }

}
