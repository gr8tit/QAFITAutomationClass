package org.QAFITAutomationClass2025.testSauceDemo;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.QAFITAutomationClass2025.SauceDemoProject.Pages.SauceDemoPage;
import org.QAFITAutomationClass2025.TestBase;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import static org.testng.Assert.assertEquals;

public class SauceDemoAddtoCartTest extends TestBase {

    ExtentReports extent;
    ExtentTest test;

    @BeforeSuite
    public void setReport() {
        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("OS", System.getProperty("os.name"));
    }

    @Test(priority = 1, groups = {"smoke", "regression"}, description = "Add to cart Test")
    public void testSauceDemoAddtoCart() throws InterruptedException { //Add to cart Test
        test = extent.createTest("testSauceDemoAddtoCart");
        test.info("Add to cart Test started");

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

        logger.info("Price of backpack is: " + sauceDemoPage.getPriceOfBackpack());
        test.pass("Test passed");
        extent.flush();

//




    }

    @Test
    public void testSauceDemoRemoveFromCart() { //Add to cart Test
        //TestSteps

        test = extent.createTest("testSauceDemoRemoveFromCart");
        test.info("" + "Remove from cart Test started");

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
        test.pass("Test passed");
        extent.flush();


    }
    //continue shopping
    @Test
    public void testSauceDemoContinueShoppingButton() { //Add to cart Test
        //TestSteps

        test = extent.createTest("testSauceDemoContinueShoppingButton");
        test.info("Continue shopping Test started");
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
        test.pass("Test passed");
        extent.flush();

    }

    //checkout
    @Test
    public void testSauceDemoCheckout() { //Add to cart Test
        //TestSteps
        test = extent.createTest("testSauceDemoCheckout");
        test.info("" + "Checkout Test started");
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
        test.pass("Test passed");
        logger.info(test.info("Checkout page title is: " + sauceDemoPage.getCheckoutPageTitle()));
        extent.flush();
    }


//    @AfterSuite
//    public void tearDown() {
//        extent.flush(); // Generates the report
//    }


}
