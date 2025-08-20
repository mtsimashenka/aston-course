package lesson2_9.pages;


import lesson2_9.driver.Driver;
import org.openqa.selenium.By;

public class ReplenishmentPage {
    public static final String PHONE_NUMBER = "297777777";

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

    public void clickSubmitButton() {
        Driver.getWebElement(By.xpath(ReplenishmentLocators.SUBMIT_BUTTON)).click();
    }


}
