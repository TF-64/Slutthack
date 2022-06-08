package com.srcgod.slutthack.impl.modules.movement;

import com.srcgod.slutthack.api.module.Module;
import com.srcgod.slutthack.api.util.utils.MessageUtil;
import org.lwjgl.input.Keyboard;

public class Spriint extends Module {
    public Spriint() {
        super("Spriint", Keyboard.KEY_NONE, Module.Category.MOVEMENT);
    }

    @Override
    public void onEnable() {
        mc.player.setSprinting(true);
        MessageUtil.sendMessage("Sprint onEnable");
    }

    @Override
    public void onDisable() {
        mc.player.setSprinting(false);
    }
}
