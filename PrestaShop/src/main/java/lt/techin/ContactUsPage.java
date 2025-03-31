package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends BasePage{

    @FindBy(xpath = "//*[@id='id_contact']")
    private WebElement subjectList;

    @FindBy(xpath = "//*[@id='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//*[@id='contactform-message']")
    private WebElement inputText;

    @FindBy(xpath = "//*[@id='content']/section/form/footer/input[3]")
    private WebElement buttonSend;

    @FindBy(xpath = "//*[@id='content']/section/form/div/ul/li")
    private WebElement titleMessage;


    public ContactUsPage(WebDriver driver) {
        super(driver);
    }


    public void selectSubject() {
        Select subject = new Select(subjectList);
        subject.selectByValue("1");
    }

    public void enterInputEmail(String value) {
        inputEmail.sendKeys(value);
    }

    public void enterInputText(String value) {
        inputText.sendKeys(value);
    }

    public void clickButtonSend() {
        buttonSend.click();
    }

    public String getTitleMessage() {
        return titleMessage.getText();
    }
}
