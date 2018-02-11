package com.varitekcibus.amazingfoodstuffs.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CookedRecipes 

{

	public static void init()
	
	{
		
		GameRegistry.addSmelting(ItemInit.UNCOOKED_CRUST, new ItemStack(ItemInit.EMPTY_CRUST, 1), 0.0f);
		
	}
	
}
