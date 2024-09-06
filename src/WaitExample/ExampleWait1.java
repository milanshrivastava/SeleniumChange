package WaitExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleWait1 {
    public static WebDriver Driver;
    public static  WebDriverWait wait;
    public static  void waitForElement( WebDriver driver,WebElement element)
    {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //driver.findElement(By.id("openwindow"));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       // WebElement df = driver.findElement(By.id("openwindow"));

        waitForElement(driver,driver.findElement(By.id("openwindow")));
    }
}
