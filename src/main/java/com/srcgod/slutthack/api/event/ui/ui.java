package com.srcgod.slutthack.api.event.ui;

import com.srcgod.slutthack.impl.Client;
import com.srcgod.slutthack.api.module.Module;
import com.srcgod.slutthack.impl.Slutt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.text.TextFormatting;

//public class ui кайф
//        @SubscribeEvent
//    public void onRender(RenderGameOverlayEvent.Post e) {
//        Minecraft mc = Minecraft.getMinecraft();
//    }
//}


public class ui {
    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent.Post e) {
        if (e.getType() == RenderGameOverlayEvent.ElementType.TEXT) {
            Minecraft mc = Minecraft.getMinecraft();
            FontRenderer fr = mc.fontRenderer;
            ScaledResolution sr = new ScaledResolution(mc);
            int y = 10;

            fr.drawString(TextFormatting.LIGHT_PURPLE + "Slutt" + TextFormatting.WHITE + " hack " + Slutt.VERSION, 5, 5, -1);

            for (Module m : Client.modules) if (m.isEnabled()) {
                    fr.drawStringWithShadow(m.name, sr.getScaledWidth() - 4 - fr.getStringWidth(m.name), y, -1);
                    y += 10;
                }
        }
    }
}