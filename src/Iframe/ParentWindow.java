package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ParentWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://demoqa.com/frames");
        /* i want to  access all the iframe in webpage*/

        List<WebElement> alliframe = driver.findElements(By.tagName("iframe"));
        System.out.println(alliframe.size());

        // with element
        driver.switchTo().frame(driver.findElement(By.id("frame1")));

        WebElement text = driver.findElement(By.xpath("(//h1[text()='This is a sample page'])[1]"));
        System.out.println(text.getText());
        // we have to switch one frame to another frame
        driver.switchTo().parentFrame();
        WebElement textparent = driver.findElement(By.xpath("//h1[text()='Frames']"));
        System.out.println(textparent.getText());

        driver.close();
    }
}
