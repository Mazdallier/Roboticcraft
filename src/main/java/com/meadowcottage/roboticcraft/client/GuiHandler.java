package com.meadowcottage.roboticcraft.client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.meadowcottage.roboticcraft.client.gui.GuiCrusher;
import com.meadowcottage.roboticcraft.common.container.ContainerCrusher;
import com.meadowcottage.roboticcraft.common.tile.TileEntityCrusher;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		final TileEntity tile = world.getTileEntity(x, y, z);

		switch (ID)
		{
		case GuiIDs.CRUSHER:
			return new ContainerCrusher(player.inventory, (TileEntityCrusher) tile);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		final TileEntity tile = world.getTileEntity(x, y, z);

		switch (ID)
		{
		case GuiIDs.CRUSHER:
			return new GuiCrusher(player.inventory, (TileEntityCrusher) tile);
		}
		return null;
	}

}
