package com.srcgod.slutthack.api.module;

import com.srcgod.slutthack.impl.Client;
import com.srcgod.slutthack.impl.modules.movement.Fly;

public class ModuleManager {

    public static void init() {
        register(new Fly());
    }

    private static void register(Module module) {
        Client.modules.add(module);
    }
}