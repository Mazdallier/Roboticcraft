package com.meadowcottage.roboticcraft.common.blocks;

import com.meadowcottage.roboticcraft.common.reference.Names;
import com.meadowcottage.roboticcraft.common.reference.Textures;

public class BlockController extends BlockRoboticcraft
{
	public BlockController()
	{
		super();
		this.setBlockName(Names.Blocks.Controller);
		this.setBlockTextureName(Textures.Blocks.ControllerBlock);
		this.setStepSound(soundTypeMetal);
		this.setHardness(2.0F);
		this.setResistance(2.0F);
		this.setHarvestLevel("pickaxe", 2);
	}
}
