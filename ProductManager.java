/**
 * Product Manager job role.
 */
public class ProductManager extends JobRole {
    public ProductManager(String candidateName) {
        super(candidateName);
    }

    @Override
    public String getRoleName() {
        return "Product Manager";
    }
}
