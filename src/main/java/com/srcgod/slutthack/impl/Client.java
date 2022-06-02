package com.srcgod.slutthack.impl;

import com.srcgod.slutthack.api.handler.HandlerManager;
import com.srcgod.slutthack.api.module.ModuleManager;
import me.toster96.clickgui.ClickGuiScreen;
import org.lwjgl.opengl.Display;

import java.util.concurrent.CopyOnWriteArrayList;
import com.srcgod.slutthack.api.module.Module;


public class Client {
    public static String name = "Slutthack 0.1";
    public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<>();
    public static ClickGuiScreen clickGui;

    public static void startup() {
        Display.setTitle(name);

        ModuleManager.init();
        HandlerManager.init();
        clickGui = new ClickGuiScreen();
    }


    public static void keyPress(int key) {
        for (Module m : modules) if (m.getKey() == key) m.toggle();
    }
}