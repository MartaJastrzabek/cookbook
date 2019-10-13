package pl.martajastrzabek.cookbook.model;

import pl.martajastrzabek.cookbook.entity.Ingredient;
import pl.martajastrzabek.cookbook.entity.Recipe;

import java.util.List;

public class RecipeForm {
    private Recipe recipe;
    private String selectedCategory;
    private long recipeId;

    public RecipeForm() {
    }

    public RecipeForm(Recipe recipe, String selectedCategory, long recipeId) {
        this.recipe = recipe;
        this.selectedCategory = selectedCategory;
        this.recipeId = recipeId;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getSelectedCategory() {
        return selectedCategory;
    }

    public void setSelectedCategory(String selectedCategory) {
        this.selectedCategory = selectedCategory;
    }

    public long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(long recipeId) {
        this.recipeId = recipeId;
    }
}
