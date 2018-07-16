package firstpageobject;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AppleICamPage extends Utils
{
    private By _clickOnAddToCartButton = By.id("add-to-cart-button-17");
    private By _waitToDisplayProduct = By.className("content");
    String expectedMessageForShoppingCart = "The product has been added to your shopping cart";
    private By _clickOnShoppingCart = By.linkText("shopping cart");

    public void addToCart() {
        clickOnElement(_clickOnAddToCartButton);
        waitForElementToBeDisplay(_waitToDisplayProduct, 20);
        Assert.assertEquals(getTextFromElement(_waitToDisplayProduct), expectedMessageForShoppingCart);
        clickOnElement(_clickOnShoppingCart);
    }
}
