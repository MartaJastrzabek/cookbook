package pl.martajastrzabek.cookbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.martajastrzabek.cookbook.entity.Category;
import pl.martajastrzabek.cookbook.entity.Recipe;
import pl.martajastrzabek.cookbook.service.CookbookService;

import java.util.List;
import java.util.Optional;

@Controller
public class CategoryController {

    private CookbookService service;

    public CategoryController(CookbookService service) {
        this.service = service;
    }

    @GetMapping("/categories")
    public String categoriesPage(Model model){
        List<Category> allCategories = service.findAllCategories();
        model.addAttribute("categories", allCategories);
        return "categories";
    }

    @GetMapping("/category/{id}")
    public String categoryPage(@PathVariable Long id, Model model){
        Optional<Category> optionalCategory = service.findCategoryById(id);
        if (optionalCategory.isPresent()){
            Category category = optionalCategory.get();
            List<Recipe> recipes = service.findRecipesFromCategoryByCategoryId(id);
            model.addAttribute("recipes", recipes);
            model.addAttribute("category", category);
            return "category";
        }
        return "error";
    }
}
