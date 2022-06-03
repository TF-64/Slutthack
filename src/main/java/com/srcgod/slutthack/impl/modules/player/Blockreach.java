package com.srcgod.slutthack.impl.modules.player;

import com.srcgod.slutthack.api.clickgui.Setting;
import com.srcgod.slutthack.api.module.Module;
import com.srcgod.slutthack.impl.Slutt;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.input.Keyboard;

import java.util.ArrayList;

public class Blockreach extends Module {

    public Blockreach() {

        super("BlockReach", Keyboard.KEY_NONE, Module.Category.PLAYER);


        Slutt.instance.settingsManager.rSetting(new Setting("Range", this, 1, 0.1, 4.0, false));
    }

    public void onEnable() {
        double range = Slutt.instance.settingsManager.getSettingByName(this.name, "Range").getValDouble();

        EntityPlayer player = mc.player;

        IAttributeInstance setBlockReachDi = player.getEntityAttribute(EntityPlayer.REACH_DISTANCE);

        player.getEntityAttribute(EntityPlayer.REACH_DISTANCE).applyModifier(new AttributeModifier(player.getUniqueID(), "custom_reach", 0.5F, 1));

    }

    @Override

    public void onDisable() {

        mc.player.getEntityAttribute(EntityPlayer.REACH_DISTANCE).removeModifier(mc.player.getUniqueID());

    }

}
