package pomDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReportDemo {

        public static void main(String[] args) {

            System.out.println("Test Completed successfully");

            //this ExtentReports class is like an Engine
            ExtentReports extReports = new ExtentReports();

            //this ExtentSparkReporter is like a bogie, there are some other three bogies also
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("C:\\IntelliJ\\SeleniumJavaFrameworkBasics\\report.html");

            //in this line we are attaching the bogie with engine
            extReports.attachReporter(sparkReporter);

            //without using flush(), reports will not generate
            extReports.flush();
        }
    }

