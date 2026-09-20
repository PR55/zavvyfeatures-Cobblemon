package com.pr55.cobblemonservertools.item.client;

import com.pr55.cobblemonservertools.Zavvyfeatures;
import com.pr55.cobblemonservertools.item.custom.JamesRocketItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class JamesRocketModel extends GeoModel<JamesRocketItem> {

    @Override
    public Identifier getModelResource(JamesRocketItem animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "geo/rocket_armor_james_zavvy.geo.json");
    }

    @Override
    public Identifier getTextureResource(JamesRocketItem animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "textures/armor/rocket_armor_james_zavvy.png");
    }

    @Override
    public Identifier getAnimationResource(JamesRocketItem animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "animations/rocket_armor_james_zavvy.animation.json");
    }
}
