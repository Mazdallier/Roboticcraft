package com.meadowcottage.Roboticcraft.common.Blocks;

import com.meadowcottage.Roboticcraft.common.Reference.Names;
import com.meadowcottage.Roboticcraft.common.Reference.Textures;

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
