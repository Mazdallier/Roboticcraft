package com.meadowcottage.roboticcraft.common.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.meadowcottage.roboticcraft.common.init.ModBlocks;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		int blockChunkX = chunkX * 16;
		int blockChunkZ = chunkZ * 16;

		if (world.provider.dimensionId == -1)
			this.generateNether(world, random, blockChunkX, blockChunkZ);
		else if (world.provider.dimensionId == 0)
			this.generateSurface(world, random, blockChunkX, blockChunkZ);
		else if ((world.provider.dimensionId == 1))
			this.generateEnd(world, random, blockChunkX, blockChunkZ);
		else
			this.generateOther(world, random, blockChunkX, blockChunkZ);
	}

	private void generateSurface(World world, Random random, int chunkX, int chunkZ)
	{
		if (ConfigGen.generateCopper)
			this.generateOre(world, random, chunkX, chunkZ, ConfigGen.veinCountCopper, ConfigGen.minCopperY, ConfigGen.maxSilverY,
					ConfigGen.veinSizeCopper, ModBlocks.CopperOre, 0, Blocks.stone);
		if (ConfigGen.generateSilver)
			this.generateOre(world, random, chunkX, chunkZ, ConfigGen.veinCountSilver, ConfigGen.minSilverY, ConfigGen.maxSilverY,
					ConfigGen.veinSizeSilver, ModBlocks.SilverOre, 0, Blocks.stone);
	}

	private void generateOther(World world, Random random, int chunkX, int chunkZ)
	{
		if (ConfigGen.generateCopper)
			this.generateOre(world, random, chunkX, chunkZ, ConfigGen.veinCountCopper, ConfigGen.minCopperY, ConfigGen.maxSilverY,
					ConfigGen.veinSizeCopper, ModBlocks.CopperOre, 0, Blocks.stone);
		if (ConfigGen.generateSilver)
			this.generateOre(world, random, chunkX, chunkZ, ConfigGen.veinCountSilver, ConfigGen.minSilverY, ConfigGen.maxSilverY,
					ConfigGen.veinSizeSilver, ModBlocks.SilverOre, 0, Blocks.stone);
	}

	private void generateNether(World world, Random random, int chunkX, int chunkZ)
	{

	}

	private void generateEnd(World world, Random random, int chunkX, int chunkZ)
	{

	}

	/** Useful Helper Method **/
	private void generateOre(World world, Random random, int chunkX, int chunkZ, int blockPerChunk, int minHeight, int maxHeight, int blocks,
			Block ore, int meta, Block blockToGenIn)
	{
		for (int i = 0; i < blockPerChunk; i++)
		{
			int oreXCoord = chunkX + random.nextInt(16);
			int oreYCoord = minHeight + random.nextInt(maxHeight - minHeight);
			int oreZCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ore, meta, blocks, blockToGenIn).generate(world, random, oreXCoord, oreYCoord, oreZCoord);
		}
	}

}