package com.didomenico.wildycraft.blocks;

import com.didomenico.wildycraft.WildyCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BaseBlock extends Block {

	protected String name;

	public BaseBlock(Material material, String name) {
		super(material);

		this.name = name;

		setUnlocalizedName(name);
		setRegistryName(name);
	}

	public void registerItemModel(ItemBlock itemBlock) {
		WildyCraft.proxy.registerItemRenderer(itemBlock, 0, name);
	}

	@Override
	public BaseBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
