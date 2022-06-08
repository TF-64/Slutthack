package com.srcgod.slutthack.impl.modules.movement;

import com.srcgod.slutthack.api.module.Module;
import com.srcgod.slutthack.api.util.utils.MessageUtil;
import org.lwjgl.input.Keyboard;

public class Flyy extends Module {
    public Flyy() {

        super("Flyy", Keyboard.KEY_NONE, Module.Category.MOVEMENT);
    }

    @Override
    public void onEnable() {
        mc.player.capabilities.isFlying = true;

    }

    @Override
    public void onDisable() {
        mc.player.capabilities.isFlying = false;
    }
}

