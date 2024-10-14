package DIP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * FirefoxBrowserDriver class implements BrowserDriver interface for Firefox.
 */
public class FirefoxBrowserDriver implements BrowserDriver {
    private WebDriver driver;

    public FirefoxBrowserDriver() {
        this.driver = new FirefoxDriver();
    }

    @Override
    public WebDriver getDriver() {
        return this.driver;
    }
}

