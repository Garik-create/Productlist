import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Product banana = new Product("бананы", 70.5, 1.5, false);
        Product meet = new Product("мясо", 380.99, 3.5, true);
        Product apple = new Product("Яблоки", 100.99, 3.0, true);
        Product cucumber = new Product("огурцы", 60.0, 3.0, true);
        Product tomato = new Product("помидоры", 70.0, 2.5, true);
        Product carrot = new Product("Морковь", 20.6, 2.0, true);
        Product sweet = new Product("печенье", 130.0, 2.5, true);
        Product bred = new Product("Хлеб", 50.0, 1.5, true);
        Product butter = new Product("масло", 140.0, 0.25, true);
        Product cheese = new Product("сыр", 270.5, 0.45, true);

        Set<Product> products1 = new HashSet<>();
        products1.add(banana);
        products1.add(apple);
        products1.add(carrot);
        System.out.println(products1);

        double sumProduct1 = 0.0;
        for (Product product : products1) {
            sumProduct1 += Product.countProductsCost(product);
        }
        System.out.println("sum = " + sumProduct1);


        Set<Product> products2 = new HashSet<>();
        products2.add(cucumber);
        products2.add(tomato);
        products2.add(apple);
        System.out.println(products2);

        double sumProduct2 = 0.0;
        for (Product product : products2) {
            sumProduct2 += Product.countProductsCost(product);
        }
        System.out.println("sum = " + sumProduct2);

        Set<Product> products3 = new HashSet<>();
        products3.add(meet);
        products3.add(cheese);
        products3.add(carrot);
        System.out.println(products3);

        double sumProduct3 = 0.0;
        for (Product product : products3) {
            sumProduct3 += Product.countProductsCost(product);
        }
        System.out.println("sum = " + sumProduct3);


        Recipe recipe1 = new Recipe(products1, sumProduct1, "Рецепт 1");
        Recipe recipe2 = new Recipe(products2, sumProduct2, "Рецепт 2");
        Recipe recipe3 = new Recipe(products3, sumProduct3, "Рецепт 3");

        Set<Recipe> recipes = new HashSet<>();
        recipes.add(recipe1);
        recipes.add(recipe2);
        recipes.add(recipe3);
        recipes.add(new Recipe(products1, 100.0, "Рецепт 4"));
        System.out.println(recipes);

    }
}