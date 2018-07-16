package firstpageobject;

import org.openqa.selenium.By;
import org.testng.Assert;

public class SuccessPaymentPage extends Utils
{
    private By _waitForElementInvisible = By.xpath("//*[@id='confirm-order-buttons-container']/input");
    private By _orderSuccessfullyProcessedText = By.xpath("//*[@class='title']");
    String expectdSuccessfullyOrderMessage = "Your order has been successfully processed!";
    private By _continueButton = By.xpath("//input[@value='Continue']");
    String expectedContinueButton = "";
    String expectedURL = "http://demo.nopcommerce.com/checkout/completed/";

    public void userShouldBeAbleToPlaceAnOrderSuccessfully()
    {
        waitForElementToBeInvisible(_waitForElementInvisible,10);
        Assert.assertEquals(getTextFromElement(_orderSuccessfullyProcessedText),expectdSuccessfullyOrderMessage);
        //Assert.assertEquals(getTextFromElement(By.xpath("//input[@value='Continue']")),"CONTINUE");
        Assert.assertEquals(getTextFromElement(_continueButton),expectedContinueButton);
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
    }
}
