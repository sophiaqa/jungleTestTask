package tests;

import org.testng.annotations.Test;
import utils.ExtentReports.ExtentTestManager;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class MainPageTest extends BaseTest {

    @Test(description = "Successfully open SignUp page")
    public void successfullyOpenSignUpPage(Method method) {
        ExtentTestManager.startTest(method.getName(), "Successfully open SignUn page");

        mainPage.goTo();
        mainPage.goToSignUpPage();
        signUpPage.verifyPageIsOpened(true);
    }

    @Test(description = "Successfully open Create Wallet page")
    public void successfullyOpenCreateWalletPage(Method method) {
        ExtentTestManager.startTest(method.getName(), "Successfully open Create Wallet page");

        mainPage.goTo();
        mainPage.goToCreateWalletPage();
        createWalletPage.verifyPageIsOpened(true);
    }

    @Test(description = "Successfully goto Market section")
    public void successfullyGoToMarketSectiom(Method method) {
        ExtentTestManager.startTest(method.getName(), "Successfully go to Market section");

        mainPage.goTo();
        mainPage.clickMarketHeader();
        mainPage.verifyPageIsOpened(true);
    }

    @Test(description = "Search test")
    public void successfullySearchText(Method method) {
        ExtentTestManager.startTest(method.getName(), "Search test");

        mainPage.goTo();
        mainPage.fillInSearchInput("NFT");
        mainPage.verifyListOfArticles(new ArrayList<>(), true);
    }
}
