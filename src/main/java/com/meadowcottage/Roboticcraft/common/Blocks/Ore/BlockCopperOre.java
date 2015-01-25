package com.meadowcottage.Roboticcraft.common.Blocks.Ore;

import com.meadowcottage.Roboticcraft.common.Blocks.BlockRoboticcraft;
import com.meadowcottage.Roboticcraft.common.Reference.Names;
import com.meadowcottage.Roboticcraft.common.Reference.Textures;

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
