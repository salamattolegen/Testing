package Mentoring.Week20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task1 {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");// opens an incognito window on chrome.

        WebDriver driver = new ChromeDriver();
        driver.get("https:..google.con");
        driver.manage().window().maximize();// maximizes the window



    }
}
