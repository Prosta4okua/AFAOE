package com.varitekcibus.amazingfoodstuffs.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelVex - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelFameMinion extends ModelBase {
    public ModelRenderer leftwing;
    public ModelRenderer rightarm;
    public ModelRenderer head;
    public ModelRenderer chest;
    public ModelRenderer leftarm;
    public ModelRenderer rightwing;

    public ModelFameMinion() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(rightarm, 0.0F, 0.0F, 0.10000736613927509F);
        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.mirror = true;
        this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(leftarm, 0.0F, 0.0F, -0.10000736613927509F);
        this.leftwing = new ModelRenderer(this, 0, 32);
        this.leftwing.mirror = true;
        this.leftwing.setRotationPoint(0.0F, 1.0F, 2.0F);
        this.leftwing.addBox(0.0F, 0.0F, 0.0F, 20, 12, 1, 0.0F);
        this.setRotateAngle(leftwing, 0.47123889803846897F, -0.6283185307179586F, -0.47123889803846897F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.chest = new ModelRenderer(this, 16, 16);
        this.chest.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.rightwing = new ModelRenderer(this, 0, 32);
        this.rightwing.setRotationPoint(0.0F, 1.0F, 2.0F);
        this.rightwing.addBox(-20.0F, 0.0F, 0.0F, 20, 12, 1, 0.0F);
        this.setRotateAngle(rightwing, 0.47123889803846897F, 0.6283185307179586F, 0.47123889803846897F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.rightarm.render(f5);
        this.leftarm.render(f5);
        this.leftwing.render(f5);
        this.head.render(f5);
        this.chest.render(f5);
        this.rightwing.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    
    {
    
    	this.head.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.head.rotateAngleX = headPitch * 0.017453292F;
    	this.rightarm.rotateAngleX = MathHelper.cos(limbSwing * 0.662F) * 1.4F * limbSwingAmount;
    	this.leftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    }

    
    
    
    
    
    
    
}



