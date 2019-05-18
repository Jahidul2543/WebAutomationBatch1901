import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class SeleniumVeryBasicDemo {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/jahidul/IdeaProjects/WebAutomationBatch1901/driver/chromedriver");

        driver = new ChromeDriver();


        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php");


    }

    @Test
    public void demo() {

        driver.findElement(By.id("search_query_top")).sendKeys("iPhone");


       driver.findElement(By.name("submit_search")).click();
        //driver.findElement(By.className("button-search"));
       // driver.findElement(By.tagName("button")).click();
        // driver.findElement(By.xpath("//form[@id='searchbox']/button"));
        //  driver.findElement(By.cssSelector("#searchbox > button"));


        String actualtext = driver.findElement(By.className("alert-warning")).getText();
        System.out.println(actualtext);

        Assert.assertEquals(actualtext, "No results were found for your search \"iPhone\"");
        System.out.println("Test Passed");

        /**
         *
         * Get to know all 8 types of locators and apply it here
         *
         * */

    }

    @Test
    public void understandWebElement(){

        // driver.findElement(By.id("search_query_top")).sendKeys("iPhone");

       WebElement searchBox = driver.findElement(By.id("search_query_top"));
       WebElement searchButton = driver.findElement(By.name("submit_search"));

       searchBox.sendKeys("iphone");
       searchButton.click();







    }

    @Test
    public void findElementsDemo(){

     List<WebElement> aTagList = driver.findElements(By.tagName("a"));

        System.out.println(aTagList.size());

        aTagList.get(1).click();


    }

  @AfterMethod
    public void tearDown(){



        driver.quit();
  }
}

/**
 * 1. id
 * 2. name
 * 3. class name
 * 4. tag name
 * 5. link text
 * 6. partial link text
 * 7. css
 * 8. XPath
 *
 *
 * */