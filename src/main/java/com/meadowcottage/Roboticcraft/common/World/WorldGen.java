package com.meadowcottage.Roboticcraft.common.World;

import java.util.Random;

import com.meadowcottage.Roboticcraft.common.Init.ModBlocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGen implements IWorldGenerator
{
	//Attempt #1
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
			case 0:
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;
		}
	}
	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
		for(int k = 0; k < 10; k++){
			int x = chunkX + rand.nextInt(16);
			int y = rand.nextInt(64);
			int z = chunkZ + rand.nextInt(16);

			(new WorldGenMinable(ModBlocks.CopperOre, 13)).generate(world, rand, x, y, z);
			(new WorldGenMinable(ModBlocks.SilverOre, 13)).generate(world, rand, x, y, z);
		}
	}

	//Attempt #2
	/*@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		if (!world.provider.isSurfaceWorld()) {
			return;
		}
		if (ConfigGen.generateSilver) {
			this.addOreToGenerate(random, ConfigGen.veinCountSilver, ConfigGen.veinSizeSilver, ConfigGen.minSilverY, ConfigGen.maxSilverY, ModBlocks.SilverOre, world,
				chunkX, chunkZ);
		}
		if (ConfigGen.generateCopper) {
			this.addOreToGenerate(random, ConfigGen.veinCountCopper, ConfigGen.veinSizeCopper, ConfigGen.minCopperY, ConfigGen.maxCopperY, ModBlocks.CopperOre, world,
				chunkX, chunkZ);
		}
	}

	private void addOreToGenerate(Random random, int veinCount, int veinSize, int minY, int maxY, Block block, World world, int chunkX, int chunkZ) {

		for(int k = 0; k < 10; k++){
			int x = chunkX + random.nextInt(16);
			int y = random.nextInt(64);
			int z = chunkZ + random.nextInt(16);

			(new WorldGenMinable(ModBlocks.CopperOre, 13)).generate(world, random, x, y, z);
			(new WorldGenMinable(ModBlocks.SilverOre, 13)).generate(world, random, x, y, z);
		}
	}*/
}