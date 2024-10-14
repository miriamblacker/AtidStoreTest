package SRP;

/**
 * The {@code Item} class represents an item with a name and a price.
 * It provides methods to retrieve the item's details.
 */
public class Item {

    private String name; // The name of the item.
    private double price; // The price of the item.

    /**
     * Constructs a new {@code Item} with the specified name and price.
     *
     * @param name  the name of the item.
     * @param price the price of the item.
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Retrieves the price of the item.
     *
     * @return the price of the item.
     */
    public double getPrice() {
        return price; // Returns the price of the item.
    }

    /**
     * Retrieves the name of the item.
     *
     * @return the name of the item.
     */
    public String getName() {
        return name; // Returns the name of the item.
    }
}
