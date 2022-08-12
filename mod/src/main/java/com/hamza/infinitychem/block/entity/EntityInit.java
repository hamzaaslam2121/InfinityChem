package com.hamza.infinitychem.block.entity;

import com.hamza.infinitychem.InfinityChemMod;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryBuilder;

public final class EntityInit {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister
            .create(ForgeRegistries.ENTITIES, InfinityChemMod.MOD_ID);

    public static final RegistryBuilder<EntityType<ExampleEntity>> EXAMPLE_ENTITY = ENTITIES.register(
            "example_entity",
            () -> EntityType.Builder.of(ExampleEntity::new, MobCategory.CREATURE).sized(0.8f, 0.6f)
                    .build(new ResourceLocation(InfinityChemMod.MOD_ID, "example_entity").toString()));

    public static final RegistryObject<EntityType<SittableEntity>> SEAT = ENTITIES.register("seat",
            () -> EntityType.Builder.<SittableEntity>of(SittableEntity::new, MobCategory.MISC).sized(1f, 1f)
                    .build(new ResourceLocation(InfinityChemMod.MOD_ID, "seat").toString()));

    private EntityInit() {
    }
}
