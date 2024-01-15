package net.redlemon.better_blacksmithing.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redlemon.better_blacksmithing.BetterBlacksmithing;
import net.redlemon.better_blacksmithing.block.custom.BBFurnaceBlock;
import net.redlemon.better_blacksmithing.block.custom.PleaseFuckingWorkBlock;

public class ModBlocks {

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new BBFurnaceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));

    public static final Block PLEASE_WORK_BLOCK = registerBlock("please_work_block",
            new PleaseFuckingWorkBlock(FabricBlockSettings.copyOf(Blocks.FURNACE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BetterBlacksmithing.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BetterBlacksmithing.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        BetterBlacksmithing.LOGGER.info("Registering ModBlocks for " + BetterBlacksmithing.MOD_ID);
    }

}
