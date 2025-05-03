package org.QAFITAutomationClass2025.SauceDemoProject.Mappings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebDriver;

public class SauceDemoMappings {


    public SauceDemoMappings(WebDriver driver) {
        PageFactory.initElements(driver, this);
        // Initialize the elements using PageFactory
//        this.driver = driver;

    }

    @FindBy(id = "user-name")
    public WebElement standardUsername;

    @FindBy(name = "password")
    public WebElement standardPassword;

    @FindBy(css = "#login-button")
    public WebElement loginButton;

    @FindBy(css = "#header_container > div.header_secondary_container > span")
    public WebElement confirmLogin;

    @FindBy(id = "react-burger-menu-btn")
    public WebElement clickMenu;

    @FindBy(id = "logout_sidebar_link")
    public WebElement logoutButton;

    @FindBy(css = "#login_button_container > div > form > div.error-message-container.error")
    public WebElement confirmLockedoutUser;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCartButton;

    @FindBy(css = "#inventory_container > div > div:nth-child(1) > div.inventory_item_description > div.pricebar > div")
    public WebElement priceOfBackpack;

    @FindBy(css = ".shopping_cart_link")
    public WebElement cartButton;

    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeBackpackButton;

    @FindBy(id = "continue-shopping")
    public WebElement continueShoppingButton;

    @FindBy(id = "checkout")
    public WebElement checkoutButton;

    @FindBy(css = ".title")
    public WebElement checkoutPageTitle;



}
