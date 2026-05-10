package com.pr55.zavvyfeatures;

import com.pr55.zavvyfeatures.block.ModBlocks;
import com.pr55.zavvyfeatures.block.entity.ModBlockEntities;
import com.pr55.zavvyfeatures.block.entity.renderer.incubatorBlockEntityRenderer;
import com.pr55.zavvyfeatures.block.entity.renderer.incubatorBlockEntityRendererSellable;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.util.Identifier;
//import org.ladysnake.satin.api.event.ShaderEffectRenderCallback;
//import org.ladysnake.satin.api.managed.ManagedShaderEffect;
//import org.ladysnake.satin.api.managed.ShaderEffectManager;

public class ZavvyfeaturesClient implements ClientModInitializer {

//    private static final ManagedShaderEffect GRAYSCALE_SHADER = ShaderEffectManager.getInstance().manage(
//            Identifier.of(Zavvyfeatures.MOD_ID, "shaders/post/greyscale.json"));
//  Look at net.minecraft/assets/minecraft/shaders/program, mmainly the blit.fsh, blit.json, abd blit.vsh.
//    These define how shader will be used by OpenGL and variables that can be used!
//    private static boolean enabled = true;  // can be disabled whenever you want

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.incubator, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.incubator_sell, RenderLayer.getTranslucent());

        BlockEntityRendererFactories.register(ModBlockEntities.INCUBATOR_BE, incubatorBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.INCUBATOR_BE_SELL, incubatorBlockEntityRendererSellable::new);

        // the render method of the shader will be called after the game
        // has drawn the world on the main framebuffer, when it renders
        // vanilla post process shaders
//        ShaderEffectRenderCallback.EVENT.register(tickDelta -> {
//            if (enabled) {
//                GRAYSCALE_SHADER.render(tickDelta);
//            }
//        });
    }
}
