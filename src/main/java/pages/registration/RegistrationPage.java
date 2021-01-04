package pages.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    //AUTHENTICATION PAGE
    private final By emailAdress = By.xpath("//input[@name='email_create']");
    private final By submitCreateAccount = By.xpath("//button[@id='SubmitCreate']");

    //PERSONAL INFORMATION

    private final By genderSelectionMr = By.xpath("//input[(@name='id_gender') and (@value='1')]");
    private final By genderSelectionMrs = By.xpath("//input[(@name='id_gender') and (@value='2')]");
    private final By customerFirstName = By.xpath("//input[(@name='customer_firstname')]");
    private final By customerLastName = By.xpath("//input[(@name='customer_lastname')]");
    private final By customerEmail = By.xpath("//input[(@id='email')]");
    private final By password = By.xpath("//input[(@name='passwd')]");
    private final By dayOfBirth = By.xpath("//select[(@name='days')]");
    private final By monthOfBirth = By.xpath("//select[(@name='months')]");
    private final By yearOfBirth = By.xpath("//select[(@name='years')]");
    private final By newsSubscription = By.xpath("//input[@id='newsletter']");
    private final By partnerOffers = By.xpath("//input[@id='optin']");

    //ADDRESS

    private final By firstName = By.xpath("//input[@id='firstname']");
    private final By lastName = By.xpath("//input[@id='lastname']");
    private final By company = By.xpath("//input[@id='company']");
    private final By adress = By.xpath("//input[@name='address1']");
    private final By adressLine2 = By.xpath("//input[@name='address2']");
    private final By city = By.xpath("//input[@name='city']");
    private final By state = By.xpath("//select[@name='id_state']");
    private final By zip = By.xpath("//input[@name='postcode']");
    private final By country = By.xpath("//select[@name='id_country']");
    private final By additionalInformation = By.xpath("//textarea[@name='other']");
    private final By phone = By.xpath("//input[@name='phone_mobile']");
    private final By addressAlias = By.xpath("//input[@name='alias']");

    private final By submit = By.xpath("//button[@name='submitAccount']");

    //Error Message
    public static final By errorEmptyField = By.xpath("//*[contains(text(),'There are 2 errors')]");

    public RegistrationPage typeEmail(String email) throws InterruptedException {
        driver.findElement(emailAdress).sendKeys(email);
        driver.findElement(submitCreateAccount).click();
        Thread.sleep(3000);
        return this;
    }

    public RegistrationPage choiceGender(String gender) {
        if (gender.equals("man")) {
            driver.findElement(genderSelectionMr).click();
        }
        if (gender.equals("woman")) {
            driver.findElement(genderSelectionMrs).click();
        }
        return this;
    }

    public RegistrationPage typeCustomerFirstName (String firstName) {
        driver.findElement(customerFirstName).sendKeys(firstName);
        return this;
    }

    public RegistrationPage typeCustomerLastName (String lastName) {
        driver.findElement(customerLastName).sendKeys(lastName);
        return this;
    }

    public RegistrationPage typeCustomerEmail (String email) {
        driver.findElement(customerEmail).sendKeys(email);
        return this;
    }

    public RegistrationPage typePassword (String passwrd) {
        driver.findElement(password).sendKeys(passwrd);
        return this;
    }

    public RegistrationPage typeFirstName (String userFirstName) {
        driver.findElement(firstName).sendKeys(userFirstName);
        return this;
    }

    public RegistrationPage typeLastName (String userLastName) {
        driver.findElement(lastName).sendKeys(userLastName);
        return this;
    }

    public RegistrationPage typeAddress (String customerAdress) {
        driver.findElement(adress).sendKeys(customerAdress);
        return this;
    }

    public RegistrationPage typeCity (String customerCity) {
        driver.findElement(city).sendKeys(customerCity);
        return this;
    }

    public RegistrationPage typePhone (String phoneNumber) {
        driver.findElement(phone).sendKeys(phoneNumber);
        return this;
    }

    public RegistrationPage typeAdressName (String adressName) {
        driver.findElement(addressAlias).sendKeys(adressName);
        return this;
    }

    public RegistrationPage submit () {
        driver.findElement(submit).click();
        return this;
    }
}
