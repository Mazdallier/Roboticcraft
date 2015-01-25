package com.meadowcottage.Roboticcraft.Blocks;

import com.meadowcottage.Roboticcraft.CreativeTabs.RoboticcraftTab;
import com.meadowcottage.Roboticcraft.Reference.Names;
import com.meadowcottage.Roboticcraft.Reference.Textures;

public class BlockConstructor extends BlockRoboticcraft
{
    public BlockConstructor()
    {
        super();
        this.setBlockName(Names.Blocks.Constructor);
        this.setBlockTextureName(Textures.Blocks.ConstructorBlock);
        this.setStepSound(soundTypeMetal);
    }
}
