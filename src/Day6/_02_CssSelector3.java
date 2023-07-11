package Day6;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_CssSelector3 extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        driver.findElement(By.cssSelector("div[id='section_1'] > fieldset[role='radiogroup'] > " +
                "label[for='u_yQt_4586_0'] > span[class='label-body']")).click();
        WebElement discover = driver.findElement((By .cssSelector("select[id='u_yQt_4588']")));
        discover.click();
        discover.sendKeys("Online Advertising");

        WebElement howOften = driver.findElement(By .cssSelector("label[for='u_yQt_89585_0']>span[class='label-body']"));
        howOften.click();

        WebElement experience = driver.findElement(By .cssSelector("label[for='u_yQt_4589_0']>span[class='label-body']"));
        experience.click();

        WebElement using = driver.findElement(By .cssSelector("select[id='u_yQt_4597']>:nth-child(4)"));
        using.click();


        waitAndQuit();
    }
}
