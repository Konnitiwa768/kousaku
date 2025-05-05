package com.sakalti.kousaku.registry;

import com.sakalti.kousaku.KousakuMod;
import com.sakalti.kousaku.item.CardboardWhip;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistrypart1 {

    public static final Item BUHIN1 = register("buhin1", new Item(new Item.Settings()));
    public static final Item BUHIN2 = register("buhin2", new Item(new Item.Settings()));
    public static final Item BUHIN3 = register("buhin3", new Item(new Item.Settings()));
    public static final Item BUHIN4 = register("buhin4", new Item(new Item.Settings()));
    public static final Item BUHIN5 = register("buhin5", new Item(new Item.Settings()));

    public static final Item DANBORU_WHIP = register("danboru_whip", new CardboardWhip());
    public static final Item POLE_PICKAXE = register(pole_pickaxe", new PolePickaxe());
    public static final Item GACHA = register("buhin_gacha", new Item(new Item.Settings().maxCount(1)));

    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(KousakuMod.MOD_ID, name), item);
    }

    public static void registerAll() {
        // 呼び出し用
    }
}
