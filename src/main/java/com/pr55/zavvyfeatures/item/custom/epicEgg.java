package com.pr55.zavvyfeatures.item.custom;

import com.pr55.zavvyfeatures.config.custom.GeneralConfig;

public class epicEgg extends EggItemPoke {


    public epicEgg(Settings settings) {
        super(settings);
        this.DEFAULT_TIMER = GeneralConfig.epicEgg * 20;
        this.SHINY_CHANCE = GeneralConfig.epicEggRate;
        this.ACTIVATE_GUIDE = "tooltip.zavvyfeatures.egg_item_epic.tooltip";
    }

}
