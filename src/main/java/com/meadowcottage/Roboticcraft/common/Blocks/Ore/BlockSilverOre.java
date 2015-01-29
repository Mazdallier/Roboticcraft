package com.meadowcottage.Roboticcraft.common.Blocks.Ore;

import com.meadowcottage.Roboticcraft.common.Blocks.BlockRoboticcraftOre;
import com.meadowcottage.Roboticcraft.common.Reference.Names;
import com.meadowcottage.Roboticcraft.common.Reference.Textures;

public class BlockSilverOre extends BlockRoboticcraftOre
{
    public BlockSilverOre()
    {
        super();
        this.setBlockName(Names.Ores.SilverOre);
        this.setBlockTextureName(Textures.Ores.SilverOre);
        this.setStepSound(soundTypeMetal);
    }
}
