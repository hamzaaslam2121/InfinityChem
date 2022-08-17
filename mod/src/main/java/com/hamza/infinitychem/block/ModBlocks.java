package com.hamza.infinitychem.block;

import com.hamza.infinitychem.InfinityChemMod;
import com.hamza.infinitychem.common.tags.InfinityChemTags;
import com.hamza.infinitychem.item.ModItemGroup;
import com.hamza.infinitychem.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, InfinityChemMod.MOD_ID);

    public static final RegistryObject<Block> POTASSIUM_ORE =
            registerBlock("potassium_ore",
                    () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(3)));

    public static final RegistryObject<Block> POTASSIUM_BLOCK =
            registerBlock("potassium_block",
                    () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(3)));

    public static final RegistryObject<Block> RUBIDIUM_ORE =
            registerBlock("rubidium_ore",
                    () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(4)));

    public static final RegistryObject<Block> RUBIDIUM_BLOCK =
            registerBlock("rubidium_block",
                    () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(4)));

    public static final RegistryObject<Block> CAESIUM_ORE =
            registerBlock("caesium_ore",
                    () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5)));

    public static final RegistryObject<Block> CAESIUM_BLOCK =
            registerBlock("caesium_block",
                    () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5)));

    //public static final RegistryObject<Block> CustomEnergyStorage =
     //       registerBlock("generator",
       //             () -> new Block(Block.Properties.create(Material.ROCK).harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5)));

    private boolean blockIsValidForResistance(BlockState clickedBlock){
        return clickedBlock.isIn(InfinityChemTags.Blocks.CAESIUM_CLICKABLE_BLOCKS);
    }



    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
