package com.pr55.zavvyfeatures.item.custom;

import com.pr55.zavvyfeatures.component.ModDataComponentTypes;
import com.pr55.zavvyfeatures.config.custom.GeneralConfig;
import com.pr55.zavvyfeatures.item.ModItems;
import eu.midnightdust.lib.config.MidnightConfig;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.ArrayList;
import java.util.List;

public class commonEgg extends EggItemPoke {


    public commonEgg(Settings settings) {
        super(settings);
        this.SHINY_CHANCE = GeneralConfig.commonEggRate;
        this.DEFAULT_TIMER = GeneralConfig.commonEgg * 20;
        this.ACTIVATE_GUIDE = "tooltip.zavvyfeatures.egg_item_common.tooltip";
    }

}
