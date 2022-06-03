package com.srcgod.slutthack.impl.modules.movement;

import com.srcgod.slutthack.api.module.Module;
import com.srcgod.slutthack.api.util.utils.MessageUtil;
import org.lwjgl.input.Keyboard;

public class HighJump extends Module {
    public HighJump() {
        super("HightJump", Keyboard.KEY_NONE, Category.MOVEMENT);
    }

    @Override
    public void onEnable() {
        mc.player.motionY = 5;
        MessageUtil.sendMessage("ALAX AK BAR!");
        toggle();
    }
}
