package com.meadowcottage.roboticcraft.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.meadowcottage.roboticcraft.common.RoboticcraftTab;
import com.meadowcottage.roboticcraft.common.reference.Reference;

public class ItemRoboticCraft extends Item
{
    public ItemRoboticCraft()
    {
        super();
        this.setCreativeTab(RoboticcraftTab.RoboticcraftTab);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
