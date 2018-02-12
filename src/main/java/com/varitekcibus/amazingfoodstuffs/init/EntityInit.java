package com.varitekcibus.amazingfoodstuffs.init;

import com.varitekcibus.amazingfoodstuffs.AmazingFoodStuffs;
import com.varitekcibus.amazingfoodstuffs.Reference;
import com.varitekcibus.amazingfoodstuffs.entity.EntityFameMinion;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 

{
	
	
	public static void registerEntities()
	
	{
		
		registerEntity("fameminion", EntityFameMinion.class, Reference.ENTITY_FAME_MINION, 50, 000000, 14876822);
		
	}

	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	
	{
		
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, AmazingFoodStuffs.instance, range, 1, true, color1, color2);
		
	}
	
}
