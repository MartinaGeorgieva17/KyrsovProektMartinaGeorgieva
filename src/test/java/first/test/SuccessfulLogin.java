package first.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SuccessfulLogin {
    public WebDriver driver;

    @BeforeMethod
    // Method to set up the WebDriver before each test method
    public void setupDriver(){
        // Setup WebDriver using WebDriverManager for Chrome
        WebDriverManager.chromedriver().setup();
        // Initialize ChromeDriver instance
        driver = new ChromeDriver();
    }

    @AfterMethod
    // Method to quit the WebDriver after each test method
    public void tearDown(){
        driver.quit();
    }
    // Quit the WebDriver

    @Test
    // Test case for successful login
    public void successfulLogin(){
    // Navigate to the saucedemo login page
        driver.get("http://www.saucedemo.com/");
        // Find and interact with the username input field
        WebElement userNameInput = driver.findElement(By.id("user-name"));
        userNameInput.click(); // Click on the input field
        userNameInput.clear(); // Clear any existing text
        userNameInput.sendKeys("standard_user"); // Enter the username

        // Find and interact with the password input field
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.click(); // Click on the input field
        passwordInput.click();
        passwordInput.sendKeys("secret_sauce"); // Enter the password

        // Find the product page title element
        WebElement loginBtn = driver.findElement(By.cssSelector("[name=login-button]"));
        loginBtn.click();

        // Find the product page title element
        WebElement productPageTitle = driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
        // Assert that the product page title is displayed (indicating successful login)
        Assert.assertTrue(productPageTitle.isDisplayed());
    }
}
