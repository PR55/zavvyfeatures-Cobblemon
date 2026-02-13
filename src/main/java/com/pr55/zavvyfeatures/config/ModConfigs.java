package com.pr55.zavvyfeatures.config;

import com.pr55.zavvyfeatures.Zavvyfeatures;
import com.pr55.zavvyfeatures.config.custom.GeneralConfig;
import eu.midnightdust.lib.config.MidnightConfig;

public class ModConfigs {

    public static void InitializeModConfigs(){
        Zavvyfeatures.LOGGER.info("Initalizing Configs for mod with an id of "+ Zavvyfeatures.MOD_ID);

        MidnightConfig.init(Zavvyfeatures.MOD_ID, GeneralConfig.class);
    }

}
