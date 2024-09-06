package AsserTions;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HardAssert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://register.rediff.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(3000);
        driver.findElement(By.linkText("Create Account")).click();
        String text = driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")).getText();
        Assert.
        driver.close();

    }
}
