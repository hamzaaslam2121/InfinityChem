package com.hamza.infinitychem.item;

import com.hamza.infinitychem.InfinityChemMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InfinityChemMod.MOD_ID);

    public static final RegistryObject<Item> POTASSIUMINGOT =
            ITEMS.register("potassiumingot", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }
}
