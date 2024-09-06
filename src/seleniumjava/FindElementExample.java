package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementExample {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("web driver.chrome.driver","/Users/atalshrivastava/Downloads/chromedriver-mac-arm64/chromedriver.exe");
        WebDriver driver  =  new ChromeDriver();
       // driver = new FirefoxDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement df = driver.findElement(By.id("login1"));
        df.sendKeys("milan");
        Thread.sleep(3000);
    }
}
