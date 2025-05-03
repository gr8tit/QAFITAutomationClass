package org.QAFITAutomationClass2025.SauceDemoProject.Pages;

import org.QAFITAutomationClass2025.SauceDemoProject.Mappings.SauceDemoMappings;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.QAFITAutomationClass2025.TestBase.driver;
import static org.testng.Assert.*;


public class SauceDemoPage extends SauceDemoMappings{

    //Constructor
    public SauceDemoPage() {
        super(driver);
    }

    public void inputUserName(String username) {
        standardUsername.sendKeys(username);
    }

    public void inputPassword(String password) {
        standardPassword.sendKeys(password);
    }
    public void clickLoginButton() {
        loginButton.click();
        // Wait for the page to load- implicit wait
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Wait for the page to load- explicit wait
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until((driver -> {
            String title = driver.getTitle();
            return title.equals("Swag Labs");
        }));


    }
    public String getConfirmLoginText() {
        return confirmLogin.getText();
    }
    public void getLockedOutUserText() {
        confirmLockedoutUser.getText();
        assertTrue(confirmLockedoutUser.isDisplayed(), "Locked out user message is not displayed");
        assertEquals(confirmLockedoutUser.getText(), "Epic sadface: Sorry, this user has been locked out.");
        System.out.println("Locked out user message: " + confirmLockedoutUser.getText());
    }
    //Log out user
    public void clickMenu() {
        clickMenu.click();
    }
    public void clickLogoutButton() {
        logoutButton.click();
    }

    //Add to cart
    public void clickAddToCartButton() {
        addToCartButton.click();
    }
    public String getPriceOfBackpack() {

        return priceOfBackpack.getText();
    }
    public void clickCartButton() {
        cartButton.click();
    }

    public void clickRemoveBackpackButton() {
        removeBackpackButton.click();
    }

    public void clickContinueShoppingButton() {
        continueShoppingButton.click();
    }
    public void clickCheckoutButton() {
        checkoutButton.click();
    }
    public String getCheckoutPageTitle() {
        return checkoutPageTitle.getText();
    }




}
