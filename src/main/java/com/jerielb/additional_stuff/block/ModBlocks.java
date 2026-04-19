package com.jerielb.additional_stuff.block;

import com.jerielb.additional_stuff.AdditionalStuff;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlimeBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;

public class ModBlocks {
	public static final Block CHARCOAL_BLOCK = registerBlock(
			"charcoal_block",
			Block::new,
			BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK),
			true
	);
	
	// Slime blocks
	public static final Block SLIME_BLOCK_BLACK = registerBlock(
			"slime_block_black",
			SlimeBlock::new,
			BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion(),
			true
	);
	public static final Block SLIME_BLOCK_BLUE = registerBlock(
			"slime_block_blue",
			SlimeBlock::new,
			BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion(),
			true
	);
	public static final Block SLIME_BLOCK_BROWN = registerBlock(
			"slime_block_brown",
			SlimeBlock::new,
			BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion(),
			true
	);
	public static final Block SLIME_BLOCK_CYAN = registerBlock(
			"slime_block_cyan",
			SlimeBlock::new,
			BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion(),
			true
	);
	public static final Block SLIME_BLOCK_GRAY = registerBlock(
			"slime_block_gray",
			SlimeBlock::new,
			BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion(),
			true
	);
	public static final Block SLIME_BLOCK_GREEN = registerBlock(
			"slime_block_green",
			SlimeBlock::new,
			BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion(),
			true
	);
	public static final Block SLIME_BLOCK_LIGHT_BLUE = registerBlock(
			"slime_block_light_blue",
			SlimeBlock::new,
			BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion(),
			true
	);
	public static final Block SLIME_BLOCK_LIGHT_GRAY = registerBlock(
			"slime_block_light_gray",
			SlimeBlock::new,
			BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion(),
			true
	);
	public static final Block SLIME_BLOCK_MAGENTA = registerBlock(
			"slime_block_magenta",
			SlimeBlock::new,
			BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion(),
			true
	);
	public static final Block SLIME_BLOCK_ORANGE = registerBlock(
			"slime_block_orange",
			SlimeBlock::new,
			BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion(),
			true
	);
	public static final Block SLIME_BLOCK_PINK = registerBlock(
			"slime_block_pink",
			SlimeBlock::new,
			BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion(),
			true
	);
	public static final Block SLIME_BLOCK_PURPLE = registerBlock(
			"slime_block_purple",
			SlimeBlock::new,
			BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion(),
			true
	);
	public static final Block SLIME_BLOCK_RED = registerBlock(
			"slime_block_red",
			SlimeBlock::new, 
			BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion(),
			true
	);
	public static final Block SLIME_BLOCK_WHITE = registerBlock(
			"slime_block_white",
			SlimeBlock::new,
			BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion(),
			true
	);
	public static final Block SLIME_BLOCK_YELLOW = registerBlock(
			"slime_block_yellow",
			SlimeBlock::new,
			BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion(),
			true
	);
	
	// helper methods
	private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem) {
		// Create a registry key for the block
		ResourceKey<Block> blockKey = keyOfBlock(name);
		// Create the block instance
		Block block = blockFactory.apply(settings.setId(blockKey));
		
		// Sometimes, you may not want to register an item for the block.
		// Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
		if (shouldRegisterItem) {
			// Items need to be registered with a different type of registry key, but the ID
			// can be the same.
			ResourceKey<Item> itemKey = keyOfItem(name);
			
			BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
			Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
		}
		
		return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
	}
	
	private static ResourceKey<Block> keyOfBlock(String name) {
		return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(AdditionalStuff.MOD_ID, name));
	}
	
	private static ResourceKey<Item> keyOfItem(String name) {
		return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdditionalStuff.MOD_ID, name));
	}
	
	public static void initialize() {
		AdditionalStuff.LOGGER.info("Registering Mod Blocks for " + AdditionalStuff.MOD_ID);
	}
}
