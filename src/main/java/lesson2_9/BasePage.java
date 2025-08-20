package lesson2_9;

import lesson2_9.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static lesson2_9.pages.ReplenishmentLocators.SUBMIT_COOKIE_BUTTON;

public class BasePage {

    private static final String MAIN_PAGE_URL = "https://www.mts.by/";

    protected WebDriver driver;

    public BasePage() {
        driver = Driver.getDriver();
    }

    public void openHomePage() {
        Driver.getUrl(MAIN_PAGE_URL);
        clickCloseCookie();
    }

    public void clickCloseCookie() {
        Driver.getWebElement(By.xpath(SUBMIT_COOKIE_BUTTON)).click();
    }
}
