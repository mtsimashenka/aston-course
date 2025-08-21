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
    public final String COMMUNICATE_TEXT = "Услуги связи";
    public final String HOME_INTERNET_TEXT = "Домашний интернет";
    public final String INSTALLMENT_PLAN_TEXT = "Рассрочка";
    public final String DEBT_TEXT = "Задолженность";
    public final String LABEL_PHONE_NUMBER_TEXT = "Номер телефона";
    public final String LABEL_SUBSCRIBER_TEXT = "Номер абонента";
    public final String LABEL_INSTALLMENT_TEXT = "Номер счета на 44";
    public final String LABEL_DEBT_TEXT = "Номер счета на 2073";
    public final String INPUT_SUM_TEXT = "Сумма";
    public final String INPUT_SUM_VALUE = "100.00 BYN";
    public final String MODAL_BUTTON_TEXT = " Оплатить  100.00 BYN ";
    public final String MODAL_PHONE_NUMBER_TEXT = "Оплата: Услуги связи\n" +
            "Номер:375297777777";

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

    @Test
    public void checkServiceListText() {
        replenishmentPage.clickButtonList();
        Assertions.assertEquals(COMMUNICATE_TEXT, replenishmentPage.getServiceListText(COMMUNICATE_TEXT));
        Assertions.assertEquals(HOME_INTERNET_TEXT, replenishmentPage.getServiceListText(HOME_INTERNET_TEXT));
        Assertions.assertEquals(INSTALLMENT_PLAN_TEXT, replenishmentPage.getServiceListText(INSTALLMENT_PLAN_TEXT));
        Assertions.assertEquals(DEBT_TEXT, replenishmentPage.getServiceListText(DEBT_TEXT));
    }

    @Test
    public void testInputTextWithDifferentChoice() {
        replenishmentPage.clickButtonList();
        replenishmentPage.clickDifferentServices(COMMUNICATE_TEXT);
        Assertions.assertEquals(LABEL_PHONE_NUMBER_TEXT, replenishmentPage.getLabelText(LABEL_PHONE_NUMBER_TEXT));
        replenishmentPage.clickButtonList();
        replenishmentPage.clickDifferentServices(HOME_INTERNET_TEXT);
        Assertions.assertEquals(LABEL_SUBSCRIBER_TEXT, replenishmentPage.getLabelText(LABEL_SUBSCRIBER_TEXT));
        replenishmentPage.clickButtonList();
        replenishmentPage.clickDifferentServices(INSTALLMENT_PLAN_TEXT);
        Assertions.assertEquals(LABEL_INSTALLMENT_TEXT, replenishmentPage.getLabelText(LABEL_INSTALLMENT_TEXT));
        replenishmentPage.clickButtonList();
        replenishmentPage.clickDifferentServices(DEBT_TEXT);
        Assertions.assertEquals(LABEL_DEBT_TEXT, replenishmentPage.getLabelText(LABEL_DEBT_TEXT));
    }

    @Test
    public void testInputSumAndNumberCheckModalWindow() {
        replenishmentPage.inputPhoneNumber();
        replenishmentPage.inputFieldSum(INPUT_SUM_TEXT);
        replenishmentPage.clickSubmitButton();
        Assertions.assertEquals(INPUT_SUM_VALUE, replenishmentPage.getSumText());
        Assertions.assertEquals(MODAL_BUTTON_TEXT, replenishmentPage.getModalButtonText());
        Assertions.assertEquals(MODAL_PHONE_NUMBER_TEXT, replenishmentPage.getModalPhoneNumberText());
    }
}
