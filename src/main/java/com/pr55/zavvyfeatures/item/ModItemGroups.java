package com.pr55.zavvyfeatures.item;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.pr55.zavvyfeatures.block.ModBlocks;

public class ModItemGroups {
//    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
//            Identifier.of(Zavvyfeatures.MOD_ID,"pink_garnet_items"),
//            FabricItemGroup.builder()
//                    .icon(() -> new ItemStack((ModItems.PINK_GARNET)))
//                    .displayName(Text.translatable("itemgroup.zavvyfeatures.pink_garnet_items"))
//                    .entries((displayContext, entries) -> {
//                        entries.add(ModItems.PINK_GARNET);
//                        entries.add(ModItems.RAW_PINK_GARNET);
//                    }).build());
//
//
//    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
//            Identifier.of(Zavvyfeatures.MOD_ID,"pink_garnet_blocks"),
//            FabricItemGroup.builder()
//                    .icon(() -> new ItemStack((ModBlocks.PINK_GARNET_BLOCK)))
//                    .displayName(Text.translatable("itemgroup.zavvyfeatures.pink_garnet_blocks"))
//                    .entries((displayContext, entries) -> {
//                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
//                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
//                        entries.add(ModBlocks.PINK_GARNET_ORE);
//                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
//                    }).build());


    public static final ItemGroup DUMMY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Zavvyfeatures.MOD_ID,"dummy_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack((ModItems.EGG_ITEM_COMMON)))
                    .displayName(Text.translatable("itemgroup.zavvyfeatures.dummy_items"))
                    .entries((displayContext, entries) -> {
//                        entries.add(ModItems.TROLL_FACE_POINT);
                        entries.add(ModItems.EGG_ITEM_COMMON);
                        entries.add(ModItems.EGG_ITEM_UNCOMMON);
                        entries.add(ModItems.EGG_ITEM_RARE);
                        entries.add(ModItems.EGG_ITEM_EPIC);
                        entries.add(ModItems.EGG_ITEM_LEGENDARY);
                        entries.add(ModItems.EGG_ITEM_TOGEPI);
                        entries.add(ModItems.EGG_ITEM_PICHU);
                        entries.add(ModBlocks.poke_block);
                        entries.add(ModItems.SPAWNER_WRENCH);

                        entries.add(ModItems.JAMES_HELMET);
                        entries.add(ModItems.JAMES_CHESTPLATE);
                        entries.add(ModItems.JAMES_LEGGINGS);
                        entries.add(ModItems.JAMES_BOOTS);
                    }).build());
    public static final ItemGroup POKE_TOKENS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Zavvyfeatures.MOD_ID,"poke_tokens"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack((ModItems.CHIK_TOKEN)))
                    .displayName(Text.translatable("itemgroup.zavvyfeatures.dummy_items"))
                    .entries((displayContext, entries) -> {
                        // Gen 1
                        entries.add(ModItems.BULBA_TOKEN);
                        entries.add(ModItems.CHAR_TOKEN);
                        entries.add(ModItems.SQUIR_TOKEN);
                        entries.add(ModItems.PIKA_TOKEN);
                        entries.add(ModItems.EVE_TOKEN);
                        // Gen 2
                        entries.add(ModItems.CHIK_TOKEN);
                        entries.add(ModItems.CYND_TOKEN);
                        entries.add(ModItems.TOTO_TOKEN);
                        entries.add(ModItems.TOGI_TOKEN);
                        entries.add(ModItems.PICHU_TOKEN);
                        // Gen 3
                        entries.add(ModItems.TREE_TOKEN);
                        entries.add(ModItems.TOR_TOKEN);
                        entries.add(ModItems.KIP_TOKEN);
                        // Gen 4
                        entries.add(ModItems.TUR_TOKEN);
                        entries.add(ModItems.CHIM_TOKEN);
                        entries.add(ModItems.PIP_TOKEN);
                        // Gen 5
                        entries.add(ModItems.SNIV_TOKEN);
                        entries.add(ModItems.TEP_TOKEN);
                        entries.add(ModItems.OSHA_TOKEN);
                        // Gen 6
                        entries.add(ModItems.CHESP_TOKEN);
                        entries.add(ModItems.FENNE_TOKEN);
                        entries.add(ModItems.FROAK_TOKEN);
                        // Gen 7
                        entries.add(ModItems.ROW_TOKEN);
                        entries.add(ModItems.LIT_TOKEN);
                        entries.add(ModItems.POP_TOKEN);
                        // Gen 8
                        entries.add(ModItems.GROO_TOKEN);
                        entries.add(ModItems.SCOR_TOKEN);
                        entries.add(ModItems.SOB_TOKEN);
                        // Gen 9
                        entries.add(ModItems.SPRIG_TOKEN);
                        entries.add(ModItems.COCO_TOKEN);
                        entries.add(ModItems.QUAX_TOKEN);
                    }).build());

    public static void registerItemGroups(){
        Zavvyfeatures.LOGGER.info("Registering Item Groups for " + Zavvyfeatures.MOD_ID + "!");
    }
}
