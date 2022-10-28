import java.util.Objects;
import java.util.Set;

public class Recipe {
    private Set<Product> products;
    private Double recipeProductsCost;
    private String recipeName;


    public Recipe(Set<Product> products, Double recipeProductsCost, String recipeName) {
        this.products = products;
        this.recipeProductsCost = recipeProductsCost;
        this.recipeName = recipeName;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public Double getRecipeProductsCost(Set<Product> products) {
        return recipeProductsCost;
    }

    public String getRecipeName() {
        return recipeName;
    }

    @Override
    public String toString() {
        return "\nРецепт " + recipeName +
                ", стоимость продуктов " + recipeProductsCost+" р.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        throw new RuntimeException("Рецепт " + getRecipeName() + " уже есть в списке.");
//        return getRecipeName().equals(recipe.getRecipeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRecipeName());
    }
}
