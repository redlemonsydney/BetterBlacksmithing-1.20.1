package net.redlemon.better_blacksmithing.mixin;

import net.redlemon.better_blacksmithing.BetterBlacksmithing;
import net.redlemon.better_blacksmithing.item.ModItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useScytheModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(ModItems.CRUDE_SPEAR) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "crude_spear_3d", "inventory"));
        }
        if (stack.isOf(ModItems.OBSIDIAN_SPEAR) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "obsidian_spear_3d", "inventory"));
        }
        if (stack.isOf(ModItems.COPPER_SCYTHE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "copper_scythe_3d", "inventory"));
        }
        if (stack.isOf(ModItems.COPPER_SPEAR) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "copper_spear_3d", "inventory"));
        }
        if (stack.isOf(ModItems.COPPER_GREATSWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "copper_greatsword_3d", "inventory"));
        }
        if (stack.isOf(ModItems.BRONZE_SCYTHE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "bronze_scythe_3d", "inventory"));
        }
        if (stack.isOf(ModItems.BRONZE_SPEAR) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "bronze_spear_3d", "inventory"));
        }
        if (stack.isOf(ModItems.BRONZE_GREATSWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "bronze_greatsword_3d", "inventory"));
        }
        if (stack.isOf(ModItems.IRON_SCYTHE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "iron_scythe_3d", "inventory"));
        }
        if (stack.isOf(ModItems.IRON_SPEAR) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "iron_spear_3d", "inventory"));
        }
        if (stack.isOf(ModItems.IRON_GREATSWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "iron_greatsword_3d", "inventory"));
        }
        if (stack.isOf(ModItems.STEEL_SCYTHE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "steel_scythe_3d", "inventory"));
        }
        if (stack.isOf(ModItems.STEEL_SPEAR) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "steel_spear_3d", "inventory"));
        }
        if (stack.isOf(ModItems.STEEL_GREATSWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "steel_greatsword_3d", "inventory"));
        }
        if (stack.isOf(ModItems.GOLDEN_SCYTHE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "golden_scythe_3d", "inventory"));
        }
        if (stack.isOf(ModItems.GOLDEN_SPEAR) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "golden_spear_3d", "inventory"));
        }
        if (stack.isOf(ModItems.GOLDEN_GREATSWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "golden_greatsword_3d", "inventory"));
        }
        if (stack.isOf(ModItems.DIAMOND_SCYTHE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "diamond_scythe_3d", "inventory"));
        }
        if (stack.isOf(ModItems.DIAMOND_SPEAR) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "diamond_spear_3d", "inventory"));
        }
        if (stack.isOf(ModItems.DIAMOND_GREATSWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "diamond_greatsword_3d", "inventory"));
        }
        if (stack.isOf(ModItems.NETHERITE_SCYTHE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "netherite_scythe_3d", "inventory"));
        }
        if (stack.isOf(ModItems.NETHERITE_SPEAR) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "netherite_spear_3d", "inventory"));
        }
        if (stack.isOf(ModItems.NETHERITE_GREATSWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(BetterBlacksmithing.MOD_ID, "netherite_greatsword_3d", "inventory"));
        }
        return value;
    }
}