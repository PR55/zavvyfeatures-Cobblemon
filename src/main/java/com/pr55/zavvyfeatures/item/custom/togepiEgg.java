package com.pr55.zavvyfeatures.item.custom;

import com.pr55.zavvyfeatures.config.custom.GeneralConfig;
import com.pr55.zavvyfeatures.item.ModItems;

import java.util.ArrayList;

public class togepiEgg extends EggItemPoke {


    public togepiEgg(Settings settings) {
        super(settings);
        this.SHINY_CHANCE = GeneralConfig.babyEggRate;
        this.ACTIVATE_GUIDE = "tooltip.zavvyfeatures.egg_item_togepi.tooltip";
        this.tokens = new ArrayList<>();
        this.tokens.add(ModItems.TOGI_TOKEN);
    }
}
