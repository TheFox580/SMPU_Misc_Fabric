package fr.thefox580.unity_misc;

import fr.thefox580.unity_misc.item.ModItemGroups;
import fr.thefox580.unity_misc.item.ModItems;
import fr.thefox580.unity_misc.sounds.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Unity_Misc_Fabric implements ModInitializer {

    public static final String MOD_ID = "unity_misc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();

        ModSounds.registerSounds();

    }
}
