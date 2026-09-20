package com.pr55.cobblemonservertools.item.custom;

import com.pr55.cobblemonservertools.config.custom.GeneralConfig;
import com.pr55.cobblemonservertools.item.ModItems;

import java.util.ArrayList;

public class togepiEgg extends EggItemPoke {


    public togepiEgg(Settings settings) {
        super(settings);
        this.SHINY_CHANCE = GeneralConfig.babyEggRate;
        this.ACTIVATE_GUIDE = "tooltip.cobblemonservertools.egg_item_togepi.tooltip";
        this.tokens = new ArrayList<>();
        this.tokens.add(ModItems.TOGI_TOKEN);
    }
}
