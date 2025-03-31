package lt.techin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static java.awt.geom.Path2D.contains;

public class IndexPage extends BasePage{

    @FindBy(xpath = "//*[@id='contact-link']/a")
    private WebElement indexPage;

//    @FindBy(partialLinkText = "Hummingbird printed t-shirt")
    @FindBy(xpath = "//*[@id='content']/section[1]/div/div[1]/article/div/div[2]/h3/a")
    private WebElement product1;

    @FindBy(xpath = "//*[@id='add-to-cart-or-refresh']/div[2]/div/button")
    private WebElement buttonWishlist;

    @FindBy(xpath = "//*[@id='footer']/div[2]/div/div[1]/div[6]/div[1]/div/div/div[2]/p")
    private WebElement wishlistMessage;

    @FindBy(xpath = "//*[@id='footer']/div[2]/div/div[1]/div[6]/div[1]/div/div/div[3]/button")
    private WebElement buttonCancel;

    @FindBy(xpath = "//*[@id='group_1']")
    private WebElement sizelist;

    @FindBy(xpath = "//*[@id='add-to-cart-or-refresh']/div[2]/div/div[2]/button")
    private WebElement buttonAddToCart;

    @FindBy(xpath = "//*[@id='myModalLabel']")
    private WebElement addedShoppingCartMessage;


    
    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void clickContactUsPage() {
        indexPage.click();
    }

    public void clickOnProduct1() {
        product1.click();
    }

    public void clickButtonWishlist() {
        buttonWishlist.click();
    }

    public String getWishlistMessage() {
        return wishlistMessage.getText();
    }

    public void clickButtonCancel() {
        buttonCancel.click();
    }

    public void selectProductSize() {
        Select subject = new Select(sizelist);
        subject.selectByValue("4");
    }

    public void clickButtonAddToCart() {
        buttonAddToCart.click();
    }

    public String getAddedShoppingCartMessage() {
        return addedShoppingCartMessage.getText();
    }
// DAUG LAIKO PRALEISTA KAD NEPASIRENKA PRODUCT PAGAL NUORODA

    public void searchProductInPage(String value) {
        //driver.findElement(By.partialLinkText(value)).click();
//        driver.findElement(By.xpath(a[contains(text(), value));
        //a[contains(text(), "")
    }

    public boolean isDisplayedProduct() {
        return product1.isEnabled();
    }

}
