package Day4;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindByLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        WebElement element = driver.findElement(By.linkText("Careers")); // Locates tags by using visible text

        System.out.println(element.getText());
        System.out.println(element.getAttribute("href"));
        System.out.println(element.getAttribute("class"));

        WebElement element1 = driver.findElement(By .partialLinkText("Sell products"));
        System.out.println(element1.getText());

        //element.click();
        MyMethods.MyWait(3);
        driver.quit();
    }
}
