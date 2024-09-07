package pomDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class FacebookDemo {

   static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

        driver.manage().window().maximize();	//maximize window
        driver.manage().deleteAllCookies();		//delete all cookies
        driver.get("https://facebook.com");

        driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
        Thread.sleep(3000);

//        Set<String> handler = driver.getWindowHandles();
//        Iterator<String> it =  handler.iterator();
//        String parentWindowId  = it.next();
//        String childWindowId  = it.next();
//        driver.switchTo().window(childWindowId);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("SUMAN");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("SAURABH");
    }
}
