package pl.martajastrzabek.cookbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.martajastrzabek.cookbook.entity.Category;
import pl.martajastrzabek.cookbook.service.CookbookService;

import java.util.List;

@Controller
public class CategoryController {

    private CookbookService service;

    public CategoryController(CookbookService service) {
        this.service = service;
    }

    @GetMapping("/categories")
    public String categoryPage(Model model){
        List<Category> allCategories = service.findAllCategories();
        model.addAttribute("categories", allCategories);
        return "categories";
    }
}
