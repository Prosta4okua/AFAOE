package com.varitekcibus.amazingfoodstuffs.util.handlers;

import com.varitekcibus.amazingfoodstuffs.init.BlockInit;
import com.varitekcibus.amazingfoodstuffs.init.ItemInit;
import com.varitekcibus.amazingfoodstuffs.util.interfaces.IHasModel;
import com.varitekcibus.amazingfoodstuffs.world.gen.WorldGenCustomOres;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 

{

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	
	{
		
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
		
	}
	
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	
	{
		
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		
	}
	
	
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	
	{
		
		for(Item item : ItemInit.ITEMS)
			
		{
			
			if(item instanceof IHasModel)
				
			{
				
				((IHasModel)item).registerModels();
				
			}
			
		}
		
		for(Block block : BlockInit.BLOCKS)
			
		{
			
			if(block instanceof IHasModel)
				
			{
				
				((IHasModel)block).registerModels();
				
			}
			
		}
		
		
	}
	
	public static void otherRegistries()
	
	{
		
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		
	}
	
}
