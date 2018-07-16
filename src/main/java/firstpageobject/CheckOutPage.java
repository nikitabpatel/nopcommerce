package firstpageobject;

import org.openqa.selenium.By;

public class CheckOutPage extends Utils
{
    LoadProp loadProp = new LoadProp();

    private By _firstNameField = By.id("BillingNewAddress_FirstName");
    private By _lastNameField = By.id("BillingNewAddress_LastName");
    private By _emailField = By.id("BillingNewAddress_Email");
    private By _countryNameField = By.id("BillingNewAddress_CountryId");
    private By _billingCity = By.id("BillingNewAddress_City");
    private By _billingAddress1 = By.id("BillingNewAddress_Address1");
    private By _billingPostCode = By.id("BillingNewAddress_ZipPostalCode");
    private By _billingPhoneNumber = By.id("BillingNewAddress_PhoneNumber");
    private By _clickOnContinueButton = By.xpath("//input[@title='Continue']");


    public void fillCheckOutPageDetails()
    {
        enterText(_firstNameField, loadProp.getproperty("Firstname"));
        enterText(_lastNameField, loadProp.getproperty("Lastname"));
        enterText(_emailField, loadProp.getproperty("Email") + timestamp() + "@gmail.com");
        selectByVisibleText(_countryNameField,loadProp.getproperty("Country"));
        enterText(_billingCity,loadProp.getproperty("City"));
        enterText(_billingAddress1,loadProp.getproperty("Address1"));
        enterText(_billingPostCode, loadProp.getproperty("Postcode"));
        enterText(_billingPhoneNumber,loadProp.getproperty("Phonenumber"));
        clickOnElement(_clickOnContinueButton);
    }

    public void clickOnContinue()
    {
        clickOnElement(_clickOnContinueButton);
    }
}
