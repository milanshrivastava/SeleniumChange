package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByAll {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement textbox = driver.findElement(By.id("multiple-select-example"));
        Thread.sleep(3000);
        Select select = new Select(textbox);
        select.selectByIndex(2);
        Thread.sleep(3000);
        select.selectByValue("orange");
        Thread.sleep(3000);
        select.selectByVisibleText("Apple");
        Thread.sleep(3000);
        select.deselectAll();

        //driver.close();
    }
}
