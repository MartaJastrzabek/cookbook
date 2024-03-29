package pl.martajastrzabek.cookbook.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.martajastrzabek.cookbook.entity.*;
import pl.martajastrzabek.cookbook.model.RecipeForm;
import pl.martajastrzabek.cookbook.repository.CategoryRepository;
import pl.martajastrzabek.cookbook.repository.IngredientRepository;
import pl.martajastrzabek.cookbook.repository.RecipeRepository;

import javax.lang.model.type.UnionType;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

@Service
public class CookbookService {
    private CategoryRepository categoryRepository;
    private RecipeRepository recipeRepository;
    private IngredientRepository ingredientRepository;


    public CookbookService(CategoryRepository categoryRepository, RecipeRepository recipeRepository, IngredientRepository ingredientRepository) {
        this.categoryRepository = categoryRepository;
        this.recipeRepository = recipeRepository;
        this.ingredientRepository = ingredientRepository;
    }

    public List<Recipe> findAllRecipe() {
        return recipeRepository.findAll();
    }

    public List<Recipe> findAllRecipeSortedByLikeNumbers() {
        return recipeRepository.findAll(Sort.by(Sort.Direction.DESC,"likesNumber"));
    }

    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    public Optional<Category> findCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    public List<Ingredient> createEmptyIngredientsList() {
        int ingredientsQuantity = 10;
        List<Ingredient> ingredients = new ArrayList<>();
        for (int i = 0; i < ingredientsQuantity; i++) {
            ingredients.add(new Ingredient());
        }
        return ingredients;
    }

    public CategoryName[] categoriesNamesArray() {
        return CategoryName.values();
    }

    public UnitType[] ingredientsUnitTypesNamesArray() {
        return UnitType.values();
    }


    public Recipe prepareRecipeFromForm(RecipeForm recipeForm) {
        Recipe recipe = recipeForm.getRecipe();

        List<Ingredient> ingredientsList = recipe.getIngredients();
        ListIterator<Ingredient> it = ingredientsList.listIterator();

        while (it.hasNext()) {
            Ingredient item = it.next();
            if ((item.getName() == null) || ((item.getName() != null) && (item.getName() == ""))) {
                // delete empty item from target list
                it.remove();
                continue;
            }
            // this is valid ingredient, assign recipe
            item.setRecipe(recipe);
        }
        recipe.setIngredients(ingredientsList);
        return recipe;
    }

    public void addNewRecipe(RecipeForm recipeForm) {
        recipeRepository.save(prepareRecipeFromForm(recipeForm));
    }

    public Optional<Recipe> findRecipeById(Long id) {
        return recipeRepository.findById(id);
    }

    public List<Recipe> findRecipesFromCategoryByCategoryId(Long categoryId) {
        return recipeRepository.findAllByCategoryId(categoryId);
    }

    public void updateRecipe(RecipeForm recipeForm) {
        Recipe editedRecipe = prepareRecipeFromForm(recipeForm);
        Optional<Recipe> optionalRecipe = recipeRepository.findById(recipeForm.getRecipeId());
        if (optionalRecipe.isPresent()) {
            Recipe recipe = optionalRecipe.get();

            recipe.setId(recipeForm.getRecipeId());
            recipe.setLikesNumber(editedRecipe.getLikesNumber());
            recipe.setName(editedRecipe.getName());
            recipe.setIngredients(editedRecipe.getIngredients());
            recipe.setCategory(editedRecipe.getCategory());
            recipe.setPreparation(editedRecipe.getPreparation());

            recipeRepository.save(recipe);
        }
    }

    public void deleteRecipe(Long id) {
        ingredientRepository.deleteAllByRecipeId(id);
        recipeRepository.deleteById(id);
    }

    public void increaseRecipeLikeNumber(Long id) {
        Optional<Recipe> optionalRecipe = recipeRepository.findById(id);
        if (optionalRecipe.isPresent()){
            Recipe recipe = optionalRecipe.get();
            recipe.setLikesNumber(recipe.getLikesNumber() + 1);
            recipeRepository.save(recipe);
        }
    }

}
