package firstpageobject;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils
{
    private By _jewelerybutoon = By.linkText("Jewelry");
    private By _selectEuroCurrency = By.id("customerCurrency");
    private By _firstProductPriceInEuro = By.xpath("//*[@class='price actual-price']");
    String expectedPriceforBuildComputer = "€1140.00";
    private By _appleMacBookPriceInEuro = By.xpath("//*[@class='item-grid']/div[2]/div/div[2]/div[3]/div/span");
    String expectedPriceForAppleMacbook = "€1710.00";
    private By _htcOneLollipopPriceInEuro = By.xpath("//*[@class='item-grid']/div[3]/div/div[2]/div[3]/div/span");
    String expectedPriceForHTCLollipop = "€232.75";
    private By _virtualGiftCardPriceInEuro = By.xpath("//*[@class='item-grid']/div[4]/div/div[2]/div[3]/div/span");
    String expectedPriceForVirtualGiftCard = "€23.75";
    private By _clickOnVirtualGiftCard = By.xpath("//img[@title='Show details for $25 Virtual Gift Card']");
    private By _clickOnRegister = By.linkText("Register");
    private By _addToCompareFirstProduct = By.xpath("(//input[@value='Add to compare list'])[1]");
    private By _greeBarToBeInvisible = By.linkText("product comparison");
    private By _addToCompare2ndProduct = By.xpath("//div[@class='item-grid']/div[4]/div/div[2]/div[3]/div[2]/input[@value='Add to compare list']");
    private By _clickOnProductComparision = By.linkText("product comparison");
    private By _clickOnBooksButton = By.linkText("Books");
    private By _clickOnElectronicsButton = By.linkText("Electronics");

    public void clickOnJewelery()
    {
        clickOnElement(_jewelerybutoon);
    }

    public void selectEuroCurrency()
    {
        selectByIndex(_selectEuroCurrency,1);
        Assert.assertEquals(getTextFromElement(_firstProductPriceInEuro),expectedPriceforBuildComputer);
        Assert.assertEquals(getTextFromElement(_appleMacBookPriceInEuro),expectedPriceForAppleMacbook);
        Assert.assertEquals(getTextFromElement(_htcOneLollipopPriceInEuro),expectedPriceForHTCLollipop);
        Assert.assertEquals(getTextFromElement(_virtualGiftCardPriceInEuro),expectedPriceForVirtualGiftCard);
    }

    public void clickOnVirtualGiftCard()
    {
        clickOnElement(_clickOnVirtualGiftCard);
    }

    public void clickOnRegisterButton()
    {
        clickOnElement(_clickOnRegister);
    }

    public void compareProduct()
    {
        clickOnElement(_addToCompareFirstProduct);
        waitForElementToBeInvisible(_greeBarToBeInvisible,20);
        clickOnElement(_addToCompare2ndProduct);
        clickOnElement(_clickOnProductComparision);
    }

    public void clickOnBooksPage()
    {
        clickOnElement(_clickOnBooksButton);
    }

    public void clickOnElectronics()
    {
        clickOnElement(_clickOnElectronicsButton);
    }
}
