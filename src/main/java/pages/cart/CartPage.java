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

    private final By totalProducts = By.xpath("//td[@id='total_product']");
    private final By totalShipping = By.xpath("//td[@id='total_shipping']");
    private final By total = By.xpath("//td[@id='total_price_without_tax']");
    private final By tax = By.xpath("//td[@id='total_tax']");
    private final By totalPrice = By.xpath("//td[@id='total_price_container']");

    private final By submitButton = By.xpath("//button[@type='submit' and @name='processAddress']");
    private final By iAgreeCheckbox = By.xpath("//input[@type='checkbox']");
    private final By submitInShipphing = By.xpath("//button[@type='submit' and @class='button btn btn-default standard-checkout button-medium']");
    private final By addProductUnit = By.xpath("//i[@class='icon-plus']");
    private final By deleteCart  = By.xpath("//a[@class='cart_quantity_delete']");

    public static final By cartIsEmpty = By.xpath("//*[contains(text(),'Your shopping cart is empty.')]");

    public CartPage checkNumberOfItemsInCart(String quantity) {
        Assert.assertTrue(driver.findElement(summaryProductsQuantity).getText().contentEquals(quantity));
        return this;
    }

    public CartPage comparisonOfAmounts() {
        String totalPrice = driver.findElement(By.xpath("//span[@id='total_price']")).getText();
        String totalProduct = driver.findElement(By.xpath("//td[@id='total_product']")).getText();
        System.out.println(totalPrice.equals(totalProduct));
        return this;
    }

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

    public CartPage goToShipping() {
        driver.findElement(submitButton).click();
        return this;
    }

    public CartPage iAgreeClick() {
        driver.findElement(iAgreeCheckbox).click();
        return this;
    }

    public CartPage goToPayment() {
        driver.findElement(submitInShipphing).click();
        return this;
    }

    public CartPage addProductUnit() throws InterruptedException {
        driver.findElement(addProductUnit).click();
        Thread.sleep(1700);
        return this;
    }

    public CartPage deleteCart() {
        driver.findElement(deleteCart).click();
        return this;
    }

    public CartPage checkTotal (String totalProductsValue, String totalShippingValue, String totalValue, String taxValue,
                                String totalPriceValue) {

        Assert.assertTrue(driver.findElement(totalProducts).getText().contentEquals(totalProductsValue));
        Assert.assertTrue(driver.findElement(totalShipping).getText().contentEquals(totalShippingValue));
        Assert.assertTrue(driver.findElement(total).getText().contentEquals(totalValue));
        Assert.assertTrue(driver.findElement(tax).getText().contentEquals(taxValue));
        Assert.assertTrue(driver.findElement(totalPrice).getText().contentEquals(totalPriceValue));
        return this;
    }



}
