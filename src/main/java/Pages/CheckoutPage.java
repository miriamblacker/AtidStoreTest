package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * The {@code CheckoutPage} class represents the checkout page of the application.
 * It provides methods to interact with and fill in the checkout form.
 */
public class CheckoutPage {

    private WebDriver driver; // The WebDriver instance used for interacting with the checkout page.

    /**
     * Constructs a new {@code CheckoutPage} with the specified WebDriver.
     *
     * @param driver the WebDriver instance to be used for interacting with the checkout page.
     */
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Fills a form field identified by its ID with the specified value.
     *
     * @param id the ID of the form field to fill.
     * @param value the value to enter into the form field.
     */
    private void fillOne(String id, String value) {
        driver.findElement(By.id(id)).sendKeys(value); // Sends the specified value to the form field.
    }

    /**
     * Fills in the entire checkout form with predefined values and submits the form.
     */
    public void fillForm() {
        fillOne("billing_first_name", "Miriam");
        fillOne("billing_last_name", "Levi");
        fillOne("billing_address_1", "R' akiva 25");
        fillOne("billing_postcode", "123");
        fillOne("billing_city", "BB");
        fillOne("billing_phone", "050-1234567");
        fillOne("billing_email", "exam@example.com");
        driver.findElement(By.id("place_order")).click(); // Clicks the 'Place Order' button.

        driver.findElement(By.className("woocommerce-error")).isEnabled(); // Checks if an error message is displayed.
    }
}
