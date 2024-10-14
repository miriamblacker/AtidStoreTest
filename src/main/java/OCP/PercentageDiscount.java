package OCP;

// Percentage-based discount implementation
public class PercentageDiscount implements Discount {

    private double percentage;

    /**
     * Constructor for percentage-based discount.
     *
     * @param percentage the discount percentage to apply
     */
    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    /**
     * @param totalPrice the total price of the order before the discount
     * @return  Price after discount
     */
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice - (totalPrice * percentage / 100);
    }
}
