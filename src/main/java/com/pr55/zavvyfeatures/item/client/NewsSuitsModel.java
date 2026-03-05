package com.pr55.zavvyfeatures.item.client;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.item.custom.JamesRocketItem;
import com.pr55.zavvyfeatures.item.custom.NewsSuittItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class NewsSuitsModel extends GeoModel<NewsSuittItem> {

    @Override
    public Identifier getModelResource(NewsSuittItem animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "geo/news_outfit_zavvy.geo.json");
    }

    @Override
    public Identifier getTextureResource(NewsSuittItem animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "textures/armor/news_armor_1.png");
    }

    @Override
    public Identifier getAnimationResource(NewsSuittItem animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "animations/news_outfit_zavvy.animation.json");
    }
}
