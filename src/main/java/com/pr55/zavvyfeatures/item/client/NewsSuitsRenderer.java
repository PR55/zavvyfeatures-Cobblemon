package com.pr55.zavvyfeatures.item.client;

import com.pr55.zavvyfeatures.item.custom.JamesRocketItem;
import com.pr55.zavvyfeatures.item.custom.NewsSuittItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class NewsSuitsRenderer extends GeoArmorRenderer<NewsSuittItem> {
    public NewsSuitsRenderer(){
        super(new NewsSuitsModel());
    }
}
