package com.meadowcottage.Roboticcraft.common.Init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
{
    public static void init()
    {
        //Tool Crafting
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.Wrench, 1), "i i", " s ", " i ", 'i', ModItems.Steel, 's', ModItems.Silver));

        //Furnace Crafting
        GameRegistry.addSmelting(ModBlocks.CopperOre, new ItemStack(ModItems.Copper), 0.5F);
        GameRegistry.addSmelting(ModItems.CopperDust, new ItemStack(ModItems.Copper), 0.7F);
        GameRegistry.addSmelting(ModBlocks.SilverOre, new ItemStack(ModItems.Silver), 0.5F);
        GameRegistry.addSmelting(ModItems.SilverDust, new ItemStack(ModItems.Silver), 0.7F);
        GameRegistry.addSmelting(ModItems.SteelDust, new ItemStack(ModItems.Steel), 0.8F);

        //Copper Crafting
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.CopperBlock), "vvv", "vvv", "vvv", 'v', ModItems.Copper));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.Copper, 9), new ItemStack(ModBlocks.CopperBlock)));

        //Silver Crafting
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.SilverBlock), "vvv", "vvv", "vvv", 'v', ModItems.Silver));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.Silver, 9), new ItemStack(ModBlocks.SilverBlock)));

        //Steel Crafting
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.SteelDust, 3), new ItemStack(ModItems.CopperDust, 2),new ItemStack(ModItems.CopperDust, 2), new ItemStack(ModItems.SilverDust, 1)));
    }
}