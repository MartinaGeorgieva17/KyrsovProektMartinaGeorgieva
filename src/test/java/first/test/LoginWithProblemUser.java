package first.test;

import base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginWithProblemUser extends TestUtil {

    @Test
    public void loginWithProblemUsers(){
        // Test case for login with problem user
        WebElement userNameInput = driver.findElement(By.id("user-name"));
        userNameInput.click(); //Click on the input field
        userNameInput.clear(); // Clear any existing text
        userNameInput.sendKeys("visual_user");  // Enter the username

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
        //Explicit wait for the product page title to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOf(productPageTitle));

        // Assert that the product page title is displayed (indicating successful login)
        Assert.assertTrue(productPageTitle.isDisplayed());
    }
}
