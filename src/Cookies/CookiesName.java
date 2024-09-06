package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://www.tcs.com/");
        // add the cookies
        Cookie cookies=new Cookie("company","Wipro");
        driver.manage().addCookie(cookies);
        System.out.println(driver.manage().getCookieNamed("company"));;

    }

}
