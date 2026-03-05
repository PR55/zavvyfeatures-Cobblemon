package com.pr55.zavvyfeatures.villager.custom_options;

import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;

public class customTradeOffer extends TradeOffer {

    private static boolean reward;

    public customTradeOffer(TradedItem buyItem, ItemStack sellItem, int maxUses, int merchantExperience, float priceMultiplier, boolean rewardXP) {
        super(buyItem, sellItem, maxUses, merchantExperience, priceMultiplier);

        reward = rewardXP;

    }

    @Override
    public boolean shouldRewardPlayerExperience() {
        return reward;
    }
}
