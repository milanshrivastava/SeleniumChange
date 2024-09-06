package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartWith {
    /**
     * //u[starts-with(text(),'Create ')]
     * @param args
     */
    public static void main(String[] args) {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.xpath("//u[starts-with(text(),'Create ')]")).click();
        //contains
        //u[contains(text(),'account ')]


    }
}
