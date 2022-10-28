import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Product> products = new HashSet<>();

        Product banana = new Product("бананы", 70.5, 1.5, false);
        products.add(banana);
        Product meet = new Product("мясо", 380.99, 3.5, true);
        products.add(meet);
        Product apple = new Product("Яблоки", 100.99, 3.0,true);
        products.add(apple);
        Product cucumber = new Product("огурцы", 60.0, 3.0,true);
        products.add(cucumber);
        Product tomato = new Product("помидоры", 70.0, 2.5, true);
        products.add(tomato);
        Product carrot = new Product("Морковь", 20.6, 2.0, true);
        products.add(carrot);
        Product sweet = new Product("печенье", 130.0, 2.5, true);
        products.add(sweet);
        Product bred = new Product("Хлеб", 50.0, 1.5, true);
        products.add(bred);
        Product butter = new Product("масло", 140.0, 0.25, true);
        products.add(butter);
        Product cheese = new Product("сыр", 270.5, 0.45, true);
        products.add(cheese);
//        Product second = new Product("бананы", 120.0, 1.5);
//        products.add(second);

        banana.setPrice(35.0);
        banana.setAmount(2.8);
        banana.setBought(true);
        products.add(new Product("апельсины", 90.99, 3.5,true));
        System.out.println(Arrays.toString(products.toArray()));
        products.remove(banana);
        System.out.println(Arrays.toString(products.toArray()));

    }
}