package com.meadowcottage.Roboticcraft.Items;

import com.meadowcottage.Roboticcraft.CreativeTabs.RoboticcraftTab;
import com.meadowcottage.Roboticcraft.Reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

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
