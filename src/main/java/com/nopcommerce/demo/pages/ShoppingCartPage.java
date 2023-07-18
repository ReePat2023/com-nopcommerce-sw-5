package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlistners.CustomListners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong")
    WebElement priceText;
    @CacheLookup
    @FindBy(xpath = "//input[contains(@id,'itemquantity')]")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']//button[@id='updatecart']")
    WebElement updateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement termsAndCondition;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shopingCart;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Go to cart']")
    WebElement goToCart;
    @CacheLookup
    @FindBy(xpath = "//input[contains(@id,'itemquantity')]")
    WebElement quantityValue;

    public String getShoppingCartText() throws InterruptedException {
        Reporter.log("get Shopping CartText " + shoppingCartText.toString());
        CustomListners.test.log(Status.PASS, "get Shopping CartText " + shoppingCartText);
        return getTextFromElement(shoppingCartText);
    }
    public String getPriceText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get PriceText " + priceText.toString());
        CustomListners.test.log(Status.PASS, "get PriceText " + priceText);
        return getTextFromElement(priceText);
    }
    public void changeValueOfQuantity(String value) {
        Reporter.log("change Value Of Quantity " + quantity.toString());
        CustomListners.test.log(Status.PASS, "change Value Of Quantity " + quantity);
        sendTextToElement(quantity,value);
    }
    public void updateShoppingCart() {
        Reporter.log("update Shopping Cart " + updateShoppingCart.toString());
        CustomListners.test.log(Status.PASS, " update Shopping Cart " + updateShoppingCart);
        clickOnElement(updateShoppingCart);
    }
    public void selectTermsAndCondition() {
        Reporter.log("select Terms And Condition " + termsAndCondition.toString());
        CustomListners.test.log(Status.PASS, "select Terms And Condition " + termsAndCondition);
        clickOnElement(termsAndCondition);
    }
    public void clickOnCheckOut() {
        Reporter.log("click On CheckOut " + checkOut.toString());
        CustomListners.test.log(Status.PASS, "click On CheckOut " + checkOut);
        clickOnElement(checkOut);
    }
    public void mouseHoverToShoppingCard() {
        Reporter.log("mouse Hover To Shopping Card " + shopingCart.toString());
        CustomListners.test.log(Status.PASS, "mouse Hover To Shopping Card " + shopingCart);
        mouseHoverToElement(shopingCart);
    }
    public void mouseHoverToGoToCardAndClick() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("mouse Hover To GoTo Card And Click " + goToCart.toString());
        CustomListners.test.log(Status.PASS, "mouse Hover To GoTo Card And Click " + goToCart);
        mouseHoverToElementAndClick(goToCart);
    }
    public String getNumberOfQuantityValue() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("get Number Of Quantity Value " + goToCart.toString());
        CustomListners.test.log(Status.PASS, "get Number Of Quantity Value " + goToCart);
        return getAttributeValueFromElement(quantityValue);
    }
}
