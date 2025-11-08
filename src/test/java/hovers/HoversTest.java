package hovers;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoversTest extends BaseTests {

    private HomePage homePage;
    private HoversPage hoversPage;
//    private WebDriver driver;

    @Test

    public  void testHovers()
    {
        homePage=new HomePage(driver);
        hoversPage=new HoversPage(driver);
        homePage.clickHover();
//        hoversPage.hoverOverFigure(1);

        var figureCaption = hoversPage.hoverOverFigure(2);
        assertTrue(figureCaption.isCaptionDisplayed(),"The caption is not displayed");
        assertEquals(figureCaption.getName(),"name: user2", "The name is incorrect");
        assertEquals(figureCaption.getLinkText(),"View profile");
        assertTrue(figureCaption.getLink().endsWith("/users/2"),"The link is incorrect");



    }
}
