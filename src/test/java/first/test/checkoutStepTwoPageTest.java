package first.test;

import base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class checkoutStepTwoPageTest extends TestUtil {
    @Test
    // Test case to verify the second step page of the checkout process
    public void testCheckoutStepTwoPage() {
        // Login with valid user credentials
        login("standard_user", "secret_sauce");

        // Add a product to the cart
        addToCart("onesie");

        // Click on the shopping cart icon for checkout
        WebElement shoppingCartIcon = driver.findElement(By.className("shopping_cart_link"));
        shoppingCartIcon.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object with a timeout of 10 seconds
        WebElement checkoutBtnWait = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='checkout']")));
        // Wait until the "checkout" button is present in the DOM
        checkoutBtnWait.click(); // Click on the "checkout" button

        // Enter shipping details
        WebElement firstNameInput = driver.findElement(By.id("first-name")); // Locate the input element with the id "first-name" using the driver
        firstNameInput.sendKeys("Martina");

        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        lastNameInput.sendKeys("Georgieva");

        WebElement postalCodeInput = driver.findElement(By.id("postal-code"));
        postalCodeInput.sendKeys("1000");

        // Click on the continue button to proceed to review
        WebElement continueBtn = driver.findElement(By.xpath("//*[@id='continue']"));
        continueBtn.click();

        // Wait for the "finish" element to appear for next page load
        WebElement finishBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));
        finishBtn.click();
    }

    private void login(String username, String password) {
        WebElement userNameInput = driver.findElement(By.id("user-name"));
        userNameInput.clear();
        userNameInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.clear();
        passwordInput.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.cssSelector("[name=login-button]"));
        loginBtn.click();
    }
    private void addToCart(String itemName) {
        String baseProductId = "add-to-cart-sauce-labs-";
        WebElement itemToBeAdded = driver.findElement(By.id(baseProductId + itemName));
        itemToBeAdded.click();
    }
}


