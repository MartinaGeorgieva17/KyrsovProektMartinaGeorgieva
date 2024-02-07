package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestUtil extends DataProviders{
    public WebDriver driver;
    private String browser, targetURL;
    private int implicitWait;
    // The implicitWait variable represents the duration (in seconds) for the implicit wait timeout.
    // It is used to specify the maximum amount of time Selenium WebDriver will wait for elements
    // to be found when performing findElement or findElements operations. The default value is 0.

    @AfterMethod
    // Method to quit the WebDriver after each test method
    public void tearDown(){
        driver.quit(); // Quit the WebDriver
    }
    @BeforeMethod
    // Method to set up the WebDriver and open the target URL before each test method
    public void setupDriverAndOpenTargetURL() {
        // Read configuration from config.properties file
        readConfig("src/test/resources/config.properties");
        // Setup WebDriver and open the target URL
        setupDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.from(Duration.ofSeconds(implicitWait)));
        driver.get(targetURL);
    }

    private void readConfig(String pathToFile){ // Method to read configuration properties from file
        try{
            FileInputStream fileInputStream = new FileInputStream(pathToFile); // Open input stream to the configuration file
            Properties properties = new Properties(); // Create Properties object to store configuration properties
            properties.load(fileInputStream);  // Load properties from the file
            targetURL = properties.getProperty("url"); // Read and assign the 'url' property
            browser = properties.getProperty("browser"); // Read and assign the 'browser' property
            implicitWait = Integer.parseInt(properties.getProperty("wait"));  // Read and parse the 'wait' property as an integer
        }catch (IOException e){ // Catch any IO exceptions that may occur
            System.out.println(e); // Print the exception stack trace
        }
    }

    private void setupDriver(){  // Method to set up the WebDriver based on the specified browser
        switch (browser){
            case "safari":
                driver = setupSafariDriver(); // Set up Safari WebDriver
                break;
            case "firefox":
                driver = setupFireFoxDriver(); // Set up FireFox WebDriver
                break;
            default:
                driver = setupChromeDriver(); //Set up Chrome WebDriver
        }
    }

    private WebDriver setupChromeDriver(){ // Method to set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        return driver = new ChromeDriver();
    }

    private WebDriver setupSafariDriver(){  // Method to set up SafariDriver
        WebDriverManager.safaridriver().setup();
        return new SafariDriver();
    }

    private WebDriver setupFireFoxDriver(){ // Method to set up FirefoxDriver
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}
