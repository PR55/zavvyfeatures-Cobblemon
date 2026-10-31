package com.pr55.cobblemonservertools.config.custom;

import eu.midnightdust.lib.config.MidnightConfig;

import java.util.Arrays;
import java.util.List;

public class MixinConfig extends MidnightConfig {
    public static final String PORTAL_CONTROLS = "portal_controls";

    @Comment(category = PORTAL_CONTROLS)public static Comment text4;
    @Entry(category = PORTAL_CONTROLS) public static boolean toggleEndPortal = true;

}
