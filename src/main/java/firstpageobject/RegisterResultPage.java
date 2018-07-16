package firstpageobject;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils
{
    private By _pageTitle = By.xpath("//div[@class='page-title']");
    private By _pageTitleText = By.className("result");
    String expectedPageTitleMessage = "Your registration completed";

    public void registerResult()
    {
        waitForElementToBeDisplay(_pageTitle,10);
        Assert.assertEquals(getTextFromElement(_pageTitleText),expectedPageTitleMessage);
    }
}
