package fr.thefox580.smpu_misc.sounds;

import fr.thefox580.smpu_misc.Unity_Misc_Fabric;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;


public class ModSounds {

    public static final SoundEvent SUSPICIOUS_WHITE_POWDER_SNIFF = registerSoundEvent("suspicious_white_powder_sniff");

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(Unity_Misc_Fabric.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        Unity_Misc_Fabric.LOGGER.info("Registering Sounds for " + Unity_Misc_Fabric.MOD_ID);
    }

}
