package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        driver.manage().window().maximize();
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions action =new Actions(driver);
        action.dragAndDrop(source,target).
                pause(Duration.ofSeconds(10)).
                build().perform();

        Thread.sleep(3000);
    }
}
