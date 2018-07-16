package firstpageobject;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils
{
    private By _clcickOnCameraPhoto = By.linkText("Camera & photo");

    public void clickOnCameraAndPhoto()
    {
        clickOnElement(_clcickOnCameraPhoto);
    }
}
