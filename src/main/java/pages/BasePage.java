package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void click(By elementLocation) {
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(elementLocation)).perform();

        waitVisibility(driver.findElement(elementLocation));
        driver.findElement(elementLocation).click();
    }

    public void writeText(WebElement element, String text) {
        waitVisibility(element);
        element.sendKeys(text);
    }

    public String readText(WebElement element) {
        waitVisibility(element);
        return element.getText();
    }

    public String readTitle() {
        return driver.getTitle();
    }

    public void waitVisibility(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
