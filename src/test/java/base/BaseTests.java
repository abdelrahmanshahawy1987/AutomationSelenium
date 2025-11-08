package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

public class BaseTests {
    public WebDriver driver;
    protected HomePage homePage;

    @BeforeTest

    public void setUp()
    {
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
//        goHome();
    }

//    public void goHome()
//    {
//        homePage=new HomePage(driver);
//        homePage.clickFormAuth();
//    }
@AfterClass
public void tearDown()
{
    driver.quit();
}

}
