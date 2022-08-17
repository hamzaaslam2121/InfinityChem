//package com.hamza.infinitychem.integration.jei;
//
//import com.hamza.infinitychem.InfinityChemMod;
//import com.hamza.infinitychem.block.ModBlocks;
//import mezz.jei.api.gui.IRecipeLayout;
//import mezz.jei.api.gui.drawable.IDrawable;
//import mezz.jei.api.gui.drawable.IDrawableStatic;
//import mezz.jei.api.helpers.IGuiHelper;
//import mezz.jei.api.ingredients.IIngredients;
//import mezz.jei.api.recipe.category.IRecipeCategory;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.ResourceLocation;
//
//public class LightningChannelerRecipeCategory implements IRecipeCategory<LightningChannelerRecipe> {
//    public final static ResourceLocation UID = new ResourceLocation(InfinityChemMod.MOD_ID, "lightning");
//    public final static ResourceLocation TEXTURE = new ResourceLocation(InfinityChemMod.MOD_ID, "textures/gui/lightning_channeler_gui.png");
//
//    private final IDrawable background;
//    private final IDrawable icon;
//    private final IDrawableStatic lightningBolt;
//
//    public LightningChannelerRecipeCategory(IGuiHelper helper) {
//        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
//        this.icon = helper.createDrawableIngredient(new ItemStack(ModBlocks.);
//        this.lightningBolt = lightningBolt;
//    }
//
//    @Override
//    public ResourceLocation getUid() {
//        return null;
//    }
//
//    @Override
//    public Class<? extends LightningChannelerRecipeCategory> getRecipeClass() {
//        return null;
//    }
//
//    @Override
//    public String getTitle() {
//        return null;
//    }
//
//    @Override
//    public IDrawable getBackground() {
//        return null;
//    }
//
//    @Override
//    public IDrawable getIcon() {
//        return null;
//    }
//
//    @Override
//    public void setIngredients(LightningChannelerRecipeCategory recipe, IIngredients ingredients) {
//
//    }
//
//    @Override
//    public void setRecipe(IRecipeLayout recipeLayout, LightningChannelerRecipeCategory recipe, IIngredients ingredients) {
//
//    }
//}
