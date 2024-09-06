package Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        driver.manage().window().maximize();
        WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));
        Actions action=new Actions(driver);
        action.doubleClick(DoubleClick).pause(Duration.ofSeconds(15)).build().perform();
         Alert alert=driver.switchTo().alert();
         alert.accept();


        Thread.sleep(3000);
    }
}
