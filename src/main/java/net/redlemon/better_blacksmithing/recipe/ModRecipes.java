package net.redlemon.better_blacksmithing.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redlemon.better_blacksmithing.BetterBlacksmithing;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(BetterBlacksmithing.MOD_ID, BBFurnaceRecipe.Serializer.ID),
                BBFurnaceRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(BetterBlacksmithing.MOD_ID, BBFurnaceRecipe.Type.ID),
                BBFurnaceRecipe.Type.INSTANCE);

    }

}
