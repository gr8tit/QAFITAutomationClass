package org.QAFITAutomationClass2025.testSauceDemo;

import org.QAFITAutomationClass2025.TestBase;
import org.openqa.selenium.WebDriver;
import org.QAFITAutomationClass2025.SauceDemoProject.Pages.SauceDemoPage;
import org.testng.annotations.Test;

public class SauceDemoLogoutTest extends TestBase {

    WebDriver driver;

    @Test
    public void testSauceDemoLogout() { //Logout Test
        //TestSteps
        TestBase testBase = new TestBase();
        testBase.setUp("firefox");

        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.inputUserName("standard_user");
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.clickLoginButton();
        sauceDemoPage.getConfirmLoginText();
        sauceDemoPage.clickMenu();
        sauceDemoPage.clickLogoutButton();

    }


}
