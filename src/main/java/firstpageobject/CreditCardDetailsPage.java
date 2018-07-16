package firstpageobject;

import org.openqa.selenium.By;

public class CreditCardDetailsPage extends Utils

{
    LoadProp loadProp = new LoadProp();

    private By _cardholderNameField = By.id("CardholderName");
    private By _cardNumberField = By.id("CardNumber");
    private By _cardExpireMonth = By.id("ExpireMonth");
    private By _cardExpireYear = By.id("ExpireYear");
    private By _cardCode = By.id("CardCode");
    private By _clickOnContinue = By.xpath("//input[@onclick='PaymentInfo.save()']");

    public void userShouldBeAbleToEnterCardDetails() {
        enterText(_cardholderNameField, loadProp.getproperty("Cardholdername"));
        enterText(_cardNumberField, loadProp.getproperty("Cardnumber"));
        selectByVisibleText(_cardExpireMonth, loadProp.getproperty("Expiremonth"));
        selectByVisibleText(_cardExpireYear, loadProp.getproperty("Expireyear"));
        enterText(_cardCode, loadProp.getproperty("Cardcode"));
        clickOnElement(_clickOnContinue);
    }
}
