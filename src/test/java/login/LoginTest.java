package login;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTests {
    private WebDriver driver;
    private loginPage loginPage;
    String username ="tomsmith";
    String password = "SuperSecretPassword!";

    @Test

    public void loginForm()
    {
//        loginPage.enterUsername();
//        loginPage.enterPassword();
//        loginPage.clickLogin();

        //Method chaining
        loginPage.enterUsername(username)
                .enterPassword(password)
                ..clickLogin();
    }

}
