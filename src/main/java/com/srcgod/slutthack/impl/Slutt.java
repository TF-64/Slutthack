package com.srcgod.slutthack.impl;

import com.srcgod.slutthack.api.clickgui.ClickGuiManager;
import com.srcgod.slutthack.api.clickgui.SettingsManager;
import com.srcgod.slutthack.api.menu.OnGuiOpenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

@Mod(modid = Slutt.MODID, name = Slutt.NAME, version = Slutt.VERSION)
public class Slutt extends SettingsManager
{
    public static final String MODID = "slut";
    public static final String NAME = "Slutthack";
    public static final String VERSION = "0.1";

    public static Slutt instance;
    public SettingsManager settingsManager;
    public ClickGuiManager clickGui;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Display.setTitle("Loading " + Client.name);
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        clickGui= new ClickGuiManager();
        settingsManager = new SettingsManager();
        instance = this;
        settingsManager = new SettingsManager();

        Client.startup();
        MinecraftForge.EVENT_BUS.register(new OnGuiOpenEvent());

    }




}
//;3
