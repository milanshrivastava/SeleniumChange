package Screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ExampleTakeScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver  =  new ChromeDriver();

        /*open the browser*/
        driver.get("https://www.flipkart.com");
        //maximize the window
        driver.manage().window().maximize();

        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(f,new File("/Users/atalshrivastava/Documents/test.txt"));
    }
}
