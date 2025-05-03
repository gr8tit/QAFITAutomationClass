package org.QAFITAutomationClass2025.testSeleniumWebforms;

import org.QAFITAutomationClass2025.SeleniumWebForms.Pages.SeleniumWebformPage;
import org.QAFITAutomationClass2025.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SeleniumWebformTest extends TestBase {
    WebDriver driver;


    @Test
    public void testSeleniumWebform() {
        //TestSteps
        TestBase testBase = new TestBase();
        testBase.setUp("firefox");
        SeleniumWebformPage seleniumWebformPage = new SeleniumWebformPage();

        seleniumWebformPage.getTextBoxValue("Welcome to Selenium Web forms");
        seleniumWebformPage.clickSubmitButton();
        seleniumWebformPage.getMessageText();
        System.out.println("Message: " + seleniumWebformPage.getMessageText());
    }
}
