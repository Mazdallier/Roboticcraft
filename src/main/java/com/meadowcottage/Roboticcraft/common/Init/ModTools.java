package com.meadowcottage.Roboticcraft.common.Init;

import com.meadowcottage.Roboticcraft.common.Items.ItemWrench;
import com.meadowcottage.Roboticcraft.common.Reference.Names;
import com.meadowcottage.Roboticcraft.common.Reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModTools
{

    //Declare Items
    public static final ItemWrench Wrench = new ItemWrench();

    //---------------------------------------------------------------------
    public static void init()
    {
        //Registering Items
        GameRegistry.registerItem(Wrench, Names.Tools.Wrench);
    }
    //---------------------------------------------------------------------
}