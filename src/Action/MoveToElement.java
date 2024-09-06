package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MoveToElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        WebElement movetoelement = driver.findElement(By.xpath("//span[text()='Login']"));
        Actions action=new Actions(driver);
        action.moveToElement(movetoelement).
                pause(Duration.ofSeconds(10)).build().perform();

        Thread.sleep(3000);
    }
}
