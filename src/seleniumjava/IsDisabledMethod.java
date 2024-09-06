package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisabledMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement textbox = driver.findElement(By.id("displayed-text"));
        WebElement hide= driver.findElement(By.id("hide-textbox"));
        WebElement show = driver.findElement(By.id("show-textbox"));
        Thread.sleep(2000);
        System.out.println(textbox.isDisplayed());
      hide.click();
        Thread.sleep(3000);
        System.out.println(textbox.isDisplayed());
        show.click();
        Thread.sleep(3000);
        System.out.println(textbox.isDisplayed());
    }
}
