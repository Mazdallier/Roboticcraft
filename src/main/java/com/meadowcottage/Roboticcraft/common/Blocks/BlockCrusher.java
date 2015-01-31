package com.meadowcottage.roboticcraft.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.meadowcottage.roboticcraft.client.GuiIDs;
import com.meadowcottage.roboticcraft.common.Roboticcraft;
import com.meadowcottage.roboticcraft.common.reference.Names;
import com.meadowcottage.roboticcraft.common.reference.Textures;
import com.meadowcottage.roboticcraft.common.tile.TileEntityCrusher;

public class BlockCrusher extends BlockRoboticcraftContainer
{

	public BlockCrusher(Material material)
	{
		super(material);
		this.setBlockName(Names.Blocks.Crusher);
		this.setBlockTextureName(Textures.Blocks.CrusherBlock);
		this.setStepSound(soundTypeMetal);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int p_149915_2_)
	{
		return new TileEntityCrusher();
	}

	@Override
	public boolean onBlockActivated(World world, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9)
	{
		if (world.isRemote)
			return true;
		else
		{
			TileEntityCrusher tile = (TileEntityCrusher) world.getTileEntity(par2, par3, par4);

			if ((tile == null) || player.isSneaking())
				return false;

			player.openGui(Roboticcraft.instance, GuiIDs.CRUSHER, world, par2, par3, par4);
			return true;
		}
	}
}
