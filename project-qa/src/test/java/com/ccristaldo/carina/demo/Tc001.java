package com.ccristaldo.carina.demo;

import com.ccristaldo.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc001 implements IAbstractTest {

    @Test
    public void openCloseChomeTest(){

        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        homePage.getDriver().close();
    }
}
