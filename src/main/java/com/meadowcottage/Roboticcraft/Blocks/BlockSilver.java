package com.meadowcottage.Roboticcraft.Blocks;

import com.meadowcottage.Roboticcraft.CreativeTabs.RoboticcraftTab;
import com.meadowcottage.Roboticcraft.Reference.Names;
import com.meadowcottage.Roboticcraft.Reference.Textures;

public class BlockSilver extends BlockRoboticcraft
{
    public BlockSilver()
    {
        super();
        this.setBlockName(Names.Blocks.SilverBlock);
        this.setBlockTextureName(Textures.Blocks.SilverBlock);
        this.setStepSound(soundTypeMetal);
    }
}
