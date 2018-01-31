package com.varitek.AmazingFoodStuffs.init;

import com.varitek.AmazingFoodStuffs.Reference;
import com.varitek.AmazingFoodStuffs.items.ItemCheddar;
import com.varitek.AmazingFoodStuffs.util.Utils;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item cheddar;
	
	public static void init() 
	
	{
		
		cheddar = new ItemCheddar("cheddar" , "cheddar");
		
	}

	
	public static void register() 
	
	{
		
		registerItem(cheddar);
		
	}
	
	
	public static void registerRenders() 
	
	{
		
		registerRender(cheddar);
		
	}
		
	
	public static void registerItem(Item item) 
	
	{
		
		GameRegistry.register(item);
		Utils.getLogger().info("Registered Item" + item.getUnlocalizedName().substring(5));
			
	}
		
	
	
	public static void registerRender (Item item) 
	
	{
	
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));	
	
	}
	
}
