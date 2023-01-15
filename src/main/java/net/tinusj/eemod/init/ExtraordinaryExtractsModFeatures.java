
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tinusj.eemod.init;

import net.tinusj.eemod.ExtraordinaryExtracts;
import net.tinusj.eemod.world.features.plants.CaapiFeature;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class ExtraordinaryExtractsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ExtraordinaryExtracts.MODID);
	public static final RegistryObject<Feature<?>> CAAPI = REGISTRY.register("caapi", CaapiFeature::feature);
}
