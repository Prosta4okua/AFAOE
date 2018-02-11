package com.varitekcibus.amazingfoodstuffs.objects.tools;

import com.varitekcibus.amazingfoodstuffs.AmazingFoodStuffs;
import com.varitekcibus.amazingfoodstuffs.init.ItemInit;
import com.varitekcibus.amazingfoodstuffs.util.interfaces.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ToolBase extends Item implements IHasModel

{
	
	public ToolBase(String name) 
	
	{
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(AmazingFoodStuffs.afaoe);
		
		ItemInit.ITEMS.add(this);
		
	}

	@Override
    public ItemStack getContainerItem(ItemStack itemStack )
    {
        ItemStack copy = itemStack.copy();
        return copy;
    }
	
	 @Override
	    public boolean hasContainerItem(ItemStack stack )
	    {
	        return true;
	    }

	 @Override
		public void registerModels() 
		
		{
			
			AmazingFoodStuffs.proxy.registerItemRenderer(this,  0,  "inventory");
			
		}
		
	

}
