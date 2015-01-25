package com.meadowcottage.Roboticcraft.Init;

import com.meadowcottage.Roboticcraft.Items.*;
import com.meadowcottage.Roboticcraft.Reference.Names;
import com.meadowcottage.Roboticcraft.Reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{

    //Declare Items
    public static final ItemWrench Wrench = new ItemWrench();

    public static final ItemCopper Copper = new ItemCopper();
    public static final ItemSilver Silver = new ItemSilver();
    public static final ItemSteel Steel = new ItemSteel();

    //---------------------------------------------------------------------
    public static void init()
    {
        //Registering Items
        GameRegistry.registerItem(Wrench, Names.Tools.Wrench);

        GameRegistry.registerItem(Copper, Names.Items.Copper);
        GameRegistry.registerItem(Silver, Names.Items.Silver);
        GameRegistry.registerItem(Steel, Names.Items.Steel);
    }
    //---------------------------------------------------------------------
}