package com.pr55.cobblemonservertools.item.client;

import com.pr55.cobblemonservertools.item.custom.JamesRocketItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class JamesRocketRenderer extends GeoArmorRenderer<JamesRocketItem> {
    public JamesRocketRenderer(){
        super(new JamesRocketModel());
    }
}
