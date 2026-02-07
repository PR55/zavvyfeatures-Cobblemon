package com.pr55.zavvyfeatures.item.client;

import com.pr55.zavvyfeatures.item.custom.JamesRocketItem;
import com.pr55.zavvyfeatures.item.custom.JessieRocketItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class JessieRocketRenderer extends GeoArmorRenderer<JessieRocketItem> {
    public JessieRocketRenderer(){
        super(new JessieRocketModel());
    }
}
