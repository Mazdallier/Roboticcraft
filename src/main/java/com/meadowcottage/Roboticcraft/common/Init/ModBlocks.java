package com.meadowcottage.Roboticcraft.common.Init;

import net.minecraft.block.material.Material;

import com.meadowcottage.Roboticcraft.common.Blocks.BlockConstructor;
import com.meadowcottage.Roboticcraft.common.Blocks.BlockCopper;
import com.meadowcottage.Roboticcraft.common.Blocks.BlockCrusher;
import com.meadowcottage.Roboticcraft.common.Blocks.BlockSilver;
import com.meadowcottage.Roboticcraft.common.Blocks.BlockSteel;
import com.meadowcottage.Roboticcraft.common.Blocks.Ore.BlockCopperOre;
import com.meadowcottage.Roboticcraft.common.Blocks.Ore.BlockSilverOre;
import com.meadowcottage.Roboticcraft.common.Reference.Names;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{

	// Declare Blocks
	public static final BlockCopper CopperBlock = new BlockCopper();
	public static final BlockSilver SilverBlock = new BlockSilver();
	public static final BlockSteel SteelBlock = new BlockSteel();

	// Declare Machines
	public static final BlockConstructor ConstructorBlock = new BlockConstructor();
	public static final BlockCrusher CrusherBlock = new BlockCrusher(Material.iron);

	// Declare Ores
	public static final BlockCopperOre CopperOre = new BlockCopperOre();
	public static final BlockSilverOre SilverOre = new BlockSilverOre();

	// ---------------------------------------------------------------------
	public static void init()
	{
		// Registering Blocks
		GameRegistry.registerBlock(CopperBlock, Names.Blocks.CopperBlock);
		GameRegistry.registerBlock(SilverBlock, Names.Blocks.SilverBlock);
		GameRegistry.registerBlock(SteelBlock, Names.Blocks.SteelBlock);

		// Register Machines
		GameRegistry.registerBlock(ConstructorBlock, Names.Blocks.Constructor);
		GameRegistry.registerBlock(CrusherBlock, Names.Blocks.Crusher);

		// Registering Ores
		GameRegistry.registerBlock(CopperOre, Names.Ores.CopperOre);
		GameRegistry.registerBlock(SilverOre, Names.Ores.SilverOre);
	}
	// ---------------------------------------------------------------------
}
