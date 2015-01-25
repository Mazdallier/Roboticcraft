package com.meadowcottage.Roboticcraft.Blocks;

import com.meadowcottage.Roboticcraft.CreativeTabs.RoboticcraftTab;
import com.meadowcottage.Roboticcraft.Reference.Names;
import com.meadowcottage.Roboticcraft.Reference.Textures;

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
