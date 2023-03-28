package PageObjectModel.FE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoHeroSearch_POM extends TestBase {

    private static WebElement acceptCookiesBtn = getDriver().findElement(By.xpath("/html/body/div[3]/div/form/div[2]/button[2]"));
    WebDriverWait wait = new WebDriverWait(getDriver(),10);

    public void navigateToSearchURL() {
        getDriver().navigate().to("https://www.autohero.com/de/search/");
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.autohero.com/de/search/");
    }

    public void acceptCookies() throws InterruptedException {
//        driver.findElement(acceptCookies).click();
//        wait.until(ExpectedConditions.elementToBeClickable(acceptCookiesBtn));
        Thread.sleep(5000);
        acceptCookiesBtn.click();
    }
}

