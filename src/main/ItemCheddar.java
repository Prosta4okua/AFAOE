package com.varitek.AmazingFoodStuffs.items;

import com.varitek.AmazingFoodStuffs.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Item;

public class ItemCheddar extends Item {
	
	 
		
		public ItemCheddar(String unlocalizedName, String registryName) {
			
			this.setUnlocalizedName(unlocalizedName);
			this.setRegistryName(new ResourceLocation(Reference.MOD_ID, registryName));
		}
		
		
	
	
	
}


