package com.meadowcottage.Roboticcraft.Blocks;

import com.meadowcottage.Roboticcraft.CreativeTabs.RoboticcraftTab;
import com.meadowcottage.Roboticcraft.Reference.Names;
import com.meadowcottage.Roboticcraft.Reference.Textures;

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
