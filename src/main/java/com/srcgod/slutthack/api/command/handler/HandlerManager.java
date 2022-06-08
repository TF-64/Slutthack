package com.srcgod.slutthack.api.command.handler;


import com.srcgod.slutthack.api.command.handler.handlers.KeyHandler;
//import com.srcgod.slutthack.api.command.handler.handlers.UIHandler2;
import net.minecraftforge.common.MinecraftForge;

public class HandlerManager {
    public static HandlerManager INSTANCE;

    public static void init() {
        register(new KeyHandler());
        //register(new UIHandler2());
        //register(new CommandHandler());

    }

    private static void register(Object handler) {
        MinecraftForge.EVENT_BUS.register(handler);
    }
}
