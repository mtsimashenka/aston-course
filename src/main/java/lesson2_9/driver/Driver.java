package lesson2_9.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;
    private static Duration DEFAULT_IMPLICITLY_WAIT_SECONDS = Duration.ofSeconds(10);

    private Driver() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(DEFAULT_IMPLICITLY_WAIT_SECONDS);
        }
        return driver;
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static WebElement getWebElement(By byXpath) {
        return driver.findElement(byXpath);
    }

    public static void getUrl(String URL) {
        driver.get(URL);
    }
}
