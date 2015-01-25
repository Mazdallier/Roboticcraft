package com.meadowcottage.Roboticcraft.Blocks.Ore;

import com.meadowcottage.Roboticcraft.Blocks.BlockRoboticcraft;
import com.meadowcottage.Roboticcraft.Reference.Names;
import com.meadowcottage.Roboticcraft.Reference.Textures;

public class BlockSilverOre extends BlockRoboticcraft
{
    public BlockSilverOre()
    {
        super();
        this.setBlockName(Names.Ores.SilverOre);
        this.setBlockTextureName(Textures.Ores.SilverOre);
        this.setStepSound(soundTypeMetal);
    }
}
