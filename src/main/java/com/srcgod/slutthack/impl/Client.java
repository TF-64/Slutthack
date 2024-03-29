package com.srcgod.slutthack.impl;


import com.srcgod.slutthack.api.handler.HandlerManager;
import com.srcgod.slutthack.api.module.ModuleManager;
import org.lwjgl.opengl.Display;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import com.srcgod.slutthack.api.module.Module;


public class Client {
    public static String name = "Slutthack 1.7";
    public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<>();
//    public static  clickGui;

    public static void startup() {
        Display.setTitle(name);

        ModuleManager.init();
        HandlerManager.init();
    }

    public static ArrayList<Module> getModulesInCategory(Module.Category category) {
        ArrayList<Module> modulecat = new ArrayList<>();
        for(Module m : modules) if(m.getCategory().equals(category)) modulecat.add(m);
        return modulecat;
    }


    public static void keyPress(int key) {
        for (Module m : modules) if (m.getKey() == key) m.toggle();
    }
}