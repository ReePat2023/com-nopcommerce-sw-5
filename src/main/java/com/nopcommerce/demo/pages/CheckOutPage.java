package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlistners.CustomListners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement address1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement zipCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement shippingContinueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentContinueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement paymentInfoContinueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement nextDayAir;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCard;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCardType;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement selectMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement selectYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Credit Card']")
    WebElement paymentTypeMessage;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Next Day Air']")
    WebElement shippingMethodText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement totalPriceText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButton;

    public void enterFirstname(String value) {
        Reporter.log("enter Firstname " + firstName.toString());
        CustomListners.test.log(Status.PASS, "enter Firstname  " + firstName);
        sendTextToElement(firstName,value);
    }
    public void enterLastname(String value) {
        Reporter.log("enter Lastname " + lastName.toString());
        CustomListners.test.log(Status.PASS, "enter Lastname  " + lastName);
        sendTextToElement(lastName,value);
    }
    public void enterEmail(String value) {
        Reporter.log("enter Email " + email.toString());
        CustomListners.test.log(Status.PASS, "enter Email  " + email);
        sendTextToElement(email,value);
    }
    public void selectCountry(String value)  {
        Reporter.log("select Country " + country.toString());
        CustomListners.test.log(Status.PASS, "select Country  " + country);
        selectByVisibleTextFromDropDown(country,value);
    }
    public void enterCity(String value) throws InterruptedException {
        Reporter.log("select City " + city.toString());
        CustomListners.test.log(Status.PASS, "select Country  " + city);
        sendTextToElement(city,value);
    }
    public void enterAddress1(String value) {
        Reporter.log("enter Address1 " + address1.toString());
        CustomListners.test.log(Status.PASS, "enter Address1  " + address1);
        sendTextToElement(address1,value);
    }
    public void enterZipCode(String value) {
        Reporter.log("enter Address1 " + zipCode.toString());
        CustomListners.test.log(Status.PASS, "enter Address1  " + zipCode);
        sendTextToElement(zipCode,value);
    }
    public void enterPhoneNumber(String value) {
        Reporter.log("enter Phone Number " + phoneNumber.toString());
        CustomListners.test.log(Status.PASS, "enter Phone Number  " + phoneNumber);
        sendTextToElement(phoneNumber,value);
    }
    public void clickOnContinue() {
        Reporter.log("click On Continue " + continueButton.toString());
        CustomListners.test.log(Status.PASS, "click On Continue  " + continueButton);
        clickOnElement(continueButton);
    }
    public void selectNextDayAir() {
        Reporter.log("select Next DayAir " + nextDayAir.toString());
        CustomListners.test.log(Status.PASS, "select Next DayAir  " + nextDayAir);
        clickOnElement(nextDayAir);
    }
    public void clickOnShippingContinue() {
        Reporter.log("click On Shipping Continue " + shippingContinueButton.toString());
        CustomListners.test.log(Status.PASS, "click On Shipping Continue  " + shippingContinueButton);
        clickOnElement(shippingContinueButton);
    }
    public void clickOnCreditCard() {
        Reporter.log("click On CreditCard " + creditCard.toString());
        CustomListners.test.log(Status.PASS, "click On CreditCard  " + creditCard);
        clickOnElement(creditCard);
    }
    public void clickOnPaymentContinue() {
        Reporter.log("click On Payment Continue " + paymentContinueButton.toString());
        CustomListners.test.log(Status.PASS, "click On Payment Continue  " + paymentContinueButton);
        clickOnElement(paymentContinueButton);
    }
    public void selectCreditCardType(String value) {
        Reporter.log("select CreditCard Type " + creditCardType.toString());
        CustomListners.test.log(Status.PASS, "select CreditCard Type  " + creditCardType);
        selectByVisibleTextFromDropDown(creditCardType,value);
    }
    public void enterCardHolderName(String value) {
        Reporter.log("enter Card Holder Name " + cardHolderName.toString());
        CustomListners.test.log(Status.PASS, "enter Card Holder Name  " + cardHolderName);
        sendTextToElement(cardHolderName,value);
    }
    public void enterCardNumber(String value) {
        Reporter.log(" enter CardNumber " + cardNumber.toString());
        CustomListners.test.log(Status.PASS, " enter CardNumber  " + cardNumber);
        sendTextToElement(cardNumber,value);
    }
    public void selectExpirationDate(String month,String year) {
        Reporter.log(" select Expiration Date ");
        CustomListners.test.log(Status.PASS, " select Expiration Date ");
        selectByVisibleTextFromDropDown(selectMonth,month);
        selectByVisibleTextFromDropDown(selectYear,year);
    }
    public void enterCardCode(String value) {
        Reporter.log("enter CardCode ");
        CustomListners.test.log(Status.PASS, "enter CardCode ");
        sendTextToElement(cardCode,value);
    }
    public String getPaymentTypeText() {
        Reporter.log("get Payment Type Text " + paymentTypeMessage.toString());
        CustomListners.test.log(Status.PASS, "get Payment Type Text " + paymentTypeMessage);
        return getTextFromElement(paymentTypeMessage);
    }
    public String getShippingMethodText() {
        Reporter.log("get Shipping Method Text " + shippingMethodText.toString());
        CustomListners.test.log(Status.PASS, "get Shipping Method Text " + shippingMethodText);
        return getTextFromElement(shippingMethodText);
    }
    public String getTotalPriceText() {
        Reporter.log("get Total PriceText " + totalPriceText.toString());
        CustomListners.test.log(Status.PASS, "get Total PriceText " + totalPriceText);
        return getTextFromElement(totalPriceText);
    }
    public void clickOnConfirm()  {
        Reporter.log("click On Confirm " + confirmButton.toString());
        CustomListners.test.log(Status.PASS, "click On Confirm " + confirmButton);
        clickOnElement(confirmButton);
    }
    public void clickOnPaymentInfoContinue(){
        Reporter.log("click On Payment Info Continue " + paymentInfoContinueButton.toString());
        CustomListners.test.log(Status.PASS, "click On Payment Info Continue " + paymentInfoContinueButton);
        clickOnElement(paymentInfoContinueButton);
    }
}
