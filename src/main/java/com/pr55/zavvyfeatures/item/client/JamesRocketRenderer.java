package com.pr55.zavvyfeatures.item.client;

import com.pr55.zavvyfeatures.item.custom.JamesRocketItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class JamesRocketRenderer extends GeoArmorRenderer<JamesRocketItem> {
    public JamesRocketRenderer(){
        super(new JamesRocketModel());
    }
}
