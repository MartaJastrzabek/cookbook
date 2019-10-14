package pl.martajastrzabek.cookbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.martajastrzabek.cookbook.entity.Recipe;

import java.util.List;
import java.util.Optional;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    List<Recipe> findAllByCategoryId(Long categoryId);
}
