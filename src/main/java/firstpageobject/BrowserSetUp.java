package firstpageobject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSetUp extends BasePage
{
    LoadProp loadProp = new LoadProp();

    //creating method for multi browser
    public void selectBrowser(){
        String browser = loadProp.getproperty("Browser");
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","src\\test\\Resourses\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "src\\test\\Resourses\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","src\\test\\Resourses\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }else{System.out.print("Wrong Browser" +browser);}
    }
}
