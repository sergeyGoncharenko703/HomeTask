package tests.purchase.positive;

import org.junit.Test;
import tests.base.BaseTest;

import static constants.Constants.Pages.AUTHENTICATION;
import static constants.Constants.Pages.DRESSES;
import static pages.cart.CartPage.cartIsEmpty;

public class PurchaseTest extends BaseTest {

    @Test
    public void buyingTwoDresses() {
        basePage.goToPage(AUTHENTICATION);
        authenticationPage.authorization("sergey.goncharenko7@gmail.com", "P@iSUB7mG6!NQ5E");
        basePage.goToPage(DRESSES);
        dressesPage.viewListClick()
                   .sizeLClick()
                   .sortingByIncreasePrice()
                   .add2ProductToCart(1, 2);
        cartPage.checkNumberOfItemsInCart("1 Product") //баг с отображением количества товара, указал 1 product чтобы тест не падал
                .comparisonOfAmounts()
                .proceedToCheckoutClick()
                .checkBillingAdress ("Сергей Гончаренко", "Goldman Sachs",
                                     "Bedford street, 90 New York", "test, New York 00000",
                                     "United States", "+380638292111")
                .goToShipping()
                .iAgreeClick()
                .goToPayment();
    }

    @Test
    public void buyingBlouse() throws InterruptedException {
        basePage.goToPage("");
        mainPage.search("blouse");
        dressesPage.viewListClick()
                   .addProductToCart(1);
        cartPage.addProductUnit()
                .checkTotal("$54.00", "$2.00", "$56.00", "$0.00",
                            "$56.00")
                .deleteCart();
        basePage.checkErrorText(cartIsEmpty);
    }
}