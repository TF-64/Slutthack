package com.srcgod.slutthack.impl.modules.movement;

import com.srcgod.slutthack.api.module.Module;
import org.lwjgl.input.Keyboard;

public class Sprint extends Module {
    public Sprint() {
        super("Sprint", Keyboard.KEY_NONE, Category.MOVEMENT);
    }

    @Override
    public void onEnable() {
        mc.player.setSprinting(true);
    }
}
