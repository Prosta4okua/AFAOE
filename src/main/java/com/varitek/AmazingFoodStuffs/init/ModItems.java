package com.varitek.AmazingFoodStuffs.init;

import com.varitek.AmazingFoodStuffs.Reference;
import com.varitek.AmazingFoodStuffs.items.ItemCheddar;
import com.varitek.AmazingFoodStuffs.util.Utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item cheddar;
	
	public static void preinit() 
	
	{
		
		cheddar = new Item().setUnlocalizedName("cheddar").setCreativeTab(CreativeTabs.FOOD).setRegistryName(Reference.MOD_ID, "cheddar");
		
		
		
	}

	
	public static void register() 
	
	{
		
		GameRegistry.register(cheddar);
		
	}
	
	
	public static void registerRenders() 
	
	{
		
		registerRender(cheddar);
		
	}
		
	
	public static void registerItem(Item item) 
	
	{
		
		GameRegistry.register(cheddar, new ResourceLocation(Reference.MOD_ID, "cheddar"));
			
	}
		
	
	
	public static void registerRender(Item item) 
	
	{
	
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + item.getUnlocalizedName().substring(5), "inventory"));
		Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));	
	
	}
	
}
