package tests.base;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.dresses.DressesPage;
import pages.registration.RegistrationPage;

public class BaseTest {

    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RegistrationPage registrationPage = new RegistrationPage(driver);
    protected DressesPage dressesPage = new DressesPage(driver);
}