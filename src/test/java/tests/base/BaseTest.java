package tests.base;

import common.CommonActions;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.cart.CartPage;
import pages.dresses.DressesPage;
import pages.authentication.AuthenticationPage;
import pages.main.MainPage;

public class BaseTest {

    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected AuthenticationPage authenticationPage = new AuthenticationPage(driver);
    protected DressesPage dressesPage = new DressesPage(driver);
    protected CartPage cartPage = new CartPage(driver);
    protected MainPage mainPage = new MainPage(driver);


    public static String generateRandomString() {
        return RandomStringUtils.randomAlphabetic(5);
    }
}