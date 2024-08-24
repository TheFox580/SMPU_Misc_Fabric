package fr.thefox580.unity_misc.item.custom;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;

public class WorkerHammerItem extends SwordItem {

    public WorkerHammerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public Text getName(ItemStack stack) {

        if (stack.isEnchantable()){
            stack.addEnchantment(Enchantments.KNOCKBACK, 3);
        }

        return super.getName(stack);
    }
}
