package Axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleFollowing {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        for (int i = 0; i < 5; i++) {//WebElement element = driver.findElements(By.xpath(""));


        }
    }}
