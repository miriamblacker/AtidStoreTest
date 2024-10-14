package DIP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * ChromeBrowserDriver class implements BrowserDriver interface for Chrome.
 */
public class ChromeBrowserDriver implements BrowserDriver {
    private WebDriver driver;

    public ChromeBrowserDriver() {
        this.driver = new ChromeDriver();
    }

    @Override
    public WebDriver getDriver() {
        return this.driver;
    }
}
