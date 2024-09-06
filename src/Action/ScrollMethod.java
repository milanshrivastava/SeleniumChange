package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollMethod {
    public static void main(String[] args) {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement disclaimerElement = driver.findElement(By.xpath("//a[text()='Page One']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",disclaimerElement);
    }
    }

