package com.srcgod.slutthack;

import com.srcgod.slutthack.module.ModuleManager;
import org.lwjgl.opengl.Display;

import java.util.concurrent.CopyOnWriteArrayList;
import com.srcgod.slutthack.module.Module;


public class Client {
    public static String name = "Slutthack 0.1";
    public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<Module>();

    public static void startup() {
        Display.setTitle(name);

        ModuleManager.init();
    }


    public static void keyPress(int key) {
        for (Module m : modules) if (m.getKey() == key) m.toggle();
    }
}

//чо?