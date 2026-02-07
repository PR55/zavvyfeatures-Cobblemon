package com.pr55.zavvyfeatures.item.client;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.item.custom.JamesRocketItem;
import com.pr55.zavvyfeatures.item.custom.JessieRocketItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class JessieRocketModel extends GeoModel<JessieRocketItem> {

    @Override
    public Identifier getModelResource(JessieRocketItem animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "geo/rocket_armor_james_zavvy.geo.json");
    }

    @Override
    public Identifier getTextureResource(JessieRocketItem animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "textures/armor/rocket_armor_zavvy_jessie.png");
    }

    @Override
    public Identifier getAnimationResource(JessieRocketItem animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "animations/rocket_armor_james_zavvy.animation.json");
    }
}
