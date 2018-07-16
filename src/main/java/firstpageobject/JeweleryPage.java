package firstpageobject;

import org.openqa.selenium.By;

public class JeweleryPage extends Utils
{
    private By addToCartFlowerGirlBracelet = By.xpath("//*[@class='item-grid']/div[2]/div/div[2]/div[3]/div[2]/input[1]");
    private By waitToBeInvisible = By.linkText("shopping cart");
    private By addToCartVintageStyleEngagementRing = By.xpath("//*[@class='item-grid']/div[3]/div/div[2]/div[3]/div[2]/input[1]");
    private By shoppingCart = By.linkText("shopping cart");

    public void clickOnAddToCart()
    {
        clickOnElement(addToCartFlowerGirlBracelet);
        waitForElementToBeInvisible(waitToBeInvisible,20);
        clickOnElement(addToCartVintageStyleEngagementRing);
        clickOnElement(shoppingCart);
    }
}
