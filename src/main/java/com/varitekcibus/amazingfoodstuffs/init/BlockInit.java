package com.varitekcibus.amazingfoodstuffs.init;

import java.util.ArrayList;
import java.util.List;

import com.varitekcibus.amazingfoodstuffs.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 

{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_CHEDDAR = new BlockBase("block_cheddar", Material.WOOD);
	
}
