public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to add an item to the cart (increase quantity)
    public void addItem(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println(amount + " " + itemName + "(s) added to the cart.");
        } else {
            System.out.println("Invalid amount to add.");
        }
    }

    // Method to remove an item from the cart (decrease quantity)
    public void removeItem(int amount) {
        if (amount > 0) {
            if (quantity >= amount) {
                quantity -= amount;
                System.out.println(amount + " " + itemName + "(s) removed from the cart.");
            } else {
                System.out.println("Not enough quantity to remove.");
            }
        } else {
            System.out.println("Invalid amount to remove.");
        }
    }

    // Method to display the total cost
    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Total cost for " + quantity + " " + itemName + "(s): $" + totalCost);
    }
}
