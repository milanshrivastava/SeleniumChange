package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NestedFrame {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://demoqa.com/frames");
         driver.findElement(By.xpath("(//span[@class='pr-1'])[3]")).click();
         Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Nested Frames']")).click();
        }




    }

