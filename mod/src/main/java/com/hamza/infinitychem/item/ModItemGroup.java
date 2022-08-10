package com.hamza.infinitychem.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup INFINITYCHEM_GROUP = new ItemGroup("infinityChemTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.POTASSIUMINGOT.get());
        }

    };


}
