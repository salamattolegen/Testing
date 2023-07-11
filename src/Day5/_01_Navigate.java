package Day5;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _01_Navigate extends BaseDriver{
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement element = driver.findElement(By.id("alerttest"));

        element.click();
        MyMethods.MyWait(4);

        String currentURL = driver.getCurrentUrl(); // gives the URL of current page.
        System.out.println("current URL = " + currentURL);

        driver.navigate().back(); // takes us to the previous page
        System.out.println(driver.getCurrentUrl());
        MyMethods.MyWait(3);
        driver.navigate().forward();
        waitAndQuit();
    }
}
