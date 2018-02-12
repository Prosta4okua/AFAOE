package com.varitekcibus.amazingfoodstuffs.util.handlers;

import com.varitekcibus.amazingfoodstuffs.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler 

{

	public static SoundEvent ENTITY_FAME_MINION_AMBIENT, ENTITY_FAME_MINION_HURT, ENTITY_FAME_MINION_DEATH;
	
	public static void registerSounds()
	
	{
		
		ENTITY_FAME_MINION_AMBIENT = registerSound("entity.fameminion.ambient");
		ENTITY_FAME_MINION_HURT = registerSound("entity.fameminion.hurt");
		ENTITY_FAME_MINION_DEATH = registerSound("entity.fameminion.death");
		
	}
	
	private static SoundEvent registerSound(String name)
	
	{
		
		ResourceLocation location = new ResourceLocation(Reference.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
		
	}
	
}
