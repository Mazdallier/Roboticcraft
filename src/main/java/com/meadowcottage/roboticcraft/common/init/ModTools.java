package com.meadowcottage.roboticcraft.common.init;

import com.meadowcottage.roboticcraft.common.items.tools.ItemSteelAxe;
import com.meadowcottage.roboticcraft.common.items.tools.ItemSteelPick;
import com.meadowcottage.roboticcraft.common.items.tools.ItemSteelShovel;
import com.meadowcottage.roboticcraft.common.items.tools.ItemSteelSword;
import com.meadowcottage.roboticcraft.common.items.tools.ItemWrench;
import com.meadowcottage.roboticcraft.common.reference.Names;
import com.meadowcottage.roboticcraft.common.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModTools
{

    //Declare Tools
    public static final ItemWrench Wrench = new ItemWrench();

	public static final ItemSteelSword SteelSword = new ItemSteelSword(Item.ToolMaterial.IRON );
	public static final ItemSteelPick SteelPick = new ItemSteelPick(Item.ToolMaterial.IRON );
	public static final ItemSteelShovel SteelShovel = new ItemSteelShovel(Item.ToolMaterial.IRON );
	public static final ItemSteelAxe SteelAxe = new ItemSteelAxe(Item.ToolMaterial.IRON );

    public static void init()
    {
        //Registering Items
        GameRegistry.registerItem(Wrench, Names.Tools.Wrench);
		GameRegistry.registerItem(SteelSword, Names.Tools.SteelSword);
		GameRegistry.registerItem(SteelPick, Names.Tools.SteelPick);
		GameRegistry.registerItem(SteelShovel, Names.Tools.SteelShovel);
		GameRegistry.registerItem(SteelAxe, Names.Tools.SteelAxe);
    }
}