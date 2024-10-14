package FinalExerciseTest;

import DIP.ChromeBrowserDriver;
import DIP.TestClass;
import org.junit.jupiter.api.extension.*;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

/**
 * The {@code LifecycleManager} class manages the lifecycle of tests by providing
 * JUnit 5 lifecycle callbacks. It initializes the browser driver and
 * handles setup and teardown operations for test classes.
 */
public class LifecycleManager implements BeforeEachCallback, BeforeAllCallback, AfterEachCallback, AfterAllCallback {

    private static ChromeBrowserDriver chromeBrowserDriver = new ChromeBrowserDriver(); // Chrome browser driver instance.
    private TestClass testRunner = new TestClass(chromeBrowserDriver); // TestClass instance for running tests.
    private static WebDriver driver = chromeBrowserDriver.getDriver(); // WebDriver instance for browser interactions.

    /**
     * Callback executed after all tests have been run.
     *
     * @param extensionContext the context of the extension.
     * @throws Exception if an error occurs during the cleanup process.
     */
    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        // Cleanup operations can be performed here if necessary.
    }

    /**
     * Callback executed after each test.
     *
     * @param extensionContext the context of the extension.
     * @throws Exception if an error occurs during the teardown process.
     */
    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        testRunner.tearDown(); // Tears down the test environment.
    }

    /**
     * Callback executed before all tests are run.
     *
     * @param extensionContext the context of the extension.
     * @throws Exception if an error occurs during the setup process.
     */
    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        // Setup operations can be performed here if necessary.
    }

    /**
     * Callback executed before each test.
     *
     * @param extensionContext the context of the extension.
     * @throws Exception if an error occurs during the setup process.
     */
    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        testRunner.setUp("https://atid.store/"); // Sets up the test environment with the specified URL.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Sets implicit wait for the driver.
    }

    /**
     * Retrieves the WebDriver instance used for browser interactions.
     *
     * @return the WebDriver instance.
     */
    public static WebDriver getDriver() {
        return driver; // Returns the WebDriver instance.
    }
}
