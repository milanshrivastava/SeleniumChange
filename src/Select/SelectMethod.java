package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectMethod {
    public static  void main(String[] args) {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement textbox = driver.findElement(By.id("carselect"));
        Select select=new Select(textbox);
        //all the element i want in dropdown then getoption
        List<WebElement> alloptions = select.getOptions();
        for( WebElement e : alloptions)
        {
            System.out.println(e.getText());
        }
        driver.close();

    }
}
