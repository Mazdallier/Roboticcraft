package com.meadowcottage.Roboticcraft.common.Blocks;

import com.meadowcottage.Roboticcraft.common.CreativeTabs.RoboticcraftTab;
import com.meadowcottage.Roboticcraft.common.Reference.Names;
import com.meadowcottage.Roboticcraft.common.Reference.Textures;

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
