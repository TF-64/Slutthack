package com.srcgod.slutthack.api.command.handler.handlers;

import com.srcgod.slutthack.impl.Client;
import com.srcgod.slutthack.impl.Slutt;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;



public class KeyHandler {

    @SubscribeEvent
    public void onKey(InputEvent.KeyInputEvent event) {
        if(Keyboard.isKeyDown(Keyboard.getEventKey()) && Keyboard.getEventKey() != Keyboard.KEY_NONE)
            Client.keyPress(Keyboard.getEventKey());
        if (Keyboard.getEventKey() == Keyboard.KEY_RSHIFT) {
            Minecraft.getMinecraft().displayGuiScreen(Slutt.instance.clickGui);
        }
    }
}

