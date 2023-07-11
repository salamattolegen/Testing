package Day5;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_CSSSelector extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement enterMessage = driver.findElement(By .cssSelector("input[class='form-control'][placeholder='Please enter your Message']"));
        enterMessage.sendKeys("Hi there");
        WebElement showMessage = driver.findElement(By .cssSelector("button[class='btn btn-primary'][onclick='showInput();']"));
        showMessage.click();

        WebElement textEntered = driver.findElement(By .cssSelector("span[id='display']"));

        String text1 = enterMessage.getAttribute("value");
        String text2 = textEntered.getText();

        if (text1.equals(text2)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }

        waitAndQuit();
    }
}
