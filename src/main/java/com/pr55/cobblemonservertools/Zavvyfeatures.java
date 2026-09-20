package com.pr55.cobblemonservertools;

import com.pr55.cobblemonservertools.block.ModBlocks;
import com.pr55.cobblemonservertools.block.entity.ModBlockEntities;
import com.pr55.cobblemonservertools.component.ModDataComponentTypes;
import com.pr55.cobblemonservertools.config.ModConfigs;
import com.pr55.cobblemonservertools.effect.ModEffects;
import com.pr55.cobblemonservertools.item.ModItemGroups;
import com.pr55.cobblemonservertools.item.ModItems;
import com.pr55.cobblemonservertools.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Zavvyfeatures implements ModInitializer {
	public static final String MOD_ID = "cobblemonservertools";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// Override appricorn loot tables

		LOGGER.info("Hello Fabric world!");

		ModConfigs.InitializeModConfigs();

		ModDataComponentTypes.registerDataComponentTypes();
		ModSounds.registerSounds();

//		ModEnchantmentEffects.registerEnchantmentEffects();

//		ModEnchantments.registerModEnchantments();

		ModItems.registerModItems();
		ModBlockEntities.registerBlockEntities();
		ModBlocks.registerModBlocks();

		ModItemGroups.registerItemGroups();

		ModEffects.registerEffects();

//		ModVillagers.registerVillagers();
//
//
//		TradeOfferHelper.registerVillagerOffers(ModVillagers.KAUPENGER, 1, factories -> {
//			factories.add((entity, random) -> new customTradeOffer(
//					new TradedItem(ModItems.COPPER_COIN, 9),
//					new ItemStack(ModItems.IROM_COIN, 1), 999999999, 4, 0.0f, false));
//			factories.add((entity, random) -> new customTradeOffer(
//					new TradedItem(ModItems.IROM_COIN, 9),
//					new ItemStack(ModItems.GOLD_COIN, 1), 999999999, 4, 0.0f, false));
//		});
	}
}