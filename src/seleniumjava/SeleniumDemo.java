package seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        // system.setProperty use karne par exception aa rahi hai session not created the use chromoptions  and set Binary path
        System.setProperty("web driver.chrome.driver","/Users/atalshrivastava/Downloads/chromedriver-mac-arm64/chromedriver.exe");
       // ChromeDriver driver=new ChromeDriver();
        // this webdriver is interface we are not creating webdriver object we are creating  child class (chromedriver) object here assign the object into  parent class (web driver) */
       WebDriver driver  =  new ChromeDriver();
       driver = new FirefoxDriver();
          Thread.sleep(3000);
        driver.get("https://www.flipkart.com");
        driver. close();
    }
}
