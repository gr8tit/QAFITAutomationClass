package org.QAFITAutomationClass2025.SauceDemoProject.Mappings;

import org.QAFITAutomationClass2025.SauceDemoProject.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SeleniumWebformMappings {

    // WebDriver driver;
    WebDriver driver;
    public SeleniumWebformMappings(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(name = "my-text")
    public WebElement textBox;

    @FindBy(css = "body > main > div > form > div > div:nth-child(2) > button")
    public WebElement submitButton;

    @FindBy(id = "message")
    public WebElement message;



}
