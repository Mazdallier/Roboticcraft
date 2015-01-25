package com.meadowcottage.Roboticcraft.common.Blocks;

import com.meadowcottage.Roboticcraft.common.CreativeTabs.RoboticcraftTab;
import com.meadowcottage.Roboticcraft.common.Reference.Names;
import com.meadowcottage.Roboticcraft.common.Reference.Textures;

public class BlockSteel extends BlockRoboticcraft
{
    public BlockSteel()
    {
        super();
        this.setBlockName(Names.Blocks.SteelBlock);
        this.setBlockTextureName(Textures.Blocks.SteelBlock);
        this.setStepSound(soundTypeMetal);
    }
}
