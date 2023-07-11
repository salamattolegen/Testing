package Day3;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByID {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement nameInputBox = driver.findElement(By.id("first_8")); // Locates the element with its id attribute.
        nameInputBox.sendKeys("US Batch 8"); // types the text inside the input element.

        WebElement lastNameInputBox = driver.findElement(By.id("last_8"));
        lastNameInputBox.sendKeys("STolegen");


        MyMethods.MyWait(3);
        driver.quit();
    }
}
