package com.varitekcibus.amazingfoodstuffs.objects.items;

import com.varitekcibus.amazingfoodstuffs.AmazingFoodStuffs;
import com.varitekcibus.amazingfoodstuffs.init.ItemInit;
import com.varitekcibus.amazingfoodstuffs.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel

{
	
	
	public ItemBase(String name) 
	
	{
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(AmazingFoodStuffs.afaoe);
		
		ItemInit.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	
	{
		
		AmazingFoodStuffs.proxy.registerItemRenderer(this,  0,  "inventory");
		
	}
	

	
	
}
