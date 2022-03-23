package com.testmod.entity.renderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.testmod.Testmod;
import com.testmod.entity.EntityTypeRegistry;
import com.testmod.entity.TestEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@OnlyIn(Dist.CLIENT)
public class TestEntityRenderer extends EntityRenderer{
    BipedRenderer testEntityRenderer = new BipedRenderer<>(renderManager, new BipedModel(0), 0.5f);
    protected TestEntityRenderer(EntityRendererManager rendererManager) {
        super(rendererManager);

    }
    @Override
    public ResourceLocation getEntityTexture(Entity entity) {
        return new ResourceLocation(Testmod.MOD_ID,"textures/entity/test_entity.png");
    }

    }

