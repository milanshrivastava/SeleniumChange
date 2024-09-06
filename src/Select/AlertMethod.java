package Select;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethod {
    public static  void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.findElement(By.id("alertbtn")).click();

        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        //alert.accept();
        alert.dismiss();


    }
}
