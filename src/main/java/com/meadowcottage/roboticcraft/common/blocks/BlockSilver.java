package com.meadowcottage.roboticcraft.common.blocks;

import com.meadowcottage.roboticcraft.common.reference.Names;
import com.meadowcottage.roboticcraft.common.reference.Textures;

public class BlockSilver extends BlockRoboticcraft
{
	public BlockSilver()
	{
		super();
		this.setBlockName(Names.Blocks.SilverBlock);
		this.setBlockTextureName(Textures.Blocks.SilverBlock);
		this.setStepSound(soundTypeMetal);
		this.setHardness(2.0F);
		this.setResistance(2.0F);
		this.setHarvestLevel("pickaxe", 2);
	}
}
