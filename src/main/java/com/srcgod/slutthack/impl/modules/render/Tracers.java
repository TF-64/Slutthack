package com.srcgod.slutthack.impl.modules.render;

import com.srcgod.slutthack.api.module.Module;
import com.srcgod.slutthack.api.util.utils.RenderUtils;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

public class Tracers extends Module {

    public Tracers() {

        super("Tracers", Keyboard.KEY_NONE, Module.Category.RENDER);

    }

    @SubscribeEvent

    public void onRender(RenderWorldLastEvent e) {

        for (Entity playerEntity : mc.world.playerEntities) {

            if (playerEntity != null && playerEntity != mc.player) {

                RenderUtils.trace(mc, playerEntity, mc.getRenderPartialTicks(), 1);

            }

        }

    }

}
