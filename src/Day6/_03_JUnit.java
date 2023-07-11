package Day6;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_JUnit extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        driver.findElement(By.cssSelector("div[id='section_1'] > fieldset[role='radiogroup'] > " +
                "label[for='u_yQt_4586_0'] > span[class='label-body']")).click();
        WebElement discover = driver.findElement((By .cssSelector("select[id='u_yQt_4588']")));
        discover.click();
        discover.sendKeys("Online Advertising");

        MyMethods.MyWait(3);

        WebElement howOften = driver.findElement(By .cssSelector("label[for='u_yQt_89585_0']>span[class='label-body']"));
        howOften.click();
        MyMethods.MyWait(3);

        WebElement experience = driver.findElement(By .cssSelector("label[for='u_yQt_4589_0']>span[class='label-body']"));
        experience.click();
        MyMethods.MyWait(3);

        WebElement using = driver.findElement(By .cssSelector("select[id='u_yQt_4597']>:nth-child(4)"));
        using.click();


        waitAndQuit();
    }
}
