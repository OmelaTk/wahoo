package pageObjects.products;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.MainFrame;
import pageObjects.sideBar.SideBar;
import pageObjects.sideBar.SideBarSelectors;


public class ProductsDetails extends MainFrame {
    private SideBar sideBar;
    public ProductsDetails(WebDriver driver) {
        super(driver);
    }


    private WebElement getCardButton() {
        return driver.findElement(By.xpath(ProductDetailsSelectors.addToCardButton));
    }

    public boolean addProductButtonIsVisible() {
        try {
            getCardButton();
            return true;
        } catch (NoSuchElementException x) {
            return false;
        }
    }

    public SideBar addProduct() {
        fillUpProp();
        actions.moveToElement(getCardButton()).click();
        actions.perform();
        return new SideBar(driver);
    }
private WebElement getColorButton(){
    return driver.findElement(By.xpath(ProductDetailsSelectors.colorButton));
}
    private WebElement getColor() {
        getColorButton().click();
        return driver.findElement(By.xpath(ProductDetailsSelectors.color));
    }

    private WebElement sizeButton() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.xpath(ProductDetailsSelectors.sizeButton));
    }
    private WebElement qtyButton(){
        return driver.findElement(By.xpath(ProductDetailsSelectors.qtyButton));
    }

    private WebElement getSize() throws InterruptedException {
        sizeButton().click();
        return driver.findElement(By.xpath(ProductDetailsSelectors.size));
    }
    private WebElement getQty() {
        qtyButton().click();
        var qty = driver.findElements(By.xpath(ProductDetailsSelectors.listQty));
        int randomIndex = random.nextInt(qty.size());
        return  qty.get(randomIndex);

    }
    public String getProductName(){
        return driver.findElement(By.xpath(ProductDetailsSelectors.textH1)).getText();

    }

    public void fillUpProp(){
        try {
            getSize().click();
        }catch (NoSuchElementException | InterruptedException e){
            System.out.println("No size");
        }
        try {
            getQty().click();
        }catch (NoSuchElementException e){
            System.out.println("No Qty");
        }
        try {
            getColor().click();
        }catch (NoSuchElementException e){
            System.out.println("No Color");
        }
    }



}
