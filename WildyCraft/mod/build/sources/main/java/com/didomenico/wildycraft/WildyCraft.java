package com.didomenico.wildycraft;

import com.didomenico.wildycraft.blocks.ModBlocks;
import com.didomenico.wildycraft.items.ModItems;
import com.didomenico.wildycraft.proxy.CommonProxy;
import com.didomenico.wildycraft.recipes.ModRecipes;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = WildyCraft.modId, name = WildyCraft.name, version = WildyCraft.version, acceptedMinecraftVersions = "[1.10.2]")
public class WildyCraft {

	@SidedProxy(serverSide = "com.didomenico.wildycraft.proxy.CommonProxy", clientSide = "com.didomenico.wildycraft.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "wildycraft";
	public static final String name = "WildyCraft";
	public static final String version = "1.0.0";
	
	@Mod.Instance(modId)
	public static WildyCraft instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
		ModItems.init();
		ModBlocks.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
