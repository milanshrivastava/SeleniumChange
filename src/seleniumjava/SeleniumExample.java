package seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumExample {
    /**
     *  if  this exception (org.openqa.selenium.SessionNotCreatedException: browser expect binary path )  is coming then use ChromeOption
     */
    public static void main(String[] args) {


        ChromeOptions chromeOptions = new ChromeOptions();
        //set the binary of chrome //  if you want this message (Chrome for Testing v127.0.6533.119 is only for automated testing. For regular browsing, use a standard version of Chrome that updates automatically) in chrome browser window
        chromeOptions.setBinary("/Users/atalshrivastava/Downloads/chrome-mac-x64 ");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.flipkart.com");
    }
}
