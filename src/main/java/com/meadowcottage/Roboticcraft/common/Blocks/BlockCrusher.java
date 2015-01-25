package com.meadowcottage.Roboticcraft.common.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.meadowcottage.Roboticcraft.common.Reference.Names;
import com.meadowcottage.Roboticcraft.common.Reference.Textures;
import com.meadowcottage.Roboticcraft.common.tile.TileEntityCrusher;

public class BlockCrusher extends BlockRoboticcraftContainer
{

	public BlockCrusher(Material p_i45394_1_)
	{
		super(p_i45394_1_);
		this.setBlockName(Names.Blocks.Crusher);
		this.setBlockTextureName(Textures.Blocks.CrusherBlock);
		this.setStepSound(soundTypeMetal);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
	{
		return new TileEntityCrusher();
	}
}
