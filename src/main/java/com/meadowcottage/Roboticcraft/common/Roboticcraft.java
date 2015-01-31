package com.meadowcottage.Roboticcraft.common;

import com.meadowcottage.Roboticcraft.client.GuiHandler;
import com.meadowcottage.Roboticcraft.common.Handler.ConfigurationHandler;
import com.meadowcottage.Roboticcraft.common.Init.*;
import com.meadowcottage.Roboticcraft.common.Proxy.IProxy;
import com.meadowcottage.Roboticcraft.common.Reference.Reference;

import com.meadowcottage.Roboticcraft.common.World.WorldGen;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_Factory_Class)
public class Roboticcraft
{
	// -----------------------------------------------------------------------------------

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;

	@Mod.Instance(Reference.MOD_ID)
	public static Roboticcraft instance;

	// -----------------------------------------------------------------------------------

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

		ModItems.init();
		ModTools.init();
		ModBlocks.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		Recipes.init();
        ModWorldGen.init();
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
	// -----------------------------------------------------------------------------------
}