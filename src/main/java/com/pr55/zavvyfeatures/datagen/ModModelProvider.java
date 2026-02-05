package com.pr55.zavvyfeatures.datagen;


import com.pr55.zavvyfeatures.block.ModBlocks;
import com.pr55.zavvyfeatures.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_BLOCK);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
//        itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);
//        itemModelGenerator.register(ModItems.TROLL_FACE_POINT, Models.GENERATED);

        // Eggs
        itemModelGenerator.register(ModItems.EGG_ITEM_COMMON, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_UNCOMMON, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_RARE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_EPIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_LEGENDARY, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_TOGEPI, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_PICHU, Models.GENERATED);

        itemModelGenerator.register(ModItems.EGG_ITEM_AZURILL, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_BONSLY, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_BUDEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_CHINGLING, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_CLEFFA, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_ELEKID, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_HAPPINY, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_IGGLYBUFF, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_MAGBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_MANTYKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_MIMEJR, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_MUNCHLAX, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_RIOLU, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_SMOOCHUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_TOXEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_TYROGUE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ITEM_WYNAUT, Models.GENERATED);

        // Gen 1
        itemModelGenerator.register(ModItems.BULBA_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHAR_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SQUIR_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIKA_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.EVE_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.AERODA_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAT_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGNE_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAP_TOKEN, Models.GENERATED);
        // Gen 2
        itemModelGenerator.register(ModItems.CHIK_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYND_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOTO_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOGI_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICHU_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLEFF_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELE_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.IGG_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAG_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMOO_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TYR_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWIN_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEDDI_TOKEN, Models.GENERATED);
        // Gen 3
        itemModelGenerator.register(ModItems.TREE_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOR_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.KIP_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.AZURILL_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.WY_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TRAP_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.WAILM_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWAB_TOKEN, Models.GENERATED);
        // Gen 4
        itemModelGenerator.register(ModItems.TUR_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHIM_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIP_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BONS_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUD_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHING_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINY_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANTY_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIMJR_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUNCH_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RIO_TOKEN, Models.GENERATED);
        // Gen 5
        itemModelGenerator.register(ModItems.SNIV_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEP_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.OSHA_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLITZ_TOKEN, Models.GENERATED);
        // Gen 6
        itemModelGenerator.register(ModItems.CHESP_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.FENNE_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.FROAK_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOI_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SKID_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TYRUNT_TOKEN, Models.GENERATED);
        // Gen 7
        itemModelGenerator.register(ModItems.ROW_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIT_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.POP_TOKEN, Models.GENERATED);
        // Gen 8
        itemModelGenerator.register(ModItems.GROO_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCOR_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOB_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOX_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SNEASE_TOKEN, Models.GENERATED);
        // Gen 9
        itemModelGenerator.register(ModItems.SPRIG_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCO_TOKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUAX_TOKEN, Models.GENERATED);

        itemModelGenerator.register(ModItems.SPAWNER_WRENCH, Models.GENERATED);
        // Work on mod entity blocks up next

        itemModelGenerator.registerArmor((ArmorItem) ModItems.JAMES_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.JAMES_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.JAMES_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.JAMES_BOOTS);

    }
}
