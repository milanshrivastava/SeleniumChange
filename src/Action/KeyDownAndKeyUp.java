package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyDownAndKeyUp {
    public static void main(String[] args) throws InterruptedException {
        /*create webdriver object*/
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        /*open the browser*/
        driver.get("https://www.flipkart.com");
        //maximize the window
        driver.manage().window().maximize();
        /*identify element*/
        WebElement searchbox = driver.findElement(By.name("q"));
        /*create an object of the Actions class*/
        Actions action = new Actions(driver);
        /*move to an element*/

        action.moveToElement(searchbox ).click(searchbox ).keyDown(Keys.SHIFT).sendKeys("mobile").keyUp(Keys.SHIFT).
                pause(Duration.ofSeconds(15)).

               build().perform();
        Thread.sleep(2000);
        driver.close();


    }
}
