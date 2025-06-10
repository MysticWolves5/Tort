package net.mysticwolves.tortoisemod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.mysticwolves.tortoisemod.TortoiseMod;
import net.mysticwolves.tortoisemod.entity.custom.TortoiseEntity;

public class TortoiseRenderer extends MobRenderer<TortoiseEntity, TortoiseModel<TortoiseEntity>> {
    public TortoiseRenderer(EntityRendererProvider.Context context) {
        super(context, new TortoiseModel<>(context.bakeLayer(TortoiseModel.LAYER_LOCATION)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(TortoiseEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(TortoiseMod.MOD_ID, "textures/entity/tortoise/tortoisetexture.png");
    }

    @Override
    public void render(TortoiseEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
