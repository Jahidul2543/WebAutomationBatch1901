import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsPageTest {

    @Test
    public void contactUsTest(){

        System.setProperty("webdriver.chrome.driver", "/Users/jahidul/IdeaProjects/WebAutomationBatch1901/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().fullscreen();

        driver.findElement(By.linkText("Contact us")).click();
        String actualtext = driver.findElement(By.className("page-heading")).getText();

        System.out.println(actualtext);

        Assert.assertEquals(actualtext, "CUSTOMER SERVICE - CONTACT US");
        System.out.println("Test Passed");

        driver.quit();


    }
}
