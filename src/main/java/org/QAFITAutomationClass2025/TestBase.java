package org.QAFITAutomationClass2025;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class TestBase {
    public static WebDriver driver;
    public static Logger logger = LogManager.getLogger(TestBase.class);


//    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(String browserName) {
        logger.info("Setting up the test environment for browser: " + browserName);
        // Initialize the WebDriver based on the specified browser
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        } else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("safari")) {
           WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        } else {
            throw new IllegalArgumentException("Browser not supported: " + browserName);
        }

        // Maximize the window and navigate to the URL
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser after the test
        if (driver != null) {
            driver.quit();
            logger.info("Browser closed successfully.");
        }
    }

}



////        System.setProperty("webdriver.chrome.driver", "src/main/Drivers/Chrome/chromedriver");
////        WebDriver driver = new ChromeDriver();
//        // Initialize the FirefoxDriver
//        System.setProperty("webdriver.gecko.driver", "src/main/Drivers/Firefox/geckodriver");
//        FirefoxOptions options = new FirefoxOptions();
//        driver = new FirefoxDriver(options);
//        driver.manage().window().maximize();
//        driver.get("https://www.saucedemo.com/");
//        return driver;

//    }
//}

