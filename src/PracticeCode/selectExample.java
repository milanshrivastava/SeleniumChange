package PracticeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://formstone.it/components/dropdown/demo/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("demo_basic"));

        Select select=new Select(element);
        select.selectByValue("2");
        select.selectByValue("3");
    }
}
