package SRP;

import java.util.List;


/**
 * Class to calc item price
 */
public class PriceCalculator {

    /**
     * Calculation of the total price based on the items in the cart
     * @param items
     * @return total price
     */
    public double calculateTotalPrice(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
