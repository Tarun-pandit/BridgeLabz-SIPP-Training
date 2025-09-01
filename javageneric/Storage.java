import java.util.ArrayList;
import java.util.List;

/**
 * Generic Storage class to store items of type T which extends WarehouseItem.
 * Demonstrates bounded type parameters and type safety.
 */
public class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }

    public List<T> getItems() {
        return items;
    }

    /**
     * Display all items in the storage using a wildcard to allow any subtype of WarehouseItem.
     */
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}
