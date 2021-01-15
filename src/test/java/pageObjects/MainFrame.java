package pageObjects;

import org.openqa.selenium.WebDriver;
import pageObjects.sideBar.SideBar;
import pageObjects.topNav.TopNav;

public class MainFrame extends BasePage{

    protected TopNav topNav;
    protected SideBar sideBar;
    public MainFrame(WebDriver driver) {
        super(driver);
        topNav = new TopNav(driver);
        sideBar = new SideBar(driver);
    }

    public TopNav getTopNav() {
        return topNav;
    }

    public SideBar getSideBar() {
        return sideBar;
    }
}
