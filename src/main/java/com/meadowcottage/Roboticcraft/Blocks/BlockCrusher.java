package com.meadowcottage.Roboticcraft.Blocks;

import com.meadowcottage.Roboticcraft.Reference.Names;
import com.meadowcottage.Roboticcraft.Reference.Textures;

public class BlockCrusher extends BlockRoboticcraft
{
    public BlockCrusher()
    {
        super();
        this.setBlockName(Names.Blocks.Crusher);
        this.setBlockTextureName(Textures.Blocks.CrusherBlock);
        this.setStepSound(soundTypeMetal);
    }
}
