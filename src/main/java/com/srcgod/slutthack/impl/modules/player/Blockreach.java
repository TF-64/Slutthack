package com.srcgod.slutthack.impl.modules.player;

import com.srcgod.slutthack.api.module.Module;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.input.Keyboard;

public class Blockreach extends Module {

    public Blockreach() {

        super("BlockReach", Keyboard.KEY_NONE, Module.Category.PLAYER);

    }

    public void onEnable() {

        EntityPlayer player = mc.player;

        IAttributeInstance setBlockReachDi = player.getEntityAttribute(EntityPlayer.REACH_DISTANCE);

        player.getEntityAttribute(EntityPlayer.REACH_DISTANCE).applyModifier(new AttributeModifier(player.getUniqueID(), "custom_reach", 0.5F, 1));

    }

    @Override

    public void onDisable() {

        mc.player.getEntityAttribute(EntityPlayer.REACH_DISTANCE).removeModifier(mc.player.getUniqueID());

    }

}
