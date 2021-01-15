package pageObjects.topNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.BasePage;
import pageObjects.products.Products;

public class TopNav extends BasePage {
    public TopNav(WebDriver driver) {
        super(driver);
    }
    private WebElement getShop(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(TopNavSelectors.shop)));
        return driver.findElement(By.xpath(TopNavSelectors.shop));
    }
    public Products clickShop() {
        getShop().click();
        return new Products(driver);
    }
}
