package firstpageobject;

import org.openqa.selenium.By;

public class ConfirmPaymentPage extends Utils
{
    private By _waitForElement = By.xpath("//*[@id='confirm-order-buttons-container']/input");

    public void userShouldBeAbleToConfirmPayment()
    {
        waitAndClick(_waitForElement,10);
    }
}
