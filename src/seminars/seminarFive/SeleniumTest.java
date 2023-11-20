package seminars.seminarFive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users/user/Desktop/PYTHON/chromedriver-mac-x64/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        WebElement searchBox = webDriver.findElement(By.name("q"));
        searchBox.sendKeys("GeekBrains");
        searchBox.submit();
        Thread.sleep(10000);
        webDriver.quit();
    }
}