package com.meadowcottage.roboticcraft.common.blocks;

import com.meadowcottage.roboticcraft.common.reference.Names;
import com.meadowcottage.roboticcraft.common.reference.Textures;

public class BlockSteel extends BlockRoboticcraft
{
	public BlockSteel()
	{
		super();
		this.setBlockName(Names.Blocks.SteelBlock);
		this.setBlockTextureName(Textures.Blocks.SteelBlock);
		this.setStepSound(soundTypeMetal);
	}
}
