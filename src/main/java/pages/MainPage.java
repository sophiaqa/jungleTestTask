package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }

    /**Variables*/
    String baseURL = "https://jungle.co/";

    /**Page Methods*/
    public MainPage goTo() {
        driver.get(baseURL);
        return this;
    }

    @FindBy(className="login")
    WebElement signUpButton;

    @FindBy(className="wallet-connection")
    WebElement createWalletButton;

    @FindBy(className="header-search__input")
    WebElement searchInputField;

    @FindBy(linkText="market")
    WebElement marketHeader;

    public void goToSignUpPage() {

        signUpButton.click();
    }

    public void goToCreateWalletPage() {

        createWalletButton.click();
    }

    public void fillInSearchInput(String searchText) {

        writeText(searchInputField, searchText);
    }

    public void clickMarketHeader() {

        marketHeader.click();
    }

    public void verifyPageIsOpened(boolean result) {
        Assert.assertTrue(result);
    }

    public void verifyListOfArticles(List<String> list, boolean result) {
        Assert.assertTrue(result);
    }

    public void verifyPageTitle(String title){
        Assert.assertEquals(readTitle(), title);
    }
}
