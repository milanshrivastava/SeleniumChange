package seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumFirefox {
    public static void main(String[] args) {
       /* .......we have to set browser capability then use Firfoxeoptions */
        FirefoxOptions  firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary("Users/atalshrivastava/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.get("https://www.flipkart.com");
    }
}
