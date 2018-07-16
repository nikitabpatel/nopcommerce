package firstpageobject;

import org.openqa.selenium.By;

public class GuestCheckoutOrLoginPage extends Utils
{
    private By _clickOnCheckOutAsGuestButton =By.xpath("//*[@value='Checkout as Guest']");


    public void verifyUserShouldBeAbleToClickOnCheckOutAsGuestButton()
    {
        clickOnElement(_clickOnCheckOutAsGuestButton);
    }
}
