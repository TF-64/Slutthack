package com.srcgod.slutthack.module.MOVEMENT;

import com.srcgod.slutthack.module.Module;
import org.lwjgl.input.Keyboard;

public class Sprint extends Module {
    public Sprint() {
        super("Sprint", Keyboard.KEY_R, Category.MOVEMENT);
    }

    @Override
    public void onEnable() {
        mc.player.setSprinting(true);
    }
}
