
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tinusj.eemod.init;

import net.tinusj.eemod.ExtraordinaryExtracts;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class ExtraordinaryExtractsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraordinaryExtracts.MODID);
	public static final RegistryObject<Item> CAAPI = block(ExtraordinaryExtractsModBlocks.CAAPI, CreativeModeTab.TAB_DECORATIONS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
