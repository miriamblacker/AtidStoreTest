package OCP;

// Interface for discount strategy
public interface Discount {
    /**
     * Applies a discount based on the total price.
     *
     * @param totalPrice the total price of the order before the discount
     * @return the discounted price after applying the discount
     */
    double applyDiscount(double totalPrice);
}
