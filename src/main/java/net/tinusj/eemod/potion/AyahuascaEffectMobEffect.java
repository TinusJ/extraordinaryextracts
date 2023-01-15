
package net.tinusj.eemod.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AyahuascaEffectMobEffect extends MobEffect {
	public AyahuascaEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -5897788);
	}

	@Override
	public String getDescriptionId() {
		return "effect.extraordinary_extracts.ayahuasca_effect";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
