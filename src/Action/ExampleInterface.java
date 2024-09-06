package Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleInterface {
    public static  void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //executor(Stringy ,object)
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,2500)");

       // js.executeScript("window.scrollBy(0,-2500)");





    }
}
