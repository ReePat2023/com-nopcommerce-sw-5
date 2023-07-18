package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlistners.CustomListners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectHDD;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-price']//span")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement microsoftOfficeSoftwareOption;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommanderSoftwareOption;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']")
    WebElement successfullyText;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeNotificationBar;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shopingCart;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Go to cart']")
    WebElement goToCart;

    public String getBuildYourOwnComputerText()  {
        Reporter.log("" + buildYourOwnComputerText .toString());
        CustomListners.test.log(Status.PASS,"");
        return getTextFromElement(buildYourOwnComputerText);
    }
    public void selectProcessor(String name) {
        Reporter.log("" + selectProcessor .toString());
        CustomListners.test.log(Status.PASS,"");
        selectByVisibleTextFromDropDown(selectProcessor, name);
    }
    public void selectRam(String name) {
        Reporter.log("" + selectRam .toString());
        CustomListners.test.log(Status.PASS,"");
        selectByVisibleTextFromDropDown(selectRam, name);
    }
    public void selectHDD(String value) {
        Reporter.log("select HDD ");
        CustomListners.test.log(Status.PASS, "select HDD ");
        clickOnElement(By.xpath("//label[normalize-space()='" + value + "']"));
    }
    public void selectOs(String value)  {
        Reporter.log("select Os ");
        CustomListners.test.log(Status.PASS, "select Os ");
        clickOnElement(By.xpath("//label[contains(normalize-space(),'" + value + "')]"));
    }
    public void selectMicrosoftOfficeSoftwareOption() {
        Reporter.log(" select Microsoft Office SoftwareOption " + microsoftOfficeSoftwareOption.toString());
        CustomListners.test.log(Status.PASS, " select Microsoft Office SoftwareOption " + microsoftOfficeSoftwareOption);
        selectCheckBox((By) microsoftOfficeSoftwareOption);
    }

    public void selectTotalCommanderSoftwareOption() {
        Reporter.log(" select Total Commander Software Option " + totalCommanderSoftwareOption.toString());
        CustomListners.test.log(Status.PASS, " select Total Commander Software Option " + totalCommanderSoftwareOption);
        selectCheckBox((By) totalCommanderSoftwareOption);
    }
    public String getTotalPriceText() {
        Reporter.log("get Total Price Text " + totalPrice.toString());
        CustomListners.test.log(Status.PASS, "get Total Price Text " + totalPrice);
        return getTextFromElement(totalPrice);
    }
    public void clickOnAddtoCart() {
        Reporter.log("click On Add to Cart " + addToCart.toString());
        CustomListners.test.log(Status.PASS, "click On Add to Cart " + addToCart);
        clickOnElement(addToCart);
    }
    public String getSuccessfullAddedToCartText() throws InterruptedException {
        Reporter.log("get Successfully Added To CartText " + successfullyText.toString());
        CustomListners.test.log(Status.PASS, "get Successfully Added To CartText " + successfullyText);
        return getTextFromElement(successfullyText);
    }
    public void closeNotificationBar() {
        Reporter.log("close Notification Bar " + closeNotificationBar.toString());
        CustomListners.test.log(Status.PASS, "close Notification Bar " + closeNotificationBar);
        clickOnElement(closeNotificationBar);
    }
    public void mouseHoverToShoppingCartAndClickOnCart() {
        Reporter.log("mouse Hover To ShoppingCart " + shopingCart.toString());
        CustomListners.test.log(Status.PASS, "mouse Hover To ShoppingCart " + shopingCart);
        mouseHoverToElement(shopingCart);
        CustomListners.test.log(Status.PASS, "mouse Hover To ShoppingCart And ClickOnCart " + goToCart);
        mouseHoverToElementAndClick(goToCart);
    }
}
