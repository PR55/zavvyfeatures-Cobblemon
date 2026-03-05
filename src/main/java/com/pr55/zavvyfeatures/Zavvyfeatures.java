package com.pr55.zavvyfeatures;

import com.cobblemon.mod.common.api.events.CobblemonEvents;
import com.cobblemon.mod.common.api.events.battles.BattleVictoryEvent;
import com.pr55.zavvyfeatures.block.ModBlocks;
import com.pr55.zavvyfeatures.block.entity.ModBlockEntities;
import com.pr55.zavvyfeatures.component.ModDataComponentTypes;
import com.pr55.zavvyfeatures.config.ModConfigs;
import com.pr55.zavvyfeatures.effect.ModEffects;
import com.pr55.zavvyfeatures.item.ModItemGroups;
import com.pr55.zavvyfeatures.item.ModItems;
import com.pr55.zavvyfeatures.sound.ModSounds;
import com.pr55.zavvyfeatures.villager.ModVillagers;
import com.pr55.zavvyfeatures.villager.custom_options.customTradeOffer;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.message.v1.ServerMessageDecoratorEvent;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Zavvyfeatures implements ModInitializer {
	public static final String MOD_ID = "zavvyfeatures";

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