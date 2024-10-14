package OCP;

public class FixedDiscount implements Discount {
    private double discount;

    /**
     * Constructor for fixed discount.
     *
     * @param discount the fixed discount amount to apply
     */
    public FixedDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @param totalPrice the total price of the order before the discount
     * @return Price after discount
     */
    @Override
    public double applyDiscount(double totalPrice) {
       return totalPrice - discount;
    }
}
