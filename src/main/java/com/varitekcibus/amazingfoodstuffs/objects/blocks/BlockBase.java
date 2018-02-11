package com.varitekcibus.amazingfoodstuffs.objects.blocks;

import com.varitekcibus.amazingfoodstuffs.AmazingFoodStuffs;
import com.varitekcibus.amazingfoodstuffs.init.BlockInit;
import com.varitekcibus.amazingfoodstuffs.init.ItemInit;
import com.varitekcibus.amazingfoodstuffs.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel

{
	
	public BlockBase(String name, Material material, float hardness, float resistance)
	
	{
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(AmazingFoodStuffs.afaoe);
		setHardness(hardness);
		setResistance(resistance);
		
		
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	
	{
		
		AmazingFoodStuffs.proxy.registerItemRenderer(Item.getItemFromBlock(this),  0,  "inventory");
		
	}
	
	
}
