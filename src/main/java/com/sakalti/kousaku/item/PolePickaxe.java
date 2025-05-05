package com.sakalti.kousaku.item;

import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;

public class PolePickaxe extends PickaxeItem {
    public static final ToolMaterial POLE_MATERIAL = new ToolMaterial() {
        @Override public int getDurability() { return 320; }
        @Override public float getMiningSpeedMultiplier() { return 5f; }
        @Override public float getAttackDamage() { return 2f; }
        @Override public int getMiningLevel() { return 3; } // ダイヤ相当
        @Override public int getEnchantability() { return 12; }
        @Override public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.Buhin1); // 任意素材
        }
    };

    public PolePickaxe() {
        super(POLE_MATERIAL, 5, -2.1f, new Item.Settings()); // 攻撃力7 = base + 2, 速度0.9
    }
}
