package com.hamza.infinitychem.world.gen;

import com.hamza.infinitychem.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {
    POTASSIUM(Lazy.of(ModBlocks.POTASSIUM_ORE), 8, 25, 50),
    RUBIDIUM(Lazy.of(ModBlocks.RUBIDIUM_ORE), 8, 10, 40),
    CAESIUM(Lazy.of(ModBlocks.CAESIUM_ORE), 8, 1, 15);

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }
    public static OreType get(Block block){
        for (OreType ore : values()){
            if(block == ore.block){
                return ore;
            }
        }return null;
    }
}
