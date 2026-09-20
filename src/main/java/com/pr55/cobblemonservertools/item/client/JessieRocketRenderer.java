package com.pr55.cobblemonservertools.item.client;

import com.pr55.cobblemonservertools.item.custom.JessieRocketItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class JessieRocketRenderer extends GeoArmorRenderer<JessieRocketItem> {
    public JessieRocketRenderer(){
        super(new JessieRocketModel());
    }
}
