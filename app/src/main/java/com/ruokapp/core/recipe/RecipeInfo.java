package com.ruokapp.core.recipe;

import java.util.ArrayList;

public class RecipeInfo {

    private static String id;
    private static String title;
    private static String imageUrl;
    private static String preparationInMinutes;
    private static String instructions;
    private static ArrayList<RecipeIngredient> recipeIngredients;
    private static RecipeInfo recipeInfo;

    public static RecipeInfo getInstance(){
        if (recipeInfo == null)
            recipeInfo = new RecipeInfo();
        return recipeInfo;
    }

    public void setRecipeInfo(String idRecipe, String titleRecipe, String imageRecipe, String preparation, String instructions){
        this.id = idRecipe;
        this.title = titleRecipe;
        this.imageUrl = imageRecipe;
        this.preparationInMinutes = preparation;
        this.instructions = instructions;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getPreparationInMinutes() {
        return preparationInMinutes;
    }

    public String getInstructions() {
        return instructions;
    }

    public ArrayList<RecipeIngredient> getRecipeIngredients() {
        return recipeIngredients;
    }
}
