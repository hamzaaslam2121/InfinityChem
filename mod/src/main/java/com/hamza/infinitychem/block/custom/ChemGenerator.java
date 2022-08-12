package com.hamza.infinitychem.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.energy.IEnergyStorage;

import javax.annotation.Nullable;
import java.util.List;

public class ChemGenerator extends Block implements IEnergyStorage {


    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if(!worldIn.isRemote()){
            if(handIn == Hand.MAIN_HAND){
                System.out.println("Right clicked, called for MAIN hand");
            }
            if(handIn == Hand.OFF_HAND){
                System.out.println("Right clicked, called for OFF hand");
            }

        }

        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        if(Screen.hasShiftDown()){
            tooltip.add(new TranslationTextComponent("tooltip.infinitychem.ChemGenerator.shift"));
        }else {
            tooltip.add(new TranslationTextComponent("tooltip.infinitychem.ChemGenerator"));
        }

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
