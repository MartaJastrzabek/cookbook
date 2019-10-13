package pl.martajastrzabek.cookbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import pl.martajastrzabek.cookbook.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

    @Transactional
    void deleteAllByRecipeId(Long id);
}
