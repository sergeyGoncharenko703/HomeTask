package pages.cart;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.dresses.DressesPage;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonProceedToCheckout1 = By.xpath("//a[@title='Proceed to checkout' and @class='button btn btn-default standard-checkout button-medium']");

    private final By firstnameAndLastnameData = By.xpath("//li[@class='address_firstname address_lastname']");
    private final By companyData = By.xpath("//li[@class='address_company']");
    private final By addressAndCityData = By.xpath("//li[@class='address_address1 address_address2']");
    private final By postalData = By.xpath("//li[@class='address_city address_state_name address_postcode']");
    private final By countryData = By.xpath("//li[@class='address_country_name']");
    private final By mobilePhoneData = By.xpath("//li[@class='address_phone_mobile']");
    private final By summaryProductsQuantity = By.xpath("//span[@id='summary_products_quantity']");




    private final By submitButton = By.xpath("//button[@type='submit' and @name='processAddress']");
    private final By iAgreeCheckbox = By.xpath("//input[@type='checkbox']");
    private final By submitInShipphing = By.xpath("//button[@type='submit' and @class='button btn btn-default standard-checkout button-medium']");

    /**
     * 8. Проверить что оба товара в корзине
     */
    public CartPage checkNumberOfItemsInCart(String quantity) {

        Assert.assertTrue(driver.findElement(summaryProductsQuantity).getText().contentEquals(quantity));
        //driver.findElement(By.xpath("//span[@id='summary_products_quantity' and (text())='2 Products']"));
        return this;
    }

    /**
     * 9. Проверить что Total товаров равно Total Products
     */
    public CartPage comparisonOfAmounts() {
        String totalPrice = driver.findElement(By.xpath("//span[@id='total_price']")).getText();
        String totalProduct = driver.findElement(By.xpath("//td[@id='total_product']")).getText();
        System.out.println(totalPrice.equals(totalProduct));
        return this;
    }

    /**
     * 11. Перейти в Adress, проверить Billing Adress
     */
    public CartPage proceedToCheckoutClick() {
        driver.findElement(buttonProceedToCheckout1).click();
        return this;
    }

    public CartPage checkBillingAdress (String firstnameAndLastname, String company, String addressAndCity,
                                        String postal, String country, String mobilePhone) {

        Assert.assertTrue(driver.findElement(firstnameAndLastnameData).getText().contentEquals(firstnameAndLastname));
        Assert.assertTrue(driver.findElement(companyData).getText().contentEquals(company));
        Assert.assertTrue(driver.findElement(addressAndCityData).getText().contentEquals(addressAndCity));
        Assert.assertTrue(driver.findElement(postalData).getText().contentEquals(postal));
        Assert.assertTrue(driver.findElement(countryData).getText().contentEquals(country));
        Assert.assertTrue(driver.findElement(mobilePhoneData).getText().contentEquals(mobilePhone));

        return this;
    }
    /**
     * 12. Перейти в Shipping
     */
    public CartPage goToShipping() {
        driver.findElement(submitButton).click();
        return this;
    }

    /**
     * 13. Активировать I agree
     */

    public CartPage iAgreeClick() {
        driver.findElement(iAgreeCheckbox).click();
        return this;
    }

    /**
     * 14. Перейти на страницу Payment
     */
    public CartPage goToPayment() {
        driver.findElement(submitInShipphing).click();
        return this;
    }

}
