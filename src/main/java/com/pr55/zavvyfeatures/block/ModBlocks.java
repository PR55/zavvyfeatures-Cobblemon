package com.pr55.zavvyfeatures.block;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.block.custom.pokeSpawner;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD)));

    public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD)));

    public static final Block PINK_GARNET_DEEPSLATE_ORE = registerBlock("pink_garnet_deepslate_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD)));

    public static final Block poke_block = registerBlock("poke_spawner",
            new pokeSpawner(AbstractBlock.Settings.create().strength(6f).sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK,Identifier.of(Zavvyfeatures.MOD_ID, name),block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Zavvyfeatures.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        Zavvyfeatures.LOGGER.info("Registering Mod Blocks for " + Zavvyfeatures.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
//            entries.add(ModBlocks.PINK_GARNET_BLOCK);
//            entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
//            entries.add(ModBlocks.PINK_GARNET_ORE);
//            entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
//        });
    }
}
