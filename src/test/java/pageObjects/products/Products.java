package pageObjects.products;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.MainFrame;
import pageObjects.sideBar.SideBar;
import pageObjects.sideBar.SideBarSelectors;

import java.util.List;

public class Products extends MainFrame {
    public Products(WebDriver driver) {
        super(driver);
    }

    private List<WebElement> listOfProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ProductsSelectors.listProduct)));
        return driver.findElements(By.xpath(ProductsSelectors.listProduct));
    }

    private ProductsDetails selectRandomProduct() {
        var products = listOfProduct();
        int randomIndex = random.nextInt(products.size());
        var randomProduct =   products.get(randomIndex);
        actions.moveToElement(randomProduct);
        actions.click(randomProduct);
        actions.perform();
        return new ProductsDetails(driver);
    }

    public SideBar addRandomProductToTheCard() {
        ProductsDetails productsDetails = null;
       boolean productAbsent = true;
       while (productAbsent){
           productsDetails = selectRandomProduct();
           if(productsDetails.addProductButtonIsVisible()){
               productAbsent=false;
           } else {
               this.getTopNav().clickShop();
           }
       }
      productsDetails.addProduct();
       return this.getSideBar();
    }

}
