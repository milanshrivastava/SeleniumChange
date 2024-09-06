import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/**
 * open the browser
 * get the url
 * maximize the window
 * identify the element and click on it
 * handle the current window
 * handle the multiple window
 *compare the two window  if that have not same address then switch to child window click on it child option
 */

public class WindowHandlesTestcase {
    public static void main(String[] args) throws InterruptedException {
        //open the browser
        WebDriver driver  =  new ChromeDriver();

        //get the Url
        driver.get("https://www.letskodeit.com/practice");
        //maximize the window
        driver.manage().window().maximize();
        //identify the element
        WebElement textbox = driver.findElement(By.id("openwindow"));
        textbox.click();
        Thread.sleep(2000);
        //This method helps to get the window handle of the current window
        String sf = driver.getWindowHandle();
        System.out.println(sf);
         //
        Set<String> allwindow = driver.getWindowHandles();
        System.out.println(allwindow);
        for(String s:allwindow)
        {
            if(!s.contentEquals(sf)){
                driver.switchTo().window(s);
                driver.findElement(By.linkText("BLOG")).click();
                Thread.sleep(3000);

                driver.close();
            }
        }

        //
    }
}
