package com.meadowcottage.Roboticcraft.common.Init;

import com.meadowcottage.Roboticcraft.common.Items.*;
import com.meadowcottage.Roboticcraft.common.Reference.Names;
import com.meadowcottage.Roboticcraft.common.Reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{

    //Ingots
    public static final ItemCopper Copper = new ItemCopper();
    public static final ItemSilver Silver = new ItemSilver();
    public static final ItemSteel Steel = new ItemSteel();

    //Dusts
    public static final ItemCopperDust CopperDust = new ItemCopperDust();
    public static final ItemSilverDust SilverDust = new ItemSilverDust();
    public static final ItemSteelDust SteelDust = new ItemSteelDust();
    //---------------------------------------------------------------------
    public static void init()
    {
        //Registering Ingots
        GameRegistry.registerItem(Copper, Names.Items.Copper);
        GameRegistry.registerItem(Silver, Names.Items.Silver);
        GameRegistry.registerItem(Steel, Names.Items.Steel);

        //Registering Dusts
        GameRegistry.registerItem(CopperDust, Names.Items.CopperDust);
        GameRegistry.registerItem(SilverDust, Names.Items.SilverDust);
        GameRegistry.registerItem(SteelDust, Names.Items.SteelDust);
    }
    //---------------------------------------------------------------------
}