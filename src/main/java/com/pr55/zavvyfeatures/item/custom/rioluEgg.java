package com.pr55.zavvyfeatures.item.custom;

import com.pr55.zavvyfeatures.config.custom.GeneralConfig;
import com.pr55.zavvyfeatures.item.ModItems;

import java.util.ArrayList;

public class rioluEgg extends EggItemPoke {


    public rioluEgg(Settings settings) {
        super(settings);
        this.SHINY_CHANCE = GeneralConfig.babyEggRate;
        this.ACTIVATE_GUIDE = "tooltip.zavvyfeatures.egg_item_pichu.tooltip";
        this.tokens = new ArrayList<>();
        this.tokens.add(ModItems.RIO_TOKEN);
    }
}
