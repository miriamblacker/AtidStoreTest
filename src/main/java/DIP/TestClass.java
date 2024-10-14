package DIP;

import org.openqa.selenium.WebDriver;

/**
 * The {@code TestClass} is responsible for executing tests using a
 * specified {@link BrowserDriver} interface.
 * It initializes a WebDriver instance, sets up the browser for testing,
 * and provides functionality to clean up after tests.
 */
public class TestClass {

    private BrowserDriver browserDriver; // The BrowserDriver instance to manage the browser.
    private WebDriver driver; // The WebDriver instance used for interacting with the browser.

    /**
     * Constructs a new {@code TestClass} with the specified {@link BrowserDriver}.
     *
     * @param browserDriver the BrowserDriver instance to be used for managing the browser.
     */
    public TestClass(BrowserDriver browserDriver) {
        this.browserDriver = browserDriver;
        driver = browserDriver.getDriver(); // Initializes the WebDriver instance from the BrowserDriver.
    }

    /**
     * Sets up the test environment by navigating to the specified URL and maximizing the browser window.
     *
     * @param url the URL to navigate to for the test.
     */
    public void setUp(String url) {
        driver.get(url); // Navigates to the specified URL.
        driver.manage().window().maximize(); // Maximizes the browser window.
        System.out.println("Title: " + driver.getTitle()); // Prints the title of the current page.
    }

    /**
     * Cleans up the test environment by quitting the browser.
     */
    public void tearDown() {
        driver.quit(); // Closes the browser and ends the WebDriver session.
    }

}
