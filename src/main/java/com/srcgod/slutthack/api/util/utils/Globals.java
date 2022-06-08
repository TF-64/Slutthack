package com.srcgod.slutthack.api.util.utils;

import com.srcgod.slutthack.api.clickgui.SettingsManager;
import com.srcgod.slutthack.impl.Slutt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

import java.util.Random;

public interface Globals {
    Minecraft mc = Minecraft.getMinecraft();
    Random random = new Random();
    ScaledResolution sr = new ScaledResolution(mc);
    SettingsManager setmgr = Slutt.instance.settingsManager;

    default boolean nullCheck(){
        return mc.player == null || mc.world == null;
    }
}
