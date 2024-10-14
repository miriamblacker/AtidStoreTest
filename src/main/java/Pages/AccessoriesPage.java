package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * The {@code AccessoriesPage} class represents the accessories section of the store.
 * It provides methods to interact with the list of products displayed on the page.
 */
public class AccessoriesPage {

    private WebDriver driver; // The WebDriver instance used for interacting with the accessories page.

    /**
     * Constructs a new {@code AccessoriesPage} with the specified WebDriver.
     *
     * @param driver the WebDriver instance to be used for interacting with the accessories page.
     */
    public AccessoriesPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Retrieves a list of products displayed on the accessories page.
     *
     * @return a {@link List} of {@link WebElement} representing the products.
     */
    public List<WebElement> productsList() {
        return driver.findElements(By.className("ast-col-sm-12")); // Finds and returns the list of product elements.
    }
}
