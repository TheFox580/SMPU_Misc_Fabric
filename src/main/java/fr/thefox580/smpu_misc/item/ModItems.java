package fr.thefox580.smpu_misc.item;

import fr.thefox580.smpu_misc.Unity_Misc_Fabric;
import fr.thefox580.smpu_misc.item.custom.SuspiciousWhitePowder;
import fr.thefox580.smpu_misc.item.custom.WorkerHammerItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TRAIN_TICKET = registerItem("train_ticket", new Item(new FabricItemSettings()));
    public static final Item XP_PLUSH = registerItem("xp_plush", new Item(new FabricItemSettings()));
    public static final Item MERFFINN_PLUSH = registerItem("merffinn_plush", new Item(new FabricItemSettings()));

    public static final Item SUSPICIOUS_WHITE_POWDER = registerItem("suspicious_white_powder",
            new SuspiciousWhitePowder(new FabricItemSettings().food(ModFoods.SUSPICIOUS_WHITE_POWDER)));

    public static final Item WORRKER_HAMMER = registerItem("worker_hammer",
            new WorkerHammerItem(ToolMaterials.WOOD, 0, 0f, new FabricItemSettings()));

    public static final Item ENGLISH_WORKER_BITES = registerItem("english_worker_bites",
            new Item(new FabricItemSettings().food(ModFoods.WORKER_BITES)));

    public static final Item SPANISH_WORKER_BITES = registerItem("spanish_worker_bites",
            new Item(new FabricItemSettings().food(ModFoods.WORKER_BITES)));

    public static final Item PORTUGUESE_WORKER_BITES = registerItem("portuguese_worker_bites",
            new Item(new FabricItemSettings().food(ModFoods.WORKER_BITES)));

    public static final Item FRENCH_WORKER_BITES = registerItem("french_worker_bites",
            new Item(new FabricItemSettings().food(ModFoods.WORKER_BITES)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Unity_Misc_Fabric.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Unity_Misc_Fabric.LOGGER.info("Registering Mod Items for " + Unity_Misc_Fabric.MOD_ID);
    }
}
