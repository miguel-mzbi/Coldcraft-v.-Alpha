package com.coldteam.coldcraft.client.render.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.coldteam.coldcraft.Main;

public final class ItemRenderRegister {

	public static void registerItemRenderer() {
	}

	//=========================================================================

	public static String modid = Main.MODID;

	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}