package firstpageobject;

import org.openqa.selenium.By;

public class RegisterDetailPage extends Utils
{
    LoadProp loadProp = new LoadProp();

    private By _selectGenderField = By.id("gender-female");
    private By _firstNameField = By.id("FirstName");
    private By _lastNameField = By.id("LastName");
    private By _birthDateField = By.name("DateOfBirthDay");
    private By _birthMonthField = By.name("DateOfBirthMonth");
    private By _birthYearField = By.name("DateOfBirthYear");
    private By _emailField = By.id("Email");
    private By _companyNameField = By.id("Company");
    private By _clickOnNewsletterBox = By.id("Newsletter");
    private By _passwordField = By.id("Password");
    private By _confirmPasswordField = By.id("ConfirmPassword");
    private By _clickOnRegisterButton = By.id("register-button");

    public void enterDetailsToRegister()
    {
        clickOnElement(_selectGenderField);
        enterText(_firstNameField, "Firstname");
        enterText(_lastNameField, "Lastname");
        selectByVisibleText(_birthDateField,loadProp.getproperty("BirthDate"));
        selectByVisibleText(_birthMonthField,loadProp.getproperty ("BirthMonth"));
        selectByVisibleText(_birthYearField, loadProp.getproperty("BirthYear"));
        enterText(_emailField,loadProp.getproperty("Email") + timestamp() + "@gmail.com");
        enterText(_companyNameField, loadProp.getproperty("CompanyName"));
        clickOnElement(_clickOnNewsletterBox);
        enterText(_passwordField, loadProp.getproperty("Password"));
        enterText(_confirmPasswordField, loadProp.getproperty("ConfirmPassword"));
        clickOnElement(_clickOnRegisterButton);
    }
}
