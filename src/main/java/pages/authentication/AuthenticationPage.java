package pages.authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class AuthenticationPage extends BasePage {

    public AuthenticationPage(WebDriver driver) {

        super(driver);
    }

    //AUTHENTICATION PAGE
    private final By emailAdress = By.xpath("//input[@name='email_create']");
    private final By emailForAuth = By.xpath("//input[@id='email']");
    private final By passwordForAuth = By.xpath("//input[@type='password']");
    private final By submitCreateAccount = By.xpath("//button[@id='SubmitCreate']");
    private final By signInButton = By.xpath("//button[@id='SubmitLogin']");

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
    private final By adress2 = By.xpath("//input[@name='address2']");
    private final By city = By.xpath("//input[@name='city']");
    private final By state = By.xpath("//select[@name='id_state']");
    private final By zip = By.xpath("//input[@name='postcode']");
    private final By country = By.xpath("//select[@name='id_country']");
    private final By additionalInformation = By.xpath("//textarea[@name='other']");
    private final By phone = By.xpath("//input[@name='phone']");
    private final By phoneMobile = By.xpath("//input[@name='phone_mobile']");
    private final By addressAlias = By.xpath("//input[@name='alias']");

    private final By submit = By.xpath("//button[@name='submitAccount']");

    //Error Message
    public static final By errorEmptyField = By.xpath("//*[contains(text(),'There are 3 errors')]");

    public AuthenticationPage authorization (String login, String password){
        driver.findElement(emailForAuth).sendKeys(login);
        driver.findElement(passwordForAuth).sendKeys(password);
        driver.findElement(signInButton).click();
        return this;
    }

    public AuthenticationPage typeEmailForRegistration(String email) {
        driver.findElement(emailAdress).sendKeys(email);
        driver.findElement(submitCreateAccount).click();
        return this;
    }

    public AuthenticationPage choiceGender(String gender) {
        if (gender.equals("man")) {
            driver.findElement(genderSelectionMr).click();
        }
        if (gender.equals("woman")) {
            driver.findElement(genderSelectionMrs).click();
        }
        return this;
    }

    public AuthenticationPage typeCustomerFirstName (String firstName) {
        driver.findElement(customerFirstName).sendKeys(firstName);
        return this;
    }

    public AuthenticationPage typeCustomerLastName (String lastName) {
        driver.findElement(customerLastName).sendKeys(lastName);
        return this;
    }

    public AuthenticationPage selectingDateOfBirth () {
        driver.findElement(dayOfBirth).click();
        driver.findElement(By.xpath("//option[@value='21']")).click();
        driver.findElement(monthOfBirth).click();
        driver.findElement(By.xpath("//*[contains(text(),'July')]")).click();
        driver.findElement(yearOfBirth).click();
        driver.findElement(By.xpath("//option[@value='1997']")).click();
        return this;
    }

    public AuthenticationPage typeCustomerEmail (String email) {
        driver.findElement(customerEmail).sendKeys(email);
        return this;
    }

    public AuthenticationPage typePassword (String passwrd) {
        driver.findElement(password).sendKeys(passwrd);
        return this;
    }

    public AuthenticationPage typeFirstName (String userFirstName) {
        driver.findElement(firstName).sendKeys(userFirstName);
        return this;
    }

    public AuthenticationPage typeLastName (String userLastName) {
        driver.findElement(lastName).sendKeys(userLastName);
        return this;
    }

    public AuthenticationPage typeCompany (String companyName) {
        driver.findElement(company).sendKeys(companyName);
        return this;
    }

    public AuthenticationPage typeAddress (String customerAdress) {
        driver.findElement(adress).sendKeys(customerAdress);
        return this;
    }

    public AuthenticationPage typeAddressLine2 (String customerAdressLine2) {
        driver.findElement(adress2).sendKeys(customerAdressLine2);
        return this;
    }

    public AuthenticationPage selectingCountry () {
        driver.findElement(country).click();
        driver.findElements(By.xpath("//option[@value='']")).get(4).click();
        return this;
    }

    public AuthenticationPage selectingState() {
        driver.findElement(state).click();
        driver.findElement(By.xpath("//option[@value='32']")).click();
        return this;
    }

    public AuthenticationPage typeCity (String customerCity) {
        driver.findElement(city).sendKeys(customerCity);
        return this;
    }

    public AuthenticationPage typeZIP (String zipCode) {
        driver.findElement(zip).sendKeys(zipCode);
        return this;
    }

    public AuthenticationPage typePhone (String phoneNumber) {
        driver.findElement(phone).sendKeys(phoneNumber);
        return this;
    }

    public AuthenticationPage typePhoneMobile (String mobilePhoneNumber) {
        driver.findElement(phoneMobile).sendKeys(mobilePhoneNumber);
        return this;
    }

    public AuthenticationPage typeAddInfo (String addInfo) {
        driver.findElement(additionalInformation).sendKeys(addInfo);
        return this;
    }

    public AuthenticationPage typeAdressName (String adressName) {
        driver.findElement(addressAlias).sendKeys(adressName);
        return this;
    }

    public AuthenticationPage submit () {
        driver.findElement(submit).click();
        return this;
    }
}
