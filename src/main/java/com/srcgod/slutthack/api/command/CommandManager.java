package com.srcgod.slutthack.api.command;

import com.srcgod.slutthack.api.util.Minecraftable;
import com.srcgod.slutthack.api.util.utils.MessageUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CommandManager implements Minecraftable {

    public static void init() {

    }

    private static void register(Object command) {
        commands.add((Command) command);
    }

    public static CommandManager INSTANCE;

    private static final List<Command> commands = new ArrayList<>();
    private String clientMessage = "Aurora";
    private String prefix = ";";

    public static String[] removeElement(String[] input, int indexToDelete) {
        LinkedList<String> result = new LinkedList<>();
        for (int i = 0; i < input.length; ++i) {
            if (i == indexToDelete) continue;
            result.add(input[i]);
        }
        return result.toArray(input);
    }

    private static String strip(String str, String key) {
        if (str.startsWith(key) && str.endsWith(key)) {
            return str.substring(key.length(), str.length() - key.length());
        }
        return str;
    }

    public void executeCommand(String command) {
        String[] parts = command.split(" (?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        String name = parts[0].substring(1);
        String[] args = CommandManager.removeElement(parts, 0);
        for (int i = 0; i < args.length; ++i) {
            if (args[i] == null) continue;
            args[i] = CommandManager.strip(args[i], "\"");
        }
        for (Command c : commands) {
            if (!c.getName().equalsIgnoreCase(name)) continue;
            c.execute(parts);
            return;
        }
        MessageUtil.sendMessage("Unknown command. try " + prefix + "help for a list of commands.");
    }

    public Command getCommandByName(String name) {
        for (Command command : commands) {
            if (!command.getName().equals(name)) continue;
            return command;
        }
        return null;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public String getClientMessage() {
        return clientMessage;
    }

    public void setClientMessage(String clientMessage) {
        this.clientMessage = clientMessage;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }


}
