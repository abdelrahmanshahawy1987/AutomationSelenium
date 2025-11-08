package dropdown;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.DropdownPage;
import pages.HomePage;

import javax.swing.text.html.Option;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTests {
//    private WebDriver driver;
private DropdownPage dropdownPage;
private HomePage homePage;
private String option ="Option 2";
@Test
public  void testDropdown()
{

    homePage= new HomePage(driver);
    dropdownPage= new DropdownPage(driver);

    homePage.clickDropdown();
    dropdownPage.selectFromDropdown(option);

    var selectedOptions = dropdownPage.getSelectedOptions();
    assertEquals(selectedOptions.size(),1,"The size is Incorrect");
    assertTrue(selectedOptions.contains(option),"the option is not selected");
}


}
