package com.pr55.cobblemonservertools.item.client;

import com.pr55.cobblemonservertools.Zavvyfeatures;
import com.pr55.cobblemonservertools.item.custom.JamesRocketItemAlt4;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class JamesRocketModelAlt4 extends GeoModel<JamesRocketItemAlt4> {

    @Override
    public Identifier getModelResource(JamesRocketItemAlt4 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "geo/rocket_armor_james_zavvy.geo.json");
    }

    @Override
    public Identifier getTextureResource(JamesRocketItemAlt4 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "textures/armor/rocket_armor_zavvy_james_alt4.png");
    }

    @Override
    public Identifier getAnimationResource(JamesRocketItemAlt4 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "animations/rocket_armor_james_zavvy.animation.json");
    }
}
