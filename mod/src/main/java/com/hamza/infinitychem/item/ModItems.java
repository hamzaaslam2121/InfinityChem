package com.hamza.infinitychem.item;

import com.hamza.infinitychem.InfinityChemMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InfinityChemMod.MOD_ID);

    public static final RegistryObject<Item> POTASSIUMINGOT =
            ITEMS.register("potassiumingot", () -> new Item(new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> RUBIDIUMINGOT =
            ITEMS.register("rubidiumingot", () -> new Item(new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> CAESIUMINGOT =
            ITEMS.register("caesiumingot", () -> new Item(new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));

    public static final RegistryObject<Item> POTASSIUMSWORD =
            ITEMS.register("potassium_sword", () -> new SwordItem(ModItemTier.POTASSIUM, 2, -2.4f, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> RUBIDIUMSWORD =
            ITEMS.register("rubidium_sword",  () -> new SwordItem(ModItemTier.RUBIDIUM, 3, -1f, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> CAESIUMSWORD =
            ITEMS.register("caesium_sword",  () -> new SwordItem(ModItemTier.CAESIUM, 4, 1f, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));

    public static final RegistryObject<Item> POTASSIUMPICKAXE =
            ITEMS.register("potassium_pickaxe", () -> new PickaxeItem(ModItemTier.POTASSIUM, 0, -2.4f, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> RUBIDIUMPICKAXE =
            ITEMS.register("rubidium_pickaxe", () -> new PickaxeItem(ModItemTier.RUBIDIUM, 0, -2.4f, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> CAESIUMPICKAXE =
            ITEMS.register("caesium_pickaxe", () -> new PickaxeItem(ModItemTier.CAESIUM, 0, -2.4f, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));

    public static final RegistryObject<Item> POTASSIUMAXE =
            ITEMS.register("potassium_axe", () -> new AxeItem(ModItemTier.POTASSIUM, 2, -2.9f, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> RUBIDIUMAXE =
            ITEMS.register("rubidium_axe", () -> new AxeItem(ModItemTier.RUBIDIUM, 2, -2.9f, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> CAESIUMAXE =
            ITEMS.register("caesium_axe", () -> new AxeItem(ModItemTier.CAESIUM, 2, -2.9f, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));

    public static final RegistryObject<Item> POTASSIUMSHOVEL =
            ITEMS.register("potassium_shovel", () -> new ShovelItem(ModItemTier.POTASSIUM, 0, -2.0f, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> RUBIDIUMSHOVEL =
            ITEMS.register("rubidium_shovel", () -> new ShovelItem(ModItemTier.RUBIDIUM, 0, -2.0f, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> CAESIUMSHOVEL =
            ITEMS.register("caesium_shovel", () -> new ShovelItem(ModItemTier.CAESIUM, 0, -2.0f, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));

    public static final RegistryObject<Item> POTASSIUMHOE =
            ITEMS.register("potassium_hoe", () -> new HoeItem(ModItemTier.POTASSIUM, 1, -2.5f, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> RUBIDIUMHOE =
            ITEMS.register("rubidium_hoe", () -> new HoeItem(ModItemTier.RUBIDIUM, 1, -2.5f, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> CAESIUMHOE =
            ITEMS.register("caesium_hoe", () -> new HoeItem(ModItemTier.CAESIUM, 1, -2.5f, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));


    public static final RegistryObject<Item> POTASSIUM_BOOTS =
            ITEMS.register("potassium_boots.json", () -> new ArmorItem(ModArmorMaterial.POTASSIUM, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> POTASSIUM_CHESTPLATE =
            ITEMS.register("potassium_chestplate", () -> new ArmorItem(ModArmorMaterial.POTASSIUM, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> POTASSIUM_LEGGINGS =
            ITEMS.register("potassium_leggings", () -> new ArmorItem(ModArmorMaterial.POTASSIUM, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> POTASSIUM_HELMET =
            ITEMS.register("potassium_helmet", () -> new ArmorItem(ModArmorMaterial.POTASSIUM, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));

    public static final RegistryObject<Item> RUBIDIUM_BOOTS =
            ITEMS.register("rubidium_boots", () -> new ArmorItem(ModArmorMaterial.RUBIDIUM, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> RUBIDIUM_CHESTPLATE =
            ITEMS.register("rubidium_chestplate", () -> new ArmorItem(ModArmorMaterial.RUBIDIUM, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> RUBIDIUM_LEGGINGS =
            ITEMS.register("rubidium_leggings", () -> new ArmorItem(ModArmorMaterial.RUBIDIUM, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> RUBIDIUM_HELMET =
            ITEMS.register("rubidium_helmet", () -> new ArmorItem(ModArmorMaterial.RUBIDIUM, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));

    public static final RegistryObject<Item> CAESIUM_BOOTS =
            ITEMS.register("caesium_boots", () -> new ArmorItem(ModArmorMaterial.CAESIUM, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> CAESIUM_CHESTPLATE =
            ITEMS.register("caesium_chestplate", () -> new ArmorItem(ModArmorMaterial.CAESIUM, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> CAESIUM_LEGGINGS =
            ITEMS.register("caesium_leggings", () -> new ArmorItem(ModArmorMaterial.CAESIUM, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));
    public static final RegistryObject<Item> CAESIUM_HELMET =
            ITEMS.register("caesium_helmet", () -> new ArmorItem(ModArmorMaterial.CAESIUM, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroup.INFINITYCHEM_GROUP)));

    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }
}
