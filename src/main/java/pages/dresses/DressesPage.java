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

    /**
     * 3. Переключиться в List View
     */
    public DressesPage viewListClick() {
        driver.findElement(viewList).click();
        return this;
    }

    /**
     * 4. Отфильтровать товары по размеру L
     */
    public DressesPage sizeLClick() {
        driver.findElement(sizeL).click();
        return this;
    }

    /**
     * 5. Отсортировать товары по возрастанию цены
     */
    public DressesPage sortingByIncreasePrice() {
        driver.findElement(sorting).click();
        driver.findElement(lowestFirstSorting).click();
        return this;
    }

    /**
     * 6. Добавить первые два товара в корзину
     * 7. Перейти в корзину
     */
    public DressesPage addToCart() {
        driver.findElements(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")).get(0).click();
        //Thread.sleep(2000);
        driver.findElement(buttonContinueShopping).click();
        driver.findElements(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")).get(1).click();
        //Thread.sleep(2000);
        driver.findElement(buttonProceedToCheckout).click();
        return this;
    }

}