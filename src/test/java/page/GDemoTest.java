package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class GDemoTest {

        WebDriver driver;

        public void set(){}
        @BeforeTest
        public void SetUp() {

            //these info should be added before execution of any test cases

            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
            driver.manage().deleteAllCookies();        //delete all cookies
            // driver.manage().window().maximize();	//maximize window
            driver.get("https://facebook.com");
        }

        @Test
        public void googleTest(){
            System.out.println("this is demo test");
        }


        @AfterTest
        public void tearDown(){
            driver.quit();
            System.out.println("test is successfull");
        }

    }


