package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NoSuchElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://demoqa.com/frames");
        /* i want to  access all the iframe in webpage*/

        List<WebElement> alliframe = driver.findElements(By.tagName("iframe"));
        System.out.println(alliframe.size());
        WebElement text = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        System.out.println(text.getText());

    }
}
