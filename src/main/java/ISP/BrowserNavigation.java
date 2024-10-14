package ISP;

/**
 * Interface for basic browser navigation.
 */
public interface BrowserNavigation {
    void navigateTo(String url);
    String getPageTitle();
}
