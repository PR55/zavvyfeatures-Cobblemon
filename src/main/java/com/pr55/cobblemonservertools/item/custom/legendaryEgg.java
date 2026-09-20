package com.pr55.cobblemonservertools.item.custom;

import com.pr55.cobblemonservertools.config.custom.GeneralConfig;

public class legendaryEgg extends EggItemPoke {


    public legendaryEgg(Settings settings) {
        super(settings);
        this.DEFAULT_TIMER = GeneralConfig.legendaryEgg * 20;
        this.SHINY_CHANCE = GeneralConfig.legendaryEggRate;
        this.ACTIVATE_GUIDE = "tooltip.cobblemonservertools.egg_item_legendary.tooltip";
    }

}
