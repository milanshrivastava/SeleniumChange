package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ClickMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();
        WebElement clickandhold = driver.findElement(By.xpath("//li[@name='B']"));
        /*... actions is class that is used to  perform mouse operations*/
        Actions action = new Actions(driver);
        action.clickAndHold(clickandhold).pause(Duration.ofSeconds(10)).release(clickandhold)
                .build().perform();


        Thread.sleep(3000);
    }
}
