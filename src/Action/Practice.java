package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
      // WebElement t = driver.findElement(By.xpath("//div[@class='custom-html margin-top-10 margin-bottom-10']//div/child::div[4]//a"));
//t.click(); //open tab click hoga
////div[@class='custom-html margin-top-10 margin-bottom-10']//div/child::div[1]//input[@id='bmwradio']
        WebElement t1 = driver.findElement(By.xpath("//div[@class='custom-html margin-top-10 margin-bottom-10']//div/child::div[1]//input[@id='bmwradio']"));
      t1.click();//bwn
        //..//div[@class='custom-html margin-top-10 margin-bottom-10']//div[1]/ descendant::input[1]//bwn
      // ..//div[@class='custom-html margin-top-10 margin-bottom-10']//div/child::div[1]//input[@id='benzradio']// bwz
    }

}
