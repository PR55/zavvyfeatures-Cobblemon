package com.pr55.zavvyfeatures.item.client;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.item.custom.JessieRocketItem;
import com.pr55.zavvyfeatures.item.custom.JessieRocketItemAlt3;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class JessieRocketModelAlt3 extends GeoModel<JessieRocketItemAlt3> {

    @Override
    public Identifier getModelResource(JessieRocketItemAlt3 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "geo/rocket_armor_james_zavvy.geo.json");
    }

    @Override
    public Identifier getTextureResource(JessieRocketItemAlt3 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "textures/armor/rocket_armor_zavvy_jessie_alt3.png");
    }

    @Override
    public Identifier getAnimationResource(JessieRocketItemAlt3 animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "animations/rocket_armor_james_zavvy.animation.json");
    }
}
