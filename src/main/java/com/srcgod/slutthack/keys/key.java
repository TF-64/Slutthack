package com.srcgod.slutthack.keys;

import com.srcgod.slutthack.Client;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;



public class key {

    @SubscribeEvent
    public void onKey(InputEvent.KeyInputEvent event) {
        if(Keyboard.isKeyDown(Keyboard.getEventKey()) && Keyboard.getEventKey() != Keyboard.KEY_NONE)
            Client.keyPress(Keyboard.getEventKey());
    }
}

