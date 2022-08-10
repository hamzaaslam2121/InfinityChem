package com.hamza.infinitychem.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.energy.IEnergyStorage;

public class ChemGenerator extends Block implements IEnergyStorage {
    protected int energy;
    protected int capacity;
    protected int limitReceive;
    protected int limitExtract;

    public ChemGenerator(int capacity)
    {
        this(capacity, capacity, capacity, 0);
    }

    public ChemGenerator(int capacity, int maxTransfer)
    {
        this(capacity, maxTransfer, maxTransfer, 0);
    }

    public ChemGenerator(int capacity, int maxReceive, int maxExtract)
    {
        this(capacity, maxReceive, maxExtract, 0);
    }

    public ChemGenerator(int capacity, int maxReceive, int maxExtract, int energy)
    {
        super()
        this.capacity = capacity;
        this.limitReceive = maxReceive;
        this.limitExtract = maxExtract;
        this.energy = Math.max(0 , Math.min(capacity, energy));
    }

    public ChemGenerator(Properties properties) {
        super(properties);
    }


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
    public int receiveEnergy(int maxReceive, boolean simulate) {
        int received = Math.min(capacity-this.energy, Math.min(this.limitReceive, energy));
        if(!simulate)
            this.energy += received;
        return received;
    }
    @Override
    public int extractEnergy(int energy, boolean simulate)
    {
        int extracted = Math.min(this.energy, Math.min(this.limitExtract, energy));
        if(!simulate)
            this.energy -= extracted;
        return extracted;
    }
    @Override
    public int getEnergyStored()
    {
        return energy;
    }
    @Override
    public int getMaxEnergyStored()
    {
        return capacity;
    }

    @Override
    public boolean canExtract() {
        return false;
    }
    @Override
    public boolean canReceive() {
        return false;
    }
}
