package first.test;

import base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProductTest extends TestUtil {
    private final static String BASE_PRODUCT_ID = "add-to-cart-sauce-labs-";

    //// The private static void modifier indicates that the method is private, static, and does not return a value (void).
    //// This means that the method is restricted to access within the same class, can be called without creating an instance of the class,
    //// and does not return any result after execution. It is commonly used for utility methods or internal helper functions.
    // The BASE_PRODUCT_ID constant represents the base ID prefix used for identifying product elements.
    @Test(dataProvider = "items list")
    //test case to add product to the cart
    public void AddProductToCart(String itemName) {
        //Find and interact with the username input field
        WebElement userNameInput = driver.findElement(By.id("user-name"));
        userNameInput.click(); // Click on the input field
        userNameInput.clear(); // Clear any existing text
        userNameInput.sendKeys("standard_user");  // Enter the username

        // Find and interact with the password input field
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.click(); // Click on the input field
        passwordInput.click();
        passwordInput.sendKeys("secret_sauce"); // Enter the password

        // Find and click the login button
        WebElement loginBtn = driver.findElement(By.cssSelector("[name=login-button]"));
        loginBtn.click();

        // Find and click on the item to be added to the cart
        WebElement itemToBeAdded = driver.findElement(By.id(BASE_PRODUCT_ID + itemName));
        itemToBeAdded.click();

        // Find the shopping cart badge element
        WebElement shoppingCartBadge = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));

        // Assert that the shopping cart badge text equals "1" (indicating one item in the cart)
        Assert.assertEquals(shoppingCartBadge.getText(), "1");
    }

    @DataProvider(name = "items list")
// This method provides data for test cases related to items.
    public Object[][] getItems() {
        return new Object[][]{ // Returning a 2D array with item names as data.
                {"fleece-jacket"},
                {"onesie"}
        };
    }
}

