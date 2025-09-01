/**
 * Groceries item extending WarehouseItem.
 */
public class Groceries extends WarehouseItem {
    private String expirationDate;

    public Groceries(String id, String name, String expirationDate) {
        super(id, name);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", ExpirationDate=%s", expirationDate);
    }
}
