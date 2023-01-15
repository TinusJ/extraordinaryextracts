
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.tinusj.eemod.init;

import net.tinusj.eemod.potion.AyahuascaEffectMobEffect;
import net.tinusj.eemod.ExtraordinaryExtracts;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class ExtraordinaryExtractsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ExtraordinaryExtracts.MODID);
	public static final RegistryObject<MobEffect> AYAHUASCA_EFFECT = REGISTRY.register("ayahuasca_effect", () -> new AyahuascaEffectMobEffect());
}
