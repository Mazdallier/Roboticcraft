package com.meadowcottage.Roboticcraft.Blocks.Ore;

import com.meadowcottage.Roboticcraft.Blocks.BlockRoboticcraft;
import com.meadowcottage.Roboticcraft.Reference.Names;
import com.meadowcottage.Roboticcraft.Reference.Textures;

public class BlockCopperOre extends BlockRoboticcraft
{
    public BlockCopperOre()
    {
        super();
        this.setBlockName(Names.Ores.CopperOre);
        this.setBlockTextureName(Textures.Ores.CopperOre);
        this.setStepSound(soundTypeMetal);
    }
}
