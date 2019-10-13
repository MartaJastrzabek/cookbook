package pl.martajastrzabek.cookbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.martajastrzabek.cookbook.entity.Recipe;
import pl.martajastrzabek.cookbook.service.CookbookService;

import java.util.List;

@Controller
public class HomeController {

    private CookbookService service;

    public HomeController(CookbookService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(@RequestParam(required = false) String show, Model model){
        List<Recipe> allRecipes = service.findAllRecipe();
        model.addAttribute("recipes", allRecipes);
        return "home";
    }

}
