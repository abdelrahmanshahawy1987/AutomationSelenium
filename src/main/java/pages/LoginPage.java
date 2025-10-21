package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver driver;

    //locators
    @FindBy(id = "username")
    private By username;

    @FindBy(xpath = "//input[@type='password']")
    private By password;

    @FindBy(css="#login>button")
    private By loginButton;

    //Constructor
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //Methods
    public loginPage enterUsername()
    {
        driver.findElement(username).sendKeys("tomsmith");
         return this;
    }

    public LoginPage enterPassword()
    {
        driver.findElement(password).sendKeys("SuperSecretPassword!");
    return this;
    }
    public loginPage clickLogin()
    {
        driver.findElement(loginButton).click();
        return this;
    }

}
