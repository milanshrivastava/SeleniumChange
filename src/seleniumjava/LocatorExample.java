package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        /*.....id..*/
        WebElement i = driver.findElement(By.id("login1"));
        i.sendKeys("milan");
        /*.....classname...*/
        WebElement k = driver.findElement(By.className("signinbtn"));
        k.click();
        /*.....name..*/
        WebElement n = driver.findElement(By.name("proceed"));
        n.sendKeys("nanu");
        /*.....linkText ..*/
        WebElement l = driver.findElement(By.linkText("Forgot Password?"));
        l.click();
        /*.....partial linkText ..*/
        WebElement t = driver.findElement(By.partialLinkText("Forgot"));
        t.click();
        


        









    }
}
