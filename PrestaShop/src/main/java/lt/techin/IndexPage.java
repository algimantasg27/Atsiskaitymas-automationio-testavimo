package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage{

    @FindBy(xpath = "//*[@id='contact-link']/a")
    private WebElement indexPage;

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void clickContactUsPage() {
        indexPage.click();
    }
}
