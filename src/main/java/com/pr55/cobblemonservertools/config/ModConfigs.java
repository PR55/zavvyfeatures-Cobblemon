package com.pr55.cobblemonservertools.config;

import com.pr55.cobblemonservertools.Zavvyfeatures;
import com.pr55.cobblemonservertools.config.custom.GeneralConfig;
import eu.midnightdust.lib.config.MidnightConfig;

public class ModConfigs {

    public static void InitializeModConfigs(){
        Zavvyfeatures.LOGGER.info("Initalizing Configs for mod with an id of "+ Zavvyfeatures.MOD_ID);

        MidnightConfig.init(Zavvyfeatures.MOD_ID, GeneralConfig.class);
    }

}
