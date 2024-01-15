package net.redlemon.better_blacksmithing.item.custom;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Vanishable;

public class KnifeItem extends ToolItem implements Vanishable {

    public KnifeItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, settings);
    }
}
