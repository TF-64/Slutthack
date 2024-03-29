package com.srcgod.slutthack.api.handler;

//import com.srcgod.slutthack.api.command.handler.handlers.UIHandler2;
import com.srcgod.slutthack.api.handler.handlers.KeyHandler;
import com.srcgod.slutthack.api.handler.handlers.UIHandler;
import net.minecraft.command.CommandHandler;
import net.minecraftforge.common.MinecraftForge;

public class HandlerManager {
    public static HandlerManager INSTANCE;

    public static void init() {
        register(new KeyHandler());
        register(new UIHandler());

    }

    private static void register(Object handler) {
        MinecraftForge.EVENT_BUS.register(handler);
    }
}
