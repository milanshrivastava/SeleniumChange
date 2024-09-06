package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class IframeWithIdAndName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://demoqa.com/frames");
        /* i want to  access all the iframe in webpage*/

        List<WebElement> alliframe = driver.findElements(By.tagName("iframe"));
        System.out.println(alliframe.size());
        // with index
       //driver.switchTo().frame(0);
        // with id
        //driver.switchTo().frame("frame1");
        // with webelement
        driver.switchTo().frame(driver.findElement(By.id("frame1")));

        WebElement text = driver.findElement(By.xpath("(//h1[text()='This is a sample page'])[1]"));
        System.out.println(text.getText());
        driver.close();

    }
}
