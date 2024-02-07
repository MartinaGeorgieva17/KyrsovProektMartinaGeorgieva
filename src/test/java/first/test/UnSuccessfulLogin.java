package first.test;

import base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnSuccessfulLogin extends TestUtil {

    @Test (dataProvider = "wrongUsers")
    // Test case for unsuccessful login attempts
    public void UnsuccessfulLoginTest(String username, String password){
        // Find and interact with the username input field
        WebElement userNameInput = driver.findElement(By.id("user-name"));
        userNameInput.click(); //Click on the input field
        userNameInput.clear(); // Clear any existing text
        userNameInput.sendKeys(username); // Enter the password

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);

        // Find and click the login button
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();

        // Find the close error message button
        WebElement closeErrorMsgBtn = driver.findElement(By.cssSelector(".error-button"));

        // Assert that the close error message button is displayed (indicating unsuccessful login)
        Assert.assertTrue(closeErrorMsgBtn.isDisplayed());
    }
}
