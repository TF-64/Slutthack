package com.srcgod.slutthack.api.module;

import com.srcgod.slutthack.impl.Client;
import com.srcgod.slutthack.impl.modules.combat.TriggerBot;
import com.srcgod.slutthack.impl.modules.movement.Fly;
import com.srcgod.slutthack.impl.modules.player.Blockreach;

public class ModuleManager {

    public static void init() {
        register(new Fly());
        register(new Blockreach());
        register(new TriggerBot());
    }

    private static void register(Module module) {
        Client.modules.add(module);
    }
}