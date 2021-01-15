package testSuites;

import org.testng.annotations.Test;
import pageObjects.mainPage.MainPage;

public class TestShop extends BaseTest {
    @Test
    public void openProductCategory() {
        var mainPage = new MainPage(driver);
        mainPage.open();
        var topNav = mainPage.getTopNav();
        var products = topNav.clickShop();
        // adding first product to cart
        products.addRandomProductToTheCard();
        products.getSideBar().hideMiniCard();
        // returns to catalog page
         products.getTopNav().clickShop();
        // adding second product to cart
         var sidebar = products.addRandomProductToTheCard();
        // removing random product from cart

        sidebar.removeItem();
        var cartPage = products.getSideBar().clickViewCard();
        cartPage.changeQuantity("5");
        cartPage.updateCart();
        var checkout = cartPage.proceedToCheckout();
        checkout.placeOrder();
        checkout.fillUpShippingAddressForm("someone@whocares.com", "Test", "Tester",
                "Comandante Izarduy 67", "Barselona", "08940",
                "5555555555","4111111111111111", "0824", "111");













        }
}
