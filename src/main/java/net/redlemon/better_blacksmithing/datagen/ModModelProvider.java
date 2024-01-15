package net.redlemon.better_blacksmithing.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.redlemon.better_blacksmithing.block.ModBlocks;
import net.redlemon.better_blacksmithing.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRONZE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PLEASE_WORK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLEASE_WORK_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COPPER_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_CHUNK, Models.GENERATED);

        itemModelGenerator.register(ModItems.MALLEABLE_COPPER_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MALLEABLE_BRONZE_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MALLEABLE_IRON_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MALLEABLE_STEEL_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MALLEABLE_GOLD_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MALLEABLE_NETHERITE_CHUNK, Models.GENERATED);

        itemModelGenerator.register(ModItems.ZINC_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MALLEABLE_ZINC_CHUNK, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.CRUDE_CLUB, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRUDE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRUDE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRUDE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIGGING_STICK, Models.HANDHELD);

        itemModelGenerator.register(ModItems.IRON_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_GREATSWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.OBSIDIAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_CLUB, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_SPEAR, Models.HANDHELD);

        itemModelGenerator.register(ModItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SCYTHE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.BRONZE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_SCYTHE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SCYTHE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.GOLDEN_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_GREATSWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.DIAMOND_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_GREATSWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.NETHERITE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_GREATSWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.COPPER_SHOVEL_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_PICKAXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_AXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_HOE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_KNIFE_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_SWORD_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_GREATSWORD_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_SPEAR_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_HAMMER_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_SCYTHE_BLADE, Models.GENERATED);

        itemModelGenerator.register(ModItems.BRONZE_SHOVEL_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_PICKAXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_AXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_HOE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_KNIFE_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_SWORD_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_GREATSWORD_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_SPEAR_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_HAMMER_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_SCYTHE_BLADE, Models.GENERATED);

        itemModelGenerator.register(ModItems.IRON_SHOVEL_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_PICKAXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_AXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_HOE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_KNIFE_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_SWORD_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_GREATSWORD_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_SPEAR_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_HAMMER_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_SCYTHE_BLADE, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_SHOVEL_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_AXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_HOE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_KNIFE_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_SWORD_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_GREATSWORD_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_SPEAR_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_HAMMER_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_SCYTHE_BLADE, Models.GENERATED);

        itemModelGenerator.register(ModItems.GOLDEN_SHOVEL_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_PICKAXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_AXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_HOE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_KNIFE_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_SWORD_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_GREATSWORD_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_SPEAR_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_HAMMER_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_SCYTHE_BLADE, Models.GENERATED);

        itemModelGenerator.register(ModItems.DIAMOND_SHOVEL_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_PICKAXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_AXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_HOE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_KNIFE_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_SWORD_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_GREATSWORD_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_SPEAR_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_HAMMER_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_SCYTHE_BLADE, Models.GENERATED);

        itemModelGenerator.register(ModItems.NETHERITE_SHOVEL_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_PICKAXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_AXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_HOE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_KNIFE_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_SWORD_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_GREATSWORD_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_SPEAR_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_HAMMER_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_SCYTHE_BLADE, Models.GENERATED);


    }
}
