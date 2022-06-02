package com.srcgod.slutthack.module;

import com.srcgod.slutthack.Client;
import com.srcgod.slutthack.module.movement.Fly;

public class ModuleManager {

    public static void init() {
        Client.modules.add(new Fly());

    }
}