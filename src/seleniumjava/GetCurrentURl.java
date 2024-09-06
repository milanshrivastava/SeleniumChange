package seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURl {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }
}
