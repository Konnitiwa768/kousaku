package com.sakalti.kousaku;

import com.sakalti.kousaku.registry.ItemRegistrypart1;
import com.sakalti.kousaku.item.GachaUseCallback;
import net.fabricmc.api.ModInitializer;

public class KousakuMod implements ModInitializer {
    public static final String MOD_ID = "kousaku";

    @Override
    public void onInitialize() {
        ItemRegistrypart1.registerAll();
        GachaUseCallback.register();
    }
}
