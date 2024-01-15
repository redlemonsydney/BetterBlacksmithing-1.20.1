package net.redlemon.better_blacksmithing.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redlemon.better_blacksmithing.BetterBlacksmithing;
import net.redlemon.better_blacksmithing.block.ModBlocks;

public class ModBlockEntities {

    public static final BlockEntityType<BBFurnaceBlockEntity> FURNACE_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(BetterBlacksmithing.MOD_ID, "furnace_block_entity"),
                    FabricBlockEntityTypeBuilder.create(BBFurnaceBlockEntity::new,
                            ModBlocks.STEEL_BLOCK).build(null));


    public static void registerBlockEntities() {
        BetterBlacksmithing.LOGGER.info("Registering Block Entities for " + BetterBlacksmithing.MOD_ID);
    }
}
