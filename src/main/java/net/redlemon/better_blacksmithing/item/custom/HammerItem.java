package net.redlemon.better_blacksmithing.item.custom;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Vanishable;

public class HammerItem extends PickaxeItem implements Vanishable {
    public HammerItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
