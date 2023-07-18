package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlistners.CustomListners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ElectronicsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Electronics']")
    WebElement electronicsTabText;

    public String getElectronicsHeaderText(){
        Reporter.log("get Electronics HeaderText " + electronicsTabText.toString());
        CustomListners.test.log(Status.PASS, "get Electronics HeaderText " + electronicsTabText);
        return getTextFromElement(electronicsTabText);
    }

    public void selectMenu(String menu) {
        Reporter.log("This method select menu on top menu ");
        CustomListners.test.log(Status.PASS, "This method select menu on top menu ");
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" + menu + "']"));
    }
}
