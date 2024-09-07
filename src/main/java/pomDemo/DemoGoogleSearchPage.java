package pomDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoGoogleSearchPage {

    private static WebElement element = null;


    public static WebElement textBoxSearch(WebDriver driver){
        element = driver.findElement(By.name("q"));
        return element;
    }

    public static WebElement SearchButton(WebDriver driver){
        element = driver.findElement(By.name("q"));
        return element;
    }

}
