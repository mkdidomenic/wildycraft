package com.didomenico.wildycraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static BaseItem itemSoul;
	
	public static void init() {
		itemSoul = register(new ItemSoul());
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof BaseItem) {
			((BaseItem)item).registerItemModel();
		}

		return item;
	}

}
