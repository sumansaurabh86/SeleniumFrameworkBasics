package raghavPal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class GoogleSearchPageObjects {

        WebDriver driver;
        By TEXTBOX_SEARCH = By.name("q");
        By PAGE_LINK = By.xpath("//h3[contains(text(), 'Automation Step by Step: NEVER STOP LEARNING')]");
        By LOGO = By.xpath("//a[@id='logo']");

    /*public void initDriver(WebDriver driver){

        this.driver=driver;
    }*/

        //Constructor
        public GoogleSearchPageObjects(WebDriver driver){
            this.driver = driver;
            System.out.println("Printing Driver :"+driver);
        }

        public void textInSearchBox(String text){
            driver.findElement(TEXTBOX_SEARCH).sendKeys(text);
            driver.findElement(TEXTBOX_SEARCH).sendKeys(Keys.RETURN);
        }

        public void clickPageLink(){
            driver.findElement(PAGE_LINK).click();
        }

        public String automationPageTitle(){
            return driver.getTitle();
        }

        public boolean pageLogo(){
            return driver.findElement(LOGO).isDisplayed();
        }
    }


