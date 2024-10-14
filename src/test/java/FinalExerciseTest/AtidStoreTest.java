package FinalExerciseTest;

import Pages.AccessoriesPage;
import Pages.CheckoutPage;
import Pages.StorePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

/**
 * The {@code AtidStoreTest} class contains tests for the Atid store's
 * functionality, including navigation to the accessories section,
 * adding items to the cart, and completing the checkout process.
 * It uses JUnit 5 for testing and is extended by the {@link LifecycleManager}
 * for test lifecycle management.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(LifecycleManager.class)
public class AtidStoreTest {

    private StorePage store; // The StorePage instance for interacting with the store.
    private CheckoutPage checkout; // The CheckoutPage instance for handling checkout actions.

    private WebDriver driver = LifecycleManager.getDriver(); // The WebDriver instance for browser interactions.
    private AccessoriesPage accessories = new AccessoriesPage(driver); // The AccessoriesPage instance for accessing accessory items.

    /**
     * Initializes the StorePage and CheckoutPage instances before each test.
     */
    @BeforeEach
    public void beforeEach() {
        store = new StorePage(driver); // Initializes the StorePage instance.
        checkout = new CheckoutPage(driver); // Initializes the CheckoutPage instance.
    }

    /**
     * Tests the process of navigating to the accessories section,
     * adding random products to the cart, and completing the checkout.
     */
    @Test
    void test() {
        store.goToAccessories(); // Navigates to the accessories section.
        List<WebElement> products = accessories.productsList(); // Retrieves the list of accessory products.
        Random random = new Random(); // Random number generator for product selection.

        int first = random.nextInt(products.size()); // Selects a random product index.
        int second;
        do {
            second = random.nextInt(products.size()); // Selects a second random product index different from the first.
        } while (second == first);

        // Adds the first random product to the cart.
        products.get(first).click();
        driver.findElement(By.className("single_add_to_cart_button")).click();

        driver.get("https://atid.store/product-category/accessories/"); // Navigates back to the accessories page.
        products = accessories.productsList(); // Retrieves the updated list of accessory products.

        // Adds the second random product to the cart.
        products.get(second).click();
        driver.findElement(By.className("single_add_to_cart_button")).click();

        Actions actions = new Actions(driver); // Creates an Actions instance for mouse interactions.

        // Moves to the cart icon to trigger the cart popup.
        actions.moveToElement(driver.findElement(By.id("ast-site-header-cart"))).perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Waits for the popup to appear.

        // Waits until the "VIEW CART" button is visible and clicks it.
        WebElement popupBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("VIEW CART")));
        popupBtn.click();

        // Proceeds to checkout.
        driver.findElement(By.className("wc-proceed-to-checkout")).click();

        // Fills the checkout form with user details.
        checkout.fillForm();
    }
}
