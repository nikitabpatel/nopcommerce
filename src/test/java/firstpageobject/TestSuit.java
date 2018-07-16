package firstpageobject;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{
    CheckOutPage checkOutPage = new CheckOutPage();
    ConfirmPaymentPage confirmPaymentPage = new ConfirmPaymentPage();
    CreditCardDetailsPage creditCardDetailsPage = new CreditCardDetailsPage();
    GuestCheckoutOrLoginPage guestCheckoutOrLoginPage = new GuestCheckoutOrLoginPage();
    HomePage homePage = new HomePage();
    JeweleryPage jeweleryPage = new JeweleryPage();
    OnePageCheckOut onePageCheckOut = new OnePageCheckOut();
    PaymentCardSelectionPage paymentCardSelectionPage = new PaymentCardSelectionPage();
    ShoppingCart shoppingCart = new ShoppingCart();
    SuccessPaymentPage successPaymentPage = new SuccessPaymentPage();
    VirtualGiftCardPage virtualGiftCardPage = new VirtualGiftCardPage();
    ProductEmailFriendPage productEmailFriendPage = new ProductEmailFriendPage();
    RegisterDetailPage registerDetailPage = new RegisterDetailPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    CompareProductsPage compareProductsPage = new CompareProductsPage();
    BooksPage booksPage = new BooksPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    AppleICamPage appleICamPage = new AppleICamPage();

    @Test
    public void toVerifyUserShouldBeAbleToPlaceAnOrderOfJeweleryAsGuest()
    {
        homePage.clickOnJewelery();
        jeweleryPage.clickOnAddToCart();
        shoppingCart.verifyUserIsAbleToUpdateShoppingCart();
        guestCheckoutOrLoginPage.verifyUserShouldBeAbleToClickOnCheckOutAsGuestButton();
        checkOutPage.fillCheckOutPageDetails();
        onePageCheckOut.verifyUseerShouldBeAbleToSelectNextDayAirDelivery();
        paymentCardSelectionPage.verifyUSerShouldBeAbleToSelectCreditCArdOption();
        creditCardDetailsPage.userShouldBeAbleToEnterCardDetails();
        confirmPaymentPage.userShouldBeAbleToConfirmPayment();
        successPaymentPage.userShouldBeAbleToPlaceAnOrderSuccessfully();
    }

    @Test
    public void toVerifyUSerShouldBeAbleToPlaceJeweleryAsReturningCustomer()
    {
        homePage.clickOnJewelery();
        jeweleryPage.clickOnAddToCart();
        shoppingCart.verifyUserIsAbleToUpdateShoppingCart();
        guestCheckoutOrLoginPage.verifyUserShouldBeAbleToSelectReturningCustomer();
        shoppingCart.verifyUserShouldConfirmShoppingCart();
        checkOutPage.clickOnContinue();
        onePageCheckOut.verifyUseerShouldBeAbleToSelectNextDayAirDelivery();
        paymentCardSelectionPage.verifyUSerShouldBeAbleToSelectCreditCArdOption();
        creditCardDetailsPage.userShouldBeAbleToEnterCardDetails();
        confirmPaymentPage.userShouldBeAbleToConfirmPayment();
        successPaymentPage.userShouldBeAbleToPlaceAnOrderSuccessfully();
    }

    @Test
    public void toVerifyUserShouldBeAbleToChangeCurrencyToEuro()
    {
        homePage.selectEuroCurrency();
    }

    @Test
    public void toVerifyUserShouldBeAbleToEmailProductDetailsToFriend()
    {
        homePage.clickOnVirtualGiftCard();
        virtualGiftCardPage.clickOnEmailAFriendButton();
        productEmailFriendPage.emailFriendFieldDetails();
    }

    @Test
    public void toVerifyUSerShouldBeAbleToRegisterSuccessfully()
    {
        homePage.clickOnRegisterButton();
        registerDetailPage.enterDetailsToRegister();
        registerResultPage.registerResult();
    }

    @Test
    public void toVerifyUserShouldBeAbleToCompare2Products()
    {
        homePage.compareProduct();
        compareProductsPage.verifyUserShouldAbleToCompareProducts();
    }

    @Test
    public void toVerifyUserShouldBeAbleToClearCompareProductList()
    {
        homePage.compareProduct();
        compareProductsPage.verifyUserShouldAbleToCompareProducts();
        compareProductsPage.toClearCompareProductList();
    }

    @Test
    public void toVerifyUserShouldBeAbleToSortBooksCategoryByLowtohighAndCompareTheValues()
    {
        homePage.clickOnBooksPage();
        booksPage.userShouldBeAbleToSortProductsLowToHigh();
    }

    @Test
    public void toVerifyUserShouldBeAbleToSeeAppleIcamInShoppingList()
    {
        homePage.clickOnElectronics();
        electronicsPage.clickOnCameraAndPhoto();
        cameraAndPhotoPage.clickOnAppleICam();
        appleICamPage.addToCart();
        shoppingCart.verifyAppleIcamProduct();
    }
}
