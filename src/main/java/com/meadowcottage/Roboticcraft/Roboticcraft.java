package com.meadowcottage.Roboticcraft;

import com.meadowcottage.Roboticcraft.Handler.ConfigurationHandler;
import com.meadowcottage.Roboticcraft.Init.ModBlocks;
import com.meadowcottage.Roboticcraft.Init.ModItems;
import com.meadowcottage.Roboticcraft.Init.Recipes;
import com.meadowcottage.Roboticcraft.Proxy.IProxy;
import com.meadowcottage.Roboticcraft.Reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_Factory_Class)
public class Roboticcraft
{
    //-----------------------------------------------------------------------------------

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.Instance(Reference.MOD_ID)
    public static Roboticcraft instance;

    //-----------------------------------------------------------------------------------

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
    //-----------------------------------------------------------------------------------
}