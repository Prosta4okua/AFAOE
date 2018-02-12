package com.varitekcibus.amazingfoodstuffs.entity;

import com.varitekcibus.amazingfoodstuffs.init.ItemInit;
import com.varitekcibus.amazingfoodstuffs.util.handlers.LootTableHandler;
import com.varitekcibus.amazingfoodstuffs.util.handlers.SoundsHandler;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityFameMinion extends EntityWitherSkeleton

{

	public EntityFameMinion(World worldIn)
	
	{
		
		super(worldIn);
		this.setSize(0.7F, 1.6F);
		
	}
	
	/*@Override
	protected void initEntityAI() 
	
	{
	
		 this.tasks.addTask(0, new EntityAISwimming(this));
		 this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 3.0F, 1.0F));
	     this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
	     this.tasks.addTask(3, new EntityAILookIdle(this));
	     this.targetTasks.addTask(4, new EntityAIHurtByTarget(this, false, new Class[0]));
	     this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	     this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityCow.class, true));
	
		
	}*/
	
	@Override
	protected void applyEntityAttributes() 
	
	{
	
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
		
	}
	
	
	@Override
	protected ResourceLocation getLootTable() 
	
	{
		
		return LootTableHandler.FAME_MINION;
		
	}
	
	
	@Override
	protected SoundEvent getAmbientSound()
	
	{
		
		return SoundsHandler.ENTITY_FAME_MINION_AMBIENT;
		
	}

	
	@Override
	protected SoundEvent getHurtSound(DamageSource source)
	
	{
		
		return SoundsHandler.ENTITY_FAME_MINION_HURT;
		
	}
	
	@Override
	protected SoundEvent getDeathSound()
	
	{
		
		return SoundsHandler.ENTITY_FAME_MINION_DEATH;
		
	}
}
