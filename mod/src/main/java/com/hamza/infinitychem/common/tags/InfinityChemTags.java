package com.hamza.infinitychem.common.tags;

import com.hamza.infinitychem.InfinityChemMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class InfinityChemTags {

    public static class Blocks {
        public static final Tags.IOptionalNamedTag<Block> CAESIUM_CLICKABLE_BLOCKS =
                createTag("caesium_clickable_blocks");

        private static Tags.IOptionalNamedTag<Block> createTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(InfinityChemMod.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }
    public static class Items {
        public static final Tags.IOptionalNamedTag<Item> POTASSIUMINGOT = createForgeTag("ingots/potassiumingot");
        public static final Tags.IOptionalNamedTag<Item> RUBIDIUMINGOT = createForgeTag("ingots/rubidiumingot");
        public static final Tags.IOptionalNamedTag<Item> CAESIUMINGOT = createForgeTag("ingots/caesiumingot");

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(InfinityChemMod.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}
