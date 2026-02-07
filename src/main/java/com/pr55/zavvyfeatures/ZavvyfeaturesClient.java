package com.pr55.zavvyfeatures;

import com.pr55.zavvyfeatures.block.ModBlocks;
import com.pr55.zavvyfeatures.block.entity.ModBlockEntities;
import com.pr55.zavvyfeatures.block.entity.renderer.incubatorBlockEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class ZavvyfeaturesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.incubator, RenderLayer.getTranslucent());

        BlockEntityRendererFactories.register(ModBlockEntities.INCUBATOR_BE, incubatorBlockEntityRenderer::new);
    }
}
