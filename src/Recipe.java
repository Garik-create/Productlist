import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private Map<Product,Double> products = new HashMap<>();
    private Double recipeProductsCost;
    private String recipeName;
    private DecimalFormat dF = new DecimalFormat("#.##");


    public Recipe(Map<Product, Double> products, Double recipeProductsCost, String recipeName) {
        this.recipeProductsCost = recipeProductsCost;
        this.recipeName = recipeName;
    }

    public Map<Product, Double> getProducts() {
        return products;
    }

    public Double getRecipeProductsCost(Map<Product, Double> products) {
        return recipeProductsCost;
    }

    public String getRecipeName() {
        return recipeName;
    }

    @Override
    public String toString() {
        return "\nРецепт " + recipeName +
                ", стоимость продуктов " + dF.format(recipeProductsCost)+" р.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return getRecipeName().equals(recipe.getRecipeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRecipeName());
    }
}
