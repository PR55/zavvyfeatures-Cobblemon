package com.pr55.cobblemonservertools.item.custom;

import com.pr55.cobblemonservertools.config.custom.GeneralConfig;

public class uncommonEgg extends EggItemPoke {


    public uncommonEgg(Settings settings) {
        super(settings);
        this.DEFAULT_TIMER = GeneralConfig.uncommonEgg * 20;
        this.SHINY_CHANCE = GeneralConfig.uncommonEggRate;
        this.ACTIVATE_GUIDE = "tooltip.cobblemonservertools.egg_item_uncommon.tooltip";
    }

}
