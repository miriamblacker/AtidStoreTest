# Atid Store Automation Tests

This project contains automation tests for the Atid Store website, implemented using Selenium and JUnit. The tests cover navigation, product selection, adding items to the cart, and completing the checkout process.

## Project Structure

### Packages

- **DIP**: Contains driver-related classes for browser management.
  - `BrowserDriver`: Interface for browser drivers.
  - `ChromeBrowserDriver`: Implements `BrowserDriver` for Chrome.
  - `TestClass`: Executes tests using the specified `BrowserDriver`.

- **Pages**: Contains page objects representing different pages of the Atid Store.
  - `AccessoriesPage`: Represents the accessories page and contains methods to interact with accessory products.
  - `CheckoutPage`: Represents the checkout page and contains methods to fill out the checkout form.
  - `StorePage`: Represents the store page and contains methods to navigate to different product categories.

- **FinalExerciseTest**: Contains the test classes and lifecycle management.
  - `LifecycleManager`: Manages the lifecycle of tests by providing setup and teardown functionality.
  - `AtidStoreTest`: Contains tests for navigating the store, adding products to the cart, and completing the checkout process.

## Dependencies

- Selenium WebDriver
- JUnit 5

## Running Tests

To run the tests, ensure that you have the necessary dependencies and a compatible browser driver. Then, execute the `AtidStoreTest` class as a JUnit test.

### Example Test

The `AtidStoreTest` class includes a sample test method that demonstrates how to:

1. Navigate to the accessories section.
2. Select two random products from the list.
3. Add the selected products to the cart.
4. Proceed to checkout and fill out the checkout form.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
