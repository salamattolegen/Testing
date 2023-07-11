package Day4;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class _02_FindByName {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        // Priority list of Locators in Selenium
        //ID ---->> use it first of all, 99.999% unique
        //Name
        //className
        //linkText
        //partialLinkText
        //tagName
        //css Selector
        // xpath

        WebElement nameInput = driver.findElement(By.name("q8_name[first]"));


        MyMethods.MyWait(3);
    }
}
