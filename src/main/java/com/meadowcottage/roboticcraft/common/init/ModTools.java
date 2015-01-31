package com.meadowcottage.roboticcraft.common.init;

import com.meadowcottage.roboticcraft.common.items.ItemWrench;
import com.meadowcottage.roboticcraft.common.reference.Names;
import com.meadowcottage.roboticcraft.common.reference.Reference;

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