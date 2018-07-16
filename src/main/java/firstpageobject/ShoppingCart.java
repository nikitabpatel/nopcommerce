package firstpageobject;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCart extends Utils
{
    private By _changeQuantityTo2 = By.xpath("//*[@value='1']");
    private By _updatecart = By.name("updatecart");
    private By _clickOnCheckOut = By.id("checkout");
    private By _termsAndSerrviceWarningBox = By.id("terms-of-service-warning-box");
    String expectedtermsOfServiceMEssage = "Please accept the terms of service before the next step.";
    private By _clickOnClose = By.xpath("//*[@title='close']");
    private By _clickOnTermsOfServiceBox = By.id("termsofservice");
    private By _appleICamText = By.className("sku-number");
    String expectedAppleICamText = "APPLE_CAM";

    public void verifyUserIsAbleToUpdateShoppingCart()
    {
        clearAndEnterText(_changeQuantityTo2,"2");
        clickOnElement(_updatecart);
        clickOnElement(_clickOnCheckOut);
        Assert.assertEquals(getTextFromElement(_termsAndSerrviceWarningBox), expectedtermsOfServiceMEssage);
        clickOnElement(_clickOnClose);
        clickOnElement(_clickOnTermsOfServiceBox);
        clickOnElement(_clickOnCheckOut);
    }

    public void verifyUserShouldConfirmShoppingCart()
    {
        clickOnElement(_clickOnTermsOfServiceBox);
        clickOnElement(_clickOnCheckOut);
    }

    public void verifyAppleIcamProduct()
    {
        Assert.assertEquals(getTextFromElement(_appleICamText),expectedAppleICamText);
    }
}
