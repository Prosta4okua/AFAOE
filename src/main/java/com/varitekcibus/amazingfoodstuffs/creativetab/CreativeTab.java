package com.varitekcibus.amazingfoodstuffs.creativetab;

import com.varitekcibus.amazingfoodstuffs.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs

{
	
	public CreativeTab(String label)
	
	{
		
		super("afaoe");
		
		
		
	}
	
	public ItemStack getTabIconItem() 
	
	{
		
		return new ItemStack(ItemInit.CHEDDAR);
		
	}
	
	
	
}
