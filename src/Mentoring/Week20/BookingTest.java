package Mentoring.Week20;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookingTest extends BaseDriver {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement makeAppointmntBttn = driver.findElement(By.id("btn-make-appointment"));
        makeAppointmntBttn.click();

        WebElement username = driver.findElement(By.id("txt-username"));
        username.click();
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.click();
        password.sendKeys("ThisIsNotAPassword");

        WebElement loginBttn = driver.findElement(By.id("btn-login"));
        loginBttn.click();

        WebElement checkBox = driver.findElement(By.id("chk_hospotal_readmission"));
        checkBox.click();

        WebElement radioBttn = driver.findElement(By.id("radio_program_medicaid"));
        radioBttn.click();

        WebElement date = driver.findElement(By .id("txt_visit_date"));
        date.sendKeys("11/7/2023");

        WebElement comment = driver.findElement(By .id("txt_comment"));
        comment.click();
        comment.sendKeys("Thank You!!!");

        WebElement bookAppontmnt = driver.findElement(By.id("btn-book-appointment"));
        bookAppontmnt.click();








    }
}
