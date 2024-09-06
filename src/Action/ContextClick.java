package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ContextClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action =new Actions(driver);
        action.contextClick(rightclick).
                pause(Duration.ofSeconds(10)).build().perform();



        Thread.sleep(3000);
    }
}
