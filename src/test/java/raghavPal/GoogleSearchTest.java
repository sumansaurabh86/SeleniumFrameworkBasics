package raghavPal;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import raghavPal.GoogleSearchPageObjects;
public class GoogleSearchTest {


        WebDriver driver;
        GoogleSearchPageObjects obj;
        ExtentReports extReports = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("report.html");
        @BeforeTest
        public void SetUp() {

            //these info should be added before execution of any test cases
            sparkReporter.config().setTheme(Theme.DARK);
            sparkReporter.config().setDocumentTitle("MyReport");
            extReports.attachReporter(sparkReporter);

            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
            driver.manage().deleteAllCookies();        //delete all cookies
            // driver.manage().window().maximize();	//maximize window
            obj = new GoogleSearchPageObjects(driver);

            driver.get("https://google.com");
            //obj.initDriver(driver);

            obj.textInSearchBox("Automation Step By Step");
            obj.clickPageLink();

        }


        @Test(priority = 1)
        public void automationPageTitleTest(){

            ExtentTest test = extReports.createTest("Verify Page Title").assignAuthor("Suman")
                    .assignCategory("Functional Test").assignDevice("Windows");
            test.info("I am capturing the title");

            String title = obj.automationPageTitle();
            System.out.println("Title Of The Page :"+ title);
            Assert.assertEquals(title,"NEVER STOP LEARNING - Automation Step by Step");
        }

        @Test(priority = 2)
        public void pageLogoTest(){
            ExtentTest test = extReports.createTest("Verify Page Logo").assignAuthor("Suman")
                    .assignCategory("Functional Test").assignDevice("Windows");
            test.info("I am verifying the Logo");
            boolean flag= obj.pageLogo();
            Assert.assertTrue(flag);

        }


        @AfterTest
        public void teatDown(){
            extReports.flush();
            driver.close();

            System.out.println("Test Completed successfully");
        }

    }

//Vid No 10 "Selenium Framework for Beginners" by Raghav Pal
//https://www.youtube.com/watch?v=tnWig6KfQ9w&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=10

