package firstpageobject;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductEmailFriendPage extends Utils
{
    LoadProp loadProp = new LoadProp();

    private By _friendEmailField = By.id("FriendEmail");
    private By _myEmailField = By.id("YourEmailAddress");
    private By _personalMessageField = By.id("PersonalMessage");
    private By _clickOnSendEmailButton = By.name("send-email");
    private By _errorMessageText = By.xpath("//*[@class='message-error validation-summary-errors']");
    String expectedErrorTextMessage = "Only registered customers can use email a friend feature";

    public void emailFriendFieldDetails()
    {
        enterText(_friendEmailField,loadProp.getproperty("FriendEmail")+timestamp()+"@gmail.com");
        enterText(_myEmailField,loadProp.getproperty("Email")+timestamp()+"@gmail.com");
        enterText(_personalMessageField,loadProp.getproperty("PersonalMessage"));
        clickOnElement(_clickOnSendEmailButton);
        Assert.assertEquals(getTextFromElement(_errorMessageText),expectedErrorTextMessage);
    }
}
