package pl.martajastrzabek.cookbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.martajastrzabek.cookbook.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    
}
