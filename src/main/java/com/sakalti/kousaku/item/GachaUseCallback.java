package com.sakalti.kousaku.item;

import com.sakalti.kousaku.registry.ItemRegistrypart1;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.item.ItemStack;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Random;

public class GachaUseCallback {
    public static void register() {
        UseItemCallback.EVENT.register((player, world, hand) -> {
            ItemStack stack = player.getStackInHand(hand);
            if (stack.getItem() == ItemRegistrypart1.GACHA && !world.isClient) {
                ItemStack[] options = {
                    new ItemStack(ItemRegistrypart1.BUHIN1),
                    new ItemStack(ItemRegistrypart1.BUHIN2),
                    new ItemStack(ItemRegistrypart1.BUHIN3),
                    new ItemStack(ItemRegistrypart1.BUHIN4),
                    new ItemStack(ItemRegistrypart1.BUHIN5)
                };
                ItemStack result = options[new Random().nextInt(options.length)];
                stack.decrement(1);
                player.dropItem(result, false);
                return TypedActionResult.success(stack, world.isClient);
            }
            return TypedActionResult.pass(stack);
        });
    }
}
