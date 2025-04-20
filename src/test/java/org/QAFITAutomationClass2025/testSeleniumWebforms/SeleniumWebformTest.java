package org.QAFITAutomationClass2025.testSauceDemoProject;

import org.QAFITAutomationClass2025.SauceDemoProject.Pages.SeleniumWebformPage;
import org.QAFITAutomationClass2025.SauceDemoProject.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SeleniumWebformTest extends TestBase {
    WebDriver driver;


    @Test
    public void testSeleniumWebform() {
        //TestSteps
        driver = TestBase.setUp();
        driver.getTitle();
        System.out.println("Page title is: " + driver.getTitle());
        SeleniumWebformPage seleniumWebformPage = new SeleniumWebformPage(driver);

        seleniumWebformPage.getTextBoxValue("Welcome to Selenium Web forms");
        seleniumWebformPage.clickSubmitButton();
        seleniumWebformPage.getMessageText();
        System.out.println("Message: " + seleniumWebformPage.getMessageText());
    }
}
