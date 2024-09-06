package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
         driver.findElement(By.xpath("//a[text()='Sign In']")).click();
         Thread.sleep(2000);
         //navigate to back
        driver.navigate().back();
        Thread.sleep(2000);
        //navigate to forward
        driver.navigate().forward();
        Thread.sleep(2000);
        //navigate to refresh
        driver.navigate().refresh();
        driver.close();

    }
}
