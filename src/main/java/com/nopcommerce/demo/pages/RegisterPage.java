package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlistners.CustomListners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmpassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompleted;

    public void enterFirstname(String value) {
        Reporter.log("enter Firstname " + firstName.toString());
        CustomListners.test.log(Status.PASS,"enter Firstname " + firstName);
        sendTextToElement(firstName,value);
    }
    public void enterLastname(String value) {
        Reporter.log("enter Lastname " + lastName.toString());
        CustomListners.test.log(Status.PASS,"enter Lastname " + lastName);
        sendTextToElement(lastName,value);
    }
    public void enterEmail(String value) {
        Reporter.log("enter Email " + email.toString());
        CustomListners.test.log(Status.PASS,"enter Email " + email);
        sendTextToElement(email,value);
    }
    public void enterPassword(String value) {
        Reporter.log("enter Password " + password.toString());
        CustomListners.test.log(Status.PASS,"enter Password " + password);
        sendTextToElement(password,value);
    }
    public void enterConfirmPassword(String value) {
        Reporter.log("enter Confirm Password " + confirmpassword.toString());
        CustomListners.test.log(Status.PASS,"enter Confirm Password " + confirmpassword);
        sendTextToElement(confirmpassword, value);
        sendTextToElement(confirmpassword,value);
    }
    public void clickOnRegisterButton() {
        Reporter.log("click On Register Button " + registerButton.toString());
        CustomListners.test.log(Status.PASS,"click On Register Button " + registerButton);
        clickOnElement(registerButton);
    }
    public String getRegistrationCompletedText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Registration Completed Text " + registrationCompleted.toString());
        CustomListners.test.log(Status.PASS,"get Registration Completed Text " + registrationCompleted);
        return getTextFromElement(registrationCompleted);
    }
}
