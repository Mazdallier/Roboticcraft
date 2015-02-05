package com.meadowcottage.roboticcraft.common.init;

import com.meadowcottage.roboticcraft.common.items.ItemCopper;
import com.meadowcottage.roboticcraft.common.items.ItemCopperDust;
import com.meadowcottage.roboticcraft.common.items.ItemSilver;
import com.meadowcottage.roboticcraft.common.items.ItemSilverDust;
import com.meadowcottage.roboticcraft.common.items.ItemSteel;
import com.meadowcottage.roboticcraft.common.items.ItemSteelDust;
import com.meadowcottage.roboticcraft.common.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

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
}