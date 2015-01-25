package com.meadowcottage.Roboticcraft.Init;

import com.meadowcottage.Roboticcraft.Blocks.BlockConstructor;
import com.meadowcottage.Roboticcraft.Blocks.BlockCopper;
import com.meadowcottage.Roboticcraft.Blocks.BlockSilver;
import com.meadowcottage.Roboticcraft.Blocks.BlockSteel;
import com.meadowcottage.Roboticcraft.Blocks.Ore.BlockCopperOre;
import com.meadowcottage.Roboticcraft.Blocks.Ore.BlockSilverOre;
import com.meadowcottage.Roboticcraft.Reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{

    //Declare Blocks
    public static final BlockCopper CopperBlock = new BlockCopper();
    public static final BlockSilver SilverBlock = new BlockSilver();
    public static final BlockSteel SteelBlock = new BlockSteel();
    public static final BlockConstructor ConstructorBlock = new BlockConstructor();
    //Declare Ores
    public static final BlockCopperOre CopperOre = new BlockCopperOre();
    public static final BlockSilverOre SilverOre = new BlockSilverOre();

    //---------------------------------------------------------------------
    public static void init()
    {
        //Registering Blocks
        GameRegistry.registerBlock(CopperBlock, Names.Blocks.CopperBlock);
        GameRegistry.registerBlock(SilverBlock, Names.Blocks.SilverBlock);
        GameRegistry.registerBlock(SteelBlock, Names.Blocks.SteelBlock);
        GameRegistry.registerBlock(ConstructorBlock, Names.Blocks.Constructor);
        //Registering Ores
        GameRegistry.registerBlock(CopperOre, Names.Ores.CopperOre);
        GameRegistry.registerBlock(SilverOre, Names.Ores.SilverOre);
    }
    //---------------------------------------------------------------------
}
