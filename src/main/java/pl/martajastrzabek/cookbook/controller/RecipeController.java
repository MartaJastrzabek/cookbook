package pl.martajastrzabek.cookbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.martajastrzabek.cookbook.entity.Recipe;
import pl.martajastrzabek.cookbook.model.RecipeForm;
import pl.martajastrzabek.cookbook.service.CookbookService;

import java.util.Optional;

@Controller
public class RecipeController {

    private CookbookService service;

    public RecipeController(CookbookService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public String addRecipeForm(Model model) {
        Recipe recipe = new Recipe();
        recipe.setIngredients(service.createEmptyIngredientsList());
        RecipeForm recipeForm = new RecipeForm(recipe, 0);

        model.addAttribute("unitTypes", service.ingredientsUnitTypesNamesArray());
        model.addAttribute("categories", service.findAllCategories());
        model.addAttribute("recipeForm", recipeForm);
        model.addAttribute("actionEdit", false);
        return "addedit";
    }

    @PostMapping("/add")
    public String addRecipe(RecipeForm recipeForm) {
        service.addNewRecipe(recipeForm);

        return "redirect:/";
    }

    @GetMapping("/recipe/{id}")
    public String showRecipe(@PathVariable Long id, Model model) {
        return getRecipe(id, model);
    }

    @GetMapping("/update/{id}")
    String editRecipeForm(@PathVariable Long id, Model model) {
        Optional<Recipe> opRecipe = service.findRecipeById(id);
        if (opRecipe.isPresent()) {
            Recipe recipe = opRecipe.get();

            RecipeForm recipeForm = new RecipeForm(recipe, id);

            model.addAttribute("unitTypes", service.ingredientsUnitTypesNamesArray());
            model.addAttribute("categories", service.findAllCategories());
            model.addAttribute("recipeForm", recipeForm);
            model.addAttribute("actionEdit", true);

            return "addedit";
        }
        return "error";
    }

    @PostMapping("/update")
    public String updateRecipe(RecipeForm recipeForm) {
        service.updateRecipe(recipeForm);
        return "redirect:/recipe/" + recipeForm.getRecipeId();
    }

    @GetMapping("/delete/{id}")
    public String deleteRecipe(@PathVariable Long id) {
        Optional<Recipe> opRecipe = service.findRecipeById(id);
        if (opRecipe.isPresent()) {
            service.deleteRecipe(id);
            return "redirect:/";
        }
        return "error";
    }

    @GetMapping("/like/{id}")
    public String updateRecipeLikeNumber(@PathVariable Long id, Model model) {
        service.increaseRecipeLikeNumber(id);
        return getRecipe(id, model);
    }

    private String getRecipe(@PathVariable Long id, Model model) {
        Optional<Recipe> optionalRecipe = service.findRecipeById(id);
        if (optionalRecipe.isPresent()) {
            Recipe recipe = optionalRecipe.get();
            model.addAttribute("recipe", recipe);
            return "recipe";
        }
        return "error";
    }
}

