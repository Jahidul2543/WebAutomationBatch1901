import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumVeryBasicDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/jahidul/IdeaProjects/WebAutomationBatch1901/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.id("search_query_top")).sendKeys("iPhone");
        driver.findElement(By.name("submit_search")).click();
        /**
         *
         * Get to know all 8 types of locators and apply it here
         *
         * */
        driver.close();

    }
}
