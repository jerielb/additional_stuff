package com.jerielb.additional_stuff.item;

import com.jerielb.additional_stuff.AdditionalStuff;
import com.jerielb.additional_stuff.block.ModBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
	// tab group for ITEMS
	public static final ResourceKey<CreativeModeTab> ADDITIONAL_STUFF_CREATIVE_TAB_KEY = ResourceKey.create(
			BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(AdditionalStuff.MOD_ID, "additional_food")
	);
	public static final CreativeModeTab ADDITIONAL_STUFF_CREATIVE_TAB = FabricCreativeModeTab.builder()
			.icon(() -> new ItemStack(ModBlocks.CHARCOAL_BLOCK))
			.title(Component.translatable("creativeTab.additional_stuff"))
			.displayItems((params, output) -> {
				// ### BLOCKS ###
				output.accept(ModBlocks.CHARCOAL_BLOCK);
				
				output.accept(ModBlocks.SLIME_BLOCK_BLACK);
				output.accept(ModBlocks.SLIME_BLOCK_BLUE);
				output.accept(ModBlocks.SLIME_BLOCK_BROWN);
				output.accept(ModBlocks.SLIME_BLOCK_CYAN);
				output.accept(ModBlocks.SLIME_BLOCK_GRAY);
				output.accept(ModBlocks.SLIME_BLOCK_GREEN);
				output.accept(ModBlocks.SLIME_BLOCK_LIGHT_BLUE);
				output.accept(ModBlocks.SLIME_BLOCK_LIGHT_GRAY);
				output.accept(ModBlocks.SLIME_BLOCK_MAGENTA);
				output.accept(ModBlocks.SLIME_BLOCK_ORANGE);
				output.accept(ModBlocks.SLIME_BLOCK_PINK);
				output.accept(ModBlocks.SLIME_BLOCK_PURPLE);
				output.accept(ModBlocks.SLIME_BLOCK_RED);
				output.accept(ModBlocks.SLIME_BLOCK_WHITE);
				output.accept(ModBlocks.SLIME_BLOCK_YELLOW);
			})
			.build();
	
	public static void initialize() {
		AdditionalStuff.LOGGER.info("Registering Item Groups for " + AdditionalStuff.MOD_ID);
		
		// Register the group.
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ADDITIONAL_STUFF_CREATIVE_TAB_KEY, ADDITIONAL_STUFF_CREATIVE_TAB);
	}
}
