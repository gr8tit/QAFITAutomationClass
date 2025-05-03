package org.QAFITAutomationClass2025.SeleniumWebForms.Pages;

import org.openqa.selenium.WebDriver;
import org.QAFITAutomationClass2025.SeleniumWebForms.Mappings.SeleniumWebformMappings;

import static org.QAFITAutomationClass2025.TestBase.driver;

public class SeleniumWebformPage extends SeleniumWebformMappings{


    public SeleniumWebformPage() {
        super(driver);
    }
    public void getTextBoxValue(String value) {
        // Code to set the value of the text box
        System.out.println("Setting text box value: " + value);
        textBox.sendKeys(value);
    }

    public void clickSubmitButton() {
        // Code to click the submit button
        System.out.println("Clicking submit button");
        submitButton.click();
    }

    public String getMessageText() {
        // Code to get the message text
        return message.getText();
    }
}