package com.meadowcottage.roboticcraft.common.blocks.ore;

import com.meadowcottage.roboticcraft.common.blocks.BlockRoboticcraftOre;
import com.meadowcottage.roboticcraft.common.reference.Names;
import com.meadowcottage.roboticcraft.common.reference.Textures;

public class BlockSilverOre extends BlockRoboticcraftOre
{
	public BlockSilverOre()
	{
		super();
		this.setBlockName(Names.Ores.SilverOre);
		this.setBlockTextureName(Textures.Ores.SilverOre);
		this.setStepSound(soundTypeMetal);
		this.setHardness(3.0F);
		this.setResistance(3.0F);
		this.setHarvestLevel("pickaxe", 2);
	}
}
