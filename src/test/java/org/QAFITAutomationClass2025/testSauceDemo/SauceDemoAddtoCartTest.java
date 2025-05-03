package org.QAFITAutomationClass2025.testSauceDemo;

import org.QAFITAutomationClass2025.SauceDemoProject.Pages.SauceDemoPage;
import org.QAFITAutomationClass2025.TestBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SauceDemoAddtoCartTest extends TestBase {



    @Test(priority = 1, groups = {"smoke", "regression"}, description = "Add to cart Test")
    public void testSauceDemoAddtoCart() throws InterruptedException { //Add to cart Test
        //TestSteps
//
        TestBase testBase = new TestBase();
        testBase.setUp("firefox");
        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.inputUserName("standard_user");
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.clickLoginButton();
        logger.info("Login button clicked");
        sauceDemoPage.getConfirmLoginText();
//        Thread.sleep(50000);
        sauceDemoPage.clickAddToCartButton();

        sauceDemoPage.getPriceOfBackpack();


    }

    @Test
    public void testSauceDemoRemoveFromCart() { //Add to cart Test
        //TestSteps
        TestBase testBase = new TestBase();
        testBase.setUp("firefox");
        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.inputUserName("standard_user");
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.clickLoginButton();
        sauceDemoPage.getConfirmLoginText();
        sauceDemoPage.clickAddToCartButton();
        sauceDemoPage.clickCartButton();
        sauceDemoPage.clickRemoveBackpackButton();


    }
    //continue shopping
    @Test
    public void testSauceDemoContinueShoppingButton() { //Add to cart Test
        //TestSteps
        TestBase testBase = new TestBase();
        testBase.setUp("firefox");
        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.inputUserName("standard_user");
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.clickLoginButton();
        sauceDemoPage.getConfirmLoginText();
        sauceDemoPage.clickAddToCartButton();
        sauceDemoPage.clickCartButton();
        sauceDemoPage.clickContinueShoppingButton();

    }

    //checkout
    @Test
    public void testSauceDemoCheckout() { //Add to cart Test
        //TestSteps
        TestBase testBase = new TestBase();
        testBase.setUp("firefox");
        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.inputUserName("standard_user");
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.clickLoginButton();
        sauceDemoPage.getConfirmLoginText();
        sauceDemoPage.clickAddToCartButton();
        sauceDemoPage.clickCartButton();
        sauceDemoPage.clickCheckoutButton();
        assertEquals(sauceDemoPage.getCheckoutPageTitle(), "Checkout: Your Information");
        logger.info("Checkout page title is: " + sauceDemoPage.getCheckoutPageTitle());
    }





}
