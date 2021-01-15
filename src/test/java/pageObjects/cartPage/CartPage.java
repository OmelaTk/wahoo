package pageObjects.cartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.MainFrame;
import pageObjects.checkout.CheckoutPage;
import pageObjects.products.ProductsSelectors;

public class CartPage extends MainFrame {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    private WebElement quantityField(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(CartPageSelectors.quantityField)));
        return driver.findElement(By.xpath(CartPageSelectors.quantityField));
    }
    public void changeQuantity(String q){
        quantityField().clear();
        quantityField().sendKeys(q);
    }
    private WebElement updateCrtButton(){
        return driver.findElement(By.xpath(CartPageSelectors.updateCartButton));
    }
    public void updateCart(){
        updateCrtButton().click();
    }
    private WebElement proceedToCheckoutButton(){
        return driver.findElement(By.xpath(CartPageSelectors.proceedToCheckout));
    }
    public CheckoutPage proceedToCheckout(){
        proceedToCheckoutButton().click();
        return new CheckoutPage(driver);
    }


}
