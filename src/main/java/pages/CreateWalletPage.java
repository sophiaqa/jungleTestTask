package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateWalletPage extends BasePage {

    public CreateWalletPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void verifyPageIsOpened(boolean result) {
        Assert.assertTrue(result);
    }
}
