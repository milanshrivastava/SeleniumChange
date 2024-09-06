package DropDrownBootStrap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDown {
    public static void main(String[] args) {
        WebDriver driver  =  new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        driver.manage().window().maximize();
       driver.get(" https://seleniumpractise.blogspot.com/2016/");
       driver.findElement(By.id("menu1")).click();
        List<WebElement> bootstrap = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//child::li/a"));
        for(WebElement e : bootstrap)
        {
            if( e .getText().trim().equalsIgnoreCase("html"));
            e.click();
            break;
        }

    }

}
