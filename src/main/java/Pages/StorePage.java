package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * The {@code StorePage} class represents the store page of the application.
 * It provides methods to navigate to different sections of the store.
 */
public class StorePage {

    private WebDriver driver; // The WebDriver instance used for interacting with the store page.

    /**
     * Constructs a new {@code StorePage} with the specified WebDriver.
     *
     * @param driver the WebDriver instance to be used for interacting with the store page.
     */
    public StorePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Navigates to the Accessories section of the store.
     */
    public void goToAccessories() {
        driver.findElement(By.id("menu-item-671")).click(); // Clicks the 'Accessories' menu item.
    }
}
