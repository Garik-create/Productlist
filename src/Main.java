import com.sun.source.doctree.SeeTree;

import java.text.DecimalFormat;
import java.util.*;

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

        Map<Product, Double> products1 = new HashMap<>();
        products1.put(banana,1.5);
        products1.put(apple,3.0);
        products1.put(carrot,2.0);
        System.out.println(products1);

        double sumProduct1 = 0.0;
        for (Map.Entry<Product, Double> product : products1.entrySet()) {
            double v = product.getKey().getPrice() * product.getValue();
            sumProduct1 += v;
        }
        System.out.printf("sum = %.2f\n", sumProduct1);

        /*double sumProduct1 = 0.0;
        for (Product product : products1) {
            sumProduct1 += Product.countProductsCost(product);
        }
        System.out.println("sum = " + sumProduct1);*/


        Map<Product, Double> products2 = new HashMap<>();
        products2.put(cucumber,3.0);
        products2.put(tomato,2.5);
        products2.put(apple,3.0);
        System.out.println(products2);

        double sumProduct2 = 0.0;
        for (Map.Entry<Product, Double> product : products2.entrySet()) {
            double v = product.getKey().getPrice() * product.getValue();
            sumProduct2 += v;
        }
        System.out.printf("sum = %.2f\n", sumProduct2);

       /* double sumProduct2 = 0.0;
        for (Product product : products2) {
            sumProduct2 += Product.countProductsCost(product);
        }
        System.out.println("sum = " + sumProduct2);*/

        Map<Product, Double> products3 = new HashMap<>();
        products3.put(meet,1.5);
        products3.put(cheese,0.45);
        products3.put(carrot,2.0);
        System.out.println(products3);

        double sumProduct3 = 0.0;
        for (Map.Entry<Product, Double> product : products3.entrySet()) {
            double v = product.getKey().getPrice() * product.getValue();
            sumProduct3 += v;
        }
        System.out.printf("sum = %.2f\n",sumProduct3);

    /*    double sumProduct3 = 0.0;
        for (Product product : products3) {
            sumProduct3 += Product.countProductsCost(product);
        }
        System.out.println("sum = " + sumProduct3);*/


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