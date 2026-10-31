package com.pr55.cobblemonservertools.config.custom;

import eu.midnightdust.lib.config.MidnightConfig;

import java.util.Arrays;
import java.util.List;

public class GeneralConfig extends MidnightConfig {
    public static final String EGG_TIMERS = "timers";

    @Comment(category = EGG_TIMERS, centered = true)public static Comment text1;
    @Entry(category = EGG_TIMERS, name = "Common Egg Timer")public static int commonEgg = 3600;
    @Entry(category = EGG_TIMERS, name = "Common Egg Shiny Rate", isSlider = true, max = 8192, min=2)public static int commonEggRate = 128;
    @Entry(category = EGG_TIMERS, name = "Uncommon Egg Timer")public static int uncommonEgg = 7200;
    @Entry(category = EGG_TIMERS, name = "Uncommon Egg Shiny Rate", isSlider = true, max = 8192, min=2)public static int uncommonEggRate = 98;
    @Entry(category = EGG_TIMERS, name = "Rare Egg Timer")public static int rareEgg = 20;
    @Entry(category = EGG_TIMERS, name = "Rare Egg Shiny Rate", isSlider = true, max = 8192, min=2)public static int rareEggRate = 64;
    @Entry(category = EGG_TIMERS, name = "Epic Egg Timer")public static int epicEgg = 28800;
    @Entry(category = EGG_TIMERS, name = "Epic Egg Shiny Rate", isSlider = true, max = 8192, min=2)public static int epicEggRate = 48;
    @Entry(category = EGG_TIMERS, name = "Legendary Egg Timer")public static int legendaryEgg = 57600;
    @Entry(category = EGG_TIMERS, name = "Legendary Egg Shiny Rate", isSlider = true, max = 8192, min=2)public static int legendaryEggRate = 32;
    @Entry(category = EGG_TIMERS, name = "Baby Eggs Timer")public static int babyEgg = 14400;
    @Entry(category = EGG_TIMERS, name = "Baby Eggs Shiny Rate", isSlider = true, max = 8192, min=2)public static int babyEggRate = 64;
}
