package org.QAFITAutomationClass2025.SauceDemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class TestBase {
    protected static WebDriver driver;

    public static WebDriver setUp() {
        // Set the path to your local ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/Drivers/Chrome/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        return driver;
    }
}

