package com.jerielb.additional_stuff.entity;

import com.jerielb.additional_stuff.AdditionalStuff;
import com.jerielb.additional_stuff.entity.custom.JollibeeEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
	public static final EntityType<JollibeeEntity> JOLLIBEE = Registry.register(Registries.ENTITY_TYPE,
			Identifier.of(AdditionalStuff.MOD_ID, "jollibee"),
			EntityType.Builder.create(JollibeeEntity::new, SpawnGroup.MISC)
					.dimensions(1f, 2f).build());
	
	public static void registerModEntities() {
		AdditionalStuff.LOGGER.info("Registering Mod Entities for " + AdditionalStuff.MOD_ID);
	}
}
