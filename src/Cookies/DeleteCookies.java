package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class DeleteCookies {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://www.tcs.com/");
        // add the cookies
        Cookie cookies=new Cookie("company","Wipro");
        driver.manage().addCookie(cookies);
        System.out.println("before delete the cookies");
        Set<Cookie> allcookies = driver.manage().getCookies();
        for(Cookie c:allcookies)
        {
            System.out.println(c);
        }
        System.out.println("..............");

        driver.manage().deleteAllCookies();
        System.out.println("after delete the cookies");
        Set<Cookie> allcookies1 = driver.manage().getCookies();
        for(Cookie c1:allcookies1)
        {
            System.out.println(c1);
        }
    }
}
