package testSuites;

import enums.BrowserType;
import helper.BrowserFabric;
import helper.GetScreenShot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.mainPage.MainPage;

public class BaseTest {
    protected WebDriver driver;

   // @Parameters({"browser"})
    @BeforeMethod
    public void startUp(){
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(ITestResult iTestResult)  {
        if(iTestResult.getStatus()==iTestResult.FAILURE){
            GetScreenShot.capture(driver,iTestResult.getName());
        }
        driver.quit();
    }


}
