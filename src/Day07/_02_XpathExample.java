package Day07;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_XpathExample extends BaseDriver {
    @Test
    public void Test2() {
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.click();
        userName.sendKeys("standard_user");
        MyMethods.MyWait(1);

        WebElement password = driver.findElement(By.xpath("//div[@class='form_group']/input[@placeholder='Password']"));
        password.click();
        password.sendKeys("secret_sauce");
        MyMethods.MyWait(1);

        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();

        WebElement sauceBackPack = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-" +
                "labs-backpack']"));
        sauceBackPack.click();
        MyMethods.MyWait(1);

        WebElement boltTshirt = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        boltTshirt.click();
        MyMethods.MyWait(1);

        WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cart.click();
        MyMethods.MyWait(1);

        WebElement checkOut = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOut.click();
        MyMethods.MyWait(1);

        WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstName.click();
        firstName.sendKeys("Salamat");
        MyMethods.MyWait(1);

        WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.click();
        lastName.sendKeys("Tolegen");
        MyMethods.MyWait(1);

        WebElement zipCod = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipCod.click();
        zipCod.sendKeys("12345");
        MyMethods.MyWait(1);

        WebElement continu = driver.findElement(By.xpath("//input[@id='continue']"));
        continu.click();

        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double total = 0;
        for (WebElement p : productList) {
            total = total + Double.parseDouble(p.getText().substring(1));
        }

        WebElement subTotal = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));

        double subTotalDouble=Double.parseDouble(subTotal.getText().replaceAll("[^0-9,.]", ""));

        Assert.assertTrue("Test failed", subTotalDouble==total);
        waitAndQuit();
    }
}
