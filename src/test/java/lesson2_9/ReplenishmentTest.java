package lesson2_9;

import lesson2_9.pages.ReplenishmentPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReplenishmentTest extends BaseTest {

    protected ReplenishmentPage replenishmentPage;
    public final String TITLE_TEXT = "Онлайн пополнение\nбез комиссии";
    public final String INPUT_LOGO_VISA = "Visa";
    public final String INPUT_LOGO_VERIFIED_BY_VISA = "Verified By Visa";
    public final String INPUT_LOGO_MASTERCARD = "MasterCard";
    public final String INPUT_LOGO_MASTERCARD_SECURE_CODE = "MasterCard Secure Code";
    public final String INPUT_LOGO_BELCARD = "Белкарт";
    public final String TEXT_PAYMENT_BANK_CARD = "Оплата банковской картой";

    @BeforeEach
    public void setUp() {
        replenishmentPage = new ReplenishmentPage();
    }

    @Test
    public void checkTitleText() {
        Assertions.assertEquals(TITLE_TEXT, replenishmentPage.getTitleReplenishmentText());
    }

    @Test
    public void checkLogotypeImages() {
        replenishmentPage.checkLogotypeImage(INPUT_LOGO_VISA);
        replenishmentPage.checkLogotypeImage(INPUT_LOGO_VERIFIED_BY_VISA);
        replenishmentPage.checkLogotypeImage(INPUT_LOGO_MASTERCARD);
        replenishmentPage.checkLogotypeImage(INPUT_LOGO_MASTERCARD_SECURE_CODE);
        replenishmentPage.checkLogotypeImage(INPUT_LOGO_BELCARD);
    }

    @Test
    public void checkLinkAboutService() {
        replenishmentPage.clickLinkAboutService();
        Assertions.assertEquals(TEXT_PAYMENT_BANK_CARD, replenishmentPage.getTitleNewPage());
    }

    @Test
    public void checkSubmitWithPhoneNumber() {
        replenishmentPage.inputPhoneNumber();
        replenishmentPage.clickSubmitButton();
    }
}
