package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ExampleIframe {
    /**
     * nested Iframe
     * @param args
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //main window to  perant  window
        driver.switchTo().frame("frame1");
        // parent window to child window
       driver.switchTo().frame(0);
       //child window text
        WebElement Childtext = driver.findElement(By.tagName("p"));
        System.out.println(Childtext.getText());
        // child window to parent window
        driver.switchTo().parentFrame();
        // parent window to main window
        driver.switchTo().defaultContent();
        // main window text
        WebElement text = driver.findElement(By.tagName("h1"));
        System.out.println(text.getText());






    }

}
