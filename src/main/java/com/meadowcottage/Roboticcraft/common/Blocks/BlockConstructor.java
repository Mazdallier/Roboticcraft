package com.meadowcottage.Roboticcraft.common.Blocks;

import com.meadowcottage.Roboticcraft.common.Reference.Names;
import com.meadowcottage.Roboticcraft.common.Reference.Textures;

public class BlockConstructor extends BlockRoboticcraft
{
	public BlockConstructor()
	{
		super();
		this.setBlockName(Names.Blocks.Constructor);
		this.setBlockTextureName(Textures.Blocks.ConstructorBlock);
		this.setStepSound(soundTypeMetal);
	}
}
