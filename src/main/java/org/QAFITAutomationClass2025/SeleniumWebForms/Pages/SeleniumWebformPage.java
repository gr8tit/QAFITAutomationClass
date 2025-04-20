package org.QAFITAutomationClass2025.SauceDemoProject.Pages;

import org.QAFITAutomationClass2025.SauceDemoProject.Mappings.SeleniumWebformMappings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SeleniumWebformPage {

    SeleniumWebformMappings mappings;

    public SeleniumWebformPage(WebDriver driver) {
        this.mappings = new SeleniumWebformMappings(driver);
        PageFactory.initElements(driver, this.mappings);
    }

    public void getTextBoxValue(String value) {
        // Code to set the value of the text box
        System.out.println("Setting text box value: " + value);
        mappings.textBox.sendKeys(value);
    }

    public void clickSubmitButton() {
        // Code to click the submit button
        System.out.println("Clicking submit button");
        mappings.submitButton.click();
    }

    public String getMessageText() {
        // Code to get the message text
        return mappings.message.getText();
    }
}