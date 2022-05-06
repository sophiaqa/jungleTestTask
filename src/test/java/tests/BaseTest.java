package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.MainPage;
import pages.SignUpPage;
import pages.CreateWalletPage;

public class BaseTest {

    public WebDriver driver;
    public MainPage mainPage;
    public SignUpPage signUpPage;
    public CreateWalletPage createWalletPage;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void classLevelSetup() {
        WebDriverManager.chromedriver().version("98.0.4758.80").setup();
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void methodLevelSetup() {
        mainPage = new MainPage(driver);
        signUpPage = new SignUpPage(driver);
        createWalletPage = new CreateWalletPage(driver);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
