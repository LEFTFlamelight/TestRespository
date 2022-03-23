package com.testmod.entity;

import com.testmod.Testmod;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeRegistry {
    public static final DeferredRegister<EntityType<?>>ENTITY_TYPES=DeferredRegister.create(ForgeRegistries.ENTITIES, Testmod.MOD_ID);
    public static final RegistryObject<EntityType<TestEntity>> TEST_ENTITY = ENTITY_TYPES.register("test_entity",
            ()->EntityType.Builder.create(TestEntity::new, EntityClassification.MONSTER).size(3, 0.5F).build("test_entity"));
}
