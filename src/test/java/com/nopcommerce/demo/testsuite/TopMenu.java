package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlistners.CustomListners;
import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListners.class)
public class TopMenu extends BaseTest {
    ElectronicsPage electronicsPage;

    @BeforeMethod
    public void inIt() {

        electronicsPage = new ElectronicsPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyPageNavigation() {
        String menuName = "Electronics";
        String expectedMessage = "Electronics";
        // This method select Electronics tab on top menu
        electronicsPage.selectMenu(menuName);
        String actualMessage= electronicsPage.getElectronicsHeaderText();
        Assert.assertEquals(expectedMessage,actualMessage,"Unable to click on");
    }
}
