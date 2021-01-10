package tests.purchase.positive;

import org.junit.Test;
import tests.base.BaseTest;

import static constants.Constants.Pages.AUTHENTICATION;
import static constants.Constants.Pages.DRESSES;

public class PurchaseTest extends BaseTest {

    @Test
    public void purchasePositive() {
        basePage.goToPage(AUTHENTICATION);
        authenticationPage.authorization("sergey.goncharenko7@gmail.com", "P@iSUB7mG6!NQ5E");
        basePage.goToPage(DRESSES);
        dressesPage.viewListClick()
                   .sizeLClick()
                   .sortingByIncreasePrice()
                   .addToCart();
        cartPage.checkNumberOfItemsInCart("1 Product")
                .comparisonOfAmounts()
                .proceedToCheckoutClick()
                .checkBillingAdress ("Сергей Гончаренко", "Goldman Sachs",
                                     "Bedford street, 90 New York", "test, New York 00000",
                                     "United States", "+380638292111")
                .goToShipping()
                .iAgreeClick()
                .goToPayment();
    }
}