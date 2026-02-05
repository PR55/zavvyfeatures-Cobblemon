package com.pr55.zavvyfeatures.item;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.item.custom.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

//    public static final Item PINK_GARNET = registerItem("pink_garnet",new Item(new Item.Settings()));
//    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet",new Item(new Item.Settings()));
//    public static final Item TROLL_FACE_POINT = registerItem("troll_face_point",new Item(new Item.Settings().maxCount(1)));
    // Pokemon Tokens
    //Gen 1
    public static final Item BULBA_TOKEN = registerItem("bulba_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item CHAR_TOKEN = registerItem("char_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item SQUIR_TOKEN = registerItem("squir_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item PIKA_TOKEN = registerItem("pika_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item EVE_TOKEN = registerItem("eve_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item AERODA_TOKEN = registerItem("eve_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item DRAT_TOKEN = registerItem("eve_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item MAGNE_TOKEN = registerItem("eve_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item LAP_TOKEN = registerItem("eve_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    // Gen 2
    public static final Item CHIK_TOKEN = registerItem("chik_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item CYND_TOKEN = registerItem("cynd_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item TOTO_TOKEN = registerItem("toto_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item TOGI_TOKEN = registerItem("togi_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item PICHU_TOKEN = registerItem("pichu_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item TYR_TOKEN = registerItem("tyr_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item ELE_TOKEN = registerItem("ele_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item MAG_TOKEN = registerItem("mag_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item CLEFF_TOKEN = registerItem("cleff_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item SMOO_TOKEN = registerItem("smoo_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item TEDDI_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item IGG_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item SWIN_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    // Gen 3
    public static final Item TREE_TOKEN = registerItem("tree_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item TOR_TOKEN = registerItem("tor_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item KIP_TOKEN = registerItem("kip_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item TRAP_TOKEN = registerItem("trap_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item WAILM_TOKEN = registerItem("wailm_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item AZURILL_TOKEN = registerItem("azurill_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item WY_TOKEN = registerItem("wy_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item SWAB_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    // Gen 4
    public static final Item TUR_TOKEN = registerItem("tur_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item CHIM_TOKEN = registerItem("chim_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item PIP_TOKEN = registerItem("pip_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item BONS_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item BUD_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item CHING_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item MANTY_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item MIMJR_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item MUNCH_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item PINY_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item RIO_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    // Gen 5
    public static final Item SNIV_TOKEN = registerItem("sniv_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item TEP_TOKEN = registerItem("tep_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item OSHA_TOKEN = registerItem("osha_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item BLITZ_TOKEN = registerItem("blitz_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    // Gen 6
    public static final Item CHESP_TOKEN = registerItem("chesp_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item FENNE_TOKEN = registerItem("fenne_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item FROAK_TOKEN = registerItem("froak_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item NOI_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item SKID_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item TYRUNT_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    // Gen 7
    public static final Item ROW_TOKEN = registerItem("row_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item LIT_TOKEN = registerItem("lit_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item POP_TOKEN = registerItem("pop_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    // Gen 8
    public static final Item GROO_TOKEN = registerItem("groo_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item SCOR_TOKEN = registerItem("scor_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item SOB_TOKEN = registerItem("sob_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item SNEASE_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item TOX_TOKEN = registerItem("piny_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    // Gen 9
    public static final Item SPRIG_TOKEN = registerItem("sprig_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item COCO_TOKEN = registerItem("coco_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item QUAX_TOKEN = registerItem("quax_token", new PokeToken(new Item.Settings().maxCount(1))); // Done

    // Pokémon Eggs
    public static final Item EGG_ITEM_COMMON = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_UNCOMMON = registerItem("egg_item_uncommon",new uncommonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_RARE= registerItem("egg_item_rare",new rareEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_EPIC= registerItem("egg_item_epic",new epicEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_LEGENDARY= registerItem("egg_item_legendary",new legendaryEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_TOGEPI= registerItem("egg_item_togepi",new togepiEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_PICHU= registerItem("egg_item_pichu",new pichuEgg(new Item.Settings().maxCount(1)));

    public static final Item EGG_ITEM_AZURILL = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_BONSLY = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_BUDEW = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_CHINGLING = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_CLEFFA = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_ELEKID = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_HAPPINY = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_IGGLYBUFF = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_MAGBY = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_MANTYKE = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_MIMEJR = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_MUNCHLAX = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_RIOLU = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_SMOOCHUM = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_TOXEL = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_TYROGUE = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));
    public static final Item EGG_ITEM_WYNAUT = registerItem("egg_item_common",new commonEgg(new Item.Settings().maxCount(1)));


    // Tools
    public static final Item SPAWNER_WRENCH = registerItem("spawner_wrench", new wrenchItem(new Item.Settings().maxCount(1)));

    // Coins

    // Armor

        // James
    public static final Item JAMES_HELMET = registerItem("james_helmet_zavvy",
                new JamesRocketItem(ModArmorMaterials.JAMES_ROCKET_MATERIAL, ArmorItem.Type.HELMET,new Item.Settings().maxCount(1)));
    public static final Item JAMES_CHESTPLATE = registerItem("james_chestplate_zavvy",
            new JamesRocketItem(ModArmorMaterials.JAMES_ROCKET_MATERIAL, ArmorItem.Type.CHESTPLATE,new Item.Settings().maxCount(1)));
    public static final Item JAMES_LEGGINGS = registerItem("james_leggings_zavvy",
            new JamesRocketItem(ModArmorMaterials.JAMES_ROCKET_MATERIAL, ArmorItem.Type.LEGGINGS,new Item.Settings().maxCount(1)));
    public static final Item JAMES_BOOTS = registerItem("james_boots_zavvy",
            new JamesRocketItem(ModArmorMaterials.JAMES_ROCKET_MATERIAL, ArmorItem.Type.BOOTS,new Item.Settings().maxCount(1)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Zavvyfeatures.MOD_ID,name), item);
    }

    public static void registerModItems(){
        Zavvyfeatures.LOGGER.info("Registering Mod Items for " + Zavvyfeatures.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
//            entries.add(PINK_GARNET);
//            entries.add(RAW_PINK_GARNET);
//            entries.add(TROLL_FACE_POINT);
//        });
    }
}
