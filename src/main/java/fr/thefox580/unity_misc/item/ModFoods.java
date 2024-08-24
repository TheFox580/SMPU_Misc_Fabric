package fr.thefox580.unity_misc.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoods {

    public static final FoodComponent WORKER_BITES = new FoodComponent.Builder().hunger(4)
            .saturationModifier(1.2F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200), 1f).build();

    public static final FoodComponent SUSPICIOUS_WHITE_POWDER = new FoodComponent.Builder().hunger(2)
            .saturationModifier(5F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100,3), 1f).build();

}
