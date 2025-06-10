package com.jerielb.additional_stuff;

import com.jerielb.additional_stuff.block.ModBlocks;
import com.jerielb.additional_stuff.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionalStuff implements ModInitializer {
	public static final String MOD_ID = "additional_stuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		
		// Fuel
		FuelRegistry.INSTANCE.add(ModBlocks.CHARCOAL_BLOCK, 16000);
	}
}