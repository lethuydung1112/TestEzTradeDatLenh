package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;


public class BasePage{
    public static WebDriver driver;
    public static Action action;
    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    public void SetDriver(WebDriver driver)
    {
        BasePage.driver = driver;
      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void openNewTabWithURL(String url) {
        WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
        newTab.get(url);
    }
    protected WebElement find(By locator)
    {
        return driver.findElement(locator);
    }
    protected  List<WebElement> findList(By locators)
    {
        return driver.findElements(locators);
    }
    protected void setSendkey(By locator, String text)
    {
        find(locator).clear();
        find(locator).sendKeys(text);
    }
    protected void setEnterSenkey(By locator)
    {
        find(locator).sendKeys(Keys.ENTER);
    }
    protected void click(By locator)
    {
        wait.until(ExpectedConditions.elementToBeClickable(find(locator)));
        find(locator).click();
    }

    protected String findUrl()
    {
        return driver.getCurrentUrl();
    }

    protected void dieuHuongToiURl(String url){
        driver.navigate().to(url);
    }
    protected void chuyenDoiTab(String windownHandle)
    {
        driver.switchTo().window(windownHandle);
    }
    public void waitToElementVisible( WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public String layWindownHandle()
    {
        return driver.getWindowHandle();
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}
