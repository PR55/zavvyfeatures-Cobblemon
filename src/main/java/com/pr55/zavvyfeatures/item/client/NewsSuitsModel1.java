package com.pr55.zavvyfeatures.item.client;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.item.custom.NewsSuittItem;
import com.pr55.zavvyfeatures.item.custom.NewsSuittItem1;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class NewsSuitsModel1 extends GeoModel<NewsSuittItem1> {

    @Override
    public Identifier getModelResource(NewsSuittItem1 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "geo/news_outfit_zavvy.geo.json");
    }

    @Override
    public Identifier getTextureResource(NewsSuittItem1 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "textures/armor/news_armor_2.png");
    }

    @Override
    public Identifier getAnimationResource(NewsSuittItem1 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "animations/news_outfit_zavvy.animation.json");
    }
}
