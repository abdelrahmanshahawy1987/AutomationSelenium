package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeTest

    public void setUp()
    {
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage.clickFormAuth();
    }
}
