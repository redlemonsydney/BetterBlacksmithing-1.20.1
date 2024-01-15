package net.redlemon.better_blacksmithing.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;



public enum ModToolMaterial implements ToolMaterial {
    CRUDE(MiningLevels.WOOD, 59, 2.0f, 0.0f, 15, () -> Ingredient.ofItems(Items.FLINT)),
    COPPER(MiningLevels.STONE, 131, 4.0f, 1.0f, 5, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    BRONZE(MiningLevels.STONE, 200, 5.0f, 1.5f, 5, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    STEEL(MiningLevels.IRON, 325, 7.0f, 2.5f, 5, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    OBSIDIAN(0, 27, 0.0f, 3.0f, 18, () -> Ingredient.ofItems(Items.OBSIDIAN));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
