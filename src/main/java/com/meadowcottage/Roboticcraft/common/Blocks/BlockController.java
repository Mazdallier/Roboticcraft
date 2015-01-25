package com.meadowcottage.Roboticcraft.common.Blocks;

import com.meadowcottage.Roboticcraft.common.Reference.Names;
import com.meadowcottage.Roboticcraft.common.Reference.Textures;

public class BlockController extends BlockRoboticcraft
{
	public BlockController()
	{
		super();
		this.setBlockName(Names.Blocks.Controller);
		this.setBlockTextureName(Textures.Blocks.ControllerBlock);
		this.setStepSound(soundTypeMetal);
	}
}
