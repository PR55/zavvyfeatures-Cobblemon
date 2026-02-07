package com.pr55.zavvyfeatures.item.client;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.item.custom.JessieRocketItem;
import com.pr55.zavvyfeatures.item.custom.JessieRocketItemAlt2;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class JessieRocketModelAlt2 extends GeoModel<JessieRocketItemAlt2> {

    @Override
    public Identifier getModelResource(JessieRocketItemAlt2 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "geo/rocket_armor_james_zavvy.geo.json");
    }

    @Override
    public Identifier getTextureResource(JessieRocketItemAlt2 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "textures/armor/rocket_armor_zavvy_jessie_alt2.png");
    }

    @Override
    public Identifier getAnimationResource(JessieRocketItemAlt2 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "animations/rocket_armor_james_zavvy.animation.json");
    }
}
