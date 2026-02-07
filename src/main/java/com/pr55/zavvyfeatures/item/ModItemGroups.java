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
            Identifier.of(Zavvyfeatures.MOD_ID,"admin_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack((ModBlocks.poke_block)))
                    .displayName(Text.translatable("itemgroup.zavvyfeatures.admin_items"))
                    .entries((displayContext, entries) -> {
//                        entries.add(ModItems.TROLL_FACE_POINT);
                        entries.add(ModBlocks.incubator);
                        entries.add(ModBlocks.poke_block);
                        entries.add(ModItems.SPAWNER_WRENCH);

                        entries.add(ModItems.COPPER_COIN);
                        entries.add(ModItems.IROM_COIN);
                        entries.add(ModItems.GOLD_COIN);
                        entries.add(ModItems.DIAMOND_COIN);
                        entries.add(ModItems.EMERALD_COIN);

                        entries.add(ModItems.JAMES_HELMET);
                        entries.add(ModItems.JAMES_CHESTPLATE);
                        entries.add(ModItems.JAMES_LEGGINGS);
                        entries.add(ModItems.JAMES_BOOTS);
                    }).build());
    public static final ItemGroup POKE_TOKENS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Zavvyfeatures.MOD_ID,"poke_tokens"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack((ModItems.EGG_ITEM_COMMON)))
                    .displayName(Text.translatable("itemgroup.zavvyfeatures.egg_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.EGG_ITEM_COMMON);
                        entries.add(ModItems.EGG_ITEM_UNCOMMON);
                        entries.add(ModItems.EGG_ITEM_RARE);
                        entries.add(ModItems.EGG_ITEM_EPIC);
                        entries.add(ModItems.EGG_ITEM_LEGENDARY);
                        entries.add(ModItems.EGG_ITEM_TOGEPI);
                        entries.add(ModItems.EGG_ITEM_PICHU);
                        entries.add(ModItems.EGG_ITEM_AZURILL);
                        entries.add(ModItems.EGG_ITEM_BONSLY);
                        entries.add(ModItems.EGG_ITEM_BUDEW);
                        entries.add(ModItems.EGG_ITEM_CHINGLING);
                        entries.add(ModItems.EGG_ITEM_CLEFFA);
                        entries.add(ModItems.EGG_ITEM_ELEKID);
                        entries.add(ModItems.EGG_ITEM_HAPPINY);
                        entries.add(ModItems.EGG_ITEM_IGGLYBUFF);
                        entries.add(ModItems.EGG_ITEM_MAGBY);
                        entries.add(ModItems.EGG_ITEM_MANTYKE);
                        entries.add(ModItems.EGG_ITEM_MIMEJR);
                        entries.add(ModItems.EGG_ITEM_MUNCHLAX);
                        entries.add(ModItems.EGG_ITEM_RIOLU);
                        entries.add(ModItems.EGG_ITEM_SMOOCHUM);
                        entries.add(ModItems.EGG_ITEM_TOXEL);
                        entries.add(ModItems.EGG_ITEM_TYROGUE);
                        entries.add(ModItems.EGG_ITEM_WYNAUT);
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
                        entries.add(ModItems.CLEFF_TOKEN);
                        entries.add(ModItems.ELE_TOKEN);
                        entries.add(ModItems.IGG_TOKEN);
                        entries.add(ModItems.MAG_TOKEN);
                        entries.add(ModItems.SMOO_TOKEN);
                        entries.add(ModItems.TYR_TOKEN);
                        // Gen 3
                        entries.add(ModItems.TREE_TOKEN);
                        entries.add(ModItems.TOR_TOKEN);
                        entries.add(ModItems.KIP_TOKEN);
                        entries.add(ModItems.AZURILL_TOKEN);
                        entries.add(ModItems.WY_TOKEN);
                        // Gen 4
                        entries.add(ModItems.TUR_TOKEN);
                        entries.add(ModItems.CHIM_TOKEN);
                        entries.add(ModItems.PIP_TOKEN);
                        entries.add(ModItems.BONS_TOKEN);
                        entries.add(ModItems.BUD_TOKEN);
                        entries.add(ModItems.CHING_TOKEN);
                        entries.add(ModItems.PINY_TOKEN);
                        entries.add(ModItems.MANTY_TOKEN);
                        entries.add(ModItems.MIMJR_TOKEN);
                        entries.add(ModItems.MUNCH_TOKEN);
                        entries.add(ModItems.RIO_TOKEN);
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
                        entries.add(ModItems.TOX_TOKEN);
                        // Gen 9
                        entries.add(ModItems.SPRIG_TOKEN);
                        entries.add(ModItems.COCO_TOKEN);
                        entries.add(ModItems.QUAX_TOKEN);
                    }).build());

            public static final ItemGroup POKE_RIDE_TOKENS = Registry.register(Registries.ITEM_GROUP,
                    Identifier.of(Zavvyfeatures.MOD_ID,"poke_ride_tokens"),
                    FabricItemGroup.builder()
                    .icon(() -> new ItemStack((ModItems.AERODA_TOKEN)))
                    .displayName(Text.translatable("itemgroup.zavvyfeatures.ride_items"))
                    .entries((displayContext, entries) -> {

                        // Gen 1
                        entries.add(ModItems.AERODA_TOKEN);
                        entries.add(ModItems.DRAT_TOKEN);
                        entries.add(ModItems.MAGNE_TOKEN);
                        entries.add(ModItems.LAP_TOKEN);
                        // Gen 2
                        entries.add(ModItems.TEDDI_TOKEN);
                        entries.add(ModItems.SWIN_TOKEN);
                        // Gen 3
                        entries.add(ModItems.TRAP_TOKEN);
                        entries.add(ModItems.WAILM_TOKEN);
                        entries.add(ModItems.SWAB_TOKEN);
                        // Gen 5
                        entries.add(ModItems.BLITZ_TOKEN);
                        // Gen 6
                        entries.add(ModItems.NOI_TOKEN);
                        entries.add(ModItems.SKID_TOKEN);
                        entries.add(ModItems.TYRUNT_TOKEN);
                        // Gen 7

                        // Gen 8
                        entries.add(ModItems.SNEASE_TOKEN);
                        // Gen 9

                    }).build());

    public static void registerItemGroups(){
        Zavvyfeatures.LOGGER.info("Registering Item Groups for " + Zavvyfeatures.MOD_ID + "!");
    }
}
