package com.sakalti.kousaku.item;

import com.sakalti.kousaku.registry.ItemRegistrypart1;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;

public class CardboardWhip extends SwordItem {

    public static final ToolMaterial CARDBOARD_MATERIAL = new ToolMaterial() {
        @Override
        public int getDurability() {
            return 2048; // 耐久値
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 1.0f;
        }

        @Override
        public float getAttackDamage() {
            return 5.0f;
        }

        @Override
        public int getMiningLevel() {
            return 0;
        }

        @Override
        public int getEnchantability() {
            return 10;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(ItemRegistrypart1.BUHIN5);
        }
    };

    public CardboardWhip() {
        super(CARDBOARD_MATERIAL, 4, -1.5f, new Item.Settings());
    }
}
