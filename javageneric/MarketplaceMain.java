import java.util.ArrayList;
import java.util.List;

/**
 * Main class to demonstrate the Dynamic Online Marketplace using Java Generics.
 */
public class MarketplaceMain {
    public static void main(String[] args) {
        List<Product<BookCategory>> bookProducts = new ArrayList<>();
        bookProducts.add(new Product<>("B001", "Java Programming", 50.0, BookCategory.TECHNOLOGY));
        bookProducts.add(new Product<>("B002", "History of Art", 40.0, BookCategory.HISTORY));

        List<Product<ClothingCategory>> clothingProducts = new ArrayList<>();
        clothingProducts.add(new Product<>("C001", "Men's T-Shirt", 20.0, ClothingCategory.MEN));
        clothingProducts.add(new Product<>("C002", "Women's Jacket", 60.0, ClothingCategory.WOMEN));

        List<Product<GadgetCategory>> gadgetProducts = new ArrayList<>();
        gadgetProducts.add(new Product<>("G001", "Smartphone", 300.0, GadgetCategory.MOBILE));
        gadgetProducts.add(new Product<>("G002", "Smartwatch", 150.0, GadgetCategory.WEARABLE));

        System.out.println("Before discount:");
        bookProducts.forEach(System.out::println);
        clothingProducts.forEach(System.out::println);
        gadgetProducts.forEach(System.out::println);

        // Apply discounts
        for (Product<BookCategory> book : bookProducts) {
            MarketplaceUtils.applyDiscount(book, 10);
        }
        for (Product<ClothingCategory> clothing : clothingProducts) {
            MarketplaceUtils.applyDiscount(clothing, 15);
        }
        for (Product<GadgetCategory> gadget : gadgetProducts) {
            MarketplaceUtils.applyDiscount(gadget, 5);
        }

        System.out.println("\nAfter discount:");
        bookProducts.forEach(System.out::println);
        clothingProducts.forEach(System.out::println);
        gadgetProducts.forEach(System.out::println);
    }
}
