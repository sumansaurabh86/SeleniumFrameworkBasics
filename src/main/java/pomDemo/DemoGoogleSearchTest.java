package pomDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoGoogleSearchTest {
        static WebDriver driver;

        public static void main(String[] args) {

            googleSearch();
        }

        public static void googleSearch(){

          // WebDriverManager.chromedriver().setup();
           driver= new ChromeDriver();

            driver.manage().window().maximize();	//maximize window
            driver.manage().deleteAllCookies();		//delete all cookies
            driver.get("https://google.com");

            DemoGoogleSearchPage.textBoxSearch(driver).sendKeys("Automation Step By Step");
            DemoGoogleSearchPage.SearchButton(driver).sendKeys(Keys.RETURN);
            driver.quit();

            System.out.println("Test Completed Successfully");

        }
    }


