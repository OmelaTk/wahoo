package pageObjects.checkout;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.MainFrame;


public class CheckoutPage extends MainFrame {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    private WebElement expressShippingRB(){
        return driver.findElement(By.xpath(CheckoutSelectors.expressShippingRadioButton));
    }
    private WebElement totalShippingAmount(){
        return driver.findElement(By.xpath(CheckoutSelectors.shippingAmount));
    }

    private WebElement placeOrderButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutSelectors.placeOrderButton)));
        return driver.findElement(By.xpath(CheckoutSelectors.placeOrderButton));
    }

    public void clickPlaceOrderButton() {
        try {
            placeOrderButton().click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private WebElement errorMessage() {
        return driver.findElement(By.xpath(CheckoutSelectors.attention));
    }

    public boolean errorMessageAppear() {
        return errorMessage().isDisplayed();
    }

    private WebElement acceptButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutSelectors.acceptButton)));
        return driver.findElement(By.xpath(CheckoutSelectors.acceptButton));
    }

    public void clickAcceptButton() {
        acceptButton().click();
    }

    public void placeOrder() {
        try {
            clickPlaceOrderButton();
        } catch (Exception e) {
            errorMessageAppear();
        }
    }
    public void switchToExpressShipping(){
        expressShippingRB().click();
    }

    private WebElement emailField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CheckoutSelectors.emailField)));
        return driver.findElement(By.xpath(CheckoutSelectors.emailField));
    }

    private WebElement firstNameField() {
        return driver.findElement(By.xpath(CheckoutSelectors.firstName));
    }

    private WebElement lastNameField() {
        return driver.findElement(By.xpath(CheckoutSelectors.lastName));
    }

    private WebElement city() {
        return driver.findElement(By.xpath(CheckoutSelectors.city));
    }

    private WebElement streetAddress() {
        return driver.findElement(By.xpath(CheckoutSelectors.street));
    }

    private WebElement zip() {
        return driver.findElement(By.xpath(CheckoutSelectors.zip));
    }

    private WebElement phoneNumberField() {
        return driver.findElement(By.xpath(CheckoutSelectors.phoneNumber));
    }

    private WebElement ifraime() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CheckoutSelectors.iframeCardInfoNumber)));
        return driver.findElement(By.xpath(CheckoutSelectors.iframeCardInfoNumber));
    }

    private WebElement cardNumberField() {
        driver.switchTo().frame(ifraime());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CheckoutSelectors.cardInfoNumber)));
        return driver.findElement(By.xpath(CheckoutSelectors.cardInfoNumber));
    }

    private WebElement cardExpDataField() {
        return driver.findElement(By.xpath(CheckoutSelectors.cardInfoExpData));
    }

    private WebElement cardCvField() {
        return driver.findElement(By.xpath(CheckoutSelectors.cardInfoCv));
    }


    public void fillUpShippingAddressForm(String email, String firstname, String lastName,
                                          String streetAddress, String city, String zip,
                                          String phone, String cardNumber, String expData, String cv) {
        emailField().sendKeys(email);
        firstNameField().sendKeys(firstname);
        lastNameField().sendKeys(lastName);
        streetAddress().sendKeys(streetAddress);
        city().sendKeys(city);
        zip().sendKeys(zip);
        phoneNumberField().sendKeys(phone);
        cardNumberField().sendKeys(cardNumber);
        cardExpDataField().sendKeys(expData);
        cardCvField().sendKeys(cv);
        clickPlaceOrderButton();

    }
}
