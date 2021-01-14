package tests.authentication.positive;

import org.junit.Test;
import tests.base.BaseTest;

import static constants.Constants.Pages.AUTHENTICATION;

public class AuthenticationPositiveTest extends BaseTest {

    @Test
    public void baseTest() {
        basePage.goToPage(AUTHENTICATION);
        authenticationPage.typeEmailForRegistration(generateRandomString() + "@gmail.com")
                .choiceGender("man")
                .typeCustomerFirstName("Sergey")
                .typeCustomerLastName("Honcharenko")
                .selectingDateOfBirth()
                .typePassword("qwerty123")
                .typeCompany("Goldman Sachs")
                .typeAddress("9 West 57th Street")
                .typeAddressLine2("flat 20")
                .typeCity("New York")
                .typeZIP("00000")
                .selectingState()
                .typePhoneMobile("+380639203360")
                .typePhone("1-800-870-3676")
                .typeAddInfo("test")
                .typeAdressName("Home")
                .submit();
    }
}