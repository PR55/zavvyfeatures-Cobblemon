package com.pr55.cobblemonservertools.item.client;

import com.pr55.cobblemonservertools.item.custom.JamesRocketItem;
import com.pr55.cobblemonservertools.item.custom.JennyArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class JennyArmorRenderer extends GeoArmorRenderer<JennyArmorItem> {
    public JennyArmorRenderer(){
        super(new JennyArmorModel());
    }
}
