package fr.thefox580.unity_misc.item.custom;

import fr.thefox580.unity_misc.sounds.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;

public class SuspiciousWhitePowder extends Item {
    public SuspiciousWhitePowder(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        if(!context.getWorld().isClient){
            context.getWorld().playSound(null, context.getBlockPos(), ModSounds.SUSPICIOUS_WHITE_POWDER_SNIFF, SoundCategory.BLOCKS, 1f, 1f);

        }

        return ActionResult.SUCCESS;
    }
}
