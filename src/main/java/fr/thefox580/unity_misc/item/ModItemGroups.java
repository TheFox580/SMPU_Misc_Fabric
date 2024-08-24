package fr.thefox580.unity_misc.item;

import fr.thefox580.unity_misc.Unity_Misc_Fabric;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup UNITY_MISC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Unity_Misc_Fabric.MOD_ID, "unity_misc"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.unity_misc"))
                    .icon(() -> new ItemStack(ModItems.ENGLISH_WORKER_BITES)).entries((displayContext, entries) -> {
                        entries.add(ModItems.XP_PLUSH);
                        entries.add(ModItems.MERFFINN_PLUSH);

                        entries.add(ModItems.TRAIN_TICKET);

                        entries.add(ModItems.SUSPICIOUS_WHITE_POWDER);
                        entries.add(ModItems.WORRKER_HAMMER);

                        entries.add(ModItems.ENGLISH_WORKER_BITES);
                        entries.add(ModItems.SPANISH_WORKER_BITES);
                        entries.add(ModItems.PORTUGUESE_WORKER_BITES);
                        entries.add(ModItems.FRENCH_WORKER_BITES);
                    }).build());

    public static void registerItemGroups(){
        Unity_Misc_Fabric.LOGGER.info("Registering Item Groups for " + Unity_Misc_Fabric.MOD_ID);
    }

}
