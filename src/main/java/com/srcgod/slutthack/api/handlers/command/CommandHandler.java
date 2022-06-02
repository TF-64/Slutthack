package com.srcgod.slutthack.api.handlers.command;

import com.srcgod.slutthack.api.util.Minecraftable;
import com.srcgod.slutthack.api.util.utils.MessageUtil;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.srcgod.slutthack.api.command.CommandManager;

public class CommandHandler implements Minecraftable {
    @SubscribeEvent
    public void onChat(ClientChatEvent event) {
        if (event.getMessage().startsWith(CommandManager.INSTANCE.getPrefix())) {
            try {
                mc.ingameGUI.getChatGUI().addToSentMessages(event.getMessage());
                if (event.getMessage().length() > 1) {
                    CommandManager.INSTANCE.executeCommand(event.getMessage().substring(CommandManager.INSTANCE.getPrefix().length() - 1));
                } else {
                    MessageUtil.sendMessage("Invalid command.");
                }
            } catch (Exception ignored) {
            }
            event.setCanceled(true);
        }
    }
}
