package firstpageobject;

import org.openqa.selenium.By;

public class PaymentCardSelectionPage extends Utils
{
    private By _selectCreditCardOption = By.id("paymentmethod_1");
    private By _clickOnContinueButton = By.xpath("//input[@onclick='PaymentMethod.save()']");

    public void verifyUSerShouldBeAbleToSelectCreditCArdOption()
    {
        clickOnElement(_selectCreditCardOption);
        clickOnElement(_clickOnContinueButton);
    }
}
