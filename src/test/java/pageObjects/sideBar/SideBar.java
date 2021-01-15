package pageObjects.sideBar;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.BasePage;
import pageObjects.cartPage.CartPage;

import java.util.List;

public class SideBar extends BasePage {
    public SideBar(WebDriver driver) {
        super(driver);
    }

    private WebElement btnMiniCartClose(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SideBarSelectors.btnMiniCartClose)));
        return driver.findElement(By.xpath(SideBarSelectors.btnMiniCartClose));
    }
    public void hideMiniCard(){
        btnMiniCartClose().click();
    }

    private WebElement productName(){
        return driver.findElement(By.xpath(SideBarSelectors.productNameText));
    }

    private WebElement getRemoveButtons(){
        return driver.findElement(By.xpath(SideBarSelectors.linkActionDelete));
    }
    private WebElement confirmDeleteButton(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SideBarSelectors.confirmDeleteItem)));
        return driver.findElement(By.xpath(SideBarSelectors.confirmDeleteItem));
    }
    public void removeItem(){
        getRemoveButtons().click();
    }
    private WebElement viewAndEditCart(){
        return driver.findElement(By.xpath(SideBarSelectors.viewAndEditCart));
    }
    public CartPage clickViewCard(){
        viewAndEditCart().click();
        return new CartPage(driver);
    }

}
