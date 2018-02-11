package com.varitekcibus.amazingfoodstuffs.world.gen;

import java.util.Random;

import com.varitekcibus.amazingfoodstuffs.init.BlockInit;
import com.varitekcibus.amazingfoodstuffs.objects.blocks.BlockOres;
import com.varitekcibus.amazingfoodstuffs.util.handlers.EnumHandler;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator

{

	private WorldGenerator ore_overworld_salt;
	private WorldGenerator ore_overworld_baking_soda;
	
	public WorldGenCustomOres()
	
	{
		
		ore_overworld_salt = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SALT), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_baking_soda = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.BAKING_SODA), 9, BlockMatcher.forBlock(Blocks.STONE));
		
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	
	{

		switch(world.provider.getDimension())
		
		{
		
		case 0:
			
			runGenerator(ore_overworld_salt, world, random, chunkX, chunkZ, 20, 20, 120);
			runGenerator(ore_overworld_baking_soda, world, random, chunkX, chunkZ, 20, 20, 120);
			
			break;
			
		
		}
		
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	
	{
		
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore was generated out of bounds!");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
			
		{
			
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
			
		}
		
	}
}
