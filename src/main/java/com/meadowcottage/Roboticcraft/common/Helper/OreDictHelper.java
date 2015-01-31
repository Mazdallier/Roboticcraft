package com.meadowcottage.roboticcraft.common.helper;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHelper
{
    public static void registerOreWithAlts(String[] names, ItemStack ore)
    {
        for (String name : names)
            OreDictionary.registerOre(name, ore);
    }
}