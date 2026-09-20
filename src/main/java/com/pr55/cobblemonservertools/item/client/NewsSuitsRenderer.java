package com.pr55.cobblemonservertools.item.client;

import com.pr55.cobblemonservertools.item.custom.NewsSuittItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class NewsSuitsRenderer extends GeoArmorRenderer<NewsSuittItem> {
    public NewsSuitsRenderer(){
        super(new NewsSuitsModel());
    }
}
