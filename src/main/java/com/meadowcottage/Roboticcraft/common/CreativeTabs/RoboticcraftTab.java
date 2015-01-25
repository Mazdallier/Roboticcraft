package com.meadowcottage.Roboticcraft.common.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.meadowcottage.Roboticcraft.common.Init.ModTools;
import com.meadowcottage.Roboticcraft.common.Reference.Reference;

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
