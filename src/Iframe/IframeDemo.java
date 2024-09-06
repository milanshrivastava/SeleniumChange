package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IframeDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://demoqa.com/frames");
       /* i want access all the iframe in webpage*/

        List<WebElement> alliframe = driver.findElements(By.tagName("iframe"));
        System.out.println(alliframe.size());
    }

}
