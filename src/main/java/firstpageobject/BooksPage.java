package firstpageobject;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BooksPage extends Utils
{
    private By _sortByPosition = By.id("products-orderby");
    private By _sortByDisplay = By.id("products-pagesize");
    private By _FirstProductPrice = By.xpath("//div[1]/div/div[2]/div[3]/div[1]/span[2]");
    private By _lastProductPrice = By.xpath("//div[3]/div/div[2]/div[3]/div[1]/span[2]");

    public void userShouldBeAbleToSortProductsLowToHigh() {
        selectByIndex(_sortByPosition, 3);
        selectByIndex(_sortByDisplay, 0);
        String firstProductPriceText = getText(_FirstProductPrice);
        String lastProductPriceText = getText(_lastProductPrice);
        double firstProductPrice = Double.parseDouble(firstProductPriceText.replace("$", ""));
        double lastProductPrice = Double.parseDouble(lastProductPriceText.replace("$", ""));
        Assert.assertTrue(lastProductPrice > firstProductPrice);
        System.out.println(firstProductPrice + ":" + lastProductPrice);
    }
}
