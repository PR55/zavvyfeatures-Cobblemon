package com.pr55.zavvyfeatures.item.custom;

public class rareEgg extends EggItemPoke {


    public rareEgg(Settings settings) {
        super(settings);
        this.SHINY_CHANCE = 2048;
        this.ACTIVATE_GUIDE = "tooltip.zavvyfeatures.egg_item_rare.tooltip";
    }

}
