import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {
    private String productName;
    private Double price;
    private Double amount;

    private boolean isBought;




    public Product(String productName, Double price, Double amount,boolean isBought) {
        if (productName != null && !productName.isEmpty() && !productName.isBlank()) {
            this.productName = productName;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью.");
        }
        setPrice(price);
        setAmount(amount);

    }

    public static Double countProductsCost(Product product) {
        return product.getPrice() * product.getAmount();
    }



    public boolean isBought() {
        return isBought;
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }

    public String getProductName() {
        return productName;
    }



    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price != null && price > 0) {
            this.price = price;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью.");
        }
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        if (amount != null && amount > 0) {
            this.amount = amount;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью.");
        }
    }

    @Override
    public String toString() {
        return "\nПродукт " + productName + ", цена за килограмм " + price +
                ", вес " + amount + " кг.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        throw new RuntimeException("Продукт " + getProductName() + " уже есть в списке.");
//        return getProductName().equals(product.getProductName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductName());
    }
}
