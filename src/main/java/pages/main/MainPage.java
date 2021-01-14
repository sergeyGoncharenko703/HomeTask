package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.authentication.AuthenticationPage;
import pages.base.BasePage;

import java.awt.*;


public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final By search = By.xpath("//input[@name='search_query']");

    public MainPage search (String searchText) {
        driver.findElement(search).sendKeys(searchText+"\n");
        return this;
    }
}
