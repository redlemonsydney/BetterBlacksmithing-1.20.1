package net.redlemon.better_blacksmithing;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redlemon.better_blacksmithing.block.ModBlocks;
import net.redlemon.better_blacksmithing.block.entity.ModBlockEntities;
import net.redlemon.better_blacksmithing.item.ModItems;
import net.redlemon.better_blacksmithing.misc.ClearGrass;
import net.redlemon.better_blacksmithing.recipe.ModRecipes;
import net.redlemon.better_blacksmithing.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterBlacksmithing implements ModInitializer {
	public static final String MOD_ID = "better_blacksmithing";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();

		ModScreenHandlers.registerScreenHandlers();

		ModRecipes.registerRecipes();

		ClearGrass.register();
	}
}