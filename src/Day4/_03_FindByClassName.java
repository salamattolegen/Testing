package Day4;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _03_FindByClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement nameInput = driver.findElement(By.className("form-textbox"));
        nameInput.sendKeys("Salamat"); // there are multiple elements that have the same className
                                                    // Selenium gets the first element.

        List<WebElement> labels = driver.findElements(By .className("form-sub-label"));// returns a list of all the
                                                                                    // elements that have same locator.
        for (WebElement e: labels){
            System.out.println(e.getText());
        }

        List <WebElement> elements = driver.findElements(By .className("WrongClassName"));
        System.out.println(elements.size());


        MyMethods.MyWait(3);
        driver.quit();
    }
}
