package com.meadowcottage.Roboticcraft.Init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        //Tool Crafting
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.Wrench, 1), "i i", " s ", " i ", 'i', ModItems.Steel, 's', ModItems.Silver));

        //Copper Crafting
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.CopperBlock), "vvv", "vvv", "vvv", 'v', ModItems.Copper));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.Copper, 9), new ItemStack(ModBlocks.CopperBlock)));

        //Silver Crafting
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.SilverBlock), "vvv", "vvv", "vvv", 'v', ModItems.Silver));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.Silver, 9), new ItemStack(ModBlocks.SilverBlock)));

        //Tin Crafting
        //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.TinBlock), "vvv", "vvv", "vvv", 'v', ModItems.Tin));
        //GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.Tin, 9), new ItemStack(ModBlocks.TinBlock)));
    }
}