package com.meadowcottage.roboticcraft.common.init;

import net.minecraft.block.material.Material;

import com.meadowcottage.roboticcraft.common.blocks.BlockController;
import com.meadowcottage.roboticcraft.common.blocks.BlockCopper;
import com.meadowcottage.roboticcraft.common.blocks.BlockCrusher;
import com.meadowcottage.roboticcraft.common.blocks.BlockSilver;
import com.meadowcottage.roboticcraft.common.blocks.BlockSteel;
import com.meadowcottage.roboticcraft.common.blocks.ore.BlockCopperOre;
import com.meadowcottage.roboticcraft.common.blocks.ore.BlockSilverOre;
import com.meadowcottage.roboticcraft.common.reference.Names;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{

	// Declare Blocks
	public static final BlockCopper CopperBlock = new BlockCopper();
	public static final BlockSilver SilverBlock = new BlockSilver();
	public static final BlockSteel SteelBlock = new BlockSteel();

	// Declare Machines
	public static final BlockController ControllerBlock = new BlockController();
	public static final BlockCrusher CrusherBlock = new BlockCrusher(Material.iron);

	// Declare Ores
	public static final BlockCopperOre CopperOre = new BlockCopperOre();
	public static final BlockSilverOre SilverOre = new BlockSilverOre();

	public static void init()
	{
		// Registering Blocks
		GameRegistry.registerBlock(CopperBlock, Names.Blocks.CopperBlock);
		GameRegistry.registerBlock(SilverBlock, Names.Blocks.SilverBlock);
		GameRegistry.registerBlock(SteelBlock, Names.Blocks.SteelBlock);

		// Register Machines
		GameRegistry.registerBlock(ControllerBlock, Names.Blocks.Controller);
		GameRegistry.registerBlock(CrusherBlock, Names.Blocks.Crusher);

		// Registering Ores
		GameRegistry.registerBlock(CopperOre, Names.Ores.CopperOre);
		GameRegistry.registerBlock(SilverOre, Names.Ores.SilverOre);
	}
}
