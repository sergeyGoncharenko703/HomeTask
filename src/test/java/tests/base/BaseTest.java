package tests.base;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.cart.CartPage;
import pages.dresses.DressesPage;
import pages.authentication.AuthenticationPage;

public class BaseTest {

    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected AuthenticationPage authenticationPage = new AuthenticationPage(driver);
    protected DressesPage dressesPage = new DressesPage(driver);
    protected CartPage cartPage = new CartPage(driver);
}