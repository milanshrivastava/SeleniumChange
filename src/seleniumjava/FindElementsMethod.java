package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        List<WebElement> df = driver.findElements(By.tagName("input"));
        for(WebElement e:df)
        {
            System.out.println(e);
        }

        Thread.sleep(3000);
    }
}
