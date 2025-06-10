package net.mysticwolves.tortoisemod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.mysticwolves.tortoisemod.entity.custom.TortoiseEntity;

public class TortoiseModel<T extends TortoiseEntity> extends HierarchicalModel<T> {
        public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("tortoisemod", "tortoise"), "main");

        private final ModelPart tortoise;
        private final ModelPart Head;
        private final ModelPart face;
        private final ModelPart mouth;
        private final ModelPart Uppermouth;
        private final ModelPart Lowermouth;
        private final ModelPart shell;
        private final ModelPart legs;
        private final ModelPart frontleftleg;
        private final ModelPart frontrightleg;
        private final ModelPart backleftleg;
        private final ModelPart backrightleg;

        public TortoiseModel(ModelPart root) {
            this.tortoise = root.getChild("Tortoise");
            this.Head = this.tortoise.getChild("Head");
            this.face = this.Head.getChild("face");
            this.mouth = this.Head.getChild("mouth");
            this.Uppermouth = this.mouth.getChild("Uppermouth");
            this.Lowermouth = this.mouth.getChild("Lowermouth");
            this.shell = this.tortoise.getChild("shell");
            this.legs = this.tortoise.getChild("legs");
            this.frontleftleg = this.legs.getChild("frontleftleg");
            this.frontrightleg = this.legs.getChild("frontrightleg");
            this.backleftleg = this.legs.getChild("backleftleg");
            this.backrightleg = this.legs.getChild("backrightleg");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshdefinition = new MeshDefinition();
            PartDefinition partdefinition = meshdefinition.getRoot();

            PartDefinition Tortoise = partdefinition.addOrReplaceChild("Tortoise", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition Head = Tortoise.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(1.0F, -3.0F, -6.0F));

            PartDefinition face = Head.addOrReplaceChild("face", CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, -3.0F, -1.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition mouth = Head.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Uppermouth = mouth.addOrReplaceChild("Uppermouth", CubeListBuilder.create().texOffs(24, 13).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, -0.75F, 0.0F));

            PartDefinition Lowermouth = mouth.addOrReplaceChild("Lowermouth", CubeListBuilder.create().texOffs(24, 13).addBox(-3.0F, -1.25F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition shell = Tortoise.addOrReplaceChild("shell", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.1F))
                    .texOffs(0, 0).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, -5.0F, 0.0F));

            PartDefinition legs = Tortoise.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition frontleftleg = legs.addOrReplaceChild("frontleftleg", CubeListBuilder.create(), PartPose.offset(1.0F, -3.0F, -6.0F));

            PartDefinition frontleftleg_r1 = frontleftleg.addOrReplaceChild("frontleftleg_r1", CubeListBuilder.create().texOffs(18, 30).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.0F, 2.0F, -0.0436F, 0.0F, -0.0436F));

            PartDefinition frontrightleg = legs.addOrReplaceChild("frontrightleg", CubeListBuilder.create(), PartPose.offset(1.0F, -3.0F, -6.0F));

            PartDefinition frontrightleg_r1 = frontrightleg.addOrReplaceChild("frontrightleg_r1", CubeListBuilder.create().texOffs(18, 24).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 3.0F, 2.0F, -0.0436F, 0.0F, 0.0436F));

            PartDefinition backleftleg = legs.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offset(3.0F, -1.9924F, 2.8257F));

            PartDefinition backleftleg_r1 = backleftleg.addOrReplaceChild("backleftleg_r1", CubeListBuilder.create().texOffs(26, 24).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9924F, 0.1743F, 0.0873F, 0.0F, 0.0F));

            PartDefinition backrightleg = legs.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offset(-3.0F, -2.9778F, 2.8666F));

            PartDefinition backrightleg_r1 = backrightleg.addOrReplaceChild("backrightleg_r1", CubeListBuilder.create().texOffs(24, 18).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9156F, 0.0115F, 0.0873F, 0.0F, 0.0F));

            return LayerDefinition.create(meshdefinition, 64, 64);
        }

        @Override
        public void setupAnim(TortoiseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.applyHeadRotation(netHeadYaw, headPitch);

            this.animateWalk(TortoiseAnimations.WALKING, limbSwing, limbSwingAmount, 2f, 2.5f);
            this.animate(entity.idleAnimationState, TortoiseAnimations.IDLE2, ageInTicks, 1f);
        }

        private void applyHeadRotation(float headYaw, float headPitch) {
            headYaw = Mth.clamp(headYaw, -30f, 30f);
            headPitch = Mth.clamp(headPitch, -25f, 45);

            this.Head.yRot = headYaw * ((float)Math.PI / 180f);
            this.Head.xRot = headPitch * ((float)Math.PI / 180f);
        }

        @Override
        public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
            tortoise.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        }

        @Override
        public ModelPart root() {
            return tortoise;
        }
    }
