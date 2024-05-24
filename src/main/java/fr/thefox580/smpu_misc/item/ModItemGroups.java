package fr.thefox580.smpu_misc.item;

import fr.thefox580.smpu_misc.SMPU_Misc_Fabric;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SMPU_MISC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SMPU_Misc_Fabric.MOD_ID, "smpu_misc"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.smpu_misc"))
                    .icon(() -> new ItemStack(ModItems.ENGLISH_WORKER_BITES)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CERDU_PLUSH);
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
        SMPU_Misc_Fabric.LOGGER.info("Registering Item Groups for " + SMPU_Misc_Fabric.MOD_ID);
    }

}
