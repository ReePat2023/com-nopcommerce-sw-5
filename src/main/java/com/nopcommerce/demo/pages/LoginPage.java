package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlistners.CustomListners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
    WebElement guestCheckout;

    public String getWelcomeText(){
        Reporter.log("get Welcome Text " + welcomeText.toString());
        CustomListners.test.log(Status.PASS,"get Welcome Text " + welcomeText);
        return getTextFromElement(welcomeText);
    }

    public void clickOnGuestCheckout(){
        Reporter.log("get Welcome Text " + welcomeText.toString());
        CustomListners.test.log(Status.PASS,"get Welcome Text " + welcomeText);
        clickOnElement(guestCheckout);
    }
}

