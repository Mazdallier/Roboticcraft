package com.meadowcottage.roboticcraft.common.blocks;

import com.meadowcottage.roboticcraft.common.reference.Names;
import com.meadowcottage.roboticcraft.common.reference.Textures;

public class BlockCopper extends BlockRoboticcraft
{
	public BlockCopper()
	{
		super();
		this.setBlockName(Names.Blocks.CopperBlock);
		this.setBlockTextureName(Textures.Blocks.CopperBlock);
		this.setStepSound(soundTypeMetal);
	}
}
