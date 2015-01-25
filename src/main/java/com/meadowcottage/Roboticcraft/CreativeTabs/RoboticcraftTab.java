package com.meadowcottage.Roboticcraft.CreativeTabs;

import com.meadowcottage.Roboticcraft.Init.ModItems;
import com.meadowcottage.Roboticcraft.Reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RoboticcraftTab
{
    public static final CreativeTabs RoboticcraftTab = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.Wrench;
        }
    };
}
