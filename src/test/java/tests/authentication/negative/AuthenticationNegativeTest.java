package tests.authentication.negative;

import org.junit.Test;
import tests.base.BaseTest;

import static constants.Constants.Pages.AUTHENTICATION;
import static pages.authentication.AuthenticationPage.errorEmptyField;

public class AuthenticationNegativeTest extends BaseTest {

    @Test
    public void baseTest() {
        basePage.goToPage(AUTHENTICATION);
        authenticationPage.typeEmailForRegistration("sergej.goncharenko@privatbank.ua")
                .choiceGender("man")
                .typeCustomerFirstName("Сергей")
                .typeCustomerLastName("Гончаренко")
                .typePassword("qwerty123")
                .typeAddress("9 West 57th Street")
                .typeCity("New York")
                .typeZIP("00000")
                .selectingCountry()
                .typePhone("380639203360")
                .typeAdressName("Home")
                .submit();
        basePage.checkErrorText(errorEmptyField);
    }
}