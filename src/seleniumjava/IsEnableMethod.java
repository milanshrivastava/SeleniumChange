package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement textbox = driver.findElement(By.id("enabled-example-input"));
        WebElement enable = driver.findElement(By.id("enabled-button"));
        WebElement disable = driver.findElement(By.id("disabled-button"));
        Thread.sleep(2000);
        System.out.println(textbox.isEnabled());
        disable.click();
        Thread.sleep(3000);
        System.out.println(textbox.isEnabled());
        enable.click();
        Thread.sleep(3000);
        System.out.println(textbox.isEnabled());



    }
}
