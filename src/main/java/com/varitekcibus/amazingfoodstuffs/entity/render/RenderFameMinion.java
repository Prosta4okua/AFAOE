package com.varitekcibus.amazingfoodstuffs.entity.render;

import com.varitekcibus.amazingfoodstuffs.Reference;
import com.varitekcibus.amazingfoodstuffs.entity.EntityFameMinion;
import com.varitekcibus.amazingfoodstuffs.entity.model.ModelFameMinion;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFameMinion extends RenderLiving<EntityFameMinion>

{
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/fameminion.png");

	public RenderFameMinion(RenderManager manager)
	
	{
		
		super(manager, new ModelFameMinion(), 0.5f);
		
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityFameMinion entity) 
	
	{
	
		return TEXTURES;
		
	}
	
	@Override
	protected void applyRotations(EntityFameMinion entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	
	{

		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
		
	}
}
