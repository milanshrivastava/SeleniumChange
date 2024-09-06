package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrAndEndXpath {
    /**
     * xpath and Or contion
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        //or
        WebElement df = driver.findElement(By.xpath("//input[@type='text' or @name='logi']"));
        df.sendKeys("milan");
        Thread.sleep(3000);
        //and
        WebElement d1 = driver.findElement(By.xpath("//input[@type='password' and  @name='passwd']"));
        d1.sendKeys("shrivastava");
        Thread.sleep(3000);
    }
}
