package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LacatorMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement df = driver.findElement(By.id("login1"));
        df.sendKeys("milan");
        Thread.sleep(3000);
        df.clear();
        Thread.sleep(3000);
        df.submit();
        System.out.println(df.getSize());
        System.out.println(df.getText());
        System.out.println(df.getTagName());
    }
}
