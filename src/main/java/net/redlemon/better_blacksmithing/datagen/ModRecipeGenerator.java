package net.redlemon.better_blacksmithing.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.redlemon.better_blacksmithing.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRUDE_AXE)
                .pattern("7@ ")
                .pattern(" I ")
                .pattern("   ")
                .input('7', Items.FLINT)
                .input('@', Items.STRING)
                .input('I', Items.STICK)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CRUDE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CRUDE_CLUB)
                .pattern("77 ")
                .pattern("7I ")
                .pattern("   ")
                .input('7', Items.FLINT)
                .input('I', Items.STICK)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CRUDE_CLUB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRUDE_HAMMER)
                .pattern("77 ")
                .pattern("@I ")
                .pattern("   ")
                .input('7', Items.FLINT)
                .input('@', Items.STRING)
                .input('I', Items.STICK)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CRUDE_HAMMER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIGGING_STICK)
                .pattern("I@ ")
                .pattern(" I ")
                .pattern("   ")
                .input('@', Items.STRING)
                .input('I', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIGGING_STICK)));

    // Shoving-tool-heads-on-a-stick section

        // Copper

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_SWORD)
                .input(ModItems.COPPER_SWORD_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.COPPER_SWORD_BLADE), conditionsFromItem(ModItems.COPPER_SWORD_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_SWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE)
                .input(ModItems.COPPER_PICKAXE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.COPPER_PICKAXE_HEAD), conditionsFromItem(ModItems.COPPER_PICKAXE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PICKAXE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_AXE)
                .input(ModItems.COPPER_AXE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.COPPER_AXE_HEAD), conditionsFromItem(ModItems.COPPER_AXE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_AXE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL)
                .input(ModItems.COPPER_SHOVEL_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.COPPER_SHOVEL_HEAD), conditionsFromItem(ModItems.COPPER_SHOVEL_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_SHOVEL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_HOE)
                .input(ModItems.COPPER_HOE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.COPPER_HOE_HEAD), conditionsFromItem(ModItems.COPPER_HOE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_HOE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_KNIFE)
                .input(ModItems.COPPER_KNIFE_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.COPPER_KNIFE_BLADE), conditionsFromItem(ModItems.COPPER_KNIFE_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_KNIFE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_GREATSWORD)
                .input(ModItems.COPPER_GREATSWORD_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.COPPER_GREATSWORD_BLADE), conditionsFromItem(ModItems.COPPER_GREATSWORD_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_GREATSWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SPEAR)
                .input(ModItems.COPPER_SPEAR_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.COPPER_SPEAR_HEAD), conditionsFromItem(ModItems.COPPER_SPEAR_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_SPEAR)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_HAMMER)
                .input(ModItems.COPPER_HAMMER_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.COPPER_HAMMER_HEAD), conditionsFromItem(ModItems.COPPER_HAMMER_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_HAMMER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SCYTHE)
                .input(ModItems.COPPER_SCYTHE_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.COPPER_SCYTHE_BLADE), conditionsFromItem(ModItems.COPPER_SCYTHE_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_SCYTHE)));

        // Bronze

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BRONZE_SWORD)
                .input(ModItems.BRONZE_SWORD_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_SWORD_BLADE), conditionsFromItem(ModItems.BRONZE_SWORD_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_SWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BRONZE_PICKAXE)
                .input(ModItems.BRONZE_PICKAXE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_PICKAXE_HEAD), conditionsFromItem(ModItems.BRONZE_PICKAXE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_PICKAXE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BRONZE_AXE)
                .input(ModItems.BRONZE_AXE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_AXE_HEAD), conditionsFromItem(ModItems.BRONZE_AXE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_AXE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BRONZE_SHOVEL)
                .input(ModItems.BRONZE_SHOVEL_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_SHOVEL_HEAD), conditionsFromItem(ModItems.BRONZE_SHOVEL_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_SHOVEL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BRONZE_HOE)
                .input(ModItems.BRONZE_HOE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_HOE_HEAD), conditionsFromItem(ModItems.BRONZE_HOE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_HOE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BRONZE_KNIFE)
                .input(ModItems.BRONZE_KNIFE_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_KNIFE_BLADE), conditionsFromItem(ModItems.BRONZE_KNIFE_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_KNIFE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BRONZE_GREATSWORD)
                .input(ModItems.BRONZE_GREATSWORD_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_GREATSWORD_BLADE), conditionsFromItem(ModItems.BRONZE_GREATSWORD_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_GREATSWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BRONZE_SPEAR)
                .input(ModItems.BRONZE_SPEAR_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_SPEAR_HEAD), conditionsFromItem(ModItems.BRONZE_SPEAR_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_SPEAR)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BRONZE_HAMMER)
                .input(ModItems.BRONZE_HAMMER_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_HAMMER_HEAD), conditionsFromItem(ModItems.BRONZE_HAMMER_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_HAMMER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BRONZE_SCYTHE)
                .input(ModItems.BRONZE_SCYTHE_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_SCYTHE_BLADE), conditionsFromItem(ModItems.BRONZE_SCYTHE_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_SCYTHE)));

        // Iron

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.IRON_SWORD)
                .input(ModItems.IRON_SWORD_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.IRON_SWORD_BLADE), conditionsFromItem(ModItems.IRON_SWORD_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.IRON_SWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.IRON_PICKAXE)
                .input(ModItems.IRON_PICKAXE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.IRON_PICKAXE_HEAD), conditionsFromItem(ModItems.IRON_PICKAXE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.IRON_PICKAXE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.IRON_AXE)
                .input(ModItems.IRON_AXE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.IRON_AXE_HEAD), conditionsFromItem(ModItems.IRON_AXE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.IRON_AXE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.IRON_SHOVEL)
                .input(ModItems.IRON_SHOVEL_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.IRON_SHOVEL_HEAD), conditionsFromItem(ModItems.IRON_SHOVEL_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.IRON_SHOVEL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.IRON_HOE)
                .input(ModItems.IRON_HOE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.IRON_HOE_HEAD), conditionsFromItem(ModItems.IRON_HOE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.IRON_HOE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_GREATSWORD)
                .input(ModItems.IRON_GREATSWORD_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.IRON_GREATSWORD_BLADE), conditionsFromItem(ModItems.IRON_GREATSWORD_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_GREATSWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_SPEAR)
                .input(ModItems.IRON_SPEAR_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.IRON_SPEAR_HEAD), conditionsFromItem(ModItems.IRON_SPEAR_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_SPEAR)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_HAMMER)
                .input(ModItems.IRON_HAMMER_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.IRON_HAMMER_HEAD), conditionsFromItem(ModItems.IRON_HAMMER_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_HAMMER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_SCYTHE)
                .input(ModItems.IRON_SCYTHE_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.IRON_SCYTHE_BLADE), conditionsFromItem(ModItems.IRON_SCYTHE_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_SCYTHE)));

        // Steel

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_SWORD)
                .input(ModItems.STEEL_SWORD_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.STEEL_SWORD_BLADE), conditionsFromItem(ModItems.STEEL_SWORD_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_SWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_PICKAXE)
                .input(ModItems.STEEL_PICKAXE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.STEEL_PICKAXE_HEAD), conditionsFromItem(ModItems.STEEL_PICKAXE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_PICKAXE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_AXE)
                .input(ModItems.STEEL_AXE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.STEEL_AXE_HEAD), conditionsFromItem(ModItems.STEEL_AXE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_AXE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_SHOVEL)
                .input(ModItems.STEEL_SHOVEL_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.STEEL_SHOVEL_HEAD), conditionsFromItem(ModItems.STEEL_SHOVEL_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_SHOVEL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_HOE)
                .input(ModItems.STEEL_HOE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.STEEL_HOE_HEAD), conditionsFromItem(ModItems.STEEL_HOE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_HOE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_KNIFE)
                .input(ModItems.STEEL_KNIFE_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.STEEL_KNIFE_BLADE), conditionsFromItem(ModItems.STEEL_KNIFE_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_KNIFE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_GREATSWORD)
                .input(ModItems.STEEL_GREATSWORD_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.STEEL_GREATSWORD_BLADE), conditionsFromItem(ModItems.STEEL_GREATSWORD_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_GREATSWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_SPEAR)
                .input(ModItems.STEEL_SPEAR_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.STEEL_SPEAR_HEAD), conditionsFromItem(ModItems.STEEL_SPEAR_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_SPEAR)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_HAMMER)
                .input(ModItems.STEEL_HAMMER_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.STEEL_HAMMER_HEAD), conditionsFromItem(ModItems.STEEL_HAMMER_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_HAMMER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_SCYTHE)
                .input(ModItems.STEEL_SCYTHE_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.STEEL_SCYTHE_BLADE), conditionsFromItem(ModItems.STEEL_SCYTHE_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_SCYTHE)));

        // Gold

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.GOLDEN_SWORD)
                .input(ModItems.GOLDEN_SWORD_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.GOLDEN_SWORD_BLADE), conditionsFromItem(ModItems.GOLDEN_SWORD_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.GOLDEN_SWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.GOLDEN_PICKAXE)
                .input(ModItems.GOLDEN_PICKAXE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.GOLDEN_PICKAXE_HEAD), conditionsFromItem(ModItems.GOLDEN_PICKAXE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.GOLDEN_PICKAXE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.GOLDEN_AXE)
                .input(ModItems.GOLDEN_AXE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.GOLDEN_AXE_HEAD), conditionsFromItem(ModItems.GOLDEN_AXE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.GOLDEN_AXE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.GOLDEN_SHOVEL)
                .input(ModItems.GOLDEN_SHOVEL_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.GOLDEN_SHOVEL_HEAD), conditionsFromItem(ModItems.GOLDEN_SHOVEL_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.GOLDEN_SHOVEL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.GOLDEN_HOE)
                .input(ModItems.GOLDEN_HOE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.GOLDEN_HOE_HEAD), conditionsFromItem(ModItems.GOLDEN_HOE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.GOLDEN_HOE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLDEN_GREATSWORD)
                .input(ModItems.GOLDEN_GREATSWORD_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.GOLDEN_GREATSWORD_BLADE), conditionsFromItem(ModItems.GOLDEN_GREATSWORD_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_GREATSWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLDEN_SPEAR)
                .input(ModItems.GOLDEN_SPEAR_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.GOLDEN_SPEAR_HEAD), conditionsFromItem(ModItems.GOLDEN_SPEAR_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_SPEAR)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLDEN_HAMMER)
                .input(ModItems.GOLDEN_HAMMER_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.GOLDEN_HAMMER_HEAD), conditionsFromItem(ModItems.GOLDEN_HAMMER_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_HAMMER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLDEN_SCYTHE)
                .input(ModItems.GOLDEN_SCYTHE_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.GOLDEN_SCYTHE_BLADE), conditionsFromItem(ModItems.GOLDEN_SCYTHE_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_SCYTHE)));

        // Diamond

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.DIAMOND_SWORD)
                .input(ModItems.DIAMOND_SWORD_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.DIAMOND_SWORD_BLADE), conditionsFromItem(ModItems.DIAMOND_SWORD_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.DIAMOND_SWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.DIAMOND_PICKAXE)
                .input(ModItems.DIAMOND_PICKAXE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.DIAMOND_PICKAXE_HEAD), conditionsFromItem(ModItems.DIAMOND_PICKAXE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.DIAMOND_PICKAXE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.DIAMOND_AXE)
                .input(ModItems.DIAMOND_AXE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.DIAMOND_AXE_HEAD), conditionsFromItem(ModItems.DIAMOND_AXE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.DIAMOND_AXE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.DIAMOND_SHOVEL)
                .input(ModItems.DIAMOND_SHOVEL_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.DIAMOND_SHOVEL_HEAD), conditionsFromItem(ModItems.DIAMOND_SHOVEL_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.DIAMOND_SHOVEL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.DIAMOND_HOE)
                .input(ModItems.DIAMOND_HOE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.DIAMOND_HOE_HEAD), conditionsFromItem(ModItems.DIAMOND_HOE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.DIAMOND_HOE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_GREATSWORD)
                .input(ModItems.DIAMOND_GREATSWORD_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.DIAMOND_GREATSWORD_BLADE), conditionsFromItem(ModItems.DIAMOND_GREATSWORD_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_GREATSWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_SPEAR)
                .input(ModItems.DIAMOND_SPEAR_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.DIAMOND_SPEAR_HEAD), conditionsFromItem(ModItems.DIAMOND_SPEAR_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_SPEAR)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_HAMMER)
                .input(ModItems.DIAMOND_HAMMER_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.DIAMOND_HAMMER_HEAD), conditionsFromItem(ModItems.DIAMOND_HAMMER_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_HAMMER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_SCYTHE)
                .input(ModItems.DIAMOND_SCYTHE_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.DIAMOND_SCYTHE_BLADE), conditionsFromItem(ModItems.DIAMOND_SCYTHE_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_SCYTHE)));
        // Netherite

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.NETHERITE_SWORD)
                .input(ModItems.NETHERITE_SWORD_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.NETHERITE_SWORD_BLADE), conditionsFromItem(ModItems.NETHERITE_SWORD_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.NETHERITE_SWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.NETHERITE_PICKAXE)
                .input(ModItems.NETHERITE_PICKAXE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.NETHERITE_PICKAXE_HEAD), conditionsFromItem(ModItems.NETHERITE_PICKAXE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.NETHERITE_PICKAXE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.NETHERITE_AXE)
                .input(ModItems.NETHERITE_AXE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.NETHERITE_AXE_HEAD), conditionsFromItem(ModItems.NETHERITE_AXE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.NETHERITE_AXE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.NETHERITE_SHOVEL)
                .input(ModItems.NETHERITE_SHOVEL_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.NETHERITE_SHOVEL_HEAD), conditionsFromItem(ModItems.NETHERITE_SHOVEL_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.NETHERITE_SHOVEL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.NETHERITE_HOE)
                .input(ModItems.NETHERITE_HOE_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.NETHERITE_HOE_HEAD), conditionsFromItem(ModItems.NETHERITE_HOE_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.NETHERITE_HOE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NETHERITE_GREATSWORD)
                .input(ModItems.NETHERITE_GREATSWORD_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.NETHERITE_GREATSWORD_BLADE), conditionsFromItem(ModItems.NETHERITE_GREATSWORD_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_GREATSWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NETHERITE_SPEAR)
                .input(ModItems.NETHERITE_SPEAR_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.NETHERITE_SPEAR_HEAD), conditionsFromItem(ModItems.NETHERITE_SPEAR_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_SPEAR)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NETHERITE_HAMMER)
                .input(ModItems.NETHERITE_HAMMER_HEAD)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.NETHERITE_HAMMER_HEAD), conditionsFromItem(ModItems.NETHERITE_HAMMER_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_HAMMER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NETHERITE_SCYTHE)
                .input(ModItems.NETHERITE_SCYTHE_BLADE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.NETHERITE_SCYTHE_BLADE), conditionsFromItem(ModItems.NETHERITE_SCYTHE_BLADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_SCYTHE)));
    }
}
