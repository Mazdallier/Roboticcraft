package com.meadowcottage.Roboticcraft.Init;

import com.meadowcottage.Roboticcraft.Items.ItemWrench;
import com.meadowcottage.Roboticcraft.Reference.Names;
import com.meadowcottage.Roboticcraft.Reference.Reference;
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