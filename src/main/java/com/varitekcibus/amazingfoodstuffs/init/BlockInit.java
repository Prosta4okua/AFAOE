package com.varitekcibus.amazingfoodstuffs.init;

import java.util.ArrayList;
import java.util.List;

import com.varitekcibus.amazingfoodstuffs.objects.blocks.BlockBase;
import com.varitekcibus.amazingfoodstuffs.objects.blocks.BlockOres;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 

{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_CHEDDAR = new BlockBase("block_cheddar", Material.SPONGE, 2.0F, 1);
	public static final Block BLOCK_HARDENED_IRON = new BlockBase("block_hardened_iron", Material.IRON, 5.0F, 25);
	
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld", 1F, 1);

	
}