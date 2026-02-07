package com.pr55.zavvyfeatures.item.client;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.item.custom.JessieRocketItem;
import com.pr55.zavvyfeatures.item.custom.JessieRocketItemAlt4;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class JessieRocketModelAlt4 extends GeoModel<JessieRocketItemAlt4> {

    @Override
    public Identifier getModelResource(JessieRocketItemAlt4 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "geo/rocket_armor_james_zavvy.geo.json");
    }

    @Override
    public Identifier getTextureResource(JessieRocketItemAlt4 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "textures/armor/rocket_armor_zavvy_jessie_alt4.png");
    }

    @Override
    public Identifier getAnimationResource(JessieRocketItemAlt4 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "animations/rocket_armor_james_zavvy.animation.json");
    }
}
