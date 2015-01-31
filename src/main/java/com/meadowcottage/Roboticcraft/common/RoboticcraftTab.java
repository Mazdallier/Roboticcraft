package com.meadowcottage.roboticcraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.meadowcottage.roboticcraft.common.init.ModTools;
import com.meadowcottage.roboticcraft.common.reference.Reference;

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
