package pages.dresses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class DressesPage extends BasePage {

    public DressesPage(WebDriver driver) {

        super(driver);
    }

    private final By viewList = By.xpath("//i[@class='icon-th-list']");
    private final By sizeL = By.xpath("//input[@name='layered_id_attribute_group_3']");
    private final By sorting = By.xpath("//select[@id='selectProductSort']");
    private final By lowestFirstSorting = By.xpath("//option[@value='price:asc']");
    private final By buttonContinueShopping = By.xpath("//span[@title='Continue shopping']");
    private final By buttonProceedToCheckout = By.xpath("//a[@title='Proceed to checkout']");

    public DressesPage viewListClick() {
        driver.findElement(viewList).click();
        return this;
    }

    public DressesPage sizeLClick() {
        driver.findElement(sizeL).click();
        return this;
    }

    public DressesPage sortingByIncreasePrice() {
        driver.findElement(sorting).click();
        driver.findElement(lowestFirstSorting).click();
        return this;
    }

    //добавить 1 товар в корзину (по индексу отображения на странице)
    public DressesPage addProductToCart(int indexProduct ){
        driver.findElements(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")).get(indexProduct-1).click();
        driver.findElement(buttonProceedToCheckout).click();
        return this;
    }

    //добавить 2 товара в корзину (по индексу отображения на странице)
    public DressesPage add2ProductToCart(int indexFirstProduct, int indexSecondProduct) {
        driver.findElements(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")).get(indexFirstProduct-1).click();
        driver.findElement(buttonContinueShopping).click();
        driver.findElements(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")).get(indexSecondProduct-1).click();
        driver.findElement(buttonProceedToCheckout).click();
        return this;
    }
}