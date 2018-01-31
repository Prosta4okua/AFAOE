package com.varitek.AmazingFoodStuffs;

import com.varitek.AmazingFoodStuffs.init.ModItems;
import com.varitek.AmazingFoodStuffs.proxy.CommonProxy;

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
	public void preInit(FMLPreInitializationEvent event) {
		
		ModItems.init();
		ModItems.register();
		
		proxy.registerRenders();
		
		System.out.println("Pre Initialization");
		
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
		System.out.println("Initialization");
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		System.out.println("Post Initialization");
		
	}

}
