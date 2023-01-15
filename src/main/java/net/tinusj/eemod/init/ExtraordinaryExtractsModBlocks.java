
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tinusj.eemod.init;

import net.tinusj.eemod.block.CaapiBlock;
import net.tinusj.eemod.ExtraordinaryExtracts;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class ExtraordinaryExtractsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtraordinaryExtracts.MODID);
	public static final RegistryObject<Block> CAAPI = REGISTRY.register("caapi", CaapiBlock::new);
}
