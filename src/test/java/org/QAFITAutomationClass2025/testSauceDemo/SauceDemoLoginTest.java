package org.QAFITAutomationClass2025.testSauceDemoProject;

import org.QAFITAutomationClass2025.SauceDemoProject.Pages.SauceDemoPage;
import org.QAFITAutomationClass2025.SauceDemoProject.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SauceDemoLoginTest extends TestBase {

   WebDriver driver;

   @Test
    public void testSauceDemoStandardLogin(){ //Standard user Login Test
        //TestSteps
        driver = TestBase.setUp();
        driver.getTitle();

       SauceDemoPage sauceDemoPage = new SauceDemoPage(driver);
       sauceDemoPage.inputStandardUserName("standard_user");
       sauceDemoPage.inputStandardPassword("secret_sauce");
       sauceDemoPage.clickLoginButton();
       sauceDemoPage.getConfirmLoginText();

   }


}
