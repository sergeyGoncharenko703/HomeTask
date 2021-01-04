package tests.purchase;

import org.junit.Test;
import tests.base.BaseTest;

import static constants.Constants.Pages.DRESSES;

public class PurchaseTest extends BaseTest {

    @Test
    public void purchasePositive() throws InterruptedException {
        basePage.goToPage(DRESSES);
        dressesPage.viewListClick()
                   .sizeLClick()
                   .sortingByIncreasePrice()
                   .addToCart()
                   .checkNumberOfItemsInCart()
                   .comparisonOfAmounts();
    }
}