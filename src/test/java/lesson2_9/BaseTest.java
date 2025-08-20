package lesson2_9;

import lesson2_9.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void openHomePageAndSubmitCookie() {
        BasePage basePage = new BasePage();
        basePage.openHomePage();
    }

    @AfterEach
    public void quitAndNullDriver() {
        Driver.quit();
    }
}
