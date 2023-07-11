package Day4;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;

public class _01_NoSuchElementExeption {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement firstNameInput = driver.findElement(By.id("first_8"));
        firstNameInput.sendKeys("Salamat");

        WebElement lastNameInputBox = driver.findElement(By.id("last_8"));
        lastNameInputBox.sendKeys("Tolegen");
        try {
            WebElement wrongLocator = driver.findElement(By.id("Wrong Id"));// if the locator is wrong or there is no
            // element with that locator, Selenium throws  NoSuchElement Execption
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
//        MyMethods.MyWait(3);
//        firstNameInput.clear();
//        MyMethods.MyWait(3);
//        lastNameInputBox.clear();

        WebElement firstNameLabel = driver.findElement(By.id("sublabel_8_first"));
        String firstNametext = firstNameLabel.getText();
        System.out.println(firstNametext);

        WebElement submitButton = driver.findElement(By.id("input_2"));
        submitButton.click();// clicks on teh element.

        MyMethods.MyWait(3);
    }
}
