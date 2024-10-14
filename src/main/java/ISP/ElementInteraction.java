package ISP;

/**
 * Interface for interacting with elements.
 */
public interface ElementInteraction {
    void clickElement(String locator);
    void sendKeysToElement(String locator, String input);
}
