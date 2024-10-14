package SRP;

import java.util.ArrayList;
import java.util.List;


/**
 * Shopping cart management
 */
public class ShoppingCart {
    // All items in cart
    private List<Item> items = new ArrayList<>();


    /**
     * Add a new item to cart
     * @param item
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * @return All items in cart
     */
    public List<Item> getItems() {
        return items;
    }

}
