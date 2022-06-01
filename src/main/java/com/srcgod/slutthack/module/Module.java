package com.srcgod.slutthack.module;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class Module {
    public String name;
    public boolean toggled;
    public int keyCode;
    public Category category;
    public Minecraft mc = Minecraft.getMinecraft();

    public Module(String name, int key, Category c) {
        this.name = name;
        keyCode = key;
        category = c;
    }



    public boolean isEnabled() {
        return toggled;
    }

    public int getKey(){
        return keyCode;
    }



    public void onEnable() {
        MinecraftForge.EVENT_BUS.register(this);
        toggled = true;
    }

    public void onDisable() {
        toggled = false;
    }

    public void setKey(int key) {
        keyCode = key;
    }

    public Category getCategory(){
        return category;
    }

    public String gatName(){
        return name;
    }




    public enum Category {
        COMBAT,
        MOVEMENT,
        PLAYER,
        RENDER,
        MISC,
        CLIENT,
        EXPLOIT;

    }

    public void setToggled(boolean toggled) {
        this.toggled = toggled;

        if(toggled) onEnable();
        else onDisable();
    }
    
    public void toggle() {
        setToggled(!toggled);
    }
}