package com.srcgod.slutthack.api.handlers;

import com.srcgod.slutthack.api.handlers.keys.KeyHandler;
import com.srcgod.slutthack.api.handlers.ui.UIHandler;
import net.minecraftforge.common.MinecraftForge;

public class HandlerManager {

    public static void init() {
        MinecraftForge.EVENT_BUS.register(new KeyHandler());
        MinecraftForge.EVENT_BUS.register(new UIHandler());
        
    }
}
