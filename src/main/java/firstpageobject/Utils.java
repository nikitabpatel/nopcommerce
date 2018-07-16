package firstpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage
{
    //to click on element
    public static void clickOnElement(By by)
    {driver.findElement(by).click();}

    // to clear and enter text
    public static void clearAndEnterText(By by, String text)
    {driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);}

    // to enter text
    public static void enterText(By by, String text)
    {driver.findElement(by).sendKeys(text);}

    // to get text from element
    public static String getTextFromElement(By by)
    {return driver.findElement(by).getText();}

    // for creating timestamp to use in email
    public static String timestamp()
    {DateFormat format = new SimpleDateFormat("DDMMYYHHMM");
        return format.format(new Date());}

    // to wait for element to be invisible
    public static void waitForElementToBeInvisible(By by, int time)
    {WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));}

     // to wait for element to be display
    public static void waitForElementToBeDisplay(By by,int time)
    { WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));}

    // to selecct from droplist by visible text
    public static void selectByVisibleText(By element, String name)
    {new Select(driver.findElement(element)).selectByVisibleText(name);}

    // to select ffrom droplist by index
    public static void selectByIndex(By element, int numb)
    {new Select(driver.findElement(element)).selectByIndex(numb);}

    // to wait and click
    public static void waitAndClick(By by,int time)
    { WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).click();}

    //get text from given location
    public static String getText(By by)
    { driver.findElement(by).isDisplayed();
        return driver.findElement(by).getText();}
}
