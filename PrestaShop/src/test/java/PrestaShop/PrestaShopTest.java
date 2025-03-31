package PrestaShop;

import lt.techin.ContactUsPage;
import lt.techin.IndexPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrestaShopTest extends BaseTest{

    @Test
    void PositiveTest() {

        String email = "alio@test.lt";
        String messageText = "Hello World!";
        String successfullyMessage = "Your message has been successfully sent to our team.";

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickContactUsPage();

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.selectSubject();
        contactUsPage.enterInputEmail(email);
        contactUsPage.enterInputText(messageText);
        contactUsPage.clickButtonSend();

        assertTrue(contactUsPage.getTitleMessage().contains(successfullyMessage));
    }

    @Test
    void NegativeTest() {
        String email = "alio@test.lt";
        String errorMessage = "The message cannot be blank.";

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickContactUsPage();

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.selectSubject();
        contactUsPage.enterInputEmail(email);

        contactUsPage.clickButtonSend();

        assertTrue(contactUsPage.getTitleMessage().contains(errorMessage));
    }
}
