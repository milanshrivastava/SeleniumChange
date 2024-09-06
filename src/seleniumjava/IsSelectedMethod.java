package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
    public static void main(String[] args) throws InterruptedException {
        //
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement textbox = driver.findElement(By.id("bmwradio"));

        Thread.sleep(2000);
        System.out.println(textbox.isSelected());
        textbox.click();
        Thread.sleep(2000);
        System.out.println(textbox.isSelected());

    }
}
