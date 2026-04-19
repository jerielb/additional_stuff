package com.jerielb.additional_stuff;

import com.jerielb.additional_stuff.block.ModBlocks;
import com.jerielb.additional_stuff.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelValueEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionalStuff implements ModInitializer {
	public static final String MOD_ID = "additional_stuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.initialize();
		ModBlocks.initialize();
		
		// Add the CHARCOAL_BLOCK to the registry of fuels, with a burn time of 30 seconds.
		// Remember, Minecraft deals with logical based-time using ticks.
		// 20 ticks = 1 second.
		FuelValueEvents.BUILD.register((builder, context) -> {
			builder.add(ModBlocks.CHARCOAL_BLOCK, 16000);
		});
	}
}