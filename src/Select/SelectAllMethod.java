package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectAllMethod {
    /**
     *  single element select by select method
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement textbox = driver.findElement(By.id("carselect"));
        Thread.sleep(3000);
        Select select=new Select(textbox);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByValue("honda");
        Thread.sleep(3000);
        select.selectByVisibleText("Benz");
        driver.close();
    }
}
