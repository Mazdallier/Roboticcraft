package com.meadowcottage.roboticcraft.common.world;

import net.minecraftforge.common.config.Configuration;

import com.meadowcottage.roboticcraft.common.reference.Names;

public class ConfigGen
{
	public static boolean generateCopper;
	public static int minCopperY;
	public static int maxCopperY;
	public static int veinCountCopper;
	public static int veinSizeCopper;

	public static boolean generateSilver;
	public static int minSilverY;
	public static int maxSilverY;
	public static int veinCountSilver;
	public static int veinSizeSilver;

	public static void oreConfig(Configuration oreConfig) {

		generateCopper = oreConfig.get(Names.Ores.CopperOre, "generateCopper", true).getBoolean(true);
		minCopperY = oreConfig.get(Names.Ores.CopperOre, "minCopperY", 10).getInt();
		maxCopperY = oreConfig.get(Names.Ores.CopperOre, "maxCopperY", 90).getInt();
		veinCountCopper = oreConfig.get(Names.Ores.CopperOre, "veinCountCopper", 8).getInt();
		veinSizeCopper = oreConfig.get(Names.Ores.CopperOre, "veinSizeCopper", 7).getInt();

		generateSilver = oreConfig.get(Names.Ores.SilverOre, "generateSilver", true).getBoolean(true);
		minSilverY = oreConfig.get(Names.Ores.SilverOre, "minSilverY", 10).getInt();
		maxSilverY = oreConfig.get(Names.Ores.SilverOre, "maxSilverY", 90).getInt();
		veinCountSilver = oreConfig.get(Names.Ores.SilverOre, "veinCountSilver", 8).getInt();
		veinSizeSilver = oreConfig.get(Names.Ores.SilverOre, "veinSizeSilver", 7).getInt();
	}
}
