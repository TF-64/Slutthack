package com.srcgod.slutthack.api.event;

import com.srcgod.slutthack.api.event.keys.key;
import com.srcgod.slutthack.api.event.ui.ui;
import net.minecraftforge.common.MinecraftForge;

public class EventManager {

    public static void init() {
        MinecraftForge.EVENT_BUS.register(new key());
        MinecraftForge.EVENT_BUS.register(new ui());
    }
}
