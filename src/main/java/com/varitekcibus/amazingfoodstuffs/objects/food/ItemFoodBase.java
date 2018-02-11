package com.varitekcibus.amazingfoodstuffs.objects.food;

import com.varitekcibus.amazingfoodstuffs.AmazingFoodStuffs;
import com.varitekcibus.amazingfoodstuffs.init.ItemInit;
import com.varitekcibus.amazingfoodstuffs.util.interfaces.IHasModel;

import net.minecraft.item.ItemFood;

public class ItemFoodBase extends ItemFood implements IHasModel

{

	
	

	public ItemFoodBase(String name, int amount, float saturation, boolean isWolfFood) 
	
	{
		super(amount, saturation, isWolfFood);
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
