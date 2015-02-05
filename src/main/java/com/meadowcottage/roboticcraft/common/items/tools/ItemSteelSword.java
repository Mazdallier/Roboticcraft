package com.meadowcottage.roboticcraft.common.items.tools;

import com.meadowcottage.roboticcraft.common.RoboticcraftTab;
import com.meadowcottage.roboticcraft.common.reference.Names;
import com.meadowcottage.roboticcraft.common.reference.Reference;
import com.meadowcottage.roboticcraft.common.reference.Textures;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemSteelSword extends ItemSword
{
	public ItemSteelSword(ToolMaterial material)
	{
		super(material);
		this.setCreativeTab(RoboticcraftTab.RoboticcraftTab);
		this.setUnlocalizedName(Names.Tools.SteelSword);
		this.setTextureName(Textures.Tools.SteelSword);
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
