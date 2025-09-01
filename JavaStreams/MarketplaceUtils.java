/**
 * Utility class for the Dynamic Online Marketplace.
 * Contains generic methods such as applyDiscount.
 */
public class MarketplaceUtils {

    /**
     * Generic method to apply discount to a product.
     * @param product The product to apply discount on.
     * @param percentage Discount percentage (e.g., 10 for 10%).
     * @param <T> Type parameter extending Product.
     */
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100");
        }
        double discountedPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(discountedPrice);
    }
}
