package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePickerDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/datepicker/");
        //switch  one frame to another frame
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

       driver.findElement(By.id("datepicker")).click();
       // driver.findElement(By.xpath("//a[@title='Next']")).click();

        List<WebElement> alltabledate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//child::td/a"));
        for(WebElement e : alltabledate)
        {
            if(e.getText().equalsIgnoreCase("25"))
            {
                e.click();
                System.out.println(e.getText());
                break;
            }
        }

    }
}
