package com.pr55.cobblemonservertools.item.custom;

import com.pr55.cobblemonservertools.config.custom.GeneralConfig;
import com.pr55.cobblemonservertools.item.ModItems;

import java.util.ArrayList;

public class dosEgg extends EggItemPoke {


    public dosEgg(Settings settings) {
        super(settings);
        this.DEFAULT_TIMER = GeneralConfig.legendaryEgg * 20;
        this.SHINY_CHANCE = GeneralConfig.babyEggRate;
        this.ACTIVATE_GUIDE = "tooltip.cobblemonservertools.egg_item_zapdos.tooltip";
        this.tokens = new ArrayList<>();
        this.tokens.add(ModItems.DOS_TOKEN);
    }
}
