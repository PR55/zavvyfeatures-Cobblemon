package com.pr55.cobblemonservertools.sound;

import com.pr55.cobblemonservertools.Zavvyfeatures;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent EGG_USE = registerSoundEvent("egg_use");
    public static final SoundEvent EGG_DENY = registerSoundEvent("egg_deny");
    public static final SoundEvent EGG_READY = registerSoundEvent("egg_ready");

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = Identifier.of(Zavvyfeatures.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        Zavvyfeatures.LOGGER.info("Registering Sounds for " + Zavvyfeatures.MOD_ID + "!");
    }
}
