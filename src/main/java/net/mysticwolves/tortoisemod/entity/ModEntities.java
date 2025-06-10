package net.mysticwolves.tortoisemod.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.mysticwolves.tortoisemod.TortoiseMod;
import net.mysticwolves.tortoisemod.entity.custom.TortoiseEntity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, TortoiseMod.MOD_ID);

//for some reason ENTITY_TYPES.register's tortoise cannot be capitalized
    public static final Supplier<EntityType<TortoiseEntity>> tortoise =
            ENTITY_TYPES.register("tortoise", () -> EntityType.Builder.of(TortoiseEntity::new, MobCategory.CREATURE)
                    .sized(0.75f, 0.75f).build("Tortoise"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
