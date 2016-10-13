package com.didomenico.wildycraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMarble extends BaseBlock {

	public BlockMarble() {
		super(Material.ROCK, "BlockMarble");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(4F);
		this.setHarvestLevel("pickaxe", 0);
	}

}
