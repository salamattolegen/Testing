package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningAWebBrowser {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //opens a chrome browser
        driver.get("https://www.google.com/");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit(); // closes the entire browser
        //driver.close(); //closes only the active tab

    }
}
