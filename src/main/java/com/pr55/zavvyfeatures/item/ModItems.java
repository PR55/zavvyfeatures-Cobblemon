package com.pr55.zavvyfeatures.item;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.item.custom.*;
import com.pr55.zavvyfeatures.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet",new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet",new Item(new Item.Settings()));
    public static final Item TROLL_FACE_POINT = registerItem("troll_face_point",new Item(new Item.Settings().maxCount(1)));
    // Pokemon Tokens
    //Gen 1
    public static final Item BULBA_TOKEN = registerItem("bulba_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item CHAR_TOKEN = registerItem("char_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item SQUIR_TOKEN = registerItem("squir_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item PIKA_TOKEN = registerItem("pika_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item EVE_TOKEN = registerItem("eve_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    // Gen 2
    public static final Item CHIK_TOKEN = registerItem("chik_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item CYND_TOKEN = registerItem("cynd_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item TOTO_TOKEN = registerItem("toto_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item TOGI_TOKEN = registerItem("togi_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item PICHU_TOKEN = registerItem("pichu_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    // Gen 3
    public static final Item TREE_TOKEN = registerItem("tree_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item TOR_TOKEN = registerItem("tor_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item KIP_TOKEN = registerItem("kip_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    // Gen 4
    public static final Item TUR_TOKEN = registerItem("tur_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item CHIM_TOKEN = registerItem("chim_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item PIP_TOKEN = registerItem("pip_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    // Gen 5
    public static final Item SNIV_TOKEN = registerItem("sniv_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item TEP_TOKEN = registerItem("tep_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item OSHA_TOKEN = registerItem("osha_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    // Gen 6
    public static final Item CHESP_TOKEN = registerItem("chesp_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item FENNE_TOKEN = registerItem("fenne_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item FROAK_TOKEN = registerItem("froak_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    // Gen 7
    public static final Item ROW_TOKEN = registerItem("row_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item LIT_TOKEN = registerItem("lit_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item POP_TOKEN = registerItem("pop_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    // Gen 8
    public static final Item GROO_TOKEN = registerItem("groo_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item SCOR_TOKEN = registerItem("scor_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
    public static final Item SOB_TOKEN = registerItem("sob_token", new PokeToken(new Item.Settings().maxCount(1))); // Done
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
