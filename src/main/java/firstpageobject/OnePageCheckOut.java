package firstpageobject;

import org.openqa.selenium.By;

public class OnePageCheckOut extends Utils
{
    private By _clickOnNextDayAirDelivery = By.id("shippingoption_1");
    private By _clickOnContinue = By.xpath("//input[@onclick='ShippingMethod.save()']");

    public void verifyUseerShouldBeAbleToSelectNextDayAirDelivery()
    {
        clickOnElement(_clickOnNextDayAirDelivery);
        clickOnElement(_clickOnContinue);
    }
}
