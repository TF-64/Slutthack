package com.srcgod.slutthack.api.module;

import com.srcgod.slutthack.impl.Client;
import com.srcgod.slutthack.impl.modules.combat.KillAura;
import com.srcgod.slutthack.impl.modules.combat.TriggerBot;
import com.srcgod.slutthack.impl.modules.movement.*;
import com.srcgod.slutthack.impl.modules.player.Blockreach;
import com.srcgod.slutthack.impl.modules.player.FakeCreative;
import com.srcgod.slutthack.impl.modules.render.GlowESP;
import com.srcgod.slutthack.impl.modules.render.Tracers;
import com.srcgod.slutthack.impl.modules.movement.*;

public class ModuleManager {

    public static void init() {
        register(new Fly());
        register(new Sprint());
        register(new Blockreach());
        register(new TriggerBot());
        register(new GlowESP());
        register(new Tracers());
        register(new FakeCreative());
        register(new KillAura());
        register(new Jesus());
        register(new Speed());
        register(new HighJump());
    }

    private static void register(Module module) {
        Client.modules.add(module);
    }
}