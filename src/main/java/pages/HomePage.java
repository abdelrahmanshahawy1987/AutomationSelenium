package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;


    //Constructor
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    //Methods
    public void clickFormAuth()
    {
        clickLink("Form Authentication");
    }

    public void clickDropdown()
    {
        clickLink("Dropdown");
    }

    public void clickHover()
    {
        clickLink("Hovers");
    }

    private void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }


}
