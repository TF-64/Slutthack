package com.srcgod.slutthack.impl;

import com.srcgod.slutthack.api.command.handler.HandlerManager;
import com.srcgod.slutthack.api.font.FontUtils;
import com.srcgod.slutthack.api.module.ModuleManager;
import com.srcgod.slutthack.api.gui.ClickGuiScreen;
import net.minecraft.util.text.TextFormatting;
import org.lwjgl.opengl.Display;

import java.util.concurrent.CopyOnWriteArrayList;
import com.srcgod.slutthack.api.module.Module;


public class Client {
    public static String name = "Slutthack 0.1";
    public static String cName = TextFormatting.LIGHT_PURPLE + "Slutt" + TextFormatting.WHITE + "hack" + TextFormatting.WHITE + Slutt.VERSION;
    public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<>();
    public static ClickGuiScreen clickGui;

    public static void startup() {
        Display.setTitle(name);

        ModuleManager.init();
        HandlerManager.init();
        clickGui = new ClickGuiScreen();

        FontUtils.bootstrap();
    }


    public static void keyPress(int key) {
        for (Module m : modules) if (m.getKey() == key) m.toggle();
    }
}