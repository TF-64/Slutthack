package com.srcgod.slutthack.impl.modules.movement;
import com.srcgod.slutthack.api.module.Module;
import org.lwjgl.input.Keyboard;


public class Fly extends Module {

    public Fly() {
        super("Fly", Keyboard.KEY_F, Category.MOVEMENT);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        mc.player.capabilities.allowFlying = true;
        mc.player.capabilities.isFlying = true;
    }
}
