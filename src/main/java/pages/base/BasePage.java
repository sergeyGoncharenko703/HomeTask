package pages.base;

import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * The method for navigating to a specific URL
     */

    public void goToPage (String pageURL){

        driver.get(Constants.Servers.BASE_SHOP_URL + pageURL);
    }

    /**
     * The method for check text of error message
     */

    public BasePage checkErrorText(By errorText){
        driver.findElement(errorText);
        return this;
    }

}