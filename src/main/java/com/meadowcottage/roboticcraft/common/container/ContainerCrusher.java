package com.meadowcottage.roboticcraft.common.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

import com.meadowcottage.roboticcraft.common.tile.TileEntityCrusher;

public class ContainerCrusher extends Container
{
	TileEntityCrusher tileent;

	public ContainerCrusher(InventoryPlayer player, TileEntityCrusher tile)
	{
		this.tileent = tile;

		this.addSlotToContainer(new Slot(tile, 0, 98, 22));

		int var3;

		for (var3 = 0; var3 < 3; ++var3)
			for (int var4 = 0; var4 < 9; ++var4)
				this.addSlotToContainer(new Slot(player, var4 + (var3 * 9) + 9, 8 + (var4 * 18), 84 + (var3 * 18)));

		for (var3 = 0; var3 < 9; ++var3)
			this.addSlotToContainer(new Slot(player, var3, 8 + (var3 * 18), 142));
	}

	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return true;
	}

}
