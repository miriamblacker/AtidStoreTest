package OCP;

public class Order {
    private double totalPrice;
    private Discount discount;


    /**
     * Constructor for Order.
     *
     * @param totalPrice the total price of the order
     * @param discount the discount strategy to be applied
     */
    public Order(double totalPrice, Discount discount) {
        this.totalPrice = totalPrice;
        this.discount = discount;
    }


    /**
     * Applies the discount based on the strategy provided.
     *
     * @return the total price after applying the discount
     */
    public double applyDiscount() {
        return discount.applyDiscount(totalPrice);
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
