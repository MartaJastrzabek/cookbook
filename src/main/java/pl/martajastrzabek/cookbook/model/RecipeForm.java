package pl.martajastrzabek.cookbook.model;

import pl.martajastrzabek.cookbook.entity.Ingredient;
import pl.martajastrzabek.cookbook.entity.Recipe;

import java.util.List;

public class RecipeForm {
    private Recipe recipe;
    private long recipeId;

    public RecipeForm() {
    }

    public RecipeForm(Recipe recipe, long recipeId) {
        this.recipe = recipe;
        this.recipeId = recipeId;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(long recipeId) {
        this.recipeId = recipeId;
    }
}
