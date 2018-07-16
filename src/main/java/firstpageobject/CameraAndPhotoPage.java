package firstpageobject;

import org.openqa.selenium.By;

public class CameraAndPhotoPage extends Utils
{
    private By _clickOnAppleICamButton = By.linkText("Apple iCam");

 public void clickOnAppleICam()
 {
     clickOnElement(_clickOnAppleICamButton);
 }
}
