package Cookies;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://www.tcs.com/");

        Set<Cookie> allcookies = driver.manage().getCookies();
        for(Cookie c:allcookies)
        {
            System.out.println(c);
        }
    }
}
