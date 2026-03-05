package com.pr55.zavvyfeatures.block.entity;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.block.ModBlocks;
import com.pr55.zavvyfeatures.block.custom.incubatorBlockSellable;
import com.pr55.zavvyfeatures.block.entity.custom.incubatorBlockEntity;
import com.pr55.zavvyfeatures.block.entity.custom.incubatorBlockEntitySellable;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<incubatorBlockEntity> INCUBATOR_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Zavvyfeatures.MOD_ID,"incubator_be"),
                    BlockEntityType.Builder.create(incubatorBlockEntity::new, ModBlocks.incubator).build(null));
    public static final BlockEntityType<incubatorBlockEntitySellable> INCUBATOR_BE_SELL =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Zavvyfeatures.MOD_ID,"incubator_sell_be"),
                    BlockEntityType.Builder.create(incubatorBlockEntitySellable::new, ModBlocks.incubator_sell).build(null));

    public static void registerBlockEntities(){
        Zavvyfeatures.LOGGER.info("Registering Block Entities for " + Zavvyfeatures.MOD_ID);
    }

}
