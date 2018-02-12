package com.varitekcibus.amazingfoodstuffs;

import com.varitekcibus.amazingfoodstuffs.proxy.CommonProxy;
import com.varitekcibus.amazingfoodstuffs.util.handlers.RegistryHandler;
import com.varitekcibus.amazingfoodstuffs.util.handlers.SoundsHandler;
import com.varitekcibus.amazingfoodstuffs.Reference;
import com.varitekcibus.amazingfoodstuffs.creativetab.CreativeTab;
import com.varitekcibus.amazingfoodstuffs.init.CookedRecipes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class AmazingFoodStuffs {

	@Instance
	public static AmazingFoodStuffs instance;
	
	
	public static final CreativeTabs afaoe = new CreativeTab("afaoe");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	
	{
		
		RegistryHandler.otherRegistries();
		
		System.out.println("Pre Initialization");
		
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) 
	
	{
		
		CookedRecipes.init();
		
		RegistryHandler.initRegistries();
		
		System.out.println("Initialization");
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) 
	
	{
		
		System.out.println("Post Initialization");
		
	}

}

