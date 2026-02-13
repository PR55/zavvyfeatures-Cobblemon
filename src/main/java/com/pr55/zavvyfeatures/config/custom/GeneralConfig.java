package com.pr55.zavvyfeatures.config.custom;

import eu.midnightdust.lib.config.MidnightConfig;
import org.apache.commons.compress.utils.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneralConfig extends MidnightConfig {
    public static final String EGG_TIMERS = "timers";
    public static final String EVENT_SCHEDULER = "events";

    @Comment(category = EGG_TIMERS, centered = true)public static Comment text1;
    @Entry(category = EGG_TIMERS, name = "Common Egg Timer")public static int commonEgg = 3600;
    @Entry(category = EGG_TIMERS, name = "Common Egg Shiny Rate", isSlider = true, max = 8192, min=2)public static int commonEggRate = 128;
    @Entry(category = EGG_TIMERS, name = "Uncommon Egg Timer")public static int uncommonEgg = 7200;
    @Entry(category = EGG_TIMERS, name = "Uncommon Egg Shiny Rate", isSlider = true, max = 8192, min=2)public static int uncommonEggRate = 98;
    @Entry(category = EGG_TIMERS, name = "Rare Egg Timer")public static int rareEgg = 14400;
    @Entry(category = EGG_TIMERS, name = "Rare Egg Shiny Rate", isSlider = true, max = 8192, min=2)public static int rareEggRate = 64;
    @Entry(category = EGG_TIMERS, name = "Epic Egg Timer")public static int epicEgg = 28800;
    @Entry(category = EGG_TIMERS, name = "Epic Egg Shiny Rate", isSlider = true, max = 8192, min=2)public static int epicEggRate = 48;
    @Entry(category = EGG_TIMERS, name = "Legendary Egg Timer")public static int legendaryEgg = 57600;
    @Entry(category = EGG_TIMERS, name = "Legendary Egg Shiny Rate", isSlider = true, max = 8192, min=2)public static int legendaryEggRate = 32;
    @Entry(category = EGG_TIMERS, name = "Baby Eggs Timer")public static int babyEgg = 14400;
    @Entry(category = EGG_TIMERS, name = "Baby Eggs Shiny Rate", isSlider = true, max = 8192, min=2)public static int babyEggRate = 64;



    @Comment(category = EVENT_SCHEDULER)public static Comment text2;
    @Entry(category = EVENT_SCHEDULER, name = "Events Timezone")public static timezoneEnum text3 = timezoneEnum.EST;
    @Entry(category = EVENT_SCHEDULER, name = "Event Name") public static List<String> eventTitle = Arrays.asList("Server Opening Battle Tournament","Server Closing battle Tournament");
    @Entry(category = EVENT_SCHEDULER, name = "Event Date (MM-DD-YYYY )") public static List<String> eventDate = Arrays.asList("02-28-2026 22:00:00","04-01-2026 17:30:55");
    @Entry(category = EVENT_SCHEDULER, name = "Event Location ('x y z')") public static List<String> eventLocation = Arrays.asList("0 0 0","0 0 0");
    public enum timezoneEnum{
        GMT,EST,CST,PST,JST
    }


}
