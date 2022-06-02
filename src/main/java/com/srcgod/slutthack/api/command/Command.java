package com.srcgod.slutthack.api.command;

public abstract class Command {
    private final String name;
    private final String[] commands;

    public Command(String name) {
        this.name = name;
        commands = new String[]{""};
    }

    public Command(String name, String[] commands) {
        this.name = name;
        this.commands = commands;
    }

    public static String getCommandPrefix() {
        return CommandManager.INSTANCE.getPrefix();
    }

    public abstract void execute(String[] var1);

    public String getName() {
        return name;
    }

    public String[] getCommands() {
        return commands;
    }

}
