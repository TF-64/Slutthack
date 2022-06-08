package com.srcgod.slutthack.api.util.utils;

import com.srcgod.slutthack.api.util.Minecraftable;
import com.mojang.realmsclient.gui.ChatFormatting;
import com.srcgod.slutthack.impl.Client;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.event.HoverEvent;

public class MessageUtil implements Minecraftable {
    public static MessageUtil INSTANCE;

    public static void sendMessage(String msg) {
        sendClientMessage("[" + ChatFormatting.LIGHT_PURPLE + Client.name + ChatFormatting.WHITE + "] " + msg);
    }

    public static void sendClientMessage(String message) {
        if (mc.player != null) {
//            mc.player.sendChatMessage(message);
        }
    }
}
