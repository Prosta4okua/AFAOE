package com.varitekcibus.amazingfoodstuffs.util.handlers;


import com.varitekcibus.amazingfoodstuffs.entity.EntityFameMinion;
import com.varitekcibus.amazingfoodstuffs.entity.render.RenderFameMinion;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 

{

	public static void registerEntityRenders()
	
	{
		
		RenderingRegistry.registerEntityRenderingHandler(EntityFameMinion.class, new IRenderFactory<EntityFameMinion>()
				
				{
					
					@Override
					public Render<? super EntityFameMinion> createRenderFor(RenderManager manager) 
					
					{
					
						return new RenderFameMinion(manager);
						
					}
			
				});
		
	}
	
}
