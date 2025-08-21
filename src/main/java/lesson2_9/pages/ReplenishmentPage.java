package lesson2_9.pages;


import lesson2_9.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReplenishmentPage {
    public static final String PHONE_NUMBER = "297777777";
    public static final String SUM = "100";

    public String getTitleReplenishmentText() {
        return Driver.getWebElement(By.xpath(ReplenishmentLocators.TITLE_TEXT)).getText();
    }

    public void checkLogotypeImage(String input) {
        Driver.getWebElement(By.xpath(String.format(ReplenishmentLocators.IMAGE_LOGOTYPE, input))).isDisplayed();
    }

    public String getTitleNewPage() {
        return Driver.getWebElement(By.xpath(ReplenishmentLocators.TITLE_PAYMENT_BANK_CARD)).getText();
    }

    public void clickLinkAboutService() {
        Driver.getWebElement(By.xpath(ReplenishmentLocators.LINK_ABOUT_SERVICE)).click();
    }

    public void inputPhoneNumber() {
        Driver.getWebElement(By.xpath(ReplenishmentLocators.INPUT_PHONE_NUMBER)).sendKeys(PHONE_NUMBER);
    }

    public void inputFieldSum(String input) {
        Driver.getWebElement(By.xpath(String.format(ReplenishmentLocators.INPUT_FIELD, input))).sendKeys(SUM);
    }

    public String getSumText() {
        return Driver.getWebElement(By.xpath(ReplenishmentLocators.MODAL_TITLE_SUM)).getText();
    }

    public String getModalButtonText() {
        return Driver.getWebElement(By.xpath(ReplenishmentLocators.MODAL_BUTTON)).getText();
    }

    public String getModalPhoneNumberText() {
        return Driver.getWebElement(By.xpath(ReplenishmentLocators.MODAL_TITLE_PHONE_NUMBER)).getText();
    }

    public void clickSubmitButton() {
        Driver.getWebElement(By.xpath(ReplenishmentLocators.SUBMIT_BUTTON)).click();
    }

    public void clickButtonList() {
        Driver.getWebElement(By.xpath(ReplenishmentLocators.BUTTON_OPEN_LIST)).click();
    }

    public String getServiceListText(String input) {
        return Driver.getWebElement(By.xpath(String.format(ReplenishmentLocators.SERVICES_TEXT, input))).getText();
    }

    public void clickDifferentServices(String input) {
        Driver.getWebElement(By.xpath(String.format(ReplenishmentLocators.SERVICES_TEXT, input))).click();
    }

    public String getLabelText(String input) {
        WebElement element = Driver.getWebElement(By.xpath(String.format(ReplenishmentLocators.INPUT_FIELD, input)));
        SearchContext shadowRoot = element.getShadowRoot();
        WebElement placeholder = shadowRoot.findElement(By.cssSelector("#placeholder"));
        return placeholder.getText();
    }


}
