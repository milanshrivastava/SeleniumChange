package WaitExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaitExample {
    /**
     * Explicit wait
     */
    public static WebDriver Driver;
    public static WebDriverWait wait;
    public static void waitForElement( WebDriver driver,WebElement element)
    {
        //create a object WebDriverWait pass two parameter driver instance and duration
       // wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://camposcoffee.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement closeFirst = driver.findElement(By.xpath("//button[@title='Close']"));
        Thread.sleep(3000);
        WebElement lastClosed = driver.findElement(By.xpath("a[@class='newsletter__close newsletter__trigger']"));
        // apply the method
       // waitForElement(driver.findElement(By.xpath("//button[@title='Close']")));
       // waitForElement(driver.findElement(By.xpath("a[@class='newsletter__close newsletter__trigger']")));

    }
}


