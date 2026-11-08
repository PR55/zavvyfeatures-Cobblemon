package com.pr55.cobblemonservertools.item.client;

import com.pr55.cobblemonservertools.Zavvyfeatures;
import com.pr55.cobblemonservertools.item.custom.JamesRocketItem;
import com.pr55.cobblemonservertools.item.custom.JennyArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class JennyArmorModel extends GeoModel<JennyArmorItem> {

    @Override
    public Identifier getModelResource(JennyArmorItem animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "geo/jenny_armor_zavvy.geo.json");
    }

    @Override
    public Identifier getTextureResource(JennyArmorItem animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "textures/armor/jenny_armor_zavvy.png");
    }

    @Override
    public Identifier getAnimationResource(JennyArmorItem animatable) {
        return new Identifier(Zavvyfeatures.MOD_ID, "animations/jenny_armor_zavvy.animation.json");
    }
}
