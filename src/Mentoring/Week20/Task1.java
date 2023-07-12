package Mentoring.Week20;

import Utilities.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task1 extends BaseDriver {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");// opens an incognito window on chrome.

        driver.get("https://katalon-demo-cura.herokuapp.com/");




    }
}
