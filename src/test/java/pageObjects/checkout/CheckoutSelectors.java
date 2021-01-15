package pageObjects.checkout;

public class CheckoutSelectors {
   public static final String placeOrderButton = "//button[@class='action primary checkout amasty']";
   public static final String attention = "//*[@id='modal-content-23']";
   public static final String acceptButton = "//button[@class='action-primary action-accept']";
   public static final String emailField = "//*[@class='field required']//input[@id='customer-email']";
   public static final String firstName = "//*[@name='shippingAddress.firstname']//input";
   public static final String lastName = "//*[@name='shippingAddress.lastname']//input";
   public static final String company = "//*[@name='shippingAddress.company']//input";
   public static final String street = "//*[@name='shippingAddress.street.0']//input";
   public static final String street1 = "//*[@name='shippingAddress.street.1']//input";
   public static final String city = "//*[@ name='shippingAddress.city']//input";
   public static final String cardInfoNumber = "//input[@name='cardnumber']";
   public static final String iframeCardInfoNumber = "//*[@id='amasty_stripe_card_data']/div/iframe";
   public static final String cardInfoExpData = "//*[@class='CardField-expiry CardField-child']//input";
   public static final String cardInfoCv = "//*[@class='CardField-cvc CardField-child']//input";
   public static final String zip = "//*[@name='shippingAddress.postcode']//input";
   public static final String phoneNumber ="//*[@name='shippingAddress.telephone']//input";
   public static final String expressShippingRadioButton = "//input[@id='s_method_amstrates_amstrates22']";
   public static final String shippingAmount = "//*[@class='totals shipping incl']//td[@class='amount']";

}
