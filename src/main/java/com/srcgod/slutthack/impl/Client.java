package com.srcgod.slutthack.impl;

import com.srcgod.slutthack.api.handlers.HandlerManager;
import com.srcgod.slutthack.api.module.ModuleManager;
import org.lwjgl.opengl.Display;

import java.util.concurrent.CopyOnWriteArrayList;
import com.srcgod.slutthack.api.module.Module;


public class Client {
    public static String name = "Slutthack 0.1";
    public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<>();


    public static void startup() {
        Display.setTitle(name);

        ModuleManager.init();
        HandlerManager.init();
    }


    public static void keyPress(int key) {
        for (Module m : modules) if (m.getKey() == key) m.toggle();
    }
}

//чо?