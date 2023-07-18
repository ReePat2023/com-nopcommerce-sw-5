package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlistners.CustomListners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTabOnTopMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronicsTabOnTopMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhone;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeStoreText;
    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement successfulText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 register-button']")
    WebElement registerTab;

    public void clickOnComputerTab(){
        Reporter.log("click On Computer Tab " + computerTabOnTopMenu.toString());
        CustomListners.test.log(Status.PASS,"click On Computer Tab " + computerTabOnTopMenu);
        clickOnElement(computerTabOnTopMenu);
    }
    public String getThankYouText() {
        Reporter.log("get Thank You Text " + thankYouText.toString());
        CustomListners.test.log(Status.PASS,"get Thank You Text " + thankYouText);
        return getTextFromElement(thankYouText);
    }
    public String getSuccessfulText(){
        Reporter.log("get Successful Text " + successfulText.toString());
        CustomListners.test.log(Status.PASS,"get Successful Text " + successfulText);
        return getTextFromElement(successfulText);

    }
    public void clickOnContinue() {
        Reporter.log("click On Continue " + continueButton.toString());
        CustomListners.test.log(Status.PASS,"click On Continue " + continueButton);
        clickOnElement(continueButton);
    }
    public String getWelcomeStoreText() {
        Reporter.log("get Welcome Store Text " + welcomeStoreText.toString());
        CustomListners.test.log(Status.PASS,"get Welcome Store Text " + welcomeStoreText);
        return getTextFromElement(welcomeStoreText);
    }
    public void mouseHoverToElectronicTab(){
        Reporter.log("mouse Hover To Electronic Tab " + electronicsTabOnTopMenu.toString());
        CustomListners.test.log(Status.PASS,"mouse Hover To Electronic Tab " + electronicsTabOnTopMenu);
        mouseHoverToElement(electronicsTabOnTopMenu);
    }
    public void mouseHoverToCellPhonesAndClick(){
        Reporter.log("mouseHover ToCell Phones And Click " + cellPhone.toString());
        CustomListners.test.log(Status.PASS,"mouseHover ToCell Phones And Click " + cellPhone);
        mouseHoverToElementAndClick(cellPhone);
    }
    public void clickOnRegisterTab(){
        Reporter.log("click On Register Tab " + registerTab.toString());
        CustomListners.test.log(Status.PASS,"click On Register Tab " + registerTab);
        clickOnElement(registerTab);
    }
}
