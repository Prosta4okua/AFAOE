package com.varitekcibus.amazingfoodstuffs;

import com.varitekcibus.amazingfoodstuffs.proxy.CommonProxy;
import com.varitekcibus.amazingfoodstuffs.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class AmazingFoodStuffs {

	@Instance
	public static AmazingFoodStuffs instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
		System.out.println("Pre Initialization");
		
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
		System.out.println("Initialization");
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
		System.out.println("Post Initialization");
		
	}

}

