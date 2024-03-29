package com.srcgod.slutthack.impl;

import club.minnced.discord.rpc.*;
import com.srcgod.slutthack.api.util.utils.Globals;
import com.srcgod.slutthack.impl.modules.client.ModuleDiscordPresence;
import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRichPresence;
import net.minecraft.client.Minecraft;

import static com.srcgod.slutthack.api.util.Minecraftable.mc;

public class RPC {
    public static String discordID = "983782220584062996";
    public static DiscordRichPresence discordRichPresence = new DiscordRichPresence();
    public static DiscordRPC discordRPC = DiscordRPC.INSTANCE;
    public static String clientVersion = Slutt.NAME + Slutt.VERSION;

    public static void startRPC() {
        String server2 = Minecraft.getMinecraft().isSingleplayer() ? "singleplayer"
                : Minecraft.getMinecraft().getCurrentServerData().serverIP;
        DiscordEventHandlers eventHandlers = new DiscordEventHandlers();
        eventHandlers.disconnected = RPC::lambda$startRPC$0;
        discordRPC.Discord_Initialize(discordID, eventHandlers, true, null);
        RPC.discordRichPresence.startTimestamp = System.currentTimeMillis() / ((long)-2121370231 ^ 0xFFFFFFFF818E7661L);
        RPC.discordRichPresence.details = Minecraft.getMinecraft().getSession().getUsername() + " | " + server2;
        RPC.discordRichPresence.largeImageKey = "slutt";
        RPC.discordRichPresence.largeImageText = "Slutt" + 0.1;
        RPC.discordRichPresence.state = null;
        discordRPC.Discord_UpdatePresence(discordRichPresence);
    }

    public static void stopRPC() {
        discordRPC.Discord_Shutdown();
        discordRPC.Discord_ClearPresence();
    }

    public static void lambda$startRPC$0(final int var1, final String var2) {
        System.out.println("Discord RPC disconnected, var1: " + var1 + ", var2: " + var2);
    }
}