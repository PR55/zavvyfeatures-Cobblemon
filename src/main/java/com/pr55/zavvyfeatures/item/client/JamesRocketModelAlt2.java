package com.pr55.zavvyfeatures.item.client;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.item.custom.JamesRocketItemAlt1;
import com.pr55.zavvyfeatures.item.custom.JamesRocketItemAlt2;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class JamesRocketModelAlt2 extends GeoModel<JamesRocketItemAlt2> {

    @Override
    public Identifier getModelResource(JamesRocketItemAlt2 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "geo/rocket_armor_james_zavvy.geo.json");
    }

    @Override
    public Identifier getTextureResource(JamesRocketItemAlt2 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "textures/armor/rocket_armor_zavvy_james_alt2.png");
    }

    @Override
    public Identifier getAnimationResource(JamesRocketItemAlt2 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "animations/rocket_armor_james_zavvy.animation.json");
    }
}
