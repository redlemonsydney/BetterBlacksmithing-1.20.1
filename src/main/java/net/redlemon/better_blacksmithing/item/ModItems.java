package net.redlemon.better_blacksmithing.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redlemon.better_blacksmithing.BetterBlacksmithing;
import net.redlemon.better_blacksmithing.block.ModBlocks;
import net.redlemon.better_blacksmithing.item.custom.*;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterBlacksmithing.MOD_ID, name), item);
    }

    public static final Item COPPER_CHUNK = registerItem("copper_chunk",
            new Item(new FabricItemSettings()));
    public static final Item BRONZE_CHUNK = registerItem("bronze_chunk",
            new Item(new FabricItemSettings()));
    public static final Item IRON_CHUNK = registerItem("iron_chunk",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_CHUNK = registerItem("steel_chunk",
            new Item(new FabricItemSettings()));
    public static final Item GOLD_CHUNK = registerItem("gold_chunk",
            new Item(new FabricItemSettings()));
    public static final Item NETHERITE_CHUNK = registerItem("netherite_chunk",
            new Item(new FabricItemSettings()));

    public static final Item ZINC_CHUNK = registerItem("zinc_chunk",
            new Item(new FabricItemSettings()));

    public static final Item MALLEABLE_COPPER_CHUNK = registerItem("malleable_copper_chunk",
            new Item(new FabricItemSettings()));
    public static final Item MALLEABLE_BRONZE_CHUNK = registerItem("malleable_bronze_chunk",
            new Item(new FabricItemSettings()));
    public static final Item MALLEABLE_IRON_CHUNK = registerItem("malleable_iron_chunk",
            new Item(new FabricItemSettings()));
    public static final Item MALLEABLE_STEEL_CHUNK = registerItem("malleable_steel_chunk",
            new Item(new FabricItemSettings()));
    public static final Item MALLEABLE_GOLD_CHUNK = registerItem("malleable_gold_chunk",
            new Item(new FabricItemSettings()));
    public static final Item MALLEABLE_NETHERITE_CHUNK = registerItem("malleable_netherite_chunk",
            new Item(new FabricItemSettings()));


    public static final Item MALLEABLE_ZINC_CHUNK = registerItem("malleable_zinc_chunk",
            new Item(new FabricItemSettings()));

    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget",
            new Item(new FabricItemSettings()));

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot",
            new Item(new FabricItemSettings()));
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget",
            new Item(new FabricItemSettings()));

    public static final Item CRUDE_AXE = registerItem("crude_axe",
            new AxeItem(ModToolMaterial.CRUDE, 6, -3.2f, new FabricItemSettings()));
    public static final Item CRUDE_HAMMER = registerItem("crude_hammer",
            new HammerItem(ModToolMaterial.CRUDE, 7, -3.8f, new FabricItemSettings()));
    public static final Item CRUDE_CLUB = registerItem("crude_club",
            new SwordItem(ModToolMaterial.CRUDE, 3, -2.4f, new FabricItemSettings()));
    public static final Item CRUDE_SPEAR = registerItem("crude_spear",
            new SwordItem(ModToolMaterial.CRUDE, 3, -3.2f, new FabricItemSettings()));
    public static final Item DIGGING_STICK = registerItem("digging_stick",
            new DiggingStickItem(ModToolMaterial.CRUDE, 0.5f, -3f, new FabricItemSettings()));

    public static final Item OBSIDIAN_AXE = registerItem("obsidian_axe",
            new AxeItem(ModToolMaterial.OBSIDIAN, 5, -3.0f, new FabricItemSettings()));
    public static final Item OBSIDIAN_CLUB = registerItem("obsidian_club",
            new SwordItem(ModToolMaterial.OBSIDIAN, 3, -2.4f, new FabricItemSettings()));
    public static final Item OBSIDIAN_KNIFE = registerItem("obsidian_knife",
            new KnifeItem(ModToolMaterial.OBSIDIAN, 0.5f, -2f, new FabricItemSettings()));
    public static final Item OBSIDIAN_SPEAR = registerItem("obsidian_spear",
            new SwordItem(ModToolMaterial.OBSIDIAN, 3, -3.2f, new FabricItemSettings()));

    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterial.COPPER, 7.0f, -3.2f, new FabricItemSettings()));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterial.COPPER, 1, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.COPPER, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterial.COPPER, -1, -2.0f, new FabricItemSettings()));
    public static final Item COPPER_KNIFE = registerItem("copper_knife",
            new KnifeItem(ModToolMaterial.COPPER, 0.5f, -2f, new FabricItemSettings()));
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.COPPER, 3, -2.4f, new FabricItemSettings()));
    public static final Item COPPER_GREATSWORD = registerItem("copper_greatsword",
            new GreatSwordItem(ModToolMaterial.COPPER, 3, -3.2f, new FabricItemSettings()));
    public static final Item COPPER_SPEAR = registerItem("copper_spear",
            new SwordItem(ModToolMaterial.COPPER, 3, -3.2f, new FabricItemSettings()));
    public static final Item COPPER_HAMMER = registerItem("copper_hammer",
            new HammerItem(ModToolMaterial.COPPER, 8, -3.4f, new FabricItemSettings()));
    public static final Item COPPER_SCYTHE = registerItem("copper_scythe",
            new ScytheItem(ModToolMaterial.COPPER, 1, -2.4f, new FabricItemSettings()));

    public static final Item BRONZE_AXE = registerItem("bronze_axe",
            new AxeItem(ModToolMaterial.BRONZE, 7.0f, -3.2f, new FabricItemSettings()));
    public static final Item BRONZE_PICKAXE = registerItem("bronze_pickaxe",
            new PickaxeItem(ModToolMaterial.BRONZE, 1, -2.8f, new FabricItemSettings()));
    public static final Item BRONZE_SHOVEL = registerItem("bronze_shovel",
            new ShovelItem(ModToolMaterial.BRONZE, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item BRONZE_HOE = registerItem("bronze_hoe",
            new HoeItem(ModToolMaterial.BRONZE, -1, -2.0f, new FabricItemSettings()));
    public static final Item BRONZE_KNIFE = registerItem("bronze_knife",
            new KnifeItem(ModToolMaterial.BRONZE, 0.5f, -2f, new FabricItemSettings()));
    public static final Item BRONZE_SWORD = registerItem("bronze_sword",
            new SwordItem(ModToolMaterial.BRONZE, 3, -2.4f, new FabricItemSettings()));
    public static final Item BRONZE_GREATSWORD = registerItem("bronze_greatsword",
            new GreatSwordItem(ModToolMaterial.BRONZE, 3, -3.2f, new FabricItemSettings()));
    public static final Item BRONZE_SPEAR = registerItem("bronze_spear",
            new SwordItem(ModToolMaterial.BRONZE, 3, -3.2f, new FabricItemSettings()));
    public static final Item BRONZE_HAMMER = registerItem("bronze_hammer",
            new HammerItem(ModToolMaterial.BRONZE, 8, -3.4f, new FabricItemSettings()));
    public static final Item BRONZE_SCYTHE = registerItem("bronze_scythe",
            new ScytheItem(ModToolMaterial.BRONZE, 1, -2.4f, new FabricItemSettings()));

    public static final Item IRON_GREATSWORD = registerItem("iron_greatsword",
            new GreatSwordItem(ToolMaterials.IRON, 3, -3.1f, new FabricItemSettings()));
    public static final Item IRON_HAMMER = registerItem("iron_hammer",
            new HammerItem(ToolMaterials.IRON, 7, -3.3f, new FabricItemSettings()));
    public static final Item IRON_SCYTHE = registerItem("iron_scythe",
            new ScytheItem(ToolMaterials.IRON, 1, -2.4f, new FabricItemSettings()));
    public static final Item IRON_SPEAR = registerItem("iron_spear",
            new SwordItem(ToolMaterials.IRON, 3, -3.2f, new FabricItemSettings()));

    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterial.STEEL, 6.0f, -3.1f, new FabricItemSettings()));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterial.STEEL, 1, -2.8f, new FabricItemSettings()));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterial.STEEL, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterial.STEEL, -2, -1.0f, new FabricItemSettings()));
    public static final Item STEEL_KNIFE = registerItem("steel_knife",
            new KnifeItem(ModToolMaterial.STEEL, 0.5f, -2f, new FabricItemSettings()));
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterial.STEEL, 3, -2.4f, new Item.Settings()));
    public static final Item STEEL_GREATSWORD = registerItem("steel_greatsword",
            new GreatSwordItem(ModToolMaterial.STEEL, 3, -3.1f, new FabricItemSettings()));
    public static final Item STEEL_HAMMER = registerItem("steel_hammer",
            new HammerItem(ModToolMaterial.STEEL, 7, -3.3f, new FabricItemSettings()));
    public static final Item STEEL_SCYTHE = registerItem("steel_scythe",
            new ScytheItem(ModToolMaterial.STEEL, 1, -2.4f, new FabricItemSettings()));
    public static final Item STEEL_SPEAR = registerItem("steel_spear",
            new SwordItem(ModToolMaterial.STEEL, 3, -3.2f, new FabricItemSettings()));

    public static final Item GOLDEN_GREATSWORD = registerItem("golden_greatsword",
            new GreatSwordItem(ToolMaterials.GOLD, 3, -3.2f, new FabricItemSettings()));
    public static final Item GOLDEN_HAMMER = registerItem("golden_hammer",
            new HammerItem(ToolMaterials.GOLD, 7, -3.4f, new FabricItemSettings()));
    public static final Item GOLDEN_SCYTHE = registerItem("golden_scythe",
            new ScytheItem(ToolMaterials.GOLD, 1, -2.4f, new FabricItemSettings()));
    public static final Item GOLDEN_SPEAR = registerItem("golden_spear",
            new SwordItem(ToolMaterials.GOLD, 3, -3.2f, new FabricItemSettings()));

    public static final Item DIAMOND_GREATSWORD = registerItem("diamond_greatsword",
            new GreatSwordItem(ToolMaterials.DIAMOND, 3, -3.0f, new FabricItemSettings()));
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new HammerItem(ToolMaterials.DIAMOND, 6, -3.3f, new FabricItemSettings()));
    public static final Item DIAMOND_SCYTHE = registerItem("diamond_scythe",
            new ScytheItem(ToolMaterials.DIAMOND, 1, -2.4f, new FabricItemSettings()));
    public static final Item DIAMOND_SPEAR = registerItem("diamond_spear",
            new SwordItem(ToolMaterials.DIAMOND, 3, -3.0f, new FabricItemSettings()));

    public static final Item NETHERITE_GREATSWORD = registerItem("netherite_greatsword",
            new GreatSwordItem(ToolMaterials.NETHERITE, 3, -3.0f, new FabricItemSettings()));
    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new HammerItem(ToolMaterials.NETHERITE, 6, -3.3f, new FabricItemSettings()));
    public static final Item NETHERITE_SCYTHE = registerItem("netherite_scythe",
            new ScytheItem(ToolMaterials.NETHERITE, 1, -2.4f, new FabricItemSettings()));
    public static final Item NETHERITE_SPEAR = registerItem("netherite_spear",
            new SwordItem(ToolMaterials.NETHERITE, 3, -3.0f, new FabricItemSettings()));

    public static final Item COPPER_AXE_HEAD = registerItem("copper_axe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item COPPER_PICKAXE_HEAD = registerItem("copper_pickaxe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item COPPER_SHOVEL_HEAD = registerItem("copper_shovel_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item COPPER_HOE_HEAD = registerItem("copper_hoe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item COPPER_SWORD_BLADE = registerItem("copper_sword_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item COPPER_KNIFE_BLADE = registerItem("copper_knife_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item COPPER_GREATSWORD_BLADE = registerItem("copper_greatsword_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item COPPER_SPEAR_HEAD = registerItem("copper_spear_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item COPPER_HAMMER_HEAD = registerItem("copper_hammer_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item COPPER_SCYTHE_BLADE = registerItem("copper_scythe_blade",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item BRONZE_AXE_HEAD = registerItem("bronze_axe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item BRONZE_PICKAXE_HEAD = registerItem("bronze_pickaxe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item BRONZE_SHOVEL_HEAD = registerItem("bronze_shovel_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item BRONZE_HOE_HEAD = registerItem("bronze_hoe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item BRONZE_SWORD_BLADE = registerItem("bronze_sword_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item BRONZE_KNIFE_BLADE = registerItem("bronze_knife_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item BRONZE_GREATSWORD_BLADE = registerItem("bronze_greatsword_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item BRONZE_SPEAR_HEAD = registerItem("bronze_spear_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item BRONZE_HAMMER_HEAD = registerItem("bronze_hammer_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item BRONZE_SCYTHE_BLADE = registerItem("bronze_scythe_blade",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item IRON_SWORD_BLADE = registerItem("iron_sword_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item IRON_PICKAXE_HEAD = registerItem("iron_pickaxe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item IRON_AXE_HEAD = registerItem("iron_axe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item IRON_SHOVEL_HEAD = registerItem("iron_shovel_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item IRON_HOE_HEAD = registerItem("iron_hoe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item IRON_KNIFE_BLADE = registerItem("iron_knife_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item IRON_GREATSWORD_BLADE = registerItem("iron_greatsword_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item IRON_SPEAR_HEAD = registerItem("iron_spear_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item IRON_HAMMER_HEAD = registerItem("iron_hammer_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item IRON_SCYTHE_BLADE = registerItem("iron_scythe_blade",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item STEEL_SWORD_BLADE = registerItem("steel_sword_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item STEEL_PICKAXE_HEAD = registerItem("steel_pickaxe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item STEEL_AXE_HEAD = registerItem("steel_axe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item STEEL_SHOVEL_HEAD = registerItem("steel_shovel_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item STEEL_HOE_HEAD = registerItem("steel_hoe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item STEEL_KNIFE_BLADE = registerItem("steel_knife_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item STEEL_GREATSWORD_BLADE = registerItem("steel_greatsword_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item STEEL_SPEAR_HEAD = registerItem("steel_spear_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item STEEL_HAMMER_HEAD = registerItem("steel_hammer_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item STEEL_SCYTHE_BLADE = registerItem("steel_scythe_blade",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item GOLDEN_SWORD_BLADE = registerItem("golden_sword_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item GOLDEN_PICKAXE_HEAD = registerItem("golden_pickaxe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item GOLDEN_AXE_HEAD = registerItem("golden_axe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item GOLDEN_SHOVEL_HEAD = registerItem("golden_shovel_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item GOLDEN_HOE_HEAD = registerItem("golden_hoe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item GOLDEN_KNIFE_BLADE = registerItem("golden_knife_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item GOLDEN_GREATSWORD_BLADE = registerItem("golden_greatsword_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item GOLDEN_SPEAR_HEAD = registerItem("golden_spear_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item GOLDEN_HAMMER_HEAD = registerItem("golden_hammer_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item GOLDEN_SCYTHE_BLADE = registerItem("golden_scythe_blade",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item DIAMOND_SWORD_BLADE = registerItem("diamond_sword_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item DIAMOND_PICKAXE_HEAD = registerItem("diamond_pickaxe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item DIAMOND_AXE_HEAD = registerItem("diamond_axe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item DIAMOND_SHOVEL_HEAD = registerItem("diamond_shovel_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item DIAMOND_HOE_HEAD = registerItem("diamond_hoe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item DIAMOND_KNIFE_BLADE = registerItem("diamond_knife_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item DIAMOND_GREATSWORD_BLADE = registerItem("diamond_greatsword_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item DIAMOND_SPEAR_HEAD = registerItem("diamond_spear_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item DIAMOND_HAMMER_HEAD = registerItem("diamond_hammer_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item DIAMOND_SCYTHE_BLADE = registerItem("diamond_scythe_blade",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item NETHERITE_SWORD_BLADE = registerItem("netherite_sword_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item NETHERITE_PICKAXE_HEAD = registerItem("netherite_pickaxe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item NETHERITE_AXE_HEAD = registerItem("netherite_axe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item NETHERITE_SHOVEL_HEAD = registerItem("netherite_shovel_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item NETHERITE_HOE_HEAD = registerItem("netherite_hoe_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item NETHERITE_KNIFE_BLADE = registerItem("netherite_knife_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item NETHERITE_GREATSWORD_BLADE = registerItem("netherite_greatsword_blade",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item NETHERITE_SPEAR_HEAD = registerItem("netherite_spear_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item NETHERITE_HAMMER_HEAD = registerItem("netherite_hammer_head",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item NETHERITE_SCYTHE_BLADE = registerItem("netherite_scythe_blade",
            new Item(new FabricItemSettings().maxCount(1)));

    private static void itemGroupTools(FabricItemGroupEntries entries) {
        entries.add(DIGGING_STICK);
        entries.add(CRUDE_AXE);
        entries.add(CRUDE_HAMMER);
        entries.add(OBSIDIAN_KNIFE);
        entries.add(COPPER_SHOVEL);
        entries.add(COPPER_PICKAXE);
        entries.add(COPPER_AXE);
        entries.add(COPPER_HOE);
        entries.add(COPPER_HAMMER);
        entries.add(COPPER_SCYTHE);
        entries.add(IRON_HAMMER);
        entries.add(IRON_SCYTHE);
        entries.add(BRONZE_SHOVEL);
        entries.add(BRONZE_PICKAXE);
        entries.add(BRONZE_AXE);
        entries.add(BRONZE_HOE);
        entries.add(BRONZE_HAMMER);
        entries.add(BRONZE_SCYTHE);
        entries.add(STEEL_SHOVEL);
        entries.add(STEEL_PICKAXE);
        entries.add(STEEL_AXE);
        entries.add(STEEL_HOE);
        entries.add(STEEL_HAMMER);
        entries.add(STEEL_SCYTHE);
        entries.add(GOLDEN_HAMMER);
        entries.add(GOLDEN_SCYTHE);
        entries.add(DIAMOND_HAMMER);
        entries.add(DIAMOND_SCYTHE);
        entries.add(NETHERITE_HAMMER);
        entries.add(NETHERITE_SCYTHE);
    }

    private static void itemGroupWeapons(FabricItemGroupEntries entries) {
        entries.add(CRUDE_CLUB);
        entries.add(CRUDE_AXE);
        entries.add(CRUDE_HAMMER);
        entries.add(OBSIDIAN_CLUB);
        entries.add(OBSIDIAN_KNIFE);
        entries.add(OBSIDIAN_AXE);
        entries.add(OBSIDIAN_SPEAR);
        entries.add(COPPER_SWORD);
        entries.add(COPPER_GREATSWORD);
        entries.add(COPPER_AXE);
        entries.add(COPPER_SPEAR);
        entries.add(COPPER_HAMMER);
        entries.add(COPPER_SCYTHE);
        entries.add(BRONZE_SWORD);
        entries.add(BRONZE_GREATSWORD);
        entries.add(BRONZE_AXE);
        entries.add(BRONZE_SPEAR);
        entries.add(BRONZE_HAMMER);
        entries.add(BRONZE_SCYTHE);
        entries.add(IRON_GREATSWORD);
        entries.add(IRON_SPEAR);
        entries.add(IRON_SCYTHE);
        entries.add(IRON_HAMMER);
        entries.add(STEEL_SWORD);
        entries.add(STEEL_GREATSWORD);
        entries.add(STEEL_AXE);
        entries.add(STEEL_SPEAR);
        entries.add(STEEL_HAMMER);
        entries.add(STEEL_SCYTHE);
        entries.add(GOLDEN_GREATSWORD);
        entries.add(GOLDEN_SPEAR);
        entries.add(GOLDEN_SCYTHE);
        entries.add(GOLDEN_HAMMER);
        entries.add(DIAMOND_GREATSWORD);
        entries.add(DIAMOND_SPEAR);
        entries.add(DIAMOND_SCYTHE);
        entries.add(DIAMOND_HAMMER);
        entries.add(NETHERITE_GREATSWORD);
        entries.add(NETHERITE_SPEAR);
        entries.add(NETHERITE_SCYTHE);
        entries.add(NETHERITE_HAMMER);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.PLEASE_WORK_BLOCK);
        entries.add(BRONZE_INGOT);
        entries.add(BRONZE_NUGGET);
        entries.add(ModBlocks.BRONZE_BLOCK);
        entries.add(STEEL_INGOT);
        entries.add(STEEL_NUGGET);
        entries.add(ModBlocks.STEEL_BLOCK);
        entries.add(COPPER_CHUNK);
        entries.add(BRONZE_CHUNK);
        entries.add(IRON_CHUNK);
        entries.add(STEEL_CHUNK);
        entries.add(GOLD_CHUNK);
        entries.add(NETHERITE_CHUNK);
        entries.add(ZINC_CHUNK);
        entries.add(COPPER_SHOVEL_HEAD);
        entries.add(COPPER_PICKAXE_HEAD);
        entries.add(COPPER_AXE_HEAD);
        entries.add(COPPER_HOE_HEAD);
        entries.add(COPPER_KNIFE_BLADE);
        entries.add(COPPER_SWORD_BLADE);
        entries.add(COPPER_GREATSWORD_BLADE);
        entries.add(COPPER_SPEAR_HEAD);
        entries.add(COPPER_HAMMER_HEAD);
        entries.add(COPPER_SCYTHE_BLADE);
        entries.add(BRONZE_SHOVEL_HEAD);
        entries.add(BRONZE_PICKAXE_HEAD);
        entries.add(BRONZE_AXE_HEAD);
        entries.add(BRONZE_HOE_HEAD);
        entries.add(BRONZE_KNIFE_BLADE);
        entries.add(BRONZE_SWORD_BLADE);
        entries.add(BRONZE_GREATSWORD_BLADE);
        entries.add(BRONZE_SPEAR_HEAD);
        entries.add(BRONZE_HAMMER_HEAD);
        entries.add(BRONZE_SCYTHE_BLADE);
        entries.add(IRON_SHOVEL_HEAD);
        entries.add(IRON_PICKAXE_HEAD);
        entries.add(IRON_AXE_HEAD);
        entries.add(IRON_HOE_HEAD);
        entries.add(IRON_KNIFE_BLADE);
        entries.add(IRON_SWORD_BLADE);
        entries.add(IRON_GREATSWORD_BLADE);
        entries.add(IRON_SPEAR_HEAD);
        entries.add(IRON_HAMMER_HEAD);
        entries.add(IRON_SCYTHE_BLADE);
        entries.add(STEEL_SHOVEL_HEAD);
        entries.add(STEEL_PICKAXE_HEAD);
        entries.add(STEEL_AXE_HEAD);
        entries.add(STEEL_HOE_HEAD);
        entries.add(STEEL_KNIFE_BLADE);
        entries.add(STEEL_SWORD_BLADE);
        entries.add(STEEL_GREATSWORD_BLADE);
        entries.add(STEEL_SPEAR_HEAD);
        entries.add(STEEL_HAMMER_HEAD);
        entries.add(STEEL_SCYTHE_BLADE);
        entries.add(GOLDEN_SHOVEL_HEAD);
        entries.add(GOLDEN_PICKAXE_HEAD);
        entries.add(GOLDEN_AXE_HEAD);
        entries.add(GOLDEN_HOE_HEAD);
        entries.add(GOLDEN_KNIFE_BLADE);
        entries.add(GOLDEN_SWORD_BLADE);
        entries.add(GOLDEN_GREATSWORD_BLADE);
        entries.add(GOLDEN_SPEAR_HEAD);
        entries.add(GOLDEN_HAMMER_HEAD);
        entries.add(GOLDEN_SCYTHE_BLADE);
        entries.add(DIAMOND_SHOVEL_HEAD);
        entries.add(DIAMOND_PICKAXE_HEAD);
        entries.add(DIAMOND_AXE_HEAD);
        entries.add(DIAMOND_HOE_HEAD);
        entries.add(DIAMOND_KNIFE_BLADE);
        entries.add(DIAMOND_SWORD_BLADE);
        entries.add(DIAMOND_GREATSWORD_BLADE);
        entries.add(DIAMOND_SPEAR_HEAD);
        entries.add(DIAMOND_HAMMER_HEAD);
        entries.add(DIAMOND_SCYTHE_BLADE);
        entries.add(NETHERITE_SHOVEL_HEAD);
        entries.add(NETHERITE_PICKAXE_HEAD);
        entries.add(NETHERITE_AXE_HEAD);
        entries.add(NETHERITE_HOE_HEAD);
        entries.add(NETHERITE_KNIFE_BLADE);
        entries.add(NETHERITE_SWORD_BLADE);
        entries.add(NETHERITE_GREATSWORD_BLADE);
        entries.add(NETHERITE_SPEAR_HEAD);
        entries.add(NETHERITE_HAMMER_HEAD);
        entries.add(NETHERITE_SCYTHE_BLADE);

    }
    public static void registerModItems() {
        BetterBlacksmithing.LOGGER.info("Registering Mod Items for " + BetterBlacksmithing.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::itemGroupTools);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::itemGroupWeapons);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);

    }
}
