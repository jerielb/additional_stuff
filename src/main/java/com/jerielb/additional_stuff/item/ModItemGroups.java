package com.jerielb.additional_stuff.item;

import com.jerielb.additional_stuff.AdditionalStuff;
import com.jerielb.additional_stuff.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	// tab group for BLOCKS
	public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(AdditionalStuff.MOD_ID, "additional_blocks"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(ModBlocks.CHARCOAL_BLOCK)) // icon of the creative tab
					.displayName(Text.translatable("itemgroup.additional_stuff.additional_blocks")) // to be changed in /lang/en_us.json
					.entries((displayContext, entries) -> {
						// add blocks
						entries.add(ModBlocks.CHARCOAL_BLOCK);
						
						entries.add(ModBlocks.WHITE_SLIME_BLOCK);
						entries.add(ModBlocks.LIGHT_GRAY_SLIME_BLOCK);
						entries.add(ModBlocks.GRAY_SLIME_BLOCK);
						entries.add(ModBlocks.BLACK_SLIME_BLOCK);
						entries.add(ModBlocks.BROWN_SLIME_BLOCK);
						entries.add(ModBlocks.RED_SLIME_BLOCK);
						entries.add(ModBlocks.ORANGE_SLIME_BLOCK);
						entries.add(ModBlocks.YELLOW_SLIME_BLOCK);
						entries.add(ModBlocks.GREEN_SLIME_BLOCK);
						entries.add(ModBlocks.CYAN_SLIME_BLOCK);
						entries.add(ModBlocks.LIGHT_BLUE_SLIME_BLOCK);
						entries.add(ModBlocks.BLUE_SLIME_BLOCK);
						entries.add(ModBlocks.PURPLE_SLIME_BLOCK);
						entries.add(ModBlocks.MAGENTA_SLIME_BLOCK);
						entries.add(ModBlocks.PINK_SLIME_BLOCK);
					})
					.build());
	
	// ADDITIONAL_FOODS
	public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(AdditionalStuff.MOD_ID, "additional_items"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(ModItems.FRIES)) // icon of the creative tab
					.displayName(Text.translatable("itemgroup.additional_stuff.additional_items")) // to be changed in /lang/en_us.json
					.entries((displayContext, entries) -> {
						// Meals
						entries.add(ModItems.CHICKEN_JOY);
						entries.add(ModItems.JOLLY_SPAGHETTI);
						entries.add(ModItems.PALABOK);
						entries.add(ModItems.BURGER_STEAK);
						
						// Burgers
						entries.add(ModItems.YUM_BURGER);
						entries.add(ModItems.CHAMP_BURGER);
						entries.add(ModItems.JOLLY_HOTDOG);
						
						// Sides
						entries.add(ModItems.FRIES);
						entries.add(ModItems.CHICKEN_NUGGETS);
						
						// Deserts
						entries.add(ModItems.PEACH_MANGO_PIE);
						
						// Street Food
						entries.add(ModItems.FISH_BALL);
						
						// Blocks
						entries.add(ModBlocks.QUARTZ_BLOCK);
					})
					.build());
	
	public static void registerItemGroups() {
		AdditionalStuff.LOGGER.info("Registering Item Groups for " + AdditionalStuff.MOD_ID);
	}
}
