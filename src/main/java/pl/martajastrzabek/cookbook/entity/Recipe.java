package pl.martajastrzabek.cookbook.entity;

import org.hibernate.annotations.ColumnDefault;
import pl.martajastrzabek.cookbook.entity.Category;
import pl.martajastrzabek.cookbook.entity.Ingredient;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(length = 5000)
    private String preparation;
    @ColumnDefault("0")
    private int likesNumber;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.PERSIST)
    private List<Ingredient> ingredients;

    public Recipe() {
    }

    public Recipe(String name, String preparation, Category category, List<Ingredient> ingredients) {
        this.name = name;
        this.preparation = preparation;
        this.category = category;
        this.ingredients = ingredients;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public int getLikesNumber() {
        return likesNumber;
    }

    public void setLikesNumber(int likesNumber) {
        this.likesNumber = likesNumber;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", preparation='" + preparation + '\'' +
                ", likesNumber=" + likesNumber +
                ", category=" + category +
                "ingredients:" + Arrays.toString(ingredients.toArray())
                + '}';
    }
}
