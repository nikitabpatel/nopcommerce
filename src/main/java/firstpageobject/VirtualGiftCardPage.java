package firstpageobject;

import org.openqa.selenium.By;

public class VirtualGiftCardPage extends Utils
{
    private By _clickOnEmailFriendButton = By.xpath("//input[@value='Email a friend']");

    public void clickOnEmailAFriendButton()
    {
        clickOnElement(_clickOnEmailFriendButton);
    }
}
