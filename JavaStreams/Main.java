import java.util.List;

/**
 * Main class to demonstrate the Smart Warehouse Management System using Java Generics.
 */
public class Main {
    public static void main(String[] args) {
        // Create storage for Electronics
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("E001", "Smartphone", "Samsung"));
        electronicsStorage.addItem(new Electronics("E002", "Laptop", "Dell"));

        // Create storage for Groceries
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("G001", "Milk", "2024-05-01"));
        groceriesStorage.addItem(new Groceries("G002", "Bread", "2024-04-15"));

        // Create storage for Furniture
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("F001", "Chair", "Wood"));
        furnitureStorage.addItem(new Furniture("F002", "Table", "Metal"));

        // Display all Electronics
        System.out.println("Electronics in storage:");
        Storage.displayItems(electronicsStorage.getItems());

        // Display all Groceries
        System.out.println("\nGroceries in storage:");
        Storage.displayItems(groceriesStorage.getItems());

        // Display all Furniture
        System.out.println("\nFurniture in storage:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}
