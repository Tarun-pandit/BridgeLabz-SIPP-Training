/**
 * Generic Product class where T is restricted to a category.
 */
public class Product<T> {
    private String id;
    private String name;
    private double price;
    private T category;

    public Product(String id, String name, double price, T category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Product[ID=%s, Name=%s, Price=%.2f, Category=%s]", id, name, price, category);
    }
}
