package pageObjects.mainPage;

import org.openqa.selenium.WebDriver;
import pageObjects.MainFrame;


public class MainPage extends MainFrame {

    public MainPage(WebDriver driver) {
        super(driver);
    }
    final private String baseUrl = "https://eu.wahoofitness.com/";

    public void open(){
        driver.get(baseUrl);
    }
}
