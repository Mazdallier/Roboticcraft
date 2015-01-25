package com.meadowcottage.Roboticcraft.common.CreativeTabs;

import com.meadowcottage.Roboticcraft.common.Init.ModTools;
import com.meadowcottage.Roboticcraft.common.Reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RoboticcraftTab
{
    public static final CreativeTabs RoboticcraftTab = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModTools.Wrench;
        }
    };
}
