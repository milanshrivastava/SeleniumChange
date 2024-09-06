package PracticeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionclassDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("mousehover"));
        WebElement top = driver.findElement(By.xpath("//a[text()='Reload']"));
        Actions action=new Actions(driver);
        action.moveToElement(element).click(top). pause(Duration.ofSeconds(20)).build().perform();



    }
}
