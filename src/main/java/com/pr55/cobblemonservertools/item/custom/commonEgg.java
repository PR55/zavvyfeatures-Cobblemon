package com.pr55.cobblemonservertools.item.custom;

import com.pr55.cobblemonservertools.config.custom.GeneralConfig;

public class commonEgg extends EggItemPoke {


    public commonEgg(Settings settings) {
        super(settings);
        this.SHINY_CHANCE = GeneralConfig.commonEggRate;
        this.DEFAULT_TIMER = GeneralConfig.commonEgg * 20;
        this.ACTIVATE_GUIDE = "tooltip.cobblemonservertools.egg_item_common.tooltip";
    }

}
