package net.redlemon.better_blacksmithing.mixin;

import net.redlemon.better_blacksmithing.BetterBlacksmithing;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.render.model.json.JsonUnbakedModel;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;
import java.util.Map;

@Mixin(ModelLoader.class)
public abstract class ModelLoaderMixin {
    @Shadow
    protected abstract void addModel(ModelIdentifier modelId);

    @Inject(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/model/ModelLoader;addModel(Lnet/minecraft/client/util/ModelIdentifier;)V", ordinal = 3, shift = At.Shift.AFTER))
    public void addScythe(BlockColors blockColors, Profiler profiler, Map<Identifier, JsonUnbakedModel> jsonUnbakedModels, Map<Identifier, List<ModelLoader.SourceTrackedData>> blockStates, CallbackInfo ci) {
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "crude_spear_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "obsidian_spear_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "copper_scythe_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "copper_spear_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "copper_greatsword_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "bronze_scythe_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "bronze_spear_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "bronze_greatsword_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "iron_scythe_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "iron_spear_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "iron_greatsword_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "steel_scythe_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "steel_spear_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "steel_greatsword_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "golden_scythe_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "golden_spear_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "golden_greatsword_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "diamond_scythe_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "diamond_spear_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "diamond_greatsword_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "netherite_scythe_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "netherite_spear_3d", "inventory"));
        this.addModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "netherite_greatsword_3d", "inventory"));
    }
}