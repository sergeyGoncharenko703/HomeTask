package tests.registation.negative;

import constants.Constants;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import tests.base.BaseTest;

import static constants.Constants.Pages.REGISTRATION;
import static pages.registration.RegistrationPage.errorEmptyField;

public class RegistrationNegativeTest extends BaseTest {

    @Test
    public void baseTest() throws InterruptedException {
        basePage.goToPage(REGISTRATION);
        registrationPage.typeEmail("sergey.goncharenko7@gmail.com")
                        .choiceGender("man")
                        .typeCustomerFirstName("Сергей")
                        .typeCustomerLastName("Гончаренко")
                        .typePassword("qwerty123")
//                        .typeFirstName("тест")
//                        .typeLastName("тест")
                        .typeAddress("9 West 57th Street")
                        .typeCity("New York")
                        .typePhone("380639203360")
                        .typeAdressName("Home")
                        .submit();
        basePage.checkErrorText(errorEmptyField);
    }
}