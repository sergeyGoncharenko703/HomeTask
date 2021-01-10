package tests.registation.positive;

import org.junit.Test;
import tests.base.BaseTest;

import static constants.Constants.Pages.AUTHENTICATION;

public class AuthenticationPositiveTest extends BaseTest {

    @Test
    public void baseTest() {
        basePage.goToPage(AUTHENTICATION);
        authenticationPage.typeEmailForRegistration("sergey.goncharenko7@gmail.com")
                .choiceGender("man")
                .typeCustomerFirstName("Сергей")
                .typeCustomerLastName("Гончаренко")
                .typePassword("qwerty123")
                .typeAddress("9 West 57th Street")
                .typeCity("New York")
                .typePhone("380639203360")
                .typeAdressName("Home")
                .submit();
    }
}