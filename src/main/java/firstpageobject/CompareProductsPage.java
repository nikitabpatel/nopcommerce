package firstpageobject;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareProductsPage extends Utils
{
    private By _compareProductText = By.xpath("//div[@class='page-title']");
    String expectedCompareProductText = "Compare products";
    private By _clearcompareProductList = By.className("no-data");
    String expectedNoItemMessage = "You have no items to compare.";

    public void verifyUserShouldAbleToCompareProducts()
    {
        Assert.assertEquals(getText(_compareProductText),expectedCompareProductText);
    }

    public void toClearCompareProductList() {
        clickOnElement(By.className("clear-list"));
        Assert.assertEquals(getTextFromElement(_clearcompareProductList), expectedNoItemMessage);
    }
}
