package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement choosefile = driver.findElement(By.id("file-upload"));
        choosefile.sendKeys("/Users/atalshrivastava/Documents/test.txt");
        Thread.sleep(2000);
        driver.findElement(By.id("file-submit")).click();
        WebElement fileUploadMessage = driver.findElement(By.xpath("//h3[text()='File Uploader']"));
        if(fileUploadMessage.isDisplayed())
        {
            System.out.println(" file is uploaded successfully");
        }
        else {
            System.out.println("file is  not uploaded ");
        }
        Thread.sleep(2000);
        driver.close();


    }
}
