package com.didomenico.wildycraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static BaseBlock blockRawMarble;
	public static BaseBlock blockMarble;

	public static void init() {
		blockRawMarble = register(new BlockRawMarble());
		blockMarble = register(new BlockMarble());
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);

		if (block instanceof BaseBlock) {
			((BaseBlock)block).registerItemModel(itemBlock);
		}

		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}

}
