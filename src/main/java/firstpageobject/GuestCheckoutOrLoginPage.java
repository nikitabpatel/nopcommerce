package firstpageobject;

import org.openqa.selenium.By;

public class GuestCheckoutOrLoginPage extends Utils
{
    LoadProp loadProp = new LoadProp();

    private By _clickOnCheckOutAsGuestButton =By.xpath("//*[@value='Checkout as Guest']");
    private By _emailfield = By.id("Email");
    private By _passwordfield = By.id("Password");
    private By _clickOnLoginButton = By.xpath("//input[@value='Log in']");


    public void verifyUserShouldBeAbleToClickOnCheckOutAsGuestButton()
    {
        clickOnElement(_clickOnCheckOutAsGuestButton);
    }

    public void verifyUserShouldBeAbleToSelectReturningCustomer()
    {
        enterText(_emailfield,loadProp.getproperty("email"));
        enterText(_passwordfield,loadProp.getproperty("password"));
        clickOnElement(_clickOnLoginButton);
    }
}
