package net.redlemon.better_blacksmithing.item.custom;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Vanishable;

public class GreatSwordItem
        extends SwordItem
        implements Vanishable {

    public GreatSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
