package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private WebDriver driver;

    //locators
    @FindBy(linkText = "Form Authentication")
    private By FormAuth;

    //Constructor
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }
    //Methods
    public void clickFormAuth()
    {
        driver.findElement( FormAuth).click();
    }
}
