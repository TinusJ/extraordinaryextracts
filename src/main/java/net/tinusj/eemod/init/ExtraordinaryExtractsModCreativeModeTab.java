package net.tinusj.eemod.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ExtraordinaryExtractsModCreativeModeTab {

    public static final CreativeModeTab EE_TAB = new CreativeModeTab("extraordinary_extracts") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.JUMPY_BLOCK.get());
        }
    };
}
