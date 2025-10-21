import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {
    private static WebDriver driver;
    private static final By input = By.linkText("Inputs");
    private static final By inputUpdate = By.xpath("//a[contains(text(),'Inputs')]");

    public static void main(String[] args) {

         driver = new ChromeDriver();
         driver.get("https://the-internet.herokuapp.com/"); //navigate to URL
//        driver.manage().window().fullscreen();// full screen
        driver.manage().window().maximize();//maximize screen
//        driver.manage().window().setSize(new Dimension(350,400));// set the size


        String title = driver.getTitle(); //read title of the page
        System.out.println(title);

//        locate element
        //       driver.findElement(By.tagName("a")); //first element with tag name "a"
//        WebElement input = driver.findElement(By.linkText("Inputs"));// return first element with link text "Inputs"
//         input.click();

//        WebElement inputLocator = driver.findElement(input);
//        WebElement inputLocatorLink = driver.findElement(input);
//        WebElement inputLocator = driver.findElement(inputUpdate);
//        inputLocator.click();
//        WebElement i = getInput(27);
//        if (i.equals(inputLocatorLink)){
//            i.click();
//            System.out.println(i);
//        }else System.out.println("locator is incorrect");

//        driver.findElement(By.tagName("a") ); // return a list of element with tag name "a"
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println("Number of Links are " + links.size());
      //        driver.close();//close browser without terminate session
//         driver.quit();//close browser and terminate session

        driver.findElement(input).click();
        driver.findElement(By.cssSelector("#content>div>div>div>input[type=number]")).sendKeys("1");

    }
    public static  WebElement getInput(int i)
    {
        return driver.findElement(By.xpath("//ul/li["+i+"]//a"));
    }
}
